package deob;

@ObfuscatedName("dw")
public class class107 {

    @ObfuscatedName("dw.q")
    public int field1429 = 2;

    @ObfuscatedName("dw.w")
    public int[] field1438 = new int[2];

    @ObfuscatedName("dw.e")
    public int[] field1430 = new int[2];

    @ObfuscatedName("dw.p")
    public int field1437;

    @ObfuscatedName("dw.k")
    public int field1432;

    @ObfuscatedName("dw.l")
    public int field1431;

    @ObfuscatedName("dw.b")
    public int field1434;

    @ObfuscatedName("dw.i")
    public int field1435;

    @ObfuscatedName("dw.c")
    public int field1436;

    @ObfuscatedName("dw.f")
    public int field1428;

    @ObfuscatedName("dw.m")
    public int field1433;

    public class107() {
        this.field1438[0] = 0;
        this.field1438[1] = 65535;
        this.field1430[0] = 0;
        this.field1430[1] = 65535;
    }

    @ObfuscatedName("dw.q(Lkf;)V")
    public final void method2245(class301 arg0) {
        this.field1431 = arg0.method5077();
        this.field1437 = arg0.method5072();
        this.field1432 = arg0.method5072();
        this.method2250(arg0);
    }

    @ObfuscatedName("dw.w(Lkf;)V")
    public final void method2250(class301 arg0) {
        this.field1429 = arg0.method5077();
        this.field1438 = new int[this.field1429];
        this.field1430 = new int[this.field1429];
        for (int var2 = 0; var2 < this.field1429; var2++) {
            this.field1438[var2] = arg0.method5069();
            this.field1430[var2] = arg0.method5069();
        }
    }

    @ObfuscatedName("dw.e()V")
    public final void method2247() {
        this.field1434 = 0;
        this.field1435 = 0;
        this.field1436 = 0;
        this.field1428 = 0;
        this.field1433 = 0;
    }

    @ObfuscatedName("dw.p(I)I")
    public final int method2248(int arg0) {
        if (this.field1433 >= this.field1434) {
            this.field1428 = this.field1430[this.field1435++] << 15;
            if (this.field1435 >= this.field1429) {
                this.field1435 = this.field1429 - 1;
            }
            this.field1434 = (int) ((double) this.field1438[this.field1435] / 65536.0D * (double) arg0);
            if (this.field1434 > this.field1433) {
                this.field1436 = ((this.field1430[this.field1435] << 15) - this.field1428) / (this.field1434 - this.field1433);
            }
        }
        this.field1428 += this.field1436;
        this.field1433++;
        return this.field1428 - this.field1436 >> 15;
    }
}
