package deob;

@ObfuscatedName("cw")
public class class100 extends class110 {

    @ObfuscatedName("cw.b")
    public long[] field1637 = new long[10];

    @ObfuscatedName("cw.e")
    public int field1633 = 256;

    @ObfuscatedName("cw.c")
    public int field1634 = 1;

    @ObfuscatedName("cw.l")
    public long field1635 = class156.method81();

    @ObfuscatedName("cw.y")
    public int field1632 = 0;

    @ObfuscatedName("cw.j")
    public int field1636;

    public class100() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1637[var1] = this.field1635;
        }
    }

    @ObfuscatedName("cw.b(B)V")
    public void method1871() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1637[var1] = 0L;
        }
    }

    @ObfuscatedName("cw.e(IIB)I")
    public int method1873(int arg0, int arg1) {
        int var3 = this.field1633;
        int var4 = this.field1634;
        this.field1633 = 300;
        this.field1634 = 1;
        this.field1635 = class156.method81();
        if (this.field1637[this.field1636] == 0L) {
            this.field1633 = var3;
            this.field1634 = var4;
        } else if (this.field1635 > this.field1637[this.field1636]) {
            this.field1633 = (int) ((long) (arg0 * 2560) / (this.field1635 - this.field1637[this.field1636]));
        }
        if (this.field1633 < 25) {
            this.field1633 = 25;
        }
        if (this.field1633 > 256) {
            this.field1633 = 256;
            this.field1634 = (int) ((long) arg0 - (this.field1635 - this.field1637[this.field1636]) / 10L);
        }
        if (this.field1634 > arg0) {
            this.field1634 = arg0;
        }
        this.field1637[this.field1636] = this.field1635;
        this.field1636 = (this.field1636 + 1) % 10;
        if (this.field1634 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1637[var5] != 0L) {
                    this.field1637[var5] += (long) this.field1634;
                }
            }
        }
        if (this.field1634 < arg1) {
            this.field1634 = arg1;
        }
        class162.method2120((long) this.field1634);
        int var6 = 0;
        while (this.field1632 < 256) {
            var6++;
            this.field1632 += this.field1633;
        }
        this.field1632 &= 0xFF;
        return var6;
    }
}
