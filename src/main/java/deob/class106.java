package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dc")
public class class106 extends class112 {

    @ObfuscatedName("dc.g")
    public ByteBuffer field1849;

    @ObfuscatedName("dc.g(I)[B")
    public byte[] method2072() {
        byte[] var1 = new byte[this.field1849.capacity()];
        this.field1849.position(0);
        this.field1849.get(var1);
        return var1;
    }

    @ObfuscatedName("dc.s([BI)V")
    public void method2071(byte[] arg0) {
        this.field1849 = ByteBuffer.allocateDirect(arg0.length);
        this.field1849.position(0);
        this.field1849.put(arg0);
    }
}
