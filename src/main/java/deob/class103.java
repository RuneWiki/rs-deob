package deob;

import java.net.URL;

@ObfuscatedName("cw")
public class class103 {

    @ObfuscatedName("cw.v")
    public final URL field1340;

    @ObfuscatedName("cw.c")
    public volatile boolean field1341;

    @ObfuscatedName("cw.i")
    public volatile byte[] field1339;

    public class103(URL arg0) {
        this.field1340 = arg0;
    }

    @ObfuscatedName("cw.v(B)Z")
    public boolean method2444() {
        return this.field1341;
    }

    @ObfuscatedName("cw.c(I)[B")
    public byte[] method2431() {
        return this.field1339;
    }

    @ObfuscatedName("cw.i(B)Ljava/lang/String;")
    public String method2432() {
        return this.field1340.toString();
    }
}
