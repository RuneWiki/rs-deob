package deob;

@ObfuscatedName("k")
public class class10 extends class75 {

    @ObfuscatedName("k.z")
    public int field172;

    @ObfuscatedName("k.n")
    public int field162;

    @ObfuscatedName("k.u")
    public int field163;

    @ObfuscatedName("k.t")
    public int field164;

    @ObfuscatedName("k.e")
    public int field168;

    @ObfuscatedName("k.a")
    public int field166;

    @ObfuscatedName("k.l")
    public class35 field165;

    @ObfuscatedName("k.v")
    public int field167;

    @ObfuscatedName("k.j")
    public int field169;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class75 arg8) {
        this.field172 = arg0;
        this.field162 = arg1;
        this.field163 = arg2;
        this.field164 = arg3;
        this.field168 = arg4;
        this.field166 = arg5;
        if (arg6 != -1) {
            this.field165 = class35.method2065(arg6);
            this.field167 = 0;
            this.field169 = client.field270 - 1;
            if (this.field165.field894 == 0 && arg8 != null && arg8 instanceof class10) {
                class10 var10 = (class10) arg8;
                if (this.field165 == var10.field165) {
                    this.field167 = var10.field167;
                    this.field169 = var10.field169;
                    return;
                }
            }
            if (arg7 && this.field165.field885 != -1) {
                this.field167 = (int) (Math.random() * (double) this.field165.field876.length);
                this.field169 -= (int) (Math.random() * (double) this.field165.field877[this.field167]);
            }
        }
    }

    @ObfuscatedName("k.n(I)Lcp;")
    public final class95 method19() {
        if (this.field165 != null) {
            int var1 = client.field270 - this.field169;
            if (var1 > 100 && this.field165.field885 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field165.field877[this.field167]) {
                            break label47;
                        }
                        var1 -= this.field165.field877[this.field167];
                        this.field167++;
                    } while (this.field167 < this.field165.field876.length);
                    this.field167 -= this.field165.field885;
                } while (this.field167 >= 0 && this.field167 < this.field165.field876.length);
                this.field165 = null;
            }
            this.field169 = client.field270 - var1;
        }
        class33 var2 = class33.method115(this.field172);
        if (var2.field842 != null) {
            var2 = var2.method676();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field163 == 1 || this.field163 == 3) {
            var3 = var2.field836;
            var4 = var2.field828;
        } else {
            var3 = var2.field828;
            var4 = var2.field836;
        }
        int var5 = (var3 >> 1) + this.field168;
        int var6 = (var3 + 1 >> 1) + this.field168;
        int var7 = (var4 >> 1) + this.field166;
        int var8 = (var4 + 1 >> 1) + this.field166;
        int[][] var9 = class6.field103[this.field164];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field168 << 7) + (var3 << 6);
        int var12 = (this.field166 << 7) + (var4 << 6);
        return var2.method652(this.field162, this.field163, var9, var11, var10, var12, this.field165, this.field167);
    }
}
