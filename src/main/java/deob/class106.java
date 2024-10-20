package deob;

@ObfuscatedName("di")
public class class106 {

    @ObfuscatedName("di.o")
    public class122[] field1581 = new class122[10];

    @ObfuscatedName("di.x")
    public int field1580;

    @ObfuscatedName("di.k")
    public int field1582;

    @ObfuscatedName("di.w(Liq;II)Ldi;")
    public static class106 method1749(class239 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3754(arg1, arg2);
        return var3 == null ? null : new class106(new class177(var3));
    }

    public class106(class177 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2931();
            if (var3 != 0) {
                arg0.field2412--;
                this.field1581[var2] = new class122();
                this.field1581[var2].method2077(arg0);
            }
        }
        this.field1580 = arg0.method2886();
        this.field1582 = arg0.method2886();
    }

    @ObfuscatedName("di.o()Ldv;")
    public class108 method1756() {
        byte[] var1 = this.method1750();
        return new class108(22050, var1, this.field1580 * 22050 / 1000, this.field1582 * 22050 / 1000);
    }

    @ObfuscatedName("di.x()I")
    public final int method1748() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1581[var2] != null && this.field1581[var2].field1744 / 20 < var1) {
                var1 = this.field1581[var2].field1744 / 20;
            }
        }
        if (this.field1580 < this.field1582 && this.field1580 / 20 < var1) {
            var1 = this.field1580 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1581[var3] != null) {
                this.field1581[var3].field1744 -= var1 * 20;
            }
        }
        if (this.field1580 < this.field1582) {
            this.field1580 -= var1 * 20;
            this.field1582 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("di.k()[B")
    public final byte[] method1750() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1581[var2] != null && this.field1581[var2].field1744 + this.field1581[var2].field1728 > var1) {
                var1 = this.field1581[var2].field1744 + this.field1581[var2].field1728;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1581[var5] != null) {
                int var6 = this.field1581[var5].field1728 * 22050 / 1000;
                int var7 = this.field1581[var5].field1744 * 22050 / 1000;
                int[] var8 = this.field1581[var5].method2079(var6, this.field1581[var5].field1728);
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
