package deob;

@ObfuscatedName("cs")
public class class102 {

    @ObfuscatedName("cs.t")
    public int field1340;

    @ObfuscatedName("cs.o")
    public class118[] field1339 = new class118[10];

    @ObfuscatedName("cs.e")
    public int field1341;

    @ObfuscatedName("cs.c(Lii;II)Lcs;")
    public static class102 method2212(class235 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3845(arg1, arg2);
        return var3 == null ? null : new class102(new class301(var3));
    }

    public class102(class301 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5129();
            if (var3 != 0) {
                arg0.field3707--;
                this.field1339[var2] = new class118();
                this.field1339[var2].method2536(arg0);
            }
        }
        this.field1340 = arg0.method5124();
        this.field1341 = arg0.method5124();
    }

    @ObfuscatedName("cs.t()Lcv;")
    public class104 method2210() {
        byte[] var1 = this.method2211();
        return new class104(22050, var1, this.field1340 * 22050 / 1000, this.field1341 * 22050 / 1000);
    }

    @ObfuscatedName("cs.o()I")
    public final int method2218() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1339[var2] != null && this.field1339[var2].field1502 / 20 < var1) {
                var1 = this.field1339[var2].field1502 / 20;
            }
        }
        if (this.field1340 < this.field1341 && this.field1340 / 20 < var1) {
            var1 = this.field1340 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1339[var3] != null) {
                this.field1339[var3].field1502 -= var1 * 20;
            }
        }
        if (this.field1340 < this.field1341) {
            this.field1340 -= var1 * 20;
            this.field1341 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cs.e()[B")
    public final byte[] method2211() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1339[var2] != null && this.field1339[var2].field1502 + this.field1339[var2].field1501 > var1) {
                var1 = this.field1339[var2].field1502 + this.field1339[var2].field1501;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1339[var5] != null) {
                int var6 = this.field1339[var5].field1501 * 22050 / 1000;
                int var7 = this.field1339[var5].field1502 * 22050 / 1000;
                int[] var8 = this.field1339[var5].method2539(var6, this.field1339[var5].field1501);
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
