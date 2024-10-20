package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dj")
public class class110 extends class117 {

    @ObfuscatedName("dj.y")
    public ByteBuffer field1895;

    @ObfuscatedName("dj.y(S)[B")
    public byte[] method2136() {
        byte[] var1 = new byte[this.field1895.capacity()];
        this.field1895.position(0);
        this.field1895.get(var1);
        return var1;
    }

    @ObfuscatedName("dj.k([BB)V")
    public void method2139(byte[] arg0) {
        this.field1895 = ByteBuffer.allocateDirect(arg0.length);
        this.field1895.position(0);
        this.field1895.put(arg0);
    }
}
