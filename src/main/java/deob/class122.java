package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ds")
public class class122 extends class129 {

    @ObfuscatedName("ds.a")
    public ByteBuffer field2069;

    @ObfuscatedName("ds.a(I)[B")
    public byte[] method2372() {
        byte[] var1 = new byte[this.field2069.capacity()];
        this.field2069.position(0);
        this.field2069.get(var1);
        return var1;
    }

    @ObfuscatedName("ds.d([BI)V")
    public void method2374(byte[] arg0) {
        this.field2069 = ByteBuffer.allocateDirect(arg0.length);
        this.field2069.position(0);
        this.field2069.put(arg0);
    }
}
