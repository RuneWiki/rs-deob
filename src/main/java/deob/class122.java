package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dz")
public class class122 extends class129 {

    @ObfuscatedName("dz.e")
    public ByteBuffer field2053;

    @ObfuscatedName("dz.e(I)[B")
    public byte[] method2447() {
        byte[] var1 = new byte[this.field2053.capacity()];
        this.field2053.position(0);
        this.field2053.get(var1);
        return var1;
    }

    @ObfuscatedName("dz.l([BI)V")
    public void method2443(byte[] arg0) {
        this.field2053 = ByteBuffer.allocateDirect(arg0.length);
        this.field2053.position(0);
        this.field2053.put(arg0);
    }
}
