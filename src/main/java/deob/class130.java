package deob;

@ObfuscatedName("dy")
public class class130 {

    @ObfuscatedName("dy.d")
    public static int[] field1805 = new int[500];

    @ObfuscatedName("dy.z")
    public static int[] field1800 = new int[500];

    @ObfuscatedName("dy.n")
    public static int[] field1801 = new int[500];

    @ObfuscatedName("dy.r")
    public static int[] field1802 = new int[500];

    @ObfuscatedName("dy.e")
    public class137 field1803 = null;

    @ObfuscatedName("dy.y")
    public int field1804 = -1;

    @ObfuscatedName("dy.k")
    public int[] field1807;

    @ObfuscatedName("dy.s")
    public int[] field1806;

    @ObfuscatedName("dy.p")
    public int[] field1799;

    @ObfuscatedName("dy.x")
    public int[] field1808;

    @ObfuscatedName("dy.m")
    public boolean field1809 = false;

    public class130(byte[] arg0, class137 arg1) {
        this.field1803 = arg1;
        class195 var3 = new class195(arg0);
        class195 var4 = new class195(arg0);
        var3.field2568 = 2;
        int var5 = var3.method3330();
        int var6 = -1;
        int var7 = 0;
        var4.field2568 = var3.field2568 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3330();
            if (var9 > 0) {
                if (this.field1803.field1955[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1803.field1955[var10] == 0) {
                            field1805[var7] = var10;
                            field1800[var7] = 0;
                            field1801[var7] = 0;
                            field1802[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1805[var7] = var8;
                short var11 = 0;
                if (this.field1803.field1955[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1800[var7] = var11;
                } else {
                    field1800[var7] = var4.method3272();
                }
                if ((var9 & 0x2) == 0) {
                    field1801[var7] = var11;
                } else {
                    field1801[var7] = var4.method3272();
                }
                if ((var9 & 0x4) == 0) {
                    field1802[var7] = var11;
                } else {
                    field1802[var7] = var4.method3272();
                }
                var6 = var8;
                var7++;
                if (this.field1803.field1955[var8] == 5) {
                    this.field1809 = true;
                }
            }
        }
        if (var4.field2568 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1804 = var7;
        this.field1807 = new int[var7];
        this.field1806 = new int[var7];
        this.field1799 = new int[var7];
        this.field1808 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1807[var12] = field1805[var12];
            this.field1806[var12] = field1800[var12];
            this.field1799[var12] = field1801[var12];
            this.field1808[var12] = field1802[var12];
        }
    }
}
