package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dg")
public class class107 extends class114 {

    @ObfuscatedName("dg.g")
    public ByteBuffer field1822;

    @ObfuscatedName("dg.g(I)[B")
    public byte[] method2060() {
        byte[] var1 = new byte[this.field1822.capacity()];
        this.field1822.position(0);
        this.field1822.get(var1);
        return var1;
    }

    @ObfuscatedName("dg.j([BB)V")
    public void method2061(byte[] arg0) {
        this.field1822 = ByteBuffer.allocateDirect(arg0.length);
        this.field1822.position(0);
        this.field1822.put(arg0);
    }
}
