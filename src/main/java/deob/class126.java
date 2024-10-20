package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("do")
public class class126 extends class120 {

    @ObfuscatedName("do.b")
    public ByteBuffer field2041;

    @ObfuscatedName("do.r(B)[B")
    public byte[] method2387() {
        byte[] var1 = new byte[this.field2041.capacity()];
        this.field2041.position(0);
        this.field2041.get(var1);
        return var1;
    }

    @ObfuscatedName("do.l([BI)V")
    public void method2386(byte[] arg0) {
        this.field2041 = ByteBuffer.allocateDirect(arg0.length);
        this.field2041.position(0);
        this.field2041.put(arg0);
    }
}
