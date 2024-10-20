package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dy")
public class class113 extends class120 {

    @ObfuscatedName("dy.j")
    public ByteBuffer field1890;

    @ObfuscatedName("dy.j(I)[B")
    public byte[] method2300() {
        byte[] var1 = new byte[this.field1890.capacity()];
        this.field1890.position(0);
        this.field1890.get(var1);
        return var1;
    }

    @ObfuscatedName("dy.y([BB)V")
    public void method2304(byte[] arg0) {
        this.field1890 = ByteBuffer.allocateDirect(arg0.length);
        this.field1890.position(0);
        this.field1890.put(arg0);
    }
}
