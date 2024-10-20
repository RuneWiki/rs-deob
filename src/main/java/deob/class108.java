package deob;

@ObfuscatedName("di")
public class class108 extends class123 {

    @ObfuscatedName("di.i")
    public int field1623;

    @ObfuscatedName("di.c")
    public byte[] field1621;

    @ObfuscatedName("di.e")
    public int field1622;

    @ObfuscatedName("di.v")
    public int field1624;

    @ObfuscatedName("di.b")
    public boolean field1625;

    public class108(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1623 = arg0;
        this.field1621 = arg1;
        this.field1622 = arg2;
        this.field1624 = arg3;
    }

    public class108(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1623 = arg0;
        this.field1621 = arg1;
        this.field1622 = arg2;
        this.field1624 = arg3;
        this.field1625 = arg4;
    }

    @ObfuscatedName("di.i(Ldc;)Ldi;")
    public class108 method1834(class117 arg0) {
        this.field1621 = arg0.method1924(this.field1621);
        this.field1623 = arg0.method1923(this.field1623);
        if (this.field1624 == this.field1622) {
            this.field1622 = this.field1624 = arg0.method1926(this.field1622);
        } else {
            this.field1622 = arg0.method1926(this.field1622);
            this.field1624 = arg0.method1926(this.field1624);
            if (this.field1624 == this.field1622) {
                this.field1622--;
            }
        }
        return this;
    }
}
