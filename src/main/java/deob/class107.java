package deob;

@ObfuscatedName("db")
public class class107 {

    @ObfuscatedName("db.h")
    public class123[] field1578 = new class123[10];

    @ObfuscatedName("db.f")
    public int field1579;

    @ObfuscatedName("db.p")
    public int field1580;

    @ObfuscatedName("db.j(Lia;II)Ldb;")
    public static class107 method1798(class237 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3773(arg1, arg2);
        return var3 == null ? null : new class107(new class175(var3));
    }

    public class107(class175 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2903();
            if (var3 != 0) {
                arg0.field2394--;
                this.field1578[var2] = new class123();
                this.field1578[var2].method2122(arg0);
            }
        }
        this.field1579 = arg0.method3023();
        this.field1580 = arg0.method3023();
    }

    @ObfuscatedName("db.h()Lde;")
    public class109 method1801() {
        byte[] var1 = this.method1795();
        return new class109(22050, var1, this.field1579 * 22050 / 1000, this.field1580 * 22050 / 1000);
    }

    @ObfuscatedName("db.f()I")
    public final int method1796() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1578[var2] != null && this.field1578[var2].field1751 / 20 < var1) {
                var1 = this.field1578[var2].field1751 / 20;
            }
        }
        if (this.field1579 < this.field1580 && this.field1579 / 20 < var1) {
            var1 = this.field1579 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1578[var3] != null) {
                this.field1578[var3].field1751 -= var1 * 20;
            }
        }
        if (this.field1579 < this.field1580) {
            this.field1579 -= var1 * 20;
            this.field1580 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("db.p()[B")
    public final byte[] method1795() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1578[var2] != null && this.field1578[var2].field1751 + this.field1578[var2].field1750 > var1) {
                var1 = this.field1578[var2].field1751 + this.field1578[var2].field1750;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1578[var5] != null) {
                int var6 = this.field1578[var5].field1750 * 22050 / 1000;
                int var7 = this.field1578[var5].field1751 * 22050 / 1000;
                int[] var8 = this.field1578[var5].method2121(var6, this.field1578[var5].field1750);
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
