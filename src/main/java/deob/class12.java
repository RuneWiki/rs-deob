package deob;

@ObfuscatedName("y")
public class class12 extends class80 {

    @ObfuscatedName("y.n")
    public int field180;

    @ObfuscatedName("y.w")
    public int field162;

    @ObfuscatedName("y.i")
    public int field161;

    @ObfuscatedName("y.e")
    public int field164;

    @ObfuscatedName("y.h")
    public int field165;

    @ObfuscatedName("y.q")
    public int field166;

    @ObfuscatedName("y.l")
    public class40 field167;

    @ObfuscatedName("y.c")
    public int field168;

    @ObfuscatedName("y.f")
    public int field169;

    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class80 arg8) {
        this.field180 = arg0;
        this.field162 = arg1;
        this.field161 = arg2;
        this.field164 = arg3;
        this.field165 = arg4;
        this.field166 = arg5;
        if (arg6 != -1) {
            this.field167 = class40.method122(arg6);
            this.field168 = 0;
            this.field169 = client.field268 - 1;
            if (this.field167.field949 == 0 && arg8 != null && arg8 instanceof class12) {
                class12 var10 = (class12) arg8;
                if (this.field167 == var10.field167) {
                    this.field168 = var10.field168;
                    this.field169 = var10.field169;
                    return;
                }
            }
            if (arg7 && this.field167.field940 != -1) {
                this.field168 = (int) (Math.random() * (double) this.field167.field936.length);
                this.field169 -= (int) (Math.random() * (double) this.field167.field938[this.field168]);
            }
        }
    }

    @ObfuscatedName("y.w(B)Lcw;")
    public final class100 method12() {
        if (this.field167 != null) {
            int var1 = client.field268 - this.field169;
            if (var1 > 100 && this.field167.field940 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field167.field938[this.field168]) {
                            break label47;
                        }
                        var1 -= this.field167.field938[this.field168];
                        this.field168++;
                    } while (this.field168 < this.field167.field936.length);
                    this.field168 -= this.field167.field940;
                } while (this.field168 >= 0 && this.field168 < this.field167.field936.length);
                this.field167 = null;
            }
            this.field169 = client.field268 - var1;
        }
        class38 var2 = class38.method595(this.field180);
        if (var2.field889 != null) {
            var2 = var2.method684();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field161 == 1 || this.field161 == 3) {
            var3 = var2.field905;
            var4 = var2.field882;
        } else {
            var3 = var2.field882;
            var4 = var2.field905;
        }
        int var5 = (var3 >> 1) + this.field165;
        int var6 = (var3 + 1 >> 1) + this.field165;
        int var7 = (var4 >> 1) + this.field166;
        int var8 = (var4 + 1 >> 1) + this.field166;
        int[][] var9 = class6.field83[this.field164];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field165 << 7) + (var3 << 6);
        int var12 = (this.field166 << 7) + (var4 << 6);
        return var2.method682(this.field162, this.field161, var9, var11, var10, var12, this.field167, this.field168);
    }
}
