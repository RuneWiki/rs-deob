package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("db")
public class class128 extends class133 {

    @ObfuscatedName("db.d")
    public ByteBuffer field1913;

    @ObfuscatedName("db.d(B)[B")
    public byte[] method2206() {
        byte[] var1 = new byte[this.field1913.capacity()];
        this.field1913.position(0);
        this.field1913.get(var1);
        return var1;
    }

    @ObfuscatedName("db.c([BI)V")
    public void method2208(byte[] arg0) {
        this.field1913 = ByteBuffer.allocateDirect(arg0.length);
        this.field1913.position(0);
        this.field1913.put(arg0);
    }
}
