package deob;

@ObfuscatedName("da")
public class class118 {

    @ObfuscatedName("da.z")
    public static int[] field1552 = new int[500];

    @ObfuscatedName("da.w")
    public static int[] field1544 = new int[500];

    @ObfuscatedName("da.s")
    public static int[] field1545 = new int[500];

    @ObfuscatedName("da.l")
    public static int[] field1546 = new int[500];

    @ObfuscatedName("da.u")
    public class125 field1547 = null;

    @ObfuscatedName("da.q")
    public int field1548 = -1;

    @ObfuscatedName("da.k")
    public int[] field1549;

    @ObfuscatedName("da.i")
    public int[] field1550;

    @ObfuscatedName("da.x")
    public int[] field1543;

    @ObfuscatedName("da.e")
    public int[] field1551;

    @ObfuscatedName("da.p")
    public boolean field1553 = false;

    public class118(byte[] arg0, class125 arg1) {
        this.field1547 = arg1;
        class183 var3 = new class183(arg0);
        class183 var4 = new class183(arg0);
        var3.field2340 = 2;
        int var5 = var3.method3247();
        int var6 = -1;
        int var7 = 0;
        var4.field2340 = var3.field2340 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3247();
            if (var9 > 0) {
                if (this.field1547.field1707[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1547.field1707[var10] == 0) {
                            field1552[var7] = var10;
                            field1544[var7] = 0;
                            field1545[var7] = 0;
                            field1546[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1552[var7] = var8;
                short var11 = 0;
                if (this.field1547.field1707[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1544[var7] = var11;
                } else {
                    field1544[var7] = var4.method3264();
                }
                if ((var9 & 0x2) == 0) {
                    field1545[var7] = var11;
                } else {
                    field1545[var7] = var4.method3264();
                }
                if ((var9 & 0x4) == 0) {
                    field1546[var7] = var11;
                } else {
                    field1546[var7] = var4.method3264();
                }
                var6 = var8;
                var7++;
                if (this.field1547.field1707[var8] == 5) {
                    this.field1553 = true;
                }
            }
        }
        if (var4.field2340 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1548 = var7;
        this.field1549 = new int[var7];
        this.field1550 = new int[var7];
        this.field1543 = new int[var7];
        this.field1551 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1549[var12] = field1552[var12];
            this.field1550[var12] = field1544[var12];
            this.field1543[var12] = field1545[var12];
            this.field1551[var12] = field1546[var12];
        }
    }
}
