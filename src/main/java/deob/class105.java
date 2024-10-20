package deob;

@ObfuscatedName("dj")
public class class105 {

    @ObfuscatedName("dj.j")
    public class121[] field1578 = new class121[10];

    @ObfuscatedName("dj.a")
    public int field1580;

    @ObfuscatedName("dj.r")
    public int field1581;

    @ObfuscatedName("dj.i(Lii;II)Ldj;")
    public static class105 method1794(class237 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3824(arg1, arg2);
        return var3 == null ? null : new class105(new class175(var3));
    }

    public class105(class175 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2999();
            if (var3 != 0) {
                arg0.field2395--;
                this.field1578[var2] = new class121();
                this.field1578[var2].method2120(arg0);
            }
        }
        this.field1580 = arg0.method2995();
        this.field1581 = arg0.method2995();
    }

    @ObfuscatedName("dj.j()Ldp;")
    public class107 method1787() {
        byte[] var1 = this.method1786();
        return new class107(22050, var1, this.field1580 * 22050 / 1000, this.field1581 * 22050 / 1000);
    }

    @ObfuscatedName("dj.a()I")
    public final int method1788() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1578[var2] != null && this.field1578[var2].field1757 / 20 < var1) {
                var1 = this.field1578[var2].field1757 / 20;
            }
        }
        if (this.field1580 < this.field1581 && this.field1580 / 20 < var1) {
            var1 = this.field1580 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1578[var3] != null) {
                this.field1578[var3].field1757 -= var1 * 20;
            }
        }
        if (this.field1580 < this.field1581) {
            this.field1580 -= var1 * 20;
            this.field1581 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("dj.r()[B")
    public final byte[] method1786() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1578[var2] != null && this.field1578[var2].field1757 + this.field1578[var2].field1746 > var1) {
                var1 = this.field1578[var2].field1757 + this.field1578[var2].field1746;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1578[var5] != null) {
                int var6 = this.field1578[var5].field1746 * 22050 / 1000;
                int var7 = this.field1578[var5].field1757 * 22050 / 1000;
                int[] var8 = this.field1578[var5].method2122(var6, this.field1578[var5].field1746);
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
