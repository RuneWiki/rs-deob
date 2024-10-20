package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dp")
public class class110 extends class117 {

    @ObfuscatedName("dp.p")
    public ByteBuffer field1883;

    @ObfuscatedName("dp.p(I)[B")
    public byte[] method2158() {
        byte[] var1 = new byte[this.field1883.capacity()];
        this.field1883.position(0);
        this.field1883.get(var1);
        return var1;
    }

    @ObfuscatedName("dp.k([BI)V")
    public void method2154(byte[] arg0) {
        this.field1883 = ByteBuffer.allocateDirect(arg0.length);
        this.field1883.position(0);
        this.field1883.put(arg0);
    }
}
