package deob;

@ObfuscatedName("h")
public class class12 extends class80 {

    @ObfuscatedName("h.e")
    public int field156;

    @ObfuscatedName("h.a")
    public int field167;

    @ObfuscatedName("h.l")
    public int field158;

    @ObfuscatedName("h.c")
    public int field157;

    @ObfuscatedName("h.u")
    public int field160;

    @ObfuscatedName("h.w")
    public int field161;

    @ObfuscatedName("h.i")
    public class40 field159;

    @ObfuscatedName("h.r")
    public int field163;

    @ObfuscatedName("h.f")
    public int field162;

    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class80 arg8) {
        this.field156 = arg0;
        this.field167 = arg1;
        this.field158 = arg2;
        this.field157 = arg3;
        this.field160 = arg4;
        this.field161 = arg5;
        if (arg6 != -1) {
            this.field159 = class40.method1826(arg6);
            this.field163 = 0;
            this.field162 = client.field256 - 1;
            if (this.field159.field905 == 0 && arg8 != null && arg8 instanceof class12) {
                class12 var10 = (class12) arg8;
                if (this.field159 == var10.field159) {
                    this.field163 = var10.field163;
                    this.field162 = var10.field162;
                    return;
                }
            }
            if (arg7 && this.field159.field902 != -1) {
                this.field163 = (int) (Math.random() * (double) this.field159.field898.length);
                this.field162 -= (int) (Math.random() * (double) this.field159.field894[this.field163]);
            }
        }
    }

    @ObfuscatedName("h.a(I)Lcy;")
    public final class100 method30() {
        if (this.field159 != null) {
            int var1 = client.field256 - this.field162;
            if (var1 > 100 && this.field159.field902 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field159.field894[this.field163]) {
                            break label47;
                        }
                        var1 -= this.field159.field894[this.field163];
                        this.field163++;
                    } while (this.field163 < this.field159.field898.length);
                    this.field163 -= this.field159.field902;
                } while (this.field163 >= 0 && this.field163 < this.field159.field898.length);
                this.field159 = null;
            }
            this.field162 = client.field256 - var1;
        }
        class38 var2 = class38.method189(this.field156);
        if (var2.field870 != null) {
            var2 = var2.method689();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field158 == 1 || this.field158 == 3) {
            var3 = var2.field845;
            var4 = var2.field867;
        } else {
            var3 = var2.field867;
            var4 = var2.field845;
        }
        int var5 = (var3 >> 1) + this.field160;
        int var6 = (var3 + 1 >> 1) + this.field160;
        int var7 = (var4 >> 1) + this.field161;
        int var8 = (var4 + 1 >> 1) + this.field161;
        int[][] var9 = class6.field78[this.field157];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field160 << 7) + (var3 << 6);
        int var12 = (this.field161 << 7) + (var4 << 6);
        return var2.method700(this.field167, this.field158, var9, var11, var10, var12, this.field159, this.field163);
    }
}
