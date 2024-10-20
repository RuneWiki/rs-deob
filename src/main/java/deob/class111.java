package deob;

@ObfuscatedName("db")
public class class111 {

    @ObfuscatedName("db.v")
    public class127[] field1365 = new class127[10];

    @ObfuscatedName("db.d")
    public int field1363;

    @ObfuscatedName("db.c")
    public int field1366;

    @ObfuscatedName("db.n(Lig;II)Ldb;")
    public static class111 method2351(class245 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4032(arg1, arg2);
        return var3 == null ? null : new class111(new class311(var3));
    }

    public class111(class311 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5310();
            if (var3 != 0) {
                arg0.field3747--;
                this.field1365[var2] = new class127();
                this.field1365[var2].method2653(arg0);
            }
        }
        this.field1363 = arg0.method5247();
        this.field1366 = arg0.method5247();
    }

    @ObfuscatedName("db.v()Ldm;")
    public class113 method2343() {
        byte[] var1 = this.method2345();
        return new class113(22050, var1, this.field1363 * 22050 / 1000, this.field1366 * 22050 / 1000);
    }

    @ObfuscatedName("db.d()I")
    public final int method2346() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1365[var2] != null && this.field1365[var2].field1519 / 20 < var1) {
                var1 = this.field1365[var2].field1519 / 20;
            }
        }
        if (this.field1363 < this.field1366 && this.field1363 / 20 < var1) {
            var1 = this.field1363 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1365[var3] != null) {
                this.field1365[var3].field1519 -= var1 * 20;
            }
        }
        if (this.field1363 < this.field1366) {
            this.field1363 -= var1 * 20;
            this.field1366 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("db.c()[B")
    public final byte[] method2345() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1365[var2] != null && this.field1365[var2].field1534 + this.field1365[var2].field1519 > var1) {
                var1 = this.field1365[var2].field1534 + this.field1365[var2].field1519;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1365[var5] != null) {
                int var6 = this.field1365[var5].field1534 * 22050 / 1000;
                int var7 = this.field1365[var5].field1519 * 22050 / 1000;
                int[] var8 = this.field1365[var5].method2654(var6, this.field1365[var5].field1534);
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                    if ((var10 + 128 & 0xFFFFFF00) != 0) {
                        var10 = var10 >> 31 ^ 0x7F;
                    }
                    var4[var7 + var9] = (byte) var10;
                }
            }
        }
        return var4;
    }
}
