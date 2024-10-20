package deob;

@ObfuscatedName("v")
public class class13 extends class85 {

    @ObfuscatedName("v.m")
    public int field170;

    @ObfuscatedName("v.l")
    public int field176;

    @ObfuscatedName("v.y")
    public int field172;

    @ObfuscatedName("v.u")
    public int field173;

    @ObfuscatedName("v.k")
    public int field174;

    @ObfuscatedName("v.j")
    public int field175;

    @ObfuscatedName("v.i")
    public class43 field171;

    @ObfuscatedName("v.x")
    public int field177;

    @ObfuscatedName("v.g")
    public int field178;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field170 = arg0;
        this.field176 = arg1;
        this.field172 = arg2;
        this.field173 = arg3;
        this.field174 = arg4;
        this.field175 = arg5;
        if (arg6 != -1) {
            this.field171 = class43.method2262(arg6);
            this.field177 = 0;
            this.field178 = client.field423 - 1;
            if (this.field171.field968 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field171 == var10.field171) {
                    this.field177 = var10.field177;
                    this.field178 = var10.field178;
                    return;
                }
            }
            if (arg7 && this.field171.field956 != -1) {
                this.field177 = (int) (Math.random() * (double) this.field171.field955.length);
                this.field178 -= (int) (Math.random() * (double) this.field171.field957[this.field177]);
            }
        }
    }

    @ObfuscatedName("v.y(I)Ldb;")
    public final class105 method16() {
        if (this.field171 != null) {
            int var1 = client.field423 - this.field178;
            if (var1 > 100 && this.field171.field956 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field171.field957[this.field177]) {
                            break label47;
                        }
                        var1 -= this.field171.field957[this.field177];
                        this.field177++;
                    } while (this.field177 < this.field171.field955.length);
                    this.field177 -= this.field171.field956;
                } while (this.field177 >= 0 && this.field177 < this.field171.field955.length);
                this.field171 = null;
            }
            this.field178 = client.field423 - var1;
        }
        class41 var2 = class41.method85(this.field170);
        if (var2.field923 != null) {
            var2 = var2.method832();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field172 == 1 || this.field172 == 3) {
            var3 = var2.field898;
            var4 = var2.field930;
        } else {
            var3 = var2.field930;
            var4 = var2.field898;
        }
        int var5 = (var3 >> 1) + this.field174;
        int var6 = (var3 + 1 >> 1) + this.field174;
        int var7 = (var4 >> 1) + this.field175;
        int var8 = (var4 + 1 >> 1) + this.field175;
        int[][] var9 = class6.field81[this.field173];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field174 << 7) + (var3 << 6);
        int var12 = (this.field175 << 7) + (var4 << 6);
        return var2.method819(this.field176, this.field172, var9, var11, var10, var12, this.field171, this.field177);
    }
}
