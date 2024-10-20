package deob;

@ObfuscatedName("k")
public class class11 extends class79 {

    @ObfuscatedName("k.a")
    public int field173;

    @ObfuscatedName("k.v")
    public int field164;

    @ObfuscatedName("k.i")
    public int field165;

    @ObfuscatedName("k.b")
    public int field177;

    @ObfuscatedName("k.l")
    public int field163;

    @ObfuscatedName("k.m")
    public int field171;

    @ObfuscatedName("k.w")
    public class39 field169;

    @ObfuscatedName("k.e")
    public int field170;

    @ObfuscatedName("k.n")
    public int field166;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class79 arg8) {
        this.field173 = arg0;
        this.field164 = arg1;
        this.field165 = arg2;
        this.field177 = arg3;
        this.field163 = arg4;
        this.field171 = arg5;
        if (arg6 != -1) {
            this.field169 = Statics.method97(arg6);
            this.field170 = 0;
            this.field166 = client.field266 - 1;
            if (this.field169.field910 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field169 == var10.field169) {
                    this.field170 = var10.field170;
                    this.field166 = var10.field166;
                    return;
                }
            }
            if (arg7 && this.field169.field914 != -1) {
                this.field170 = (int) (Math.random() * (double) this.field169.field911.length);
                this.field166 -= (int) (Math.random() * (double) this.field169.field912[this.field170]);
            }
        }
    }

    @ObfuscatedName("k.v(I)Lcl;")
    public final class99 method24() {
        if (this.field169 != null) {
            int var1 = client.field266 - this.field166;
            if (var1 > 100 && this.field169.field914 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field169.field912[this.field170]) {
                            break label47;
                        }
                        var1 -= this.field169.field912[this.field170];
                        this.field170++;
                    } while (this.field170 < this.field169.field911.length);
                    this.field170 -= this.field169.field914;
                } while (this.field170 >= 0 && this.field170 < this.field169.field911.length);
                this.field169 = null;
            }
            this.field166 = client.field266 - var1;
        }
        class37 var2 = class37.method2964(this.field173);
        if (var2.field884 != null) {
            var2 = var2.method675();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field165 == 1 || this.field165 == 3) {
            var3 = var2.field859;
            var4 = var2.field858;
        } else {
            var3 = var2.field858;
            var4 = var2.field859;
        }
        int var5 = (var3 >> 1) + this.field163;
        int var6 = (var3 + 1 >> 1) + this.field163;
        int var7 = (var4 >> 1) + this.field171;
        int var8 = (var4 + 1 >> 1) + this.field171;
        int[][] var9 = class6.field94[this.field177];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field163 << 7) + (var3 << 6);
        int var12 = (this.field171 << 7) + (var4 << 6);
        return var2.method668(this.field164, this.field165, var9, var11, var10, var12, this.field169, this.field170);
    }
}
