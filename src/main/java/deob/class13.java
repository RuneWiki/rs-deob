package deob;

@ObfuscatedName("u")
public class class13 extends class89 {

    @ObfuscatedName("u.s")
    public int field180;

    @ObfuscatedName("u.z")
    public int field172;

    @ObfuscatedName("u.t")
    public int field174;

    @ObfuscatedName("u.y")
    public int field178;

    @ObfuscatedName("u.p")
    public int field176;

    @ObfuscatedName("u.g")
    public int field177;

    @ObfuscatedName("u.m")
    public class45 field175;

    @ObfuscatedName("u.f")
    public int field179;

    @ObfuscatedName("u.k")
    public int field181;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class89 arg8) {
        this.field180 = arg0;
        this.field172 = arg1;
        this.field174 = arg2;
        this.field178 = arg3;
        this.field176 = arg4;
        this.field177 = arg5;
        if (arg6 != -1) {
            this.field175 = class45.method44(arg6);
            this.field179 = 0;
            this.field181 = client.field326 - 1;
            if (this.field175.field983 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field175 == var10.field175) {
                    this.field179 = var10.field179;
                    this.field181 = var10.field181;
                    return;
                }
            }
            if (arg7 && this.field175.field974 != -1) {
                this.field179 = (int) (Math.random() * (double) this.field175.field970.length);
                this.field181 -= (int) (Math.random() * (double) this.field175.field982[this.field179]);
            }
        }
    }

    @ObfuscatedName("u.t(B)Lde;")
    public final class109 method27() {
        if (this.field175 != null) {
            int var1 = client.field326 - this.field181;
            if (var1 > 100 && this.field175.field974 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field175.field982[this.field179]) {
                            break label47;
                        }
                        var1 -= this.field175.field982[this.field179];
                        this.field179++;
                    } while (this.field179 < this.field175.field970.length);
                    this.field179 -= this.field175.field974;
                } while (this.field179 >= 0 && this.field179 < this.field175.field970.length);
                this.field175 = null;
            }
            this.field181 = client.field326 - var1;
        }
        class43 var2 = class43.method768(this.field180);
        if (var2.field950 != null) {
            var2 = var2.method807();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field174 == 1 || this.field174 == 3) {
            var3 = var2.field925;
            var4 = var2.field924;
        } else {
            var3 = var2.field924;
            var4 = var2.field925;
        }
        int var5 = (var3 >> 1) + this.field176;
        int var6 = (var3 + 1 >> 1) + this.field176;
        int var7 = (var4 >> 1) + this.field177;
        int var8 = (var4 + 1 >> 1) + this.field177;
        int[][] var9 = class6.field83[this.field178];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field176 << 7) + (var3 << 6);
        int var12 = (this.field177 << 7) + (var4 << 6);
        return var2.method800(this.field172, this.field174, var9, var11, var10, var12, this.field175, this.field179);
    }
}
