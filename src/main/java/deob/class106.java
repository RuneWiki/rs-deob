package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dc")
public class class106 extends class112 {

    @ObfuscatedName("dc.z")
    public ByteBuffer field1817;

    @ObfuscatedName("dc.z(B)[B")
    public byte[] method2104() {
        byte[] var1 = new byte[this.field1817.capacity()];
        this.field1817.position(0);
        this.field1817.get(var1);
        return var1;
    }

    @ObfuscatedName("dc.j([BI)V")
    public void method2103(byte[] arg0) {
        this.field1817 = ByteBuffer.allocateDirect(arg0.length);
        this.field1817.position(0);
        this.field1817.put(arg0);
    }
}
