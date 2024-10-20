package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("de")
public class class106 extends class112 {

    @ObfuscatedName("de.p")
    public ByteBuffer field1835;

    @ObfuscatedName("de.p(I)[B")
    public byte[] method2155() {
        byte[] var1 = new byte[this.field1835.capacity()];
        this.field1835.position(0);
        this.field1835.get(var1);
        return var1;
    }

    @ObfuscatedName("de.g([BS)V")
    public void method2152(byte[] arg0) {
        this.field1835 = ByteBuffer.allocateDirect(arg0.length);
        this.field1835.position(0);
        this.field1835.put(arg0);
    }
}
