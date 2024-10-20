package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dz")
public class class106 extends class112 {

    @ObfuscatedName("dz.g")
    public ByteBuffer field1833;

    @ObfuscatedName("dz.g(I)[B")
    public byte[] method2080() {
        byte[] var1 = new byte[this.field1833.capacity()];
        this.field1833.position(0);
        this.field1833.get(var1);
        return var1;
    }

    @ObfuscatedName("dz.s([BB)V")
    public void method2082(byte[] arg0) {
        this.field1833 = ByteBuffer.allocateDirect(arg0.length);
        this.field1833.position(0);
        this.field1833.put(arg0);
    }
}
