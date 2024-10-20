package deob;

@ObfuscatedName("da")
public class class116 {

    @ObfuscatedName("da.f")
    public int field1465 = 2;

    @ObfuscatedName("da.b")
    public int[] field1460 = new int[2];

    @ObfuscatedName("da.l")
    public int[] field1461 = new int[2];

    @ObfuscatedName("da.m")
    public int field1459;

    @ObfuscatedName("da.z")
    public int field1462;

    @ObfuscatedName("da.q")
    public int field1463;

    @ObfuscatedName("da.k")
    public int field1464;

    @ObfuscatedName("da.c")
    public int field1458;

    @ObfuscatedName("da.u")
    public int field1466;

    @ObfuscatedName("da.t")
    public int field1467;

    @ObfuscatedName("da.e")
    public int field1468;

    public class116() {
        this.field1460[0] = 0;
        this.field1460[1] = 65535;
        this.field1461[0] = 0;
        this.field1461[1] = 65535;
    }

    @ObfuscatedName("da.f(Lkb;)V")
    public final void method2398(class311 arg0) {
        this.field1463 = arg0.method5276();
        this.field1459 = arg0.method5330();
        this.field1462 = arg0.method5330();
        this.method2390(arg0);
    }

    @ObfuscatedName("da.b(Lkb;)V")
    public final void method2390(class311 arg0) {
        this.field1465 = arg0.method5276();
        this.field1460 = new int[this.field1465];
        this.field1461 = new int[this.field1465];
        for (int var2 = 0; var2 < this.field1465; var2++) {
            this.field1460[var2] = arg0.method5163();
            this.field1461[var2] = arg0.method5163();
        }
    }

    @ObfuscatedName("da.l()V")
    public final void method2396() {
        this.field1464 = 0;
        this.field1458 = 0;
        this.field1466 = 0;
        this.field1467 = 0;
        this.field1468 = 0;
    }

    @ObfuscatedName("da.m(I)I")
    public final int method2392(int arg0) {
        if (this.field1468 >= this.field1464) {
            this.field1467 = this.field1461[this.field1458++] << 15;
            if (this.field1458 >= this.field1465) {
                this.field1458 = this.field1465 - 1;
            }
            this.field1464 = (int) ((double) this.field1460[this.field1458] / 65536.0D * (double) arg0);
            if (this.field1464 > this.field1468) {
                this.field1466 = ((this.field1461[this.field1458] << 15) - this.field1467) / (this.field1464 - this.field1468);
            }
        }
        this.field1467 += this.field1466;
        this.field1468++;
        return this.field1467 - this.field1466 >> 15;
    }
}
