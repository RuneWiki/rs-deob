package deob;

@ObfuscatedName("bf")
public class class125 {

    @ObfuscatedName("bf.o")
    public int field1899;

    @ObfuscatedName("bf.t")
    public int field1898;

    @ObfuscatedName("bf.p")
    public class132[] field1901 = new class132[10];

    @ObfuscatedName("bf.p()Lbx;")
    public class112 method2112() {
        byte[] var1 = this.method2115();
        return new class112(22050, var1, this.field1899 * 22050 / 1000, this.field1898 * 22050 / 1000);
    }

    @ObfuscatedName("bf.o()I")
    public final int method2113() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1901[var2] != null && this.field1901[var2].field1986 / 20 < var1) {
                var1 = this.field1901[var2].field1986 / 20;
            }
        }
        if (this.field1899 < this.field1898 && this.field1899 / 20 < var1) {
            var1 = this.field1899 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1901[var3] != null) {
                this.field1901[var3].field1986 -= var1 * 20;
            }
        }
        if (this.field1899 < this.field1898) {
            this.field1899 -= var1 * 20;
            this.field1898 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bf.t()[B")
    public final byte[] method2115() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1901[var2] != null && this.field1901[var2].field1986 + this.field1901[var2].field1985 > var1) {
                var1 = this.field1901[var2].field1986 + this.field1901[var2].field1985;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1901[var5] != null) {
                int var6 = this.field1901[var5].field1985 * 22050 / 1000;
                int var7 = this.field1901[var5].field1986 * 22050 / 1000;
                int[] var8 = this.field1901[var5].method2214(var6, this.field1901[var5].field1985);
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

    @ObfuscatedName("bf.j(Leg;II)Lbf;")
    public static class125 method2123(class81 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1083(arg1, arg2);
        return var3 == null ? null : new class125(new class31(var3));
    }

    public class125(class31 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method512();
            if (var3 != 0) {
                arg0.field172--;
                this.field1901[var2] = new class132();
                this.field1901[var2].method2219(arg0);
            }
        }
        this.field1899 = arg0.method373();
        this.field1898 = arg0.method373();
    }
}
