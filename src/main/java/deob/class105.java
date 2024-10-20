package deob;

@ObfuscatedName("dq")
public class class105 {

    @ObfuscatedName("dq.s")
    public class121[] field1482 = new class121[10];

    @ObfuscatedName("dq.r")
    public int field1483;

    @ObfuscatedName("dq.g")
    public int field1481;

    @ObfuscatedName("dq.b(Lij;II)Ldq;")
    public static class105 method1805(class243 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3887(arg1, arg2);
        return var3 == null ? null : new class105(new class181(var3));
    }

    public class105(class181 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2945();
            if (var3 != 0) {
                arg0.field2488--;
                this.field1482[var2] = new class121();
                this.field1482[var2].method2122(arg0);
            }
        }
        this.field1483 = arg0.method3081();
        this.field1481 = arg0.method3081();
    }

    @ObfuscatedName("dq.s()Ldn;")
    public class107 method1791() {
        byte[] var1 = this.method1797();
        return new class107(22050, var1, this.field1483 * 22050 / 1000, this.field1481 * 22050 / 1000);
    }

    @ObfuscatedName("dq.r()I")
    public final int method1792() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1482[var2] != null && this.field1482[var2].field1653 / 20 < var1) {
                var1 = this.field1482[var2].field1653 / 20;
            }
        }
        if (this.field1483 < this.field1481 && this.field1483 / 20 < var1) {
            var1 = this.field1483 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1482[var3] != null) {
                this.field1482[var3].field1653 -= var1 * 20;
            }
        }
        if (this.field1483 < this.field1481) {
            this.field1483 -= var1 * 20;
            this.field1481 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("dq.g()[B")
    public final byte[] method1797() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1482[var2] != null && this.field1482[var2].field1653 + this.field1482[var2].field1652 > var1) {
                var1 = this.field1482[var2].field1653 + this.field1482[var2].field1652;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1482[var5] != null) {
                int var6 = this.field1482[var5].field1652 * 22050 / 1000;
                int var7 = this.field1482[var5].field1653 * 22050 / 1000;
                int[] var8 = this.field1482[var5].method2120(var6, this.field1482[var5].field1652);
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
