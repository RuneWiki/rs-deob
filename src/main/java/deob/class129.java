package deob;

@ObfuscatedName("dz")
public class class129 {

    @ObfuscatedName("dz.p")
    public static int[] field1769 = new int[500];

    @ObfuscatedName("dz.i")
    public static int[] field1765 = new int[500];

    @ObfuscatedName("dz.w")
    public static int[] field1766 = new int[500];

    @ObfuscatedName("dz.s")
    public static int[] field1768 = new int[500];

    @ObfuscatedName("dz.j")
    public class136 field1764 = null;

    @ObfuscatedName("dz.a")
    public int field1774 = -1;

    @ObfuscatedName("dz.t")
    public int[] field1770;

    @ObfuscatedName("dz.r")
    public int[] field1771;

    @ObfuscatedName("dz.m")
    public int[] field1772;

    @ObfuscatedName("dz.h")
    public int[] field1773;

    @ObfuscatedName("dz.o")
    public boolean field1767 = false;

    public class129(byte[] arg0, class136 arg1) {
        this.field1764 = arg1;
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        var3.field2488 = 2;
        int var5 = var3.method3197();
        int var6 = -1;
        int var7 = 0;
        var4.field2488 = var3.field2488 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3197();
            if (var9 > 0) {
                if (this.field1764.field1929[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1764.field1929[var10] == 0) {
                            field1769[var7] = var10;
                            field1765[var7] = 0;
                            field1766[var7] = 0;
                            field1768[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1769[var7] = var8;
                short var11 = 0;
                if (this.field1764.field1929[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1765[var7] = var11;
                } else {
                    field1765[var7] = var4.method3224();
                }
                if ((var9 & 0x2) == 0) {
                    field1766[var7] = var11;
                } else {
                    field1766[var7] = var4.method3224();
                }
                if ((var9 & 0x4) == 0) {
                    field1768[var7] = var11;
                } else {
                    field1768[var7] = var4.method3224();
                }
                var6 = var8;
                var7++;
                if (this.field1764.field1929[var8] == 5) {
                    this.field1767 = true;
                }
            }
        }
        if (var4.field2488 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1774 = var7;
        this.field1770 = new int[var7];
        this.field1771 = new int[var7];
        this.field1772 = new int[var7];
        this.field1773 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1770[var12] = field1769[var12];
            this.field1771[var12] = field1765[var12];
            this.field1772[var12] = field1766[var12];
            this.field1773[var12] = field1768[var12];
        }
    }
}
