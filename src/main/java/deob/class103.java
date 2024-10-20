package deob;

import java.net.URL;

@ObfuscatedName("ct")
public class class103 {

    @ObfuscatedName("ct.c")
    public final URL field1372;

    @ObfuscatedName("ct.v")
    public volatile boolean field1369;

    @ObfuscatedName("ct.q")
    public volatile byte[] field1371;

    public class103(URL arg0) {
        this.field1372 = arg0;
    }

    @ObfuscatedName("ct.c(B)Z")
    public boolean method2426() {
        return this.field1369;
    }

    @ObfuscatedName("ct.v(I)[B")
    public byte[] method2429() {
        return this.field1371;
    }

    @ObfuscatedName("ct.q(I)Ljava/lang/String;")
    public String method2428() {
        return this.field1372.toString();
    }
}
