package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dy")
public class class106 extends class112 {

    @ObfuscatedName("dy.i")
    public ByteBuffer field1835;

    @ObfuscatedName("dy.i(I)[B")
    public byte[] method2130() {
        byte[] var1 = new byte[this.field1835.capacity()];
        this.field1835.position(0);
        this.field1835.get(var1);
        return var1;
    }

    @ObfuscatedName("dy.c([BI)V")
    public void method2131(byte[] arg0) {
        this.field1835 = ByteBuffer.allocateDirect(arg0.length);
        this.field1835.position(0);
        this.field1835.put(arg0);
    }
}
