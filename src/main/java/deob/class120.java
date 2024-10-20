package deob;

@ObfuscatedName("dz")
public class class120 {

    @ObfuscatedName("dz.f")
    public static int[] field1595 = new int[500];

    @ObfuscatedName("dz.h")
    public static int[] field1588 = new int[500];

    @ObfuscatedName("dz.e")
    public static int[] field1590 = new int[500];

    @ObfuscatedName("dz.b")
    public static int[] field1589 = new int[500];

    @ObfuscatedName("dz.l")
    public class127 field1592 = null;

    @ObfuscatedName("dz.w")
    public int field1593 = -1;

    @ObfuscatedName("dz.d")
    public int[] field1594;

    @ObfuscatedName("dz.n")
    public int[] field1598;

    @ObfuscatedName("dz.s")
    public int[] field1591;

    @ObfuscatedName("dz.g")
    public int[] field1596;

    @ObfuscatedName("dz.a")
    public boolean field1597 = false;

    public class120(byte[] arg0, class127 arg1) {
        this.field1592 = arg1;
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        var3.field2397 = 2;
        int var5 = var3.method3323();
        int var6 = -1;
        int var7 = 0;
        var4.field2397 = var3.field2397 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3323();
            if (var9 > 0) {
                if (this.field1592.field1758[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1592.field1758[var10] == 0) {
                            field1595[var7] = var10;
                            field1588[var7] = 0;
                            field1590[var7] = 0;
                            field1589[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1595[var7] = var8;
                short var11 = 0;
                if (this.field1592.field1758[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1588[var7] = var11;
                } else {
                    field1588[var7] = var4.method3336();
                }
                if ((var9 & 0x2) == 0) {
                    field1590[var7] = var11;
                } else {
                    field1590[var7] = var4.method3336();
                }
                if ((var9 & 0x4) == 0) {
                    field1589[var7] = var11;
                } else {
                    field1589[var7] = var4.method3336();
                }
                var6 = var8;
                var7++;
                if (this.field1592.field1758[var8] == 5) {
                    this.field1597 = true;
                }
            }
        }
        if (var4.field2397 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1593 = var7;
        this.field1594 = new int[var7];
        this.field1598 = new int[var7];
        this.field1591 = new int[var7];
        this.field1596 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1594[var12] = field1595[var12];
            this.field1598[var12] = field1588[var12];
            this.field1591[var12] = field1590[var12];
            this.field1596[var12] = field1589[var12];
        }
    }
}
