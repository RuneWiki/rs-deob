package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dm")
public class class122 extends class129 {

    @ObfuscatedName("dm.i")
    public ByteBuffer field2042;

    @ObfuscatedName("dm.i(B)[B")
    public byte[] method2384() {
        byte[] var1 = new byte[this.field2042.capacity()];
        this.field2042.position(0);
        this.field2042.get(var1);
        return var1;
    }

    @ObfuscatedName("dm.h([BI)V")
    public void method2383(byte[] arg0) {
        this.field2042 = ByteBuffer.allocateDirect(arg0.length);
        this.field2042.position(0);
        this.field2042.put(arg0);
    }
}
