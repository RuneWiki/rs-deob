package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dr")
public class class109 extends class116 {

    @ObfuscatedName("dr.p")
    public ByteBuffer field1841;

    @ObfuscatedName("dr.p(I)[B")
    public byte[] method2104() {
        byte[] var1 = new byte[this.field1841.capacity()];
        this.field1841.position(0);
        this.field1841.get(var1);
        return var1;
    }

    @ObfuscatedName("dr.y([BI)V")
    public void method2103(byte[] arg0) {
        this.field1841 = ByteBuffer.allocateDirect(arg0.length);
        this.field1841.position(0);
        this.field1841.put(arg0);
    }
}
