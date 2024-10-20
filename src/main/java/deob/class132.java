package deob;

@ObfuscatedName("ev")
public class class132 {

    @ObfuscatedName("ev.e")
    public static int[] field1890 = new int[500];

    @ObfuscatedName("ev.o")
    public static int[] field1883 = new int[500];

    @ObfuscatedName("ev.m")
    public static int[] field1884 = new int[500];

    @ObfuscatedName("ev.g")
    public static int[] field1882 = new int[500];

    @ObfuscatedName("ev.d")
    public class139 field1886 = null;

    @ObfuscatedName("ev.b")
    public int field1887 = -1;

    @ObfuscatedName("ev.k")
    public int[] field1888;

    @ObfuscatedName("ev.f")
    public int[] field1885;

    @ObfuscatedName("ev.j")
    public int[] field1889;

    @ObfuscatedName("ev.q")
    public int[] field1891;

    @ObfuscatedName("ev.h")
    public boolean field1892 = false;

    public class132(byte[] arg0, class139 arg1) {
        this.field1886 = arg1;
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        var3.field2370 = 2;
        int var5 = var3.method2891();
        int var6 = -1;
        int var7 = 0;
        var4.field2370 = var3.field2370 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2891();
            if (var9 > 0) {
                if (this.field1886.field2052[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1886.field2052[var10] == 0) {
                            field1890[var7] = var10;
                            field1883[var7] = 0;
                            field1884[var7] = 0;
                            field1882[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1890[var7] = var8;
                short var11 = 0;
                if (this.field1886.field2052[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1883[var7] = var11;
                } else {
                    field1883[var7] = var4.method2903();
                }
                if ((var9 & 0x2) == 0) {
                    field1884[var7] = var11;
                } else {
                    field1884[var7] = var4.method2903();
                }
                if ((var9 & 0x4) == 0) {
                    field1882[var7] = var11;
                } else {
                    field1882[var7] = var4.method2903();
                }
                var6 = var8;
                var7++;
                if (this.field1886.field2052[var8] == 5) {
                    this.field1892 = true;
                }
            }
        }
        if (var4.field2370 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1887 = var7;
        this.field1888 = new int[var7];
        this.field1885 = new int[var7];
        this.field1889 = new int[var7];
        this.field1891 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1888[var12] = field1890[var12];
            this.field1885[var12] = field1883[var12];
            this.field1889[var12] = field1884[var12];
            this.field1891[var12] = field1882[var12];
        }
    }
}
