package deob;

@ObfuscatedName("q")
public class class11 extends class78 {

    @ObfuscatedName("q.j")
    public int field158;

    @ObfuscatedName("q.z")
    public int field168;

    @ObfuscatedName("q.y")
    public int field162;

    @ObfuscatedName("q.h")
    public int field160;

    @ObfuscatedName("q.r")
    public int field161;

    @ObfuscatedName("q.e")
    public int field157;

    @ObfuscatedName("q.k")
    public class38 field163;

    @ObfuscatedName("q.b")
    public int field164;

    @ObfuscatedName("q.n")
    public int field165;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field158 = arg0;
        this.field168 = arg1;
        this.field162 = arg2;
        this.field160 = arg3;
        this.field161 = arg4;
        this.field157 = arg5;
        if (arg6 != -1) {
            this.field163 = class38.method38(arg6);
            this.field164 = 0;
            this.field165 = client.field280 - 1;
            if (this.field163.field918 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field163 == var10.field163) {
                    this.field164 = var10.field164;
                    this.field165 = var10.field165;
                    return;
                }
            }
            if (arg7 && this.field163.field909 != -1) {
                this.field164 = (int) (Math.random() * (double) this.field163.field908.length);
                this.field165 -= (int) (Math.random() * (double) this.field163.field907[this.field164]);
            }
        }
    }

    @ObfuscatedName("q.z(I)Lcl;")
    public final class98 method15() {
        if (this.field163 != null) {
            int var1 = client.field280 - this.field165;
            if (var1 > 100 && this.field163.field909 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field163.field907[this.field164]) {
                            break label47;
                        }
                        var1 -= this.field163.field907[this.field164];
                        this.field164++;
                    } while (this.field164 < this.field163.field908.length);
                    this.field164 -= this.field163.field909;
                } while (this.field164 >= 0 && this.field164 < this.field163.field908.length);
                this.field163 = null;
            }
            this.field165 = client.field280 - var1;
        }
        class36 var2 = class36.method2079(this.field158);
        if (var2.field880 != null) {
            var2 = var2.method626();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field162 == 1 || this.field162 == 3) {
            var3 = var2.field854;
            var4 = var2.field878;
        } else {
            var3 = var2.field878;
            var4 = var2.field854;
        }
        int var5 = (var3 >> 1) + this.field161;
        int var6 = (var3 + 1 >> 1) + this.field161;
        int var7 = (var4 >> 1) + this.field157;
        int var8 = (var4 + 1 >> 1) + this.field157;
        int[][] var9 = class6.field92[this.field160];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field161 << 7) + (var3 << 6);
        int var12 = (this.field157 << 7) + (var4 << 6);
        return var2.method630(this.field168, this.field162, var9, var11, var10, var12, this.field163, this.field164);
    }
}
