package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("do")
public class class125 extends class119 {

    @ObfuscatedName("do.t")
    public ByteBuffer field2022;

    @ObfuscatedName("do.n(I)[B")
    public byte[] method2355() {
        byte[] var1 = new byte[this.field2022.capacity()];
        this.field2022.position(0);
        this.field2022.get(var1);
        return var1;
    }

    @ObfuscatedName("do.e([BI)V")
    public void method2351(byte[] arg0) {
        this.field2022 = ByteBuffer.allocateDirect(arg0.length);
        this.field2022.position(0);
        this.field2022.put(arg0);
    }
}
