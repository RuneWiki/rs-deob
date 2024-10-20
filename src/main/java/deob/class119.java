package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dh")
public class class119 extends class126 {

    @ObfuscatedName("dh.e")
    public ByteBuffer field1975;

    @ObfuscatedName("dh.e(I)[B")
    public byte[] method2337() {
        byte[] var1 = new byte[this.field1975.capacity()];
        this.field1975.position(0);
        this.field1975.get(var1);
        return var1;
    }

    @ObfuscatedName("dh.w([BI)V")
    public void method2335(byte[] arg0) {
        this.field1975 = ByteBuffer.allocateDirect(arg0.length);
        this.field1975.position(0);
        this.field1975.put(arg0);
    }
}
