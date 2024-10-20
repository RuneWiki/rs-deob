package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ds")
public class class106 extends class112 {

    @ObfuscatedName("ds.g")
    public ByteBuffer field1842;

    @ObfuscatedName("ds.g(I)[B")
    public byte[] method2069() {
        byte[] var1 = new byte[this.field1842.capacity()];
        this.field1842.position(0);
        this.field1842.get(var1);
        return var1;
    }

    @ObfuscatedName("ds.i([BB)V")
    public void method2071(byte[] arg0) {
        this.field1842 = ByteBuffer.allocateDirect(arg0.length);
        this.field1842.position(0);
        this.field1842.put(arg0);
    }
}
