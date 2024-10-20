package deob;

@ObfuscatedName("dx")
public class class107 {

    @ObfuscatedName("dx.u")
    public int field1421 = 2;

    @ObfuscatedName("dx.f")
    public int[] field1416 = new int[2];

    @ObfuscatedName("dx.b")
    public int[] field1417 = new int[2];

    @ObfuscatedName("dx.g")
    public int field1415;

    @ObfuscatedName("dx.z")
    public int field1425;

    @ObfuscatedName("dx.p")
    public int field1420;

    @ObfuscatedName("dx.h")
    public int field1423;

    @ObfuscatedName("dx.y")
    public int field1418;

    @ObfuscatedName("dx.w")
    public int field1422;

    @ObfuscatedName("dx.i")
    public int field1419;

    @ObfuscatedName("dx.k")
    public int field1424;

    public class107() {
        this.field1416[0] = 0;
        this.field1416[1] = 65535;
        this.field1417[0] = 0;
        this.field1417[1] = 65535;
    }

    @ObfuscatedName("dx.u(Lkg;)V")
    public final void method2282(class300 arg0) {
        this.field1420 = arg0.method5138();
        this.field1415 = arg0.method5277();
        this.field1425 = arg0.method5277();
        this.method2288(arg0);
    }

    @ObfuscatedName("dx.f(Lkg;)V")
    public final void method2288(class300 arg0) {
        this.field1421 = arg0.method5138();
        this.field1416 = new int[this.field1421];
        this.field1417 = new int[this.field1421];
        for (int var2 = 0; var2 < this.field1421; var2++) {
            this.field1416[var2] = arg0.method5337();
            this.field1417[var2] = arg0.method5337();
        }
    }

    @ObfuscatedName("dx.b()V")
    public final void method2284() {
        this.field1423 = 0;
        this.field1422 = 0;
        this.field1419 = 0;
        this.field1424 = 0;
        this.field1418 = 0;
    }

    @ObfuscatedName("dx.g(I)I")
    public final int method2285(int arg0) {
        if (this.field1418 >= this.field1423) {
            this.field1424 = this.field1417[this.field1422++] << 15;
            if (this.field1422 >= this.field1421) {
                this.field1422 = this.field1421 - 1;
            }
            this.field1423 = (int) ((double) this.field1416[this.field1422] / 65536.0D * (double) arg0);
            if (this.field1423 > this.field1418) {
                this.field1419 = ((this.field1417[this.field1422] << 15) - this.field1424) / (this.field1423 - this.field1418);
            }
        }
        this.field1424 += this.field1419;
        this.field1418++;
        return this.field1424 - this.field1419 >> 15;
    }
}
