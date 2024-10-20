package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dn")
public class class122 extends class129 {

    @ObfuscatedName("dn.m")
    public ByteBuffer field2044;

    @ObfuscatedName("dn.m(I)[B")
    public byte[] method2392() {
        byte[] var1 = new byte[this.field2044.capacity()];
        this.field2044.position(0);
        this.field2044.get(var1);
        return var1;
    }

    @ObfuscatedName("dn.w([BI)V")
    public void method2391(byte[] arg0) {
        this.field2044 = ByteBuffer.allocateDirect(arg0.length);
        this.field2044.position(0);
        this.field2044.put(arg0);
    }
}
