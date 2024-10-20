package deob;

@ObfuscatedName("b")
public class class13 extends class85 {

    @ObfuscatedName("b.n")
    public int field177;

    @ObfuscatedName("b.d")
    public int field175;

    @ObfuscatedName("b.s")
    public int field176;

    @ObfuscatedName("b.q")
    public int field174;

    @ObfuscatedName("b.j")
    public int field183;

    @ObfuscatedName("b.k")
    public int field179;

    @ObfuscatedName("b.i")
    public class43 field184;

    @ObfuscatedName("b.m")
    public int field181;

    @ObfuscatedName("b.p")
    public int field178;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field177 = arg0;
        this.field175 = arg1;
        this.field176 = arg2;
        this.field174 = arg3;
        this.field183 = arg4;
        this.field179 = arg5;
        if (arg6 != -1) {
            this.field184 = class43.method2827(arg6);
            this.field181 = 0;
            this.field178 = client.field347 - 1;
            if (this.field184.field984 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field184 == var10.field184) {
                    this.field181 = var10.field181;
                    this.field178 = var10.field178;
                    return;
                }
            }
            if (arg7 && this.field184.field975 != -1) {
                this.field181 = (int) (Math.random() * (double) this.field184.field973.length);
                this.field178 -= (int) (Math.random() * (double) this.field184.field980[this.field181]);
            }
        }
    }

    @ObfuscatedName("b.s(I)Ldb;")
    public final class105 method36() {
        if (this.field184 != null) {
            int var1 = client.field347 - this.field178;
            if (var1 > 100 && this.field184.field975 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field184.field980[this.field181]) {
                            break label47;
                        }
                        var1 -= this.field184.field980[this.field181];
                        this.field181++;
                    } while (this.field181 < this.field184.field973.length);
                    this.field181 -= this.field184.field975;
                } while (this.field181 >= 0 && this.field181 < this.field184.field973.length);
                this.field184 = null;
            }
            this.field178 = client.field347 - var1;
        }
        class41 var2 = class41.method116(this.field177);
        if (var2.field915 != null) {
            var2 = var2.method777();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field176 == 1 || this.field176 == 3) {
            var3 = var2.field908;
            var4 = var2.field914;
        } else {
            var3 = var2.field914;
            var4 = var2.field908;
        }
        int var5 = (var3 >> 1) + this.field183;
        int var6 = (var3 + 1 >> 1) + this.field183;
        int var7 = (var4 >> 1) + this.field179;
        int var8 = (var4 + 1 >> 1) + this.field179;
        int[][] var9 = class6.field80[this.field174];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field183 << 7) + (var3 << 6);
        int var12 = (this.field179 << 7) + (var4 << 6);
        return var2.method775(this.field175, this.field176, var9, var11, var10, var12, this.field184, this.field181);
    }
}
