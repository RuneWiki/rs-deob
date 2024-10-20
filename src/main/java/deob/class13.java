package deob;

@ObfuscatedName("q")
public class class13 extends class89 {

    @ObfuscatedName("q.x")
    public int field188;

    @ObfuscatedName("q.r")
    public int field178;

    @ObfuscatedName("q.j")
    public int field179;

    @ObfuscatedName("q.z")
    public int field177;

    @ObfuscatedName("q.i")
    public int field181;

    @ObfuscatedName("q.b")
    public int field182;

    @ObfuscatedName("q.l")
    public class45 field190;

    @ObfuscatedName("q.m")
    public int field184;

    @ObfuscatedName("q.p")
    public int field180;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class89 arg8) {
        this.field188 = arg0;
        this.field178 = arg1;
        this.field179 = arg2;
        this.field177 = arg3;
        this.field181 = arg4;
        this.field182 = arg5;
        if (arg6 != -1) {
            this.field190 = class45.method2337(arg6);
            this.field184 = 0;
            this.field180 = client.field291 - 1;
            if (this.field190.field996 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field190 == var10.field190) {
                    this.field184 = var10.field184;
                    this.field180 = var10.field180;
                    return;
                }
            }
            if (arg7 && this.field190.field1003 != -1) {
                this.field184 = (int) (Math.random() * (double) this.field190.field1002.length);
                this.field180 -= (int) (Math.random() * (double) this.field190.field1000[this.field184]);
            }
        }
    }

    @ObfuscatedName("q.j(I)Ldj;")
    public final class109 method17() {
        if (this.field190 != null) {
            int var1 = client.field291 - this.field180;
            if (var1 > 100 && this.field190.field1003 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field190.field1000[this.field184]) {
                            break label47;
                        }
                        var1 -= this.field190.field1000[this.field184];
                        this.field184++;
                    } while (this.field184 < this.field190.field1002.length);
                    this.field184 -= this.field190.field1003;
                } while (this.field184 >= 0 && this.field184 < this.field190.field1002.length);
                this.field190 = null;
            }
            this.field180 = client.field291 - var1;
        }
        class43 var2 = class43.method12(this.field188);
        if (var2.field971 != null) {
            var2 = var2.method776();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field179 == 1 || this.field179 == 3) {
            var3 = var2.field940;
            var4 = var2.field939;
        } else {
            var3 = var2.field939;
            var4 = var2.field940;
        }
        int var5 = (var3 >> 1) + this.field181;
        int var6 = (var3 + 1 >> 1) + this.field181;
        int var7 = (var4 >> 1) + this.field182;
        int var8 = (var4 + 1 >> 1) + this.field182;
        int[][] var9 = class6.field94[this.field177];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field181 << 7) + (var3 << 6);
        int var12 = (this.field182 << 7) + (var4 << 6);
        return var2.method774(this.field178, this.field179, var9, var11, var10, var12, this.field190, this.field184);
    }
}
