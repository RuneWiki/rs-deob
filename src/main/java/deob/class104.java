package deob;

@ObfuscatedName("cl")
public class class104 {

    @ObfuscatedName("cl.i")
    public class120[] field1499 = new class120[10];

    @ObfuscatedName("cl.o")
    public int field1501;

    @ObfuscatedName("cl.j")
    public int field1498;

    @ObfuscatedName("cl.c(Ljm;II)Lcl;")
    public static class104 method1965(class262 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4190(arg1, arg2);
        return var3 == null ? null : new class104(new class195(var3));
    }

    public class104(class195 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3429();
            if (var3 != 0) {
                arg0.field2566--;
                this.field1499[var2] = new class120();
                this.field1499[var2].method2285(arg0);
            }
        }
        this.field1501 = arg0.method3218();
        this.field1498 = arg0.method3218();
    }

    @ObfuscatedName("cl.i()Lda;")
    public class106 method1959() {
        byte[] var1 = this.method1958();
        return new class106(22050, var1, this.field1501 * 22050 / 1000, this.field1498 * 22050 / 1000);
    }

    @ObfuscatedName("cl.o()I")
    public final int method1960() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1499[var2] != null && this.field1499[var2].field1665 / 20 < var1) {
                var1 = this.field1499[var2].field1665 / 20;
            }
        }
        if (this.field1501 < this.field1498 && this.field1501 / 20 < var1) {
            var1 = this.field1501 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1499[var3] != null) {
                this.field1499[var3].field1665 -= var1 * 20;
            }
        }
        if (this.field1501 < this.field1498) {
            this.field1501 -= var1 * 20;
            this.field1498 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cl.j()[B")
    public final byte[] method1958() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1499[var2] != null && this.field1499[var2].field1665 + this.field1499[var2].field1662 > var1) {
                var1 = this.field1499[var2].field1665 + this.field1499[var2].field1662;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1499[var5] != null) {
                int var6 = this.field1499[var5].field1662 * 22050 / 1000;
                int var7 = this.field1499[var5].field1665 * 22050 / 1000;
                int[] var8 = this.field1499[var5].method2286(var6, this.field1499[var5].field1662);
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
