package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dz")
public class class118 extends class125 {

    @ObfuscatedName("dz.h")
    public ByteBuffer field1986;

    @ObfuscatedName("dz.h(B)[B")
    public byte[] method2302() {
        byte[] var1 = new byte[this.field1986.capacity()];
        this.field1986.position(0);
        this.field1986.get(var1);
        return var1;
    }

    @ObfuscatedName("dz.m([BS)V")
    public void method2295(byte[] arg0) {
        this.field1986 = ByteBuffer.allocateDirect(arg0.length);
        this.field1986.position(0);
        this.field1986.put(arg0);
    }
}
