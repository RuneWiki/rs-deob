package deob;

@ObfuscatedName("cp")
public class class102 {

    @ObfuscatedName("cp.x")
    public class118[] field1318 = new class118[10];

    @ObfuscatedName("cp.t")
    public int field1319;

    @ObfuscatedName("cp.g")
    public int field1320;

    @ObfuscatedName("cp.c(Lhz;II)Lcp;")
    public static class102 method2179(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3825(arg1, arg2);
        return var3 == null ? null : new class102(new class300(var3));
    }

    public class102(class300 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5103();
            if (var3 != 0) {
                arg0.field3696--;
                this.field1318[var2] = new class118();
                this.field1318[var2].method2487(arg0);
            }
        }
        this.field1319 = arg0.method5304();
        this.field1320 = arg0.method5304();
    }

    @ObfuscatedName("cp.x()Lcg;")
    public class104 method2170() {
        byte[] var1 = this.method2171();
        return new class104(22050, var1, this.field1319 * 22050 / 1000, this.field1320 * 22050 / 1000);
    }

    @ObfuscatedName("cp.t()I")
    public final int method2181() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1318[var2] != null && this.field1318[var2].field1484 / 20 < var1) {
                var1 = this.field1318[var2].field1484 / 20;
            }
        }
        if (this.field1319 < this.field1320 && this.field1319 / 20 < var1) {
            var1 = this.field1319 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1318[var3] != null) {
                this.field1318[var3].field1484 -= var1 * 20;
            }
        }
        if (this.field1319 < this.field1320) {
            this.field1319 -= var1 * 20;
            this.field1320 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cp.g()[B")
    public final byte[] method2171() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1318[var2] != null && this.field1318[var2].field1484 + this.field1318[var2].field1479 > var1) {
                var1 = this.field1318[var2].field1484 + this.field1318[var2].field1479;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1318[var5] != null) {
                int var6 = this.field1318[var5].field1479 * 22050 / 1000;
                int var7 = this.field1318[var5].field1484 * 22050 / 1000;
                int[] var8 = this.field1318[var5].method2489(var6, this.field1318[var5].field1479);
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
