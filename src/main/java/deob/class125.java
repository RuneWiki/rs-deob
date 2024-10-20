package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("du")
public class class125 extends class119 {

    @ObfuscatedName("du.v")
    public ByteBuffer field2035;

    @ObfuscatedName("du.m(B)[B")
    public byte[] method2399() {
        byte[] var1 = new byte[this.field2035.capacity()];
        this.field2035.position(0);
        this.field2035.get(var1);
        return var1;
    }

    @ObfuscatedName("du.j([BI)V")
    public void method2400(byte[] arg0) {
        this.field2035 = ByteBuffer.allocateDirect(arg0.length);
        this.field2035.position(0);
        this.field2035.put(arg0);
    }
}
