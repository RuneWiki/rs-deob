package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dt")
public class class106 extends class112 {

    @ObfuscatedName("dt.g")
    public ByteBuffer field1837;

    @ObfuscatedName("dt.g(B)[B")
    public byte[] method2124() {
        byte[] var1 = new byte[this.field1837.capacity()];
        this.field1837.position(0);
        this.field1837.get(var1);
        return var1;
    }

    @ObfuscatedName("dt.v([BS)V")
    public void method2121(byte[] arg0) {
        this.field1837 = ByteBuffer.allocateDirect(arg0.length);
        this.field1837.position(0);
        this.field1837.put(arg0);
    }
}
