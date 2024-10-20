package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dw")
public class class118 extends class125 {

    @ObfuscatedName("dw.y")
    public ByteBuffer field1971;

    @ObfuscatedName("dw.y(B)[B")
    public byte[] method2305() {
        byte[] var1 = new byte[this.field1971.capacity()];
        this.field1971.position(0);
        this.field1971.get(var1);
        return var1;
    }

    @ObfuscatedName("dw.d([BS)V")
    public void method2306(byte[] arg0) {
        this.field1971 = ByteBuffer.allocateDirect(arg0.length);
        this.field1971.position(0);
        this.field1971.put(arg0);
    }
}
