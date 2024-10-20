package deob;

@ObfuscatedName("dx")
public class class107 extends class122 {

    @ObfuscatedName("dx.a")
    public int field1512;

    @ObfuscatedName("dx.w")
    public byte[] field1510;

    @ObfuscatedName("dx.e")
    public int field1511;

    @ObfuscatedName("dx.k")
    public int field1509;

    @ObfuscatedName("dx.u")
    public boolean field1513;

    public class107(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1512 = arg0;
        this.field1510 = arg1;
        this.field1511 = arg2;
        this.field1509 = arg3;
    }

    public class107(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1512 = arg0;
        this.field1510 = arg1;
        this.field1511 = arg2;
        this.field1509 = arg3;
        this.field1513 = arg4;
    }

    @ObfuscatedName("dx.a(Ldz;)Ldx;")
    public class107 method1821(class116 arg0) {
        this.field1510 = arg0.method1920(this.field1510);
        this.field1512 = arg0.method1927(this.field1512);
        if (this.field1511 == this.field1509) {
            this.field1511 = this.field1509 = arg0.method1922(this.field1511);
        } else {
            this.field1511 = arg0.method1922(this.field1511);
            this.field1509 = arg0.method1922(this.field1509);
            if (this.field1511 == this.field1509) {
                this.field1511--;
            }
        }
        return this;
    }
}
