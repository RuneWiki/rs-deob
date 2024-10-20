package deob;

import java.net.URL;

@ObfuscatedName("dg")
public class class110 {

    @ObfuscatedName("dg.f")
    public final URL field1420;

    @ObfuscatedName("dg.w")
    public volatile boolean field1419;

    @ObfuscatedName("dg.v")
    public volatile byte[] field1424;

    public class110(URL arg0) {
        this.field1420 = arg0;
    }

    @ObfuscatedName("dg.f(I)Z")
    public boolean method2747() {
        return this.field1419;
    }

    @ObfuscatedName("dg.w(B)[B")
    public byte[] method2758() {
        return this.field1424;
    }

    @ObfuscatedName("dg.v(I)Ljava/lang/String;")
    public String method2749() {
        return this.field1420.toString();
    }
}
