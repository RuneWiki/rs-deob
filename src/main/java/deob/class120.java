package deob;

@ObfuscatedName("do")
public class class120 {

    @ObfuscatedName("do.g")
    public static int[] field1613 = new int[500];

    @ObfuscatedName("do.r")
    public static int[] field1606 = new int[500];

    @ObfuscatedName("do.e")
    public static int[] field1607 = new int[500];

    @ObfuscatedName("do.q")
    public static int[] field1608 = new int[500];

    @ObfuscatedName("do.c")
    public class127 field1609 = null;

    @ObfuscatedName("do.l")
    public int field1610 = -1;

    @ObfuscatedName("do.b")
    public int[] field1611;

    @ObfuscatedName("do.w")
    public int[] field1614;

    @ObfuscatedName("do.n")
    public int[] field1605;

    @ObfuscatedName("do.i")
    public int[] field1612;

    @ObfuscatedName("do.p")
    public boolean field1615 = false;

    public class120(byte[] arg0, class127 arg1) {
        this.field1609 = arg1;
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        var3.field2406 = 2;
        int var5 = var3.method3679();
        int var6 = -1;
        int var7 = 0;
        var4.field2406 = var3.field2406 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3679();
            if (var9 > 0) {
                if (this.field1609.field1765[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1609.field1765[var10] == 0) {
                            field1613[var7] = var10;
                            field1606[var7] = 0;
                            field1607[var7] = 0;
                            field1608[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1613[var7] = var8;
                short var11 = 0;
                if (this.field1609.field1765[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1606[var7] = var11;
                } else {
                    field1606[var7] = var4.method3478();
                }
                if ((var9 & 0x2) == 0) {
                    field1607[var7] = var11;
                } else {
                    field1607[var7] = var4.method3478();
                }
                if ((var9 & 0x4) == 0) {
                    field1608[var7] = var11;
                } else {
                    field1608[var7] = var4.method3478();
                }
                var6 = var8;
                var7++;
                if (this.field1609.field1765[var8] == 5) {
                    this.field1615 = true;
                }
            }
        }
        if (var4.field2406 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1610 = var7;
        this.field1611 = new int[var7];
        this.field1614 = new int[var7];
        this.field1605 = new int[var7];
        this.field1612 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1611[var12] = field1613[var12];
            this.field1614[var12] = field1606[var12];
            this.field1605[var12] = field1607[var12];
            this.field1612[var12] = field1608[var12];
        }
    }
}
