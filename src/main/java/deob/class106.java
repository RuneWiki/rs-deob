package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ds")
public class class106 extends class112 {

    @ObfuscatedName("ds.e")
    public ByteBuffer field1842;

    @ObfuscatedName("ds.e(I)[B")
    public byte[] method2095() {
        byte[] var1 = new byte[this.field1842.capacity()];
        this.field1842.position(0);
        this.field1842.get(var1);
        return var1;
    }

    @ObfuscatedName("ds.v([BI)V")
    public void method2096(byte[] arg0) {
        this.field1842 = ByteBuffer.allocateDirect(arg0.length);
        this.field1842.position(0);
        this.field1842.put(arg0);
    }
}
