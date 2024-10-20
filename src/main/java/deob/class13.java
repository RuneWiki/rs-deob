package deob;

@ObfuscatedName("b")
public class class13 extends class93 {

    @ObfuscatedName("b.c")
    public int field223;

    @ObfuscatedName("b.j")
    public int field211;

    @ObfuscatedName("b.f")
    public int field212;

    @ObfuscatedName("b.y")
    public int field215;

    @ObfuscatedName("b.x")
    public int field214;

    @ObfuscatedName("b.e")
    public int field219;

    @ObfuscatedName("b.m")
    public class33 field216;

    @ObfuscatedName("b.s")
    public int field217;

    @ObfuscatedName("b.p")
    public int field213;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class93 arg8) {
        this.field223 = arg0;
        this.field211 = arg1;
        this.field212 = arg2;
        this.field215 = arg3;
        this.field214 = arg4;
        this.field219 = arg5;
        if (arg6 != -1) {
            this.field216 = class33.method2589(arg6);
            this.field217 = 0;
            this.field213 = client.field516 - 1;
            if (this.field216.field875 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field216 == var10.field216) {
                    this.field217 = var10.field217;
                    this.field213 = var10.field213;
                    return;
                }
            }
            if (arg7 && this.field216.field866 != -1) {
                this.field217 = (int) (Math.random() * (double) this.field216.field857.length);
                this.field213 -= (int) (Math.random() * (double) this.field216.field864[this.field217]);
            }
        }
    }

    @ObfuscatedName("b.j(B)Ldf;")
    public final class111 method18() {
        if (this.field216 != null) {
            int var1 = client.field516 - this.field213;
            if (var1 > 100 && this.field216.field866 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field216.field864[this.field217]) {
                            break label47;
                        }
                        var1 -= this.field216.field864[this.field217];
                        this.field217++;
                    } while (this.field217 < this.field216.field857.length);
                    this.field217 -= this.field216.field866;
                } while (this.field217 >= 0 && this.field217 < this.field216.field857.length);
                this.field216 = null;
            }
            this.field213 = client.field516 - var1;
        }
        class31 var2 = class31.method2519(this.field223);
        if (var2.field812 != null) {
            var2 = var2.method594();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field212 == 1 || this.field212 == 3) {
            var3 = var2.field796;
            var4 = var2.field810;
        } else {
            var3 = var2.field810;
            var4 = var2.field796;
        }
        int var5 = (var3 >> 1) + this.field214;
        int var6 = (var3 + 1 >> 1) + this.field214;
        int var7 = (var4 >> 1) + this.field219;
        int var8 = (var4 + 1 >> 1) + this.field219;
        int[][] var9 = class9.field157[this.field215];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field214 << 7) + (var3 << 6);
        int var12 = (this.field219 << 7) + (var4 << 6);
        return var2.method612(this.field211, this.field212, var9, var11, var10, var12, this.field216, this.field217);
    }
}
