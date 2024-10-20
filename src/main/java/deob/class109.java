package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dj")
public class class109 extends class116 {

    @ObfuscatedName("dj.a")
    public ByteBuffer field1855;

    @ObfuscatedName("dj.a(B)[B")
    public byte[] method2108() {
        byte[] var1 = new byte[this.field1855.capacity()];
        this.field1855.position(0);
        this.field1855.get(var1);
        return var1;
    }

    @ObfuscatedName("dj.v([BB)V")
    public void method2109(byte[] arg0) {
        this.field1855 = ByteBuffer.allocateDirect(arg0.length);
        this.field1855.position(0);
        this.field1855.put(arg0);
    }
}
