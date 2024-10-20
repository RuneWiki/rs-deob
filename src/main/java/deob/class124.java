package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dv")
public class class124 extends class118 {

    @ObfuscatedName("dv.e")
    public ByteBuffer field2007;

    @ObfuscatedName("dv.j(B)[B")
    public byte[] method2398() {
        byte[] var1 = new byte[this.field2007.capacity()];
        this.field2007.position(0);
        this.field2007.get(var1);
        return var1;
    }

    @ObfuscatedName("dv.i([BI)V")
    public void method2400(byte[] arg0) {
        this.field2007 = ByteBuffer.allocateDirect(arg0.length);
        this.field2007.position(0);
        this.field2007.put(arg0);
    }
}
