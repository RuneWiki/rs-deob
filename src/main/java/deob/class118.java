package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dm")
public class class118 extends class125 {

    @ObfuscatedName("dm.j")
    public ByteBuffer field1991;

    @ObfuscatedName("dm.j(I)[B")
    public byte[] method2292() {
        byte[] var1 = new byte[this.field1991.capacity()];
        this.field1991.position(0);
        this.field1991.get(var1);
        return var1;
    }

    @ObfuscatedName("dm.l([BI)V")
    public void method2294(byte[] arg0) {
        this.field1991 = ByteBuffer.allocateDirect(arg0.length);
        this.field1991.position(0);
        this.field1991.put(arg0);
    }
}
