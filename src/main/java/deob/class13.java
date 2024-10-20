package deob;

@ObfuscatedName("q")
public class class13 extends class85 {

    @ObfuscatedName("q.j")
    public int field191;

    @ObfuscatedName("q.l")
    public int field185;

    @ObfuscatedName("q.a")
    public int field186;

    @ObfuscatedName("q.i")
    public int field187;

    @ObfuscatedName("q.f")
    public int field188;

    @ObfuscatedName("q.m")
    public int field189;

    @ObfuscatedName("q.o")
    public class43 field190;

    @ObfuscatedName("q.h")
    public int field184;

    @ObfuscatedName("q.n")
    public int field192;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field191 = arg0;
        this.field185 = arg1;
        this.field186 = arg2;
        this.field187 = arg3;
        this.field188 = arg4;
        this.field189 = arg5;
        if (arg6 != -1) {
            this.field190 = class43.method729(arg6);
            this.field184 = 0;
            this.field192 = client.field395 - 1;
            if (this.field190.field991 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field190 == var10.field190) {
                    this.field184 = var10.field184;
                    this.field192 = var10.field192;
                    return;
                }
            }
            if (arg7 && this.field190.field984 != -1) {
                this.field184 = (int) (Math.random() * (double) this.field190.field987.length);
                this.field192 -= (int) (Math.random() * (double) this.field190.field989[this.field184]);
            }
        }
    }

    @ObfuscatedName("q.a(I)Ldd;")
    public final class105 method14() {
        if (this.field190 != null) {
            int var1 = client.field395 - this.field192;
            if (var1 > 100 && this.field190.field984 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field190.field989[this.field184]) {
                            break label47;
                        }
                        var1 -= this.field190.field989[this.field184];
                        this.field184++;
                    } while (this.field184 < this.field190.field987.length);
                    this.field184 -= this.field190.field984;
                } while (this.field184 >= 0 && this.field184 < this.field190.field987.length);
                this.field190 = null;
            }
            this.field192 = client.field395 - var1;
        }
        class41 var2 = class41.method981(this.field191);
        if (var2.field921 != null) {
            var2 = var2.method809();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field186 == 1 || this.field186 == 3) {
            var3 = var2.field934;
            var4 = var2.field933;
        } else {
            var3 = var2.field933;
            var4 = var2.field934;
        }
        int var5 = (var3 >> 1) + this.field188;
        int var6 = (var3 + 1 >> 1) + this.field188;
        int var7 = (var4 >> 1) + this.field189;
        int var8 = (var4 + 1 >> 1) + this.field189;
        int[][] var9 = class6.field94[this.field187];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field188 << 7) + (var3 << 6);
        int var12 = (this.field189 << 7) + (var4 << 6);
        return var2.method791(this.field185, this.field186, var9, var11, var10, var12, this.field190, this.field184);
    }
}
