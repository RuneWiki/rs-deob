package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dc")
public class class106 extends class112 {

    @ObfuscatedName("dc.k")
    public ByteBuffer field1855;

    @ObfuscatedName("dc.k(I)[B")
    public byte[] method2096() {
        byte[] var1 = new byte[this.field1855.capacity()];
        this.field1855.position(0);
        this.field1855.get(var1);
        return var1;
    }

    @ObfuscatedName("dc.b([BB)V")
    public void method2095(byte[] arg0) {
        this.field1855 = ByteBuffer.allocateDirect(arg0.length);
        this.field1855.position(0);
        this.field1855.put(arg0);
    }
}
