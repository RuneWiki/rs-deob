package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("db")
public class class118 extends class125 {

    @ObfuscatedName("db.h")
    public ByteBuffer field1970;

    @ObfuscatedName("db.h(I)[B")
    public byte[] method2359() {
        byte[] var1 = new byte[this.field1970.capacity()];
        this.field1970.position(0);
        this.field1970.get(var1);
        return var1;
    }

    @ObfuscatedName("db.q([BB)V")
    public void method2360(byte[] arg0) {
        this.field1970 = ByteBuffer.allocateDirect(arg0.length);
        this.field1970.position(0);
        this.field1970.put(arg0);
    }
}
