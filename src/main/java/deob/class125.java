package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dt")
public class class125 extends class119 {

    @ObfuscatedName("dt.r")
    public ByteBuffer field2014;

    @ObfuscatedName("dt.u(I)[B")
    public byte[] method2300() {
        byte[] var1 = new byte[this.field2014.capacity()];
        this.field2014.position(0);
        this.field2014.get(var1);
        return var1;
    }

    @ObfuscatedName("dt.t([BI)V")
    public void method2301(byte[] arg0) {
        this.field2014 = ByteBuffer.allocateDirect(arg0.length);
        this.field2014.position(0);
        this.field2014.put(arg0);
    }
}
