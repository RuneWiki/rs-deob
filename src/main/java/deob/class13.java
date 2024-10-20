package deob;

@ObfuscatedName("a")
public class class13 extends class86 {

    @ObfuscatedName("a.j")
    public int field181;

    @ObfuscatedName("a.h")
    public int field183;

    @ObfuscatedName("a.m")
    public int field182;

    @ObfuscatedName("a.z")
    public int field184;

    @ObfuscatedName("a.x")
    public int field189;

    @ObfuscatedName("a.e")
    public int field186;

    @ObfuscatedName("a.i")
    public class43 field187;

    @ObfuscatedName("a.c")
    public int field188;

    @ObfuscatedName("a.n")
    public int field185;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class86 arg8) {
        this.field181 = arg0;
        this.field183 = arg1;
        this.field182 = arg2;
        this.field184 = arg3;
        this.field189 = arg4;
        this.field186 = arg5;
        if (arg6 != -1) {
            this.field187 = class43.method2947(arg6);
            this.field188 = 0;
            this.field185 = client.field286 - 1;
            if (this.field187.field986 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field187 == var10.field187) {
                    this.field188 = var10.field188;
                    this.field185 = var10.field185;
                    return;
                }
            }
            if (arg7 && this.field187.field968 != -1) {
                this.field188 = (int) (Math.random() * (double) this.field187.field973.length);
                this.field185 -= (int) (Math.random() * (double) this.field187.field975[this.field188]);
            }
        }
    }

    @ObfuscatedName("a.m(I)Ldf;")
    public final class106 method12() {
        if (this.field187 != null) {
            int var1 = client.field286 - this.field185;
            if (var1 > 100 && this.field187.field968 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field187.field975[this.field188]) {
                            break label47;
                        }
                        var1 -= this.field187.field975[this.field188];
                        this.field188++;
                    } while (this.field188 < this.field187.field973.length);
                    this.field188 -= this.field187.field968;
                } while (this.field188 >= 0 && this.field188 < this.field187.field973.length);
                this.field187 = null;
            }
            this.field185 = client.field286 - var1;
        }
        class41 var2 = class41.method1789(this.field181);
        if (var2.field957 != null) {
            var2 = var2.method791();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field182 == 1 || this.field182 == 3) {
            var3 = var2.field922;
            var4 = var2.field921;
        } else {
            var3 = var2.field921;
            var4 = var2.field922;
        }
        int var5 = (var3 >> 1) + this.field189;
        int var6 = (var3 + 1 >> 1) + this.field189;
        int var7 = (var4 >> 1) + this.field186;
        int var8 = (var4 + 1 >> 1) + this.field186;
        int[][] var9 = class6.field92[this.field184];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field189 << 7) + (var3 << 6);
        int var12 = (this.field186 << 7) + (var4 << 6);
        return var2.method779(this.field183, this.field182, var9, var11, var10, var12, this.field187, this.field188);
    }
}
