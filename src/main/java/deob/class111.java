package deob;

import java.net.URL;

@ObfuscatedName("dm")
public class class111 {

    @ObfuscatedName("dm.h")
    public final URL field1454;

    @ObfuscatedName("dm.e")
    public volatile boolean field1455;

    @ObfuscatedName("dm.v")
    public volatile byte[] field1451;

    public class111(URL arg0) {
        this.field1454 = arg0;
    }

    @ObfuscatedName("dm.h(I)Z")
    public boolean method2647() {
        return this.field1455;
    }

    @ObfuscatedName("dm.e(I)[B")
    public byte[] method2644() {
        return this.field1451;
    }

    @ObfuscatedName("dm.v(I)Ljava/lang/String;")
    public String method2645() {
        return this.field1454.toString();
    }
}
