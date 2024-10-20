package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("df")
public class class106 extends class112 {

    @ObfuscatedName("df.e")
    public ByteBuffer field1839;

    @ObfuscatedName("df.e(B)[B")
    public byte[] method2046() {
        byte[] var1 = new byte[this.field1839.capacity()];
        this.field1839.position(0);
        this.field1839.get(var1);
        return var1;
    }

    @ObfuscatedName("df.o([BI)V")
    public void method2047(byte[] arg0) {
        this.field1839 = ByteBuffer.allocateDirect(arg0.length);
        this.field1839.position(0);
        this.field1839.put(arg0);
    }
}
