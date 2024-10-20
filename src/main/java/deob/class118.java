package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dy")
public class class118 extends class125 {

    @ObfuscatedName("dy.i")
    public ByteBuffer field1978;

    @ObfuscatedName("dy.i(B)[B")
    public byte[] method2322() {
        byte[] var1 = new byte[this.field1978.capacity()];
        this.field1978.position(0);
        this.field1978.get(var1);
        return var1;
    }

    @ObfuscatedName("dy.v([BI)V")
    public void method2326(byte[] arg0) {
        this.field1978 = ByteBuffer.allocateDirect(arg0.length);
        this.field1978.position(0);
        this.field1978.put(arg0);
    }
}
