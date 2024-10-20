package deob;

@ObfuscatedName("co")
public class class100 extends class110 {

    @ObfuscatedName("co.x")
    public long[] field1659 = new long[10];

    @ObfuscatedName("co.j")
    public int field1651 = 256;

    @ObfuscatedName("co.c")
    public int field1652 = 1;

    @ObfuscatedName("co.d")
    public long field1650 = class156.method1888();

    @ObfuscatedName("co.w")
    public int field1654 = 0;

    @ObfuscatedName("co.h")
    public int field1655;

    public class100() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1659[var1] = this.field1650;
        }
    }

    @ObfuscatedName("co.x(B)V")
    public void method1881() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1659[var1] = 0L;
        }
    }

    @ObfuscatedName("co.j(III)I")
    public int method1880(int arg0, int arg1) {
        int var3 = this.field1651;
        int var4 = this.field1652;
        this.field1651 = 300;
        this.field1652 = 1;
        this.field1650 = class156.method1888();
        if (this.field1659[this.field1655] == 0L) {
            this.field1651 = var3;
            this.field1652 = var4;
        } else if (this.field1650 > this.field1659[this.field1655]) {
            this.field1651 = (int) ((long) (arg0 * 2560) / (this.field1650 - this.field1659[this.field1655]));
        }
        if (this.field1651 < 25) {
            this.field1651 = 25;
        }
        if (this.field1651 > 256) {
            this.field1651 = 256;
            this.field1652 = (int) ((long) arg0 - (this.field1650 - this.field1659[this.field1655]) / 10L);
        }
        if (this.field1652 > arg0) {
            this.field1652 = arg0;
        }
        this.field1659[this.field1655] = this.field1650;
        this.field1655 = (this.field1655 + 1) % 10;
        if (this.field1652 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1659[var5] != 0L) {
                    this.field1659[var5] += (long) this.field1652;
                }
            }
        }
        if (this.field1652 < arg1) {
            this.field1652 = arg1;
        }
        class162.method2485((long) this.field1652);
        int var6 = 0;
        while (this.field1654 < 256) {
            var6++;
            this.field1654 += this.field1651;
        }
        this.field1654 &= 0xFF;
        return var6;
    }
}
