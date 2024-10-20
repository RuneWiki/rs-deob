package deob;

@ObfuscatedName("e")
public class class13 extends class93 {

    @ObfuscatedName("e.u")
    public int field221;

    @ObfuscatedName("e.k")
    public int field207;

    @ObfuscatedName("e.x")
    public int field206;

    @ObfuscatedName("e.m")
    public int field209;

    @ObfuscatedName("e.n")
    public int field210;

    @ObfuscatedName("e.q")
    public int field211;

    @ObfuscatedName("e.a")
    public class33 field212;

    @ObfuscatedName("e.g")
    public int field213;

    @ObfuscatedName("e.j")
    public int field214;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class93 arg8) {
        this.field221 = arg0;
        this.field207 = arg1;
        this.field206 = arg2;
        this.field209 = arg3;
        this.field210 = arg4;
        this.field211 = arg5;
        if (arg6 != -1) {
            this.field212 = Statics.method147(arg6);
            this.field213 = 0;
            this.field214 = client.field477 - 1;
            if (this.field212.field886 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field212 == var10.field212) {
                    this.field213 = var10.field213;
                    this.field214 = var10.field214;
                    return;
                }
            }
            if (arg7 && this.field212.field880 != -1) {
                this.field213 = (int) (Math.random() * (double) this.field212.field884.length);
                this.field214 -= (int) (Math.random() * (double) this.field212.field878[this.field213]);
            }
        }
    }

    @ObfuscatedName("e.k(B)Ldd;")
    public final class111 method30() {
        if (this.field212 != null) {
            int var1 = client.field477 - this.field214;
            if (var1 > 100 && this.field212.field880 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field212.field878[this.field213]) {
                            break label47;
                        }
                        var1 -= this.field212.field878[this.field213];
                        this.field213++;
                    } while (this.field213 < this.field212.field884.length);
                    this.field213 -= this.field212.field880;
                } while (this.field213 >= 0 && this.field213 < this.field212.field884.length);
                this.field212 = null;
            }
            this.field214 = client.field477 - var1;
        }
        class31 var2 = class31.method132(this.field221);
        if (var2.field851 != null) {
            var2 = var2.method622();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field206 == 1 || this.field206 == 3) {
            var3 = var2.field840;
            var4 = var2.field852;
        } else {
            var3 = var2.field852;
            var4 = var2.field840;
        }
        int var5 = (var3 >> 1) + this.field210;
        int var6 = (var3 + 1 >> 1) + this.field210;
        int var7 = (var4 >> 1) + this.field211;
        int var8 = (var4 + 1 >> 1) + this.field211;
        int[][] var9 = class9.field137[this.field209];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field210 << 7) + (var3 << 6);
        int var12 = (this.field211 << 7) + (var4 << 6);
        return var2.method620(this.field207, this.field206, var9, var11, var10, var12, this.field212, this.field213);
    }
}
