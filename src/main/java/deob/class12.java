package deob;

@ObfuscatedName("u")
public class class12 extends class80 {

    @ObfuscatedName("u.n")
    public int field170;

    @ObfuscatedName("u.d")
    public int field169;

    @ObfuscatedName("u.z")
    public int field162;

    @ObfuscatedName("u.y")
    public int field163;

    @ObfuscatedName("u.e")
    public int field164;

    @ObfuscatedName("u.g")
    public int field165;

    @ObfuscatedName("u.f")
    public class40 field166;

    @ObfuscatedName("u.m")
    public int field171;

    @ObfuscatedName("u.a")
    public int field168;

    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class80 arg8) {
        this.field170 = arg0;
        this.field169 = arg1;
        this.field162 = arg2;
        this.field163 = arg3;
        this.field164 = arg4;
        this.field165 = arg5;
        if (arg6 != -1) {
            this.field166 = class40.method3092(arg6);
            this.field171 = 0;
            this.field168 = client.field249 - 1;
            if (this.field166.field942 == 0 && arg8 != null && arg8 instanceof class12) {
                class12 var10 = (class12) arg8;
                if (this.field166 == var10.field166) {
                    this.field171 = var10.field171;
                    this.field168 = var10.field168;
                    return;
                }
            }
            if (arg7 && this.field166.field933 != -1) {
                this.field171 = (int) (Math.random() * (double) this.field166.field939.length);
                this.field168 -= (int) (Math.random() * (double) this.field166.field934[this.field171]);
            }
        }
    }

    @ObfuscatedName("u.d(B)Lcg;")
    public final class100 method25() {
        if (this.field166 != null) {
            int var1 = client.field249 - this.field168;
            if (var1 > 100 && this.field166.field933 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field166.field934[this.field171]) {
                            break label47;
                        }
                        var1 -= this.field166.field934[this.field171];
                        this.field171++;
                    } while (this.field171 < this.field166.field939.length);
                    this.field171 -= this.field166.field933;
                } while (this.field171 >= 0 && this.field171 < this.field166.field939.length);
                this.field166 = null;
            }
            this.field168 = client.field249 - var1;
        }
        class38 var2 = class38.method1667(this.field170);
        if (var2.field902 != null) {
            var2 = var2.method731();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field162 == 1 || this.field162 == 3) {
            var3 = var2.field872;
            var4 = var2.field877;
        } else {
            var3 = var2.field877;
            var4 = var2.field872;
        }
        int var5 = (var3 >> 1) + this.field164;
        int var6 = (var3 + 1 >> 1) + this.field164;
        int var7 = (var4 >> 1) + this.field165;
        int var8 = (var4 + 1 >> 1) + this.field165;
        int[][] var9 = class6.field75[this.field163];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field164 << 7) + (var3 << 6);
        int var12 = (this.field165 << 7) + (var4 << 6);
        return var2.method720(this.field169, this.field162, var9, var11, var10, var12, this.field166, this.field171);
    }
}
