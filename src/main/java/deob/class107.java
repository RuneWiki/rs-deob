package deob;

@ObfuscatedName("dp")
public class class107 extends class122 {

    @ObfuscatedName("dp.n")
    public int field1524;

    @ObfuscatedName("dp.v")
    public byte[] field1523;

    @ObfuscatedName("dp.y")
    public int field1522;

    @ObfuscatedName("dp.r")
    public int field1525;

    @ObfuscatedName("dp.h")
    public boolean field1526;

    public class107(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1524 = arg0;
        this.field1523 = arg1;
        this.field1522 = arg2;
        this.field1525 = arg3;
    }

    public class107(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1524 = arg0;
        this.field1523 = arg1;
        this.field1522 = arg2;
        this.field1525 = arg3;
        this.field1526 = arg4;
    }

    @ObfuscatedName("dp.n(Ldc;)Ldp;")
    public class107 method1874(class116 arg0) {
        this.field1523 = arg0.method1991(this.field1523);
        this.field1524 = arg0.method1987(this.field1524);
        if (this.field1525 == this.field1522) {
            this.field1522 = this.field1525 = arg0.method1986(this.field1522);
        } else {
            this.field1522 = arg0.method1986(this.field1522);
            this.field1525 = arg0.method1986(this.field1525);
            if (this.field1525 == this.field1522) {
                this.field1522--;
            }
        }
        return this;
    }
}
