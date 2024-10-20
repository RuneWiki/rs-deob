package deob;

@ObfuscatedName("dj")
public class class130 {

    @ObfuscatedName("dj.o")
    public static int[] field1818 = new int[500];

    @ObfuscatedName("dj.k")
    public static int[] field1815 = new int[500];

    @ObfuscatedName("dj.t")
    public static int[] field1823 = new int[500];

    @ObfuscatedName("dj.d")
    public static int[] field1819 = new int[500];

    @ObfuscatedName("dj.h")
    public class137 field1817 = null;

    @ObfuscatedName("dj.m")
    public int field1820 = -1;

    @ObfuscatedName("dj.z")
    public int[] field1821;

    @ObfuscatedName("dj.i")
    public int[] field1822;

    @ObfuscatedName("dj.u")
    public int[] field1824;

    @ObfuscatedName("dj.x")
    public int[] field1816;

    @ObfuscatedName("dj.y")
    public boolean field1825 = false;

    public class130(byte[] arg0, class137 arg1) {
        this.field1817 = arg1;
        class195 var3 = new class195(arg0);
        class195 var4 = new class195(arg0);
        var3.field2575 = 2;
        int var5 = var3.method3205();
        int var6 = -1;
        int var7 = 0;
        var4.field2575 = var3.field2575 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3205();
            if (var9 > 0) {
                if (this.field1817.field1975[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1817.field1975[var10] == 0) {
                            field1818[var7] = var10;
                            field1815[var7] = 0;
                            field1823[var7] = 0;
                            field1819[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1818[var7] = var8;
                short var11 = 0;
                if (this.field1817.field1975[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1815[var7] = var11;
                } else {
                    field1815[var7] = var4.method3218();
                }
                if ((var9 & 0x2) == 0) {
                    field1823[var7] = var11;
                } else {
                    field1823[var7] = var4.method3218();
                }
                if ((var9 & 0x4) == 0) {
                    field1819[var7] = var11;
                } else {
                    field1819[var7] = var4.method3218();
                }
                var6 = var8;
                var7++;
                if (this.field1817.field1975[var8] == 5) {
                    this.field1825 = true;
                }
            }
        }
        if (var4.field2575 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1820 = var7;
        this.field1821 = new int[var7];
        this.field1822 = new int[var7];
        this.field1824 = new int[var7];
        this.field1816 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1821[var12] = field1818[var12];
            this.field1822[var12] = field1815[var12];
            this.field1824[var12] = field1823[var12];
            this.field1816[var12] = field1819[var12];
        }
    }
}
