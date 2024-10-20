package deob;

@ObfuscatedName("dt")
public class class110 {

    @ObfuscatedName("dt.b")
    public int field1565 = 2;

    @ObfuscatedName("dt.s")
    public int[] field1566 = new int[2];

    @ObfuscatedName("dt.r")
    public int[] field1561 = new int[2];

    @ObfuscatedName("dt.g")
    public int field1562;

    @ObfuscatedName("dt.f")
    public int field1563;

    @ObfuscatedName("dt.u")
    public int field1564;

    @ObfuscatedName("dt.t")
    public int field1560;

    @ObfuscatedName("dt.k")
    public int field1568;

    @ObfuscatedName("dt.n")
    public int field1567;

    @ObfuscatedName("dt.d")
    public int field1559;

    @ObfuscatedName("dt.o")
    public int field1569;

    public class110() {
        this.field1566[0] = 0;
        this.field1566[1] = 65535;
        this.field1561[0] = 0;
        this.field1561[1] = 65535;
    }

    @ObfuscatedName("dt.b(Lfs;)V")
    public final void method1912(class181 arg0) {
        this.field1564 = arg0.method2945();
        this.field1562 = arg0.method2996();
        this.field1563 = arg0.method2996();
        this.method1913(arg0);
    }

    @ObfuscatedName("dt.s(Lfs;)V")
    public final void method1913(class181 arg0) {
        this.field1565 = arg0.method2945();
        this.field1566 = new int[this.field1565];
        this.field1561 = new int[this.field1565];
        for (int var2 = 0; var2 < this.field1565; var2++) {
            this.field1566[var2] = arg0.method3081();
            this.field1561[var2] = arg0.method3081();
        }
    }

    @ObfuscatedName("dt.r()V")
    public final void method1914() {
        this.field1560 = 0;
        this.field1568 = 0;
        this.field1567 = 0;
        this.field1559 = 0;
        this.field1569 = 0;
    }

    @ObfuscatedName("dt.g(I)I")
    public final int method1915(int arg0) {
        if (this.field1569 >= this.field1560) {
            this.field1559 = this.field1561[this.field1568++] << 15;
            if (this.field1568 >= this.field1565) {
                this.field1568 = this.field1565 - 1;
            }
            this.field1560 = (int) ((double) this.field1566[this.field1568] / 65536.0D * (double) arg0);
            if (this.field1560 > this.field1569) {
                this.field1567 = ((this.field1561[this.field1568] << 15) - this.field1559) / (this.field1560 - this.field1569);
            }
        }
        this.field1559 += this.field1567;
        this.field1569++;
        return this.field1559 - this.field1567 >> 15;
    }
}
