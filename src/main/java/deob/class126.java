package deob;

@ObfuscatedName("da")
public class class126 {

    @ObfuscatedName("da.z")
    public static int[] field1608 = new int[500];

    @ObfuscatedName("da.n")
    public static int[] field1599 = new int[500];

    @ObfuscatedName("da.v")
    public static int[] field1598 = new int[500];

    @ObfuscatedName("da.u")
    public static int[] field1601 = new int[500];

    @ObfuscatedName("da.r")
    public class133 field1602 = null;

    @ObfuscatedName("da.p")
    public int field1603 = -1;

    @ObfuscatedName("da.q")
    public int[] field1600;

    @ObfuscatedName("da.m")
    public int[] field1605;

    @ObfuscatedName("da.y")
    public int[] field1606;

    @ObfuscatedName("da.i")
    public int[] field1607;

    @ObfuscatedName("da.c")
    public boolean field1604 = false;

    public class126(byte[] arg0, class133 arg1) {
        this.field1602 = arg1;
        class300 var3 = new class300(arg0);
        class300 var4 = new class300(arg0);
        var3.field3702 = 2;
        int var5 = var3.method4990();
        int var6 = -1;
        int var7 = 0;
        var4.field3702 = var3.field3702 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method4990();
            if (var9 > 0) {
                if (this.field1602.field1764[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1602.field1764[var10] == 0) {
                            field1608[var7] = var10;
                            field1599[var7] = 0;
                            field1598[var7] = 0;
                            field1601[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1608[var7] = var8;
                short var11 = 0;
                if (this.field1602.field1764[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1599[var7] = var11;
                } else {
                    field1599[var7] = var4.method5003();
                }
                if ((var9 & 0x2) == 0) {
                    field1598[var7] = var11;
                } else {
                    field1598[var7] = var4.method5003();
                }
                if ((var9 & 0x4) == 0) {
                    field1601[var7] = var11;
                } else {
                    field1601[var7] = var4.method5003();
                }
                var6 = var8;
                var7++;
                if (this.field1602.field1764[var8] == 5) {
                    this.field1604 = true;
                }
            }
        }
        if (var4.field3702 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1603 = var7;
        this.field1600 = new int[var7];
        this.field1605 = new int[var7];
        this.field1606 = new int[var7];
        this.field1607 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1600[var12] = field1608[var12];
            this.field1605[var12] = field1599[var12];
            this.field1606[var12] = field1598[var12];
            this.field1607[var12] = field1601[var12];
        }
    }
}
