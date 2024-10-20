package deob;

@ObfuscatedName("h")
public class class13 extends class93 {

    @ObfuscatedName("h.v")
    public int field225;

    @ObfuscatedName("h.f")
    public int field211;

    @ObfuscatedName("h.n")
    public int field212;

    @ObfuscatedName("h.c")
    public int field213;

    @ObfuscatedName("h.r")
    public int field210;

    @ObfuscatedName("h.k")
    public int field215;

    @ObfuscatedName("h.e")
    public class33 field216;

    @ObfuscatedName("h.q")
    public int field218;

    @ObfuscatedName("h.u")
    public int field214;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class93 arg8) {
        this.field225 = arg0;
        this.field211 = arg1;
        this.field212 = arg2;
        this.field213 = arg3;
        this.field210 = arg4;
        this.field215 = arg5;
        if (arg6 != -1) {
            this.field216 = class33.method1401(arg6);
            this.field218 = 0;
            this.field214 = client.field510 - 1;
            if (this.field216.field874 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field216 == var10.field216) {
                    this.field218 = var10.field218;
                    this.field214 = var10.field214;
                    return;
                }
            }
            if (arg7 && this.field216.field865 != -1) {
                this.field218 = (int) (Math.random() * (double) this.field216.field861.length);
                this.field214 -= (int) (Math.random() * (double) this.field216.field864[this.field218]);
            }
        }
    }

    @ObfuscatedName("h.f(I)Ldf;")
    public final class111 method13() {
        if (this.field216 != null) {
            int var1 = client.field510 - this.field214;
            if (var1 > 100 && this.field216.field865 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field216.field864[this.field218]) {
                            break label47;
                        }
                        var1 -= this.field216.field864[this.field218];
                        this.field218++;
                    } while (this.field218 < this.field216.field861.length);
                    this.field218 -= this.field216.field865;
                } while (this.field218 >= 0 && this.field218 < this.field216.field861.length);
                this.field216 = null;
            }
            this.field214 = client.field510 - var1;
        }
        class31 var2 = class31.method195(this.field225);
        if (var2.field794 != null) {
            var2 = var2.method648();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field212 == 1 || this.field212 == 3) {
            var3 = var2.field810;
            var4 = var2.field809;
        } else {
            var3 = var2.field809;
            var4 = var2.field810;
        }
        int var5 = (var3 >> 1) + this.field210;
        int var6 = (var3 + 1 >> 1) + this.field210;
        int var7 = (var4 >> 1) + this.field215;
        int var8 = (var4 + 1 >> 1) + this.field215;
        int[][] var9 = class9.field135[this.field213];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field210 << 7) + (var3 << 6);
        int var12 = (this.field215 << 7) + (var4 << 6);
        return var2.method654(this.field211, this.field212, var9, var11, var10, var12, this.field216, this.field218);
    }
}
