package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("di")
public class class119 extends class126 {

    @ObfuscatedName("di.b")
    public ByteBuffer field1975;

    @ObfuscatedName("di.b(B)[B")
    public byte[] method2323() {
        byte[] var1 = new byte[this.field1975.capacity()];
        this.field1975.position(0);
        this.field1975.get(var1);
        return var1;
    }

    @ObfuscatedName("di.g([BI)V")
    public void method2322(byte[] arg0) {
        this.field1975 = ByteBuffer.allocateDirect(arg0.length);
        this.field1975.position(0);
        this.field1975.put(arg0);
    }
}
