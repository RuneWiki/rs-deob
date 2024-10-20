package deob;

@ObfuscatedName("p")
public class class11 extends class79 {

    @ObfuscatedName("p.l")
    public int field162;

    @ObfuscatedName("p.y")
    public int field154;

    @ObfuscatedName("p.g")
    public int field160;

    @ObfuscatedName("p.j")
    public int field155;

    @ObfuscatedName("p.w")
    public int field157;

    @ObfuscatedName("p.c")
    public int field158;

    @ObfuscatedName("p.x")
    public class39 field159;

    @ObfuscatedName("p.f")
    public int field153;

    @ObfuscatedName("p.t")
    public int field156;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class79 arg8) {
        this.field162 = arg0;
        this.field154 = arg1;
        this.field160 = arg2;
        this.field155 = arg3;
        this.field157 = arg4;
        this.field158 = arg5;
        if (arg6 != -1) {
            this.field159 = class39.method821(arg6);
            this.field153 = 0;
            this.field156 = client.field246 - 1;
            if (this.field159.field915 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field159 == var10.field159) {
                    this.field153 = var10.field153;
                    this.field156 = var10.field156;
                    return;
                }
            }
            if (arg7 && this.field159.field906 != -1) {
                this.field153 = (int) (Math.random() * (double) this.field159.field902.length);
                this.field156 -= (int) (Math.random() * (double) this.field159.field904[this.field153]);
            }
        }
    }

    @ObfuscatedName("p.y(I)Lck;")
    public final class99 method23() {
        if (this.field159 != null) {
            int var1 = client.field246 - this.field156;
            if (var1 > 100 && this.field159.field906 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field159.field904[this.field153]) {
                            break label47;
                        }
                        var1 -= this.field159.field904[this.field153];
                        this.field153++;
                    } while (this.field153 < this.field159.field902.length);
                    this.field153 -= this.field159.field906;
                } while (this.field153 >= 0 && this.field153 < this.field159.field902.length);
                this.field159 = null;
            }
            this.field156 = client.field246 - var1;
        }
        class37 var2 = class37.method826(this.field162);
        if (var2.field857 != null) {
            var2 = var2.method662();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field160 == 1 || this.field160 == 3) {
            var3 = var2.field869;
            var4 = var2.field845;
        } else {
            var3 = var2.field845;
            var4 = var2.field869;
        }
        int var5 = (var3 >> 1) + this.field157;
        int var6 = (var3 + 1 >> 1) + this.field157;
        int var7 = (var4 >> 1) + this.field158;
        int var8 = (var4 + 1 >> 1) + this.field158;
        int[][] var9 = class6.field76[this.field155];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field157 << 7) + (var3 << 6);
        int var12 = (this.field158 << 7) + (var4 << 6);
        return var2.method672(this.field154, this.field160, var9, var11, var10, var12, this.field159, this.field153);
    }
}
