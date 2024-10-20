package deob;

@ObfuscatedName("di")
public class class108 {

    @ObfuscatedName("di.q")
    public class124[] field1561 = new class124[10];

    @ObfuscatedName("di.x")
    public int field1560;

    @ObfuscatedName("di.y")
    public int field1563;

    @ObfuscatedName("di.d(Lim;II)Ldi;")
    public static class108 method1835(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3750(arg1, arg2);
        return var3 == null ? null : new class108(new class174(var3));
    }

    public class108(class174 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2921();
            if (var3 != 0) {
                arg0.field2364--;
                this.field1561[var2] = new class124();
                this.field1561[var2].method2146(arg0);
            }
        }
        this.field1560 = arg0.method2916();
        this.field1563 = arg0.method2916();
    }

    @ObfuscatedName("di.q()Ldv;")
    public class110 method1833() {
        byte[] var1 = this.method1841();
        return new class110(22050, var1, this.field1560 * 22050 / 1000, this.field1563 * 22050 / 1000);
    }

    @ObfuscatedName("di.x()I")
    public final int method1834() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1561[var2] != null && this.field1561[var2].field1731 / 20 < var1) {
                var1 = this.field1561[var2].field1731 / 20;
            }
        }
        if (this.field1560 < this.field1563 && this.field1560 / 20 < var1) {
            var1 = this.field1560 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1561[var3] != null) {
                this.field1561[var3].field1731 -= var1 * 20;
            }
        }
        if (this.field1560 < this.field1563) {
            this.field1560 -= var1 * 20;
            this.field1563 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("di.y()[B")
    public final byte[] method1841() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1561[var2] != null && this.field1561[var2].field1731 + this.field1561[var2].field1716 > var1) {
                var1 = this.field1561[var2].field1731 + this.field1561[var2].field1716;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1561[var5] != null) {
                int var6 = this.field1561[var5].field1716 * 22050 / 1000;
                int var7 = this.field1561[var5].field1731 * 22050 / 1000;
                int[] var8 = this.field1561[var5].method2150(var6, this.field1561[var5].field1716);
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
