package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dq")
public class class107 extends class114 {

    @ObfuscatedName("dq.x")
    public ByteBuffer field1838;

    @ObfuscatedName("dq.x(S)[B")
    public byte[] method2107() {
        byte[] var1 = new byte[this.field1838.capacity()];
        this.field1838.position(0);
        this.field1838.get(var1);
        return var1;
    }

    @ObfuscatedName("dq.v([BI)V")
    public void method2111(byte[] arg0) {
        this.field1838 = ByteBuffer.allocateDirect(arg0.length);
        this.field1838.position(0);
        this.field1838.put(arg0);
    }
}
