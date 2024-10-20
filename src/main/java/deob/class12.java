package deob;

@ObfuscatedName("u")
public class class12 extends class80 {

    @ObfuscatedName("u.q")
    public int field173;

    @ObfuscatedName("u.s")
    public int field171;

    @ObfuscatedName("u.h")
    public int field172;

    @ObfuscatedName("u.e")
    public int field179;

    @ObfuscatedName("u.n")
    public int field170;

    @ObfuscatedName("u.t")
    public int field174;

    @ObfuscatedName("u.l")
    public class40 field176;

    @ObfuscatedName("u.m")
    public int field177;

    @ObfuscatedName("u.o")
    public int field178;

    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class80 arg8) {
        this.field173 = arg0;
        this.field171 = arg1;
        this.field172 = arg2;
        this.field179 = arg3;
        this.field170 = arg4;
        this.field174 = arg5;
        if (arg6 != -1) {
            this.field176 = class40.method575(arg6);
            this.field177 = 0;
            this.field178 = client.field275 - 1;
            if (this.field176.field928 == 0 && arg8 != null && arg8 instanceof class12) {
                class12 var10 = (class12) arg8;
                if (this.field176 == var10.field176) {
                    this.field177 = var10.field177;
                    this.field178 = var10.field178;
                    return;
                }
            }
            if (arg7 && this.field176.field919 != -1) {
                this.field177 = (int) (Math.random() * (double) this.field176.field915.length);
                this.field178 -= (int) (Math.random() * (double) this.field176.field917[this.field177]);
            }
        }
    }

    @ObfuscatedName("u.s(B)Lch;")
    public final class100 method14() {
        if (this.field176 != null) {
            int var1 = client.field275 - this.field178;
            if (var1 > 100 && this.field176.field919 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field176.field917[this.field177]) {
                            break label47;
                        }
                        var1 -= this.field176.field917[this.field177];
                        this.field177++;
                    } while (this.field177 < this.field176.field915.length);
                    this.field177 -= this.field176.field919;
                } while (this.field177 >= 0 && this.field177 < this.field176.field915.length);
                this.field176 = null;
            }
            this.field178 = client.field275 - var1;
        }
        class38 var2 = class38.method2727(this.field173);
        if (var2.field875 != null) {
            var2 = var2.method670();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field172 == 1 || this.field172 == 3) {
            var3 = var2.field865;
            var4 = var2.field863;
        } else {
            var3 = var2.field863;
            var4 = var2.field865;
        }
        int var5 = (var3 >> 1) + this.field170;
        int var6 = (var3 + 1 >> 1) + this.field170;
        int var7 = (var4 >> 1) + this.field174;
        int var8 = (var4 + 1 >> 1) + this.field174;
        int[][] var9 = class6.field77[this.field179];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field170 << 7) + (var3 << 6);
        int var12 = (this.field174 << 7) + (var4 << 6);
        return var2.method668(this.field171, this.field172, var9, var11, var10, var12, this.field176, this.field177);
    }
}
