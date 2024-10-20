package deob;

import java.net.URL;

@ObfuscatedName("cv")
public class class103 {

    @ObfuscatedName("cv.s")
    public final URL field1354;

    @ObfuscatedName("cv.h")
    public volatile boolean field1357;

    @ObfuscatedName("cv.w")
    public volatile byte[] field1355;

    public class103(URL arg0) {
        this.field1354 = arg0;
    }

    @ObfuscatedName("cv.s(B)Z")
    public boolean method2384() {
        return this.field1357;
    }

    @ObfuscatedName("cv.h(B)[B")
    public byte[] method2394() {
        return this.field1355;
    }

    @ObfuscatedName("cv.w(B)Ljava/lang/String;")
    public String method2393() {
        return this.field1354.toString();
    }
}
