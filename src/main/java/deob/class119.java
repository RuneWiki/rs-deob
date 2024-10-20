package deob;

import java.net.URL;

@ObfuscatedName("ee")
public class class119 {

    @ObfuscatedName("ee.ab")
    public final URL field1474;

    @ObfuscatedName("ee.ay")
    public static int field1472 = -1;

    @ObfuscatedName("ee.an")
    public static int field1473 = -2;

    @ObfuscatedName("ee.au")
    public volatile int field1471 = field1472;

    @ObfuscatedName("ee.ax")
    public volatile byte[] field1477;

    public class119(URL arg0) {
        this.field1474 = arg0;
    }

    @ObfuscatedName("ee.ab(I)Z")
    public boolean method2885() {
        return field1472 != this.field1471;
    }

    @ObfuscatedName("ee.ay(B)[B")
    public byte[] method2886() {
        return this.field1477;
    }

    @ObfuscatedName("ee.an(I)Ljava/lang/String;")
    public String method2887() {
        return this.field1474.toString();
    }
}
