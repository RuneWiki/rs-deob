package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dq")
public class class125 extends class119 {

    @ObfuscatedName("dq.p")
    public ByteBuffer field2033;

    @ObfuscatedName("dq.a(S)[B")
    public byte[] method2307() {
        byte[] var1 = new byte[this.field2033.capacity()];
        this.field2033.position(0);
        this.field2033.get(var1);
        return var1;
    }

    @ObfuscatedName("dq.l([BI)V")
    public void method2308(byte[] arg0) {
        this.field2033 = ByteBuffer.allocateDirect(arg0.length);
        this.field2033.position(0);
        this.field2033.put(arg0);
    }
}
