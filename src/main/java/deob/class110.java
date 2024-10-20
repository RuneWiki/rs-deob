package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dw")
public class class110 extends class117 {

    @ObfuscatedName("dw.e")
    public ByteBuffer field1832;

    @ObfuscatedName("dw.e(I)[B")
    public byte[] method2153() {
        byte[] var1 = new byte[this.field1832.capacity()];
        this.field1832.position(0);
        this.field1832.get(var1);
        return var1;
    }

    @ObfuscatedName("dw.a([BB)V")
    public void method2154(byte[] arg0) {
        this.field1832 = ByteBuffer.allocateDirect(arg0.length);
        this.field1832.position(0);
        this.field1832.put(arg0);
    }
}
