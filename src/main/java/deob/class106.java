package deob;

@ObfuscatedName("dp")
public class class106 extends class121 {

    @ObfuscatedName("dp.t")
    public int field1520;

    @ObfuscatedName("dp.q")
    public byte[] field1521;

    @ObfuscatedName("dp.i")
    public int field1519;

    @ObfuscatedName("dp.a")
    public int field1522;

    @ObfuscatedName("dp.l")
    public boolean field1523;

    public class106(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1520 = arg0;
        this.field1521 = arg1;
        this.field1519 = arg2;
        this.field1522 = arg3;
    }

    public class106(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1520 = arg0;
        this.field1521 = arg1;
        this.field1519 = arg2;
        this.field1522 = arg3;
        this.field1523 = arg4;
    }

    @ObfuscatedName("dp.t(Ldt;)Ldp;")
    public class106 method2023(class115 arg0) {
        this.field1521 = arg0.method2127(this.field1521);
        this.field1520 = arg0.method2129(this.field1520);
        if (this.field1522 == this.field1519) {
            this.field1519 = this.field1522 = arg0.method2126(this.field1519);
        } else {
            this.field1519 = arg0.method2126(this.field1519);
            this.field1522 = arg0.method2126(this.field1522);
            if (this.field1522 == this.field1519) {
                this.field1519--;
            }
        }
        return this;
    }
}
