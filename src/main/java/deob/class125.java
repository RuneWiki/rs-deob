package deob;

@ObfuscatedName("dm")
public class class125 {

    @ObfuscatedName("dm.a")
    public static int[] field1630 = new int[500];

    @ObfuscatedName("dm.s")
    public static int[] field1628 = new int[500];

    @ObfuscatedName("dm.g")
    public static int[] field1629 = new int[500];

    @ObfuscatedName("dm.x")
    public static int[] field1636 = new int[500];

    @ObfuscatedName("dm.h")
    public class132 field1631 = null;

    @ObfuscatedName("dm.f")
    public int field1632 = -1;

    @ObfuscatedName("dm.p")
    public int[] field1633;

    @ObfuscatedName("dm.m")
    public int[] field1634;

    @ObfuscatedName("dm.q")
    public int[] field1635;

    @ObfuscatedName("dm.b")
    public int[] field1627;

    @ObfuscatedName("dm.n")
    public boolean field1637 = false;

    public class125(byte[] arg0, class132 arg1) {
        this.field1631 = arg1;
        class190 var3 = new class190(arg0);
        class190 var4 = new class190(arg0);
        var3.field2419 = 2;
        int var5 = var3.method3443();
        int var6 = -1;
        int var7 = 0;
        var4.field2419 = var3.field2419 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method3443();
            if (var9 > 0) {
                if (this.field1631.field1792[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1631.field1792[var10] == 0) {
                            field1630[var7] = var10;
                            field1628[var7] = 0;
                            field1629[var7] = 0;
                            field1636[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1630[var7] = var8;
                short var11 = 0;
                if (this.field1631.field1792[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1628[var7] = var11;
                } else {
                    field1628[var7] = var4.method3468();
                }
                if ((var9 & 0x2) == 0) {
                    field1629[var7] = var11;
                } else {
                    field1629[var7] = var4.method3468();
                }
                if ((var9 & 0x4) == 0) {
                    field1636[var7] = var11;
                } else {
                    field1636[var7] = var4.method3468();
                }
                var6 = var8;
                var7++;
                if (this.field1631.field1792[var8] == 5) {
                    this.field1637 = true;
                }
            }
        }
        if (var4.field2419 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1632 = var7;
        this.field1633 = new int[var7];
        this.field1634 = new int[var7];
        this.field1635 = new int[var7];
        this.field1627 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1633[var12] = field1630[var12];
            this.field1634[var12] = field1628[var12];
            this.field1635[var12] = field1629[var12];
            this.field1627[var12] = field1636[var12];
        }
    }
}
