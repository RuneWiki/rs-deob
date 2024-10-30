package com.jagex.core.constants;

import deob.ObfuscatedName;
import java.math.BigInteger;

@ObfuscatedName("ae")
public class PublicKeys {

    @ObfuscatedName("ae.e")
    public static final BigInteger LOGIN_RSAE = new BigInteger("10001", 16);

    @ObfuscatedName("ae.n")
    public static final BigInteger LOGIN_RSAN = new BigInteger("89a1a51902ff0cb294dcafe10f6dc680d56a5ca37d0923826bbf7212e09a3f2fdfb616db51473dd3c38339ad1f859519befafce85f7f5498a1c6e7829707fa053a0bdcab63b7c45cca0b8a66d2800efd43bb27f794360b722c429e36ddc61ec15cd428f7b64e1ecf8648f6ff6d191eaed8e89fc576721e7d668e5455e34ef5a3", 16);

    @ObfuscatedName("ae.m")
    public static final BigInteger JS5_RSAE = new BigInteger("10001", 16);

    @ObfuscatedName("ae.k")
    public static final BigInteger JS5_RSAN = new BigInteger("9b62983a828fa2e4572cec5f2448c4b98562bc14217c3def4b2c02a3006a4ecce6084751ce20f60f66669635d3e5cc6fba23adc0a9adedf9e8d4200e8cd7b0ea06a517574b2d1969a5945ed09bc789900528874777d7c68300951bfcb8ff3d0df0e656b9f4d339cc2bfca3be083cc6b378225686af226cd03f489096993a3c5a37f12ce5e7318725290391d2edf2930d477019103cb4cc83c7eae620462a5baf8a27fdf2b9eb18ab06fd1e60e46167a5eb02c7d73c0d10ea54176b408bdcbda571c8c5d918d1151285865aac1b208e9e9ff5aa232bdf24b9524fae2d3627f8626dbd6061865417960b39ff2b692158e3d428824c577916209d21ce9f95c797580c8e14a6209218ae5b64fef72d23d0897ea473e3fad24ca41978d7d4dea855430fe03cd333adddf4b2f41631535baad313b4c0afd1878e668419e8e82d500b95446b8dece2d68af9c973f24360364a3ce0d5be9af1724197eb7978aed192671c675a98a1b4bec8388098f3a5cf45db3b9b21e34be4ea0acfb6972efe4c378b6108e21ffaa1c29b5d7c254e8d4711faae6e86daaf4d816d3eae56f21425db849ce2845b0dc334765a3d943d2b7ef7423857301ae9212ef8eaf76ea784b42e6d711183f96ad0e31f6ff389a3b9da4f5cff159d81736b08af9e0f377e2057e52892f26e08347ca012359b7f2cbfe2efda69e5b3d6295dffb2f62e156685f89c92a5", 16);

    static {
        new BigInteger("10001", 16);
        new BigInteger("d09a9575024fa1cd1357b43840ad0090a4fd8dcd2d5f7dc03eae42886072413c9b51b8c49d770bef272515a1d352bb28eb9433f7f1eb11c6e97de1901a25ebd1", 16);
    }

    public PublicKeys() throws Throwable {
        throw new Error();
    }
}
