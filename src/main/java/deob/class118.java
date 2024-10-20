package deob;

@ObfuscatedName("bo")
public class class118 {

    @ObfuscatedName("bo.k")
    public int field1937;

    @ObfuscatedName("bo.h")
    public class109[] field1938 = new class109[10];

    @ObfuscatedName("bo.w")
    public int field1936;

    public class118(class50 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method726();
            if (var3 != 0) {
                arg0.field540--;
                this.field1938[var2] = new class109();
                this.field1938[var2].method1995(arg0);
            }
        }
        this.field1937 = arg0.method720();
        this.field1936 = arg0.method720();
    }

    @ObfuscatedName("bo.h()Lbq;")
    public class120 method2113() {
        byte[] var1 = this.method2115();
        return new class120(22050, var1, this.field1937 * 22050 / 1000, this.field1936 * 22050 / 1000);
    }

    @ObfuscatedName("bo.w()[B")
    public final byte[] method2115() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1938[var2] != null && this.field1938[var2].field1832 + this.field1938[var2].field1831 > var1) {
                var1 = this.field1938[var2].field1832 + this.field1938[var2].field1831;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1938[var5] != null) {
                int var6 = this.field1938[var5].field1831 * 22050 / 1000;
                int var7 = this.field1938[var5].field1832 * 22050 / 1000;
                int[] var8 = this.field1938[var5].method1986(var6, this.field1938[var5].field1831);
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

    @ObfuscatedName("bo.k()I")
    public final int method2118() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1938[var2] != null && this.field1938[var2].field1832 / 20 < var1) {
                var1 = this.field1938[var2].field1832 / 20;
            }
        }
        if (this.field1937 < this.field1936 && this.field1937 / 20 < var1) {
            var1 = this.field1937 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1938[var3] != null) {
                this.field1938[var3].field1832 -= var1 * 20;
            }
        }
        if (this.field1937 < this.field1936) {
            this.field1937 -= var1 * 20;
            this.field1936 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bo.b(Lek;II)Lbo;")
    public static class118 method2123(class89 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1266(arg1, arg2);
        return var3 == null ? null : new class118(new class50(var3));
    }
}
