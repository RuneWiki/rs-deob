package deob;

@ObfuscatedName("dt")
public class class106 {

    @ObfuscatedName("dt.p")
    public class122[] field1576 = new class122[10];

    @ObfuscatedName("dt.i")
    public int field1578;

    @ObfuscatedName("dt.j")
    public int field1577;

    @ObfuscatedName("dt.n(Lis;II)Ldt;")
    public static class106 method1788(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3880(arg1, arg2);
        return var3 == null ? null : new class106(new class174(var3));
    }

    public class106(class174 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2925();
            if (var3 != 0) {
                arg0.field2400--;
                this.field1576[var2] = new class122();
                this.field1576[var2].method2134(arg0);
            }
        }
        this.field1578 = arg0.method3065();
        this.field1577 = arg0.method3065();
    }

    @ObfuscatedName("dt.p()Ldh;")
    public class108 method1786() {
        byte[] var1 = this.method1798();
        return new class108(22050, var1, this.field1578 * 22050 / 1000, this.field1577 * 22050 / 1000);
    }

    @ObfuscatedName("dt.i()I")
    public final int method1787() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1576[var2] != null && this.field1576[var2].field1748 / 20 < var1) {
                var1 = this.field1576[var2].field1748 / 20;
            }
        }
        if (this.field1578 < this.field1577 && this.field1578 / 20 < var1) {
            var1 = this.field1578 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1576[var3] != null) {
                this.field1576[var3].field1748 -= var1 * 20;
            }
        }
        if (this.field1578 < this.field1577) {
            this.field1578 -= var1 * 20;
            this.field1577 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("dt.j()[B")
    public final byte[] method1798() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1576[var2] != null && this.field1576[var2].field1748 + this.field1576[var2].field1747 > var1) {
                var1 = this.field1576[var2].field1748 + this.field1576[var2].field1747;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1576[var5] != null) {
                int var6 = this.field1576[var5].field1747 * 22050 / 1000;
                int var7 = this.field1576[var5].field1748 * 22050 / 1000;
                int[] var8 = this.field1576[var5].method2131(var6, this.field1576[var5].field1747);
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
