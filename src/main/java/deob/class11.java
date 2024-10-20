package deob;

@ObfuscatedName("x")
public class class11 extends class78 {

    @ObfuscatedName("x.k")
    public int field167;

    @ObfuscatedName("x.r")
    public int field163;

    @ObfuscatedName("x.y")
    public int field164;

    @ObfuscatedName("x.w")
    public int field168;

    @ObfuscatedName("x.m")
    public int field166;

    @ObfuscatedName("x.j")
    public int field162;

    @ObfuscatedName("x.g")
    public class38 field171;

    @ObfuscatedName("x.p")
    public int field169;

    @ObfuscatedName("x.o")
    public int field170;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field167 = arg0;
        this.field163 = arg1;
        this.field164 = arg2;
        this.field168 = arg3;
        this.field166 = arg4;
        this.field162 = arg5;
        if (arg6 != -1) {
            this.field171 = class38.method102(arg6);
            this.field169 = 0;
            this.field170 = client.field261 - 1;
            if (this.field171.field918 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field171 == var10.field171) {
                    this.field169 = var10.field169;
                    this.field170 = var10.field170;
                    return;
                }
            }
            if (arg7 && this.field171.field909 != -1) {
                this.field169 = (int) (Math.random() * (double) this.field171.field900.length);
                this.field170 -= (int) (Math.random() * (double) this.field171.field905[this.field169]);
            }
        }
    }

    @ObfuscatedName("x.r(I)Lcp;")
    public final class98 method24() {
        if (this.field171 != null) {
            int var1 = client.field261 - this.field170;
            if (var1 > 100 && this.field171.field909 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field171.field905[this.field169]) {
                            break label47;
                        }
                        var1 -= this.field171.field905[this.field169];
                        this.field169++;
                    } while (this.field169 < this.field171.field900.length);
                    this.field169 -= this.field171.field909;
                } while (this.field169 >= 0 && this.field169 < this.field171.field900.length);
                this.field171 = null;
            }
            this.field170 = client.field261 - var1;
        }
        class36 var2 = class36.method147(this.field167);
        if (var2.field879 != null) {
            var2 = var2.method636();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field164 == 1 || this.field164 == 3) {
            var3 = var2.field846;
            var4 = var2.field854;
        } else {
            var3 = var2.field854;
            var4 = var2.field846;
        }
        int var5 = (var3 >> 1) + this.field166;
        int var6 = (var3 + 1 >> 1) + this.field166;
        int var7 = (var4 >> 1) + this.field162;
        int var8 = (var4 + 1 >> 1) + this.field162;
        int[][] var9 = class6.field78[this.field168];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field166 << 7) + (var3 << 6);
        int var12 = (this.field162 << 7) + (var4 << 6);
        return var2.method634(this.field163, this.field164, var9, var11, var10, var12, this.field171, this.field169);
    }
}
