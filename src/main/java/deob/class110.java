package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("do")
public class class110 extends class117 {

    @ObfuscatedName("do.n")
    public ByteBuffer field1895;

    @ObfuscatedName("do.n(I)[B")
    public byte[] method2194() {
        byte[] var1 = new byte[this.field1895.capacity()];
        this.field1895.position(0);
        this.field1895.get(var1);
        return var1;
    }

    @ObfuscatedName("do.g([BB)V")
    public void method2198(byte[] arg0) {
        this.field1895 = ByteBuffer.allocateDirect(arg0.length);
        this.field1895.position(0);
        this.field1895.put(arg0);
    }
}
