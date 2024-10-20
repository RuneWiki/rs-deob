package deob;

@ObfuscatedName("bf")
public class class125 extends class115 {

    @ObfuscatedName("bf.b")
    public int field1880 = 1;

    @ObfuscatedName("bf.c")
    public int field1879 = 256;

    @ObfuscatedName("bf.m")
    public int field1882 = 0;

    @ObfuscatedName("bf.i")
    public long field1878 = class42.method1378();

    @ObfuscatedName("bf.v")
    public long[] field1883 = new long[10];

    @ObfuscatedName("bf.z")
    public int field1884;

    public class125() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1883[var1] = this.field1878;
        }
    }

    @ObfuscatedName("bf.c(III)I")
    public int method2068(int arg0, int arg1) {
        int var3 = this.field1879;
        int var4 = this.field1880;
        this.field1879 = 300;
        this.field1880 = 1;
        this.field1878 = class42.method1378();
        if (this.field1883[this.field1884] == 0L) {
            this.field1879 = var3;
            this.field1880 = var4;
        } else if (this.field1878 > this.field1883[this.field1884]) {
            this.field1879 = (int) ((long) (arg0 * 2560) / (this.field1878 - this.field1883[this.field1884]));
        }
        if (this.field1879 < 25) {
            this.field1879 = 25;
        }
        if (this.field1879 > 256) {
            this.field1879 = 256;
            this.field1880 = (int) ((long) arg0 - (this.field1878 - this.field1883[this.field1884]) / 10L);
        }
        if (this.field1880 > arg0) {
            this.field1880 = arg0;
        }
        this.field1883[this.field1884] = this.field1878;
        this.field1884 = (this.field1884 + 1) % 10;
        if (this.field1880 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1883[var5] != 0L) {
                    this.field1883[var5] += (long) this.field1880;
                }
            }
        }
        if (this.field1880 < arg1) {
            this.field1880 = arg1;
        }
        class134.method1468((long) this.field1880);
        int var6 = 0;
        while (this.field1882 < 256) {
            var6++;
            this.field1882 += this.field1879;
        }
        this.field1882 &= 0xFF;
        return var6;
    }

    @ObfuscatedName("bf.v(I)V")
    public void method2069() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1883[var1] = 0L;
        }
    }
}
