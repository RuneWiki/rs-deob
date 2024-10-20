package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("cm")
public class class103 extends class109 {

    @ObfuscatedName("cm.z")
    public ByteBuffer field1813;

    @ObfuscatedName("cm.z(I)[B")
    public byte[] method2102() {
        byte[] var1 = new byte[this.field1813.capacity()];
        this.field1813.position(0);
        this.field1813.get(var1);
        return var1;
    }

    @ObfuscatedName("cm.n([BI)V")
    public void method2105(byte[] arg0) {
        this.field1813 = ByteBuffer.allocateDirect(arg0.length);
        this.field1813.position(0);
        this.field1813.put(arg0);
    }
}
