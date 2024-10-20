package deob;

@ObfuscatedName("dv")
public class class107 {

    @ObfuscatedName("dv.s")
    public int field1402 = 2;

    @ObfuscatedName("dv.j")
    public int[] field1401 = new int[2];

    @ObfuscatedName("dv.i")
    public int[] field1405 = new int[2];

    @ObfuscatedName("dv.k")
    public int field1404;

    @ObfuscatedName("dv.u")
    public int field1407;

    @ObfuscatedName("dv.n")
    public int field1406;

    @ObfuscatedName("dv.t")
    public int field1409;

    @ObfuscatedName("dv.q")
    public int field1408;

    @ObfuscatedName("dv.d")
    public int field1403;

    @ObfuscatedName("dv.f")
    public int field1410;

    @ObfuscatedName("dv.c")
    public int field1411;

    public class107() {
        this.field1401[0] = 0;
        this.field1401[1] = 65535;
        this.field1405[0] = 0;
        this.field1405[1] = 65535;
    }

    @ObfuscatedName("dv.s(Lky;)V")
    public final void method2256(class300 arg0) {
        this.field1406 = arg0.method5179();
        this.field1404 = arg0.method5056();
        this.field1407 = arg0.method5056();
        this.method2261(arg0);
    }

    @ObfuscatedName("dv.j(Lky;)V")
    public final void method2261(class300 arg0) {
        this.field1402 = arg0.method5179();
        this.field1401 = new int[this.field1402];
        this.field1405 = new int[this.field1402];
        for (int var2 = 0; var2 < this.field1402; var2++) {
            this.field1401[var2] = arg0.method5054();
            this.field1405[var2] = arg0.method5054();
        }
    }

    @ObfuscatedName("dv.i()V")
    public final void method2252() {
        this.field1409 = 0;
        this.field1408 = 0;
        this.field1403 = 0;
        this.field1410 = 0;
        this.field1411 = 0;
    }

    @ObfuscatedName("dv.k(I)I")
    public final int method2251(int arg0) {
        if (this.field1411 >= this.field1409) {
            this.field1410 = this.field1405[this.field1408++] << 15;
            if (this.field1408 >= this.field1402) {
                this.field1408 = this.field1402 - 1;
            }
            this.field1409 = (int) ((double) this.field1401[this.field1408] / 65536.0D * (double) arg0);
            if (this.field1409 > this.field1411) {
                this.field1403 = ((this.field1405[this.field1408] << 15) - this.field1410) / (this.field1409 - this.field1411);
            }
        }
        this.field1410 += this.field1403;
        this.field1411++;
        return this.field1410 - this.field1403 >> 15;
    }
}
