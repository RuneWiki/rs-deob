package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dr")
public class class118 extends class125 {

    @ObfuscatedName("dr.o")
    public ByteBuffer field1978;

    @ObfuscatedName("dr.o(I)[B")
    public byte[] method2271() {
        byte[] var1 = new byte[this.field1978.capacity()];
        this.field1978.position(0);
        this.field1978.get(var1);
        return var1;
    }

    @ObfuscatedName("dr.f([BI)V")
    public void method2268(byte[] arg0) {
        this.field1978 = ByteBuffer.allocateDirect(arg0.length);
        this.field1978.position(0);
        this.field1978.put(arg0);
    }
}
