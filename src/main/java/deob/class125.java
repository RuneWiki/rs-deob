package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dx")
public class class125 extends class119 {

    @ObfuscatedName("dx.l")
    public ByteBuffer field2049;

    @ObfuscatedName("dx.c(B)[B")
    public byte[] method2353() {
        byte[] var1 = new byte[this.field2049.capacity()];
        this.field2049.position(0);
        this.field2049.get(var1);
        return var1;
    }

    @ObfuscatedName("dx.d([BB)V")
    public void method2354(byte[] arg0) {
        this.field2049 = ByteBuffer.allocateDirect(arg0.length);
        this.field2049.position(0);
        this.field2049.put(arg0);
    }
}
