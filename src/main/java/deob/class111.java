package deob;

@ObfuscatedName("dc")
public class class111 {

    @ObfuscatedName("dc.a")
    public int field1645 = 2;

    @ObfuscatedName("dc.j")
    public int[] field1641 = new int[2];

    @ObfuscatedName("dc.n")
    public int[] field1642 = new int[2];

    @ObfuscatedName("dc.r")
    public int field1650;

    @ObfuscatedName("dc.v")
    public int field1644;

    @ObfuscatedName("dc.e")
    public int field1648;

    @ObfuscatedName("dc.l")
    public int field1646;

    @ObfuscatedName("dc.s")
    public int field1647;

    @ObfuscatedName("dc.w")
    public int field1643;

    @ObfuscatedName("dc.p")
    public int field1649;

    @ObfuscatedName("dc.m")
    public int field1640;

    public class111() {
        this.field1641[0] = 0;
        this.field1641[1] = 65535;
        this.field1642[0] = 0;
        this.field1642[1] = 65535;
    }

    @ObfuscatedName("dc.a(Lfe;)V")
    public final void method1858(class174 arg0) {
        this.field1648 = arg0.method2871();
        this.field1650 = arg0.method2876();
        this.field1644 = arg0.method2876();
        this.method1859(arg0);
    }

    @ObfuscatedName("dc.j(Lfe;)V")
    public final void method1859(class174 arg0) {
        this.field1645 = arg0.method2871();
        this.field1641 = new int[this.field1645];
        this.field1642 = new int[this.field1645];
        for (int var2 = 0; var2 < this.field1645; var2++) {
            this.field1641[var2] = arg0.method2873();
            this.field1642[var2] = arg0.method2873();
        }
    }

    @ObfuscatedName("dc.n()V")
    public final void method1860() {
        this.field1646 = 0;
        this.field1647 = 0;
        this.field1643 = 0;
        this.field1649 = 0;
        this.field1640 = 0;
    }

    @ObfuscatedName("dc.r(I)I")
    public final int method1857(int arg0) {
        if (this.field1640 >= this.field1646) {
            this.field1649 = this.field1642[this.field1647++] << 15;
            if (this.field1647 >= this.field1645) {
                this.field1647 = this.field1645 - 1;
            }
            this.field1646 = (int) ((double) this.field1641[this.field1647] / 65536.0D * (double) arg0);
            if (this.field1646 > this.field1640) {
                this.field1643 = ((this.field1642[this.field1647] << 15) - this.field1649) / (this.field1646 - this.field1640);
            }
        }
        this.field1649 += this.field1643;
        this.field1640++;
        return this.field1649 - this.field1643 >> 15;
    }
}
