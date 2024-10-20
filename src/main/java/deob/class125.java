package deob;

@ObfuscatedName("da")
public class class125 {

    @ObfuscatedName("da.n")
    public static int[] field1619 = new int[500];

    @ObfuscatedName("da.h")
    public static int[] field1612 = new int[500];

    @ObfuscatedName("da.l")
    public static int[] field1621 = new int[500];

    @ObfuscatedName("da.g")
    public static int[] field1615 = new int[500];

    @ObfuscatedName("da.b")
    public class132 field1616 = null;

    @ObfuscatedName("da.a")
    public int field1614 = -1;

    @ObfuscatedName("da.c")
    public int[] field1618;

    @ObfuscatedName("da.z")
    public int[] field1620;

    @ObfuscatedName("da.j")
    public int[] field1617;

    @ObfuscatedName("da.d")
    public int[] field1613;

    @ObfuscatedName("da.t")
    public boolean field1622 = false;

    public class125(byte[] arg0, class132 arg1) {
        this.field1616 = arg1;
        class190 var3 = new class190(arg0);
        class190 var4 = new class190(arg0);
        var3.field2423 = 2;
        int var5 = var3.method3511();
        int var6 = -1;
        int var7 = 0;
        var4.field2423 = var3.field2423 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3511();
            if (var9 > 0) {
                if (this.field1616.field1780[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1616.field1780[var10] == 0) {
                            field1619[var7] = var10;
                            field1612[var7] = 0;
                            field1621[var7] = 0;
                            field1615[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1619[var7] = var8;
                short var11 = 0;
                if (this.field1616.field1780[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1612[var7] = var11;
                } else {
                    field1612[var7] = var4.method3524();
                }
                if ((var9 & 0x2) == 0) {
                    field1621[var7] = var11;
                } else {
                    field1621[var7] = var4.method3524();
                }
                if ((var9 & 0x4) == 0) {
                    field1615[var7] = var11;
                } else {
                    field1615[var7] = var4.method3524();
                }
                var6 = var8;
                var7++;
                if (this.field1616.field1780[var8] == 5) {
                    this.field1622 = true;
                }
            }
        }
        if (var4.field2423 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1614 = var7;
        this.field1618 = new int[var7];
        this.field1620 = new int[var7];
        this.field1617 = new int[var7];
        this.field1613 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1618[var12] = field1619[var12];
            this.field1620[var12] = field1612[var12];
            this.field1617[var12] = field1621[var12];
            this.field1613[var12] = field1615[var12];
        }
    }
}
