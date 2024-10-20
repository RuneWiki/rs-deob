package deob;

@ObfuscatedName("du")
public final class class105 extends class100 {

    @ObfuscatedName("du.f")
    public class147 field1328;

    @ObfuscatedName("du.f(IBI)V")
    public final void method2076(int arg0, byte arg1) {
        int var3 = this.field1278[0];
        int var4 = this.field1279[0];
        if (arg0 == 0) {
            var3--;
            var4++;
        }
        if (arg0 == 1) {
            var4++;
        }
        if (arg0 == 2) {
            var3++;
            var4++;
        }
        if (arg0 == 3) {
            var3--;
        }
        if (arg0 == 4) {
            var3++;
        }
        if (arg0 == 5) {
            var3--;
            var4--;
        }
        if (arg0 == 6) {
            var4--;
        }
        if (arg0 == 7) {
            var3++;
            var4--;
        }
        if (this.field1255 != -1 && class158.method3363(this.field1255).field1894 == 1) {
            this.field1255 = -1;
        }
        if (this.field1228 < 9) {
            this.field1228++;
        }
        for (int var5 = this.field1228; var5 > 0; var5--) {
            this.field1278[var5] = this.field1278[var5 - 1];
            this.field1279[var5] = this.field1279[var5 - 1];
            this.field1280[var5] = this.field1280[var5 - 1];
        }
        this.field1278[0] = var3;
        this.field1279[0] = var4;
        this.field1280[0] = arg1;
    }

    @ObfuscatedName("du.v(IIZB)V")
    public final void method2077(int arg0, int arg1, boolean arg2) {
        if (this.field1255 != -1 && class158.method3363(this.field1255).field1894 == 1) {
            this.field1255 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1278[0];
            int var5 = arg1 - this.field1279[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1228 < 9) {
                    this.field1228++;
                }
                for (int var6 = this.field1228; var6 > 0; var6--) {
                    this.field1278[var6] = this.field1278[var6 - 1];
                    this.field1279[var6] = this.field1279[var6 - 1];
                    this.field1280[var6] = this.field1280[var6 - 1];
                }
                this.field1278[0] = arg0;
                this.field1279[0] = arg1;
                this.field1280[0] = 1;
                return;
            }
        }
        this.field1228 = 0;
        this.field1282 = 0;
        this.field1243 = 0;
        this.field1278[0] = arg0;
        this.field1279[0] = arg1;
        this.field1242 = this.field1278[0] * 128 + this.field1226 * 64;
        this.field1223 = this.field1279[0] * 128 + this.field1226 * 64;
    }

    @ObfuscatedName("du.e(I)Lgd;")
    public final class206 method1758() {
        if (this.field1328 == null) {
            return null;
        }
        class158 var1 = this.field1255 != -1 && this.field1258 == 0 ? class158.method3363(this.field1255) : null;
        class158 var2 = this.field1252 == -1 || this.field1252 == this.field1248 && var1 != null ? null : class158.method3363(this.field1252);
        class206 var3 = this.field1328.method2536(var1, this.field1272, var2, this.field1222);
        if (var3 == null) {
            return null;
        }
        var3.method3842();
        this.field1273 = var3.field2359;
        if (this.field1260 != -1 && this.field1261 != -1) {
            class206 var4 = class149.method1892(this.field1260).method2580(this.field1261);
            if (var4 != null) {
                var4.method3872(0, -this.field1264, 0);
                class206[] var5 = new class206[] { var3, var4 };
                var3 = new class206(var5, 2);
            }
        }
        if (this.field1328.field1666 == 1) {
            var3.field2445 = true;
        }
        return var3;
    }

    @ObfuscatedName("du.x(B)Z")
    public final boolean method1987() {
        return this.field1328 != null;
    }
}
