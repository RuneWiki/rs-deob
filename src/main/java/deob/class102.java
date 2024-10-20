package deob;

@ObfuscatedName("cm")
public class class102 {

    @ObfuscatedName("cm.n")
    public class118[] field1329 = new class118[10];

    @ObfuscatedName("cm.v")
    public int field1331;

    @ObfuscatedName("cm.u")
    public int field1330;

    @ObfuscatedName("cm.z(Lhp;II)Lcm;")
    public static class102 method2129(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3726(arg1, arg2);
        return var3 == null ? null : new class102(new class300(var3));
    }

    public class102(class300 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method4990();
            if (var3 != 0) {
                arg0.field3702--;
                this.field1329[var2] = new class118();
                this.field1329[var2].method2459(arg0);
            }
        }
        this.field1331 = arg0.method4992();
        this.field1330 = arg0.method4992();
    }

    @ObfuscatedName("cm.n()Lch;")
    public class104 method2123() {
        byte[] var1 = this.method2127();
        return new class104(22050, var1, this.field1331 * 22050 / 1000, this.field1330 * 22050 / 1000);
    }

    @ObfuscatedName("cm.v()I")
    public final int method2132() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1329[var2] != null && this.field1329[var2].field1479 / 20 < var1) {
                var1 = this.field1329[var2].field1479 / 20;
            }
        }
        if (this.field1331 < this.field1330 && this.field1331 / 20 < var1) {
            var1 = this.field1331 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1329[var3] != null) {
                this.field1329[var3].field1479 -= var1 * 20;
            }
        }
        if (this.field1331 < this.field1330) {
            this.field1331 -= var1 * 20;
            this.field1330 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cm.u()[B")
    public final byte[] method2127() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1329[var2] != null && this.field1329[var2].field1485 + this.field1329[var2].field1479 > var1) {
                var1 = this.field1329[var2].field1485 + this.field1329[var2].field1479;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1329[var5] != null) {
                int var6 = this.field1329[var5].field1485 * 22050 / 1000;
                int var7 = this.field1329[var5].field1479 * 22050 / 1000;
                int[] var8 = this.field1329[var5].method2451(var6, this.field1329[var5].field1485);
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
