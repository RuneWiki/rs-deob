package deob;

@ObfuscatedName("g")
public class class13 extends class89 {

    @ObfuscatedName("g.k")
    public int field176;

    @ObfuscatedName("g.q")
    public int field174;

    @ObfuscatedName("g.f")
    public int field175;

    @ObfuscatedName("g.c")
    public int field184;

    @ObfuscatedName("g.v")
    public int field177;

    @ObfuscatedName("g.j")
    public int field178;

    @ObfuscatedName("g.m")
    public class45 field188;

    @ObfuscatedName("g.y")
    public int field187;

    @ObfuscatedName("g.u")
    public int field181;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class89 arg8) {
        this.field176 = arg0;
        this.field174 = arg1;
        this.field175 = arg2;
        this.field184 = arg3;
        this.field177 = arg4;
        this.field178 = arg5;
        if (arg6 != -1) {
            this.field188 = class45.method726(arg6);
            this.field187 = 0;
            this.field181 = client.field289 - 1;
            if (this.field188.field1020 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field188 == var10.field188) {
                    this.field187 = var10.field187;
                    this.field181 = var10.field181;
                    return;
                }
            }
            if (arg7 && this.field188.field1011 != -1) {
                this.field187 = (int) (Math.random() * (double) this.field188.field1007.length);
                this.field181 -= (int) (Math.random() * (double) this.field188.field1009[this.field187]);
            }
        }
    }

    @ObfuscatedName("g.f(I)Ldj;")
    public final class109 method14() {
        if (this.field188 != null) {
            int var1 = client.field289 - this.field181;
            if (var1 > 100 && this.field188.field1011 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field188.field1009[this.field187]) {
                            break label47;
                        }
                        var1 -= this.field188.field1009[this.field187];
                        this.field187++;
                    } while (this.field187 < this.field188.field1007.length);
                    this.field187 -= this.field188.field1011;
                } while (this.field187 >= 0 && this.field187 < this.field188.field1007.length);
                this.field188 = null;
            }
            this.field181 = client.field289 - var1;
        }
        class43 var2 = class43.method91(this.field176);
        if (var2.field977 != null) {
            var2 = var2.method810();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field175 == 1 || this.field175 == 3) {
            var3 = var2.field949;
            var4 = var2.field951;
        } else {
            var3 = var2.field951;
            var4 = var2.field949;
        }
        int var5 = (var3 >> 1) + this.field177;
        int var6 = (var3 + 1 >> 1) + this.field177;
        int var7 = (var4 >> 1) + this.field178;
        int var8 = (var4 + 1 >> 1) + this.field178;
        int[][] var9 = class6.field87[this.field184];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field177 << 7) + (var3 << 6);
        int var12 = (this.field178 << 7) + (var4 << 6);
        return var2.method808(this.field174, this.field175, var9, var11, var10, var12, this.field188, this.field187);
    }
}
