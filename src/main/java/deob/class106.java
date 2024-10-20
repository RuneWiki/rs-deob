package deob;

@ObfuscatedName("do")
public class class106 extends class121 {

    @ObfuscatedName("do.d")
    public int field1598;

    @ObfuscatedName("do.k")
    public byte[] field1597;

    @ObfuscatedName("do.e")
    public int field1599;

    @ObfuscatedName("do.p")
    public int field1596;

    @ObfuscatedName("do.q")
    public boolean field1600;

    public class106(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1598 = arg0;
        this.field1597 = arg1;
        this.field1599 = arg2;
        this.field1596 = arg3;
    }

    public class106(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1598 = arg0;
        this.field1597 = arg1;
        this.field1599 = arg2;
        this.field1596 = arg3;
        this.field1600 = arg4;
    }

    @ObfuscatedName("do.d(Ldy;)Ldo;")
    public class106 method1893(class115 arg0) {
        this.field1597 = arg0.method2002(this.field1597);
        this.field1598 = arg0.method2003(this.field1598);
        if (this.field1599 == this.field1596) {
            this.field1599 = this.field1596 = arg0.method2011(this.field1599);
        } else {
            this.field1599 = arg0.method2011(this.field1599);
            this.field1596 = arg0.method2011(this.field1596);
            if (this.field1599 == this.field1596) {
                this.field1599--;
            }
        }
        return this;
    }
}
