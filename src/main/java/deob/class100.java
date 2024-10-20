package deob;

@ObfuscatedName("cf")
public class class100 extends class110 {

    @ObfuscatedName("cf.o")
    public long[] field1636 = new long[10];

    @ObfuscatedName("cf.m")
    public int field1637 = 256;

    @ObfuscatedName("cf.b")
    public int field1641 = 1;

    @ObfuscatedName("cf.g")
    public long field1642 = class156.method2009();

    @ObfuscatedName("cf.h")
    public int field1640 = 0;

    @ObfuscatedName("cf.v")
    public int field1639;

    public class100() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1636[var1] = this.field1642;
        }
    }

    @ObfuscatedName("cf.o(S)V")
    public void method1787() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1636[var1] = 0L;
        }
    }

    @ObfuscatedName("cf.m(III)I")
    public int method1789(int arg0, int arg1) {
        int var3 = this.field1637;
        int var4 = this.field1641;
        this.field1637 = 300;
        this.field1641 = 1;
        this.field1642 = class156.method2009();
        if (this.field1636[this.field1639] == 0L) {
            this.field1637 = var3;
            this.field1641 = var4;
        } else if (this.field1642 > this.field1636[this.field1639]) {
            this.field1637 = (int) ((long) (arg0 * 2560) / (this.field1642 - this.field1636[this.field1639]));
        }
        if (this.field1637 < 25) {
            this.field1637 = 25;
        }
        if (this.field1637 > 256) {
            this.field1637 = 256;
            this.field1641 = (int) ((long) arg0 - (this.field1642 - this.field1636[this.field1639]) / 10L);
        }
        if (this.field1641 > arg0) {
            this.field1641 = arg0;
        }
        this.field1636[this.field1639] = this.field1642;
        this.field1639 = (this.field1639 + 1) % 10;
        if (this.field1641 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1636[var5] != 0L) {
                    this.field1636[var5] += (long) this.field1641;
                }
            }
        }
        if (this.field1641 < arg1) {
            this.field1641 = arg1;
        }
        class162.method238((long) this.field1641);
        int var6 = 0;
        while (this.field1640 < 256) {
            var6++;
            this.field1640 += this.field1637;
        }
        this.field1640 &= 0xFF;
        return var6;
    }
}
