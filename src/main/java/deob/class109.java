package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dd")
public class class109 extends class116 {

    @ObfuscatedName("dd.v")
    public ByteBuffer field1846;

    @ObfuscatedName("dd.v(I)[B")
    public byte[] method2137() {
        byte[] var1 = new byte[this.field1846.capacity()];
        this.field1846.position(0);
        this.field1846.get(var1);
        return var1;
    }

    @ObfuscatedName("dd.t([BI)V")
    public void method2138(byte[] arg0) {
        this.field1846 = ByteBuffer.allocateDirect(arg0.length);
        this.field1846.position(0);
        this.field1846.put(arg0);
    }
}
