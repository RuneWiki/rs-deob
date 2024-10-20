package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dp")
public class class118 extends class125 {

    @ObfuscatedName("dp.l")
    public ByteBuffer field1985;

    @ObfuscatedName("dp.l(I)[B")
    public byte[] method2365() {
        byte[] var1 = new byte[this.field1985.capacity()];
        this.field1985.position(0);
        this.field1985.get(var1);
        return var1;
    }

    @ObfuscatedName("dp.e([BI)V")
    public void method2366(byte[] arg0) {
        this.field1985 = ByteBuffer.allocateDirect(arg0.length);
        this.field1985.position(0);
        this.field1985.put(arg0);
    }
}
