package deob;

@ObfuscatedName("r")
public class class11 extends class78 {

    @ObfuscatedName("r.z")
    public int field167;

    @ObfuscatedName("r.j")
    public int field154;

    @ObfuscatedName("r.a")
    public int field155;

    @ObfuscatedName("r.y")
    public int field156;

    @ObfuscatedName("r.i")
    public int field168;

    @ObfuscatedName("r.b")
    public int field157;

    @ObfuscatedName("r.s")
    public class38 field159;

    @ObfuscatedName("r.q")
    public int field165;

    @ObfuscatedName("r.p")
    public int field161;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field167 = arg0;
        this.field154 = arg1;
        this.field155 = arg2;
        this.field156 = arg3;
        this.field168 = arg4;
        this.field157 = arg5;
        if (arg6 != -1) {
            this.field159 = class38.method84(arg6);
            this.field165 = 0;
            this.field161 = client.field386 - 1;
            if (this.field159.field885 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field159 == var10.field159) {
                    this.field165 = var10.field165;
                    this.field161 = var10.field161;
                    return;
                }
            }
            if (arg7 && this.field159.field883 != -1) {
                this.field165 = (int) (Math.random() * (double) this.field159.field872.length);
                this.field161 -= (int) (Math.random() * (double) this.field159.field867[this.field165]);
            }
        }
    }

    @ObfuscatedName("r.j(B)Lcu;")
    public final class98 method16() {
        if (this.field159 != null) {
            int var1 = client.field386 - this.field161;
            if (var1 > 100 && this.field159.field883 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field159.field867[this.field165]) {
                            break label47;
                        }
                        var1 -= this.field159.field867[this.field165];
                        this.field165++;
                    } while (this.field165 < this.field159.field872.length);
                    this.field165 -= this.field159.field883;
                } while (this.field165 >= 0 && this.field165 < this.field159.field872.length);
                this.field159 = null;
            }
            this.field161 = client.field386 - var1;
        }
        class36 var2 = class36.method167(this.field167);
        if (var2.field848 != null) {
            var2 = var2.method636();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field155 == 1 || this.field155 == 3) {
            var3 = var2.field823;
            var4 = var2.field822;
        } else {
            var3 = var2.field822;
            var4 = var2.field823;
        }
        int var5 = (var3 >> 1) + this.field168;
        int var6 = (var3 + 1 >> 1) + this.field168;
        int var7 = (var4 >> 1) + this.field157;
        int var8 = (var4 + 1 >> 1) + this.field157;
        int[][] var9 = class6.field74[this.field156];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field168 << 7) + (var3 << 6);
        int var12 = (this.field157 << 7) + (var4 << 6);
        return var2.method634(this.field154, this.field155, var9, var11, var10, var12, this.field159, this.field165);
    }
}
