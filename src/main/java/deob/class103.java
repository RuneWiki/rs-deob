package deob;

import java.net.URL;

@ObfuscatedName("cb")
public class class103 {

    @ObfuscatedName("cb.o")
    public final URL field1367;

    @ObfuscatedName("cb.q")
    public volatile boolean field1368;

    @ObfuscatedName("cb.l")
    public volatile byte[] field1365;

    public class103(URL arg0) {
        this.field1367 = arg0;
    }

    @ObfuscatedName("cb.o(I)Z")
    public boolean method2415() {
        return this.field1368;
    }

    @ObfuscatedName("cb.q(I)[B")
    public byte[] method2414() {
        return this.field1365;
    }

    @ObfuscatedName("cb.l(B)Ljava/lang/String;")
    public String method2417() {
        return this.field1367.toString();
    }
}
