package deob;

@ObfuscatedName("do")
public class class106 {

    @ObfuscatedName("do.c")
    public class122[] field1566 = new class122[10];

    @ObfuscatedName("do.f")
    public int field1567;

    @ObfuscatedName("do.m")
    public int field1565;

    @ObfuscatedName("do.s(Liw;II)Ldo;")
    public static class106 method1822(class239 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3840(arg1, arg2);
        return var3 == null ? null : new class106(new class177(var3));
    }

    public class106(class177 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2965();
            if (var3 != 0) {
                arg0.field2402--;
                this.field1566[var2] = new class122();
                this.field1566[var2].method2151(arg0);
            }
        }
        this.field1567 = arg0.method2967();
        this.field1565 = arg0.method2967();
    }

    @ObfuscatedName("do.c()Ldl;")
    public class108 method1821() {
        byte[] var1 = this.method1824();
        return new class108(22050, var1, this.field1567 * 22050 / 1000, this.field1565 * 22050 / 1000);
    }

    @ObfuscatedName("do.f()I")
    public final int method1823() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1566[var2] != null && this.field1566[var2].field1738 / 20 < var1) {
                var1 = this.field1566[var2].field1738 / 20;
            }
        }
        if (this.field1567 < this.field1565 && this.field1567 / 20 < var1) {
            var1 = this.field1567 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1566[var3] != null) {
                this.field1566[var3].field1738 -= var1 * 20;
            }
        }
        if (this.field1567 < this.field1565) {
            this.field1567 -= var1 * 20;
            this.field1565 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("do.m()[B")
    public final byte[] method1824() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1566[var2] != null && this.field1566[var2].field1744 + this.field1566[var2].field1738 > var1) {
                var1 = this.field1566[var2].field1744 + this.field1566[var2].field1738;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1566[var5] != null) {
                int var6 = this.field1566[var5].field1744 * 22050 / 1000;
                int var7 = this.field1566[var5].field1738 * 22050 / 1000;
                int[] var8 = this.field1566[var5].method2153(var6, this.field1566[var5].field1744);
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
