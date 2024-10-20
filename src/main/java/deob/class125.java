package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("de")
public class class125 extends class119 {

    @ObfuscatedName("de.m")
    public ByteBuffer field2030;

    @ObfuscatedName("de.d(B)[B")
    public byte[] method2374() {
        byte[] var1 = new byte[this.field2030.capacity()];
        this.field2030.position(0);
        this.field2030.get(var1);
        return var1;
    }

    @ObfuscatedName("de.k([BB)V")
    public void method2386(byte[] arg0) {
        this.field2030 = ByteBuffer.allocateDirect(arg0.length);
        this.field2030.position(0);
        this.field2030.put(arg0);
    }
}
