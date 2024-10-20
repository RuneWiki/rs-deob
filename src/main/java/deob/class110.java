package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("do")
public class class110 extends class117 {

    @ObfuscatedName("do.n")
    public ByteBuffer field1887;

    @ObfuscatedName("do.n(I)[B")
    public byte[] method2213() {
        byte[] var1 = new byte[this.field1887.capacity()];
        this.field1887.position(0);
        this.field1887.get(var1);
        return var1;
    }

    @ObfuscatedName("do.o([BB)V")
    public void method2212(byte[] arg0) {
        this.field1887 = ByteBuffer.allocateDirect(arg0.length);
        this.field1887.position(0);
        this.field1887.put(arg0);
    }
}
