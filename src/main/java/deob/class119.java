package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dp")
public class class119 extends class126 {

    @ObfuscatedName("dp.s")
    public ByteBuffer field2005;

    @ObfuscatedName("dp.s(I)[B")
    public byte[] method2318() {
        byte[] var1 = new byte[this.field2005.capacity()];
        this.field2005.position(0);
        this.field2005.get(var1);
        return var1;
    }

    @ObfuscatedName("dp.j([BI)V")
    public void method2319(byte[] arg0) {
        this.field2005 = ByteBuffer.allocateDirect(arg0.length);
        this.field2005.position(0);
        this.field2005.put(arg0);
    }
}
