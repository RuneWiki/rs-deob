package deob;

@ObfuscatedName("cy")
public class class100 extends class110 {

    @ObfuscatedName("cy.x")
    public long[] field1646 = new long[10];

    @ObfuscatedName("cy.n")
    public int field1654 = 256;

    @ObfuscatedName("cy.g")
    public int field1647 = 1;

    @ObfuscatedName("cy.v")
    public long field1648 = class156.method1898();

    @ObfuscatedName("cy.y")
    public int field1650 = 0;

    @ObfuscatedName("cy.p")
    public int field1645;

    public class100() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1646[var1] = this.field1648;
        }
    }

    @ObfuscatedName("cy.x(I)V")
    public void method1921() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1646[var1] = 0L;
        }
    }

    @ObfuscatedName("cy.n(III)I")
    public int method1920(int arg0, int arg1) {
        int var3 = this.field1654;
        int var4 = this.field1647;
        this.field1654 = 300;
        this.field1647 = 1;
        this.field1648 = class156.method1898();
        if (this.field1646[this.field1645] == 0L) {
            this.field1654 = var3;
            this.field1647 = var4;
        } else if (this.field1648 > this.field1646[this.field1645]) {
            this.field1654 = (int) ((long) (arg0 * 2560) / (this.field1648 - this.field1646[this.field1645]));
        }
        if (this.field1654 < 25) {
            this.field1654 = 25;
        }
        if (this.field1654 > 256) {
            this.field1654 = 256;
            this.field1647 = (int) ((long) arg0 - (this.field1648 - this.field1646[this.field1645]) / 10L);
        }
        if (this.field1647 > arg0) {
            this.field1647 = arg0;
        }
        this.field1646[this.field1645] = this.field1648;
        this.field1645 = (this.field1645 + 1) % 10;
        if (this.field1647 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1646[var5] != 0L) {
                    this.field1646[var5] += (long) this.field1647;
                }
            }
        }
        if (this.field1647 < arg1) {
            this.field1647 = arg1;
        }
        class162.method951((long) this.field1647);
        int var6 = 0;
        while (this.field1650 < 256) {
            var6++;
            this.field1650 += this.field1654;
        }
        this.field1650 &= 0xFF;
        return var6;
    }
}
