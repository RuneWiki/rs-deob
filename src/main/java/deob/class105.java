package deob;

@ObfuscatedName("di")
public class class105 {

    @ObfuscatedName("di.w")
    public class121[] field1471 = new class121[10];

    @ObfuscatedName("di.e")
    public int field1472;

    @ObfuscatedName("di.k")
    public int field1474;

    @ObfuscatedName("di.a(Lib;II)Ldi;")
    public static class105 method1775(class247 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3897(arg1, arg2);
        return var3 == null ? null : new class105(new class185(var3));
    }

    public class105(class185 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2962();
            if (var3 != 0) {
                arg0.field2509--;
                this.field1471[var2] = new class121();
                this.field1471[var2].method2110(arg0);
            }
        }
        this.field1472 = arg0.method3194();
        this.field1474 = arg0.method3194();
    }

    @ObfuscatedName("di.w()Ldx;")
    public class107 method1784() {
        byte[] var1 = this.method1778();
        return new class107(22050, var1, this.field1472 * 22050 / 1000, this.field1474 * 22050 / 1000);
    }

    @ObfuscatedName("di.e()I")
    public final int method1777() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1471[var2] != null && this.field1471[var2].field1636 / 20 < var1) {
                var1 = this.field1471[var2].field1636 / 20;
            }
        }
        if (this.field1472 < this.field1474 && this.field1472 / 20 < var1) {
            var1 = this.field1472 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1471[var3] != null) {
                this.field1471[var3].field1636 -= var1 * 20;
            }
        }
        if (this.field1472 < this.field1474) {
            this.field1472 -= var1 * 20;
            this.field1474 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("di.k()[B")
    public final byte[] method1778() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1471[var2] != null && this.field1471[var2].field1642 + this.field1471[var2].field1636 > var1) {
                var1 = this.field1471[var2].field1642 + this.field1471[var2].field1636;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1471[var5] != null) {
                int var6 = this.field1471[var5].field1642 * 22050 / 1000;
                int var7 = this.field1471[var5].field1636 * 22050 / 1000;
                int[] var8 = this.field1471[var5].method2101(var6, this.field1471[var5].field1642);
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
