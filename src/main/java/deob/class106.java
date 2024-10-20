package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dt")
public class class106 extends class112 {

    @ObfuscatedName("dt.j")
    public ByteBuffer field1845;

    @ObfuscatedName("dt.j(I)[B")
    public byte[] method2107() {
        byte[] var1 = new byte[this.field1845.capacity()];
        this.field1845.position(0);
        this.field1845.get(var1);
        return var1;
    }

    @ObfuscatedName("dt.z([BI)V")
    public void method2108(byte[] arg0) {
        this.field1845 = ByteBuffer.allocateDirect(arg0.length);
        this.field1845.position(0);
        this.field1845.put(arg0);
    }
}
