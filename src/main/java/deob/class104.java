package deob;

@ObfuscatedName("cb")
public class class104 {

    @ObfuscatedName("cb.s")
    public class120[] field1565 = new class120[10];

    @ObfuscatedName("cb.q")
    public int field1564;

    @ObfuscatedName("cb.o")
    public int field1562;

    @ObfuscatedName("cb.w(Lip;II)Lcb;")
    public static class104 method1846(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3876(arg1, arg2);
        return var3 == null ? null : new class104(new class174(var3));
    }

    public class104(class174 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2971();
            if (var3 != 0) {
                arg0.field2390--;
                this.field1565[var2] = new class120();
                this.field1565[var2].method2168(arg0);
            }
        }
        this.field1564 = arg0.method3178();
        this.field1562 = arg0.method3178();
    }

    @ObfuscatedName("cb.s()Ldi;")
    public class106 method1834() {
        byte[] var1 = this.method1836();
        return new class106(22050, var1, this.field1564 * 22050 / 1000, this.field1562 * 22050 / 1000);
    }

    @ObfuscatedName("cb.q()I")
    public final int method1835() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1565[var2] != null && this.field1565[var2].field1728 / 20 < var1) {
                var1 = this.field1565[var2].field1728 / 20;
            }
        }
        if (this.field1564 < this.field1562 && this.field1564 / 20 < var1) {
            var1 = this.field1564 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1565[var3] != null) {
                this.field1565[var3].field1728 -= var1 * 20;
            }
        }
        if (this.field1564 < this.field1562) {
            this.field1564 -= var1 * 20;
            this.field1562 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cb.o()[B")
    public final byte[] method1836() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1565[var2] != null && this.field1565[var2].field1728 + this.field1565[var2].field1727 > var1) {
                var1 = this.field1565[var2].field1728 + this.field1565[var2].field1727;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1565[var5] != null) {
                int var6 = this.field1565[var5].field1727 * 22050 / 1000;
                int var7 = this.field1565[var5].field1728 * 22050 / 1000;
                int[] var8 = this.field1565[var5].method2166(var6, this.field1565[var5].field1727);
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
