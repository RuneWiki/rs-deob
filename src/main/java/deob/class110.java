package deob;

@ObfuscatedName("dv")
public class class110 extends class125 {

    @ObfuscatedName("dv.d")
    public int field1600;

    @ObfuscatedName("dv.q")
    public byte[] field1599;

    @ObfuscatedName("dv.x")
    public int field1598;

    @ObfuscatedName("dv.y")
    public int field1601;

    @ObfuscatedName("dv.e")
    public boolean field1602;

    public class110(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1600 = arg0;
        this.field1599 = arg1;
        this.field1598 = arg2;
        this.field1601 = arg3;
    }

    public class110(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1600 = arg0;
        this.field1599 = arg1;
        this.field1598 = arg2;
        this.field1601 = arg3;
        this.field1602 = arg4;
    }

    @ObfuscatedName("dv.d(Lde;)Ldv;")
    public class110 method1881(class119 arg0) {
        this.field1599 = arg0.method1989(this.field1599);
        this.field1600 = arg0.method1990(this.field1600);
        if (this.field1601 == this.field1598) {
            this.field1598 = this.field1601 = arg0.method1997(this.field1598);
        } else {
            this.field1598 = arg0.method1997(this.field1598);
            this.field1601 = arg0.method1997(this.field1601);
            if (this.field1601 == this.field1598) {
                this.field1598--;
            }
        }
        return this;
    }
}
