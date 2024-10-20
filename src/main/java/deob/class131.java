package deob;

@ObfuscatedName("ee")
public class class131 {

    @ObfuscatedName("ee.m")
    public static int[] field1811 = new int[500];

    @ObfuscatedName("ee.p")
    public static int[] field1804 = new int[500];

    @ObfuscatedName("ee.i")
    public static int[] field1805 = new int[500];

    @ObfuscatedName("ee.j")
    public static int[] field1806 = new int[500];

    @ObfuscatedName("ee.v")
    public class138 field1807 = null;

    @ObfuscatedName("ee.x")
    public int field1808 = -1;

    @ObfuscatedName("ee.e")
    public int[] field1809;

    @ObfuscatedName("ee.l")
    public int[] field1812;

    @ObfuscatedName("ee.b")
    public int[] field1810;

    @ObfuscatedName("ee.n")
    public int[] field1813;

    @ObfuscatedName("ee.c")
    public boolean field1803 = false;

    public class131(byte[] arg0, class138 arg1) {
        this.field1807 = arg1;
        class181 var3 = new class181(arg0);
        class181 var4 = new class181(arg0);
        var3.field2498 = 2;
        int var5 = var3.method3012();
        int var6 = -1;
        int var7 = 0;
        var4.field2498 = var3.field2498 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3012();
            if (var9 > 0) {
                if (this.field1807.field1965[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1807.field1965[var10] == 0) {
                            field1811[var7] = var10;
                            field1804[var7] = 0;
                            field1805[var7] = 0;
                            field1806[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1811[var7] = var8;
                short var11 = 0;
                if (this.field1807.field1965[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1804[var7] = var11;
                } else {
                    field1804[var7] = var4.method3025();
                }
                if ((var9 & 0x2) == 0) {
                    field1805[var7] = var11;
                } else {
                    field1805[var7] = var4.method3025();
                }
                if ((var9 & 0x4) == 0) {
                    field1806[var7] = var11;
                } else {
                    field1806[var7] = var4.method3025();
                }
                var6 = var8;
                var7++;
                if (this.field1807.field1965[var8] == 5) {
                    this.field1803 = true;
                }
            }
        }
        if (var4.field2498 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1808 = var7;
        this.field1809 = new int[var7];
        this.field1812 = new int[var7];
        this.field1810 = new int[var7];
        this.field1813 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1809[var12] = field1811[var12];
            this.field1812[var12] = field1804[var12];
            this.field1810[var12] = field1805[var12];
            this.field1813[var12] = field1806[var12];
        }
    }
}
