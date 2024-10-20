package deob;

@ObfuscatedName("d")
public class class11 extends class78 {

    @ObfuscatedName("d.k")
    public int field158;

    @ObfuscatedName("d.y")
    public int field147;

    @ObfuscatedName("d.s")
    public int field148;

    @ObfuscatedName("d.g")
    public int field160;

    @ObfuscatedName("d.h")
    public int field150;

    @ObfuscatedName("d.l")
    public int field151;

    @ObfuscatedName("d.e")
    public class38 field149;

    @ObfuscatedName("d.u")
    public int field153;

    @ObfuscatedName("d.j")
    public int field154;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field158 = arg0;
        this.field147 = arg1;
        this.field148 = arg2;
        this.field160 = arg3;
        this.field150 = arg4;
        this.field151 = arg5;
        if (arg6 != -1) {
            this.field149 = class38.method29(arg6);
            this.field153 = 0;
            this.field154 = client.field245 - 1;
            if (this.field149.field903 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field149 == var10.field149) {
                    this.field153 = var10.field153;
                    this.field154 = var10.field154;
                    return;
                }
            }
            if (arg7 && this.field149.field894 != -1) {
                this.field153 = (int) (Math.random() * (double) this.field149.field890.length);
                this.field154 -= (int) (Math.random() * (double) this.field149.field892[this.field153]);
            }
        }
    }

    @ObfuscatedName("d.y(I)Lck;")
    public final class98 method19() {
        if (this.field149 != null) {
            int var1 = client.field245 - this.field154;
            if (var1 > 100 && this.field149.field894 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field149.field892[this.field153]) {
                            break label47;
                        }
                        var1 -= this.field149.field892[this.field153];
                        this.field153++;
                    } while (this.field153 < this.field149.field890.length);
                    this.field153 -= this.field149.field894;
                } while (this.field153 >= 0 && this.field153 < this.field149.field890.length);
                this.field149 = null;
            }
            this.field154 = client.field245 - var1;
        }
        class36 var2 = class36.method525(this.field158);
        if (var2.field841 != null) {
            var2 = var2.method614();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field148 == 1 || this.field148 == 3) {
            var3 = var2.field871;
            var4 = var2.field835;
        } else {
            var3 = var2.field835;
            var4 = var2.field871;
        }
        int var5 = (var3 >> 1) + this.field150;
        int var6 = (var3 + 1 >> 1) + this.field150;
        int var7 = (var4 >> 1) + this.field151;
        int var8 = (var4 + 1 >> 1) + this.field151;
        int[][] var9 = class6.field73[this.field160];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field150 << 7) + (var3 << 6);
        int var12 = (this.field151 << 7) + (var4 << 6);
        return var2.method612(this.field147, this.field148, var9, var11, var10, var12, this.field149, this.field153);
    }
}
