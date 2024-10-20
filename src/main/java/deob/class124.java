package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("de")
public class class124 extends class118 {

    @ObfuscatedName("de.k")
    public ByteBuffer field2018;

    @ObfuscatedName("de.x(B)[B")
    public byte[] method2360() {
        byte[] var1 = new byte[this.field2018.capacity()];
        this.field2018.position(0);
        this.field2018.get(var1);
        return var1;
    }

    @ObfuscatedName("de.m([BI)V")
    public void method2358(byte[] arg0) {
        this.field2018 = ByteBuffer.allocateDirect(arg0.length);
        this.field2018.position(0);
        this.field2018.put(arg0);
    }
}
