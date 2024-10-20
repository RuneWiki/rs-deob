package deob;

@ObfuscatedName("dh")
public class class105 {

    @ObfuscatedName("dh.p")
    public class121[] field1492 = new class121[10];

    @ObfuscatedName("dh.i")
    public int field1491;

    @ObfuscatedName("dh.j")
    public int field1493;

    @ObfuscatedName("dh.m(Lik;II)Ldh;")
    public static class105 method1859(class243 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3930(arg1, arg2);
        return var3 == null ? null : new class105(new class181(var3));
    }

    public class105(class181 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3012();
            if (var3 != 0) {
                arg0.field2498--;
                this.field1492[var2] = new class121();
                this.field1492[var2].method2202(arg0);
            }
        }
        this.field1491 = arg0.method3009();
        this.field1493 = arg0.method3009();
    }

    @ObfuscatedName("dh.p()Lde;")
    public class107 method1866() {
        byte[] var1 = this.method1874();
        return new class107(22050, var1, this.field1491 * 22050 / 1000, this.field1493 * 22050 / 1000);
    }

    @ObfuscatedName("dh.i()I")
    public final int method1860() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1492[var2] != null && this.field1492[var2].field1658 / 20 < var1) {
                var1 = this.field1492[var2].field1658 / 20;
            }
        }
        if (this.field1491 < this.field1493 && this.field1491 / 20 < var1) {
            var1 = this.field1491 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1492[var3] != null) {
                this.field1492[var3].field1658 -= var1 * 20;
            }
        }
        if (this.field1491 < this.field1493) {
            this.field1491 -= var1 * 20;
            this.field1493 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("dh.j()[B")
    public final byte[] method1874() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1492[var2] != null && this.field1492[var2].field1663 + this.field1492[var2].field1658 > var1) {
                var1 = this.field1492[var2].field1663 + this.field1492[var2].field1658;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1492[var5] != null) {
                int var6 = this.field1492[var5].field1663 * 22050 / 1000;
                int var7 = this.field1492[var5].field1658 * 22050 / 1000;
                int[] var8 = this.field1492[var5].method2199(var6, this.field1492[var5].field1663);
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
