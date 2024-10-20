package deob;

@ObfuscatedName("ex")
public class class131 {

    @ObfuscatedName("ex.i")
    public static int[] field1907 = new int[500];

    @ObfuscatedName("ex.j")
    public static int[] field1903 = new int[500];

    @ObfuscatedName("ex.a")
    public static int[] field1900 = new int[500];

    @ObfuscatedName("ex.r")
    public static int[] field1901 = new int[500];

    @ObfuscatedName("ex.o")
    public class138 field1902 = null;

    @ObfuscatedName("ex.n")
    public int field1908 = -1;

    @ObfuscatedName("ex.q")
    public int[] field1904;

    @ObfuscatedName("ex.b")
    public int[] field1898;

    @ObfuscatedName("ex.k")
    public int[] field1906;

    @ObfuscatedName("ex.s")
    public int[] field1899;

    @ObfuscatedName("ex.d")
    public boolean field1905 = false;

    public class131(byte[] arg0, class138 arg1) {
        this.field1902 = arg1;
        class175 var3 = new class175(arg0);
        class175 var4 = new class175(arg0);
        var3.field2395 = 2;
        int var5 = var3.method2999();
        int var6 = -1;
        int var7 = 0;
        var4.field2395 = var3.field2395 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2999();
            if (var9 > 0) {
                if (this.field1902.field2059[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1902.field2059[var10] == 0) {
                            field1907[var7] = var10;
                            field1903[var7] = 0;
                            field1900[var7] = 0;
                            field1901[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1907[var7] = var8;
                short var11 = 0;
                if (this.field1902.field2059[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1903[var7] = var11;
                } else {
                    field1903[var7] = var4.method3006();
                }
                if ((var9 & 0x2) == 0) {
                    field1900[var7] = var11;
                } else {
                    field1900[var7] = var4.method3006();
                }
                if ((var9 & 0x4) == 0) {
                    field1901[var7] = var11;
                } else {
                    field1901[var7] = var4.method3006();
                }
                var6 = var8;
                var7++;
                if (this.field1902.field2059[var8] == 5) {
                    this.field1905 = true;
                }
            }
        }
        if (var4.field2395 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1908 = var7;
        this.field1904 = new int[var7];
        this.field1898 = new int[var7];
        this.field1906 = new int[var7];
        this.field1899 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1904[var12] = field1907[var12];
            this.field1898[var12] = field1903[var12];
            this.field1906[var12] = field1900[var12];
            this.field1899[var12] = field1901[var12];
        }
    }
}
