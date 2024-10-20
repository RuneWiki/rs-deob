package deob;

@ObfuscatedName("co")
public class class104 extends class119 {

    @ObfuscatedName("co.s")
    public int field1367;

    @ObfuscatedName("co.j")
    public byte[] field1364;

    @ObfuscatedName("co.i")
    public int field1365;

    @ObfuscatedName("co.k")
    public int field1366;

    @ObfuscatedName("co.u")
    public boolean field1363;

    public class104(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1367 = arg0;
        this.field1364 = arg1;
        this.field1365 = arg2;
        this.field1366 = arg3;
    }

    public class104(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1367 = arg0;
        this.field1364 = arg1;
        this.field1365 = arg2;
        this.field1366 = arg3;
        this.field1363 = arg4;
    }

    @ObfuscatedName("co.s(Ldb;)Lco;")
    public class104 method2182(class113 arg0) {
        this.field1364 = arg0.method2296(this.field1364);
        this.field1367 = arg0.method2297(this.field1367);
        if (this.field1366 == this.field1365) {
            this.field1365 = this.field1366 = arg0.method2298(this.field1365);
        } else {
            this.field1365 = arg0.method2298(this.field1365);
            this.field1366 = arg0.method2298(this.field1366);
            if (this.field1366 == this.field1365) {
                this.field1365--;
            }
        }
        return this;
    }
}
