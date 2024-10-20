package deob;

@ObfuscatedName("cj")
public class class104 {

    @ObfuscatedName("cj.k")
    public class120[] field1510 = new class120[10];

    @ObfuscatedName("cj.t")
    public int field1508;

    @ObfuscatedName("cj.d")
    public int field1507;

    @ObfuscatedName("cj.o(Ljf;II)Lcj;")
    public static class104 method1953(class262 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4241(arg1, arg2);
        return var3 == null ? null : new class104(new class195(var3));
    }

    public class104(class195 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3205();
            if (var3 != 0) {
                arg0.field2575--;
                this.field1510[var2] = new class120();
                this.field1510[var2].method2286(arg0);
            }
        }
        this.field1508 = arg0.method3207();
        this.field1507 = arg0.method3207();
    }

    @ObfuscatedName("cj.k()Ldp;")
    public class106 method1952() {
        byte[] var1 = this.method1947();
        return new class106(22050, var1, this.field1508 * 22050 / 1000, this.field1507 * 22050 / 1000);
    }

    @ObfuscatedName("cj.t()I")
    public final int method1944() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1510[var2] != null && this.field1510[var2].field1676 / 20 < var1) {
                var1 = this.field1510[var2].field1676 / 20;
            }
        }
        if (this.field1508 < this.field1507 && this.field1508 / 20 < var1) {
            var1 = this.field1508 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1510[var3] != null) {
                this.field1510[var3].field1676 -= var1 * 20;
            }
        }
        if (this.field1508 < this.field1507) {
            this.field1508 -= var1 * 20;
            this.field1507 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cj.d()[B")
    public final byte[] method1947() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1510[var2] != null && this.field1510[var2].field1687 + this.field1510[var2].field1676 > var1) {
                var1 = this.field1510[var2].field1687 + this.field1510[var2].field1676;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1510[var5] != null) {
                int var6 = this.field1510[var5].field1687 * 22050 / 1000;
                int var7 = this.field1510[var5].field1676 * 22050 / 1000;
                int[] var8 = this.field1510[var5].method2284(var6, this.field1510[var5].field1687);
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
