package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dn")
public class class106 extends class112 {

    @ObfuscatedName("dn.n")
    public ByteBuffer field1824;

    @ObfuscatedName("dn.n(I)[B")
    public byte[] method2119() {
        byte[] var1 = new byte[this.field1824.capacity()];
        this.field1824.position(0);
        this.field1824.get(var1);
        return var1;
    }

    @ObfuscatedName("dn.x([BI)V")
    public void method2115(byte[] arg0) {
        this.field1824 = ByteBuffer.allocateDirect(arg0.length);
        this.field1824.position(0);
        this.field1824.put(arg0);
    }
}
