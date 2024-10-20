package deob;

@ObfuscatedName("eu")
public class class131 {

    @ObfuscatedName("eu.n")
    public static int[] field1796 = new int[500];

    @ObfuscatedName("eu.v")
    public static int[] field1793 = new int[500];

    @ObfuscatedName("eu.y")
    public static int[] field1795 = new int[500];

    @ObfuscatedName("eu.r")
    public static int[] field1799 = new int[500];

    @ObfuscatedName("eu.h")
    public class138 field1797 = null;

    @ObfuscatedName("eu.d")
    public int field1798 = -1;

    @ObfuscatedName("eu.s")
    public int[] field1800;

    @ObfuscatedName("eu.b")
    public int[] field1794;

    @ObfuscatedName("eu.e")
    public int[] field1801;

    @ObfuscatedName("eu.f")
    public int[] field1802;

    @ObfuscatedName("eu.z")
    public boolean field1803 = false;

    public class131(byte[] arg0, class138 arg1) {
        this.field1797 = arg1;
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        var3.field2529 = 2;
        int var5 = var3.method3021();
        int var6 = -1;
        int var7 = 0;
        var4.field2529 = var3.field2529 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3021();
            if (var9 > 0) {
                if (this.field1797.field1954[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1797.field1954[var10] == 0) {
                            field1796[var7] = var10;
                            field1793[var7] = 0;
                            field1795[var7] = 0;
                            field1799[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1796[var7] = var8;
                short var11 = 0;
                if (this.field1797.field1954[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1793[var7] = var11;
                } else {
                    field1793[var7] = var4.method3042();
                }
                if ((var9 & 0x2) == 0) {
                    field1795[var7] = var11;
                } else {
                    field1795[var7] = var4.method3042();
                }
                if ((var9 & 0x4) == 0) {
                    field1799[var7] = var11;
                } else {
                    field1799[var7] = var4.method3042();
                }
                var6 = var8;
                var7++;
                if (this.field1797.field1954[var8] == 5) {
                    this.field1803 = true;
                }
            }
        }
        if (var4.field2529 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1798 = var7;
        this.field1800 = new int[var7];
        this.field1794 = new int[var7];
        this.field1801 = new int[var7];
        this.field1802 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1800[var12] = field1796[var12];
            this.field1794[var12] = field1793[var12];
            this.field1801[var12] = field1795[var12];
            this.field1802[var12] = field1799[var12];
        }
    }
}
