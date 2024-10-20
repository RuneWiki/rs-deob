package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dk")
public class class118 extends class125 {

    @ObfuscatedName("dk.a")
    public ByteBuffer field1979;

    @ObfuscatedName("dk.a(I)[B")
    public byte[] method2322() {
        byte[] var1 = new byte[this.field1979.capacity()];
        this.field1979.position(0);
        this.field1979.get(var1);
        return var1;
    }

    @ObfuscatedName("dk.r([BB)V")
    public void method2323(byte[] arg0) {
        this.field1979 = ByteBuffer.allocateDirect(arg0.length);
        this.field1979.position(0);
        this.field1979.put(arg0);
    }
}
