package deob;

@ObfuscatedName("u")
public class class10 extends class75 {

    @ObfuscatedName("u.m")
    public int field165;

    @ObfuscatedName("u.k")
    public int field162;

    @ObfuscatedName("u.y")
    public int field158;

    @ObfuscatedName("u.g")
    public int field159;

    @ObfuscatedName("u.r")
    public int field160;

    @ObfuscatedName("u.i")
    public int field161;

    @ObfuscatedName("u.f")
    public class35 field168;

    @ObfuscatedName("u.a")
    public int field163;

    @ObfuscatedName("u.w")
    public int field164;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class75 arg8) {
        this.field165 = arg0;
        this.field162 = arg1;
        this.field158 = arg2;
        this.field159 = arg3;
        this.field160 = arg4;
        this.field161 = arg5;
        if (arg6 != -1) {
            this.field168 = class35.method162(arg6);
            this.field163 = 0;
            this.field164 = client.field463 - 1;
            if (this.field168.field874 == 0 && arg8 != null && arg8 instanceof class10) {
                class10 var10 = (class10) arg8;
                if (this.field168 == var10.field168) {
                    this.field163 = var10.field163;
                    this.field164 = var10.field164;
                    return;
                }
            }
            if (arg7 && this.field168.field872 != -1) {
                this.field163 = (int) (Math.random() * (double) this.field168.field870.length);
                this.field164 -= (int) (Math.random() * (double) this.field168.field884[this.field163]);
            }
        }
    }

    @ObfuscatedName("u.k(I)Lcl;")
    public final class95 method22() {
        if (this.field168 != null) {
            int var1 = client.field463 - this.field164;
            if (var1 > 100 && this.field168.field872 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field168.field884[this.field163]) {
                            break label47;
                        }
                        var1 -= this.field168.field884[this.field163];
                        this.field163++;
                    } while (this.field163 < this.field168.field870.length);
                    this.field163 -= this.field168.field872;
                } while (this.field163 >= 0 && this.field163 < this.field168.field870.length);
                this.field168 = null;
            }
            this.field164 = client.field463 - var1;
        }
        class33 var2 = class33.method13(this.field165);
        if (var2.field839 != null) {
            var2 = var2.method621();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field158 == 1 || this.field158 == 3) {
            var3 = var2.field816;
            var4 = var2.field813;
        } else {
            var3 = var2.field813;
            var4 = var2.field816;
        }
        int var5 = (var3 >> 1) + this.field160;
        int var6 = (var3 + 1 >> 1) + this.field160;
        int var7 = (var4 >> 1) + this.field161;
        int var8 = (var4 + 1 >> 1) + this.field161;
        int[][] var9 = class6.field97[this.field159];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field160 << 7) + (var3 << 6);
        int var12 = (this.field161 << 7) + (var4 << 6);
        return var2.method619(this.field162, this.field158, var9, var11, var10, var12, this.field168, this.field163);
    }
}
