package deob;

@ObfuscatedName("h")
public class class11 extends class79 {

    @ObfuscatedName("h.g")
    public int field153;

    @ObfuscatedName("h.j")
    public int field152;

    @ObfuscatedName("h.z")
    public int field150;

    @ObfuscatedName("h.b")
    public int field149;

    @ObfuscatedName("h.k")
    public int field148;

    @ObfuscatedName("h.c")
    public int field157;

    @ObfuscatedName("h.w")
    public class39 field154;

    @ObfuscatedName("h.l")
    public int field155;

    @ObfuscatedName("h.n")
    public int field156;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class79 arg8) {
        this.field153 = arg0;
        this.field152 = arg1;
        this.field150 = arg2;
        this.field149 = arg3;
        this.field148 = arg4;
        this.field157 = arg5;
        if (arg6 != -1) {
            this.field154 = class39.method2627(arg6);
            this.field155 = 0;
            this.field156 = client.field410 - 1;
            if (this.field154.field933 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field154 == var10.field154) {
                    this.field155 = var10.field155;
                    this.field156 = var10.field156;
                    return;
                }
            }
            if (arg7 && this.field154.field924 != -1) {
                this.field155 = (int) (Math.random() * (double) this.field154.field920.length);
                this.field156 -= (int) (Math.random() * (double) this.field154.field918[this.field155]);
            }
        }
    }

    @ObfuscatedName("h.j(I)Lcx;")
    public final class99 method15() {
        if (this.field154 != null) {
            int var1 = client.field410 - this.field156;
            if (var1 > 100 && this.field154.field924 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field154.field918[this.field155]) {
                            break label47;
                        }
                        var1 -= this.field154.field918[this.field155];
                        this.field155++;
                    } while (this.field155 < this.field154.field920.length);
                    this.field155 -= this.field154.field924;
                } while (this.field155 >= 0 && this.field155 < this.field154.field920.length);
                this.field154 = null;
            }
            this.field156 = client.field410 - var1;
        }
        class37 var2 = class37.method3266(this.field153);
        if (var2.field891 != null) {
            var2 = var2.method614();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field150 == 1 || this.field150 == 3) {
            var3 = var2.field866;
            var4 = var2.field865;
        } else {
            var3 = var2.field865;
            var4 = var2.field866;
        }
        int var5 = (var3 >> 1) + this.field148;
        int var6 = (var3 + 1 >> 1) + this.field148;
        int var7 = (var4 >> 1) + this.field157;
        int var8 = (var4 + 1 >> 1) + this.field157;
        int[][] var9 = class6.field76[this.field149];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field148 << 7) + (var3 << 6);
        int var12 = (this.field157 << 7) + (var4 << 6);
        return var2.method612(this.field152, this.field150, var9, var11, var10, var12, this.field154, this.field155);
    }
}
