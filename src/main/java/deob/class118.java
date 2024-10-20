package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dw")
public class class118 extends class125 {

    @ObfuscatedName("dw.j")
    public ByteBuffer field1978;

    @ObfuscatedName("dw.j(I)[B")
    public byte[] method2354() {
        byte[] var1 = new byte[this.field1978.capacity()];
        this.field1978.position(0);
        this.field1978.get(var1);
        return var1;
    }

    @ObfuscatedName("dw.m([BI)V")
    public void method2349(byte[] arg0) {
        this.field1978 = ByteBuffer.allocateDirect(arg0.length);
        this.field1978.position(0);
        this.field1978.put(arg0);
    }
}
