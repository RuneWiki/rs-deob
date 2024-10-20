package deob;

@ObfuscatedName("dz")
public class class126 {

    @ObfuscatedName("dz.m")
    public static int[] field1619 = new int[500];

    @ObfuscatedName("dz.f")
    public static int[] field1612 = new int[500];

    @ObfuscatedName("dz.q")
    public static int[] field1614 = new int[500];

    @ObfuscatedName("dz.w")
    public static int[] field1613 = new int[500];

    @ObfuscatedName("dz.o")
    public class133 field1610 = null;

    @ObfuscatedName("dz.u")
    public int field1615 = -1;

    @ObfuscatedName("dz.g")
    public int[] field1616;

    @ObfuscatedName("dz.l")
    public int[] field1617;

    @ObfuscatedName("dz.e")
    public int[] field1618;

    @ObfuscatedName("dz.x")
    public int[] field1611;

    @ObfuscatedName("dz.d")
    public boolean field1620 = false;

    public class126(byte[] arg0, class133 arg1) {
        this.field1610 = arg1;
        class202 var3 = new class202(arg0);
        class202 var4 = new class202(arg0);
        var3.field2439 = 2;
        int var5 = var3.method3551();
        int var6 = -1;
        int var7 = 0;
        var4.field2439 = var3.field2439 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3551();
            if (var9 > 0) {
                if (this.field1610.field1771[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1610.field1771[var10] == 0) {
                            field1619[var7] = var10;
                            field1612[var7] = 0;
                            field1614[var7] = 0;
                            field1613[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1619[var7] = var8;
                short var11 = 0;
                if (this.field1610.field1771[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1612[var7] = var11;
                } else {
                    field1612[var7] = var4.method3430();
                }
                if ((var9 & 0x2) == 0) {
                    field1614[var7] = var11;
                } else {
                    field1614[var7] = var4.method3430();
                }
                if ((var9 & 0x4) == 0) {
                    field1613[var7] = var11;
                } else {
                    field1613[var7] = var4.method3430();
                }
                var6 = var8;
                var7++;
                if (this.field1610.field1771[var8] == 5) {
                    this.field1620 = true;
                }
            }
        }
        if (var4.field2439 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1615 = var7;
        this.field1616 = new int[var7];
        this.field1617 = new int[var7];
        this.field1618 = new int[var7];
        this.field1611 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1616[var12] = field1619[var12];
            this.field1617[var12] = field1612[var12];
            this.field1618[var12] = field1614[var12];
            this.field1611[var12] = field1613[var12];
        }
    }
}
