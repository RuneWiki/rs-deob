package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dp")
public class class118 extends class125 {

    @ObfuscatedName("dp.v")
    public ByteBuffer field1982;

    @ObfuscatedName("dp.v(B)[B")
    public byte[] method2330() {
        byte[] var1 = new byte[this.field1982.capacity()];
        this.field1982.position(0);
        this.field1982.get(var1);
        return var1;
    }

    @ObfuscatedName("dp.f([BB)V")
    public void method2328(byte[] arg0) {
        this.field1982 = ByteBuffer.allocateDirect(arg0.length);
        this.field1982.position(0);
        this.field1982.put(arg0);
    }
}
