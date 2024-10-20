package com.jagex.oldscape.pub;

public interface OAuthApi {

    long getAccountHash();

    boolean isOnLoginScreen();

    void setRefreshTokenRequester(RefreshAccessTokenRequester arg0);

    void setOtlTokenRequester(OtlTokenRequester arg0);
}
