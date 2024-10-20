package deob;

@ObfuscatedName("dc")
public class class108 extends class123 {

    @ObfuscatedName("dc.p")
    public int field1605;

    @ObfuscatedName("dc.m")
    public byte[] field1606;

    @ObfuscatedName("dc.e")
    public int field1607;

    @ObfuscatedName("dc.t")
    public int field1608;

    @ObfuscatedName("dc.w")
    public boolean field1609;

    public class108(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1605 = arg0;
        this.field1606 = arg1;
        this.field1607 = arg2;
        this.field1608 = arg3;
    }

    public class108(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1605 = arg0;
        this.field1606 = arg1;
        this.field1607 = arg2;
        this.field1608 = arg3;
        this.field1609 = arg4;
    }

    @ObfuscatedName("dc.p(Ldx;)Ldc;")
    public class108 method1763(class117 arg0) {
        this.field1606 = arg0.method1883(this.field1606);
        this.field1605 = arg0.method1882(this.field1605);
        if (this.field1608 == this.field1607) {
            this.field1607 = this.field1608 = arg0.method1884(this.field1607);
        } else {
            this.field1607 = arg0.method1884(this.field1607);
            this.field1608 = arg0.method1884(this.field1608);
            if (this.field1608 == this.field1607) {
                this.field1607--;
            }
        }
        return this;
    }
}
