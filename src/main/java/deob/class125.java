package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("di")
public class class125 extends class119 {

    @ObfuscatedName("di.w")
    public ByteBuffer field2033;

    @ObfuscatedName("di.e(B)[B")
    public byte[] method2376() {
        byte[] var1 = new byte[this.field2033.capacity()];
        this.field2033.position(0);
        this.field2033.get(var1);
        return var1;
    }

    @ObfuscatedName("di.t([BB)V")
    public void method2372(byte[] arg0) {
        this.field2033 = ByteBuffer.allocateDirect(arg0.length);
        this.field2033.position(0);
        this.field2033.put(arg0);
    }
}
