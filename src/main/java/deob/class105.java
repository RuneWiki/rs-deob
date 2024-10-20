package deob;

@ObfuscatedName("dq")
public class class105 {

    @ObfuscatedName("dq.v")
    public class121[] field1484 = new class121[10];

    @ObfuscatedName("dq.y")
    public int field1485;

    @ObfuscatedName("dq.r")
    public int field1487;

    @ObfuscatedName("dq.n(Lil;II)Ldq;")
    public static class105 method1831(class247 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3931(arg1, arg2);
        return var3 == null ? null : new class105(new class185(var3));
    }

    public class105(class185 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3021();
            if (var3 != 0) {
                arg0.field2529--;
                this.field1484[var2] = new class121();
                this.field1484[var2].method2158(arg0);
            }
        }
        this.field1485 = arg0.method3015();
        this.field1487 = arg0.method3015();
    }

    @ObfuscatedName("dq.v()Ldp;")
    public class107 method1830() {
        byte[] var1 = this.method1832();
        return new class107(22050, var1, this.field1485 * 22050 / 1000, this.field1487 * 22050 / 1000);
    }

    @ObfuscatedName("dq.y()I")
    public final int method1843() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1484[var2] != null && this.field1484[var2].field1645 / 20 < var1) {
                var1 = this.field1484[var2].field1645 / 20;
            }
        }
        if (this.field1485 < this.field1487 && this.field1485 / 20 < var1) {
            var1 = this.field1485 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1484[var3] != null) {
                this.field1484[var3].field1645 -= var1 * 20;
            }
        }
        if (this.field1485 < this.field1487) {
            this.field1485 -= var1 * 20;
            this.field1487 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("dq.r()[B")
    public final byte[] method1832() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1484[var2] != null && this.field1484[var2].field1652 + this.field1484[var2].field1645 > var1) {
                var1 = this.field1484[var2].field1652 + this.field1484[var2].field1645;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1484[var5] != null) {
                int var6 = this.field1484[var5].field1652 * 22050 / 1000;
                int var7 = this.field1484[var5].field1645 * 22050 / 1000;
                int[] var8 = this.field1484[var5].method2156(var6, this.field1484[var5].field1652);
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
