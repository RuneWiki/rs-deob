package deob;

@ObfuscatedName("c")
public class class11 extends class78 {

    @ObfuscatedName("c.e")
    public int field182;

    @ObfuscatedName("c.p")
    public int field167;

    @ObfuscatedName("c.a")
    public int field169;

    @ObfuscatedName("c.g")
    public int field170;

    @ObfuscatedName("c.u")
    public int field171;

    @ObfuscatedName("c.k")
    public int field172;

    @ObfuscatedName("c.m")
    public class38 field173;

    @ObfuscatedName("c.t")
    public int field174;

    @ObfuscatedName("c.l")
    public int field175;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field182 = arg0;
        this.field167 = arg1;
        this.field169 = arg2;
        this.field170 = arg3;
        this.field171 = arg4;
        this.field172 = arg5;
        if (arg6 != -1) {
            this.field173 = class38.method81(arg6);
            this.field174 = 0;
            this.field175 = client.field265 - 1;
            if (this.field173.field901 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field173 == var10.field173) {
                    this.field174 = var10.field174;
                    this.field175 = var10.field175;
                    return;
                }
            }
            if (arg7 && this.field173.field897 != -1) {
                this.field174 = (int) (Math.random() * (double) this.field173.field907.length);
                this.field175 -= (int) (Math.random() * (double) this.field173.field909[this.field174]);
            }
        }
    }

    @ObfuscatedName("c.p(B)Lcs;")
    public final class98 method12() {
        if (this.field173 != null) {
            int var1 = client.field265 - this.field175;
            if (var1 > 100 && this.field173.field897 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field173.field909[this.field174]) {
                            break label47;
                        }
                        var1 -= this.field173.field909[this.field174];
                        this.field174++;
                    } while (this.field174 < this.field173.field907.length);
                    this.field174 -= this.field173.field897;
                } while (this.field174 >= 0 && this.field174 < this.field173.field907.length);
                this.field173 = null;
            }
            this.field175 = client.field265 - var1;
        }
        class36 var2 = class36.method1794(this.field182);
        if (var2.field866 != null) {
            var2 = var2.method649();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field169 == 1 || this.field169 == 3) {
            var3 = var2.field824;
            var4 = var2.field840;
        } else {
            var3 = var2.field840;
            var4 = var2.field824;
        }
        int var5 = (var3 >> 1) + this.field171;
        int var6 = (var3 + 1 >> 1) + this.field171;
        int var7 = (var4 >> 1) + this.field172;
        int var8 = (var4 + 1 >> 1) + this.field172;
        int[][] var9 = class6.field91[this.field170];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field171 << 7) + (var3 << 6);
        int var12 = (this.field172 << 7) + (var4 << 6);
        return var2.method686(this.field167, this.field169, var9, var11, var10, var12, this.field173, this.field174);
    }
}
