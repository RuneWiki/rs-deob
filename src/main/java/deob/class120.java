package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("de")
public class class120 extends class62 {

    @ObfuscatedName("de.l")
    public ByteBuffer field1576;

    @ObfuscatedName("de.o(I)[B")
    public byte[] method776() {
        byte[] var1 = new byte[this.field1576.capacity()];
        this.field1576.position(0);
        this.field1576.get(var1);
        return var1;
    }

    @ObfuscatedName("de.c([BB)V")
    public void method772(byte[] arg0) {
        this.field1576 = ByteBuffer.allocateDirect(arg0.length);
        this.field1576.position(0);
        this.field1576.put(arg0);
    }
}
