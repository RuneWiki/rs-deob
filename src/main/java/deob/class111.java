package deob;

@ObfuscatedName("dj")
public class class111 {

    @ObfuscatedName("dj.k")
    public class127[] field1377 = new class127[10];

    @ObfuscatedName("dj.s")
    public int field1379;

    @ObfuscatedName("dj.t")
    public int field1376;

    @ObfuscatedName("dj.z(Lic;II)Ldj;")
    public static class111 method2267(class244 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3873(arg1, arg2);
        return var3 == null ? null : new class111(new class310(var3));
    }

    public class111(class310 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5193();
            if (var3 != 0) {
                arg0.field3734--;
                this.field1377[var2] = new class127();
                this.field1377[var2].method2604(arg0);
            }
        }
        this.field1379 = arg0.method5195();
        this.field1376 = arg0.method5195();
    }

    @ObfuscatedName("dj.k()Lde;")
    public class113 method2253() {
        byte[] var1 = this.method2255();
        return new class113(22050, var1, this.field1379 * 22050 / 1000, this.field1376 * 22050 / 1000);
    }

    @ObfuscatedName("dj.s()I")
    public final int method2254() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1377[var2] != null && this.field1377[var2].field1538 / 20 < var1) {
                var1 = this.field1377[var2].field1538 / 20;
            }
        }
        if (this.field1379 < this.field1376 && this.field1379 / 20 < var1) {
            var1 = this.field1379 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1377[var3] != null) {
                this.field1377[var3].field1538 -= var1 * 20;
            }
        }
        if (this.field1379 < this.field1376) {
            this.field1379 -= var1 * 20;
            this.field1376 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("dj.t()[B")
    public final byte[] method2255() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1377[var2] != null && this.field1377[var2].field1544 + this.field1377[var2].field1538 > var1) {
                var1 = this.field1377[var2].field1544 + this.field1377[var2].field1538;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1377[var5] != null) {
                int var6 = this.field1377[var5].field1544 * 22050 / 1000;
                int var7 = this.field1377[var5].field1538 * 22050 / 1000;
                int[] var8 = this.field1377[var5].method2602(var6, this.field1377[var5].field1544);
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
