package deob;

@ObfuscatedName("dr")
public class class111 {

    @ObfuscatedName("dr.o")
    public class127[] field1385 = new class127[10];

    @ObfuscatedName("dr.q")
    public int field1384;

    @ObfuscatedName("dr.j")
    public int field1383;

    @ObfuscatedName("dr.m(Lic;II)Ldr;")
    public static class111 method2253(class244 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3891(arg1, arg2);
        return var3 == null ? null : new class111(new class310(var3));
    }

    public class111(class310 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5227();
            if (var3 != 0) {
                arg0.field3734--;
                this.field1385[var2] = new class127();
                this.field1385[var2].method2580(arg0);
            }
        }
        this.field1384 = arg0.method5283();
        this.field1383 = arg0.method5283();
    }

    @ObfuscatedName("dr.o()Ldp;")
    public class113 method2248() {
        byte[] var1 = this.method2258();
        return new class113(22050, var1, this.field1384 * 22050 / 1000, this.field1383 * 22050 / 1000);
    }

    @ObfuscatedName("dr.q()I")
    public final int method2250() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1385[var2] != null && this.field1385[var2].field1550 / 20 < var1) {
                var1 = this.field1385[var2].field1550 / 20;
            }
        }
        if (this.field1384 < this.field1383 && this.field1384 / 20 < var1) {
            var1 = this.field1384 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1385[var3] != null) {
                this.field1385[var3].field1550 -= var1 * 20;
            }
        }
        if (this.field1384 < this.field1383) {
            this.field1384 -= var1 * 20;
            this.field1383 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("dr.j()[B")
    public final byte[] method2258() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1385[var2] != null && this.field1385[var2].field1550 + this.field1385[var2].field1541 > var1) {
                var1 = this.field1385[var2].field1550 + this.field1385[var2].field1541;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1385[var5] != null) {
                int var6 = this.field1385[var5].field1541 * 22050 / 1000;
                int var7 = this.field1385[var5].field1550 * 22050 / 1000;
                int[] var8 = this.field1385[var5].method2577(var6, this.field1385[var5].field1541);
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
