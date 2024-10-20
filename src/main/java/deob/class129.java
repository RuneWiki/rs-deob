package deob;

@ObfuscatedName("dz")
public class class129 {

    @ObfuscatedName("dz.b")
    public static int[] field1777 = new int[500];

    @ObfuscatedName("dz.q")
    public static int[] field1769 = new int[500];

    @ObfuscatedName("dz.o")
    public static int[] field1768 = new int[500];

    @ObfuscatedName("dz.p")
    public static int[] field1771 = new int[500];

    @ObfuscatedName("dz.a")
    public class136 field1772 = null;

    @ObfuscatedName("dz.h")
    public int field1773 = -1;

    @ObfuscatedName("dz.l")
    public int[] field1774;

    @ObfuscatedName("dz.y")
    public int[] field1775;

    @ObfuscatedName("dz.g")
    public int[] field1776;

    @ObfuscatedName("dz.c")
    public int[] field1770;

    @ObfuscatedName("dz.u")
    public boolean field1778 = false;

    public class129(byte[] arg0, class136 arg1) {
        this.field1772 = arg1;
        class194 var3 = new class194(arg0);
        class194 var4 = new class194(arg0);
        var3.field2538 = 2;
        int var5 = var3.method3247();
        int var6 = -1;
        int var7 = 0;
        var4.field2538 = var3.field2538 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3247();
            if (var9 > 0) {
                if (this.field1772.field1927[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1772.field1927[var10] == 0) {
                            field1777[var7] = var10;
                            field1769[var7] = 0;
                            field1768[var7] = 0;
                            field1771[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1777[var7] = var8;
                short var11 = 0;
                if (this.field1772.field1927[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1769[var7] = var11;
                } else {
                    field1769[var7] = var4.method3260();
                }
                if ((var9 & 0x2) == 0) {
                    field1768[var7] = var11;
                } else {
                    field1768[var7] = var4.method3260();
                }
                if ((var9 & 0x4) == 0) {
                    field1771[var7] = var11;
                } else {
                    field1771[var7] = var4.method3260();
                }
                var6 = var8;
                var7++;
                if (this.field1772.field1927[var8] == 5) {
                    this.field1778 = true;
                }
            }
        }
        if (var4.field2538 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1773 = var7;
        this.field1774 = new int[var7];
        this.field1775 = new int[var7];
        this.field1776 = new int[var7];
        this.field1770 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1774[var12] = field1777[var12];
            this.field1775[var12] = field1769[var12];
            this.field1776[var12] = field1768[var12];
            this.field1770[var12] = field1771[var12];
        }
    }
}
