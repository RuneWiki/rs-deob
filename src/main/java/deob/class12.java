package deob;

@ObfuscatedName("k")
public class class12 extends class80 {

    @ObfuscatedName("k.n")
    public int field182;

    @ObfuscatedName("k.g")
    public int field192;

    @ObfuscatedName("k.a")
    public int field184;

    @ObfuscatedName("k.m")
    public int field185;

    @ObfuscatedName("k.s")
    public int field186;

    @ObfuscatedName("k.j")
    public int field187;

    @ObfuscatedName("k.f")
    public class40 field188;

    @ObfuscatedName("k.b")
    public int field189;

    @ObfuscatedName("k.t")
    public int field190;

    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class80 arg8) {
        this.field182 = arg0;
        this.field192 = arg1;
        this.field184 = arg2;
        this.field185 = arg3;
        this.field186 = arg4;
        this.field187 = arg5;
        if (arg6 != -1) {
            this.field188 = class40.method2146(arg6);
            this.field189 = 0;
            this.field190 = client.field289 - 1;
            if (this.field188.field972 == 0 && arg8 != null && arg8 instanceof class12) {
                class12 var10 = (class12) arg8;
                if (this.field188 == var10.field188) {
                    this.field189 = var10.field189;
                    this.field190 = var10.field190;
                    return;
                }
            }
            if (arg7 && this.field188.field968 != -1) {
                this.field189 = (int) (Math.random() * (double) this.field188.field955.length);
                this.field190 -= (int) (Math.random() * (double) this.field188.field961[this.field189]);
            }
        }
    }

    @ObfuscatedName("k.g(S)Lcs;")
    public final class100 method17() {
        if (this.field188 != null) {
            int var1 = client.field289 - this.field190;
            if (var1 > 100 && this.field188.field968 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field188.field961[this.field189]) {
                            break label47;
                        }
                        var1 -= this.field188.field961[this.field189];
                        this.field189++;
                    } while (this.field189 < this.field188.field955.length);
                    this.field189 -= this.field188.field968;
                } while (this.field189 >= 0 && this.field189 < this.field188.field955.length);
                this.field188 = null;
            }
            this.field190 = client.field289 - var1;
        }
        class38 var2 = class38.method879(this.field182);
        if (var2.field930 != null) {
            var2 = var2.method692();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field184 == 1 || this.field184 == 3) {
            var3 = var2.field905;
            var4 = var2.field904;
        } else {
            var3 = var2.field904;
            var4 = var2.field905;
        }
        int var5 = (var3 >> 1) + this.field186;
        int var6 = (var3 + 1 >> 1) + this.field186;
        int var7 = (var4 >> 1) + this.field187;
        int var8 = (var4 + 1 >> 1) + this.field187;
        int[][] var9 = class6.field95[this.field185];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field186 << 7) + (var3 << 6);
        int var12 = (this.field187 << 7) + (var4 << 6);
        return var2.method694(this.field192, this.field184, var9, var11, var10, var12, this.field188, this.field189);
    }
}
