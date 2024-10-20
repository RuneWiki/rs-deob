package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dj")
public class class118 extends class125 {

    @ObfuscatedName("dj.o")
    public ByteBuffer field1971;

    @ObfuscatedName("dj.o(I)[B")
    public byte[] method2316() {
        byte[] var1 = new byte[this.field1971.capacity()];
        this.field1971.position(0);
        this.field1971.get(var1);
        return var1;
    }

    @ObfuscatedName("dj.e([BS)V")
    public void method2317(byte[] arg0) {
        this.field1971 = ByteBuffer.allocateDirect(arg0.length);
        this.field1971.position(0);
        this.field1971.put(arg0);
    }
}
