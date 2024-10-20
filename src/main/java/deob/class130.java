package deob;

@ObfuscatedName("dm")
public class class130 {

    @ObfuscatedName("dm.t")
    public static int[] field1795 = new int[500];

    @ObfuscatedName("dm.q")
    public static int[] field1796 = new int[500];

    @ObfuscatedName("dm.i")
    public static int[] field1790 = new int[500];

    @ObfuscatedName("dm.a")
    public static int[] field1792 = new int[500];

    @ObfuscatedName("dm.l")
    public class137 field1793 = null;

    @ObfuscatedName("dm.b")
    public int field1794 = -1;

    @ObfuscatedName("dm.e")
    public int[] field1791;

    @ObfuscatedName("dm.x")
    public int[] field1789;

    @ObfuscatedName("dm.p")
    public int[] field1797;

    @ObfuscatedName("dm.g")
    public int[] field1798;

    @ObfuscatedName("dm.n")
    public boolean field1799 = false;

    public class130(byte[] arg0, class137 arg1) {
        this.field1793 = arg1;
        class195 var3 = new class195(arg0);
        class195 var4 = new class195(arg0);
        var3.field2545 = 2;
        int var5 = var3.method3236();
        int var6 = -1;
        int var7 = 0;
        var4.field2545 = var3.field2545 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3236();
            if (var9 > 0) {
                if (this.field1793.field1950[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1793.field1950[var10] == 0) {
                            field1795[var7] = var10;
                            field1796[var7] = 0;
                            field1790[var7] = 0;
                            field1792[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1795[var7] = var8;
                short var11 = 0;
                if (this.field1793.field1950[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1796[var7] = var11;
                } else {
                    field1796[var7] = var4.method3249();
                }
                if ((var9 & 0x2) == 0) {
                    field1790[var7] = var11;
                } else {
                    field1790[var7] = var4.method3249();
                }
                if ((var9 & 0x4) == 0) {
                    field1792[var7] = var11;
                } else {
                    field1792[var7] = var4.method3249();
                }
                var6 = var8;
                var7++;
                if (this.field1793.field1950[var8] == 5) {
                    this.field1799 = true;
                }
            }
        }
        if (var4.field2545 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1794 = var7;
        this.field1791 = new int[var7];
        this.field1789 = new int[var7];
        this.field1797 = new int[var7];
        this.field1798 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1791[var12] = field1795[var12];
            this.field1789[var12] = field1796[var12];
            this.field1797[var12] = field1790[var12];
            this.field1798[var12] = field1792[var12];
        }
    }
}
