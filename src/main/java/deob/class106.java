package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("da")
public class class106 extends class112 {

    @ObfuscatedName("da.b")
    public ByteBuffer field1843;

    @ObfuscatedName("da.b(I)[B")
    public byte[] method2111() {
        byte[] var1 = new byte[this.field1843.capacity()];
        this.field1843.position(0);
        this.field1843.get(var1);
        return var1;
    }

    @ObfuscatedName("da.u([BI)V")
    public void method2110(byte[] arg0) {
        this.field1843 = ByteBuffer.allocateDirect(arg0.length);
        this.field1843.position(0);
        this.field1843.put(arg0);
    }
}
