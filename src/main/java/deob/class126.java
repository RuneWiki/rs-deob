package deob;

@ObfuscatedName("di")
public class class126 {

    @ObfuscatedName("di.s")
    public static int[] field1620 = new int[500];

    @ObfuscatedName("di.j")
    public static int[] field1616 = new int[500];

    @ObfuscatedName("di.i")
    public static int[] field1625 = new int[500];

    @ObfuscatedName("di.k")
    public static int[] field1618 = new int[500];

    @ObfuscatedName("di.u")
    public class133 field1619 = null;

    @ObfuscatedName("di.n")
    public int field1617 = -1;

    @ObfuscatedName("di.t")
    public int[] field1621;

    @ObfuscatedName("di.q")
    public int[] field1623;

    @ObfuscatedName("di.x")
    public int[] field1615;

    @ObfuscatedName("di.d")
    public int[] field1624;

    @ObfuscatedName("di.f")
    public boolean field1622 = false;

    public class126(byte[] arg0, class133 arg1) {
        this.field1619 = arg1;
        class300 var3 = new class300(arg0);
        class300 var4 = new class300(arg0);
        var3.field3704 = 2;
        int var5 = var3.method5179();
        int var6 = -1;
        int var7 = 0;
        var4.field3704 = var3.field3704 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method5179();
            if (var9 > 0) {
                if (this.field1619.field1776[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1619.field1776[var10] == 0) {
                            field1620[var7] = var10;
                            field1616[var7] = 0;
                            field1625[var7] = 0;
                            field1618[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1620[var7] = var8;
                short var11 = 0;
                if (this.field1619.field1776[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1616[var7] = var11;
                } else {
                    field1616[var7] = var4.method5064();
                }
                if ((var9 & 0x2) == 0) {
                    field1625[var7] = var11;
                } else {
                    field1625[var7] = var4.method5064();
                }
                if ((var9 & 0x4) == 0) {
                    field1618[var7] = var11;
                } else {
                    field1618[var7] = var4.method5064();
                }
                var6 = var8;
                var7++;
                if (this.field1619.field1776[var8] == 5) {
                    this.field1622 = true;
                }
            }
        }
        if (var4.field3704 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1617 = var7;
        this.field1621 = new int[var7];
        this.field1623 = new int[var7];
        this.field1615 = new int[var7];
        this.field1624 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1621[var12] = field1620[var12];
            this.field1623[var12] = field1616[var12];
            this.field1615[var12] = field1625[var12];
            this.field1624[var12] = field1618[var12];
        }
    }
}
