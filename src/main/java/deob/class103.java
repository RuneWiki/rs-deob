package deob;

@ObfuscatedName("ch")
public class class103 {

    @ObfuscatedName("ch.q")
    public class119[] field1457 = new class119[10];

    @ObfuscatedName("ch.o")
    public int field1456;

    @ObfuscatedName("ch.p")
    public int field1458;

    @ObfuscatedName("ch.b(Lie;II)Lch;")
    public static class103 method1985(class256 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4158(arg1, arg2);
        return var3 == null ? null : new class103(new class194(var3));
    }

    public class103(class194 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3247();
            if (var3 != 0) {
                arg0.field2538--;
                this.field1457[var2] = new class119();
                this.field1457[var2].method2296(arg0);
            }
        }
        this.field1456 = arg0.method3249();
        this.field1458 = arg0.method3249();
    }

    @ObfuscatedName("ch.q()Ldb;")
    public class105 method1975() {
        byte[] var1 = this.method1977();
        return new class105(22050, var1, this.field1456 * 22050 / 1000, this.field1458 * 22050 / 1000);
    }

    @ObfuscatedName("ch.o()I")
    public final int method1976() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1457[var2] != null && this.field1457[var2].field1625 / 20 < var1) {
                var1 = this.field1457[var2].field1625 / 20;
            }
        }
        if (this.field1456 < this.field1458 && this.field1456 / 20 < var1) {
            var1 = this.field1456 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1457[var3] != null) {
                this.field1457[var3].field1625 -= var1 * 20;
            }
        }
        if (this.field1456 < this.field1458) {
            this.field1456 -= var1 * 20;
            this.field1458 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ch.p()[B")
    public final byte[] method1977() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1457[var2] != null && this.field1457[var2].field1625 + this.field1457[var2].field1609 > var1) {
                var1 = this.field1457[var2].field1625 + this.field1457[var2].field1609;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1457[var5] != null) {
                int var6 = this.field1457[var5].field1609 * 22050 / 1000;
                int var7 = this.field1457[var5].field1625 * 22050 / 1000;
                int[] var8 = this.field1457[var5].method2295(var6, this.field1457[var5].field1609);
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
