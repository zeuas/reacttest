package com.reacttest;

import android.app.Application;
import android.util.Log;

import com.facebook.react.ReactApplication;
import com.microsoft.codepush.react.CodePush;
import com.rnfs.RNFSPackage;
import com.keyee.pdfview.PDFView;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.reactnativefingerprint.FingerprintPackage;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {

    @Override
    protected String getJSBundleFile() {
      return CodePush.getJSBundleFile();
    }

    @Override
    protected boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new CodePush("6CksU9WR8oeou3OBBzKyUyEH3g0y4ksvOXqog", getApplicationContext(), BuildConfig.DEBUG,"http://codepush.ganyin.win"),
            new RNFSPackage(),
            new PDFView(),
            new FingerprintPackage()
      );
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
