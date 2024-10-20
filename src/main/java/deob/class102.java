package deob;

@ObfuscatedName("cg")
public class class102 {

    @ObfuscatedName("cg.t")
    public int field1326;

    @ObfuscatedName("cg.n")
    public class118[] field1328 = new class118[10];

    @ObfuscatedName("cg.q")
    public int field1327;

    @ObfuscatedName("cg.a(Lhq;II)Lcg;")
    public static class102 method2280(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3873(arg1, arg2);
        return var3 == null ? null : new class102(new class300(var3));
    }

    public class102(class300 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5123();
            if (var3 != 0) {
                arg0.field3694--;
                this.field1328[var2] = new class118();
                this.field1328[var2].method2599(arg0);
            }
        }
        this.field1326 = arg0.method5166();
        this.field1327 = arg0.method5166();
    }

    @ObfuscatedName("cg.t()Lca;")
    public class104 method2270() {
        byte[] var1 = this.method2272();
        return new class104(22050, var1, this.field1326 * 22050 / 1000, this.field1327 * 22050 / 1000);
    }

    @ObfuscatedName("cg.n()I")
    public final int method2271() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1328[var2] != null && this.field1328[var2].field1484 / 20 < var1) {
                var1 = this.field1328[var2].field1484 / 20;
            }
        }
        if (this.field1326 < this.field1327 && this.field1326 / 20 < var1) {
            var1 = this.field1326 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1328[var3] != null) {
                this.field1328[var3].field1484 -= var1 * 20;
            }
        }
        if (this.field1326 < this.field1327) {
            this.field1326 -= var1 * 20;
            this.field1327 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cg.q()[B")
    public final byte[] method2272() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1328[var2] != null && this.field1328[var2].field1500 + this.field1328[var2].field1484 > var1) {
                var1 = this.field1328[var2].field1500 + this.field1328[var2].field1484;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1328[var5] != null) {
                int var6 = this.field1328[var5].field1500 * 22050 / 1000;
                int var7 = this.field1328[var5].field1484 * 22050 / 1000;
                int[] var8 = this.field1328[var5].method2597(var6, this.field1328[var5].field1500);
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
