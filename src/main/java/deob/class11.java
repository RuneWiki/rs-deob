package deob;

@ObfuscatedName("x")
public class class11 extends class78 {

    @ObfuscatedName("x.g")
    public int field149;

    @ObfuscatedName("x.s")
    public int field144;

    @ObfuscatedName("x.h")
    public int field145;

    @ObfuscatedName("x.m")
    public int field155;

    @ObfuscatedName("x.u")
    public int field143;

    @ObfuscatedName("x.j")
    public int field148;

    @ObfuscatedName("x.b")
    public class38 field146;

    @ObfuscatedName("x.v")
    public int field147;

    @ObfuscatedName("x.y")
    public int field151;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field149 = arg0;
        this.field144 = arg1;
        this.field145 = arg2;
        this.field155 = arg3;
        this.field143 = arg4;
        this.field148 = arg5;
        if (arg6 != -1) {
            this.field146 = class38.method114(arg6);
            this.field147 = 0;
            this.field151 = client.field251 - 1;
            if (this.field146.field913 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field146 == var10.field146) {
                    this.field147 = var10.field147;
                    this.field151 = var10.field151;
                    return;
                }
            }
            if (arg7 && this.field146.field902 != -1) {
                this.field147 = (int) (Math.random() * (double) this.field146.field900.length);
                this.field151 -= (int) (Math.random() * (double) this.field146.field895[this.field147]);
            }
        }
    }

    @ObfuscatedName("x.s(I)Lcl;")
    public final class98 method17() {
        if (this.field146 != null) {
            int var1 = client.field251 - this.field151;
            if (var1 > 100 && this.field146.field902 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field146.field895[this.field147]) {
                            break label47;
                        }
                        var1 -= this.field146.field895[this.field147];
                        this.field147++;
                    } while (this.field147 < this.field146.field900.length);
                    this.field147 -= this.field146.field902;
                } while (this.field147 >= 0 && this.field147 < this.field146.field900.length);
                this.field146 = null;
            }
            this.field151 = client.field251 - var1;
        }
        class36 var2 = class36.method2773(this.field149);
        if (var2.field846 != null) {
            var2 = var2.method660();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field145 == 1 || this.field145 == 3) {
            var3 = var2.field845;
            var4 = var2.field844;
        } else {
            var3 = var2.field844;
            var4 = var2.field845;
        }
        int var5 = (var3 >> 1) + this.field143;
        int var6 = (var3 + 1 >> 1) + this.field143;
        int var7 = (var4 >> 1) + this.field148;
        int var8 = (var4 + 1 >> 1) + this.field148;
        int[][] var9 = class6.field65[this.field155];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field143 << 7) + (var3 << 6);
        int var12 = (this.field148 << 7) + (var4 << 6);
        return var2.method658(this.field144, this.field145, var9, var11, var10, var12, this.field146, this.field147);
    }
}
