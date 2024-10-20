package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dn")
public class class119 extends class126 {

    @ObfuscatedName("dn.f")
    public ByteBuffer field1997;

    @ObfuscatedName("dn.f(I)[B")
    public byte[] method2364() {
        byte[] var1 = new byte[this.field1997.capacity()];
        this.field1997.position(0);
        this.field1997.get(var1);
        return var1;
    }

    @ObfuscatedName("dn.u([BB)V")
    public void method2365(byte[] arg0) {
        this.field1997 = ByteBuffer.allocateDirect(arg0.length);
        this.field1997.position(0);
        this.field1997.put(arg0);
    }
}
