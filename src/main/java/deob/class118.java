package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ds")
public class class118 extends class125 {

    @ObfuscatedName("ds.f")
    public ByteBuffer field1992;

    @ObfuscatedName("ds.f(B)[B")
    public byte[] method2339() {
        byte[] var1 = new byte[this.field1992.capacity()];
        this.field1992.position(0);
        this.field1992.get(var1);
        return var1;
    }

    @ObfuscatedName("ds.s([BI)V")
    public void method2341(byte[] arg0) {
        this.field1992 = ByteBuffer.allocateDirect(arg0.length);
        this.field1992.position(0);
        this.field1992.put(arg0);
    }
}
