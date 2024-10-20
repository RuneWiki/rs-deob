package deob;

@ObfuscatedName("dx")
public class class108 extends class123 {

    @ObfuscatedName("dx.i")
    public int field1606;

    @ObfuscatedName("dx.h")
    public byte[] field1603;

    @ObfuscatedName("dx.u")
    public int field1604;

    @ObfuscatedName("dx.q")
    public int field1605;

    @ObfuscatedName("dx.g")
    public boolean field1602;

    public class108(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1606 = arg0;
        this.field1603 = arg1;
        this.field1604 = arg2;
        this.field1605 = arg3;
    }

    public class108(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1606 = arg0;
        this.field1603 = arg1;
        this.field1604 = arg2;
        this.field1605 = arg3;
        this.field1602 = arg4;
    }

    @ObfuscatedName("dx.i(Ldh;)Ldx;")
    public class108 method1860(class117 arg0) {
        this.field1603 = arg0.method1964(this.field1603);
        this.field1606 = arg0.method1965(this.field1606);
        if (this.field1605 == this.field1604) {
            this.field1604 = this.field1605 = arg0.method1966(this.field1604);
        } else {
            this.field1604 = arg0.method1966(this.field1604);
            this.field1605 = arg0.method1966(this.field1605);
            if (this.field1605 == this.field1604) {
                this.field1604--;
            }
        }
        return this;
    }
}
