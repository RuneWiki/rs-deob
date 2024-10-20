package deob;

@ObfuscatedName("h")
public class class11 extends class78 {

    @ObfuscatedName("h.p")
    public int field175;

    @ObfuscatedName("h.g")
    public int field163;

    @ObfuscatedName("h.x")
    public int field162;

    @ObfuscatedName("h.c")
    public int field165;

    @ObfuscatedName("h.n")
    public int field166;

    @ObfuscatedName("h.s")
    public int field173;

    @ObfuscatedName("h.r")
    public class38 field168;

    @ObfuscatedName("h.w")
    public int field169;

    @ObfuscatedName("h.u")
    public int field170;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field175 = arg0;
        this.field163 = arg1;
        this.field162 = arg2;
        this.field165 = arg3;
        this.field166 = arg4;
        this.field173 = arg5;
        if (arg6 != -1) {
            this.field168 = class38.method507(arg6);
            this.field169 = 0;
            this.field170 = client.field343 - 1;
            if (this.field168.field900 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field168 == var10.field168) {
                    this.field169 = var10.field169;
                    this.field170 = var10.field170;
                    return;
                }
            }
            if (arg7 && this.field168.field909 != -1) {
                this.field169 = (int) (Math.random() * (double) this.field168.field905.length);
                this.field170 -= (int) (Math.random() * (double) this.field168.field907[this.field169]);
            }
        }
    }

    @ObfuscatedName("h.g(I)Lcn;")
    public final class98 method20() {
        if (this.field168 != null) {
            int var1 = client.field343 - this.field170;
            if (var1 > 100 && this.field168.field909 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field168.field907[this.field169]) {
                            break label47;
                        }
                        var1 -= this.field168.field907[this.field169];
                        this.field169++;
                    } while (this.field169 < this.field168.field905.length);
                    this.field169 -= this.field168.field909;
                } while (this.field169 >= 0 && this.field169 < this.field168.field905.length);
                this.field168 = null;
            }
            this.field170 = client.field343 - var1;
        }
        class36 var2 = class36.method2523(this.field175);
        if (var2.field881 != null) {
            var2 = var2.method686();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field162 == 1 || this.field162 == 3) {
            var3 = var2.field873;
            var4 = var2.field853;
        } else {
            var3 = var2.field853;
            var4 = var2.field873;
        }
        int var5 = (var3 >> 1) + this.field166;
        int var6 = (var3 + 1 >> 1) + this.field166;
        int var7 = (var4 >> 1) + this.field173;
        int var8 = (var4 + 1 >> 1) + this.field173;
        int[][] var9 = class6.field84[this.field165];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field166 << 7) + (var3 << 6);
        int var12 = (this.field173 << 7) + (var4 << 6);
        return var2.method669(this.field163, this.field162, var9, var11, var10, var12, this.field168, this.field169);
    }
}
