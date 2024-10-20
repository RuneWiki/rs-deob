package deob;

@ObfuscatedName("ep")
public class class131 {

    @ObfuscatedName("ep.d")
    public static int[] field1797 = new int[500];

    @ObfuscatedName("ep.x")
    public static int[] field1796 = new int[500];

    @ObfuscatedName("ep.k")
    public static int[] field1803 = new int[500];

    @ObfuscatedName("ep.z")
    public static int[] field1800 = new int[500];

    @ObfuscatedName("ep.v")
    public class138 field1799 = null;

    @ObfuscatedName("ep.m")
    public int field1798 = -1;

    @ObfuscatedName("ep.b")
    public int[] field1801;

    @ObfuscatedName("ep.t")
    public int[] field1795;

    @ObfuscatedName("ep.p")
    public int[] field1802;

    @ObfuscatedName("ep.r")
    public int[] field1804;

    @ObfuscatedName("ep.l")
    public boolean field1805 = false;

    public class131(byte[] arg0, class138 arg1) {
        this.field1799 = arg1;
        class181 var3 = new class181(arg0);
        class181 var4 = new class181(arg0);
        var3.field2498 = 2;
        int var5 = var3.method3204();
        int var6 = -1;
        int var7 = 0;
        var4.field2498 = var3.field2498 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3204();
            if (var9 > 0) {
                if (this.field1799.field1957[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1799.field1957[var10] == 0) {
                            field1797[var7] = var10;
                            field1796[var7] = 0;
                            field1803[var7] = 0;
                            field1800[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1797[var7] = var8;
                short var11 = 0;
                if (this.field1799.field1957[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1796[var7] = var11;
                } else {
                    field1796[var7] = var4.method3222();
                }
                if ((var9 & 0x2) == 0) {
                    field1803[var7] = var11;
                } else {
                    field1803[var7] = var4.method3222();
                }
                if ((var9 & 0x4) == 0) {
                    field1800[var7] = var11;
                } else {
                    field1800[var7] = var4.method3222();
                }
                var6 = var8;
                var7++;
                if (this.field1799.field1957[var8] == 5) {
                    this.field1805 = true;
                }
            }
        }
        if (var4.field2498 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1798 = var7;
        this.field1801 = new int[var7];
        this.field1795 = new int[var7];
        this.field1802 = new int[var7];
        this.field1804 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1801[var12] = field1797[var12];
            this.field1795[var12] = field1796[var12];
            this.field1802[var12] = field1803[var12];
            this.field1804[var12] = field1800[var12];
        }
    }
}
