package deob;

@ObfuscatedName("ca")
public class class102 {

    @ObfuscatedName("ca.j")
    public class118[] field1327 = new class118[10];

    @ObfuscatedName("ca.i")
    public int field1326;

    @ObfuscatedName("ca.k")
    public int field1328;

    @ObfuscatedName("ca.s(Lhz;II)Lca;")
    public static class102 method2146(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3790(arg1, arg2);
        return var3 == null ? null : new class102(new class300(var3));
    }

    public class102(class300 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5179();
            if (var3 != 0) {
                arg0.field3704--;
                this.field1327[var2] = new class118();
                this.field1327[var2].method2478(arg0);
            }
        }
        this.field1326 = arg0.method5054();
        this.field1328 = arg0.method5054();
    }

    @ObfuscatedName("ca.j()Lco;")
    public class104 method2137() {
        byte[] var1 = this.method2139();
        return new class104(22050, var1, this.field1326 * 22050 / 1000, this.field1328 * 22050 / 1000);
    }

    @ObfuscatedName("ca.i()I")
    public final int method2147() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1327[var2] != null && this.field1327[var2].field1502 / 20 < var1) {
                var1 = this.field1327[var2].field1502 / 20;
            }
        }
        if (this.field1326 < this.field1328 && this.field1326 / 20 < var1) {
            var1 = this.field1326 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1327[var3] != null) {
                this.field1327[var3].field1502 -= var1 * 20;
            }
        }
        if (this.field1326 < this.field1328) {
            this.field1326 -= var1 * 20;
            this.field1328 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ca.k()[B")
    public final byte[] method2139() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1327[var2] != null && this.field1327[var2].field1510 + this.field1327[var2].field1502 > var1) {
                var1 = this.field1327[var2].field1510 + this.field1327[var2].field1502;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1327[var5] != null) {
                int var6 = this.field1327[var5].field1510 * 22050 / 1000;
                int var7 = this.field1327[var5].field1502 * 22050 / 1000;
                int[] var8 = this.field1327[var5].method2479(var6, this.field1327[var5].field1510);
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
