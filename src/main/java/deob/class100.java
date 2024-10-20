package deob;

@ObfuscatedName("cu")
public class class100 extends class110 {

    @ObfuscatedName("cu.i")
    public long[] field1633 = new long[10];

    @ObfuscatedName("cu.e")
    public int field1628 = 256;

    @ObfuscatedName("cu.f")
    public int field1629 = 1;

    @ObfuscatedName("cu.k")
    public long field1627 = class156.method1307();

    @ObfuscatedName("cu.g")
    public int field1636 = 0;

    @ObfuscatedName("cu.n")
    public int field1632;

    public class100() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1633[var1] = this.field1627;
        }
    }

    @ObfuscatedName("cu.i(I)V")
    public void method1796() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1633[var1] = 0L;
        }
    }

    @ObfuscatedName("cu.e(IIB)I")
    public int method1797(int arg0, int arg1) {
        int var3 = this.field1628;
        int var4 = this.field1629;
        this.field1628 = 300;
        this.field1629 = 1;
        this.field1627 = class156.method1307();
        if (this.field1633[this.field1632] == 0L) {
            this.field1628 = var3;
            this.field1629 = var4;
        } else if (this.field1627 > this.field1633[this.field1632]) {
            this.field1628 = (int) ((long) (arg0 * 2560) / (this.field1627 - this.field1633[this.field1632]));
        }
        if (this.field1628 < 25) {
            this.field1628 = 25;
        }
        if (this.field1628 > 256) {
            this.field1628 = 256;
            this.field1629 = (int) ((long) arg0 - (this.field1627 - this.field1633[this.field1632]) / 10L);
        }
        if (this.field1629 > arg0) {
            this.field1629 = arg0;
        }
        this.field1633[this.field1632] = this.field1627;
        this.field1632 = (this.field1632 + 1) % 10;
        if (this.field1629 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1633[var5] != 0L) {
                    this.field1633[var5] += (long) this.field1629;
                }
            }
        }
        if (this.field1629 < arg1) {
            this.field1629 = arg1;
        }
        class162.method150((long) this.field1629);
        int var6 = 0;
        while (this.field1636 < 256) {
            var6++;
            this.field1636 += this.field1628;
        }
        this.field1636 &= 0xFF;
        return var6;
    }
}
