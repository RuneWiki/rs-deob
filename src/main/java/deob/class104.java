package deob;

@ObfuscatedName("cl")
public class class104 {

    @ObfuscatedName("cl.e")
    public class120[] field1482 = new class120[10];

    @ObfuscatedName("cl.b")
    public int field1481;

    @ObfuscatedName("cl.z")
    public int field1484;

    @ObfuscatedName("cl.g(Ljr;II)Lcl;")
    public static class104 method2094(class262 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4294(arg1, arg2);
        return var3 == null ? null : new class104(new class195(var3));
    }

    public class104(class195 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3332();
            if (var3 != 0) {
                arg0.field2562--;
                this.field1482[var2] = new class120();
                this.field1482[var2].method2391(arg0);
            }
        }
        this.field1481 = arg0.method3310();
        this.field1484 = arg0.method3310();
    }

    @ObfuscatedName("cl.e()Ldt;")
    public class106 method2091() {
        byte[] var1 = this.method2101();
        return new class106(22050, var1, this.field1481 * 22050 / 1000, this.field1484 * 22050 / 1000);
    }

    @ObfuscatedName("cl.b()I")
    public final int method2092() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1482[var2] != null && this.field1482[var2].field1646 / 20 < var1) {
                var1 = this.field1482[var2].field1646 / 20;
            }
        }
        if (this.field1481 < this.field1484 && this.field1481 / 20 < var1) {
            var1 = this.field1481 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1482[var3] != null) {
                this.field1482[var3].field1646 -= var1 * 20;
            }
        }
        if (this.field1481 < this.field1484) {
            this.field1481 -= var1 * 20;
            this.field1484 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cl.z()[B")
    public final byte[] method2101() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1482[var2] != null && this.field1482[var2].field1646 + this.field1482[var2].field1645 > var1) {
                var1 = this.field1482[var2].field1646 + this.field1482[var2].field1645;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1482[var5] != null) {
                int var6 = this.field1482[var5].field1645 * 22050 / 1000;
                int var7 = this.field1482[var5].field1646 * 22050 / 1000;
                int[] var8 = this.field1482[var5].method2390(var6, this.field1482[var5].field1645);
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
