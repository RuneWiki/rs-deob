package deob;

@ObfuscatedName("cg")
public class class104 extends class119 {

    @ObfuscatedName("cg.c")
    public int field1356;

    @ObfuscatedName("cg.x")
    public byte[] field1357;

    @ObfuscatedName("cg.t")
    public int field1355;

    @ObfuscatedName("cg.g")
    public int field1358;

    @ObfuscatedName("cg.l")
    public boolean field1359;

    public class104(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1356 = arg0;
        this.field1357 = arg1;
        this.field1355 = arg2;
        this.field1358 = arg3;
    }

    public class104(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1356 = arg0;
        this.field1357 = arg1;
        this.field1355 = arg2;
        this.field1358 = arg3;
        this.field1359 = arg4;
    }

    @ObfuscatedName("cg.c(Lde;)Lcg;")
    public class104 method2215(class113 arg0) {
        this.field1357 = arg0.method2315(this.field1357);
        this.field1356 = arg0.method2316(this.field1356);
        if (this.field1358 == this.field1355) {
            this.field1355 = this.field1358 = arg0.method2327(this.field1355);
        } else {
            this.field1355 = arg0.method2327(this.field1355);
            this.field1358 = arg0.method2327(this.field1358);
            if (this.field1358 == this.field1355) {
                this.field1355--;
            }
        }
        return this;
    }
}
