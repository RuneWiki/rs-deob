package deob;

@ObfuscatedName("s")
public class class11 extends class78 {

    @ObfuscatedName("s.e")
    public int field172;

    @ObfuscatedName("s.v")
    public int field169;

    @ObfuscatedName("s.i")
    public int field170;

    @ObfuscatedName("s.g")
    public int field168;

    @ObfuscatedName("s.x")
    public int field174;

    @ObfuscatedName("s.b")
    public int field178;

    @ObfuscatedName("s.q")
    public class38 field176;

    @ObfuscatedName("s.l")
    public int field175;

    @ObfuscatedName("s.m")
    public int field173;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field172 = arg0;
        this.field169 = arg1;
        this.field170 = arg2;
        this.field168 = arg3;
        this.field174 = arg4;
        this.field178 = arg5;
        if (arg6 != -1) {
            this.field176 = class38.method730(arg6);
            this.field175 = 0;
            this.field173 = client.field442 - 1;
            if (this.field176.field910 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field176 == var10.field176) {
                    this.field175 = var10.field175;
                    this.field173 = var10.field173;
                    return;
                }
            }
            if (arg7 && this.field176.field902 != -1) {
                this.field175 = (int) (Math.random() * (double) this.field176.field897.length);
                this.field173 -= (int) (Math.random() * (double) this.field176.field899[this.field175]);
            }
        }
    }

    @ObfuscatedName("s.v(I)Lcz;")
    public final class98 method17() {
        if (this.field176 != null) {
            int var1 = client.field442 - this.field173;
            if (var1 > 100 && this.field176.field902 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field176.field899[this.field175]) {
                            break label47;
                        }
                        var1 -= this.field176.field899[this.field175];
                        this.field175++;
                    } while (this.field175 < this.field176.field897.length);
                    this.field175 -= this.field176.field902;
                } while (this.field175 >= 0 && this.field175 < this.field176.field897.length);
                this.field176 = null;
            }
            this.field173 = client.field442 - var1;
        }
        class36 var2 = class36.method12(this.field172);
        if (var2.field873 != null) {
            var2 = var2.method634();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field170 == 1 || this.field170 == 3) {
            var3 = var2.field848;
            var4 = var2.field877;
        } else {
            var3 = var2.field877;
            var4 = var2.field848;
        }
        int var5 = (var3 >> 1) + this.field174;
        int var6 = (var3 + 1 >> 1) + this.field174;
        int var7 = (var4 >> 1) + this.field178;
        int var8 = (var4 + 1 >> 1) + this.field178;
        int[][] var9 = class6.field83[this.field168];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field174 << 7) + (var3 << 6);
        int var12 = (this.field178 << 7) + (var4 << 6);
        return var2.method638(this.field169, this.field170, var9, var11, var10, var12, this.field176, this.field175);
    }
}
