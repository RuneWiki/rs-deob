package deob;

@ObfuscatedName("dm")
public class class130 {

    @ObfuscatedName("dm.d")
    public static int[] field1879 = new int[500];

    @ObfuscatedName("dm.k")
    public static int[] field1878 = new int[500];

    @ObfuscatedName("dm.e")
    public static int[] field1884 = new int[500];

    @ObfuscatedName("dm.p")
    public static int[] field1880 = new int[500];

    @ObfuscatedName("dm.q")
    public class137 field1881 = null;

    @ObfuscatedName("dm.s")
    public int field1882 = -1;

    @ObfuscatedName("dm.r")
    public int[] field1883;

    @ObfuscatedName("dm.g")
    public int[] field1885;

    @ObfuscatedName("dm.v")
    public int[] field1877;

    @ObfuscatedName("dm.t")
    public int[] field1887;

    @ObfuscatedName("dm.y")
    public boolean field1886 = false;

    public class130(byte[] arg0, class137 arg1) {
        this.field1881 = arg1;
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        var3.field2405 = 2;
        int var5 = var3.method2955();
        int var6 = -1;
        int var7 = 0;
        var4.field2405 = var3.field2405 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2955();
            if (var9 > 0) {
                if (this.field1881.field2038[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1881.field2038[var10] == 0) {
                            field1879[var7] = var10;
                            field1878[var7] = 0;
                            field1884[var7] = 0;
                            field1880[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1879[var7] = var8;
                short var11 = 0;
                if (this.field1881.field2038[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1878[var7] = var11;
                } else {
                    field1878[var7] = var4.method3085();
                }
                if ((var9 & 0x2) == 0) {
                    field1884[var7] = var11;
                } else {
                    field1884[var7] = var4.method3085();
                }
                if ((var9 & 0x4) == 0) {
                    field1880[var7] = var11;
                } else {
                    field1880[var7] = var4.method3085();
                }
                var6 = var8;
                var7++;
                if (this.field1881.field2038[var8] == 5) {
                    this.field1886 = true;
                }
            }
        }
        if (var4.field2405 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1882 = var7;
        this.field1883 = new int[var7];
        this.field1885 = new int[var7];
        this.field1877 = new int[var7];
        this.field1887 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1883[var12] = field1879[var12];
            this.field1885[var12] = field1878[var12];
            this.field1877[var12] = field1884[var12];
            this.field1887[var12] = field1880[var12];
        }
    }
}
