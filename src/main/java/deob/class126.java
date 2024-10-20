package deob;

@ObfuscatedName("dw")
public class class126 {

    @ObfuscatedName("dw.a")
    public static int[] field1610 = new int[500];

    @ObfuscatedName("dw.t")
    public static int[] field1612 = new int[500];

    @ObfuscatedName("dw.n")
    public static int[] field1619 = new int[500];

    @ObfuscatedName("dw.q")
    public static int[] field1611 = new int[500];

    @ObfuscatedName("dw.v")
    public class133 field1613 = null;

    @ObfuscatedName("dw.l")
    public int field1614 = -1;

    @ObfuscatedName("dw.c")
    public int[] field1615;

    @ObfuscatedName("dw.o")
    public int[] field1616;

    @ObfuscatedName("dw.i")
    public int[] field1617;

    @ObfuscatedName("dw.d")
    public int[] field1618;

    @ObfuscatedName("dw.m")
    public boolean field1609 = false;

    public class126(byte[] arg0, class133 arg1) {
        this.field1613 = arg1;
        class300 var3 = new class300(arg0);
        class300 var4 = new class300(arg0);
        var3.field3694 = 2;
        int var5 = var3.method5123();
        int var6 = -1;
        int var7 = 0;
        var4.field3694 = var3.field3694 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method5123();
            if (var9 > 0) {
                if (this.field1613.field1777[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1613.field1777[var10] == 0) {
                            field1610[var7] = var10;
                            field1612[var7] = 0;
                            field1619[var7] = 0;
                            field1611[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1610[var7] = var8;
                short var11 = 0;
                if (this.field1613.field1777[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1612[var7] = var11;
                } else {
                    field1612[var7] = var4.method5135();
                }
                if ((var9 & 0x2) == 0) {
                    field1619[var7] = var11;
                } else {
                    field1619[var7] = var4.method5135();
                }
                if ((var9 & 0x4) == 0) {
                    field1611[var7] = var11;
                } else {
                    field1611[var7] = var4.method5135();
                }
                var6 = var8;
                var7++;
                if (this.field1613.field1777[var8] == 5) {
                    this.field1609 = true;
                }
            }
        }
        if (var4.field3694 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1614 = var7;
        this.field1615 = new int[var7];
        this.field1616 = new int[var7];
        this.field1617 = new int[var7];
        this.field1618 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1615[var12] = field1610[var12];
            this.field1616[var12] = field1612[var12];
            this.field1617[var12] = field1619[var12];
            this.field1618[var12] = field1611[var12];
        }
    }
}
