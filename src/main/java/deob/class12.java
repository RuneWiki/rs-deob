package deob;

@ObfuscatedName("a")
public class class12 extends class80 {

    @ObfuscatedName("a.t")
    public int field175;

    @ObfuscatedName("a.b")
    public int field166;

    @ObfuscatedName("a.p")
    public int field176;

    @ObfuscatedName("a.e")
    public int field168;

    @ObfuscatedName("a.i")
    public int field169;

    @ObfuscatedName("a.o")
    public int field170;

    @ObfuscatedName("a.f")
    public class40 field171;

    @ObfuscatedName("a.d")
    public int field165;

    @ObfuscatedName("a.j")
    public int field173;

    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class80 arg8) {
        this.field175 = arg0;
        this.field166 = arg1;
        this.field176 = arg2;
        this.field168 = arg3;
        this.field169 = arg4;
        this.field170 = arg5;
        if (arg6 != -1) {
            this.field171 = class40.method168(arg6);
            this.field165 = 0;
            this.field173 = client.field256 - 1;
            if (this.field171.field933 == 0 && arg8 != null && arg8 instanceof class12) {
                class12 var10 = (class12) arg8;
                if (this.field171 == var10.field171) {
                    this.field165 = var10.field165;
                    this.field173 = var10.field173;
                    return;
                }
            }
            if (arg7 && this.field171.field916 != -1) {
                this.field165 = (int) (Math.random() * (double) this.field171.field918.length);
                this.field173 -= (int) (Math.random() * (double) this.field171.field920[this.field165]);
            }
        }
    }

    @ObfuscatedName("a.b(B)Lcs;")
    public final class100 method14() {
        if (this.field171 != null) {
            int var1 = client.field256 - this.field173;
            if (var1 > 100 && this.field171.field916 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field171.field920[this.field165]) {
                            break label47;
                        }
                        var1 -= this.field171.field920[this.field165];
                        this.field165++;
                    } while (this.field165 < this.field171.field918.length);
                    this.field165 -= this.field171.field916;
                } while (this.field165 >= 0 && this.field165 < this.field171.field918.length);
                this.field171 = null;
            }
            this.field173 = client.field256 - var1;
        }
        class38 var2 = class38.method1473(this.field175);
        if (var2.field886 != null) {
            var2 = var2.method724();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field176 == 1 || this.field176 == 3) {
            var3 = var2.field859;
            var4 = var2.field860;
        } else {
            var3 = var2.field860;
            var4 = var2.field859;
        }
        int var5 = (var3 >> 1) + this.field169;
        int var6 = (var3 + 1 >> 1) + this.field169;
        int var7 = (var4 >> 1) + this.field170;
        int var8 = (var4 + 1 >> 1) + this.field170;
        int[][] var9 = class6.field67[this.field168];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field169 << 7) + (var3 << 6);
        int var12 = (this.field170 << 7) + (var4 << 6);
        return var2.method722(this.field166, this.field176, var9, var11, var10, var12, this.field171, this.field165);
    }
}
