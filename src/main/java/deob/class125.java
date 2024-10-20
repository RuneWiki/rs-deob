package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dc")
public class class125 extends class119 {

    @ObfuscatedName("dc.e")
    public ByteBuffer field2025;

    @ObfuscatedName("dc.o(I)[B")
    public byte[] method2347() {
        byte[] var1 = new byte[this.field2025.capacity()];
        this.field2025.position(0);
        this.field2025.get(var1);
        return var1;
    }

    @ObfuscatedName("dc.a([BB)V")
    public void method2348(byte[] arg0) {
        this.field2025 = ByteBuffer.allocateDirect(arg0.length);
        this.field2025.position(0);
        this.field2025.put(arg0);
    }
}
