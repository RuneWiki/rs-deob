package deob;

@ObfuscatedName("j")
public class class11 extends class79 {

    @ObfuscatedName("j.e")
    public int field163;

    @ObfuscatedName("j.v")
    public int field159;

    @ObfuscatedName("j.k")
    public int field160;

    @ObfuscatedName("j.g")
    public int field161;

    @ObfuscatedName("j.q")
    public int field162;

    @ObfuscatedName("j.l")
    public int field166;

    @ObfuscatedName("j.a")
    public class39 field164;

    @ObfuscatedName("j.b")
    public int field165;

    @ObfuscatedName("j.z")
    public int field168;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class79 arg8) {
        this.field163 = arg0;
        this.field159 = arg1;
        this.field160 = arg2;
        this.field161 = arg3;
        this.field162 = arg4;
        this.field166 = arg5;
        if (arg6 != -1) {
            this.field164 = class39.method2315(arg6);
            this.field165 = 0;
            this.field168 = client.field418 - 1;
            if (this.field164.field921 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field164 == var10.field164) {
                    this.field165 = var10.field165;
                    this.field168 = var10.field168;
                    return;
                }
            }
            if (arg7 && this.field164.field919 != -1) {
                this.field165 = (int) (Math.random() * (double) this.field164.field925.length);
                this.field168 -= (int) (Math.random() * (double) this.field164.field917[this.field165]);
            }
        }
    }

    @ObfuscatedName("j.v(B)Lcu;")
    public final class99 method14() {
        if (this.field164 != null) {
            int var1 = client.field418 - this.field168;
            if (var1 > 100 && this.field164.field919 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field164.field917[this.field165]) {
                            break label47;
                        }
                        var1 -= this.field164.field917[this.field165];
                        this.field165++;
                    } while (this.field165 < this.field164.field925.length);
                    this.field165 -= this.field164.field919;
                } while (this.field165 >= 0 && this.field165 < this.field164.field925.length);
                this.field164 = null;
            }
            this.field168 = client.field418 - var1;
        }
        class37 var2 = class37.method2581(this.field163);
        if (var2.field884 != null) {
            var2 = var2.method661();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field160 == 1 || this.field160 == 3) {
            var3 = var2.field859;
            var4 = var2.field858;
        } else {
            var3 = var2.field858;
            var4 = var2.field859;
        }
        int var5 = (var3 >> 1) + this.field162;
        int var6 = (var3 + 1 >> 1) + this.field162;
        int var7 = (var4 >> 1) + this.field166;
        int var8 = (var4 + 1 >> 1) + this.field166;
        int[][] var9 = class6.field84[this.field161];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field162 << 7) + (var3 << 6);
        int var12 = (this.field166 << 7) + (var4 << 6);
        return var2.method636(this.field159, this.field160, var9, var11, var10, var12, this.field164, this.field165);
    }
}
