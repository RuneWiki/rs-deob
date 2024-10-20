package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("di")
public class class107 extends class114 {

    @ObfuscatedName("di.c")
    public ByteBuffer field1824;

    @ObfuscatedName("di.c(I)[B")
    public byte[] method2113() {
        byte[] var1 = new byte[this.field1824.capacity()];
        this.field1824.position(0);
        this.field1824.get(var1);
        return var1;
    }

    @ObfuscatedName("di.j([BI)V")
    public void method2112(byte[] arg0) {
        this.field1824 = ByteBuffer.allocateDirect(arg0.length);
        this.field1824.position(0);
        this.field1824.put(arg0);
    }
}
