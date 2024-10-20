package deob;

@ObfuscatedName("dt")
public class class113 {

    @ObfuscatedName("dt.d")
    public int field1640 = 2;

    @ObfuscatedName("dt.q")
    public int[] field1637 = new int[2];

    @ObfuscatedName("dt.y")
    public int field1644;

    @ObfuscatedName("dt.e")
    public int[] field1638 = new int[2];

    @ObfuscatedName("dt.f")
    public int field1646;

    @ObfuscatedName("dt.v")
    public int field1645;

    @ObfuscatedName("dt.t")
    public int field1641;

    @ObfuscatedName("dt.i")
    public int field1642;

    @ObfuscatedName("dt.r")
    public int field1643;

    @ObfuscatedName("dt.g")
    public int field1636;

    @ObfuscatedName("dt.s")
    public int field1639;

    public class113() {
        this.field1637[0] = 0;
        this.field1637[1] = 65535;
        this.field1638[0] = 0;
        this.field1638[1] = 65535;
    }

    @ObfuscatedName("dt.d(Lfw;)V")
    public final void method1942(class174 arg0) {
        this.field1641 = arg0.method2921();
        this.field1646 = arg0.method2935();
        this.field1645 = arg0.method2935();
        this.method1944(arg0);
    }

    @ObfuscatedName("dt.q(Lfw;)V")
    public final void method1944(class174 arg0) {
        this.field1640 = arg0.method2921();
        this.field1637 = new int[this.field1640];
        this.field1638 = new int[this.field1640];
        for (int var2 = 0; var2 < this.field1640; var2++) {
            this.field1637[var2] = arg0.method2916();
            this.field1638[var2] = arg0.method2916();
        }
    }

    @ObfuscatedName("dt.x()V")
    public final void method1945() {
        this.field1642 = 0;
        this.field1643 = 0;
        this.field1636 = 0;
        this.field1639 = 0;
        this.field1644 = 0;
    }

    @ObfuscatedName("dt.y(I)I")
    public final int method1955(int arg0) {
        if (this.field1644 >= this.field1642) {
            this.field1639 = this.field1638[this.field1643++] << 15;
            if (this.field1643 >= this.field1640) {
                this.field1643 = this.field1640 - 1;
            }
            this.field1642 = (int) ((double) this.field1637[this.field1643] / 65536.0D * (double) arg0);
            if (this.field1642 > this.field1644) {
                this.field1636 = ((this.field1638[this.field1643] << 15) - this.field1639) / (this.field1642 - this.field1644);
            }
        }
        this.field1639 += this.field1636;
        this.field1644++;
        return this.field1639 - this.field1636 >> 15;
    }
}
