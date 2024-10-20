package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("da")
public class class118 extends class125 {

    @ObfuscatedName("da.g")
    public ByteBuffer field1975;

    @ObfuscatedName("da.g(I)[B")
    public byte[] method2340() {
        byte[] var1 = new byte[this.field1975.capacity()];
        this.field1975.position(0);
        this.field1975.get(var1);
        return var1;
    }

    @ObfuscatedName("da.b([BI)V")
    public void method2339(byte[] arg0) {
        this.field1975 = ByteBuffer.allocateDirect(arg0.length);
        this.field1975.position(0);
        this.field1975.put(arg0);
    }
}
