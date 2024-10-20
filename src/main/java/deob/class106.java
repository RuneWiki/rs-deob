package deob;

@ObfuscatedName("dd")
public class class106 extends class121 {

    @ObfuscatedName("dd.d")
    public int field1535;

    @ObfuscatedName("dd.z")
    public byte[] field1533;

    @ObfuscatedName("dd.n")
    public int field1534;

    @ObfuscatedName("dd.r")
    public int field1532;

    @ObfuscatedName("dd.e")
    public boolean field1536;

    public class106(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1535 = arg0;
        this.field1533 = arg1;
        this.field1534 = arg2;
        this.field1532 = arg3;
    }

    public class106(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1535 = arg0;
        this.field1533 = arg1;
        this.field1534 = arg2;
        this.field1532 = arg3;
        this.field1536 = arg4;
    }

    @ObfuscatedName("dd.d(Ldn;)Ldd;")
    public class106 method2050(class115 arg0) {
        this.field1533 = arg0.method2164(this.field1533);
        this.field1535 = arg0.method2161(this.field1535);
        if (this.field1534 == this.field1532) {
            this.field1534 = this.field1532 = arg0.method2162(this.field1534);
        } else {
            this.field1534 = arg0.method2162(this.field1534);
            this.field1532 = arg0.method2162(this.field1532);
            if (this.field1534 == this.field1532) {
                this.field1534--;
            }
        }
        return this;
    }
}
