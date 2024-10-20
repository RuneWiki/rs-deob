package deob;

@ObfuscatedName("dr")
public class class106 {

    @ObfuscatedName("dr.h")
    public class122[] field1565 = new class122[10];

    @ObfuscatedName("dr.u")
    public int field1564;

    @ObfuscatedName("dr.q")
    public int field1567;

    @ObfuscatedName("dr.i(Liy;II)Ldr;")
    public static class106 method1813(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3836(arg1, arg2);
        return var3 == null ? null : new class106(new class174(var3));
    }

    public class106(class174 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2930();
            if (var3 != 0) {
                arg0.field2384--;
                this.field1565[var2] = new class122();
                this.field1565[var2].method2129(arg0);
            }
        }
        this.field1564 = arg0.method2932();
        this.field1567 = arg0.method2932();
    }

    @ObfuscatedName("dr.h()Ldx;")
    public class108 method1809() {
        byte[] var1 = this.method1807();
        return new class108(22050, var1, this.field1564 * 22050 / 1000, this.field1567 * 22050 / 1000);
    }

    @ObfuscatedName("dr.u()I")
    public final int method1806() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1565[var2] != null && this.field1565[var2].field1728 / 20 < var1) {
                var1 = this.field1565[var2].field1728 / 20;
            }
        }
        if (this.field1564 < this.field1567 && this.field1564 / 20 < var1) {
            var1 = this.field1564 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1565[var3] != null) {
                this.field1565[var3].field1728 -= var1 * 20;
            }
        }
        if (this.field1564 < this.field1567) {
            this.field1564 -= var1 * 20;
            this.field1567 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("dr.q()[B")
    public final byte[] method1807() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1565[var2] != null && this.field1565[var2].field1728 + this.field1565[var2].field1722 > var1) {
                var1 = this.field1565[var2].field1728 + this.field1565[var2].field1722;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1565[var5] != null) {
                int var6 = this.field1565[var5].field1722 * 22050 / 1000;
                int var7 = this.field1565[var5].field1728 * 22050 / 1000;
                int[] var8 = this.field1565[var5].method2128(var6, this.field1565[var5].field1722);
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
