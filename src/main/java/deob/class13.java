package deob;

@ObfuscatedName("w")
public class class13 extends class85 {

    @ObfuscatedName("w.v")
    public int field191;

    @ObfuscatedName("w.f")
    public int field184;

    @ObfuscatedName("w.i")
    public int field193;

    @ObfuscatedName("w.d")
    public int field186;

    @ObfuscatedName("w.o")
    public int field187;

    @ObfuscatedName("w.c")
    public int field188;

    @ObfuscatedName("w.p")
    public class43 field185;

    @ObfuscatedName("w.j")
    public int field183;

    @ObfuscatedName("w.a")
    public int field195;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field191 = arg0;
        this.field184 = arg1;
        this.field193 = arg2;
        this.field186 = arg3;
        this.field187 = arg4;
        this.field188 = arg5;
        if (arg6 != -1) {
            this.field185 = class43.method616(arg6);
            this.field183 = 0;
            this.field195 = client.field298 - 1;
            if (this.field185.field994 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field185 == var10.field185) {
                    this.field183 = var10.field183;
                    this.field195 = var10.field195;
                    return;
                }
            }
            if (arg7 && this.field185.field985 != -1) {
                this.field183 = (int) (Math.random() * (double) this.field185.field984.length);
                this.field195 -= (int) (Math.random() * (double) this.field185.field978[this.field183]);
            }
        }
    }

    @ObfuscatedName("w.i(I)Ldq;")
    public final class105 method9() {
        if (this.field185 != null) {
            int var1 = client.field298 - this.field195;
            if (var1 > 100 && this.field185.field985 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field185.field978[this.field183]) {
                            break label47;
                        }
                        var1 -= this.field185.field978[this.field183];
                        this.field183++;
                    } while (this.field183 < this.field185.field984.length);
                    this.field183 -= this.field185.field985;
                } while (this.field183 >= 0 && this.field183 < this.field185.field984.length);
                this.field185 = null;
            }
            this.field195 = client.field298 - var1;
        }
        class41 var2 = class41.method151(this.field191);
        if (var2.field958 != null) {
            var2 = var2.method780();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field193 == 1 || this.field193 == 3) {
            var3 = var2.field933;
            var4 = var2.field928;
        } else {
            var3 = var2.field928;
            var4 = var2.field933;
        }
        int var5 = (var3 >> 1) + this.field187;
        int var6 = (var3 + 1 >> 1) + this.field187;
        int var7 = (var4 >> 1) + this.field188;
        int var8 = (var4 + 1 >> 1) + this.field188;
        int[][] var9 = class6.field101[this.field186];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field187 << 7) + (var3 << 6);
        int var12 = (this.field188 << 7) + (var4 << 6);
        return var2.method778(this.field184, this.field193, var9, var11, var10, var12, this.field185, this.field183);
    }
}
