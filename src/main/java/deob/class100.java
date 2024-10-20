package deob;

@ObfuscatedName("co")
public class class100 extends class110 {

    @ObfuscatedName("co.q")
    public long[] field1654 = new long[10];

    @ObfuscatedName("co.d")
    public int field1650 = 256;

    @ObfuscatedName("co.h")
    public int field1651 = 1;

    @ObfuscatedName("co.p")
    public long field1647 = class156.method12();

    @ObfuscatedName("co.j")
    public int field1648 = 0;

    @ObfuscatedName("co.n")
    public int field1645;

    public class100() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1654[var1] = this.field1647;
        }
    }

    @ObfuscatedName("co.q(I)V")
    public void method1899() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1654[var1] = 0L;
        }
    }

    @ObfuscatedName("co.d(IIS)I")
    public int method1900(int arg0, int arg1) {
        int var3 = this.field1650;
        int var4 = this.field1651;
        this.field1650 = 300;
        this.field1651 = 1;
        this.field1647 = class156.method12();
        if (this.field1654[this.field1645] == 0L) {
            this.field1650 = var3;
            this.field1651 = var4;
        } else if (this.field1647 > this.field1654[this.field1645]) {
            this.field1650 = (int) ((long) (arg0 * 2560) / (this.field1647 - this.field1654[this.field1645]));
        }
        if (this.field1650 < 25) {
            this.field1650 = 25;
        }
        if (this.field1650 > 256) {
            this.field1650 = 256;
            this.field1651 = (int) ((long) arg0 - (this.field1647 - this.field1654[this.field1645]) / 10L);
        }
        if (this.field1651 > arg0) {
            this.field1651 = arg0;
        }
        this.field1654[this.field1645] = this.field1647;
        this.field1645 = (this.field1645 + 1) % 10;
        if (this.field1651 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1654[var5] != 0L) {
                    this.field1654[var5] += (long) this.field1651;
                }
            }
        }
        if (this.field1651 < arg1) {
            this.field1651 = arg1;
        }
        class162.method2156((long) this.field1651);
        int var6 = 0;
        while (this.field1648 < 256) {
            var6++;
            this.field1648 += this.field1650;
        }
        this.field1648 &= 0xFF;
        return var6;
    }
}
