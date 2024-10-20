package deob;

@ObfuscatedName("z")
public class class13 extends class85 {

    @ObfuscatedName("z.l")
    public int field187;

    @ObfuscatedName("z.e")
    public int field184;

    @ObfuscatedName("z.q")
    public int field186;

    @ObfuscatedName("z.o")
    public int field196;

    @ObfuscatedName("z.g")
    public int field183;

    @ObfuscatedName("z.m")
    public int field188;

    @ObfuscatedName("z.b")
    public class43 field189;

    @ObfuscatedName("z.p")
    public int field190;

    @ObfuscatedName("z.t")
    public int field191;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field187 = arg0;
        this.field184 = arg1;
        this.field186 = arg2;
        this.field196 = arg3;
        this.field183 = arg4;
        this.field188 = arg5;
        if (arg6 != -1) {
            this.field189 = class43.method2304(arg6);
            this.field190 = 0;
            this.field191 = client.field548 - 1;
            if (this.field189.field997 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field189 == var10.field189) {
                    this.field190 = var10.field190;
                    this.field191 = var10.field191;
                    return;
                }
            }
            if (arg7 && this.field189.field988 != -1) {
                this.field190 = (int) (Math.random() * (double) this.field189.field981.length);
                this.field191 -= (int) (Math.random() * (double) this.field189.field984[this.field190]);
            }
        }
    }

    @ObfuscatedName("z.q(B)Ldt;")
    public final class105 method18() {
        if (this.field189 != null) {
            int var1 = client.field548 - this.field191;
            if (var1 > 100 && this.field189.field988 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field189.field984[this.field190]) {
                            break label47;
                        }
                        var1 -= this.field189.field984[this.field190];
                        this.field190++;
                    } while (this.field190 < this.field189.field981.length);
                    this.field190 -= this.field189.field988;
                } while (this.field190 >= 0 && this.field190 < this.field189.field981.length);
                this.field189 = null;
            }
            this.field191 = client.field548 - var1;
        }
        class41 var2 = class41.method2705(this.field187);
        if (var2.field961 != null) {
            var2 = var2.method819();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field186 == 1 || this.field186 == 3) {
            var3 = var2.field952;
            var4 = var2.field969;
        } else {
            var3 = var2.field969;
            var4 = var2.field952;
        }
        int var5 = (var3 >> 1) + this.field183;
        int var6 = (var3 + 1 >> 1) + this.field183;
        int var7 = (var4 >> 1) + this.field188;
        int var8 = (var4 + 1 >> 1) + this.field188;
        int[][] var9 = class6.field80[this.field196];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field183 << 7) + (var3 << 6);
        int var12 = (this.field188 << 7) + (var4 << 6);
        return var2.method811(this.field184, this.field186, var9, var11, var10, var12, this.field189, this.field190);
    }
}
