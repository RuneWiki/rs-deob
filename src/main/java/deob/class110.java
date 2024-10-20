package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("db")
public class class110 extends class117 {

    @ObfuscatedName("db.o")
    public ByteBuffer field1855;

    @ObfuscatedName("db.o(I)[B")
    public byte[] method2199() {
        byte[] var1 = new byte[this.field1855.capacity()];
        this.field1855.position(0);
        this.field1855.get(var1);
        return var1;
    }

    @ObfuscatedName("db.l([BI)V")
    public void method2200(byte[] arg0) {
        this.field1855 = ByteBuffer.allocateDirect(arg0.length);
        this.field1855.position(0);
        this.field1855.put(arg0);
    }
}
