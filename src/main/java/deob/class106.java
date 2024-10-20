package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("df")
public class class106 extends class112 {

    @ObfuscatedName("df.k")
    public ByteBuffer field1861;

    @ObfuscatedName("df.k(B)[B")
    public byte[] method2088() {
        byte[] var1 = new byte[this.field1861.capacity()];
        this.field1861.position(0);
        this.field1861.get(var1);
        return var1;
    }

    @ObfuscatedName("df.r([BI)V")
    public void method2089(byte[] arg0) {
        this.field1861 = ByteBuffer.allocateDirect(arg0.length);
        this.field1861.position(0);
        this.field1861.put(arg0);
    }
}
