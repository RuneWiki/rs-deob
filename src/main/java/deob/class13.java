package deob;

@ObfuscatedName("i")
public class class13 extends class89 {

    @ObfuscatedName("i.f")
    public int field189;

    @ObfuscatedName("i.e")
    public int field177;

    @ObfuscatedName("i.n")
    public int field179;

    @ObfuscatedName("i.t")
    public int field180;

    @ObfuscatedName("i.v")
    public int field181;

    @ObfuscatedName("i.b")
    public int field178;

    @ObfuscatedName("i.m")
    public class45 field183;

    @ObfuscatedName("i.k")
    public int field184;

    @ObfuscatedName("i.c")
    public int field185;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class89 arg8) {
        this.field189 = arg0;
        this.field177 = arg1;
        this.field179 = arg2;
        this.field180 = arg3;
        this.field181 = arg4;
        this.field178 = arg5;
        if (arg6 != -1) {
            this.field183 = class45.method1289(arg6);
            this.field184 = 0;
            this.field185 = client.field291 - 1;
            if (this.field183.field1007 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field183 == var10.field183) {
                    this.field184 = var10.field184;
                    this.field185 = var10.field185;
                    return;
                }
            }
            if (arg7 && this.field183.field997 != -1) {
                this.field184 = (int) (Math.random() * (double) this.field183.field993.length);
                this.field185 -= (int) (Math.random() * (double) this.field183.field995[this.field184]);
            }
        }
    }

    @ObfuscatedName("i.n(B)Ldg;")
    public final class109 method36() {
        if (this.field183 != null) {
            int var1 = client.field291 - this.field185;
            if (var1 > 100 && this.field183.field997 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field183.field995[this.field184]) {
                            break label47;
                        }
                        var1 -= this.field183.field995[this.field184];
                        this.field184++;
                    } while (this.field184 < this.field183.field993.length);
                    this.field184 -= this.field183.field997;
                } while (this.field184 >= 0 && this.field184 < this.field183.field993.length);
                this.field183 = null;
            }
            this.field185 = client.field291 - var1;
        }
        class43 var2 = class43.method106(this.field189);
        if (var2.field963 != null) {
            var2 = var2.method811();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field179 == 1 || this.field179 == 3) {
            var3 = var2.field938;
            var4 = var2.field937;
        } else {
            var3 = var2.field937;
            var4 = var2.field938;
        }
        int var5 = (var3 >> 1) + this.field181;
        int var6 = (var3 + 1 >> 1) + this.field181;
        int var7 = (var4 >> 1) + this.field178;
        int var8 = (var4 + 1 >> 1) + this.field178;
        int[][] var9 = class6.field79[this.field180];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field181 << 7) + (var3 << 6);
        int var12 = (this.field178 << 7) + (var4 << 6);
        return var2.method809(this.field177, this.field179, var9, var11, var10, var12, this.field183, this.field184);
    }
}
