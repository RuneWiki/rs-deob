package deob;

@ObfuscatedName("dl")
public class class110 {

    @ObfuscatedName("dl.s")
    public int field1571 = 2;

    @ObfuscatedName("dl.g")
    public int[] field1564 = new int[2];

    @ObfuscatedName("dl.m")
    public int[] field1565 = new int[2];

    @ObfuscatedName("dl.h")
    public int field1567;

    @ObfuscatedName("dl.i")
    public int field1568;

    @ObfuscatedName("dl.w")
    public int field1569;

    @ObfuscatedName("dl.t")
    public int field1566;

    @ObfuscatedName("dl.d")
    public int field1570;

    @ObfuscatedName("dl.z")
    public int field1572;

    @ObfuscatedName("dl.k")
    public int field1573;

    @ObfuscatedName("dl.c")
    public int field1574;

    public class110() {
        this.field1564[0] = 0;
        this.field1564[1] = 65535;
        this.field1565[0] = 0;
        this.field1565[1] = 65535;
    }

    @ObfuscatedName("dl.s(Lgy;)V")
    public final void method2151(class185 arg0) {
        this.field1569 = arg0.method3239();
        this.field1567 = arg0.method3292();
        this.field1568 = arg0.method3292();
        this.method2156(arg0);
    }

    @ObfuscatedName("dl.g(Lgy;)V")
    public final void method2156(class185 arg0) {
        this.field1571 = arg0.method3239();
        this.field1564 = new int[this.field1571];
        this.field1565 = new int[this.field1571];
        for (int var2 = 0; var2 < this.field1571; var2++) {
            this.field1564[var2] = arg0.method3241();
            this.field1565[var2] = arg0.method3241();
        }
    }

    @ObfuscatedName("dl.m()V")
    public final void method2153() {
        this.field1566 = 0;
        this.field1570 = 0;
        this.field1572 = 0;
        this.field1573 = 0;
        this.field1574 = 0;
    }

    @ObfuscatedName("dl.h(I)I")
    public final int method2154(int arg0) {
        if (this.field1574 >= this.field1566) {
            this.field1573 = this.field1565[this.field1570++] << 15;
            if (this.field1570 >= this.field1571) {
                this.field1570 = this.field1571 - 1;
            }
            this.field1566 = (int) ((double) this.field1564[this.field1570] / 65536.0D * (double) arg0);
            if (this.field1566 > this.field1574) {
                this.field1572 = ((this.field1565[this.field1570] << 15) - this.field1573) / (this.field1566 - this.field1574);
            }
        }
        this.field1573 += this.field1572;
        this.field1574++;
        return this.field1573 - this.field1572 >> 15;
    }
}
