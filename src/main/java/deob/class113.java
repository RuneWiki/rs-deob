package deob;

@ObfuscatedName("dp")
public class class113 extends class128 {

    @ObfuscatedName("dp.m")
    public int field1420;

    @ObfuscatedName("dp.o")
    public byte[] field1423;

    @ObfuscatedName("dp.q")
    public int field1422;

    @ObfuscatedName("dp.j")
    public int field1421;

    @ObfuscatedName("dp.p")
    public boolean field1424;

    public class113(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1420 = arg0;
        this.field1423 = arg1;
        this.field1422 = arg2;
        this.field1421 = arg3;
    }

    public class113(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1420 = arg0;
        this.field1423 = arg1;
        this.field1422 = arg2;
        this.field1421 = arg3;
        this.field1424 = arg4;
    }

    @ObfuscatedName("dp.m(Ldv;)Ldp;")
    public class113 method2296(class122 arg0) {
        this.field1423 = arg0.method2405(this.field1423);
        this.field1420 = arg0.method2403(this.field1420);
        if (this.field1422 == this.field1421) {
            this.field1422 = this.field1421 = arg0.method2401(this.field1422);
        } else {
            this.field1422 = arg0.method2401(this.field1422);
            this.field1421 = arg0.method2401(this.field1421);
            if (this.field1422 == this.field1421) {
                this.field1422--;
            }
        }
        return this;
    }
}
