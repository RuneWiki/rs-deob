package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dt")
public class class125 extends class119 {

    @ObfuscatedName("dt.c")
    public ByteBuffer field2048;

    @ObfuscatedName("dt.j(I)[B")
    public byte[] method2311() {
        byte[] var1 = new byte[this.field2048.capacity()];
        this.field2048.position(0);
        this.field2048.get(var1);
        return var1;
    }

    @ObfuscatedName("dt.i([BI)V")
    public void method2312(byte[] arg0) {
        this.field2048 = ByteBuffer.allocateDirect(arg0.length);
        this.field2048.position(0);
        this.field2048.put(arg0);
    }
}
