package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dy")
public class class119 extends class126 {

    @ObfuscatedName("dy.a")
    public ByteBuffer field1991;

    @ObfuscatedName("dy.a(I)[B")
    public byte[] method2438() {
        byte[] var1 = new byte[this.field1991.capacity()];
        this.field1991.position(0);
        this.field1991.get(var1);
        return var1;
    }

    @ObfuscatedName("dy.w([BI)V")
    public void method2439(byte[] arg0) {
        this.field1991 = ByteBuffer.allocateDirect(arg0.length);
        this.field1991.position(0);
        this.field1991.put(arg0);
    }
}
