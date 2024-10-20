package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("db")
public class class118 extends class125 {

    @ObfuscatedName("db.d")
    public ByteBuffer field1964;

    @ObfuscatedName("db.d(I)[B")
    public byte[] method2335() {
        byte[] var1 = new byte[this.field1964.capacity()];
        this.field1964.position(0);
        this.field1964.get(var1);
        return var1;
    }

    @ObfuscatedName("db.p([BI)V")
    public void method2336(byte[] arg0) {
        this.field1964 = ByteBuffer.allocateDirect(arg0.length);
        this.field1964.position(0);
        this.field1964.put(arg0);
    }
}
