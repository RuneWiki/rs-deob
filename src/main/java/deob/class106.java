package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dq")
public class class106 extends class112 {

    @ObfuscatedName("dq.t")
    public ByteBuffer field1825;

    @ObfuscatedName("dq.t(I)[B")
    public byte[] method2099() {
        byte[] var1 = new byte[this.field1825.capacity()];
        this.field1825.position(0);
        this.field1825.get(var1);
        return var1;
    }

    @ObfuscatedName("dq.o([BB)V")
    public void method2102(byte[] arg0) {
        this.field1825 = ByteBuffer.allocateDirect(arg0.length);
        this.field1825.position(0);
        this.field1825.put(arg0);
    }
}
