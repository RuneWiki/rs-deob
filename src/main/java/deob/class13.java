package deob;

@ObfuscatedName("l")
public class class13 extends class85 {

    @ObfuscatedName("l.o")
    public int field197;

    @ObfuscatedName("l.f")
    public int field182;

    @ObfuscatedName("l.i")
    public int field185;

    @ObfuscatedName("l.h")
    public int field190;

    @ObfuscatedName("l.q")
    public int field181;

    @ObfuscatedName("l.u")
    public int field186;

    @ObfuscatedName("l.m")
    public class43 field183;

    @ObfuscatedName("l.y")
    public int field188;

    @ObfuscatedName("l.p")
    public int field189;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field197 = arg0;
        this.field182 = arg1;
        this.field185 = arg2;
        this.field190 = arg3;
        this.field181 = arg4;
        this.field186 = arg5;
        if (arg6 != -1) {
            this.field183 = class43.method3081(arg6);
            this.field188 = 0;
            this.field189 = client.field299 - 1;
            if (this.field183.field991 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field183 == var10.field183) {
                    this.field188 = var10.field188;
                    this.field189 = var10.field189;
                    return;
                }
            }
            if (arg7 && this.field183.field974 != -1) {
                this.field188 = (int) (Math.random() * (double) this.field183.field978.length);
                this.field189 -= (int) (Math.random() * (double) this.field183.field980[this.field188]);
            }
        }
    }

    @ObfuscatedName("l.i(B)Ldm;")
    public final class105 method21() {
        if (this.field183 != null) {
            int var1 = client.field299 - this.field189;
            if (var1 > 100 && this.field183.field974 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field183.field980[this.field188]) {
                            break label47;
                        }
                        var1 -= this.field183.field980[this.field188];
                        this.field188++;
                    } while (this.field188 < this.field183.field978.length);
                    this.field188 -= this.field183.field974;
                } while (this.field188 >= 0 && this.field188 < this.field183.field978.length);
                this.field183 = null;
            }
            this.field189 = client.field299 - var1;
        }
        class41 var2 = class41.method2717(this.field197);
        if (var2.field949 != null) {
            var2 = var2.method785();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field185 == 1 || this.field185 == 3) {
            var3 = var2.field920;
            var4 = var2.field929;
        } else {
            var3 = var2.field929;
            var4 = var2.field920;
        }
        int var5 = (var3 >> 1) + this.field181;
        int var6 = (var3 + 1 >> 1) + this.field181;
        int var7 = (var4 >> 1) + this.field186;
        int var8 = (var4 + 1 >> 1) + this.field186;
        int[][] var9 = class6.field83[this.field190];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field181 << 7) + (var3 << 6);
        int var12 = (this.field186 << 7) + (var4 << 6);
        return var2.method762(this.field182, this.field185, var9, var11, var10, var12, this.field183, this.field188);
    }
}
