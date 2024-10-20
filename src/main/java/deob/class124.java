package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dq")
public class class124 extends class118 {

    @ObfuscatedName("dq.f")
    public ByteBuffer field2023;

    @ObfuscatedName("dq.c(B)[B")
    public byte[] method2365() {
        byte[] var1 = new byte[this.field2023.capacity()];
        this.field2023.position(0);
        this.field2023.get(var1);
        return var1;
    }

    @ObfuscatedName("dq.r([BB)V")
    public void method2366(byte[] arg0) {
        this.field2023 = ByteBuffer.allocateDirect(arg0.length);
        this.field2023.position(0);
        this.field2023.put(arg0);
    }
}
