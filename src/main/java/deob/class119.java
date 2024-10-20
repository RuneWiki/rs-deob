package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("du")
public class class119 extends class126 {

    @ObfuscatedName("du.w")
    public ByteBuffer field2005;

    @ObfuscatedName("du.w(I)[B")
    public byte[] method2343() {
        byte[] var1 = new byte[this.field2005.capacity()];
        this.field2005.position(0);
        this.field2005.get(var1);
        return var1;
    }

    @ObfuscatedName("du.x([BI)V")
    public void method2342(byte[] arg0) {
        this.field2005 = ByteBuffer.allocateDirect(arg0.length);
        this.field2005.position(0);
        this.field2005.put(arg0);
    }
}
