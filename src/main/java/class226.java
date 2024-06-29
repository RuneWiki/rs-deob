import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class226 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Lli;")
    public static class185 field4128 = class245.method1649(" steht bereits auf Ihrer Freunde)2Liste(Q", -41);

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lli;")
    public static class185 field4132 = class245.method1649("Gestionnaire de saisie charg-B", -82);

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lli;")
    private static class185 field4130 = class245.method1649("Loaded update list", 123);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "[Z")
    public static boolean[] field4127 = new boolean[100];

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lli;")
    public static class185 field4134 = field4130;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static void method1562(boolean arg0) {
        field4127 = null;
        field4130 = null;
        field4134 = null;
        field4128 = null;
        if (arg0) {
            field4130 = null;
        }
        field4132 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
    public static final void method1563(int arg0, int arg1) {
        field4133++;
        if (arg1 == -1 || !class27.field461[arg1]) {
            return;
        }
        class142.field2725.method1682(arg0, arg1);
        if (class136.field2557[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class136.field2557[arg1].length; var3++) {
            if (class136.field2557[arg1][var3] != null) {
                if (class136.field2557[arg1][var3].field1612 == 2) {
                    var2 = false;
                } else {
                    class136.field2557[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class136.field2557[arg1] = null;
        }
        class27.field461[arg1] = false;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static final void method1564(int arg0) {
        field4131++;
        for (class128 var1 = (class128) class203.field3721.method1375(16259); var1 != null; var1 = (class128) class203.field3721.method1377(-19546)) {
            class111 var2 = var1.field2285;
            if (class265.field4703 != var2.field2003 || var2.field2000 < class211.field3851) {
                var1.method476(-97);
            } else if (var2.field2018 <= class211.field3851) {
                if (var2.field2020 > 0) {
                    class71 var3 = class87.field1712[var2.field2020 - 1];
                    if (var3 != null && var3.field2694 >= 0 && var3.field2694 < 13312 && var3.field2687 >= 0 && var3.field2687 < 13312) {
                        var2.method777(var3.field2687, var3.field2694, class211.field3851, class236.method1606(100, var3.field2687, var3.field2694, var2.field2003) - var2.field1982, -5493);
                    }
                }
                if (var2.field2020 < 0) {
                    int var4 = -var2.field2020 - 1;
                    class188 var5;
                    if (class249.field4421 == var4) {
                        var5 = class241.field4310;
                    } else {
                        var5 = class93.field1774[var4];
                    }
                    if (var5 != null && var5.field2694 >= 0 && var5.field2694 < 13312 && var5.field2687 >= 0 && var5.field2687 < 13312) {
                        var2.method777(var5.field2687, var5.field2694, class211.field3851, class236.method1606(51, var5.field2687, var5.field2694, var2.field2003) - var2.field1982, arg0 ^ 0xFFFFE14F);
                    }
                }
                var2.method776(class224.field4111, 2047);
                class136.method977(class265.field4703, (int) var2.field1995, (int) var2.field2015, (int) var2.field2008, 60, var2, var2.field1985, -1L, false);
            }
        }
        if (arg0 != 3012) {
            method1565(84, -36, 126);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
    public static final void method1565(int arg0, int arg1, int arg2) {
        field4126++;
        if (class205.field3767 > 0) {
            class266.method1814(false, class205.field3767);
            class205.field3767 = 0;
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = 0;
        int var6 = class159.field3009 * arg0;
        if (arg2 > -120) {
            method1562(true);
        }
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class194.field3576[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class60.field1085[var4++];
                int var12 = class159.field3015[var6++ + arg1];
                if (var11 == 0) {
                    class19.field302.field1846[var5++] = var12;
                } else {
                    int var13 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 256 - var11 - 18;
                    int var15 = class27.field454[var11];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class19.field302.field1846[var5++] = class220.method1526(16711680, class220.method1526(var15, 65280) * var13 + (var14 * class220.method1526(65280, var12))) + class220.method1526(-16711936, class220.method1526(16711935, var15) * var13 + (var14 * class220.method1526(var12, 16711935))) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class19.field302.field1846[var5++] = class159.field3015[var6++ + arg1];
            }
            var6 += class159.field3009 - 128;
        }
        class19.field302.method699(arg1, arg0);
    }
}
