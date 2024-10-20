package deob;

@ObfuscatedName("dy")
public class class130 {

    @ObfuscatedName("dy.c")
    public static int[] field1814 = new int[500];

    @ObfuscatedName("dy.i")
    public static int[] field1806 = new int[500];

    @ObfuscatedName("dy.o")
    public static int[] field1808 = new int[500];

    @ObfuscatedName("dy.j")
    public static int[] field1809 = new int[500];

    @ObfuscatedName("dy.k")
    public class137 field1815 = null;

    @ObfuscatedName("dy.x")
    public int field1807 = -1;

    @ObfuscatedName("dy.z")
    public int[] field1812;

    @ObfuscatedName("dy.p")
    public int[] field1813;

    @ObfuscatedName("dy.w")
    public int[] field1810;

    @ObfuscatedName("dy.r")
    public int[] field1811;

    @ObfuscatedName("dy.d")
    public boolean field1816 = false;

    public class130(byte[] arg0, class137 arg1) {
        this.field1815 = arg1;
        class195 var3 = new class195(arg0);
        class195 var4 = new class195(arg0);
        var3.field2566 = 2;
        int var5 = var3.method3429();
        int var6 = -1;
        int var7 = 0;
        var4.field2566 = var3.field2566 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3429();
            if (var9 > 0) {
                if (this.field1815.field1976[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1815.field1976[var10] == 0) {
                            field1814[var7] = var10;
                            field1806[var7] = 0;
                            field1808[var7] = 0;
                            field1809[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1814[var7] = var8;
                short var11 = 0;
                if (this.field1815.field1976[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1806[var7] = var11;
                } else {
                    field1806[var7] = var4.method3238();
                }
                if ((var9 & 0x2) == 0) {
                    field1808[var7] = var11;
                } else {
                    field1808[var7] = var4.method3238();
                }
                if ((var9 & 0x4) == 0) {
                    field1809[var7] = var11;
                } else {
                    field1809[var7] = var4.method3238();
                }
                var6 = var8;
                var7++;
                if (this.field1815.field1976[var8] == 5) {
                    this.field1816 = true;
                }
            }
        }
        if (var4.field2566 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1807 = var7;
        this.field1812 = new int[var7];
        this.field1813 = new int[var7];
        this.field1810 = new int[var7];
        this.field1811 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1812[var12] = field1814[var12];
            this.field1813[var12] = field1806[var12];
            this.field1810[var12] = field1808[var12];
            this.field1811[var12] = field1809[var12];
        }
    }
}
