package deob;

@ObfuscatedName("dj")
public class class109 {

    @ObfuscatedName("dj.t")
    public int field1561 = 2;

    @ObfuscatedName("dj.q")
    public int[] field1560 = new int[2];

    @ObfuscatedName("dj.i")
    public int[] field1562 = new int[2];

    @ObfuscatedName("dj.a")
    public int field1569;

    @ObfuscatedName("dj.l")
    public int field1563;

    @ObfuscatedName("dj.b")
    public int field1559;

    @ObfuscatedName("dj.e")
    public int field1565;

    @ObfuscatedName("dj.p")
    public int field1566;

    @ObfuscatedName("dj.g")
    public int field1567;

    @ObfuscatedName("dj.n")
    public int field1568;

    @ObfuscatedName("dj.o")
    public int field1564;

    public class109() {
        this.field1560[0] = 0;
        this.field1560[1] = 65535;
        this.field1562[0] = 0;
        this.field1562[1] = 65535;
    }

    @ObfuscatedName("dj.t(Lgb;)V")
    public final void method2085(class195 arg0) {
        this.field1559 = arg0.method3236();
        this.field1569 = arg0.method3241();
        this.field1563 = arg0.method3241();
        this.method2086(arg0);
    }

    @ObfuscatedName("dj.q(Lgb;)V")
    public final void method2086(class195 arg0) {
        this.field1561 = arg0.method3236();
        this.field1560 = new int[this.field1561];
        this.field1562 = new int[this.field1561];
        for (int var2 = 0; var2 < this.field1561; var2++) {
            this.field1560[var2] = arg0.method3238();
            this.field1562[var2] = arg0.method3238();
        }
    }

    @ObfuscatedName("dj.i()V")
    public final void method2087() {
        this.field1565 = 0;
        this.field1566 = 0;
        this.field1567 = 0;
        this.field1568 = 0;
        this.field1564 = 0;
    }

    @ObfuscatedName("dj.a(I)I")
    public final int method2091(int arg0) {
        if (this.field1564 >= this.field1565) {
            this.field1568 = this.field1562[this.field1566++] << 15;
            if (this.field1566 >= this.field1561) {
                this.field1566 = this.field1561 - 1;
            }
            this.field1565 = (int) ((double) this.field1560[this.field1566] / 65536.0D * (double) arg0);
            if (this.field1565 > this.field1564) {
                this.field1567 = ((this.field1562[this.field1566] << 15) - this.field1568) / (this.field1565 - this.field1564);
            }
        }
        this.field1568 += this.field1567;
        this.field1564++;
        return this.field1568 - this.field1567 >> 15;
    }
}
