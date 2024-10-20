package deob;

@ObfuscatedName("dz")
public class class130 {

    @ObfuscatedName("dz.g")
    public static int[] field1794 = new int[500];

    @ObfuscatedName("dz.e")
    public static int[] field1790 = new int[500];

    @ObfuscatedName("dz.b")
    public static int[] field1789 = new int[500];

    @ObfuscatedName("dz.z")
    public static int[] field1791 = new int[500];

    @ObfuscatedName("dz.n")
    public class137 field1788 = null;

    @ObfuscatedName("dz.l")
    public int field1792 = -1;

    @ObfuscatedName("dz.s")
    public int[] field1793;

    @ObfuscatedName("dz.y")
    public int[] field1787;

    @ObfuscatedName("dz.c")
    public int[] field1795;

    @ObfuscatedName("dz.h")
    public int[] field1796;

    @ObfuscatedName("dz.i")
    public boolean field1797 = false;

    public class130(byte[] arg0, class137 arg1) {
        this.field1788 = arg1;
        class195 var3 = new class195(arg0);
        class195 var4 = new class195(arg0);
        var3.field2562 = 2;
        int var5 = var3.method3332();
        int var6 = -1;
        int var7 = 0;
        var4.field2562 = var3.field2562 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3332();
            if (var9 > 0) {
                if (this.field1788.field1953[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1788.field1953[var10] == 0) {
                            field1794[var7] = var10;
                            field1790[var7] = 0;
                            field1789[var7] = 0;
                            field1791[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1794[var7] = var8;
                short var11 = 0;
                if (this.field1788.field1953[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1790[var7] = var11;
                } else {
                    field1790[var7] = var4.method3474();
                }
                if ((var9 & 0x2) == 0) {
                    field1789[var7] = var11;
                } else {
                    field1789[var7] = var4.method3474();
                }
                if ((var9 & 0x4) == 0) {
                    field1791[var7] = var11;
                } else {
                    field1791[var7] = var4.method3474();
                }
                var6 = var8;
                var7++;
                if (this.field1788.field1953[var8] == 5) {
                    this.field1797 = true;
                }
            }
        }
        if (var4.field2562 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1792 = var7;
        this.field1793 = new int[var7];
        this.field1787 = new int[var7];
        this.field1795 = new int[var7];
        this.field1796 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1793[var12] = field1794[var12];
            this.field1787[var12] = field1790[var12];
            this.field1795[var12] = field1789[var12];
            this.field1796[var12] = field1791[var12];
        }
    }
}
