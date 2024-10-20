package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dq")
public class class124 extends class118 {

    @ObfuscatedName("dq.j")
    public ByteBuffer field2037;

    @ObfuscatedName("dq.w(B)[B")
    public byte[] method2293() {
        byte[] var1 = new byte[this.field2037.capacity()];
        this.field2037.position(0);
        this.field2037.get(var1);
        return var1;
    }

    @ObfuscatedName("dq.h([BI)V")
    public void method2291(byte[] arg0) {
        this.field2037 = ByteBuffer.allocateDirect(arg0.length);
        this.field2037.position(0);
        this.field2037.put(arg0);
    }
}
