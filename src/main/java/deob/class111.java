package deob;

@ObfuscatedName("dk")
public class class111 {

    @ObfuscatedName("dk.i")
    public int field1672 = 2;

    @ObfuscatedName("dk.w")
    public int[] field1669 = new int[2];

    @ObfuscatedName("dk.a")
    public int[] field1676 = new int[2];

    @ObfuscatedName("dk.t")
    public int field1671;

    @ObfuscatedName("dk.s")
    public int field1670;

    @ObfuscatedName("dk.r")
    public int field1673;

    @ObfuscatedName("dk.v")
    public int field1674;

    @ObfuscatedName("dk.y")
    public int field1678;

    @ObfuscatedName("dk.j")
    public int field1675;

    @ObfuscatedName("dk.k")
    public int field1668;

    @ObfuscatedName("dk.e")
    public int field1677;

    public class111() {
        this.field1669[0] = 0;
        this.field1669[1] = 65535;
        this.field1676[0] = 0;
        this.field1676[1] = 65535;
    }

    @ObfuscatedName("dk.i(Lfp;)V")
    public final void method1887(class174 arg0) {
        this.field1673 = arg0.method3061();
        this.field1671 = arg0.method2885();
        this.field1670 = arg0.method2885();
        this.method1888(arg0);
    }

    @ObfuscatedName("dk.w(Lfp;)V")
    public final void method1888(class174 arg0) {
        this.field1672 = arg0.method3061();
        this.field1669 = new int[this.field1672];
        this.field1676 = new int[this.field1672];
        for (int var2 = 0; var2 < this.field1672; var2++) {
            this.field1669[var2] = arg0.method2882();
            this.field1676[var2] = arg0.method2882();
        }
    }

    @ObfuscatedName("dk.a()V")
    public final void method1900() {
        this.field1674 = 0;
        this.field1675 = 0;
        this.field1668 = 0;
        this.field1677 = 0;
        this.field1678 = 0;
    }

    @ObfuscatedName("dk.t(I)I")
    public final int method1889(int arg0) {
        if (this.field1678 >= this.field1674) {
            this.field1677 = this.field1676[this.field1675++] << 15;
            if (this.field1675 >= this.field1672) {
                this.field1675 = this.field1672 - 1;
            }
            this.field1674 = (int) ((double) this.field1669[this.field1675] / 65536.0D * (double) arg0);
            if (this.field1674 > this.field1678) {
                this.field1668 = ((this.field1676[this.field1675] << 15) - this.field1677) / (this.field1674 - this.field1678);
            }
        }
        this.field1677 += this.field1668;
        this.field1678++;
        return this.field1677 - this.field1668 >> 15;
    }
}
