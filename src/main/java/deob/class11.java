package deob;

@ObfuscatedName("a")
public class class11 extends class78 {

    @ObfuscatedName("a.g")
    public int field165;

    @ObfuscatedName("a.v")
    public int field159;

    @ObfuscatedName("a.z")
    public int field161;

    @ObfuscatedName("a.h")
    public int field169;

    @ObfuscatedName("a.k")
    public int field163;

    @ObfuscatedName("a.l")
    public int field162;

    @ObfuscatedName("a.e")
    public class38 field164;

    @ObfuscatedName("a.j")
    public int field166;

    @ObfuscatedName("a.n")
    public int field167;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field165 = arg0;
        this.field159 = arg1;
        this.field161 = arg2;
        this.field169 = arg3;
        this.field163 = arg4;
        this.field162 = arg5;
        if (arg6 != -1) {
            this.field164 = class38.method1996(arg6);
            this.field166 = 0;
            this.field167 = client.field259 - 1;
            if (this.field164.field914 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field164 == var10.field164) {
                    this.field166 = var10.field166;
                    this.field167 = var10.field167;
                    return;
                }
            }
            if (arg7 && this.field164.field905 != -1) {
                this.field166 = (int) (Math.random() * (double) this.field164.field901.length);
                this.field167 -= (int) (Math.random() * (double) this.field164.field903[this.field166]);
            }
        }
    }

    @ObfuscatedName("a.v(B)Lce;")
    public final class98 method25() {
        if (this.field164 != null) {
            int var1 = client.field259 - this.field167;
            if (var1 > 100 && this.field164.field905 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field164.field903[this.field166]) {
                            break label47;
                        }
                        var1 -= this.field164.field903[this.field166];
                        this.field166++;
                    } while (this.field166 < this.field164.field901.length);
                    this.field166 -= this.field164.field905;
                } while (this.field166 >= 0 && this.field166 < this.field164.field901.length);
                this.field164 = null;
            }
            this.field167 = client.field259 - var1;
        }
        class36 var2 = class36.method505(this.field165);
        if (var2.field872 != null) {
            var2 = var2.method648();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field161 == 1 || this.field161 == 3) {
            var3 = var2.field847;
            var4 = var2.field846;
        } else {
            var3 = var2.field846;
            var4 = var2.field847;
        }
        int var5 = (var3 >> 1) + this.field163;
        int var6 = (var3 + 1 >> 1) + this.field163;
        int var7 = (var4 >> 1) + this.field162;
        int var8 = (var4 + 1 >> 1) + this.field162;
        int[][] var9 = class6.field86[this.field169];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field163 << 7) + (var3 << 6);
        int var12 = (this.field162 << 7) + (var4 << 6);
        return var2.method641(this.field159, this.field161, var9, var11, var10, var12, this.field164, this.field166);
    }
}
