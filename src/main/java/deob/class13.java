package deob;

@ObfuscatedName("e")
public class class13 extends class85 {

    @ObfuscatedName("e.j")
    public int field181;

    @ObfuscatedName("e.m")
    public int field177;

    @ObfuscatedName("e.f")
    public int field184;

    @ObfuscatedName("e.l")
    public int field179;

    @ObfuscatedName("e.u")
    public int field180;

    @ObfuscatedName("e.a")
    public int field187;

    @ObfuscatedName("e.h")
    public class43 field182;

    @ObfuscatedName("e.i")
    public int field183;

    @ObfuscatedName("e.t")
    public int field176;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field181 = arg0;
        this.field177 = arg1;
        this.field184 = arg2;
        this.field179 = arg3;
        this.field180 = arg4;
        this.field187 = arg5;
        if (arg6 != -1) {
            this.field182 = class43.method575(arg6);
            this.field183 = 0;
            this.field176 = client.field287 - 1;
            if (this.field182.field970 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field182 == var10.field182) {
                    this.field183 = var10.field183;
                    this.field176 = var10.field176;
                    return;
                }
            }
            if (arg7 && this.field182.field978 != -1) {
                this.field183 = (int) (Math.random() * (double) this.field182.field974.length);
                this.field176 -= (int) (Math.random() * (double) this.field182.field976[this.field183]);
            }
        }
    }

    @ObfuscatedName("e.f(I)Lda;")
    public final class105 method17() {
        if (this.field182 != null) {
            int var1 = client.field287 - this.field176;
            if (var1 > 100 && this.field182.field978 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field182.field976[this.field183]) {
                            break label47;
                        }
                        var1 -= this.field182.field976[this.field183];
                        this.field183++;
                    } while (this.field183 < this.field182.field974.length);
                    this.field183 -= this.field182.field978;
                } while (this.field183 >= 0 && this.field183 < this.field182.field974.length);
                this.field182 = null;
            }
            this.field176 = client.field287 - var1;
        }
        class41 var2 = class41.method736(this.field181);
        if (var2.field946 != null) {
            var2 = var2.method813();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field184 == 1 || this.field184 == 3) {
            var3 = var2.field921;
            var4 = var2.field920;
        } else {
            var3 = var2.field920;
            var4 = var2.field921;
        }
        int var5 = (var3 >> 1) + this.field180;
        int var6 = (var3 + 1 >> 1) + this.field180;
        int var7 = (var4 >> 1) + this.field187;
        int var8 = (var4 + 1 >> 1) + this.field187;
        int[][] var9 = class6.field80[this.field179];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field180 << 7) + (var3 << 6);
        int var12 = (this.field187 << 7) + (var4 << 6);
        return var2.method833(this.field177, this.field184, var9, var11, var10, var12, this.field182, this.field183);
    }
}
