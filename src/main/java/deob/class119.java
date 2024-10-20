package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dg")
public class class119 extends class61 {

    @ObfuscatedName("dg.n")
    public ByteBuffer field1562;

    @ObfuscatedName("dg.q(B)[B")
    public byte[] method767() {
        byte[] var1 = new byte[this.field1562.capacity()];
        this.field1562.position(0);
        this.field1562.get(var1);
        return var1;
    }

    @ObfuscatedName("dg.h([BI)V")
    public void method765(byte[] arg0) {
        this.field1562 = ByteBuffer.allocateDirect(arg0.length);
        this.field1562.position(0);
        this.field1562.put(arg0);
    }
}
