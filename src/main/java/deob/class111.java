package deob;

@ObfuscatedName("dh")
public class class111 {

    @ObfuscatedName("dh.c")
    public int field1617 = 2;

    @ObfuscatedName("dh.o")
    public int[] field1615 = new int[2];

    @ObfuscatedName("dh.i")
    public int[] field1624 = new int[2];

    @ObfuscatedName("dh.u")
    public int field1622;

    @ObfuscatedName("dh.g")
    public int field1618;

    @ObfuscatedName("dh.m")
    public int field1619;

    @ObfuscatedName("dh.s")
    public int field1620;

    @ObfuscatedName("dh.p")
    public int field1621;

    @ObfuscatedName("dh.k")
    public int field1614;

    @ObfuscatedName("dh.r")
    public int field1616;

    @ObfuscatedName("dh.w")
    public int field1623;

    public class111() {
        this.field1615[0] = 0;
        this.field1615[1] = 65535;
        this.field1624[0] = 0;
        this.field1624[1] = 65535;
    }

    @ObfuscatedName("dh.c(Lfp;)V")
    public final void method1843(class174 arg0) {
        this.field1619 = arg0.method2843();
        this.field1622 = arg0.method2987();
        this.field1618 = arg0.method2987();
        this.method1839(arg0);
    }

    @ObfuscatedName("dh.o(Lfp;)V")
    public final void method1839(class174 arg0) {
        this.field1617 = arg0.method2843();
        this.field1615 = new int[this.field1617];
        this.field1624 = new int[this.field1617];
        for (int var2 = 0; var2 < this.field1617; var2++) {
            this.field1615[var2] = arg0.method2861();
            this.field1624[var2] = arg0.method2861();
        }
    }

    @ObfuscatedName("dh.i()V")
    public final void method1849() {
        this.field1620 = 0;
        this.field1621 = 0;
        this.field1614 = 0;
        this.field1616 = 0;
        this.field1623 = 0;
    }

    @ObfuscatedName("dh.u(I)I")
    public final int method1841(int arg0) {
        if (this.field1623 >= this.field1620) {
            this.field1616 = this.field1624[this.field1621++] << 15;
            if (this.field1621 >= this.field1617) {
                this.field1621 = this.field1617 - 1;
            }
            this.field1620 = (int) ((double) this.field1615[this.field1621] / 65536.0D * (double) arg0);
            if (this.field1620 > this.field1623) {
                this.field1614 = ((this.field1624[this.field1621] << 15) - this.field1616) / (this.field1620 - this.field1623);
            }
        }
        this.field1616 += this.field1614;
        this.field1623++;
        return this.field1616 - this.field1614 >> 15;
    }
}
