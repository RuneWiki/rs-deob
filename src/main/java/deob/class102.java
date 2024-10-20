package deob;

@ObfuscatedName("cx")
public class class102 extends class117 {

    @ObfuscatedName("cx.m")
    public int field1350;

    @ObfuscatedName("cx.f")
    public byte[] field1348;

    @ObfuscatedName("cx.q")
    public int field1349;

    @ObfuscatedName("cx.w")
    public int field1347;

    @ObfuscatedName("cx.o")
    public boolean field1351;

    public class102(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1350 = arg0;
        this.field1348 = arg1;
        this.field1349 = arg2;
        this.field1347 = arg3;
    }

    public class102(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1350 = arg0;
        this.field1348 = arg1;
        this.field1349 = arg2;
        this.field1347 = arg3;
        this.field1351 = arg4;
    }

    @ObfuscatedName("cx.m(Ldp;)Lcx;")
    public class102 method2169(class111 arg0) {
        this.field1348 = arg0.method2266(this.field1348);
        this.field1350 = arg0.method2269(this.field1350);
        if (this.field1349 == this.field1347) {
            this.field1349 = this.field1347 = arg0.method2272(this.field1349);
        } else {
            this.field1349 = arg0.method2272(this.field1349);
            this.field1347 = arg0.method2272(this.field1347);
            if (this.field1349 == this.field1347) {
                this.field1349--;
            }
        }
        return this;
    }
}
