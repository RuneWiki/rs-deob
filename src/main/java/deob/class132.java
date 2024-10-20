package deob;

@ObfuscatedName("ei")
public class class132 {

    @ObfuscatedName("ei.d")
    public static int[] field1859 = new int[500];

    @ObfuscatedName("ei.q")
    public static int[] field1858 = new int[500];

    @ObfuscatedName("ei.x")
    public static int[] field1860 = new int[500];

    @ObfuscatedName("ei.y")
    public static int[] field1862 = new int[500];

    @ObfuscatedName("ei.e")
    public class139 field1861 = null;

    @ObfuscatedName("ei.f")
    public int field1867 = -1;

    @ObfuscatedName("ei.v")
    public int[] field1863;

    @ObfuscatedName("ei.t")
    public int[] field1864;

    @ObfuscatedName("ei.i")
    public int[] field1865;

    @ObfuscatedName("ei.r")
    public int[] field1866;

    @ObfuscatedName("ei.g")
    public boolean field1857 = false;

    public class132(byte[] arg0, class139 arg1) {
        this.field1861 = arg1;
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        var3.field2364 = 2;
        int var5 = var3.method2921();
        int var6 = -1;
        int var7 = 0;
        var4.field2364 = var3.field2364 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2921();
            if (var9 > 0) {
                if (this.field1861.field2016[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1861.field2016[var10] == 0) {
                            field1859[var7] = var10;
                            field1858[var7] = 0;
                            field1860[var7] = 0;
                            field1862[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1859[var7] = var8;
                short var11 = 0;
                if (this.field1861.field2016[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1858[var7] = var11;
                } else {
                    field1858[var7] = var4.method2926();
                }
                if ((var9 & 0x2) == 0) {
                    field1860[var7] = var11;
                } else {
                    field1860[var7] = var4.method2926();
                }
                if ((var9 & 0x4) == 0) {
                    field1862[var7] = var11;
                } else {
                    field1862[var7] = var4.method2926();
                }
                var6 = var8;
                var7++;
                if (this.field1861.field2016[var8] == 5) {
                    this.field1857 = true;
                }
            }
        }
        if (var4.field2364 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1867 = var7;
        this.field1863 = new int[var7];
        this.field1864 = new int[var7];
        this.field1865 = new int[var7];
        this.field1866 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1863[var12] = field1859[var12];
            this.field1864[var12] = field1858[var12];
            this.field1865[var12] = field1860[var12];
            this.field1866[var12] = field1862[var12];
        }
    }
}
