package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dy")
public class class119 extends class126 {

    @ObfuscatedName("dy.j")
    public ByteBuffer field1970;

    @ObfuscatedName("dy.j(B)[B")
    public byte[] method2338() {
        byte[] var1 = new byte[this.field1970.capacity()];
        this.field1970.position(0);
        this.field1970.get(var1);
        return var1;
    }

    @ObfuscatedName("dy.h([BI)V")
    public void method2339(byte[] arg0) {
        this.field1970 = ByteBuffer.allocateDirect(arg0.length);
        this.field1970.position(0);
        this.field1970.put(arg0);
    }
}
