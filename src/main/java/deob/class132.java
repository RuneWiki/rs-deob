package deob;

@ObfuscatedName("eg")
public class class132 {

    @ObfuscatedName("eg.a")
    public static int[] field1888 = new int[500];

    @ObfuscatedName("eg.j")
    public static int[] field1881 = new int[500];

    @ObfuscatedName("eg.n")
    public static int[] field1886 = new int[500];

    @ObfuscatedName("eg.r")
    public static int[] field1883 = new int[500];

    @ObfuscatedName("eg.v")
    public class139 field1884 = null;

    @ObfuscatedName("eg.e")
    public int field1885 = -1;

    @ObfuscatedName("eg.l")
    public int[] field1887;

    @ObfuscatedName("eg.s")
    public int[] field1880;

    @ObfuscatedName("eg.w")
    public int[] field1882;

    @ObfuscatedName("eg.p")
    public int[] field1889;

    @ObfuscatedName("eg.m")
    public boolean field1890 = false;

    public class132(byte[] arg0, class139 arg1) {
        this.field1884 = arg1;
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        var3.field2394 = 2;
        int var5 = var3.method2871();
        int var6 = -1;
        int var7 = 0;
        var4.field2394 = var3.field2394 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2871();
            if (var9 > 0) {
                if (this.field1884.field2049[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1884.field2049[var10] == 0) {
                            field1888[var7] = var10;
                            field1881[var7] = 0;
                            field1886[var7] = 0;
                            field1883[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1888[var7] = var8;
                short var11 = 0;
                if (this.field1884.field2049[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1881[var7] = var11;
                } else {
                    field1881[var7] = var4.method2881();
                }
                if ((var9 & 0x2) == 0) {
                    field1886[var7] = var11;
                } else {
                    field1886[var7] = var4.method2881();
                }
                if ((var9 & 0x4) == 0) {
                    field1883[var7] = var11;
                } else {
                    field1883[var7] = var4.method2881();
                }
                var6 = var8;
                var7++;
                if (this.field1884.field2049[var8] == 5) {
                    this.field1890 = true;
                }
            }
        }
        if (var4.field2394 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1885 = var7;
        this.field1887 = new int[var7];
        this.field1880 = new int[var7];
        this.field1882 = new int[var7];
        this.field1889 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1887[var12] = field1888[var12];
            this.field1880[var12] = field1881[var12];
            this.field1882[var12] = field1886[var12];
            this.field1889[var12] = field1883[var12];
        }
    }
}
