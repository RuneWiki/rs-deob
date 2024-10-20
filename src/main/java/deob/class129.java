package deob;

@ObfuscatedName("du")
public class class129 {

    @ObfuscatedName("du.s")
    public static int[] field1772 = new int[500];

    @ObfuscatedName("du.g")
    public static int[] field1776 = new int[500];

    @ObfuscatedName("du.m")
    public static int[] field1773 = new int[500];

    @ObfuscatedName("du.h")
    public static int[] field1781 = new int[500];

    @ObfuscatedName("du.i")
    public class136 field1775 = null;

    @ObfuscatedName("du.w")
    public int field1771 = -1;

    @ObfuscatedName("du.t")
    public int[] field1777;

    @ObfuscatedName("du.d")
    public int[] field1774;

    @ObfuscatedName("du.z")
    public int[] field1779;

    @ObfuscatedName("du.k")
    public int[] field1780;

    @ObfuscatedName("du.c")
    public boolean field1778 = false;

    public class129(byte[] arg0, class136 arg1) {
        this.field1775 = arg1;
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        var3.field2514 = 2;
        int var5 = var3.method3239();
        int var6 = -1;
        int var7 = 0;
        var4.field2514 = var3.field2514 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3239();
            if (var9 > 0) {
                if (this.field1775.field1930[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1775.field1930[var10] == 0) {
                            field1772[var7] = var10;
                            field1776[var7] = 0;
                            field1773[var7] = 0;
                            field1781[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1772[var7] = var8;
                short var11 = 0;
                if (this.field1775.field1930[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1776[var7] = var11;
                } else {
                    field1776[var7] = var4.method3461();
                }
                if ((var9 & 0x2) == 0) {
                    field1773[var7] = var11;
                } else {
                    field1773[var7] = var4.method3461();
                }
                if ((var9 & 0x4) == 0) {
                    field1781[var7] = var11;
                } else {
                    field1781[var7] = var4.method3461();
                }
                var6 = var8;
                var7++;
                if (this.field1775.field1930[var8] == 5) {
                    this.field1778 = true;
                }
            }
        }
        if (var4.field2514 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1771 = var7;
        this.field1777 = new int[var7];
        this.field1774 = new int[var7];
        this.field1779 = new int[var7];
        this.field1780 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1777[var12] = field1772[var12];
            this.field1774[var12] = field1776[var12];
            this.field1779[var12] = field1773[var12];
            this.field1780[var12] = field1781[var12];
        }
    }
}
