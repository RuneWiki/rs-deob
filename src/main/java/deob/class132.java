package deob;

@ObfuscatedName("en")
public class class132 {

    @ObfuscatedName("en.i")
    public static int[] field1904 = new int[500];

    @ObfuscatedName("en.c")
    public static int[] field1905 = new int[500];

    @ObfuscatedName("en.e")
    public static int[] field1906 = new int[500];

    @ObfuscatedName("en.v")
    public static int[] field1914 = new int[500];

    @ObfuscatedName("en.b")
    public class139 field1908 = null;

    @ObfuscatedName("en.y")
    public int field1907 = -1;

    @ObfuscatedName("en.h")
    public int[] field1910;

    @ObfuscatedName("en.x")
    public int[] field1911;

    @ObfuscatedName("en.f")
    public int[] field1912;

    @ObfuscatedName("en.n")
    public int[] field1913;

    @ObfuscatedName("en.a")
    public boolean field1909 = false;

    public class132(byte[] arg0, class139 arg1) {
        this.field1908 = arg1;
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        var3.field2407 = 2;
        int var5 = var3.method2870();
        int var6 = -1;
        int var7 = 0;
        var4.field2407 = var3.field2407 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2870();
            if (var9 > 0) {
                if (this.field1908.field2070[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1908.field2070[var10] == 0) {
                            field1904[var7] = var10;
                            field1905[var7] = 0;
                            field1906[var7] = 0;
                            field1914[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1904[var7] = var8;
                short var11 = 0;
                if (this.field1908.field2070[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1905[var7] = var11;
                } else {
                    field1905[var7] = var4.method3011();
                }
                if ((var9 & 0x2) == 0) {
                    field1906[var7] = var11;
                } else {
                    field1906[var7] = var4.method3011();
                }
                if ((var9 & 0x4) == 0) {
                    field1914[var7] = var11;
                } else {
                    field1914[var7] = var4.method3011();
                }
                var6 = var8;
                var7++;
                if (this.field1908.field2070[var8] == 5) {
                    this.field1909 = true;
                }
            }
        }
        if (var4.field2407 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1907 = var7;
        this.field1910 = new int[var7];
        this.field1911 = new int[var7];
        this.field1912 = new int[var7];
        this.field1913 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1910[var12] = field1904[var12];
            this.field1911[var12] = field1905[var12];
            this.field1912[var12] = field1906[var12];
            this.field1913[var12] = field1914[var12];
        }
    }
}
