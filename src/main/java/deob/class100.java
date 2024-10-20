package deob;

@ObfuscatedName("ci")
public class class100 {

    @ObfuscatedName("ci.f")
    public class116[] field1310 = new class116[10];

    @ObfuscatedName("ci.q")
    public int field1311;

    @ObfuscatedName("ci.w")
    public int field1309;

    @ObfuscatedName("ci.m(Lir;II)Lci;")
    public static class100 method2133(class245 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4156(arg1, arg2);
        return var3 == null ? null : new class100(new class202(var3));
    }

    public class100(class202 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3551();
            if (var3 != 0) {
                arg0.field2439--;
                this.field1310[var2] = new class116();
                this.field1310[var2].method2430(arg0);
            }
        }
        this.field1311 = arg0.method3530();
        this.field1309 = arg0.method3530();
    }

    @ObfuscatedName("ci.f()Lcx;")
    public class102 method2128() {
        byte[] var1 = this.method2131();
        return new class102(22050, var1, this.field1311 * 22050 / 1000, this.field1309 * 22050 / 1000);
    }

    @ObfuscatedName("ci.q()I")
    public final int method2130() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1310[var2] != null && this.field1310[var2].field1473 / 20 < var1) {
                var1 = this.field1310[var2].field1473 / 20;
            }
        }
        if (this.field1311 < this.field1309 && this.field1311 / 20 < var1) {
            var1 = this.field1311 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1310[var3] != null) {
                this.field1310[var3].field1473 -= var1 * 20;
            }
        }
        if (this.field1311 < this.field1309) {
            this.field1311 -= var1 * 20;
            this.field1309 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ci.w()[B")
    public final byte[] method2131() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1310[var2] != null && this.field1310[var2].field1473 + this.field1310[var2].field1472 > var1) {
                var1 = this.field1310[var2].field1473 + this.field1310[var2].field1472;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1310[var5] != null) {
                int var6 = this.field1310[var5].field1472 * 22050 / 1000;
                int var7 = this.field1310[var5].field1473 * 22050 / 1000;
                int[] var8 = this.field1310[var5].method2436(var6, this.field1310[var5].field1472);
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
