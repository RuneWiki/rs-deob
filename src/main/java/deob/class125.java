package deob;

@ObfuscatedName("de")
public class class125 extends class117 {

    @ObfuscatedName("de.m")
    public long[] field1984 = new long[10];

    @ObfuscatedName("de.k")
    public int field1981 = 256;

    @ObfuscatedName("de.y")
    public int field1983 = 1;

    @ObfuscatedName("de.g")
    public long field1987 = class100.method100();

    @ObfuscatedName("de.r")
    public int field1985 = 0;

    @ObfuscatedName("de.i")
    public int field1986;

    public class125() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1984[var1] = this.field1987;
        }
    }

    @ObfuscatedName("de.k(B)V")
    public void method2445() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1984[var1] = 0L;
        }
    }

    @ObfuscatedName("de.y(III)I")
    public int method2446(int arg0, int arg1) {
        int var3 = this.field1981;
        int var4 = this.field1983;
        this.field1981 = 300;
        this.field1983 = 1;
        this.field1987 = class100.method100();
        if (this.field1984[this.field1986] == 0L) {
            this.field1981 = var3;
            this.field1983 = var4;
        } else if (this.field1987 > this.field1984[this.field1986]) {
            this.field1981 = (int) ((long) (arg0 * 2560) / (this.field1987 - this.field1984[this.field1986]));
        }
        if (this.field1981 < 25) {
            this.field1981 = 25;
        }
        if (this.field1981 > 256) {
            this.field1981 = 256;
            this.field1983 = (int) ((long) arg0 - (this.field1987 - this.field1984[this.field1986]) / 10L);
        }
        if (this.field1983 > arg0) {
            this.field1983 = arg0;
        }
        this.field1984[this.field1986] = this.field1987;
        this.field1986 = (this.field1986 + 1) % 10;
        if (this.field1983 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1984[var5] != 0L) {
                    this.field1984[var5] += (long) this.field1983;
                }
            }
        }
        if (this.field1983 < arg1) {
            this.field1983 = arg1;
        }
        class111.method59((long) this.field1983);
        int var6 = 0;
        while (this.field1985 < 256) {
            var6++;
            this.field1985 += this.field1981;
        }
        this.field1985 &= 0xFF;
        return var6;
    }
}
