package deob;

@ObfuscatedName("di")
public class class111 {

    @ObfuscatedName("di.p")
    public int field1655 = 2;

    @ObfuscatedName("di.m")
    public int[] field1649 = new int[2];

    @ObfuscatedName("di.e")
    public int[] field1650 = new int[2];

    @ObfuscatedName("di.t")
    public int field1653;

    @ObfuscatedName("di.w")
    public int field1652;

    @ObfuscatedName("di.z")
    public int field1651;

    @ObfuscatedName("di.j")
    public int field1654;

    @ObfuscatedName("di.i")
    public int field1648;

    @ObfuscatedName("di.f")
    public int field1656;

    @ObfuscatedName("di.c")
    public int field1657;

    @ObfuscatedName("di.o")
    public int field1658;

    public class111() {
        this.field1649[0] = 0;
        this.field1649[1] = 65535;
        this.field1650[0] = 0;
        this.field1650[1] = 65535;
    }

    @ObfuscatedName("di.p(Lfr;)V")
    public final void method1837(class174 arg0) {
        this.field1651 = arg0.method2810();
        this.field1653 = arg0.method2803();
        this.field1652 = arg0.method2803();
        this.method1846(arg0);
    }

    @ObfuscatedName("di.m(Lfr;)V")
    public final void method1846(class174 arg0) {
        this.field1655 = arg0.method2810();
        this.field1649 = new int[this.field1655];
        this.field1650 = new int[this.field1655];
        for (int var2 = 0; var2 < this.field1655; var2++) {
            this.field1649[var2] = arg0.method2824();
            this.field1650[var2] = arg0.method2824();
        }
    }

    @ObfuscatedName("di.e()V")
    public final void method1839() {
        this.field1654 = 0;
        this.field1648 = 0;
        this.field1656 = 0;
        this.field1657 = 0;
        this.field1658 = 0;
    }

    @ObfuscatedName("di.t(I)I")
    public final int method1840(int arg0) {
        if (this.field1658 >= this.field1654) {
            this.field1657 = this.field1650[this.field1648++] << 15;
            if (this.field1648 >= this.field1655) {
                this.field1648 = this.field1655 - 1;
            }
            this.field1654 = (int) ((double) this.field1649[this.field1648] / 65536.0D * (double) arg0);
            if (this.field1654 > this.field1658) {
                this.field1656 = ((this.field1650[this.field1648] << 15) - this.field1657) / (this.field1654 - this.field1658);
            }
        }
        this.field1657 += this.field1656;
        this.field1658++;
        return this.field1657 - this.field1656 >> 15;
    }
}
