package deob;

@ObfuscatedName("dx")
public class class126 {

    @ObfuscatedName("dx.c")
    public static int[] field1604 = new int[500];

    @ObfuscatedName("dx.x")
    public static int[] field1613 = new int[500];

    @ObfuscatedName("dx.t")
    public static int[] field1605 = new int[500];

    @ObfuscatedName("dx.g")
    public static int[] field1603 = new int[500];

    @ObfuscatedName("dx.l")
    public class133 field1607 = null;

    @ObfuscatedName("dx.u")
    public int field1608 = -1;

    @ObfuscatedName("dx.j")
    public int[] field1606;

    @ObfuscatedName("dx.v")
    public int[] field1610;

    @ObfuscatedName("dx.d")
    public int[] field1611;

    @ObfuscatedName("dx.z")
    public int[] field1612;

    @ObfuscatedName("dx.n")
    public boolean field1609 = false;

    public class126(byte[] arg0, class133 arg1) {
        this.field1607 = arg1;
        class300 var3 = new class300(arg0);
        class300 var4 = new class300(arg0);
        var3.field3696 = 2;
        int var5 = var3.method5103();
        int var6 = -1;
        int var7 = 0;
        var4.field3696 = var3.field3696 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method5103();
            if (var9 > 0) {
                if (this.field1607.field1763[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1607.field1763[var10] == 0) {
                            field1604[var7] = var10;
                            field1613[var7] = 0;
                            field1605[var7] = 0;
                            field1603[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1604[var7] = var8;
                short var11 = 0;
                if (this.field1607.field1763[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1613[var7] = var11;
                } else {
                    field1613[var7] = var4.method5116();
                }
                if ((var9 & 0x2) == 0) {
                    field1605[var7] = var11;
                } else {
                    field1605[var7] = var4.method5116();
                }
                if ((var9 & 0x4) == 0) {
                    field1603[var7] = var11;
                } else {
                    field1603[var7] = var4.method5116();
                }
                var6 = var8;
                var7++;
                if (this.field1607.field1763[var8] == 5) {
                    this.field1609 = true;
                }
            }
        }
        if (var4.field3696 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1608 = var7;
        this.field1606 = new int[var7];
        this.field1610 = new int[var7];
        this.field1611 = new int[var7];
        this.field1612 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1606[var12] = field1604[var12];
            this.field1610[var12] = field1613[var12];
            this.field1611[var12] = field1605[var12];
            this.field1612[var12] = field1603[var12];
        }
    }
}
