package deob;

import java.net.URL;

@ObfuscatedName("eo")
public class class112 {

    @ObfuscatedName("eo.aj")
    public final URL field1406;

    @ObfuscatedName("eo.al")
    public static int field1404 = -1;

    @ObfuscatedName("eo.ac")
    public static int field1405 = -2;

    @ObfuscatedName("eo.ab")
    public volatile int field1403 = field1404;

    @ObfuscatedName("eo.an")
    public volatile byte[] field1407;

    public class112(URL arg0) {
        this.field1406 = arg0;
    }

    @ObfuscatedName("eo.aj(I)Z")
    public boolean method2693() {
        return field1404 != this.field1403;
    }

    @ObfuscatedName("eo.al(I)[B")
    public byte[] method2689() {
        return this.field1407;
    }

    @ObfuscatedName("eo.ac(S)Ljava/lang/String;")
    public String method2694() {
        return this.field1406.toString();
    }
}
