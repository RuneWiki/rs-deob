package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dc")
public class class125 extends class119 {

    @ObfuscatedName("dc.i")
    public ByteBuffer field2034;

    @ObfuscatedName("dc.o(I)[B")
    public byte[] method2406() {
        byte[] var1 = new byte[this.field2034.capacity()];
        this.field2034.position(0);
        this.field2034.get(var1);
        return var1;
    }

    @ObfuscatedName("dc.n([BI)V")
    public void method2398(byte[] arg0) {
        this.field2034 = ByteBuffer.allocateDirect(arg0.length);
        this.field2034.position(0);
        this.field2034.put(arg0);
    }
}
