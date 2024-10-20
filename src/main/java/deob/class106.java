package deob;

@ObfuscatedName("di")
public class class106 extends class121 {

    @ObfuscatedName("di.w")
    public int field1603;

    @ObfuscatedName("di.s")
    public byte[] field1601;

    @ObfuscatedName("di.q")
    public int field1600;

    @ObfuscatedName("di.o")
    public int field1602;

    @ObfuscatedName("di.g")
    public boolean field1604;

    public class106(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1603 = arg0;
        this.field1601 = arg1;
        this.field1600 = arg2;
        this.field1602 = arg3;
    }

    public class106(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1603 = arg0;
        this.field1601 = arg1;
        this.field1600 = arg2;
        this.field1602 = arg3;
        this.field1604 = arg4;
    }

    @ObfuscatedName("di.w(Ldx;)Ldi;")
    public class106 method1882(class115 arg0) {
        this.field1601 = arg0.method1993(this.field1601);
        this.field1603 = arg0.method1994(this.field1603);
        if (this.field1602 == this.field1600) {
            this.field1600 = this.field1602 = arg0.method1997(this.field1600);
        } else {
            this.field1600 = arg0.method1997(this.field1600);
            this.field1602 = arg0.method1997(this.field1602);
            if (this.field1602 == this.field1600) {
                this.field1600--;
            }
        }
        return this;
    }
}
