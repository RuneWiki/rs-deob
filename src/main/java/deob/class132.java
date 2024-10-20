package deob;

@ObfuscatedName("ey")
public class class132 {

    @ObfuscatedName("ey.p")
    public static int[] field1888 = new int[500];

    @ObfuscatedName("ey.m")
    public static int[] field1894 = new int[500];

    @ObfuscatedName("ey.e")
    public static int[] field1890 = new int[500];

    @ObfuscatedName("ey.t")
    public static int[] field1887 = new int[500];

    @ObfuscatedName("ey.w")
    public class139 field1891 = null;

    @ObfuscatedName("ey.z")
    public int field1892 = -1;

    @ObfuscatedName("ey.j")
    public int[] field1895;

    @ObfuscatedName("ey.i")
    public int[] field1893;

    @ObfuscatedName("ey.f")
    public int[] field1889;

    @ObfuscatedName("ey.c")
    public int[] field1896;

    @ObfuscatedName("ey.o")
    public boolean field1897 = false;

    public class132(byte[] arg0, class139 arg1) {
        this.field1891 = arg1;
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        var3.field2408 = 2;
        int var5 = var3.method2810();
        int var6 = -1;
        int var7 = 0;
        var4.field2408 = var3.field2408 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2810();
            if (var9 > 0) {
                if (this.field1891.field2051[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1891.field2051[var10] == 0) {
                            field1888[var7] = var10;
                            field1894[var7] = 0;
                            field1890[var7] = 0;
                            field1887[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1888[var7] = var8;
                short var11 = 0;
                if (this.field1891.field2051[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1894[var7] = var11;
                } else {
                    field1894[var7] = var4.method2922();
                }
                if ((var9 & 0x2) == 0) {
                    field1890[var7] = var11;
                } else {
                    field1890[var7] = var4.method2922();
                }
                if ((var9 & 0x4) == 0) {
                    field1887[var7] = var11;
                } else {
                    field1887[var7] = var4.method2922();
                }
                var6 = var8;
                var7++;
                if (this.field1891.field2051[var8] == 5) {
                    this.field1897 = true;
                }
            }
        }
        if (var4.field2408 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1892 = var7;
        this.field1895 = new int[var7];
        this.field1893 = new int[var7];
        this.field1889 = new int[var7];
        this.field1896 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1895[var12] = field1888[var12];
            this.field1893[var12] = field1894[var12];
            this.field1889[var12] = field1890[var12];
            this.field1896[var12] = field1887[var12];
        }
    }
}
