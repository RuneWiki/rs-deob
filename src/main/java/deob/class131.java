package deob;

@ObfuscatedName("eu")
public class class131 {

    @ObfuscatedName("eu.a")
    public static int[] field1782 = new int[500];

    @ObfuscatedName("eu.w")
    public static int[] field1777 = new int[500];

    @ObfuscatedName("eu.e")
    public static int[] field1779 = new int[500];

    @ObfuscatedName("eu.k")
    public static int[] field1780 = new int[500];

    @ObfuscatedName("eu.u")
    public class138 field1786 = null;

    @ObfuscatedName("eu.z")
    public int field1781 = -1;

    @ObfuscatedName("eu.t")
    public int[] field1783;

    @ObfuscatedName("eu.f")
    public int[] field1784;

    @ObfuscatedName("eu.g")
    public int[] field1785;

    @ObfuscatedName("eu.j")
    public int[] field1778;

    @ObfuscatedName("eu.x")
    public boolean field1787 = false;

    public class131(byte[] arg0, class138 arg1) {
        this.field1786 = arg1;
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        var3.field2509 = 2;
        int var5 = var3.method2962();
        int var6 = -1;
        int var7 = 0;
        var4.field2509 = var3.field2509 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2962();
            if (var9 > 0) {
                if (this.field1786.field1941[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1786.field1941[var10] == 0) {
                            field1782[var7] = var10;
                            field1777[var7] = 0;
                            field1779[var7] = 0;
                            field1780[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1782[var7] = var8;
                short var11 = 0;
                if (this.field1786.field1941[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1777[var7] = var11;
                } else {
                    field1777[var7] = var4.method2984();
                }
                if ((var9 & 0x2) == 0) {
                    field1779[var7] = var11;
                } else {
                    field1779[var7] = var4.method2984();
                }
                if ((var9 & 0x4) == 0) {
                    field1780[var7] = var11;
                } else {
                    field1780[var7] = var4.method2984();
                }
                var6 = var8;
                var7++;
                if (this.field1786.field1941[var8] == 5) {
                    this.field1787 = true;
                }
            }
        }
        if (var4.field2509 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1781 = var7;
        this.field1783 = new int[var7];
        this.field1784 = new int[var7];
        this.field1785 = new int[var7];
        this.field1778 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1783[var12] = field1782[var12];
            this.field1784[var12] = field1777[var12];
            this.field1785[var12] = field1779[var12];
            this.field1778[var12] = field1780[var12];
        }
    }
}
