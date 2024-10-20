package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("db")
public class class125 extends class119 {

    @ObfuscatedName("db.q")
    public ByteBuffer field2045;

    @ObfuscatedName("db.v(I)[B")
    public byte[] method2248() {
        byte[] var1 = new byte[this.field2045.capacity()];
        this.field2045.position(0);
        this.field2045.get(var1);
        return var1;
    }

    @ObfuscatedName("db.g([BB)V")
    public void method2242(byte[] arg0) {
        this.field2045 = ByteBuffer.allocateDirect(arg0.length);
        this.field2045.position(0);
        this.field2045.put(arg0);
    }
}
