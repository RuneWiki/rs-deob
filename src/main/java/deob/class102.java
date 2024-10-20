package deob;

@ObfuscatedName("cz")
public class class102 {

    @ObfuscatedName("cz.f")
    public class118[] field1338 = new class118[10];

    @ObfuscatedName("cz.b")
    public int field1337;

    @ObfuscatedName("cz.g")
    public int field1340;

    @ObfuscatedName("cz.u(Lhf;II)Lcz;")
    public static class102 method2165(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3928(arg1, arg2);
        return var3 == null ? null : new class102(new class300(var3));
    }

    public class102(class300 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5138();
            if (var3 != 0) {
                arg0.field3707--;
                this.field1338[var2] = new class118();
                this.field1338[var2].method2501(arg0);
            }
        }
        this.field1337 = arg0.method5337();
        this.field1340 = arg0.method5337();
    }

    @ObfuscatedName("cz.f()Lcw;")
    public class104 method2163() {
        byte[] var1 = this.method2170();
        return new class104(22050, var1, this.field1337 * 22050 / 1000, this.field1340 * 22050 / 1000);
    }

    @ObfuscatedName("cz.b()I")
    public final int method2164() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1338[var2] != null && this.field1338[var2].field1508 / 20 < var1) {
                var1 = this.field1338[var2].field1508 / 20;
            }
        }
        if (this.field1337 < this.field1340 && this.field1337 / 20 < var1) {
            var1 = this.field1337 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1338[var3] != null) {
                this.field1338[var3].field1508 -= var1 * 20;
            }
        }
        if (this.field1337 < this.field1340) {
            this.field1337 -= var1 * 20;
            this.field1340 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cz.g()[B")
    public final byte[] method2170() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1338[var2] != null && this.field1338[var2].field1508 + this.field1338[var2].field1507 > var1) {
                var1 = this.field1338[var2].field1508 + this.field1338[var2].field1507;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1338[var5] != null) {
                int var6 = this.field1338[var5].field1507 * 22050 / 1000;
                int var7 = this.field1338[var5].field1508 * 22050 / 1000;
                int[] var8 = this.field1338[var5].method2503(var6, this.field1338[var5].field1507);
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
