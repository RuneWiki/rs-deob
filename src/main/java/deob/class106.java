package deob;

@ObfuscatedName("dp")
public class class106 extends class121 {

    @ObfuscatedName("dp.o")
    public int field1547;

    @ObfuscatedName("dp.k")
    public byte[] field1546;

    @ObfuscatedName("dp.t")
    public int field1548;

    @ObfuscatedName("dp.d")
    public int field1545;

    @ObfuscatedName("dp.h")
    public boolean field1549;

    public class106(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1547 = arg0;
        this.field1546 = arg1;
        this.field1548 = arg2;
        this.field1545 = arg3;
    }

    public class106(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1547 = arg0;
        this.field1546 = arg1;
        this.field1548 = arg2;
        this.field1545 = arg3;
        this.field1549 = arg4;
    }

    @ObfuscatedName("dp.o(Ldq;)Ldp;")
    public class106 method1995(class115 arg0) {
        this.field1546 = arg0.method2106(this.field1546);
        this.field1547 = arg0.method2107(this.field1547);
        if (this.field1548 == this.field1545) {
            this.field1548 = this.field1545 = arg0.method2108(this.field1548);
        } else {
            this.field1548 = arg0.method2108(this.field1548);
            this.field1545 = arg0.method2108(this.field1545);
            if (this.field1548 == this.field1545) {
                this.field1548--;
            }
        }
        return this;
    }
}
