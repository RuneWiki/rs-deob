package deob;

@ObfuscatedName("cy")
public class class101 extends class142 {

    @ObfuscatedName("cy.i")
    public int field1537;

    @ObfuscatedName("cy.h")
    public int field1539;

    @ObfuscatedName("cy.u")
    public int field1538;

    @ObfuscatedName("cy.q")
    public int field1547;

    @ObfuscatedName("cy.g")
    public int field1540;

    @ObfuscatedName("cy.v")
    public int field1541;

    @ObfuscatedName("cy.t")
    public class261 field1536;

    @ObfuscatedName("cy.p")
    public int field1542;

    @ObfuscatedName("cy.l")
    public int field1544;

    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class142 arg8) {
        this.field1537 = arg0;
        this.field1539 = arg1;
        this.field1538 = arg2;
        this.field1547 = arg3;
        this.field1540 = arg4;
        this.field1541 = arg5;
        if (arg6 != -1) {
            this.field1536 = class261.method2856(arg6);
            this.field1542 = 0;
            this.field1544 = client.field900 - 1;
            if (this.field1536.field3612 == 0 && arg8 != null && arg8 instanceof class101) {
                class101 var10 = (class101) arg8;
                if (this.field1536 == var10.field1536) {
                    this.field1542 = var10.field1542;
                    this.field1544 = var10.field1544;
                    return;
                }
            }
            if (arg7 && this.field1536.field3603 != -1) {
                this.field1542 = (int) (Math.random() * (double) this.field1536.field3607.length);
                this.field1544 -= (int) (Math.random() * (double) this.field1536.field3596[this.field1542]);
            }
        }
    }

    @ObfuscatedName("cy.u(I)Lew;")
    public final class134 method1053() {
        if (this.field1536 != null) {
            int var1 = client.field900 - this.field1544;
            if (var1 > 100 && this.field1536.field3603 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1536.field3596[this.field1542]) {
                            break label47;
                        }
                        var1 -= this.field1536.field3596[this.field1542];
                        this.field1542++;
                    } while (this.field1542 < this.field1536.field3607.length);
                    this.field1542 -= this.field1536.field3603;
                } while (this.field1542 >= 0 && this.field1542 < this.field1536.field3607.length);
                this.field1536 = null;
            }
            this.field1544 = client.field900 - var1;
        }
        class256 var2 = Statics.method564(this.field1537);
        if (var2.field3471 != null) {
            var2 = var2.method4253();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1538 == 1 || this.field1538 == 3) {
            var3 = var2.field3431;
            var4 = var2.field3453;
        } else {
            var3 = var2.field3453;
            var4 = var2.field3431;
        }
        int var5 = (var3 >> 1) + this.field1540;
        int var6 = (var3 + 1 >> 1) + this.field1540;
        int var7 = (var4 >> 1) + this.field1541;
        int var8 = (var4 + 1 >> 1) + this.field1541;
        int[][] var9 = class62.field745[this.field1547];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1540 << 7) + (var3 << 6);
        int var12 = (this.field1541 << 7) + (var4 << 6);
        return var2.method4230(this.field1539, this.field1538, var9, var11, var10, var12, this.field1536, this.field1542);
    }
}
