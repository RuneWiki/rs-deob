package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dr")
public class class110 extends class117 {

    @ObfuscatedName("dr.q")
    public ByteBuffer field1850;

    @ObfuscatedName("dr.q(I)[B")
    public byte[] method2127() {
        byte[] var1 = new byte[this.field1850.capacity()];
        this.field1850.position(0);
        this.field1850.get(var1);
        return var1;
    }

    @ObfuscatedName("dr.s([BB)V")
    public void method2128(byte[] arg0) {
        this.field1850 = ByteBuffer.allocateDirect(arg0.length);
        this.field1850.position(0);
        this.field1850.put(arg0);
    }
}
