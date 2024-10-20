package deob;

@ObfuscatedName("dg")
public class class126 {

    @ObfuscatedName("dg.u")
    public static int[] field1635 = new int[500];

    @ObfuscatedName("dg.f")
    public static int[] field1627 = new int[500];

    @ObfuscatedName("dg.b")
    public static int[] field1628 = new int[500];

    @ObfuscatedName("dg.g")
    public static int[] field1632 = new int[500];

    @ObfuscatedName("dg.z")
    public class133 field1630 = null;

    @ObfuscatedName("dg.p")
    public int field1631 = -1;

    @ObfuscatedName("dg.h")
    public int[] field1626;

    @ObfuscatedName("dg.y")
    public int[] field1633;

    @ObfuscatedName("dg.w")
    public int[] field1634;

    @ObfuscatedName("dg.i")
    public int[] field1636;

    @ObfuscatedName("dg.k")
    public boolean field1629 = false;

    public class126(byte[] arg0, class133 arg1) {
        this.field1630 = arg1;
        class300 var3 = new class300(arg0);
        class300 var4 = new class300(arg0);
        var3.field3707 = 2;
        int var5 = var3.method5138();
        int var6 = -1;
        int var7 = 0;
        var4.field3707 = var3.field3707 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method5138();
            if (var9 > 0) {
                if (this.field1630.field1787[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1630.field1787[var10] == 0) {
                            field1635[var7] = var10;
                            field1627[var7] = 0;
                            field1628[var7] = 0;
                            field1632[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1635[var7] = var8;
                short var11 = 0;
                if (this.field1630.field1787[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1627[var7] = var11;
                } else {
                    field1627[var7] = var4.method5151();
                }
                if ((var9 & 0x2) == 0) {
                    field1628[var7] = var11;
                } else {
                    field1628[var7] = var4.method5151();
                }
                if ((var9 & 0x4) == 0) {
                    field1632[var7] = var11;
                } else {
                    field1632[var7] = var4.method5151();
                }
                var6 = var8;
                var7++;
                if (this.field1630.field1787[var8] == 5) {
                    this.field1629 = true;
                }
            }
        }
        if (var4.field3707 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1631 = var7;
        this.field1626 = new int[var7];
        this.field1633 = new int[var7];
        this.field1634 = new int[var7];
        this.field1636 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1626[var12] = field1635[var12];
            this.field1633[var12] = field1627[var12];
            this.field1634[var12] = field1628[var12];
            this.field1636[var12] = field1632[var12];
        }
    }
}
