package deob;

@ObfuscatedName("ca")
public class class104 extends class119 {

    @ObfuscatedName("ca.a")
    public int field1368;

    @ObfuscatedName("ca.t")
    public byte[] field1365;

    @ObfuscatedName("ca.n")
    public int field1366;

    @ObfuscatedName("ca.q")
    public int field1367;

    @ObfuscatedName("ca.v")
    public boolean field1364;

    public class104(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1368 = arg0;
        this.field1365 = arg1;
        this.field1366 = arg2;
        this.field1367 = arg3;
    }

    public class104(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1368 = arg0;
        this.field1365 = arg1;
        this.field1366 = arg2;
        this.field1367 = arg3;
        this.field1364 = arg4;
    }

    @ObfuscatedName("ca.a(Ldo;)Lca;")
    public class104 method2320(class113 arg0) {
        this.field1365 = arg0.method2428(this.field1365);
        this.field1368 = arg0.method2429(this.field1368);
        if (this.field1367 == this.field1366) {
            this.field1366 = this.field1367 = arg0.method2430(this.field1366);
        } else {
            this.field1366 = arg0.method2430(this.field1366);
            this.field1367 = arg0.method2430(this.field1367);
            if (this.field1367 == this.field1366) {
                this.field1366--;
            }
        }
        return this;
    }
}
