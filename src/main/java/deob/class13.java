package deob;

@ObfuscatedName("y")
public class class13 extends class86 {

    @ObfuscatedName("y.e")
    public int field182;

    @ObfuscatedName("y.w")
    public int field194;

    @ObfuscatedName("y.f")
    public int field189;

    @ObfuscatedName("y.s")
    public int field185;

    @ObfuscatedName("y.p")
    public int field186;

    @ObfuscatedName("y.h")
    public int field187;

    @ObfuscatedName("y.g")
    public class43 field184;

    @ObfuscatedName("y.a")
    public int field192;

    @ObfuscatedName("y.r")
    public int field190;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class86 arg8) {
        this.field182 = arg0;
        this.field194 = arg1;
        this.field189 = arg2;
        this.field185 = arg3;
        this.field186 = arg4;
        this.field187 = arg5;
        if (arg6 != -1) {
            this.field184 = class43.method949(arg6);
            this.field192 = 0;
            this.field190 = client.field290 - 1;
            if (this.field184.field972 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field184 == var10.field184) {
                    this.field192 = var10.field192;
                    this.field190 = var10.field190;
                    return;
                }
            }
            if (arg7 && this.field184.field966 != -1) {
                this.field192 = (int) (Math.random() * (double) this.field184.field976.length);
                this.field190 -= (int) (Math.random() * (double) this.field184.field969[this.field192]);
            }
        }
    }

    @ObfuscatedName("y.f(B)Ldy;")
    public final class106 method25() {
        if (this.field184 != null) {
            int var1 = client.field290 - this.field190;
            if (var1 > 100 && this.field184.field966 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field184.field969[this.field192]) {
                            break label47;
                        }
                        var1 -= this.field184.field969[this.field192];
                        this.field192++;
                    } while (this.field192 < this.field184.field976.length);
                    this.field192 -= this.field184.field966;
                } while (this.field192 >= 0 && this.field192 < this.field184.field976.length);
                this.field184 = null;
            }
            this.field190 = client.field290 - var1;
        }
        class41 var2 = class41.method626(this.field182);
        if (var2.field924 != null) {
            var2 = var2.method772();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field189 == 1 || this.field189 == 3) {
            var3 = var2.field916;
            var4 = var2.field909;
        } else {
            var3 = var2.field909;
            var4 = var2.field916;
        }
        int var5 = (var3 >> 1) + this.field186;
        int var6 = (var3 + 1 >> 1) + this.field186;
        int var7 = (var4 >> 1) + this.field187;
        int var8 = (var4 + 1 >> 1) + this.field187;
        int[][] var9 = class6.field91[this.field185];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field186 << 7) + (var3 << 6);
        int var12 = (this.field187 << 7) + (var4 << 6);
        return var2.method770(this.field194, this.field189, var9, var11, var10, var12, this.field184, this.field192);
    }
}
