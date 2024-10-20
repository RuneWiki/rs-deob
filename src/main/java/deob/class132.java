package deob;

@ObfuscatedName("ed")
public class class132 {

    @ObfuscatedName("ed.c")
    public static int[] field1850 = new int[500];

    @ObfuscatedName("ed.o")
    public static int[] field1844 = new int[500];

    @ObfuscatedName("ed.i")
    public static int[] field1853 = new int[500];

    @ObfuscatedName("ed.u")
    public static int[] field1845 = new int[500];

    @ObfuscatedName("ed.g")
    public class139 field1847 = null;

    @ObfuscatedName("ed.m")
    public int field1848 = -1;

    @ObfuscatedName("ed.s")
    public int[] field1843;

    @ObfuscatedName("ed.x")
    public int[] field1849;

    @ObfuscatedName("ed.p")
    public int[] field1851;

    @ObfuscatedName("ed.k")
    public int[] field1852;

    @ObfuscatedName("ed.r")
    public boolean field1846 = false;

    public class132(byte[] arg0, class139 arg1) {
        this.field1847 = arg1;
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        var3.field2357 = 2;
        int var5 = var3.method2843();
        int var6 = -1;
        int var7 = 0;
        var4.field2357 = var3.field2357 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2843();
            if (var9 > 0) {
                if (this.field1847.field2010[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1847.field2010[var10] == 0) {
                            field1850[var7] = var10;
                            field1844[var7] = 0;
                            field1853[var7] = 0;
                            field1845[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1850[var7] = var8;
                short var11 = 0;
                if (this.field1847.field2010[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1844[var7] = var11;
                } else {
                    field1844[var7] = var4.method2871();
                }
                if ((var9 & 0x2) == 0) {
                    field1853[var7] = var11;
                } else {
                    field1853[var7] = var4.method2871();
                }
                if ((var9 & 0x4) == 0) {
                    field1845[var7] = var11;
                } else {
                    field1845[var7] = var4.method2871();
                }
                var6 = var8;
                var7++;
                if (this.field1847.field2010[var8] == 5) {
                    this.field1846 = true;
                }
            }
        }
        if (var4.field2357 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1848 = var7;
        this.field1843 = new int[var7];
        this.field1849 = new int[var7];
        this.field1851 = new int[var7];
        this.field1852 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1843[var12] = field1850[var12];
            this.field1849[var12] = field1844[var12];
            this.field1851[var12] = field1853[var12];
            this.field1852[var12] = field1845[var12];
        }
    }
}
