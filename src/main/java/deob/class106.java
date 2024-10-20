package deob;

@ObfuscatedName("dt")
public class class106 extends class121 {

    @ObfuscatedName("dt.g")
    public int field1519;

    @ObfuscatedName("dt.e")
    public byte[] field1520;

    @ObfuscatedName("dt.b")
    public int field1521;

    @ObfuscatedName("dt.z")
    public int field1522;

    @ObfuscatedName("dt.n")
    public boolean field1523;

    public class106(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1519 = arg0;
        this.field1520 = arg1;
        this.field1521 = arg2;
        this.field1522 = arg3;
    }

    public class106(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1519 = arg0;
        this.field1520 = arg1;
        this.field1521 = arg2;
        this.field1522 = arg3;
        this.field1523 = arg4;
    }

    @ObfuscatedName("dt.g(Lde;)Ldt;")
    public class106 method2131(class115 arg0) {
        this.field1520 = arg0.method2227(this.field1520);
        this.field1519 = arg0.method2233(this.field1519);
        if (this.field1522 == this.field1521) {
            this.field1521 = this.field1522 = arg0.method2229(this.field1521);
        } else {
            this.field1521 = arg0.method2229(this.field1521);
            this.field1522 = arg0.method2229(this.field1522);
            if (this.field1522 == this.field1521) {
                this.field1521--;
            }
        }
        return this;
    }
}
