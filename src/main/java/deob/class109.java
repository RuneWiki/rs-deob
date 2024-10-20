package deob;

@ObfuscatedName("da")
public class class109 {

    @ObfuscatedName("da.g")
    public int field1560 = 2;

    @ObfuscatedName("da.e")
    public int[] field1558 = new int[2];

    @ObfuscatedName("da.b")
    public int[] field1565 = new int[2];

    @ObfuscatedName("da.z")
    public int field1559;

    @ObfuscatedName("da.n")
    public int field1561;

    @ObfuscatedName("da.l")
    public int field1562;

    @ObfuscatedName("da.s")
    public int field1563;

    @ObfuscatedName("da.y")
    public int field1567;

    @ObfuscatedName("da.c")
    public int field1564;

    @ObfuscatedName("da.h")
    public int field1557;

    @ObfuscatedName("da.i")
    public int field1566;

    public class109() {
        this.field1558[0] = 0;
        this.field1558[1] = 65535;
        this.field1565[0] = 0;
        this.field1565[1] = 65535;
    }

    @ObfuscatedName("da.g(Lgg;)V")
    public final void method2193(class195 arg0) {
        this.field1562 = arg0.method3332();
        this.field1559 = arg0.method3472();
        this.field1561 = arg0.method3472();
        this.method2194(arg0);
    }

    @ObfuscatedName("da.e(Lgg;)V")
    public final void method2194(class195 arg0) {
        this.field1560 = arg0.method3332();
        this.field1558 = new int[this.field1560];
        this.field1565 = new int[this.field1560];
        for (int var2 = 0; var2 < this.field1560; var2++) {
            this.field1558[var2] = arg0.method3310();
            this.field1565[var2] = arg0.method3310();
        }
    }

    @ObfuscatedName("da.b()V")
    public final void method2196() {
        this.field1563 = 0;
        this.field1564 = 0;
        this.field1557 = 0;
        this.field1566 = 0;
        this.field1567 = 0;
    }

    @ObfuscatedName("da.z(I)I")
    public final int method2195(int arg0) {
        if (this.field1567 >= this.field1563) {
            this.field1566 = this.field1565[this.field1564++] << 15;
            if (this.field1564 >= this.field1560) {
                this.field1564 = this.field1560 - 1;
            }
            this.field1563 = (int) ((double) this.field1558[this.field1564] / 65536.0D * (double) arg0);
            if (this.field1563 > this.field1567) {
                this.field1557 = ((this.field1565[this.field1564] << 15) - this.field1566) / (this.field1563 - this.field1567);
            }
        }
        this.field1566 += this.field1557;
        this.field1567++;
        return this.field1566 - this.field1557 >> 15;
    }
}
