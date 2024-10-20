package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dd")
public class class125 extends class119 {

    @ObfuscatedName("dd.b")
    public ByteBuffer field2014;

    @ObfuscatedName("dd.o(B)[B")
    public byte[] method2343() {
        byte[] var1 = new byte[this.field2014.capacity()];
        this.field2014.position(0);
        this.field2014.get(var1);
        return var1;
    }

    @ObfuscatedName("dd.w([BB)V")
    public void method2344(byte[] arg0) {
        this.field2014 = ByteBuffer.allocateDirect(arg0.length);
        this.field2014.position(0);
        this.field2014.put(arg0);
    }
}
