package deob;

@ObfuscatedName("dv")
public class class111 {

    @ObfuscatedName("dv.i")
    public int field1640 = 2;

    @ObfuscatedName("dv.h")
    public int[] field1650 = new int[2];

    @ObfuscatedName("dv.u")
    public int[] field1641 = new int[2];

    @ObfuscatedName("dv.q")
    public int field1643;

    @ObfuscatedName("dv.g")
    public int field1644;

    @ObfuscatedName("dv.v")
    public int field1645;

    @ObfuscatedName("dv.t")
    public int field1646;

    @ObfuscatedName("dv.p")
    public int field1647;

    @ObfuscatedName("dv.l")
    public int field1642;

    @ObfuscatedName("dv.a")
    public int field1648;

    @ObfuscatedName("dv.k")
    public int field1649;

    public class111() {
        this.field1650[0] = 0;
        this.field1650[1] = 65535;
        this.field1641[0] = 0;
        this.field1641[1] = 65535;
    }

    @ObfuscatedName("dv.i(Lfv;)V")
    public final void method1923(class174 arg0) {
        this.field1645 = arg0.method2930();
        this.field1643 = arg0.method2927();
        this.field1644 = arg0.method2927();
        this.method1924(arg0);
    }

    @ObfuscatedName("dv.h(Lfv;)V")
    public final void method1924(class174 arg0) {
        this.field1640 = arg0.method2930();
        this.field1650 = new int[this.field1640];
        this.field1641 = new int[this.field1640];
        for (int var2 = 0; var2 < this.field1640; var2++) {
            this.field1650[var2] = arg0.method2932();
            this.field1641[var2] = arg0.method2932();
        }
    }

    @ObfuscatedName("dv.u()V")
    public final void method1925() {
        this.field1646 = 0;
        this.field1647 = 0;
        this.field1642 = 0;
        this.field1648 = 0;
        this.field1649 = 0;
    }

    @ObfuscatedName("dv.q(I)I")
    public final int method1931(int arg0) {
        if (this.field1649 >= this.field1646) {
            this.field1648 = this.field1641[this.field1647++] << 15;
            if (this.field1647 >= this.field1640) {
                this.field1647 = this.field1640 - 1;
            }
            this.field1646 = (int) ((double) this.field1650[this.field1647] / 65536.0D * (double) arg0);
            if (this.field1646 > this.field1649) {
                this.field1642 = ((this.field1641[this.field1647] << 15) - this.field1648) / (this.field1646 - this.field1649);
            }
        }
        this.field1648 += this.field1642;
        this.field1649++;
        return this.field1648 - this.field1642 >> 15;
    }
}
