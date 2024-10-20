package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("di")
public class class110 extends class117 {

    @ObfuscatedName("di.n")
    public ByteBuffer field1887;

    @ObfuscatedName("di.n(B)[B")
    public byte[] method2204() {
        byte[] var1 = new byte[this.field1887.capacity()];
        this.field1887.position(0);
        this.field1887.get(var1);
        return var1;
    }

    @ObfuscatedName("di.d([BB)V")
    public void method2203(byte[] arg0) {
        this.field1887 = ByteBuffer.allocateDirect(arg0.length);
        this.field1887.position(0);
        this.field1887.put(arg0);
    }
}
