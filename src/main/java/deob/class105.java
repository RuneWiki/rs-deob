package deob;

@ObfuscatedName("dp")
public class class105 extends class120 {

    @ObfuscatedName("dp.p")
    public int field1503;

    @ObfuscatedName("dp.i")
    public byte[] field1501;

    @ObfuscatedName("dp.w")
    public int field1502;

    @ObfuscatedName("dp.s")
    public int field1500;

    @ObfuscatedName("dp.j")
    public boolean field1504;

    public class105(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1503 = arg0;
        this.field1501 = arg1;
        this.field1502 = arg2;
        this.field1500 = arg3;
    }

    public class105(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1503 = arg0;
        this.field1501 = arg1;
        this.field1502 = arg2;
        this.field1500 = arg3;
        this.field1504 = arg4;
    }

    @ObfuscatedName("dp.p(Lds;)Ldp;")
    public class105 method2004(class114 arg0) {
        this.field1501 = arg0.method2118(this.field1501);
        this.field1503 = arg0.method2111(this.field1503);
        if (this.field1502 == this.field1500) {
            this.field1502 = this.field1500 = arg0.method2112(this.field1502);
        } else {
            this.field1502 = arg0.method2112(this.field1502);
            this.field1500 = arg0.method2112(this.field1500);
            if (this.field1502 == this.field1500) {
                this.field1502--;
            }
        }
        return this;
    }
}
