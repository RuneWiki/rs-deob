package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dx")
public class class118 extends class125 {

    @ObfuscatedName("dx.n")
    public ByteBuffer field1975;

    @ObfuscatedName("dx.n(I)[B")
    public byte[] method2316() {
        byte[] var1 = new byte[this.field1975.capacity()];
        this.field1975.position(0);
        this.field1975.get(var1);
        return var1;
    }

    @ObfuscatedName("dx.d([BI)V")
    public void method2317(byte[] arg0) {
        this.field1975 = ByteBuffer.allocateDirect(arg0.length);
        this.field1975.position(0);
        this.field1975.put(arg0);
    }
}
