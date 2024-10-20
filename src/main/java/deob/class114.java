package deob;

import java.net.URL;

@ObfuscatedName("et")
public class class114 {

    @ObfuscatedName("et.at")
    public final URL field1408;

    @ObfuscatedName("et.an")
    public static int field1405 = -1;

    @ObfuscatedName("et.av")
    public static int field1406 = -2;

    @ObfuscatedName("et.as")
    public volatile int field1404 = field1405;

    @ObfuscatedName("et.ax")
    public volatile byte[] field1409;

    public class114(URL arg0) {
        this.field1408 = arg0;
    }

    @ObfuscatedName("et.at(B)Z")
    public boolean method2687() {
        return field1405 != this.field1404;
    }

    @ObfuscatedName("et.an(B)[B")
    public byte[] method2688() {
        return this.field1409;
    }

    @ObfuscatedName("et.av(I)Ljava/lang/String;")
    public String method2689() {
        return this.field1408.toString();
    }
}
