package deob;

@ObfuscatedName("g")
public class class11 extends class78 {

    @ObfuscatedName("g.t")
    public int field154;

    @ObfuscatedName("g.s")
    public int field149;

    @ObfuscatedName("g.f")
    public int field161;

    @ObfuscatedName("g.e")
    public int field151;

    @ObfuscatedName("g.d")
    public int field152;

    @ObfuscatedName("g.n")
    public int field153;

    @ObfuscatedName("g.v")
    public class38 field150;

    @ObfuscatedName("g.z")
    public int field160;

    @ObfuscatedName("g.j")
    public int field155;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field154 = arg0;
        this.field149 = arg1;
        this.field161 = arg2;
        this.field151 = arg3;
        this.field152 = arg4;
        this.field153 = arg5;
        if (arg6 != -1) {
            this.field150 = Statics.method448(arg6);
            this.field160 = 0;
            this.field155 = client.field250 - 1;
            if (this.field150.field889 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field150 == var10.field150) {
                    this.field160 = var10.field160;
                    this.field155 = var10.field155;
                    return;
                }
            }
            if (arg7 && this.field150.field898 != -1) {
                this.field160 = (int) (Math.random() * (double) this.field150.field894.length);
                this.field155 -= (int) (Math.random() * (double) this.field150.field896[this.field160]);
            }
        }
    }

    @ObfuscatedName("g.s(I)Lcc;")
    public final class98 method17() {
        if (this.field150 != null) {
            int var1 = client.field250 - this.field155;
            if (var1 > 100 && this.field150.field898 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field150.field896[this.field160]) {
                            break label47;
                        }
                        var1 -= this.field150.field896[this.field160];
                        this.field160++;
                    } while (this.field160 < this.field150.field894.length);
                    this.field160 -= this.field150.field898;
                } while (this.field160 >= 0 && this.field160 < this.field150.field894.length);
                this.field150 = null;
            }
            this.field155 = client.field250 - var1;
        }
        class36 var2 = class36.method83(this.field154);
        if (var2.field865 != null) {
            var2 = var2.method649();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field161 == 1 || this.field161 == 3) {
            var3 = var2.field833;
            var4 = var2.field839;
        } else {
            var3 = var2.field839;
            var4 = var2.field833;
        }
        int var5 = (var3 >> 1) + this.field152;
        int var6 = (var3 + 1 >> 1) + this.field152;
        int var7 = (var4 >> 1) + this.field153;
        int var8 = (var4 + 1 >> 1) + this.field153;
        int[][] var9 = class6.field94[this.field151];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field152 << 7) + (var3 << 6);
        int var12 = (this.field153 << 7) + (var4 << 6);
        return var2.method630(this.field149, this.field161, var9, var11, var10, var12, this.field150, this.field160);
    }
}
