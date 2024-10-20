package com.jagex.oldscape.pub;

public interface OAuthApi {

    void setOtlTokenRequester(OtlTokenRequester arg0);

    void setRefreshTokenRequester(RefreshAccessTokenRequester arg0);

    long getAccountHash();

    boolean isOnLoginScreen();
}
