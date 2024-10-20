package deob;

@ObfuscatedName("cv")
public class class104 extends class119 {

    @ObfuscatedName("cv.c")
    public int field1377;

    @ObfuscatedName("cv.t")
    public byte[] field1379;

    @ObfuscatedName("cv.o")
    public int field1378;

    @ObfuscatedName("cv.e")
    public int field1376;

    @ObfuscatedName("cv.i")
    public boolean field1380;

    public class104(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1377 = arg0;
        this.field1379 = arg1;
        this.field1378 = arg2;
        this.field1376 = arg3;
    }

    public class104(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1377 = arg0;
        this.field1379 = arg1;
        this.field1378 = arg2;
        this.field1376 = arg3;
        this.field1380 = arg4;
    }

    @ObfuscatedName("cv.c(Ldj;)Lcv;")
    public class104 method2257(class113 arg0) {
        this.field1379 = arg0.method2370(this.field1379);
        this.field1377 = arg0.method2371(this.field1377);
        if (this.field1378 == this.field1376) {
            this.field1378 = this.field1376 = arg0.method2372(this.field1378);
        } else {
            this.field1378 = arg0.method2372(this.field1378);
            this.field1376 = arg0.method2372(this.field1376);
            if (this.field1378 == this.field1376) {
                this.field1378--;
            }
        }
        return this;
    }
}
