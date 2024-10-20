package deob;

@ObfuscatedName("ds")
public class class116 {

    @ObfuscatedName("ds.m")
    public int field1463 = 2;

    @ObfuscatedName("ds.o")
    public int[] field1456 = new int[2];

    @ObfuscatedName("ds.q")
    public int[] field1457 = new int[2];

    @ObfuscatedName("ds.j")
    public int field1465;

    @ObfuscatedName("ds.p")
    public int field1459;

    @ObfuscatedName("ds.g")
    public int field1460;

    @ObfuscatedName("ds.n")
    public int field1458;

    @ObfuscatedName("ds.u")
    public int field1462;

    @ObfuscatedName("ds.a")
    public int field1461;

    @ObfuscatedName("ds.z")
    public int field1464;

    @ObfuscatedName("ds.w")
    public int field1455;

    public class116() {
        this.field1456[0] = 0;
        this.field1456[1] = 65535;
        this.field1457[0] = 0;
        this.field1457[1] = 65535;
    }

    @ObfuscatedName("ds.m(Lkn;)V")
    public final void method2362(class310 arg0) {
        this.field1460 = arg0.method5227();
        this.field1465 = arg0.method5209();
        this.field1459 = arg0.method5209();
        this.method2370(arg0);
    }

    @ObfuscatedName("ds.o(Lkn;)V")
    public final void method2370(class310 arg0) {
        this.field1463 = arg0.method5227();
        this.field1456 = new int[this.field1463];
        this.field1457 = new int[this.field1463];
        for (int var2 = 0; var2 < this.field1463; var2++) {
            this.field1456[var2] = arg0.method5283();
            this.field1457[var2] = arg0.method5283();
        }
    }

    @ObfuscatedName("ds.q()V")
    public final void method2364() {
        this.field1458 = 0;
        this.field1462 = 0;
        this.field1461 = 0;
        this.field1464 = 0;
        this.field1455 = 0;
    }

    @ObfuscatedName("ds.j(I)I")
    public final int method2367(int arg0) {
        if (this.field1455 >= this.field1458) {
            this.field1464 = this.field1457[this.field1462++] << 15;
            if (this.field1462 >= this.field1463) {
                this.field1462 = this.field1463 - 1;
            }
            this.field1458 = (int) ((double) this.field1456[this.field1462] / 65536.0D * (double) arg0);
            if (this.field1458 > this.field1455) {
                this.field1461 = ((this.field1457[this.field1462] << 15) - this.field1464) / (this.field1458 - this.field1455);
            }
        }
        this.field1464 += this.field1461;
        this.field1455++;
        return this.field1464 - this.field1461 >> 15;
    }
}
