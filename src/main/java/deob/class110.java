package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dt")
public class class110 extends class117 {

    @ObfuscatedName("dt.n")
    public ByteBuffer field1883;

    @ObfuscatedName("dt.n(I)[B")
    public byte[] method2135() {
        byte[] var1 = new byte[this.field1883.capacity()];
        this.field1883.position(0);
        this.field1883.get(var1);
        return var1;
    }

    @ObfuscatedName("dt.w([BB)V")
    public void method2134(byte[] arg0) {
        this.field1883 = ByteBuffer.allocateDirect(arg0.length);
        this.field1883.position(0);
        this.field1883.put(arg0);
    }
}
