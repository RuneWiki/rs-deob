package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("de")
public class class122 extends class129 {

    @ObfuscatedName("de.x")
    public ByteBuffer field2050;

    @ObfuscatedName("de.x(I)[B")
    public byte[] method2386() {
        byte[] var1 = new byte[this.field2050.capacity()];
        this.field2050.position(0);
        this.field2050.get(var1);
        return var1;
    }

    @ObfuscatedName("de.r([BI)V")
    public void method2385(byte[] arg0) {
        this.field2050 = ByteBuffer.allocateDirect(arg0.length);
        this.field2050.position(0);
        this.field2050.put(arg0);
    }
}
