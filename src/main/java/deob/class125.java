package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dt")
public class class125 extends class119 {

    @ObfuscatedName("dt.c")
    public ByteBuffer field2033;

    @ObfuscatedName("dt.z(I)[B")
    public byte[] method2329() {
        byte[] var1 = new byte[this.field2033.capacity()];
        this.field2033.position(0);
        this.field2033.get(var1);
        return var1;
    }

    @ObfuscatedName("dt.m([BI)V")
    public void method2331(byte[] arg0) {
        this.field2033 = ByteBuffer.allocateDirect(arg0.length);
        this.field2033.position(0);
        this.field2033.put(arg0);
    }
}
