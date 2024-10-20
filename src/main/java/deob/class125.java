package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("da")
public class class125 extends class119 {

    @ObfuscatedName("da.e")
    public ByteBuffer field2027;

    @ObfuscatedName("da.h(I)[B")
    public byte[] method2389() {
        byte[] var1 = new byte[this.field2027.capacity()];
        this.field2027.position(0);
        this.field2027.get(var1);
        return var1;
    }

    @ObfuscatedName("da.y([BI)V")
    public void method2400(byte[] arg0) {
        this.field2027 = ByteBuffer.allocateDirect(arg0.length);
        this.field2027.position(0);
        this.field2027.put(arg0);
    }
}
