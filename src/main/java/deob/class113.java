package deob;

@ObfuscatedName("dm")
public class class113 extends class128 {

    @ObfuscatedName("dm.x")
    public int field1407;

    @ObfuscatedName("dm.m")
    public byte[] field1405;

    @ObfuscatedName("dm.k")
    public int field1406;

    @ObfuscatedName("dm.d")
    public int field1404;

    @ObfuscatedName("dm.w")
    public boolean field1408;

    public class113(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1407 = arg0;
        this.field1405 = arg1;
        this.field1406 = arg2;
        this.field1404 = arg3;
    }

    public class113(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1407 = arg0;
        this.field1405 = arg1;
        this.field1406 = arg2;
        this.field1404 = arg3;
        this.field1408 = arg4;
    }

    @ObfuscatedName("dm.x(Ldx;)Ldm;")
    public class113 method2300(class122 arg0) {
        this.field1405 = arg0.method2412(this.field1405);
        this.field1407 = arg0.method2407(this.field1407);
        if (this.field1406 == this.field1404) {
            this.field1406 = this.field1404 = arg0.method2418(this.field1406);
        } else {
            this.field1406 = arg0.method2418(this.field1406);
            this.field1404 = arg0.method2418(this.field1404);
            if (this.field1406 == this.field1404) {
                this.field1406--;
            }
        }
        return this;
    }
}
