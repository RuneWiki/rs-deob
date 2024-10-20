package deob;

@ObfuscatedName("eu")
public class class132 {

    @ObfuscatedName("eu.i")
    public static int[] field1905 = new int[500];

    @ObfuscatedName("eu.w")
    public static int[] field1904 = new int[500];

    @ObfuscatedName("eu.a")
    public static int[] field1897 = new int[500];

    @ObfuscatedName("eu.t")
    public static int[] field1898 = new int[500];

    @ObfuscatedName("eu.s")
    public class139 field1895 = null;

    @ObfuscatedName("eu.r")
    public int field1900 = -1;

    @ObfuscatedName("eu.v")
    public int[] field1901;

    @ObfuscatedName("eu.y")
    public int[] field1902;

    @ObfuscatedName("eu.j")
    public int[] field1903;

    @ObfuscatedName("eu.k")
    public int[] field1899;

    @ObfuscatedName("eu.e")
    public boolean field1896 = false;

    public class132(byte[] arg0, class139 arg1) {
        this.field1895 = arg1;
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        var3.field2399 = 2;
        int var5 = var3.method3061();
        int var6 = -1;
        int var7 = 0;
        var4.field2399 = var3.field2399 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3061();
            if (var9 > 0) {
                if (this.field1895.field2063[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1895.field2063[var10] == 0) {
                            field1905[var7] = var10;
                            field1904[var7] = 0;
                            field1897[var7] = 0;
                            field1898[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1905[var7] = var8;
                short var11 = 0;
                if (this.field1895.field2063[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1904[var7] = var11;
                } else {
                    field1904[var7] = var4.method2892();
                }
                if ((var9 & 0x2) == 0) {
                    field1897[var7] = var11;
                } else {
                    field1897[var7] = var4.method2892();
                }
                if ((var9 & 0x4) == 0) {
                    field1898[var7] = var11;
                } else {
                    field1898[var7] = var4.method2892();
                }
                var6 = var8;
                var7++;
                if (this.field1895.field2063[var8] == 5) {
                    this.field1896 = true;
                }
            }
        }
        if (var4.field2399 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1900 = var7;
        this.field1901 = new int[var7];
        this.field1902 = new int[var7];
        this.field1903 = new int[var7];
        this.field1899 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1901[var12] = field1905[var12];
            this.field1902[var12] = field1904[var12];
            this.field1903[var12] = field1897[var12];
            this.field1899[var12] = field1898[var12];
        }
    }
}
