package deob;

@ObfuscatedName("b")
public class class11 extends class78 {

    @ObfuscatedName("b.g")
    public int field163;

    @ObfuscatedName("b.i")
    public int field180;

    @ObfuscatedName("b.k")
    public int field179;

    @ObfuscatedName("b.e")
    public int field162;

    @ObfuscatedName("b.w")
    public int field165;

    @ObfuscatedName("b.m")
    public int field166;

    @ObfuscatedName("b.u")
    public class38 field167;

    @ObfuscatedName("b.j")
    public int field169;

    @ObfuscatedName("b.o")
    public int field176;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field163 = arg0;
        this.field180 = arg1;
        this.field179 = arg2;
        this.field162 = arg3;
        this.field165 = arg4;
        this.field166 = arg5;
        if (arg6 != -1) {
            this.field167 = class38.method552(arg6);
            this.field169 = 0;
            this.field176 = client.field269 - 1;
            if (this.field167.field925 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field167 == var10.field167) {
                    this.field169 = var10.field169;
                    this.field176 = var10.field176;
                    return;
                }
            }
            if (arg7 && this.field167.field927 != -1) {
                this.field169 = (int) (Math.random() * (double) this.field167.field921.length);
                this.field176 -= (int) (Math.random() * (double) this.field167.field910[this.field169]);
            }
        }
    }

    @ObfuscatedName("b.i(I)Lce;")
    public final class98 method14() {
        if (this.field167 != null) {
            int var1 = client.field269 - this.field176;
            if (var1 > 100 && this.field167.field927 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field167.field910[this.field169]) {
                            break label47;
                        }
                        var1 -= this.field167.field910[this.field169];
                        this.field169++;
                    } while (this.field169 < this.field167.field921.length);
                    this.field169 -= this.field167.field927;
                } while (this.field169 >= 0 && this.field169 < this.field167.field921.length);
                this.field167 = null;
            }
            this.field176 = client.field269 - var1;
        }
        class36 var2 = class36.method1847(this.field163);
        if (var2.field867 != null) {
            var2 = var2.method633();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field179 == 1 || this.field179 == 3) {
            var3 = var2.field862;
            var4 = var2.field868;
        } else {
            var3 = var2.field868;
            var4 = var2.field862;
        }
        int var5 = (var3 >> 1) + this.field165;
        int var6 = (var3 + 1 >> 1) + this.field165;
        int var7 = (var4 >> 1) + this.field166;
        int var8 = (var4 + 1 >> 1) + this.field166;
        int[][] var9 = class6.field82[this.field162];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field165 << 7) + (var3 << 6);
        int var12 = (this.field166 << 7) + (var4 << 6);
        return var2.method651(this.field180, this.field179, var9, var11, var10, var12, this.field167, this.field169);
    }
}
