package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("df")
public class class118 extends class125 {

    @ObfuscatedName("df.i")
    public ByteBuffer field1982;

    @ObfuscatedName("df.i(B)[B")
    public byte[] method2287() {
        byte[] var1 = new byte[this.field1982.capacity()];
        this.field1982.position(0);
        this.field1982.get(var1);
        return var1;
    }

    @ObfuscatedName("df.v([BI)V")
    public void method2288(byte[] arg0) {
        this.field1982 = ByteBuffer.allocateDirect(arg0.length);
        this.field1982.position(0);
        this.field1982.put(arg0);
    }
}
