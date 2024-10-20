package deob;

@ObfuscatedName("dg")
public class class120 {

    @ObfuscatedName("dg.f")
    public static int[] field1608 = new int[500];

    @ObfuscatedName("dg.l")
    public static int[] field1609 = new int[500];

    @ObfuscatedName("dg.w")
    public static int[] field1603 = new int[500];

    @ObfuscatedName("dg.s")
    public static int[] field1604 = new int[500];

    @ObfuscatedName("dg.e")
    public class127 field1605 = null;

    @ObfuscatedName("dg.a")
    public int field1606 = -1;

    @ObfuscatedName("dg.c")
    public int[] field1607;

    @ObfuscatedName("dg.p")
    public int[] field1611;

    @ObfuscatedName("dg.r")
    public int[] field1602;

    @ObfuscatedName("dg.m")
    public int[] field1610;

    @ObfuscatedName("dg.d")
    public boolean field1601 = false;

    public class120(byte[] arg0, class127 arg1) {
        this.field1605 = arg1;
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        var3.field2414 = 2;
        int var5 = var3.method3344();
        int var6 = -1;
        int var7 = 0;
        var4.field2414 = var3.field2414 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3344();
            if (var9 > 0) {
                if (this.field1605.field1761[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1605.field1761[var10] == 0) {
                            field1608[var7] = var10;
                            field1609[var7] = 0;
                            field1603[var7] = 0;
                            field1604[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1608[var7] = var8;
                short var11 = 0;
                if (this.field1605.field1761[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1609[var7] = var11;
                } else {
                    field1609[var7] = var4.method3427();
                }
                if ((var9 & 0x2) == 0) {
                    field1603[var7] = var11;
                } else {
                    field1603[var7] = var4.method3427();
                }
                if ((var9 & 0x4) == 0) {
                    field1604[var7] = var11;
                } else {
                    field1604[var7] = var4.method3427();
                }
                var6 = var8;
                var7++;
                if (this.field1605.field1761[var8] == 5) {
                    this.field1601 = true;
                }
            }
        }
        if (var4.field2414 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1606 = var7;
        this.field1607 = new int[var7];
        this.field1611 = new int[var7];
        this.field1602 = new int[var7];
        this.field1610 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1607[var12] = field1608[var12];
            this.field1611[var12] = field1609[var12];
            this.field1602[var12] = field1603[var12];
            this.field1610[var12] = field1604[var12];
        }
    }
}
