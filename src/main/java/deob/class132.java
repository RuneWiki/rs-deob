package deob;

@ObfuscatedName("el")
public class class132 {

    @ObfuscatedName("el.s")
    public static int[] field1894 = new int[500];

    @ObfuscatedName("el.c")
    public static int[] field1893 = new int[500];

    @ObfuscatedName("el.f")
    public static int[] field1890 = new int[500];

    @ObfuscatedName("el.m")
    public static int[] field1891 = new int[500];

    @ObfuscatedName("el.h")
    public class139 field1889 = null;

    @ObfuscatedName("el.t")
    public int field1897 = -1;

    @ObfuscatedName("el.p")
    public int[] field1892;

    @ObfuscatedName("el.d")
    public int[] field1895;

    @ObfuscatedName("el.n")
    public int[] field1896;

    @ObfuscatedName("el.z")
    public int[] field1888;

    @ObfuscatedName("el.o")
    public boolean field1898 = false;

    public class132(byte[] arg0, class139 arg1) {
        this.field1889 = arg1;
        class177 var3 = new class177(arg0);
        class177 var4 = new class177(arg0);
        var3.field2402 = 2;
        int var5 = var3.method2965();
        int var6 = -1;
        int var7 = 0;
        var4.field2402 = var3.field2402 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2965();
            if (var9 > 0) {
                if (this.field1889.field2047[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1889.field2047[var10] == 0) {
                            field1894[var7] = var10;
                            field1893[var7] = 0;
                            field1890[var7] = 0;
                            field1891[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1894[var7] = var8;
                short var11 = 0;
                if (this.field1889.field2047[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1893[var7] = var11;
                } else {
                    field1893[var7] = var4.method3124();
                }
                if ((var9 & 0x2) == 0) {
                    field1890[var7] = var11;
                } else {
                    field1890[var7] = var4.method3124();
                }
                if ((var9 & 0x4) == 0) {
                    field1891[var7] = var11;
                } else {
                    field1891[var7] = var4.method3124();
                }
                var6 = var8;
                var7++;
                if (this.field1889.field2047[var8] == 5) {
                    this.field1898 = true;
                }
            }
        }
        if (var4.field2402 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1897 = var7;
        this.field1892 = new int[var7];
        this.field1895 = new int[var7];
        this.field1896 = new int[var7];
        this.field1888 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1892[var12] = field1894[var12];
            this.field1895[var12] = field1893[var12];
            this.field1896[var12] = field1890[var12];
            this.field1888[var12] = field1891[var12];
        }
    }
}
