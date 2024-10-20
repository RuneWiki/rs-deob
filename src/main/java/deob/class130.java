package deob;

@ObfuscatedName("db")
public class class130 {

    @ObfuscatedName("db.w")
    public static int[] field1883 = new int[500];

    @ObfuscatedName("db.s")
    public static int[] field1877 = new int[500];

    @ObfuscatedName("db.q")
    public static int[] field1878 = new int[500];

    @ObfuscatedName("db.o")
    public static int[] field1880 = new int[500];

    @ObfuscatedName("db.g")
    public class137 field1876 = null;

    @ObfuscatedName("db.v")
    public int field1881 = -1;

    @ObfuscatedName("db.p")
    public int[] field1882;

    @ObfuscatedName("db.e")
    public int[] field1879;

    @ObfuscatedName("db.d")
    public int[] field1884;

    @ObfuscatedName("db.x")
    public int[] field1885;

    @ObfuscatedName("db.z")
    public boolean field1886 = false;

    public class130(byte[] arg0, class137 arg1) {
        this.field1876 = arg1;
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        var3.field2390 = 2;
        int var5 = var3.method2971();
        int var6 = -1;
        int var7 = 0;
        var4.field2390 = var3.field2390 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2971();
            if (var9 > 0) {
                if (this.field1876.field2034[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1876.field2034[var10] == 0) {
                            field1883[var7] = var10;
                            field1877[var7] = 0;
                            field1878[var7] = 0;
                            field1880[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1883[var7] = var8;
                short var11 = 0;
                if (this.field1876.field2034[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1877[var7] = var11;
                } else {
                    field1877[var7] = var4.method3145();
                }
                if ((var9 & 0x2) == 0) {
                    field1878[var7] = var11;
                } else {
                    field1878[var7] = var4.method3145();
                }
                if ((var9 & 0x4) == 0) {
                    field1880[var7] = var11;
                } else {
                    field1880[var7] = var4.method3145();
                }
                var6 = var8;
                var7++;
                if (this.field1876.field2034[var8] == 5) {
                    this.field1886 = true;
                }
            }
        }
        if (var4.field2390 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1881 = var7;
        this.field1882 = new int[var7];
        this.field1879 = new int[var7];
        this.field1884 = new int[var7];
        this.field1885 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1882[var12] = field1883[var12];
            this.field1879[var12] = field1877[var12];
            this.field1884[var12] = field1878[var12];
            this.field1885[var12] = field1880[var12];
        }
    }
}
