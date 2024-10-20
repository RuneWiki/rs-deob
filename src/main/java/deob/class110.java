package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dl")
public class class110 extends class117 {

    @ObfuscatedName("dl.t")
    public ByteBuffer field1865;

    @ObfuscatedName("dl.t(B)[B")
    public byte[] method2151() {
        byte[] var1 = new byte[this.field1865.capacity()];
        this.field1865.position(0);
        this.field1865.get(var1);
        return var1;
    }

    @ObfuscatedName("dl.b([BI)V")
    public void method2156(byte[] arg0) {
        this.field1865 = ByteBuffer.allocateDirect(arg0.length);
        this.field1865.position(0);
        this.field1865.put(arg0);
    }
}
