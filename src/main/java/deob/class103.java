package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("cu")
public class class103 extends class109 {

    @ObfuscatedName("cu.m")
    public ByteBuffer field1804;

    @ObfuscatedName("cu.m(B)[B")
    public byte[] method2111() {
        byte[] var1 = new byte[this.field1804.capacity()];
        this.field1804.position(0);
        this.field1804.get(var1);
        return var1;
    }

    @ObfuscatedName("cu.k([BI)V")
    public void method2109(byte[] arg0) {
        this.field1804 = ByteBuffer.allocateDirect(arg0.length);
        this.field1804.position(0);
        this.field1804.put(arg0);
    }
}
