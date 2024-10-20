package deob;

@ObfuscatedName("dr")
public class class105 {

    @ObfuscatedName("dr.g")
    public class121[] field1488 = new class121[10];

    @ObfuscatedName("dr.m")
    public int field1487;

    @ObfuscatedName("dr.h")
    public int field1489;

    @ObfuscatedName("dr.s(Lir;II)Ldr;")
    public static class105 method2043(class247 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4231(arg1, arg2);
        return var3 == null ? null : new class105(new class185(var3));
    }

    public class105(class185 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3239();
            if (var3 != 0) {
                arg0.field2514--;
                this.field1488[var2] = new class121();
                this.field1488[var2].method2386(arg0);
            }
        }
        this.field1487 = arg0.method3241();
        this.field1489 = arg0.method3241();
    }

    @ObfuscatedName("dr.g()Ldz;")
    public class107 method2040() {
        byte[] var1 = this.method2042();
        return new class107(22050, var1, this.field1487 * 22050 / 1000, this.field1489 * 22050 / 1000);
    }

    @ObfuscatedName("dr.m()I")
    public final int method2048() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1488[var2] != null && this.field1488[var2].field1650 / 20 < var1) {
                var1 = this.field1488[var2].field1650 / 20;
            }
        }
        if (this.field1487 < this.field1489 && this.field1487 / 20 < var1) {
            var1 = this.field1487 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1488[var3] != null) {
                this.field1488[var3].field1650 -= var1 * 20;
            }
        }
        if (this.field1487 < this.field1489) {
            this.field1487 -= var1 * 20;
            this.field1489 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("dr.h()[B")
    public final byte[] method2042() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1488[var2] != null && this.field1488[var2].field1650 + this.field1488[var2].field1649 > var1) {
                var1 = this.field1488[var2].field1650 + this.field1488[var2].field1649;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1488[var5] != null) {
                int var6 = this.field1488[var5].field1649 * 22050 / 1000;
                int var7 = this.field1488[var5].field1650 * 22050 / 1000;
                int[] var8 = this.field1488[var5].method2387(var6, this.field1488[var5].field1649);
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
