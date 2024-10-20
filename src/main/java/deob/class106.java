package deob;

@ObfuscatedName("de")
public class class106 {

    @ObfuscatedName("de.o")
    public class122[] field1573 = new class122[10];

    @ObfuscatedName("de.m")
    public int field1572;

    @ObfuscatedName("de.g")
    public int field1570;

    @ObfuscatedName("de.e(Lin;II)Lde;")
    public static class106 method1766(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3760(arg1, arg2);
        return var3 == null ? null : new class106(new class174(var3));
    }

    public class106(class174 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2891();
            if (var3 != 0) {
                arg0.field2370--;
                this.field1573[var2] = new class122();
                this.field1573[var2].method2098(arg0);
            }
        }
        this.field1572 = arg0.method2930();
        this.field1570 = arg0.method2930();
    }

    @ObfuscatedName("de.o()Ldg;")
    public class108 method1774() {
        byte[] var1 = this.method1769();
        return new class108(22050, var1, this.field1572 * 22050 / 1000, this.field1570 * 22050 / 1000);
    }

    @ObfuscatedName("de.m()I")
    public final int method1768() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1573[var2] != null && this.field1573[var2].field1736 / 20 < var1) {
                var1 = this.field1573[var2].field1736 / 20;
            }
        }
        if (this.field1572 < this.field1570 && this.field1572 / 20 < var1) {
            var1 = this.field1572 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1573[var3] != null) {
                this.field1573[var3].field1736 -= var1 * 20;
            }
        }
        if (this.field1572 < this.field1570) {
            this.field1572 -= var1 * 20;
            this.field1570 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("de.g()[B")
    public final byte[] method1769() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1573[var2] != null && this.field1573[var2].field1739 + this.field1573[var2].field1736 > var1) {
                var1 = this.field1573[var2].field1739 + this.field1573[var2].field1736;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1573[var5] != null) {
                int var6 = this.field1573[var5].field1739 * 22050 / 1000;
                int var7 = this.field1573[var5].field1736 * 22050 / 1000;
                int[] var8 = this.field1573[var5].method2099(var6, this.field1573[var5].field1739);
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
