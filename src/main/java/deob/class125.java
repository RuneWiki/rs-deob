package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dt")
public class class125 extends class119 {

    @ObfuscatedName("dt.l")
    public ByteBuffer field2024;

    @ObfuscatedName("dt.x(I)[B")
    public byte[] method2402() {
        byte[] var1 = new byte[this.field2024.capacity()];
        this.field2024.position(0);
        this.field2024.get(var1);
        return var1;
    }

    @ObfuscatedName("dt.o([BI)V")
    public void method2403(byte[] arg0) {
        this.field2024 = ByteBuffer.allocateDirect(arg0.length);
        this.field2024.position(0);
        this.field2024.put(arg0);
    }
}
