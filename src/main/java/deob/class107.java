package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("de")
public class class107 extends class114 {

    @ObfuscatedName("de.e")
    public ByteBuffer field1840;

    @ObfuscatedName("de.e(B)[B")
    public byte[] method2098() {
        byte[] var1 = new byte[this.field1840.capacity()];
        this.field1840.position(0);
        this.field1840.get(var1);
        return var1;
    }

    @ObfuscatedName("de.v([BI)V")
    public void method2099(byte[] arg0) {
        this.field1840 = ByteBuffer.allocateDirect(arg0.length);
        this.field1840.position(0);
        this.field1840.put(arg0);
    }
}
