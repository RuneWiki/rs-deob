package deob;

@ObfuscatedName("el")
public class class132 {

    @ObfuscatedName("el.w")
    public static int[] field1905 = new int[500];

    @ObfuscatedName("el.o")
    public static int[] field1898 = new int[500];

    @ObfuscatedName("el.x")
    public static int[] field1899 = new int[500];

    @ObfuscatedName("el.k")
    public static int[] field1900 = new int[500];

    @ObfuscatedName("el.f")
    public class139 field1901 = null;

    @ObfuscatedName("el.i")
    public int field1902 = -1;

    @ObfuscatedName("el.j")
    public int[] field1903;

    @ObfuscatedName("el.m")
    public int[] field1897;

    @ObfuscatedName("el.u")
    public int[] field1904;

    @ObfuscatedName("el.r")
    public int[] field1906;

    @ObfuscatedName("el.v")
    public boolean field1907 = false;

    public class132(byte[] arg0, class139 arg1) {
        this.field1901 = arg1;
        class177 var3 = new class177(arg0);
        class177 var4 = new class177(arg0);
        var3.field2412 = 2;
        int var5 = var3.method2931();
        int var6 = -1;
        int var7 = 0;
        var4.field2412 = var3.field2412 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2931();
            if (var9 > 0) {
                if (this.field1901.field2057[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1901.field2057[var10] == 0) {
                            field1905[var7] = var10;
                            field1898[var7] = 0;
                            field1899[var7] = 0;
                            field1900[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1905[var7] = var8;
                short var11 = 0;
                if (this.field1901.field2057[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1898[var7] = var11;
                } else {
                    field1898[var7] = var4.method2896();
                }
                if ((var9 & 0x2) == 0) {
                    field1899[var7] = var11;
                } else {
                    field1899[var7] = var4.method2896();
                }
                if ((var9 & 0x4) == 0) {
                    field1900[var7] = var11;
                } else {
                    field1900[var7] = var4.method2896();
                }
                var6 = var8;
                var7++;
                if (this.field1901.field2057[var8] == 5) {
                    this.field1907 = true;
                }
            }
        }
        if (var4.field2412 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1902 = var7;
        this.field1903 = new int[var7];
        this.field1897 = new int[var7];
        this.field1904 = new int[var7];
        this.field1906 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1903[var12] = field1905[var12];
            this.field1897[var12] = field1898[var12];
            this.field1904[var12] = field1899[var12];
            this.field1906[var12] = field1900[var12];
        }
    }
}
