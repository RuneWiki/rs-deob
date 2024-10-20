package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("di")
public class class106 extends class112 {

    @ObfuscatedName("di.k")
    public ByteBuffer field1836;

    @ObfuscatedName("di.k(I)[B")
    public byte[] method2115() {
        byte[] var1 = new byte[this.field1836.capacity()];
        this.field1836.position(0);
        this.field1836.get(var1);
        return var1;
    }

    @ObfuscatedName("di.y([BS)V")
    public void method2114(byte[] arg0) {
        this.field1836 = ByteBuffer.allocateDirect(arg0.length);
        this.field1836.position(0);
        this.field1836.put(arg0);
    }
}
