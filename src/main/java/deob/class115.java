package deob;

import java.net.URL;

@ObfuscatedName("ei")
public class class115 {

    @ObfuscatedName("ei.aw")
    public final URL field1437;

    @ObfuscatedName("ei.ay")
    public static int field1436 = -1;

    @ObfuscatedName("ei.ar")
    public static int field1442 = -2;

    @ObfuscatedName("ei.am")
    public volatile int field1438 = field1436;

    @ObfuscatedName("ei.as")
    public volatile byte[] field1439;

    public class115(URL arg0) {
        this.field1437 = arg0;
    }

    @ObfuscatedName("ei.aw(I)Z")
    public boolean method2711() {
        return field1436 != this.field1438;
    }

    @ObfuscatedName("ei.ay(I)[B")
    public byte[] method2710() {
        return this.field1439;
    }

    @ObfuscatedName("ei.ar(I)Ljava/lang/String;")
    public String method2709() {
        return this.field1437.toString();
    }
}
