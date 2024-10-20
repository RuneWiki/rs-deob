package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("db")
public class class125 extends class119 {

    @ObfuscatedName("db.m")
    public ByteBuffer field2017;

    @ObfuscatedName("db.r(B)[B")
    public byte[] method2329() {
        byte[] var1 = new byte[this.field2017.capacity()];
        this.field2017.position(0);
        this.field2017.get(var1);
        return var1;
    }

    @ObfuscatedName("db.n([BI)V")
    public void method2330(byte[] arg0) {
        this.field2017 = ByteBuffer.allocateDirect(arg0.length);
        this.field2017.position(0);
        this.field2017.put(arg0);
    }
}
