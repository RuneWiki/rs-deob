package deob;

@ObfuscatedName("dx")
public class class120 {

    @ObfuscatedName("dx.v")
    public static int[] field1597 = new int[500];

    @ObfuscatedName("dx.s")
    public static int[] field1598 = new int[500];

    @ObfuscatedName("dx.o")
    public static int[] field1599 = new int[500];

    @ObfuscatedName("dx.k")
    public static int[] field1600 = new int[500];

    @ObfuscatedName("dx.u")
    public class127 field1601 = null;

    @ObfuscatedName("dx.i")
    public int field1602 = -1;

    @ObfuscatedName("dx.t")
    public int[] field1604;

    @ObfuscatedName("dx.p")
    public int[] field1603;

    @ObfuscatedName("dx.l")
    public int[] field1605;

    @ObfuscatedName("dx.b")
    public int[] field1606;

    @ObfuscatedName("dx.c")
    public boolean field1607 = false;

    public class120(byte[] arg0, class127 arg1) {
        this.field1601 = arg1;
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        var3.field2386 = 2;
        int var5 = var3.method3274();
        int var6 = -1;
        int var7 = 0;
        var4.field2386 = var3.field2386 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3274();
            if (var9 > 0) {
                if (this.field1601.field1757[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1601.field1757[var10] == 0) {
                            field1597[var7] = var10;
                            field1598[var7] = 0;
                            field1599[var7] = 0;
                            field1600[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1597[var7] = var8;
                short var11 = 0;
                if (this.field1601.field1757[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1598[var7] = var11;
                } else {
                    field1598[var7] = var4.method3414();
                }
                if ((var9 & 0x2) == 0) {
                    field1599[var7] = var11;
                } else {
                    field1599[var7] = var4.method3414();
                }
                if ((var9 & 0x4) == 0) {
                    field1600[var7] = var11;
                } else {
                    field1600[var7] = var4.method3414();
                }
                var6 = var8;
                var7++;
                if (this.field1601.field1757[var8] == 5) {
                    this.field1607 = true;
                }
            }
        }
        if (var4.field2386 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1602 = var7;
        this.field1604 = new int[var7];
        this.field1603 = new int[var7];
        this.field1605 = new int[var7];
        this.field1606 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1604[var12] = field1597[var12];
            this.field1603[var12] = field1598[var12];
            this.field1605[var12] = field1599[var12];
            this.field1606[var12] = field1600[var12];
        }
    }
}
