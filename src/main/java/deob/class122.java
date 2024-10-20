package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dm")
public class class122 extends class129 {

    @ObfuscatedName("dm.s")
    public ByteBuffer field2026;

    @ObfuscatedName("dm.s(I)[B")
    public byte[] method2343() {
        byte[] var1 = new byte[this.field2026.capacity()];
        this.field2026.position(0);
        this.field2026.get(var1);
        return var1;
    }

    @ObfuscatedName("dm.z([BI)V")
    public void method2342(byte[] arg0) {
        this.field2026 = ByteBuffer.allocateDirect(arg0.length);
        this.field2026.position(0);
        this.field2026.put(arg0);
    }
}
