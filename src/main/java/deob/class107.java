package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dp")
public class class107 extends class114 {

    @ObfuscatedName("dp.f")
    public ByteBuffer field1848;

    @ObfuscatedName("dp.f(I)[B")
    public byte[] method2138() {
        byte[] var1 = new byte[this.field1848.capacity()];
        this.field1848.position(0);
        this.field1848.get(var1);
        return var1;
    }

    @ObfuscatedName("dp.k([BI)V")
    public void method2139(byte[] arg0) {
        this.field1848 = ByteBuffer.allocateDirect(arg0.length);
        this.field1848.position(0);
        this.field1848.put(arg0);
    }
}
