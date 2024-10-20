package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dj")
public class class122 extends class129 {

    @ObfuscatedName("dj.f")
    public ByteBuffer field2051;

    @ObfuscatedName("dj.f(B)[B")
    public byte[] method2379() {
        byte[] var1 = new byte[this.field2051.capacity()];
        this.field2051.position(0);
        this.field2051.get(var1);
        return var1;
    }

    @ObfuscatedName("dj.e([BB)V")
    public void method2377(byte[] arg0) {
        this.field2051 = ByteBuffer.allocateDirect(arg0.length);
        this.field2051.position(0);
        this.field2051.put(arg0);
    }
}
