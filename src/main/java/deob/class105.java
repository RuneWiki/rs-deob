package deob;

@ObfuscatedName("do")
public final class class105 extends class100 {

    @ObfuscatedName("do.f")
    public class287 field1319;

    @ObfuscatedName("do.f(IBI)V")
    public final void method1962(int arg0, byte arg1) {
        int var3 = this.field1265[0];
        int var4 = this.field1266[0];
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
        if (this.field1216 != -1 && class298.method3795(this.field1216).field3724 == 1) {
            this.field1216 = -1;
        }
        if (this.field1264 < 9) {
            this.field1264++;
        }
        for (int var5 = this.field1264; var5 > 0; var5--) {
            this.field1265[var5] = this.field1265[var5 - 1];
            this.field1266[var5] = this.field1266[var5 - 1];
            this.field1267[var5] = this.field1267[var5 - 1];
        }
        this.field1265[0] = var3;
        this.field1266[0] = var4;
        this.field1267[0] = arg1;
    }

    @ObfuscatedName("do.u(IIZI)V")
    public final void method1963(int arg0, int arg1, boolean arg2) {
        if (this.field1216 != -1 && class298.method3795(this.field1216).field3724 == 1) {
            this.field1216 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1265[0];
            int var5 = arg1 - this.field1266[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1264 < 9) {
                    this.field1264++;
                }
                for (int var6 = this.field1264; var6 > 0; var6--) {
                    this.field1265[var6] = this.field1265[var6 - 1];
                    this.field1266[var6] = this.field1266[var6 - 1];
                    this.field1267[var6] = this.field1267[var6 - 1];
                }
                this.field1265[0] = arg0;
                this.field1266[0] = arg1;
                this.field1267[0] = 1;
                return;
            }
        }
        this.field1264 = 0;
        this.field1225 = 0;
        this.field1268 = 0;
        this.field1265[0] = arg0;
        this.field1266[0] = arg1;
        this.field1232 = this.field1265[0] * 128 + this.field1259 * 64;
        this.field1210 = this.field1266[0] * 128 + this.field1259 * 64;
    }

    @ObfuscatedName("do.o(I)Lgv;")
    public final class183 method1649() {
        if (this.field1319 == null) {
            return null;
        }
        class298 var1 = this.field1216 != -1 && this.field1245 == 0 ? class298.method3795(this.field1216) : null;
        class298 var2 = this.field1261 == -1 || this.field1261 == this.field1211 && var1 != null ? null : class298.method3795(this.field1261);
        class183 var3 = this.field1319.method4462(var1, this.field1243, var2, this.field1244);
        if (var3 == null) {
            return null;
        }
        var3.method3240();
        this.field1260 = var3.field1999;
        if (this.field1257 != -1 && this.field1248 != -1) {
            class183 var4 = class289.method3663(this.field1257).method4473(this.field1248);
            if (var4 != null) {
                var4.method3251(0, -this.field1239, 0);
                class183[] var5 = new class183[] { var3, var4 };
                var3 = new class183(var5, 2);
            }
        }
        if (this.field1319.field3480 == 1) {
            var3.field2078 = true;
        }
        return var3;
    }

    @ObfuscatedName("do.j(B)Z")
    public final boolean method1857() {
        return this.field1319 != null;
    }
}
