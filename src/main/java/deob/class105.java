package deob;

@ObfuscatedName("db")
public final class class105 extends class100 {

    @ObfuscatedName("db.v")
    public class146 field1346;

    @ObfuscatedName("db.v(IBI)V")
    public final void method2058(int arg0, byte arg1) {
        int var3 = this.field1273[0];
        int var4 = this.field1287[0];
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
        if (this.field1269 != -1 && class157.method2030(this.field1269).field1891 == 1) {
            this.field1269 = -1;
        }
        if (this.field1291 < 9) {
            this.field1291++;
        }
        for (int var5 = this.field1291; var5 > 0; var5--) {
            this.field1273[var5] = this.field1273[var5 - 1];
            this.field1287[var5] = this.field1287[var5 - 1];
            this.field1247[var5] = this.field1247[var5 - 1];
        }
        this.field1273[0] = var3;
        this.field1287[0] = var4;
        this.field1247[0] = arg1;
    }

    @ObfuscatedName("db.f(IIZI)V")
    public final void method2059(int arg0, int arg1, boolean arg2) {
        if (this.field1269 != -1 && class157.method2030(this.field1269).field1891 == 1) {
            this.field1269 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1273[0];
            int var5 = arg1 - this.field1287[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1291 < 9) {
                    this.field1291++;
                }
                for (int var6 = this.field1291; var6 > 0; var6--) {
                    this.field1273[var6] = this.field1273[var6 - 1];
                    this.field1287[var6] = this.field1287[var6 - 1];
                    this.field1247[var6] = this.field1247[var6 - 1];
                }
                this.field1273[0] = arg0;
                this.field1287[0] = arg1;
                this.field1247[0] = 1;
                return;
            }
        }
        this.field1291 = 0;
        this.field1275 = 0;
        this.field1295 = 0;
        this.field1273[0] = arg0;
        this.field1287[0] = arg1;
        this.field1238 = this.field1273[0] * 128 + this.field1240 * 64;
        this.field1237 = this.field1287[0] * 128 + this.field1240 * 64;
    }

    @ObfuscatedName("db.n(B)Lgr;")
    public final class205 method1710() {
        if (this.field1346 == null) {
            return null;
        }
        class157 var1 = this.field1269 != -1 && this.field1272 == 0 ? class157.method2030(this.field1269) : null;
        class157 var2 = this.field1243 == -1 || this.field1243 == this.field1242 && var1 != null ? null : class157.method2030(this.field1243);
        class205 var3 = this.field1346.method2530(var1, this.field1292, var2, this.field1252);
        if (var3 == null) {
            return null;
        }
        var3.method3791();
        this.field1277 = var3.field2360;
        if (this.field1274 != -1 && this.field1263 != -1) {
            class205 var4 = class148.method2427(this.field1274).method2562(this.field1263);
            if (var4 != null) {
                var4.method3802(0, -this.field1278, 0);
                class205[] var5 = new class205[] { var3, var4 };
                var3 = new class205(var5, 2);
            }
        }
        if (this.field1346.field1637 == 1) {
            var3.field2449 = true;
        }
        return var3;
    }

    @ObfuscatedName("db.m(B)Z")
    public final boolean method1968() {
        return this.field1346 != null;
    }
}
