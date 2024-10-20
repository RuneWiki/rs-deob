package deob;

@ObfuscatedName("db")
public class class109 extends class124 {

    @ObfuscatedName("db.e")
    public int field1602;

    @ObfuscatedName("db.n")
    public byte[] field1601;

    @ObfuscatedName("db.g")
    public int field1603;

    @ObfuscatedName("db.y")
    public int field1600;

    @ObfuscatedName("db.w")
    public boolean field1604;

    public class109(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1602 = arg0;
        this.field1601 = arg1;
        this.field1603 = arg2;
        this.field1600 = arg3;
    }

    public class109(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1602 = arg0;
        this.field1601 = arg1;
        this.field1603 = arg2;
        this.field1600 = arg3;
        this.field1604 = arg4;
    }

    @ObfuscatedName("db.e(Ldu;)Ldb;")
    public class109 method1865(class118 arg0) {
        this.field1601 = arg0.method1964(this.field1601);
        this.field1602 = arg0.method1965(this.field1602);
        if (this.field1603 == this.field1600) {
            this.field1603 = this.field1600 = arg0.method1966(this.field1603);
        } else {
            this.field1603 = arg0.method1966(this.field1603);
            this.field1600 = arg0.method1966(this.field1600);
            if (this.field1603 == this.field1600) {
                this.field1603--;
            }
        }
        return this;
    }
}
