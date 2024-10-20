package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dm")
public class class118 extends class125 {

    @ObfuscatedName("dm.c")
    public ByteBuffer field1953;

    @ObfuscatedName("dm.c(B)[B")
    public byte[] method2271() {
        byte[] var1 = new byte[this.field1953.capacity()];
        this.field1953.position(0);
        this.field1953.get(var1);
        return var1;
    }

    @ObfuscatedName("dm.h([BI)V")
    public void method2270(byte[] arg0) {
        this.field1953 = ByteBuffer.allocateDirect(arg0.length);
        this.field1953.position(0);
        this.field1953.put(arg0);
    }
}
