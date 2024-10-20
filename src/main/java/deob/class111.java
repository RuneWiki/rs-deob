package deob;

@ObfuscatedName("dj")
public class class111 {

    @ObfuscatedName("dj.e")
    public int field1657 = 2;

    @ObfuscatedName("dj.o")
    public int[] field1651 = new int[2];

    @ObfuscatedName("dj.m")
    public int[] field1655 = new int[2];

    @ObfuscatedName("dj.g")
    public int field1653;

    @ObfuscatedName("dj.d")
    public int field1660;

    @ObfuscatedName("dj.b")
    public int field1650;

    @ObfuscatedName("dj.k")
    public int field1656;

    @ObfuscatedName("dj.f")
    public int field1654;

    @ObfuscatedName("dj.j")
    public int field1658;

    @ObfuscatedName("dj.q")
    public int field1659;

    @ObfuscatedName("dj.h")
    public int field1652;

    public class111() {
        this.field1651[0] = 0;
        this.field1651[1] = 65535;
        this.field1655[0] = 0;
        this.field1655[1] = 65535;
    }

    @ObfuscatedName("dj.e(Lfw;)V")
    public final void method1893(class174 arg0) {
        this.field1650 = arg0.method2891();
        this.field1653 = arg0.method2896();
        this.field1660 = arg0.method2896();
        this.method1881(arg0);
    }

    @ObfuscatedName("dj.o(Lfw;)V")
    public final void method1881(class174 arg0) {
        this.field1657 = arg0.method2891();
        this.field1651 = new int[this.field1657];
        this.field1655 = new int[this.field1657];
        for (int var2 = 0; var2 < this.field1657; var2++) {
            this.field1651[var2] = arg0.method2930();
            this.field1655[var2] = arg0.method2930();
        }
    }

    @ObfuscatedName("dj.m()V")
    public final void method1886() {
        this.field1656 = 0;
        this.field1654 = 0;
        this.field1658 = 0;
        this.field1659 = 0;
        this.field1652 = 0;
    }

    @ObfuscatedName("dj.g(I)I")
    public final int method1883(int arg0) {
        if (this.field1652 >= this.field1656) {
            this.field1659 = this.field1655[this.field1654++] << 15;
            if (this.field1654 >= this.field1657) {
                this.field1654 = this.field1657 - 1;
            }
            this.field1656 = (int) ((double) this.field1651[this.field1654] / 65536.0D * (double) arg0);
            if (this.field1656 > this.field1652) {
                this.field1658 = ((this.field1655[this.field1654] << 15) - this.field1659) / (this.field1656 - this.field1652);
            }
        }
        this.field1659 += this.field1658;
        this.field1652++;
        return this.field1659 - this.field1658 >> 15;
    }
}
