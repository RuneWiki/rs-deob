package deob;

@ObfuscatedName("dj")
public class class126 {

    @ObfuscatedName("dj.f")
    public static int[] field1616 = new int[500];

    @ObfuscatedName("dj.i")
    public static int[] field1615 = new int[500];

    @ObfuscatedName("dj.y")
    public static int[] field1612 = new int[500];

    @ObfuscatedName("dj.w")
    public static int[] field1617 = new int[500];

    @ObfuscatedName("dj.p")
    public class133 field1614 = null;

    @ObfuscatedName("dj.b")
    public int field1613 = -1;

    @ObfuscatedName("dj.e")
    public int[] field1611;

    @ObfuscatedName("dj.x")
    public int[] field1610;

    @ObfuscatedName("dj.a")
    public int[] field1618;

    @ObfuscatedName("dj.d")
    public int[] field1619;

    @ObfuscatedName("dj.c")
    public boolean field1620 = false;

    public class126(byte[] arg0, class133 arg1) {
        this.field1614 = arg1;
        class300 var3 = new class300(arg0);
        class300 var4 = new class300(arg0);
        var3.field3703 = 2;
        int var5 = var3.method5110();
        int var6 = -1;
        int var7 = 0;
        var4.field3703 = var3.field3703 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method5110();
            if (var9 > 0) {
                if (this.field1614.field1773[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1614.field1773[var10] == 0) {
                            field1616[var7] = var10;
                            field1615[var7] = 0;
                            field1612[var7] = 0;
                            field1617[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1616[var7] = var8;
                short var11 = 0;
                if (this.field1614.field1773[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1615[var7] = var11;
                } else {
                    field1615[var7] = var4.method5123();
                }
                if ((var9 & 0x2) == 0) {
                    field1612[var7] = var11;
                } else {
                    field1612[var7] = var4.method5123();
                }
                if ((var9 & 0x4) == 0) {
                    field1617[var7] = var11;
                } else {
                    field1617[var7] = var4.method5123();
                }
                var6 = var8;
                var7++;
                if (this.field1614.field1773[var8] == 5) {
                    this.field1620 = true;
                }
            }
        }
        if (var4.field3703 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1613 = var7;
        this.field1611 = new int[var7];
        this.field1610 = new int[var7];
        this.field1618 = new int[var7];
        this.field1619 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1611[var12] = field1616[var12];
            this.field1610[var12] = field1615[var12];
            this.field1618[var12] = field1612[var12];
            this.field1619[var12] = field1617[var12];
        }
    }
}
