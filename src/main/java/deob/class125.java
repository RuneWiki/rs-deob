package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dz")
public class class125 extends class119 {

    @ObfuscatedName("dz.g")
    public ByteBuffer field2029;

    @ObfuscatedName("dz.a(B)[B")
    public byte[] method2312() {
        byte[] var1 = new byte[this.field2029.capacity()];
        this.field2029.position(0);
        this.field2029.get(var1);
        return var1;
    }

    @ObfuscatedName("dz.t([BI)V")
    public void method2304(byte[] arg0) {
        this.field2029 = ByteBuffer.allocateDirect(arg0.length);
        this.field2029.position(0);
        this.field2029.put(arg0);
    }
}
