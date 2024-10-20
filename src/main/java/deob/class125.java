package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ds")
public class class125 extends class119 {

    @ObfuscatedName("ds.r")
    public ByteBuffer field2015;

    @ObfuscatedName("ds.v(B)[B")
    public byte[] method2354() {
        byte[] var1 = new byte[this.field2015.capacity()];
        this.field2015.position(0);
        this.field2015.get(var1);
        return var1;
    }

    @ObfuscatedName("ds.p([BS)V")
    public void method2355(byte[] arg0) {
        this.field2015 = ByteBuffer.allocateDirect(arg0.length);
        this.field2015.position(0);
        this.field2015.put(arg0);
    }
}
