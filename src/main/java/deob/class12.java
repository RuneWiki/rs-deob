package deob;

@ObfuscatedName("m")
public class class12 extends class80 {

    @ObfuscatedName("m.o")
    public int field172;

    @ObfuscatedName("m.l")
    public int field161;

    @ObfuscatedName("m.g")
    public int field171;

    @ObfuscatedName("m.u")
    public int field160;

    @ObfuscatedName("m.q")
    public int field162;

    @ObfuscatedName("m.r")
    public int field165;

    @ObfuscatedName("m.v")
    public class40 field166;

    @ObfuscatedName("m.y")
    public int field167;

    @ObfuscatedName("m.k")
    public int field163;

    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class80 arg8) {
        this.field172 = arg0;
        this.field161 = arg1;
        this.field171 = arg2;
        this.field160 = arg3;
        this.field162 = arg4;
        this.field165 = arg5;
        if (arg6 != -1) {
            this.field166 = class40.method567(arg6);
            this.field167 = 0;
            this.field163 = client.field270 - 1;
            if (this.field166.field940 == 0 && arg8 != null && arg8 instanceof class12) {
                class12 var10 = (class12) arg8;
                if (this.field166 == var10.field166) {
                    this.field167 = var10.field167;
                    this.field163 = var10.field163;
                    return;
                }
            }
            if (arg7 && this.field166.field924 != -1) {
                this.field167 = (int) (Math.random() * (double) this.field166.field927.length);
                this.field163 -= (int) (Math.random() * (double) this.field166.field929[this.field167]);
            }
        }
    }

    @ObfuscatedName("m.l(B)Lcq;")
    public final class100 method14() {
        if (this.field166 != null) {
            int var1 = client.field270 - this.field163;
            if (var1 > 100 && this.field166.field924 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field166.field929[this.field167]) {
                            break label47;
                        }
                        var1 -= this.field166.field929[this.field167];
                        this.field167++;
                    } while (this.field167 < this.field166.field927.length);
                    this.field167 -= this.field166.field924;
                } while (this.field167 >= 0 && this.field167 < this.field166.field927.length);
                this.field166 = null;
            }
            this.field163 = client.field270 - var1;
        }
        class38 var2 = class38.method150(this.field172);
        if (var2.field861 != null) {
            var2 = var2.method704();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field171 == 1 || this.field171 == 3) {
            var3 = var2.field875;
            var4 = var2.field874;
        } else {
            var3 = var2.field874;
            var4 = var2.field875;
        }
        int var5 = (var3 >> 1) + this.field162;
        int var6 = (var3 + 1 >> 1) + this.field162;
        int var7 = (var4 >> 1) + this.field165;
        int var8 = (var4 + 1 >> 1) + this.field165;
        int[][] var9 = class6.field88[this.field160];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field162 << 7) + (var3 << 6);
        int var12 = (this.field165 << 7) + (var4 << 6);
        return var2.method729(this.field161, this.field171, var9, var11, var10, var12, this.field166, this.field167);
    }
}
