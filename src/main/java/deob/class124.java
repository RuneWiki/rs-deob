package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dz")
public class class124 extends class118 {

    @ObfuscatedName("dz.y")
    public ByteBuffer field2014;

    @ObfuscatedName("dz.x(I)[B")
    public byte[] method2287() {
        byte[] var1 = new byte[this.field2014.capacity()];
        this.field2014.position(0);
        this.field2014.get(var1);
        return var1;
    }

    @ObfuscatedName("dz.z([BB)V")
    public void method2294(byte[] arg0) {
        this.field2014 = ByteBuffer.allocateDirect(arg0.length);
        this.field2014.position(0);
        this.field2014.put(arg0);
    }
}
