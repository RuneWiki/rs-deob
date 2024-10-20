package deob;

@ObfuscatedName("x")
public class class13 extends class85 {

    @ObfuscatedName("x.d")
    public int field192;

    @ObfuscatedName("x.p")
    public int field196;

    @ObfuscatedName("x.v")
    public int field186;

    @ObfuscatedName("x.l")
    public int field188;

    @ObfuscatedName("x.y")
    public int field189;

    @ObfuscatedName("x.w")
    public int field190;

    @ObfuscatedName("x.u")
    public class43 field191;

    @ObfuscatedName("x.a")
    public int field187;

    @ObfuscatedName("x.e")
    public int field193;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field192 = arg0;
        this.field196 = arg1;
        this.field186 = arg2;
        this.field188 = arg3;
        this.field189 = arg4;
        this.field190 = arg5;
        if (arg6 != -1) {
            this.field191 = class43.method578(arg6);
            this.field187 = 0;
            this.field193 = client.field299 - 1;
            if (this.field191.field1009 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field191 == var10.field191) {
                    this.field187 = var10.field187;
                    this.field193 = var10.field193;
                    return;
                }
            }
            if (arg7 && this.field191.field1000 != -1) {
                this.field187 = (int) (Math.random() * (double) this.field191.field996.length);
                this.field193 -= (int) (Math.random() * (double) this.field191.field1004[this.field187]);
            }
        }
    }

    @ObfuscatedName("x.v(B)Ldn;")
    public final class105 method15() {
        if (this.field191 != null) {
            int var1 = client.field299 - this.field193;
            if (var1 > 100 && this.field191.field1000 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field191.field1004[this.field187]) {
                            break label47;
                        }
                        var1 -= this.field191.field1004[this.field187];
                        this.field187++;
                    } while (this.field187 < this.field191.field996.length);
                    this.field187 -= this.field191.field1000;
                } while (this.field187 >= 0 && this.field187 < this.field191.field996.length);
                this.field191 = null;
            }
            this.field193 = client.field299 - var1;
        }
        class41 var2 = class41.method551(this.field192);
        if (var2.field945 != null) {
            var2 = var2.method795();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field186 == 1 || this.field186 == 3) {
            var3 = var2.field944;
            var4 = var2.field927;
        } else {
            var3 = var2.field927;
            var4 = var2.field944;
        }
        int var5 = (var3 >> 1) + this.field189;
        int var6 = (var3 + 1 >> 1) + this.field189;
        int var7 = (var4 >> 1) + this.field190;
        int var8 = (var4 + 1 >> 1) + this.field190;
        int[][] var9 = class6.field92[this.field188];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field189 << 7) + (var3 << 6);
        int var12 = (this.field190 << 7) + (var4 << 6);
        return var2.method775(this.field196, this.field186, var9, var11, var10, var12, this.field191, this.field187);
    }
}
