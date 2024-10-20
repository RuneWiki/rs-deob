package deob;

@ObfuscatedName("cr")
public class class103 {

    @ObfuscatedName("cr.i")
    public class119[] field1462 = new class119[10];

    @ObfuscatedName("cr.w")
    public int field1463;

    @ObfuscatedName("cr.s")
    public int field1465;

    @ObfuscatedName("cr.p(Lik;II)Lcr;")
    public static class103 method1961(class247 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4032(arg1, arg2);
        return var3 == null ? null : new class103(new class185(var3));
    }

    public class103(class185 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3197();
            if (var3 != 0) {
                arg0.field2488--;
                this.field1462[var2] = new class119();
                this.field1462[var2].method2270(arg0);
            }
        }
        this.field1463 = arg0.method3124();
        this.field1465 = arg0.method3124();
    }

    @ObfuscatedName("cr.i()Ldp;")
    public class105 method1965() {
        byte[] var1 = this.method1960();
        return new class105(22050, var1, this.field1463 * 22050 / 1000, this.field1465 * 22050 / 1000);
    }

    @ObfuscatedName("cr.w()I")
    public final int method1959() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1462[var2] != null && this.field1462[var2].field1616 / 20 < var1) {
                var1 = this.field1462[var2].field1616 / 20;
            }
        }
        if (this.field1463 < this.field1465 && this.field1463 / 20 < var1) {
            var1 = this.field1463 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1462[var3] != null) {
                this.field1462[var3].field1616 -= var1 * 20;
            }
        }
        if (this.field1463 < this.field1465) {
            this.field1463 -= var1 * 20;
            this.field1465 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cr.s()[B")
    public final byte[] method1960() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1462[var2] != null && this.field1462[var2].field1622 + this.field1462[var2].field1616 > var1) {
                var1 = this.field1462[var2].field1622 + this.field1462[var2].field1616;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1462[var5] != null) {
                int var6 = this.field1462[var5].field1622 * 22050 / 1000;
                int var7 = this.field1462[var5].field1616 * 22050 / 1000;
                int[] var8 = this.field1462[var5].method2272(var6, this.field1462[var5].field1622);
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
