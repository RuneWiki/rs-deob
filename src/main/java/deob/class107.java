package deob;

@ObfuscatedName("de")
public class class107 extends class122 {

    @ObfuscatedName("de.m")
    public int field1529;

    @ObfuscatedName("de.p")
    public byte[] field1528;

    @ObfuscatedName("de.i")
    public int field1530;

    @ObfuscatedName("de.j")
    public int field1531;

    @ObfuscatedName("de.v")
    public boolean field1532;

    public class107(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1529 = arg0;
        this.field1528 = arg1;
        this.field1530 = arg2;
        this.field1531 = arg3;
    }

    public class107(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1529 = arg0;
        this.field1528 = arg1;
        this.field1530 = arg2;
        this.field1531 = arg3;
        this.field1532 = arg4;
    }

    @ObfuscatedName("de.m(Ldf;)Lde;")
    public class107 method1908(class116 arg0) {
        this.field1528 = arg0.method2012(this.field1528);
        this.field1529 = arg0.method2011(this.field1529);
        if (this.field1531 == this.field1530) {
            this.field1530 = this.field1531 = arg0.method2017(this.field1530);
        } else {
            this.field1530 = arg0.method2017(this.field1530);
            this.field1531 = arg0.method2017(this.field1531);
            if (this.field1531 == this.field1530) {
                this.field1530--;
            }
        }
        return this;
    }
}
