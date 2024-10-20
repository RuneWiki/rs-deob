package deob;

import java.net.URL;

@ObfuscatedName("cm")
public class class104 {

    @ObfuscatedName("cm.c")
    public final URL field1367;

    @ObfuscatedName("cm.p")
    public volatile boolean field1362;

    @ObfuscatedName("cm.f")
    public volatile byte[] field1368;

    public class104(URL arg0) {
        this.field1367 = arg0;
    }

    @ObfuscatedName("cm.c(I)Z")
    public boolean method2596() {
        return this.field1362;
    }

    @ObfuscatedName("cm.p(I)[B")
    public byte[] method2589() {
        return this.field1368;
    }

    @ObfuscatedName("cm.f(B)Ljava/lang/String;")
    public String method2590() {
        return this.field1367.toString();
    }
}
