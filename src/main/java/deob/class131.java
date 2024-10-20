package deob;

@ObfuscatedName("en")
public class class131 {

    @ObfuscatedName("en.b")
    public static int[] field1796 = new int[500];

    @ObfuscatedName("en.s")
    public static int[] field1804 = new int[500];

    @ObfuscatedName("en.r")
    public static int[] field1797 = new int[500];

    @ObfuscatedName("en.g")
    public static int[] field1798 = new int[500];

    @ObfuscatedName("en.x")
    public class138 field1795 = null;

    @ObfuscatedName("en.f")
    public int field1800 = -1;

    @ObfuscatedName("en.u")
    public int[] field1801;

    @ObfuscatedName("en.t")
    public int[] field1802;

    @ObfuscatedName("en.k")
    public int[] field1799;

    @ObfuscatedName("en.n")
    public int[] field1803;

    @ObfuscatedName("en.d")
    public boolean field1805 = false;

    public class131(byte[] arg0, class138 arg1) {
        this.field1795 = arg1;
        class181 var3 = new class181(arg0);
        class181 var4 = new class181(arg0);
        var3.field2488 = 2;
        int var5 = var3.method2945();
        int var6 = -1;
        int var7 = 0;
        var4.field2488 = var3.field2488 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2945();
            if (var9 > 0) {
                if (this.field1795.field1954[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1795.field1954[var10] == 0) {
                            field1796[var7] = var10;
                            field1804[var7] = 0;
                            field1797[var7] = 0;
                            field1798[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1796[var7] = var8;
                short var11 = 0;
                if (this.field1795.field1954[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1804[var7] = var11;
                } else {
                    field1804[var7] = var4.method2957();
                }
                if ((var9 & 0x2) == 0) {
                    field1797[var7] = var11;
                } else {
                    field1797[var7] = var4.method2957();
                }
                if ((var9 & 0x4) == 0) {
                    field1798[var7] = var11;
                } else {
                    field1798[var7] = var4.method2957();
                }
                var6 = var8;
                var7++;
                if (this.field1795.field1954[var8] == 5) {
                    this.field1805 = true;
                }
            }
        }
        if (var4.field2488 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1800 = var7;
        this.field1801 = new int[var7];
        this.field1802 = new int[var7];
        this.field1799 = new int[var7];
        this.field1803 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1801[var12] = field1796[var12];
            this.field1802[var12] = field1804[var12];
            this.field1799[var12] = field1797[var12];
            this.field1803[var12] = field1798[var12];
        }
    }
}
