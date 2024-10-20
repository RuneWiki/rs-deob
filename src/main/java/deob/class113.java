package deob;

@ObfuscatedName("df")
public class class113 extends class128 {

    @ObfuscatedName("df.h")
    public int field1408;

    @ObfuscatedName("df.v")
    public byte[] field1406;

    @ObfuscatedName("df.x")
    public int field1405;

    @ObfuscatedName("df.w")
    public int field1407;

    @ObfuscatedName("df.t")
    public boolean field1409;

    public class113(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1408 = arg0;
        this.field1406 = arg1;
        this.field1405 = arg2;
        this.field1407 = arg3;
    }

    public class113(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1408 = arg0;
        this.field1406 = arg1;
        this.field1405 = arg2;
        this.field1407 = arg3;
        this.field1409 = arg4;
    }

    @ObfuscatedName("df.h(Ldn;)Ldf;")
    public class113 method2286(class122 arg0) {
        this.field1406 = arg0.method2396(this.field1406);
        this.field1408 = arg0.method2398(this.field1408);
        if (this.field1407 == this.field1405) {
            this.field1405 = this.field1407 = arg0.method2403(this.field1405);
        } else {
            this.field1405 = arg0.method2403(this.field1405);
            this.field1407 = arg0.method2403(this.field1407);
            if (this.field1407 == this.field1405) {
                this.field1405--;
            }
        }
        return this;
    }
}
