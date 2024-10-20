package deob;

@ObfuscatedName("dq")
public class class111 {

    @ObfuscatedName("dq.v")
    public class127[] field1368 = new class127[10];

    @ObfuscatedName("dq.x")
    public int field1369;

    @ObfuscatedName("dq.w")
    public int field1367;

    @ObfuscatedName("dq.h(Lib;II)Ldq;")
    public static class111 method2243(class245 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3834(arg1, arg2);
        return var3 == null ? null : new class111(new class311(var3));
    }

    public class111(class311 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5274();
            if (var3 != 0) {
                arg0.field3752--;
                this.field1368[var2] = new class127();
                this.field1368[var2].method2580(arg0);
            }
        }
        this.field1369 = arg0.method5342();
        this.field1367 = arg0.method5342();
    }

    @ObfuscatedName("dq.v()Ldf;")
    public class113 method2245() {
        byte[] var1 = this.method2241();
        return new class113(22050, var1, this.field1369 * 22050 / 1000, this.field1367 * 22050 / 1000);
    }

    @ObfuscatedName("dq.x()I")
    public final int method2240() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1368[var2] != null && this.field1368[var2].field1526 / 20 < var1) {
                var1 = this.field1368[var2].field1526 / 20;
            }
        }
        if (this.field1369 < this.field1367 && this.field1369 / 20 < var1) {
            var1 = this.field1369 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1368[var3] != null) {
                this.field1368[var3].field1526 -= var1 * 20;
            }
        }
        if (this.field1369 < this.field1367) {
            this.field1369 -= var1 * 20;
            this.field1367 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("dq.w()[B")
    public final byte[] method2241() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1368[var2] != null && this.field1368[var2].field1530 + this.field1368[var2].field1526 > var1) {
                var1 = this.field1368[var2].field1530 + this.field1368[var2].field1526;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1368[var5] != null) {
                int var6 = this.field1368[var5].field1530 * 22050 / 1000;
                int var7 = this.field1368[var5].field1526 * 22050 / 1000;
                int[] var8 = this.field1368[var5].method2583(var6, this.field1368[var5].field1530);
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
