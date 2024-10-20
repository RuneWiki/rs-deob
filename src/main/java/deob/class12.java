package deob;

@ObfuscatedName("h")
public class class12 extends class80 {

    @ObfuscatedName("h.p")
    public int field179;

    @ObfuscatedName("h.k")
    public int field176;

    @ObfuscatedName("h.e")
    public int field177;

    @ObfuscatedName("h.f")
    public int field178;

    @ObfuscatedName("h.w")
    public int field180;

    @ObfuscatedName("h.t")
    public int field184;

    @ObfuscatedName("h.s")
    public class40 field181;

    @ObfuscatedName("h.c")
    public int field182;

    @ObfuscatedName("h.d")
    public int field183;

    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class80 arg8) {
        this.field179 = arg0;
        this.field176 = arg1;
        this.field177 = arg2;
        this.field178 = arg3;
        this.field180 = arg4;
        this.field184 = arg5;
        if (arg6 != -1) {
            this.field181 = class40.method678(arg6);
            this.field182 = 0;
            this.field183 = client.field267 - 1;
            if (this.field181.field949 == 0 && arg8 != null && arg8 instanceof class12) {
                class12 var10 = (class12) arg8;
                if (this.field181 == var10.field181) {
                    this.field182 = var10.field182;
                    this.field183 = var10.field183;
                    return;
                }
            }
            if (arg7 && this.field181.field961 != -1) {
                this.field182 = (int) (Math.random() * (double) this.field181.field945.length);
                this.field183 -= (int) (Math.random() * (double) this.field181.field947[this.field182]);
            }
        }
    }

    @ObfuscatedName("h.k(I)Lcm;")
    public final class100 method23() {
        if (this.field181 != null) {
            int var1 = client.field267 - this.field183;
            if (var1 > 100 && this.field181.field961 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field181.field947[this.field182]) {
                            break label47;
                        }
                        var1 -= this.field181.field947[this.field182];
                        this.field182++;
                    } while (this.field182 < this.field181.field945.length);
                    this.field182 -= this.field181.field961;
                } while (this.field182 >= 0 && this.field182 < this.field181.field945.length);
                this.field181 = null;
            }
            this.field183 = client.field267 - var1;
        }
        class38 var2 = class38.method489(this.field179);
        if (var2.field895 != null) {
            var2 = var2.method684();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field177 == 1 || this.field177 == 3) {
            var3 = var2.field910;
            var4 = var2.field890;
        } else {
            var3 = var2.field890;
            var4 = var2.field910;
        }
        int var5 = (var3 >> 1) + this.field180;
        int var6 = (var3 + 1 >> 1) + this.field180;
        int var7 = (var4 >> 1) + this.field184;
        int var8 = (var4 + 1 >> 1) + this.field184;
        int[][] var9 = class6.field82[this.field178];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field180 << 7) + (var3 << 6);
        int var12 = (this.field184 << 7) + (var4 << 6);
        return var2.method688(this.field176, this.field177, var9, var11, var10, var12, this.field181, this.field182);
    }
}
