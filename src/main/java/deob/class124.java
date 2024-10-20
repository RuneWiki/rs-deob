package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dx")
public class class124 extends class118 {

    @ObfuscatedName("dx.j")
    public ByteBuffer field2001;

    @ObfuscatedName("dx.f(B)[B")
    public byte[] method2235() {
        byte[] var1 = new byte[this.field2001.capacity()];
        this.field2001.position(0);
        this.field2001.get(var1);
        return var1;
    }

    @ObfuscatedName("dx.y([BB)V")
    public void method2234(byte[] arg0) {
        this.field2001 = ByteBuffer.allocateDirect(arg0.length);
        this.field2001.position(0);
        this.field2001.put(arg0);
    }
}
