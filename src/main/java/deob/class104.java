package deob;

@ObfuscatedName("ck")
public class class104 {

    @ObfuscatedName("ck.t")
    public int field1482;

    @ObfuscatedName("ck.i")
    public class120[] field1483 = new class120[10];

    @ObfuscatedName("ck.a")
    public int field1484;

    @ObfuscatedName("ck.t(Ljc;II)Lck;")
    public static class104 method1994(class262 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4265(arg1, arg2);
        return var3 == null ? null : new class104(new class195(var3));
    }

    public class104(class195 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3236();
            if (var3 != 0) {
                arg0.field2545--;
                this.field1483[var2] = new class120();
                this.field1483[var2].method2279(arg0);
            }
        }
        this.field1482 = arg0.method3238();
        this.field1484 = arg0.method3238();
    }

    @ObfuscatedName("ck.q()Ldp;")
    public class106 method1983() {
        byte[] var1 = this.method1984();
        return new class106(22050, var1, this.field1482 * 22050 / 1000, this.field1484 * 22050 / 1000);
    }

    @ObfuscatedName("ck.i()I")
    public final int method1992() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1483[var2] != null && this.field1483[var2].field1637 / 20 < var1) {
                var1 = this.field1483[var2].field1637 / 20;
            }
        }
        if (this.field1482 < this.field1484 && this.field1482 / 20 < var1) {
            var1 = this.field1482 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1483[var3] != null) {
                this.field1483[var3].field1637 -= var1 * 20;
            }
        }
        if (this.field1482 < this.field1484) {
            this.field1482 -= var1 * 20;
            this.field1484 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ck.a()[B")
    public final byte[] method1984() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1483[var2] != null && this.field1483[var2].field1649 + this.field1483[var2].field1637 > var1) {
                var1 = this.field1483[var2].field1649 + this.field1483[var2].field1637;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1483[var5] != null) {
                int var6 = this.field1483[var5].field1649 * 22050 / 1000;
                int var7 = this.field1483[var5].field1637 * 22050 / 1000;
                int[] var8 = this.field1483[var5].method2282(var6, this.field1483[var5].field1649);
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
