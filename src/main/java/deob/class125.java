package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dl")
public class class125 extends class119 {

    @ObfuscatedName("dl.p")
    public ByteBuffer field2001;

    @ObfuscatedName("dl.a(I)[B")
    public byte[] method2324() {
        byte[] var1 = new byte[this.field2001.capacity()];
        this.field2001.position(0);
        this.field2001.get(var1);
        return var1;
    }

    @ObfuscatedName("dl.q([BB)V")
    public void method2311(byte[] arg0) {
        this.field2001 = ByteBuffer.allocateDirect(arg0.length);
        this.field2001.position(0);
        this.field2001.put(arg0);
    }
}
