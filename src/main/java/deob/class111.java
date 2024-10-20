package deob;

@ObfuscatedName("dd")
public class class111 {

    @ObfuscatedName("dd.i")
    public int field1664 = 2;

    @ObfuscatedName("dd.c")
    public int[] field1670 = new int[2];

    @ObfuscatedName("dd.e")
    public int[] field1671 = new int[2];

    @ObfuscatedName("dd.v")
    public int field1665;

    @ObfuscatedName("dd.b")
    public int field1668;

    @ObfuscatedName("dd.y")
    public int field1674;

    @ObfuscatedName("dd.h")
    public int field1669;

    @ObfuscatedName("dd.f")
    public int field1666;

    @ObfuscatedName("dd.n")
    public int field1667;

    @ObfuscatedName("dd.a")
    public int field1672;

    @ObfuscatedName("dd.o")
    public int field1673;

    public class111() {
        this.field1670[0] = 0;
        this.field1670[1] = 65535;
        this.field1671[0] = 0;
        this.field1671[1] = 65535;
    }

    @ObfuscatedName("dd.i(Lfx;)V")
    public final void method1891(class174 arg0) {
        this.field1669 = arg0.method2870();
        this.field1665 = arg0.method2875();
        this.field1668 = arg0.method2875();
        this.method1893(arg0);
    }

    @ObfuscatedName("dd.c(Lfx;)V")
    public final void method1893(class174 arg0) {
        this.field1664 = arg0.method2870();
        this.field1670 = new int[this.field1664];
        this.field1671 = new int[this.field1664];
        for (int var2 = 0; var2 < this.field1664; var2++) {
            this.field1670[var2] = arg0.method2872();
            this.field1671[var2] = arg0.method2872();
        }
    }

    @ObfuscatedName("dd.e()V")
    public final void method1892() {
        this.field1666 = 0;
        this.field1667 = 0;
        this.field1672 = 0;
        this.field1673 = 0;
        this.field1674 = 0;
    }

    @ObfuscatedName("dd.v(I)I")
    public final int method1894(int arg0) {
        if (this.field1674 >= this.field1666) {
            this.field1673 = this.field1671[this.field1667++] << 15;
            if (this.field1667 >= this.field1664) {
                this.field1667 = this.field1664 - 1;
            }
            this.field1666 = (int) ((double) this.field1670[this.field1667] / 65536.0D * (double) arg0);
            if (this.field1666 > this.field1674) {
                this.field1672 = ((this.field1671[this.field1667] << 15) - this.field1673) / (this.field1666 - this.field1674);
            }
        }
        this.field1673 += this.field1672;
        this.field1674++;
        return this.field1673 - this.field1672 >> 15;
    }
}
