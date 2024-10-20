package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dn")
public class class106 extends class112 {

    @ObfuscatedName("dn.t")
    public ByteBuffer field1829;

    @ObfuscatedName("dn.t(B)[B")
    public byte[] method2080() {
        byte[] var1 = new byte[this.field1829.capacity()];
        this.field1829.position(0);
        this.field1829.get(var1);
        return var1;
    }

    @ObfuscatedName("dn.s([BI)V")
    public void method2082(byte[] arg0) {
        this.field1829 = ByteBuffer.allocateDirect(arg0.length);
        this.field1829.position(0);
        this.field1829.put(arg0);
    }
}
