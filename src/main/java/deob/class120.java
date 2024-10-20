package deob;

@ObfuscatedName("dn")
public class class120 {

    @ObfuscatedName("dn.c")
    public static int[] field1617 = new int[500];

    @ObfuscatedName("dn.q")
    public static int[] field1612 = new int[500];

    @ObfuscatedName("dn.m")
    public static int[] field1620 = new int[500];

    @ObfuscatedName("dn.j")
    public static int[] field1614 = new int[500];

    @ObfuscatedName("dn.g")
    public class127 field1611 = null;

    @ObfuscatedName("dn.i")
    public int field1616 = -1;

    @ObfuscatedName("dn.h")
    public int[] field1613;

    @ObfuscatedName("dn.l")
    public int[] field1618;

    @ObfuscatedName("dn.d")
    public int[] field1619;

    @ObfuscatedName("dn.o")
    public int[] field1615;

    @ObfuscatedName("dn.s")
    public boolean field1621 = false;

    public class120(byte[] arg0, class127 arg1) {
        this.field1611 = arg1;
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        var3.field2386 = 2;
        int var5 = var3.method3243();
        int var6 = -1;
        int var7 = 0;
        var4.field2386 = var3.field2386 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3243();
            if (var9 > 0) {
                if (this.field1611.field1781[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1611.field1781[var10] == 0) {
                            field1617[var7] = var10;
                            field1612[var7] = 0;
                            field1620[var7] = 0;
                            field1614[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1617[var7] = var8;
                short var11 = 0;
                if (this.field1611.field1781[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1612[var7] = var11;
                } else {
                    field1612[var7] = var4.method3272();
                }
                if ((var9 & 0x2) == 0) {
                    field1620[var7] = var11;
                } else {
                    field1620[var7] = var4.method3272();
                }
                if ((var9 & 0x4) == 0) {
                    field1614[var7] = var11;
                } else {
                    field1614[var7] = var4.method3272();
                }
                var6 = var8;
                var7++;
                if (this.field1611.field1781[var8] == 5) {
                    this.field1621 = true;
                }
            }
        }
        if (var4.field2386 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1616 = var7;
        this.field1613 = new int[var7];
        this.field1618 = new int[var7];
        this.field1619 = new int[var7];
        this.field1615 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1613[var12] = field1617[var12];
            this.field1618[var12] = field1612[var12];
            this.field1619[var12] = field1620[var12];
            this.field1615[var12] = field1614[var12];
        }
    }
}
