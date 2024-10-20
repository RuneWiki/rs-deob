package deob;

@ObfuscatedName("da")
public class class106 extends class121 {

    @ObfuscatedName("da.c")
    public int field1537;

    @ObfuscatedName("da.i")
    public byte[] field1536;

    @ObfuscatedName("da.o")
    public int field1538;

    @ObfuscatedName("da.j")
    public int field1539;

    @ObfuscatedName("da.k")
    public boolean field1540;

    public class106(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1537 = arg0;
        this.field1536 = arg1;
        this.field1538 = arg2;
        this.field1539 = arg3;
    }

    public class106(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1537 = arg0;
        this.field1536 = arg1;
        this.field1538 = arg2;
        this.field1539 = arg3;
        this.field1540 = arg4;
    }

    @ObfuscatedName("da.c(Lds;)Lda;")
    public class106 method2007(class115 arg0) {
        this.field1536 = arg0.method2109(this.field1536);
        this.field1537 = arg0.method2110(this.field1537);
        if (this.field1539 == this.field1538) {
            this.field1538 = this.field1539 = arg0.method2114(this.field1538);
        } else {
            this.field1538 = arg0.method2114(this.field1538);
            this.field1539 = arg0.method2114(this.field1539);
            if (this.field1539 == this.field1538) {
                this.field1538--;
            }
        }
        return this;
    }
}
