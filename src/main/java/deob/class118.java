package deob;

@ObfuscatedName("dc")
public class class118 {

    @ObfuscatedName("dc.w")
    public static int[] field1575 = new int[500];

    @ObfuscatedName("dc.m")
    public static int[] field1577 = new int[500];

    @ObfuscatedName("dc.q")
    public static int[] field1574 = new int[500];

    @ObfuscatedName("dc.b")
    public static int[] field1584 = new int[500];

    @ObfuscatedName("dc.f")
    public class125 field1578 = null;

    @ObfuscatedName("dc.n")
    public int field1579 = -1;

    @ObfuscatedName("dc.h")
    public int[] field1580;

    @ObfuscatedName("dc.x")
    public int[] field1581;

    @ObfuscatedName("dc.j")
    public int[] field1582;

    @ObfuscatedName("dc.a")
    public int[] field1583;

    @ObfuscatedName("dc.l")
    public boolean field1576 = false;

    public class118(byte[] arg0, class125 arg1) {
        this.field1578 = arg1;
        class183 var3 = new class183(arg0);
        class183 var4 = new class183(arg0);
        var3.field2360 = 2;
        int var5 = var3.method3436();
        int var6 = -1;
        int var7 = 0;
        var4.field2360 = var3.field2360 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3436();
            if (var9 > 0) {
                if (this.field1578.field1738[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1578.field1738[var10] == 0) {
                            field1575[var7] = var10;
                            field1577[var7] = 0;
                            field1574[var7] = 0;
                            field1584[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1575[var7] = var8;
                short var11 = 0;
                if (this.field1578.field1738[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1577[var7] = var11;
                } else {
                    field1577[var7] = var4.method3275();
                }
                if ((var9 & 0x2) == 0) {
                    field1574[var7] = var11;
                } else {
                    field1574[var7] = var4.method3275();
                }
                if ((var9 & 0x4) == 0) {
                    field1584[var7] = var11;
                } else {
                    field1584[var7] = var4.method3275();
                }
                var6 = var8;
                var7++;
                if (this.field1578.field1738[var8] == 5) {
                    this.field1576 = true;
                }
            }
        }
        if (var4.field2360 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1579 = var7;
        this.field1580 = new int[var7];
        this.field1581 = new int[var7];
        this.field1582 = new int[var7];
        this.field1583 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1580[var12] = field1575[var12];
            this.field1581[var12] = field1577[var12];
            this.field1582[var12] = field1574[var12];
            this.field1583[var12] = field1584[var12];
        }
    }
}
