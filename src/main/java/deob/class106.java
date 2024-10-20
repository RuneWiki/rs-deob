package deob;

@ObfuscatedName("dl")
public class class106 {

    @ObfuscatedName("dl.j")
    public class122[] field1567 = new class122[10];

    @ObfuscatedName("dl.n")
    public int field1566;

    @ObfuscatedName("dl.r")
    public int field1569;

    @ObfuscatedName("dl.a(Lif;II)Ldl;")
    public static class106 method1751(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3787(arg1, arg2);
        return var3 == null ? null : new class106(new class174(var3));
    }

    public class106(class174 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2871();
            if (var3 != 0) {
                arg0.field2394--;
                this.field1567[var2] = new class122();
                this.field1567[var2].method2098(arg0);
            }
        }
        this.field1566 = arg0.method2873();
        this.field1569 = arg0.method2873();
    }

    @ObfuscatedName("dl.j()Ldm;")
    public class108 method1744() {
        byte[] var1 = this.method1743();
        return new class108(22050, var1, this.field1566 * 22050 / 1000, this.field1569 * 22050 / 1000);
    }

    @ObfuscatedName("dl.n()I")
    public final int method1745() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1567[var2] != null && this.field1567[var2].field1723 / 20 < var1) {
                var1 = this.field1567[var2].field1723 / 20;
            }
        }
        if (this.field1566 < this.field1569 && this.field1566 / 20 < var1) {
            var1 = this.field1566 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1567[var3] != null) {
                this.field1567[var3].field1723 -= var1 * 20;
            }
        }
        if (this.field1566 < this.field1569) {
            this.field1566 -= var1 * 20;
            this.field1569 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("dl.r()[B")
    public final byte[] method1743() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1567[var2] != null && this.field1567[var2].field1728 + this.field1567[var2].field1723 > var1) {
                var1 = this.field1567[var2].field1728 + this.field1567[var2].field1723;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1567[var5] != null) {
                int var6 = this.field1567[var5].field1728 * 22050 / 1000;
                int var7 = this.field1567[var5].field1723 * 22050 / 1000;
                int[] var8 = this.field1567[var5].method2096(var6, this.field1567[var5].field1728);
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
