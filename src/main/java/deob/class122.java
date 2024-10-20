package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dc")
public class class122 extends class129 {

    @ObfuscatedName("dc.k")
    public ByteBuffer field2051;

    @ObfuscatedName("dc.k(I)[B")
    public byte[] method2404() {
        byte[] var1 = new byte[this.field2051.capacity()];
        this.field2051.position(0);
        this.field2051.get(var1);
        return var1;
    }

    @ObfuscatedName("dc.q([BB)V")
    public void method2407(byte[] arg0) {
        this.field2051 = ByteBuffer.allocateDirect(arg0.length);
        this.field2051.position(0);
        this.field2051.put(arg0);
    }
}
