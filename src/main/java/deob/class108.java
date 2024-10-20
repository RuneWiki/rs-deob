package deob;

@ObfuscatedName("dv")
public class class108 extends class123 {

    @ObfuscatedName("dv.w")
    public int field1620;

    @ObfuscatedName("dv.o")
    public byte[] field1619;

    @ObfuscatedName("dv.x")
    public int field1622;

    @ObfuscatedName("dv.k")
    public int field1618;

    @ObfuscatedName("dv.f")
    public boolean field1621;

    public class108(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1620 = arg0;
        this.field1619 = arg1;
        this.field1622 = arg2;
        this.field1618 = arg3;
    }

    public class108(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1620 = arg0;
        this.field1619 = arg1;
        this.field1622 = arg2;
        this.field1618 = arg3;
        this.field1621 = arg4;
    }

    @ObfuscatedName("dv.w(Ldx;)Ldv;")
    public class108 method1798(class117 arg0) {
        this.field1619 = arg0.method1899(this.field1619);
        this.field1620 = arg0.method1898(this.field1620);
        if (this.field1622 == this.field1618) {
            this.field1622 = this.field1618 = arg0.method1908(this.field1622);
        } else {
            this.field1622 = arg0.method1908(this.field1622);
            this.field1618 = arg0.method1908(this.field1618);
            if (this.field1622 == this.field1618) {
                this.field1622--;
            }
        }
        return this;
    }
}
