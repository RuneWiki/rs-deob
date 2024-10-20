package deob;

@ObfuscatedName("q")
public class class13 extends class93 {

    @ObfuscatedName("q.g")
    public int field208;

    @ObfuscatedName("q.e")
    public int field202;

    @ObfuscatedName("q.n")
    public int field213;

    @ObfuscatedName("q.j")
    public int field204;

    @ObfuscatedName("q.i")
    public int field205;

    @ObfuscatedName("q.o")
    public int field206;

    @ObfuscatedName("q.l")
    public class33 field207;

    @ObfuscatedName("q.p")
    public int field209;

    @ObfuscatedName("q.t")
    public int field203;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class93 arg8) {
        this.field208 = arg0;
        this.field202 = arg1;
        this.field213 = arg2;
        this.field204 = arg3;
        this.field205 = arg4;
        this.field206 = arg5;
        if (arg6 != -1) {
            this.field207 = class33.method224(arg6);
            this.field209 = 0;
            this.field203 = client.field652 - 1;
            if (this.field207.field876 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field207 == var10.field207) {
                    this.field209 = var10.field209;
                    this.field203 = var10.field203;
                    return;
                }
            }
            if (arg7 && this.field207.field867 != -1) {
                this.field209 = (int) (Math.random() * (double) this.field207.field863.length);
                this.field203 -= (int) (Math.random() * (double) this.field207.field862[this.field209]);
            }
        }
    }

    @ObfuscatedName("q.e(I)Ldk;")
    public final class111 method19() {
        if (this.field207 != null) {
            int var1 = client.field652 - this.field203;
            if (var1 > 100 && this.field207.field867 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field207.field862[this.field209]) {
                            break label47;
                        }
                        var1 -= this.field207.field862[this.field209];
                        this.field209++;
                    } while (this.field209 < this.field207.field863.length);
                    this.field209 -= this.field207.field867;
                } while (this.field209 >= 0 && this.field209 < this.field207.field863.length);
                this.field207 = null;
            }
            this.field203 = client.field652 - var1;
        }
        class31 var2 = class31.method245(this.field208);
        if (var2.field806 != null) {
            var2 = var2.method679();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field213 == 1 || this.field213 == 3) {
            var3 = var2.field813;
            var4 = var2.field812;
        } else {
            var3 = var2.field812;
            var4 = var2.field813;
        }
        int var5 = (var3 >> 1) + this.field205;
        int var6 = (var3 + 1 >> 1) + this.field205;
        int var7 = (var4 >> 1) + this.field206;
        int var8 = (var4 + 1 >> 1) + this.field206;
        int[][] var9 = class9.field126[this.field204];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field205 << 7) + (var3 << 6);
        int var12 = (this.field206 << 7) + (var4 << 6);
        return var2.method639(this.field202, this.field213, var9, var11, var10, var12, this.field207, this.field209);
    }
}
