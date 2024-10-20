package deob;

@ObfuscatedName("de")
public class class109 {

    @ObfuscatedName("de.w")
    public int field1644 = 2;

    @ObfuscatedName("de.s")
    public int[] field1639 = new int[2];

    @ObfuscatedName("de.q")
    public int[] field1640 = new int[2];

    @ObfuscatedName("de.o")
    public int field1647;

    @ObfuscatedName("de.g")
    public int field1642;

    @ObfuscatedName("de.v")
    public int field1643;

    @ObfuscatedName("de.p")
    public int field1641;

    @ObfuscatedName("de.e")
    public int field1645;

    @ObfuscatedName("de.d")
    public int field1638;

    @ObfuscatedName("de.z")
    public int field1646;

    @ObfuscatedName("de.n")
    public int field1648;

    public class109() {
        this.field1639[0] = 0;
        this.field1639[1] = 65535;
        this.field1640[0] = 0;
        this.field1640[1] = 65535;
    }

    @ObfuscatedName("de.w(Lfz;)V")
    public final void method1959(class174 arg0) {
        this.field1643 = arg0.method2971();
        this.field1647 = arg0.method3131();
        this.field1642 = arg0.method3131();
        this.method1955(arg0);
    }

    @ObfuscatedName("de.s(Lfz;)V")
    public final void method1955(class174 arg0) {
        this.field1644 = arg0.method2971();
        this.field1639 = new int[this.field1644];
        this.field1640 = new int[this.field1644];
        for (int var2 = 0; var2 < this.field1644; var2++) {
            this.field1639[var2] = arg0.method3178();
            this.field1640[var2] = arg0.method3178();
        }
    }

    @ObfuscatedName("de.q()V")
    public final void method1962() {
        this.field1641 = 0;
        this.field1645 = 0;
        this.field1638 = 0;
        this.field1646 = 0;
        this.field1648 = 0;
    }

    @ObfuscatedName("de.o(I)I")
    public final int method1957(int arg0) {
        if (this.field1648 >= this.field1641) {
            this.field1646 = this.field1640[this.field1645++] << 15;
            if (this.field1645 >= this.field1644) {
                this.field1645 = this.field1644 - 1;
            }
            this.field1641 = (int) ((double) this.field1639[this.field1645] / 65536.0D * (double) arg0);
            if (this.field1641 > this.field1648) {
                this.field1638 = ((this.field1640[this.field1645] << 15) - this.field1646) / (this.field1641 - this.field1648);
            }
        }
        this.field1646 += this.field1638;
        this.field1648++;
        return this.field1646 - this.field1638 >> 15;
    }
}
