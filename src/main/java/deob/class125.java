package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dp")
public class class125 extends class119 {

    @ObfuscatedName("dp.h")
    public ByteBuffer field2023;

    @ObfuscatedName("dp.o(I)[B")
    public byte[] method2402() {
        byte[] var1 = new byte[this.field2023.capacity()];
        this.field2023.position(0);
        this.field2023.get(var1);
        return var1;
    }

    @ObfuscatedName("dp.p([BI)V")
    public void method2401(byte[] arg0) {
        this.field2023 = ByteBuffer.allocateDirect(arg0.length);
        this.field2023.position(0);
        this.field2023.put(arg0);
    }
}
