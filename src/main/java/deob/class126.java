package deob;

@ObfuscatedName("da")
public class class126 {

    @ObfuscatedName("da.q")
    public static int[] field1639 = new int[500];

    @ObfuscatedName("da.w")
    public static int[] field1640 = new int[500];

    @ObfuscatedName("da.e")
    public static int[] field1637 = new int[500];

    @ObfuscatedName("da.p")
    public static int[] field1636 = new int[500];

    @ObfuscatedName("da.k")
    public class133 field1635 = null;

    @ObfuscatedName("da.l")
    public int field1638 = -1;

    @ObfuscatedName("da.b")
    public int[] field1641;

    @ObfuscatedName("da.i")
    public int[] field1642;

    @ObfuscatedName("da.c")
    public int[] field1643;

    @ObfuscatedName("da.f")
    public int[] field1644;

    @ObfuscatedName("da.m")
    public boolean field1645 = false;

    public class126(byte[] arg0, class133 arg1) {
        this.field1635 = arg1;
        class301 var3 = new class301(arg0);
        class301 var4 = new class301(arg0);
        var3.field3733 = 2;
        int var5 = var3.method5077();
        int var6 = -1;
        int var7 = 0;
        var4.field3733 = var3.field3733 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method5077();
            if (var9 > 0) {
                if (this.field1635.field1799[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1635.field1799[var10] == 0) {
                            field1639[var7] = var10;
                            field1640[var7] = 0;
                            field1637[var7] = 0;
                            field1636[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1639[var7] = var8;
                short var11 = 0;
                if (this.field1635.field1799[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1640[var7] = var11;
                } else {
                    field1640[var7] = var4.method5080();
                }
                if ((var9 & 0x2) == 0) {
                    field1637[var7] = var11;
                } else {
                    field1637[var7] = var4.method5080();
                }
                if ((var9 & 0x4) == 0) {
                    field1636[var7] = var11;
                } else {
                    field1636[var7] = var4.method5080();
                }
                var6 = var8;
                var7++;
                if (this.field1635.field1799[var8] == 5) {
                    this.field1645 = true;
                }
            }
        }
        if (var4.field3733 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1638 = var7;
        this.field1641 = new int[var7];
        this.field1642 = new int[var7];
        this.field1643 = new int[var7];
        this.field1644 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1641[var12] = field1639[var12];
            this.field1642[var12] = field1640[var12];
            this.field1643[var12] = field1637[var12];
            this.field1644[var12] = field1636[var12];
        }
    }
}
