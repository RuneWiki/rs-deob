package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dh")
public class class125 extends class119 {

    @ObfuscatedName("dh.f")
    public ByteBuffer field2031;

    @ObfuscatedName("dh.o(I)[B")
    public byte[] method2378() {
        byte[] var1 = new byte[this.field2031.capacity()];
        this.field2031.position(0);
        this.field2031.get(var1);
        return var1;
    }

    @ObfuscatedName("dh.h([BI)V")
    public void method2374(byte[] arg0) {
        this.field2031 = ByteBuffer.allocateDirect(arg0.length);
        this.field2031.position(0);
        this.field2031.put(arg0);
    }
}
