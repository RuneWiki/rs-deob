package deob;

@ObfuscatedName("w")
public class class11 extends class78 {

    @ObfuscatedName("w.t")
    public int field168;

    @ObfuscatedName("w.o")
    public int field162;

    @ObfuscatedName("w.i")
    public int field163;

    @ObfuscatedName("w.p")
    public int field166;

    @ObfuscatedName("w.c")
    public int field174;

    @ObfuscatedName("w.y")
    public int field165;

    @ObfuscatedName("w.g")
    public class38 field167;

    @ObfuscatedName("w.l")
    public int field172;

    @ObfuscatedName("w.h")
    public int field169;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field168 = arg0;
        this.field162 = arg1;
        this.field163 = arg2;
        this.field166 = arg3;
        this.field174 = arg4;
        this.field165 = arg5;
        if (arg6 != -1) {
            this.field167 = class38.method1579(arg6);
            this.field172 = 0;
            this.field169 = client.field274 - 1;
            if (this.field167.field909 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field167 == var10.field167) {
                    this.field172 = var10.field172;
                    this.field169 = var10.field169;
                    return;
                }
            }
            if (arg7 && this.field167.field900 != -1) {
                this.field172 = (int) (Math.random() * (double) this.field167.field896.length);
                this.field169 -= (int) (Math.random() * (double) this.field167.field905[this.field172]);
            }
        }
    }

    @ObfuscatedName("w.o(I)Lcx;")
    public final class98 method21() {
        if (this.field167 != null) {
            int var1 = client.field274 - this.field169;
            if (var1 > 100 && this.field167.field900 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field167.field905[this.field172]) {
                            break label47;
                        }
                        var1 -= this.field167.field905[this.field172];
                        this.field172++;
                    } while (this.field172 < this.field167.field896.length);
                    this.field172 -= this.field167.field900;
                } while (this.field172 >= 0 && this.field172 < this.field167.field896.length);
                this.field167 = null;
            }
            this.field169 = client.field274 - var1;
        }
        class36 var2 = class36.method3(this.field168);
        if (var2.field866 != null) {
            var2 = var2.method648();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field163 == 1 || this.field163 == 3) {
            var3 = var2.field841;
            var4 = var2.field856;
        } else {
            var3 = var2.field856;
            var4 = var2.field841;
        }
        int var5 = (var3 >> 1) + this.field174;
        int var6 = (var3 + 1 >> 1) + this.field174;
        int var7 = (var4 >> 1) + this.field165;
        int var8 = (var4 + 1 >> 1) + this.field165;
        int[][] var9 = class6.field82[this.field166];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field174 << 7) + (var3 << 6);
        int var12 = (this.field165 << 7) + (var4 << 6);
        return var2.method646(this.field162, this.field163, var9, var11, var10, var12, this.field167, this.field172);
    }
}
