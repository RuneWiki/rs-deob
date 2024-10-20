package deob;

@ObfuscatedName("cl")
public class class100 {

    @ObfuscatedName("cl.i")
    public class116[] field1314 = new class116[10];

    @ObfuscatedName("cl.y")
    public int field1317;

    @ObfuscatedName("cl.w")
    public int field1315;

    @ObfuscatedName("cl.f(Lhz;II)Lcl;")
    public static class100 method2166(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3752(arg1, arg2);
        return var3 == null ? null : new class100(new class300(var3));
    }

    public class100(class300 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5110();
            if (var3 != 0) {
                arg0.field3703--;
                this.field1314[var2] = new class116();
                this.field1314[var2].method2490(arg0);
            }
        }
        this.field1317 = arg0.method5112();
        this.field1315 = arg0.method5112();
    }

    @ObfuscatedName("cl.i()Lcc;")
    public class102 method2158() {
        byte[] var1 = this.method2160();
        return new class102(22050, var1, this.field1317 * 22050 / 1000, this.field1315 * 22050 / 1000);
    }

    @ObfuscatedName("cl.y()I")
    public final int method2170() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1314[var2] != null && this.field1314[var2].field1477 / 20 < var1) {
                var1 = this.field1314[var2].field1477 / 20;
            }
        }
        if (this.field1317 < this.field1315 && this.field1317 / 20 < var1) {
            var1 = this.field1317 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1314[var3] != null) {
                this.field1314[var3].field1477 -= var1 * 20;
            }
        }
        if (this.field1317 < this.field1315) {
            this.field1317 -= var1 * 20;
            this.field1315 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cl.w()[B")
    public final byte[] method2160() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1314[var2] != null && this.field1314[var2].field1477 + this.field1314[var2].field1476 > var1) {
                var1 = this.field1314[var2].field1477 + this.field1314[var2].field1476;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1314[var5] != null) {
                int var6 = this.field1314[var5].field1476 * 22050 / 1000;
                int var7 = this.field1314[var5].field1477 * 22050 / 1000;
                int[] var8 = this.field1314[var5].method2483(var6, this.field1314[var5].field1476);
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
