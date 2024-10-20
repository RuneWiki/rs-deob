package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dx")
public class class125 extends class119 {

    @ObfuscatedName("dx.x")
    public ByteBuffer field2027;

    @ObfuscatedName("dx.r(B)[B")
    public byte[] method2318() {
        byte[] var1 = new byte[this.field2027.capacity()];
        this.field2027.position(0);
        this.field2027.get(var1);
        return var1;
    }

    @ObfuscatedName("dx.p([BI)V")
    public void method2319(byte[] arg0) {
        this.field2027 = ByteBuffer.allocateDirect(arg0.length);
        this.field2027.position(0);
        this.field2027.put(arg0);
    }
}
