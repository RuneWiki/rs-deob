package deob;

@ObfuscatedName("o")
public class class11 extends class79 {

    @ObfuscatedName("o.v")
    public int field159;

    @ObfuscatedName("o.t")
    public int field156;

    @ObfuscatedName("o.f")
    public int field157;

    @ObfuscatedName("o.j")
    public int field165;

    @ObfuscatedName("o.l")
    public int field162;

    @ObfuscatedName("o.g")
    public int field160;

    @ObfuscatedName("o.k")
    public class39 field161;

    @ObfuscatedName("o.p")
    public int field171;

    @ObfuscatedName("o.y")
    public int field163;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class79 arg8) {
        this.field159 = arg0;
        this.field156 = arg1;
        this.field157 = arg2;
        this.field165 = arg3;
        this.field162 = arg4;
        this.field160 = arg5;
        if (arg6 != -1) {
            this.field161 = class39.method682(arg6);
            this.field171 = 0;
            this.field163 = client.field257 - 1;
            if (this.field161.field922 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field161 == var10.field161) {
                    this.field171 = var10.field171;
                    this.field163 = var10.field163;
                    return;
                }
            }
            if (arg7 && this.field161.field913 != -1) {
                this.field171 = (int) (Math.random() * (double) this.field161.field908.length);
                this.field163 -= (int) (Math.random() * (double) this.field161.field911[this.field171]);
            }
        }
    }

    @ObfuscatedName("o.t(I)Lcy;")
    public final class99 method11() {
        if (this.field161 != null) {
            int var1 = client.field257 - this.field163;
            if (var1 > 100 && this.field161.field913 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field161.field911[this.field171]) {
                            break label47;
                        }
                        var1 -= this.field161.field911[this.field171];
                        this.field171++;
                    } while (this.field171 < this.field161.field908.length);
                    this.field171 -= this.field161.field913;
                } while (this.field171 >= 0 && this.field171 < this.field161.field908.length);
                this.field161 = null;
            }
            this.field163 = client.field257 - var1;
        }
        class37 var2 = class37.method7(this.field159);
        if (var2.field880 != null) {
            var2 = var2.method665();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field157 == 1 || this.field157 == 3) {
            var3 = var2.field875;
            var4 = var2.field854;
        } else {
            var3 = var2.field854;
            var4 = var2.field875;
        }
        int var5 = (var3 >> 1) + this.field162;
        int var6 = (var3 + 1 >> 1) + this.field162;
        int var7 = (var4 >> 1) + this.field160;
        int var8 = (var4 + 1 >> 1) + this.field160;
        int[][] var9 = class6.field90[this.field165];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field162 << 7) + (var3 << 6);
        int var12 = (this.field160 << 7) + (var4 << 6);
        return var2.method663(this.field156, this.field157, var9, var11, var10, var12, this.field161, this.field171);
    }
}
