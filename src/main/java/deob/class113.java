package deob;

@ObfuscatedName("dm")
public class class113 extends class128 {

    @ObfuscatedName("dm.n")
    public int field1402;

    @ObfuscatedName("dm.v")
    public byte[] field1401;

    @ObfuscatedName("dm.d")
    public int field1403;

    @ObfuscatedName("dm.c")
    public int field1404;

    @ObfuscatedName("dm.y")
    public boolean field1405;

    public class113(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1402 = arg0;
        this.field1401 = arg1;
        this.field1403 = arg2;
        this.field1404 = arg3;
    }

    public class113(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1402 = arg0;
        this.field1401 = arg1;
        this.field1403 = arg2;
        this.field1404 = arg3;
        this.field1405 = arg4;
    }

    @ObfuscatedName("dm.n(Ldq;)Ldm;")
    public class113 method2397(class122 arg0) {
        this.field1401 = arg0.method2493(this.field1401);
        this.field1402 = arg0.method2494(this.field1402);
        if (this.field1404 == this.field1403) {
            this.field1403 = this.field1404 = arg0.method2495(this.field1403);
        } else {
            this.field1403 = arg0.method2495(this.field1403);
            this.field1404 = arg0.method2495(this.field1404);
            if (this.field1404 == this.field1403) {
                this.field1403--;
            }
        }
        return this;
    }
}
