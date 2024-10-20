package deob;

@ObfuscatedName("dh")
public class class126 {

    @ObfuscatedName("dh.c")
    public static int[] field1629 = new int[500];

    @ObfuscatedName("dh.t")
    public static int[] field1622 = new int[500];

    @ObfuscatedName("dh.o")
    public static int[] field1628 = new int[500];

    @ObfuscatedName("dh.e")
    public static int[] field1624 = new int[500];

    @ObfuscatedName("dh.i")
    public class133 field1625 = null;

    @ObfuscatedName("dh.g")
    public int field1626 = -1;

    @ObfuscatedName("dh.d")
    public int[] field1627;

    @ObfuscatedName("dh.l")
    public int[] field1621;

    @ObfuscatedName("dh.j")
    public int[] field1631;

    @ObfuscatedName("dh.m")
    public int[] field1630;

    @ObfuscatedName("dh.p")
    public boolean field1623 = false;

    public class126(byte[] arg0, class133 arg1) {
        this.field1625 = arg1;
        class301 var3 = new class301(arg0);
        class301 var4 = new class301(arg0);
        var3.field3707 = 2;
        int var5 = var3.method5129();
        int var6 = -1;
        int var7 = 0;
        var4.field3707 = var3.field3707 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method5129();
            if (var9 > 0) {
                if (this.field1625.field1793[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1625.field1793[var10] == 0) {
                            field1629[var7] = var10;
                            field1622[var7] = 0;
                            field1628[var7] = 0;
                            field1624[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1629[var7] = var8;
                short var11 = 0;
                if (this.field1625.field1793[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1622[var7] = var11;
                } else {
                    field1622[var7] = var4.method5131();
                }
                if ((var9 & 0x2) == 0) {
                    field1628[var7] = var11;
                } else {
                    field1628[var7] = var4.method5131();
                }
                if ((var9 & 0x4) == 0) {
                    field1624[var7] = var11;
                } else {
                    field1624[var7] = var4.method5131();
                }
                var6 = var8;
                var7++;
                if (this.field1625.field1793[var8] == 5) {
                    this.field1623 = true;
                }
            }
        }
        if (var4.field3707 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1626 = var7;
        this.field1627 = new int[var7];
        this.field1621 = new int[var7];
        this.field1631 = new int[var7];
        this.field1630 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1627[var12] = field1629[var12];
            this.field1621[var12] = field1622[var12];
            this.field1631[var12] = field1628[var12];
            this.field1630[var12] = field1624[var12];
        }
    }
}
