package deob;

import java.net.URL;

@ObfuscatedName("de")
public class class110 {

    @ObfuscatedName("de.a")
    public final URL field1400;

    @ObfuscatedName("de.f")
    public volatile boolean field1397;

    @ObfuscatedName("de.c")
    public volatile byte[] field1396;

    public class110(URL arg0) {
        this.field1400 = arg0;
    }

    @ObfuscatedName("de.a(I)Z")
    public boolean method2596() {
        return this.field1397;
    }

    @ObfuscatedName("de.f(I)[B")
    public byte[] method2609() {
        return this.field1396;
    }

    @ObfuscatedName("de.c(I)Ljava/lang/String;")
    public String method2597() {
        return this.field1400.toString();
    }
}
