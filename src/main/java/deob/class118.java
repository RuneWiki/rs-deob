package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dz")
public class class118 extends class125 {

    @ObfuscatedName("dz.k")
    public ByteBuffer field1947;

    @ObfuscatedName("dz.k(I)[B")
    public byte[] method2304() {
        byte[] var1 = new byte[this.field1947.capacity()];
        this.field1947.position(0);
        this.field1947.get(var1);
        return var1;
    }

    @ObfuscatedName("dz.h([BI)V")
    public void method2308(byte[] arg0) {
        this.field1947 = ByteBuffer.allocateDirect(arg0.length);
        this.field1947.position(0);
        this.field1947.put(arg0);
    }
}
