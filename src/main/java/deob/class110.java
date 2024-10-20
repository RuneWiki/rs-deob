package deob;

@ObfuscatedName("do")
public class class110 {

    @ObfuscatedName("do.n")
    public int field1561 = 2;

    @ObfuscatedName("do.v")
    public int[] field1564 = new int[2];

    @ObfuscatedName("do.y")
    public int field1570;

    @ObfuscatedName("do.r")
    public int[] field1562 = new int[2];

    @ObfuscatedName("do.h")
    public int field1563;

    @ObfuscatedName("do.d")
    public int field1568;

    @ObfuscatedName("do.s")
    public int field1565;

    @ObfuscatedName("do.b")
    public int field1566;

    @ObfuscatedName("do.e")
    public int field1560;

    @ObfuscatedName("do.f")
    public int field1567;

    @ObfuscatedName("do.z")
    public int field1569;

    public class110() {
        this.field1564[0] = 0;
        this.field1564[1] = 65535;
        this.field1562[0] = 0;
        this.field1562[1] = 65535;
    }

    @ObfuscatedName("do.n(Lgv;)V")
    public final void method1938(class185 arg0) {
        this.field1565 = arg0.method3021();
        this.field1563 = arg0.method3026();
        this.field1568 = arg0.method3026();
        this.method1948(arg0);
    }

    @ObfuscatedName("do.v(Lgv;)V")
    public final void method1948(class185 arg0) {
        this.field1561 = arg0.method3021();
        this.field1564 = new int[this.field1561];
        this.field1562 = new int[this.field1561];
        for (int var2 = 0; var2 < this.field1561; var2++) {
            this.field1564[var2] = arg0.method3015();
            this.field1562[var2] = arg0.method3015();
        }
    }

    @ObfuscatedName("do.y()V")
    public final void method1939() {
        this.field1566 = 0;
        this.field1560 = 0;
        this.field1567 = 0;
        this.field1569 = 0;
        this.field1570 = 0;
    }

    @ObfuscatedName("do.r(I)I")
    public final int method1949(int arg0) {
        if (this.field1570 >= this.field1566) {
            this.field1569 = this.field1562[this.field1560++] << 15;
            if (this.field1560 >= this.field1561) {
                this.field1560 = this.field1561 - 1;
            }
            this.field1566 = (int) ((double) this.field1564[this.field1560] / 65536.0D * (double) arg0);
            if (this.field1566 > this.field1570) {
                this.field1567 = ((this.field1562[this.field1560] << 15) - this.field1569) / (this.field1566 - this.field1570);
            }
        }
        this.field1569 += this.field1567;
        this.field1570++;
        return this.field1569 - this.field1567 >> 15;
    }
}
