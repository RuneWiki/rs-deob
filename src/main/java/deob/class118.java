package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dr")
public class class118 extends class125 {

    @ObfuscatedName("dr.z")
    public ByteBuffer field1984;

    @ObfuscatedName("dr.z(I)[B")
    public byte[] method2278() {
        byte[] var1 = new byte[this.field1984.capacity()];
        this.field1984.position(0);
        this.field1984.get(var1);
        return var1;
    }

    @ObfuscatedName("dr.q([BI)V")
    public void method2279(byte[] arg0) {
        this.field1984 = ByteBuffer.allocateDirect(arg0.length);
        this.field1984.position(0);
        this.field1984.put(arg0);
    }
}
