package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dy")
public class class118 extends class125 {

    @ObfuscatedName("dy.m")
    public ByteBuffer field1953;

    @ObfuscatedName("dy.m(B)[B")
    public byte[] method2356() {
        byte[] var1 = new byte[this.field1953.capacity()];
        this.field1953.position(0);
        this.field1953.get(var1);
        return var1;
    }

    @ObfuscatedName("dy.l([BI)V")
    public void method2357(byte[] arg0) {
        this.field1953 = ByteBuffer.allocateDirect(arg0.length);
        this.field1953.position(0);
        this.field1953.put(arg0);
    }
}
