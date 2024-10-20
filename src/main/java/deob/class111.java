package deob;

@ObfuscatedName("dj")
public class class111 {

    @ObfuscatedName("dj.m")
    public class127[] field1366 = new class127[10];

    @ObfuscatedName("dj.k")
    public int field1368;

    @ObfuscatedName("dj.d")
    public int field1367;

    @ObfuscatedName("dj.x(Liy;II)Ldj;")
    public static class111 method2261(class244 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3869(arg1, arg2);
        return var3 == null ? null : new class111(new class310(var3));
    }

    public class111(class310 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5137();
            if (var3 != 0) {
                arg0.field3711--;
                this.field1366[var2] = new class127();
                this.field1366[var2].method2581(arg0);
            }
        }
        this.field1368 = arg0.method5139();
        this.field1367 = arg0.method5139();
    }

    @ObfuscatedName("dj.m()Ldm;")
    public class113 method2258() {
        byte[] var1 = this.method2252();
        return new class113(22050, var1, this.field1368 * 22050 / 1000, this.field1367 * 22050 / 1000);
    }

    @ObfuscatedName("dj.k()I")
    public final int method2263() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1366[var2] != null && this.field1366[var2].field1532 / 20 < var1) {
                var1 = this.field1366[var2].field1532 / 20;
            }
        }
        if (this.field1368 < this.field1367 && this.field1368 / 20 < var1) {
            var1 = this.field1368 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1366[var3] != null) {
                this.field1366[var3].field1532 -= var1 * 20;
            }
        }
        if (this.field1368 < this.field1367) {
            this.field1368 -= var1 * 20;
            this.field1367 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("dj.d()[B")
    public final byte[] method2252() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1366[var2] != null && this.field1366[var2].field1532 + this.field1366[var2].field1531 > var1) {
                var1 = this.field1366[var2].field1532 + this.field1366[var2].field1531;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1366[var5] != null) {
                int var6 = this.field1366[var5].field1531 * 22050 / 1000;
                int var7 = this.field1366[var5].field1532 * 22050 / 1000;
                int[] var8 = this.field1366[var5].method2580(var6, this.field1366[var5].field1531);
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
