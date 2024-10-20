package deob;

@ObfuscatedName("cc")
public class class102 {

    @ObfuscatedName("cc.w")
    public class118[] field1352 = new class118[10];

    @ObfuscatedName("cc.e")
    public int field1354;

    @ObfuscatedName("cc.p")
    public int field1355;

    @ObfuscatedName("cc.q(Lhp;II)Lcc;")
    public static class102 method2135(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3775(arg1, arg2);
        return var3 == null ? null : new class102(new class301(var3));
    }

    public class102(class301 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5077();
            if (var3 != 0) {
                arg0.field3733--;
                this.field1352[var2] = new class118();
                this.field1352[var2].method2461(arg0);
            }
        }
        this.field1354 = arg0.method5069();
        this.field1355 = arg0.method5069();
    }

    @ObfuscatedName("cc.w()Lcd;")
    public class104 method2131() {
        byte[] var1 = this.method2133();
        return new class104(22050, var1, this.field1354 * 22050 / 1000, this.field1355 * 22050 / 1000);
    }

    @ObfuscatedName("cc.e()I")
    public final int method2132() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1352[var2] != null && this.field1352[var2].field1515 / 20 < var1) {
                var1 = this.field1352[var2].field1515 / 20;
            }
        }
        if (this.field1354 < this.field1355 && this.field1354 / 20 < var1) {
            var1 = this.field1354 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1352[var3] != null) {
                this.field1352[var3].field1515 -= var1 * 20;
            }
        }
        if (this.field1354 < this.field1355) {
            this.field1354 -= var1 * 20;
            this.field1355 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cc.p()[B")
    public final byte[] method2133() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1352[var2] != null && this.field1352[var2].field1519 + this.field1352[var2].field1515 > var1) {
                var1 = this.field1352[var2].field1519 + this.field1352[var2].field1515;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1352[var5] != null) {
                int var6 = this.field1352[var5].field1519 * 22050 / 1000;
                int var7 = this.field1352[var5].field1515 * 22050 / 1000;
                int[] var8 = this.field1352[var5].method2459(var6, this.field1352[var5].field1519);
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
