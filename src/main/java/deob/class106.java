package deob;

@ObfuscatedName("dc")
public class class106 {

    @ObfuscatedName("dc.o")
    public class122[] field1538 = new class122[10];

    @ObfuscatedName("dc.i")
    public int field1540;

    @ObfuscatedName("dc.u")
    public int field1541;

    @ObfuscatedName("dc.c(Lip;II)Ldc;")
    public static class106 method1735(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3741(arg1, arg2);
        return var3 == null ? null : new class106(new class174(var3));
    }

    public class106(class174 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2843();
            if (var3 != 0) {
                arg0.field2357--;
                this.field1538[var2] = new class122();
                this.field1538[var2].method2056(arg0);
            }
        }
        this.field1540 = arg0.method2861();
        this.field1541 = arg0.method2861();
    }

    @ObfuscatedName("dc.o()Ldm;")
    public class108 method1728() {
        byte[] var1 = this.method1730();
        return new class108(22050, var1, this.field1540 * 22050 / 1000, this.field1541 * 22050 / 1000);
    }

    @ObfuscatedName("dc.i()I")
    public final int method1736() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1538[var2] != null && this.field1538[var2].field1705 / 20 < var1) {
                var1 = this.field1538[var2].field1705 / 20;
            }
        }
        if (this.field1540 < this.field1541 && this.field1540 / 20 < var1) {
            var1 = this.field1540 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1538[var3] != null) {
                this.field1538[var3].field1705 -= var1 * 20;
            }
        }
        if (this.field1540 < this.field1541) {
            this.field1540 -= var1 * 20;
            this.field1541 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("dc.u()[B")
    public final byte[] method1730() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1538[var2] != null && this.field1538[var2].field1705 + this.field1538[var2].field1692 > var1) {
                var1 = this.field1538[var2].field1705 + this.field1538[var2].field1692;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1538[var5] != null) {
                int var6 = this.field1538[var5].field1692 * 22050 / 1000;
                int var7 = this.field1538[var5].field1705 * 22050 / 1000;
                int[] var8 = this.field1538[var5].method2054(var6, this.field1538[var5].field1692);
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
