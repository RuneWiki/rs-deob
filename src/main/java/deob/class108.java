package deob;

@ObfuscatedName("dl")
public class class108 extends class123 {

    @ObfuscatedName("dl.s")
    public int field1605;

    @ObfuscatedName("dl.c")
    public byte[] field1603;

    @ObfuscatedName("dl.f")
    public int field1604;

    @ObfuscatedName("dl.m")
    public int field1606;

    @ObfuscatedName("dl.h")
    public boolean field1607;

    public class108(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1605 = arg0;
        this.field1603 = arg1;
        this.field1604 = arg2;
        this.field1606 = arg3;
    }

    public class108(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1605 = arg0;
        this.field1603 = arg1;
        this.field1604 = arg2;
        this.field1606 = arg3;
        this.field1607 = arg4;
    }

    @ObfuscatedName("dl.s(Ldp;)Ldl;")
    public class108 method1864(class117 arg0) {
        this.field1603 = arg0.method1972(this.field1603);
        this.field1605 = arg0.method1973(this.field1605);
        if (this.field1606 == this.field1604) {
            this.field1604 = this.field1606 = arg0.method1974(this.field1604);
        } else {
            this.field1604 = arg0.method1974(this.field1604);
            this.field1606 = arg0.method1974(this.field1606);
            if (this.field1606 == this.field1604) {
                this.field1604--;
            }
        }
        return this;
    }
}
