package deob;

@ObfuscatedName("cc")
public class class102 extends class117 {

    @ObfuscatedName("cc.f")
    public int field1356;

    @ObfuscatedName("cc.i")
    public byte[] field1352;

    @ObfuscatedName("cc.y")
    public int field1354;

    @ObfuscatedName("cc.w")
    public int field1355;

    @ObfuscatedName("cc.p")
    public boolean field1353;

    public class102(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1356 = arg0;
        this.field1352 = arg1;
        this.field1354 = arg2;
        this.field1355 = arg3;
    }

    public class102(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1356 = arg0;
        this.field1352 = arg1;
        this.field1354 = arg2;
        this.field1355 = arg3;
        this.field1353 = arg4;
    }

    @ObfuscatedName("cc.f(Ldr;)Lcc;")
    public class102 method2203(class111 arg0) {
        this.field1352 = arg0.method2315(this.field1352);
        this.field1356 = arg0.method2317(this.field1356);
        if (this.field1355 == this.field1354) {
            this.field1354 = this.field1355 = arg0.method2318(this.field1354);
        } else {
            this.field1354 = arg0.method2318(this.field1354);
            this.field1355 = arg0.method2318(this.field1355);
            if (this.field1355 == this.field1354) {
                this.field1354--;
            }
        }
        return this;
    }
}
