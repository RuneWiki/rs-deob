package deob;

@ObfuscatedName("bq")
public class class120 {

    @ObfuscatedName("bq.g")
    public int field1846;

    @ObfuscatedName("bq.d")
    public int field1844;

    @ObfuscatedName("bq.b")
    public int[] field1840 = new int[2];

    @ObfuscatedName("bq.c")
    public int[] field1839 = new int[2];

    @ObfuscatedName("bq.a")
    public int field1847;

    @ObfuscatedName("bq.m")
    public int field1842;

    @ObfuscatedName("bq.j")
    public int field1841;

    @ObfuscatedName("bq.i")
    public int field1838;

    @ObfuscatedName("bq.v")
    public int field1845 = 2;

    @ObfuscatedName("bq.z")
    public int field1843;

    @ObfuscatedName("bq.y")
    public int field1848;

    @ObfuscatedName("bq.b()V")
    public final void method2120() {
        this.field1844 = 0;
        this.field1841 = 0;
        this.field1846 = 0;
        this.field1847 = 0;
        this.field1848 = 0;
    }

    @ObfuscatedName("bq.v(Ldv;)V")
    public final void method2121(class28 arg0) {
        this.field1843 = arg0.method450();
        this.field1838 = arg0.method504();
        this.field1842 = arg0.method504();
        this.method2125(arg0);
    }

    public class120() {
        this.field1839[0] = 0;
        this.field1839[1] = 65535;
        this.field1840[0] = 0;
        this.field1840[1] = 65535;
    }

    @ObfuscatedName("bq.i(I)I")
    public final int method2123(int arg0) {
        if (this.field1848 >= this.field1844) {
            this.field1847 = this.field1840[this.field1841++] << 15;
            if (this.field1841 >= this.field1845) {
                this.field1841 = this.field1845 - 1;
            }
            this.field1844 = (int) ((double) this.field1839[this.field1841] / 65536.0D * (double) arg0);
            if (this.field1844 > this.field1848) {
                this.field1846 = ((this.field1840[this.field1841] << 15) - this.field1847) / (this.field1844 - this.field1848);
            }
        }
        this.field1847 += this.field1846;
        this.field1848++;
        return this.field1847 - this.field1846 >> 15;
    }

    @ObfuscatedName("bq.c(Ldv;)V")
    public final void method2125(class28 arg0) {
        this.field1845 = arg0.method450();
        this.field1839 = new int[this.field1845];
        this.field1840 = new int[this.field1845];
        for (int var2 = 0; var2 < this.field1845; var2++) {
            this.field1839[var2] = arg0.method349();
            this.field1840[var2] = arg0.method349();
        }
    }
}
