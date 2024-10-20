package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dn")
public class class126 extends class120 {

    @ObfuscatedName("dn.i")
    public ByteBuffer field2036;

    @ObfuscatedName("dn.q(B)[B")
    public byte[] method2381() {
        byte[] var1 = new byte[this.field2036.capacity()];
        this.field2036.position(0);
        this.field2036.get(var1);
        return var1;
    }

    @ObfuscatedName("dn.j([BI)V")
    public void method2373(byte[] arg0) {
        this.field2036 = ByteBuffer.allocateDirect(arg0.length);
        this.field2036.position(0);
        this.field2036.put(arg0);
    }
}
