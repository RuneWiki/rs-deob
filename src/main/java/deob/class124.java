package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dv")
public class class124 extends class118 {

    @ObfuscatedName("dv.h")
    public ByteBuffer field1998;

    @ObfuscatedName("dv.c(I)[B")
    public byte[] method2346() {
        byte[] var1 = new byte[this.field1998.capacity()];
        this.field1998.position(0);
        this.field1998.get(var1);
        return var1;
    }

    @ObfuscatedName("dv.p([BI)V")
    public void method2348(byte[] arg0) {
        this.field1998 = ByteBuffer.allocateDirect(arg0.length);
        this.field1998.position(0);
        this.field1998.put(arg0);
    }
}
