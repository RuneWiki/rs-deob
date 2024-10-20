package deob;

@ObfuscatedName("dr")
public class class120 {

    @ObfuscatedName("dr.y")
    public static int[] field1598 = new int[500];

    @ObfuscatedName("dr.c")
    public static int[] field1594 = new int[500];

    @ObfuscatedName("dr.n")
    public static int[] field1600 = new int[500];

    @ObfuscatedName("dr.u")
    public static int[] field1596 = new int[500];

    @ObfuscatedName("dr.i")
    public class127 field1597 = null;

    @ObfuscatedName("dr.r")
    public int field1595 = -1;

    @ObfuscatedName("dr.j")
    public int[] field1593;

    @ObfuscatedName("dr.p")
    public int[] field1599;

    @ObfuscatedName("dr.e")
    public int[] field1601;

    @ObfuscatedName("dr.s")
    public int[] field1602;

    @ObfuscatedName("dr.v")
    public boolean field1603 = false;

    public class120(byte[] arg0, class127 arg1) {
        this.field1597 = arg1;
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        var3.field2374 = 2;
        int var5 = var3.method3299();
        int var6 = -1;
        int var7 = 0;
        var4.field2374 = var3.field2374 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3299();
            if (var9 > 0) {
                if (this.field1597.field1760[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1597.field1760[var10] == 0) {
                            field1598[var7] = var10;
                            field1594[var7] = 0;
                            field1600[var7] = 0;
                            field1596[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1598[var7] = var8;
                short var11 = 0;
                if (this.field1597.field1760[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1594[var7] = var11;
                } else {
                    field1594[var7] = var4.method3436();
                }
                if ((var9 & 0x2) == 0) {
                    field1600[var7] = var11;
                } else {
                    field1600[var7] = var4.method3436();
                }
                if ((var9 & 0x4) == 0) {
                    field1596[var7] = var11;
                } else {
                    field1596[var7] = var4.method3436();
                }
                var6 = var8;
                var7++;
                if (this.field1597.field1760[var8] == 5) {
                    this.field1603 = true;
                }
            }
        }
        if (var4.field2374 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1595 = var7;
        this.field1593 = new int[var7];
        this.field1599 = new int[var7];
        this.field1601 = new int[var7];
        this.field1602 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1593[var12] = field1598[var12];
            this.field1599[var12] = field1594[var12];
            this.field1601[var12] = field1600[var12];
            this.field1602[var12] = field1596[var12];
        }
    }
}
