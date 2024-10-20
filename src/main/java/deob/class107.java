package deob;

@ObfuscatedName("da")
public class class107 extends class122 {

    @ObfuscatedName("da.d")
    public int field1532;

    @ObfuscatedName("da.x")
    public byte[] field1528;

    @ObfuscatedName("da.k")
    public int field1530;

    @ObfuscatedName("da.z")
    public int field1529;

    @ObfuscatedName("da.v")
    public boolean field1531;

    public class107(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1532 = arg0;
        this.field1528 = arg1;
        this.field1530 = arg2;
        this.field1529 = arg3;
    }

    public class107(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1532 = arg0;
        this.field1528 = arg1;
        this.field1530 = arg2;
        this.field1529 = arg3;
        this.field1531 = arg4;
    }

    @ObfuscatedName("da.d(Ldh;)Lda;")
    public class107 method1915(class116 arg0) {
        this.field1528 = arg0.method2039(this.field1528);
        this.field1532 = arg0.method2040(this.field1532);
        if (this.field1530 == this.field1529) {
            this.field1530 = this.field1529 = arg0.method2038(this.field1530);
        } else {
            this.field1530 = arg0.method2038(this.field1530);
            this.field1529 = arg0.method2038(this.field1529);
            if (this.field1530 == this.field1529) {
                this.field1530--;
            }
        }
        return this;
    }
}
