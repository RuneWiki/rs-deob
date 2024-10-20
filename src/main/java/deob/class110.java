package deob;

@ObfuscatedName("dw")
public class class110 {

    @ObfuscatedName("dw.d")
    public int field1571 = 2;

    @ObfuscatedName("dw.k")
    public int[] field1576 = new int[2];

    @ObfuscatedName("dw.z")
    public int[] field1570 = new int[2];

    @ObfuscatedName("dw.v")
    public int field1578;

    @ObfuscatedName("dw.m")
    public int field1572;

    @ObfuscatedName("dw.b")
    public int field1573;

    @ObfuscatedName("dw.t")
    public int field1574;

    @ObfuscatedName("dw.p")
    public int field1575;

    @ObfuscatedName("dw.r")
    public int field1568;

    @ObfuscatedName("dw.l")
    public int field1577;

    @ObfuscatedName("dw.u")
    public int field1569;

    public class110() {
        this.field1576[0] = 0;
        this.field1576[1] = 65535;
        this.field1570[0] = 0;
        this.field1570[1] = 65535;
    }

    @ObfuscatedName("dw.d(Lfr;)V")
    public final void method1993(class181 arg0) {
        this.field1573 = arg0.method3204();
        this.field1578 = arg0.method3041();
        this.field1572 = arg0.method3041();
        this.method2000(arg0);
    }

    @ObfuscatedName("dw.x(Lfr;)V")
    public final void method2000(class181 arg0) {
        this.field1571 = arg0.method3204();
        this.field1576 = new int[this.field1571];
        this.field1570 = new int[this.field1571];
        for (int var2 = 0; var2 < this.field1571; var2++) {
            this.field1576[var2] = arg0.method3179();
            this.field1570[var2] = arg0.method3179();
        }
    }

    @ObfuscatedName("dw.k()V")
    public final void method1986() {
        this.field1574 = 0;
        this.field1575 = 0;
        this.field1568 = 0;
        this.field1577 = 0;
        this.field1569 = 0;
    }

    @ObfuscatedName("dw.z(I)I")
    public final int method1990(int arg0) {
        if (this.field1569 >= this.field1574) {
            this.field1577 = this.field1570[this.field1575++] << 15;
            if (this.field1575 >= this.field1571) {
                this.field1575 = this.field1571 - 1;
            }
            this.field1574 = (int) ((double) this.field1576[this.field1575] / 65536.0D * (double) arg0);
            if (this.field1574 > this.field1569) {
                this.field1568 = ((this.field1570[this.field1575] << 15) - this.field1577) / (this.field1574 - this.field1569);
            }
        }
        this.field1577 += this.field1568;
        this.field1569++;
        return this.field1577 - this.field1568 >> 15;
    }
}
