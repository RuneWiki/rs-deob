package deob;

@ObfuscatedName("em")
public class class132 {

    @ObfuscatedName("em.n")
    public static int[] field1907 = new int[500];

    @ObfuscatedName("em.p")
    public static int[] field1898 = new int[500];

    @ObfuscatedName("em.i")
    public static int[] field1899 = new int[500];

    @ObfuscatedName("em.j")
    public static int[] field1905 = new int[500];

    @ObfuscatedName("em.f")
    public class139 field1901 = null;

    @ObfuscatedName("em.m")
    public int field1902 = -1;

    @ObfuscatedName("em.c")
    public int[] field1903;

    @ObfuscatedName("em.z")
    public int[] field1897;

    @ObfuscatedName("em.h")
    public int[] field1904;

    @ObfuscatedName("em.g")
    public int[] field1900;

    @ObfuscatedName("em.e")
    public boolean field1906 = false;

    public class132(byte[] arg0, class139 arg1) {
        this.field1901 = arg1;
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        var3.field2400 = 2;
        int var5 = var3.method2925();
        int var6 = -1;
        int var7 = 0;
        var4.field2400 = var3.field2400 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2925();
            if (var9 > 0) {
                if (this.field1901.field2056[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1901.field2056[var10] == 0) {
                            field1907[var7] = var10;
                            field1898[var7] = 0;
                            field1899[var7] = 0;
                            field1905[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1907[var7] = var8;
                short var11 = 0;
                if (this.field1901.field2056[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1898[var7] = var11;
                } else {
                    field1898[var7] = var4.method2967();
                }
                if ((var9 & 0x2) == 0) {
                    field1899[var7] = var11;
                } else {
                    field1899[var7] = var4.method2967();
                }
                if ((var9 & 0x4) == 0) {
                    field1905[var7] = var11;
                } else {
                    field1905[var7] = var4.method2967();
                }
                var6 = var8;
                var7++;
                if (this.field1901.field2056[var8] == 5) {
                    this.field1906 = true;
                }
            }
        }
        if (var4.field2400 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1902 = var7;
        this.field1903 = new int[var7];
        this.field1897 = new int[var7];
        this.field1904 = new int[var7];
        this.field1900 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1903[var12] = field1907[var12];
            this.field1897[var12] = field1898[var12];
            this.field1904[var12] = field1899[var12];
            this.field1900[var12] = field1905[var12];
        }
    }
}
