package deob;

@ObfuscatedName("o")
public class class13 extends class85 {

    @ObfuscatedName("o.h")
    public int field181;

    @ObfuscatedName("o.m")
    public int field176;

    @ObfuscatedName("o.i")
    public int field177;

    @ObfuscatedName("o.q")
    public int field179;

    @ObfuscatedName("o.p")
    public int field175;

    @ObfuscatedName("o.c")
    public int field180;

    @ObfuscatedName("o.f")
    public class43 field178;

    @ObfuscatedName("o.y")
    public int field182;

    @ObfuscatedName("o.w")
    public int field183;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field181 = arg0;
        this.field176 = arg1;
        this.field177 = arg2;
        this.field179 = arg3;
        this.field175 = arg4;
        this.field180 = arg5;
        if (arg6 != -1) {
            this.field178 = class43.method2257(arg6);
            this.field182 = 0;
            this.field183 = client.field295 - 1;
            if (this.field178.field1006 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field178 == var10.field178) {
                    this.field182 = var10.field182;
                    this.field183 = var10.field183;
                    return;
                }
            }
            if (arg7 && this.field178.field990 != -1) {
                this.field182 = (int) (Math.random() * (double) this.field178.field988.length);
                this.field183 -= (int) (Math.random() * (double) this.field178.field995[this.field182]);
            }
        }
    }

    @ObfuscatedName("o.i(B)Ldb;")
    public final class105 method34() {
        if (this.field178 != null) {
            int var1 = client.field295 - this.field183;
            if (var1 > 100 && this.field178.field990 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field178.field995[this.field182]) {
                            break label47;
                        }
                        var1 -= this.field178.field995[this.field182];
                        this.field182++;
                    } while (this.field182 < this.field178.field988.length);
                    this.field182 -= this.field178.field990;
                } while (this.field182 >= 0 && this.field182 < this.field178.field988.length);
                this.field178 = null;
            }
            this.field183 = client.field295 - var1;
        }
        class41 var2 = class41.method961(this.field181);
        if (var2.field970 != null) {
            var2 = var2.method766();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field177 == 1 || this.field177 == 3) {
            var3 = var2.field945;
            var4 = var2.field962;
        } else {
            var3 = var2.field962;
            var4 = var2.field945;
        }
        int var5 = (var3 >> 1) + this.field175;
        int var6 = (var3 + 1 >> 1) + this.field175;
        int var7 = (var4 >> 1) + this.field180;
        int var8 = (var4 + 1 >> 1) + this.field180;
        int[][] var9 = class6.field80[this.field179];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field175 << 7) + (var3 << 6);
        int var12 = (this.field180 << 7) + (var4 << 6);
        return var2.method758(this.field176, this.field177, var9, var11, var10, var12, this.field178, this.field182);
    }
}
