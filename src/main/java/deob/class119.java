package deob;

@ObfuscatedName("di")
public class class119 {

    @ObfuscatedName("di.n")
    public static int[][] field1846 = new int[128][128];

    @ObfuscatedName("di.q")
    public static int[][] field1844 = new int[128][128];

    @ObfuscatedName("di.z")
    public static int[] field1847 = new int[4096];

    @ObfuscatedName("di.l")
    public static int[] field1848 = new int[4096];

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.d(IILda;Ldj;B)Z")
    public static final boolean method735(int arg0, int arg1, class120 arg2, class118 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field1846[var6][var7] = 99;
        field1844[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field1847[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field1848[var10001] = arg1;
        int[][] var12 = arg3.field1838;
        while (var18 != var11) {
            var4 = field1847[var11];
            var5 = field1848[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field1834;
            int var16 = var5 - arg3.field1840;
            if (arg2.method225(1, var4, var5, arg3)) {
                Statics.field1845 = var4;
                Statics.field1843 = var5;
                return true;
            }
            int var17 = field1844[var13][var14] + 1;
            if (var13 > 0 && field1846[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0) {
                field1847[var18] = var4 - 1;
                field1848[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field1846[var13 - 1][var14] = 2;
                field1844[var13 - 1][var14] = var17;
            }
            if (var13 < 127 && field1846[var13 + 1][var14] == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0) {
                field1847[var18] = var4 + 1;
                field1848[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field1846[var13 + 1][var14] = 8;
                field1844[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field1846[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field1847[var18] = var4;
                field1848[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1846[var13][var14 - 1] = 1;
                field1844[var13][var14 - 1] = var17;
            }
            if (var14 < 127 && field1846[var13][var14 + 1] == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field1847[var18] = var4;
                field1848[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1846[var13][var14 + 1] = 4;
                field1844[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field1846[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field1847[var18] = var4 - 1;
                field1848[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1846[var13 - 1][var14 - 1] = 3;
                field1844[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 127 && var14 > 0 && field1846[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field1847[var18] = var4 + 1;
                field1848[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1846[var13 + 1][var14 - 1] = 9;
                field1844[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 127 && field1846[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field1847[var18] = var4 - 1;
                field1848[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1846[var13 - 1][var14 + 1] = 6;
                field1844[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 127 && var14 < 127 && field1846[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 1] & 0x12401E0) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field1847[var18] = var4 + 1;
                field1848[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1846[var13 + 1][var14 + 1] = 12;
                field1844[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field1845 = var4;
        Statics.field1843 = var5;
        return false;
    }

    @ObfuscatedName("ab.c(IILda;Ldj;I)Z")
    public static final boolean method797(int arg0, int arg1, class120 arg2, class118 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field1846[var6][var7] = 99;
        field1844[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field1847[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field1848[var10001] = arg1;
        int[][] var12 = arg3.field1838;
        while (var18 != var11) {
            var4 = field1847[var11];
            var5 = field1848[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field1834;
            int var16 = var5 - arg3.field1840;
            if (arg2.method225(2, var4, var5, arg3)) {
                Statics.field1845 = var4;
                Statics.field1843 = var5;
                return true;
            }
            int var17 = field1844[var13][var14] + 1;
            if (var13 > 0 && field1846[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x124010E) == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0) {
                field1847[var18] = var4 - 1;
                field1848[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field1846[var13 - 1][var14] = 2;
                field1844[var13 - 1][var14] = var17;
            }
            if (var13 < 126 && field1846[var13 + 1][var14] == 0 && (var12[var15 + 2][var16] & 0x1240183) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E0) == 0) {
                field1847[var18] = var4 + 1;
                field1848[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field1846[var13 + 1][var14] = 8;
                field1844[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field1846[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x124010E) == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0) {
                field1847[var18] = var4;
                field1848[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1846[var13][var14 - 1] = 1;
                field1844[var13][var14 - 1] = var17;
            }
            if (var14 < 126 && field1846[var13][var14 + 1] == 0 && (var12[var15][var16 + 2] & 0x1240138) == 0 && (var12[var15 + 1][var16 + 2] & 0x12401E0) == 0) {
                field1847[var18] = var4;
                field1848[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1846[var13][var14 + 1] = 4;
                field1844[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field1846[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16] & 0x124013E) == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15][var16 - 1] & 0x124018F) == 0) {
                field1847[var18] = var4 - 1;
                field1848[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1846[var13 - 1][var14 - 1] = 3;
                field1844[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 126 && var14 > 0 && field1846[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x124018F) == 0 && (var12[var15 + 2][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 2][var16] & 0x12401E3) == 0) {
                field1847[var18] = var4 + 1;
                field1848[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1846[var13 + 1][var14 - 1] = 9;
                field1844[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 126 && field1846[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x124013E) == 0 && (var12[var15 - 1][var16 + 2] & 0x1240138) == 0 && (var12[var15][var16 + 2] & 0x12401F8) == 0) {
                field1847[var18] = var4 - 1;
                field1848[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1846[var13 - 1][var14 + 1] = 6;
                field1844[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 126 && var14 < 126 && field1846[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 2] & 0x12401F8) == 0 && (var12[var15 + 2][var16 + 2] & 0x12401E0) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E3) == 0) {
                field1847[var18] = var4 + 1;
                field1848[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1846[var13 + 1][var14 + 1] = 12;
                field1844[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field1845 = var4;
        Statics.field1843 = var5;
        return false;
    }
}
