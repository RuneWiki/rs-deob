package deob;

@ObfuscatedName("cf")
public class class104 {

    @ObfuscatedName("cf.k")
    public class120[] field1559 = new class120[10];

    @ObfuscatedName("cf.e")
    public int field1560;

    @ObfuscatedName("cf.p")
    public int field1561;

    @ObfuscatedName("cf.d(Lit;II)Lcf;")
    public static class104 method1850(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3875(arg1, arg2);
        return var3 == null ? null : new class104(new class174(var3));
    }

    public class104(class174 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2955();
            if (var3 != 0) {
                arg0.field2405--;
                this.field1559[var2] = new class120();
                this.field1559[var2].method2172(arg0);
            }
        }
        this.field1560 = arg0.method3035();
        this.field1561 = arg0.method3035();
    }

    @ObfuscatedName("cf.k()Ldo;")
    public class106 method1851() {
        byte[] var1 = this.method1859();
        return new class106(22050, var1, this.field1560 * 22050 / 1000, this.field1561 * 22050 / 1000);
    }

    @ObfuscatedName("cf.e()I")
    public final int method1852() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1559[var2] != null && this.field1559[var2].field1728 / 20 < var1) {
                var1 = this.field1559[var2].field1728 / 20;
            }
        }
        if (this.field1560 < this.field1561 && this.field1560 / 20 < var1) {
            var1 = this.field1560 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1559[var3] != null) {
                this.field1559[var3].field1728 -= var1 * 20;
            }
        }
        if (this.field1560 < this.field1561) {
            this.field1560 -= var1 * 20;
            this.field1561 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cf.p()[B")
    public final byte[] method1859() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1559[var2] != null && this.field1559[var2].field1728 + this.field1559[var2].field1727 > var1) {
                var1 = this.field1559[var2].field1728 + this.field1559[var2].field1727;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1559[var5] != null) {
                int var6 = this.field1559[var5].field1727 * 22050 / 1000;
                int var7 = this.field1559[var5].field1728 * 22050 / 1000;
                int[] var8 = this.field1559[var5].method2169(var6, this.field1559[var5].field1727);
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
