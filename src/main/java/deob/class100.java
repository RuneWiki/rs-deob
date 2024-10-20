package deob;

@ObfuscatedName("cr")
public class class100 extends class110 {

    @ObfuscatedName("cr.s")
    public long[] field1651 = new long[10];

    @ObfuscatedName("cr.c")
    public int field1646 = 256;

    @ObfuscatedName("cr.f")
    public int field1647 = 1;

    @ObfuscatedName("cr.h")
    public long field1645 = Statics.method28();

    @ObfuscatedName("cr.a")
    public int field1649 = 0;

    @ObfuscatedName("cr.g")
    public int field1650;

    public class100() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1651[var1] = this.field1645;
        }
    }

    @ObfuscatedName("cr.s(I)V")
    public void method1775() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1651[var1] = 0L;
        }
    }

    @ObfuscatedName("cr.c(III)I")
    public int method1776(int arg0, int arg1) {
        int var3 = this.field1646;
        int var4 = this.field1647;
        this.field1646 = 300;
        this.field1647 = 1;
        this.field1645 = Statics.method28();
        if (this.field1651[this.field1650] == 0L) {
            this.field1646 = var3;
            this.field1647 = var4;
        } else if (this.field1645 > this.field1651[this.field1650]) {
            this.field1646 = (int) ((long) (arg0 * 2560) / (this.field1645 - this.field1651[this.field1650]));
        }
        if (this.field1646 < 25) {
            this.field1646 = 25;
        }
        if (this.field1646 > 256) {
            this.field1646 = 256;
            this.field1647 = (int) ((long) arg0 - (this.field1645 - this.field1651[this.field1650]) / 10L);
        }
        if (this.field1647 > arg0) {
            this.field1647 = arg0;
        }
        this.field1651[this.field1650] = this.field1645;
        this.field1650 = (this.field1650 + 1) % 10;
        if (this.field1647 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1651[var5] != 0L) {
                    this.field1651[var5] += (long) this.field1647;
                }
            }
        }
        if (this.field1647 < arg1) {
            this.field1647 = arg1;
        }
        class162.method746((long) this.field1647);
        int var6 = 0;
        while (this.field1649 < 256) {
            var6++;
            this.field1649 += this.field1646;
        }
        this.field1649 &= 0xFF;
        return var6;
    }
}
