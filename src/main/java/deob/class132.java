package deob;

@ObfuscatedName("ee")
public class class132 {

    @ObfuscatedName("ee.i")
    public static int[] field1882 = new int[500];

    @ObfuscatedName("ee.h")
    public static int[] field1876 = new int[500];

    @ObfuscatedName("ee.u")
    public static int[] field1877 = new int[500];

    @ObfuscatedName("ee.q")
    public static int[] field1878 = new int[500];

    @ObfuscatedName("ee.g")
    public class139 field1879 = null;

    @ObfuscatedName("ee.v")
    public int field1880 = -1;

    @ObfuscatedName("ee.t")
    public int[] field1881;

    @ObfuscatedName("ee.p")
    public int[] field1885;

    @ObfuscatedName("ee.l")
    public int[] field1884;

    @ObfuscatedName("ee.a")
    public int[] field1875;

    @ObfuscatedName("ee.k")
    public boolean field1883 = false;

    public class132(byte[] arg0, class139 arg1) {
        this.field1879 = arg1;
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        var3.field2384 = 2;
        int var5 = var3.method2930();
        int var6 = -1;
        int var7 = 0;
        var4.field2384 = var3.field2384 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2930();
            if (var9 > 0) {
                if (this.field1879.field2036[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1879.field2036[var10] == 0) {
                            field1882[var7] = var10;
                            field1876[var7] = 0;
                            field1877[var7] = 0;
                            field1878[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1882[var7] = var8;
                short var11 = 0;
                if (this.field1879.field2036[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1876[var7] = var11;
                } else {
                    field1876[var7] = var4.method2942();
                }
                if ((var9 & 0x2) == 0) {
                    field1877[var7] = var11;
                } else {
                    field1877[var7] = var4.method2942();
                }
                if ((var9 & 0x4) == 0) {
                    field1878[var7] = var11;
                } else {
                    field1878[var7] = var4.method2942();
                }
                var6 = var8;
                var7++;
                if (this.field1879.field2036[var8] == 5) {
                    this.field1883 = true;
                }
            }
        }
        if (var4.field2384 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1880 = var7;
        this.field1881 = new int[var7];
        this.field1885 = new int[var7];
        this.field1884 = new int[var7];
        this.field1875 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1881[var12] = field1882[var12];
            this.field1885[var12] = field1876[var12];
            this.field1884[var12] = field1877[var12];
            this.field1875[var12] = field1878[var12];
        }
    }
}
