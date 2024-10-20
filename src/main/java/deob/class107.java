package deob;

@ObfuscatedName("dz")
public class class107 extends class122 {

    @ObfuscatedName("dz.s")
    public int field1525;

    @ObfuscatedName("dz.g")
    public byte[] field1527;

    @ObfuscatedName("dz.m")
    public int field1526;

    @ObfuscatedName("dz.h")
    public int field1528;

    @ObfuscatedName("dz.i")
    public boolean field1529;

    public class107(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1525 = arg0;
        this.field1527 = arg1;
        this.field1526 = arg2;
        this.field1528 = arg3;
    }

    public class107(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1525 = arg0;
        this.field1527 = arg1;
        this.field1526 = arg2;
        this.field1528 = arg3;
        this.field1529 = arg4;
    }

    @ObfuscatedName("dz.s(Ldg;)Ldz;")
    public class107 method2092(class116 arg0) {
        this.field1527 = arg0.method2216(this.field1527);
        this.field1525 = arg0.method2217(this.field1525);
        if (this.field1528 == this.field1526) {
            this.field1526 = this.field1528 = arg0.method2206(this.field1526);
        } else {
            this.field1526 = arg0.method2206(this.field1526);
            this.field1528 = arg0.method2206(this.field1528);
            if (this.field1528 == this.field1526) {
                this.field1526--;
            }
        }
        return this;
    }
}
