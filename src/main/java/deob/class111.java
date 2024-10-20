package deob;

@ObfuscatedName("dq")
public class class111 {

    @ObfuscatedName("dq.b")
    public class127[] field1380 = new class127[10];

    @ObfuscatedName("dq.l")
    public int field1378;

    @ObfuscatedName("dq.m")
    public int field1379;

    @ObfuscatedName("dq.f(Liw;II)Ldq;")
    public static class111 method2285(class245 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3905(arg1, arg2);
        return var3 == null ? null : new class111(new class311(var3));
    }

    public class111(class311 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5276();
            if (var3 != 0) {
                arg0.field3741--;
                this.field1380[var2] = new class127();
                this.field1380[var2].method2610(arg0);
            }
        }
        this.field1378 = arg0.method5163();
        this.field1379 = arg0.method5163();
    }

    @ObfuscatedName("dq.b()Ldo;")
    public class113 method2279() {
        byte[] var1 = this.method2275();
        return new class113(22050, var1, this.field1378 * 22050 / 1000, this.field1379 * 22050 / 1000);
    }

    @ObfuscatedName("dq.l()I")
    public final int method2274() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1380[var2] != null && this.field1380[var2].field1544 / 20 < var1) {
                var1 = this.field1380[var2].field1544 / 20;
            }
        }
        if (this.field1378 < this.field1379 && this.field1378 / 20 < var1) {
            var1 = this.field1378 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1380[var3] != null) {
                this.field1380[var3].field1544 -= var1 * 20;
            }
        }
        if (this.field1378 < this.field1379) {
            this.field1378 -= var1 * 20;
            this.field1379 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("dq.m()[B")
    public final byte[] method2275() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1380[var2] != null && this.field1380[var2].field1544 + this.field1380[var2].field1543 > var1) {
                var1 = this.field1380[var2].field1544 + this.field1380[var2].field1543;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1380[var5] != null) {
                int var6 = this.field1380[var5].field1543 * 22050 / 1000;
                int var7 = this.field1380[var5].field1544 * 22050 / 1000;
                int[] var8 = this.field1380[var5].method2609(var6, this.field1380[var5].field1543);
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
