package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dd")
public class class109 extends class116 {

    @ObfuscatedName("dd.b")
    public ByteBuffer field1854;

    @ObfuscatedName("dd.b(I)[B")
    public byte[] method2122() {
        byte[] var1 = new byte[this.field1854.capacity()];
        this.field1854.position(0);
        this.field1854.get(var1);
        return var1;
    }

    @ObfuscatedName("dd.e([BI)V")
    public void method2121(byte[] arg0) {
        this.field1854 = ByteBuffer.allocateDirect(arg0.length);
        this.field1854.position(0);
        this.field1854.put(arg0);
    }
}
