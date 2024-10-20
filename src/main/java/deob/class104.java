package deob;

@ObfuscatedName("cv")
public class class104 {

    @ObfuscatedName("cv.z")
    public class120[] field1495 = new class120[10];

    @ObfuscatedName("cv.n")
    public int field1496;

    @ObfuscatedName("cv.r")
    public int field1497;

    @ObfuscatedName("cv.d(Ljk;II)Lcv;")
    public static class104 method2011(class262 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4273(arg1, arg2);
        return var3 == null ? null : new class104(new class195(var3));
    }

    public class104(class195 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3330();
            if (var3 != 0) {
                arg0.field2568--;
                this.field1495[var2] = new class120();
                this.field1495[var2].method2338(arg0);
            }
        }
        this.field1496 = arg0.method3269();
        this.field1497 = arg0.method3269();
    }

    @ObfuscatedName("cv.z()Ldd;")
    public class106 method2001() {
        byte[] var1 = this.method2003();
        return new class106(22050, var1, this.field1496 * 22050 / 1000, this.field1497 * 22050 / 1000);
    }

    @ObfuscatedName("cv.n()I")
    public final int method2012() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1495[var2] != null && this.field1495[var2].field1662 / 20 < var1) {
                var1 = this.field1495[var2].field1662 / 20;
            }
        }
        if (this.field1496 < this.field1497 && this.field1496 / 20 < var1) {
            var1 = this.field1496 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1495[var3] != null) {
                this.field1495[var3].field1662 -= var1 * 20;
            }
        }
        if (this.field1496 < this.field1497) {
            this.field1496 -= var1 * 20;
            this.field1497 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cv.r()[B")
    public final byte[] method2003() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1495[var2] != null && this.field1495[var2].field1662 + this.field1495[var2].field1655 > var1) {
                var1 = this.field1495[var2].field1662 + this.field1495[var2].field1655;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1495[var5] != null) {
                int var6 = this.field1495[var5].field1655 * 22050 / 1000;
                int var7 = this.field1495[var5].field1662 * 22050 / 1000;
                int[] var8 = this.field1495[var5].method2336(var6, this.field1495[var5].field1655);
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
