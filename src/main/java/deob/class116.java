package deob;

@ObfuscatedName("dw")
public class class116 {

    @ObfuscatedName("dw.z")
    public int field1454 = 2;

    @ObfuscatedName("dw.k")
    public int[] field1455 = new int[2];

    @ObfuscatedName("dw.s")
    public int[] field1463 = new int[2];

    @ObfuscatedName("dw.t")
    public int field1456;

    @ObfuscatedName("dw.i")
    public int field1457;

    @ObfuscatedName("dw.o")
    public int field1460;

    @ObfuscatedName("dw.w")
    public int field1459;

    @ObfuscatedName("dw.g")
    public int field1453;

    @ObfuscatedName("dw.m")
    public int field1461;

    @ObfuscatedName("dw.n")
    public int field1462;

    @ObfuscatedName("dw.d")
    public int field1458;

    public class116() {
        this.field1455[0] = 0;
        this.field1455[1] = 65535;
        this.field1463[0] = 0;
        this.field1463[1] = 65535;
    }

    @ObfuscatedName("dw.z(Lkf;)V")
    public final void method2364(class310 arg0) {
        this.field1460 = arg0.method5193();
        this.field1456 = arg0.method5270();
        this.field1457 = arg0.method5270();
        this.method2366(arg0);
    }

    @ObfuscatedName("dw.k(Lkf;)V")
    public final void method2366(class310 arg0) {
        this.field1454 = arg0.method5193();
        this.field1455 = new int[this.field1454];
        this.field1463 = new int[this.field1454];
        for (int var2 = 0; var2 < this.field1454; var2++) {
            this.field1455[var2] = arg0.method5195();
            this.field1463[var2] = arg0.method5195();
        }
    }

    @ObfuscatedName("dw.s()V")
    public final void method2365() {
        this.field1459 = 0;
        this.field1453 = 0;
        this.field1461 = 0;
        this.field1462 = 0;
        this.field1458 = 0;
    }

    @ObfuscatedName("dw.t(I)I")
    public final int method2368(int arg0) {
        if (this.field1458 >= this.field1459) {
            this.field1462 = this.field1463[this.field1453++] << 15;
            if (this.field1453 >= this.field1454) {
                this.field1453 = this.field1454 - 1;
            }
            this.field1459 = (int) ((double) this.field1455[this.field1453] / 65536.0D * (double) arg0);
            if (this.field1459 > this.field1458) {
                this.field1461 = ((this.field1463[this.field1453] << 15) - this.field1462) / (this.field1459 - this.field1458);
            }
        }
        this.field1462 += this.field1461;
        this.field1458++;
        return this.field1462 - this.field1461 >> 15;
    }
}
