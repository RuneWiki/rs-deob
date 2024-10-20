package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dd")
public class class106 extends class112 {

    @ObfuscatedName("dd.y")
    public ByteBuffer field1851;

    @ObfuscatedName("dd.y(I)[B")
    public byte[] method2088() {
        byte[] var1 = new byte[this.field1851.capacity()];
        this.field1851.position(0);
        this.field1851.get(var1);
        return var1;
    }

    @ObfuscatedName("dd.u([BB)V")
    public void method2090(byte[] arg0) {
        this.field1851 = ByteBuffer.allocateDirect(arg0.length);
        this.field1851.position(0);
        this.field1851.put(arg0);
    }
}
