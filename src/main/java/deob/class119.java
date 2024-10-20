package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dd")
public class class119 extends class126 {

    @ObfuscatedName("dd.t")
    public ByteBuffer field1999;

    @ObfuscatedName("dd.t(B)[B")
    public byte[] method2286() {
        byte[] var1 = new byte[this.field1999.capacity()];
        this.field1999.position(0);
        this.field1999.get(var1);
        return var1;
    }

    @ObfuscatedName("dd.i([BI)V")
    public void method2285(byte[] arg0) {
        this.field1999 = ByteBuffer.allocateDirect(arg0.length);
        this.field1999.position(0);
        this.field1999.put(arg0);
    }
}
