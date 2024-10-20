package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dg")
public class class118 extends class125 {

    @ObfuscatedName("dg.n")
    public ByteBuffer field1981;

    @ObfuscatedName("dg.n(B)[B")
    public byte[] method2338() {
        byte[] var1 = new byte[this.field1981.capacity()];
        this.field1981.position(0);
        this.field1981.get(var1);
        return var1;
    }

    @ObfuscatedName("dg.q([BI)V")
    public void method2339(byte[] arg0) {
        this.field1981 = ByteBuffer.allocateDirect(arg0.length);
        this.field1981.position(0);
        this.field1981.put(arg0);
    }
}
