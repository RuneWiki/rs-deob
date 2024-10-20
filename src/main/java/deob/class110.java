package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dz")
public class class110 extends class117 {

    @ObfuscatedName("dz.b")
    public ByteBuffer field1888;

    @ObfuscatedName("dz.b(S)[B")
    public byte[] method2104() {
        byte[] var1 = new byte[this.field1888.capacity()];
        this.field1888.position(0);
        this.field1888.get(var1);
        return var1;
    }

    @ObfuscatedName("dz.e([BB)V")
    public void method2102(byte[] arg0) {
        this.field1888 = ByteBuffer.allocateDirect(arg0.length);
        this.field1888.position(0);
        this.field1888.put(arg0);
    }
}
