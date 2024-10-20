package deob;

@ObfuscatedName("cy")
public class class100 extends class110 {

    @ObfuscatedName("cy.f")
    public long[] field1673 = new long[10];

    @ObfuscatedName("cy.i")
    public int field1671 = 256;

    @ObfuscatedName("cy.u")
    public int field1666 = 1;

    @ObfuscatedName("cy.h")
    public long field1667 = class156.method848();

    @ObfuscatedName("cy.r")
    public int field1668 = 0;

    @ObfuscatedName("cy.o")
    public int field1665;

    public class100() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1673[var1] = this.field1667;
        }
    }

    @ObfuscatedName("cy.f(I)V")
    public void method1855() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1673[var1] = 0L;
        }
    }

    @ObfuscatedName("cy.i(III)I")
    public int method1856(int arg0, int arg1) {
        int var3 = this.field1671;
        int var4 = this.field1666;
        this.field1671 = 300;
        this.field1666 = 1;
        this.field1667 = class156.method848();
        if (this.field1673[this.field1665] == 0L) {
            this.field1671 = var3;
            this.field1666 = var4;
        } else if (this.field1667 > this.field1673[this.field1665]) {
            this.field1671 = (int) ((long) (arg0 * 2560) / (this.field1667 - this.field1673[this.field1665]));
        }
        if (this.field1671 < 25) {
            this.field1671 = 25;
        }
        if (this.field1671 > 256) {
            this.field1671 = 256;
            this.field1666 = (int) ((long) arg0 - (this.field1667 - this.field1673[this.field1665]) / 10L);
        }
        if (this.field1666 > arg0) {
            this.field1666 = arg0;
        }
        this.field1673[this.field1665] = this.field1667;
        this.field1665 = (this.field1665 + 1) % 10;
        if (this.field1666 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1673[var5] != 0L) {
                    this.field1673[var5] += (long) this.field1666;
                }
            }
        }
        if (this.field1666 < arg1) {
            this.field1666 = arg1;
        }
        class162.method2141((long) this.field1666);
        int var6 = 0;
        while (this.field1668 < 256) {
            var6++;
            this.field1668 += this.field1671;
        }
        this.field1668 &= 0xFF;
        return var6;
    }
}
