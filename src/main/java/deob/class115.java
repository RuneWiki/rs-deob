package deob;

import java.net.URL;

@ObfuscatedName("ee")
public class class115 {

    @ObfuscatedName("ee.am")
    public final URL field1441;

    @ObfuscatedName("ee.ap")
    public static int field1435 = -1;

    @ObfuscatedName("ee.af")
    public static int field1436 = -2;

    @ObfuscatedName("ee.aj")
    public volatile int field1437 = field1435;

    @ObfuscatedName("ee.aq")
    public volatile byte[] field1438;

    public class115(URL arg0) {
        this.field1441 = arg0;
    }

    @ObfuscatedName("ee.am(B)Z")
    public boolean method2797() {
        return field1435 != this.field1437;
    }

    @ObfuscatedName("ee.ap(I)[B")
    public byte[] method2798() {
        return this.field1438;
    }

    @ObfuscatedName("ee.af(B)Ljava/lang/String;")
    public String method2799() {
        return this.field1441.toString();
    }
}
