package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dy")
public class class107 extends class114 {

    @ObfuscatedName("dy.l")
    public ByteBuffer field1821;

    @ObfuscatedName("dy.l(I)[B")
    public byte[] method2139() {
        byte[] var1 = new byte[this.field1821.capacity()];
        this.field1821.position(0);
        this.field1821.get(var1);
        return var1;
    }

    @ObfuscatedName("dy.y([BS)V")
    public void method2140(byte[] arg0) {
        this.field1821 = ByteBuffer.allocateDirect(arg0.length);
        this.field1821.position(0);
        this.field1821.put(arg0);
    }
}
