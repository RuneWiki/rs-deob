import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class124 {

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "[I")
    public static int[] field1853 = new int[25];

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public int field1854;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Ldl;")
    public static class123 field1855;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Ljava/lang/String;")
    public String field1851;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static final void method839(byte arg0) {
        while (true) {
            if (class235.field3766.method889(class179.field2793, -96) >= 11) {
                int var1 = class235.field3766.method887(true, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class153.field2277[var1] == null) {
                        class153.field2277[var1] = new class186();
                        var2 = true;
                        if (class231.field3724[var1] != null) {
                            class153.field2277[var1].method1293(class231.field3724[var1], 0);
                        }
                    }
                    class8.field117[class73.field1040++] = var1;
                    class186 var3 = class153.field2277[var1];
                    var3.field1210 = class111.field1684;
                    int var4 = class235.field3766.method887(true, 5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class235.field3766.method887(true, 1);
                    if (var5 == 1) {
                        class84.field1316[class164.field2553++] = var1;
                    }
                    int var6 = class3.field36[class235.field3766.method887(true, 3)];
                    if (var2) {
                        var3.field1211 = var3.field1222 = var6;
                    }
                    int var7 = class235.field3766.method887(true, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class235.field3766.method887(true, 1);
                    var3.method1295(class149.field2227.field1257[0] + var4, 768, class149.field2227.field1272[0] + var7, var8 == 1);
                    continue;
                }
            }
            field1856++;
            if (arg0 < 101) {
                return;
            }
            class235.field3766.method888((byte) 30);
            return;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static final void method840(int arg0) {
        if (arg0 != 1) {
            field1855 = null;
        }
        field1850++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class245.field3920 - 1); var2++) {
                if (class2.field21[var2] < 1000 && class2.field21[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class19.field225[var2];
                    class19.field225[var2] = class19.field225[var2 + 1];
                    class19.field225[var2 + 1] = var3;
                    String var4 = class96.field1491[var2];
                    class96.field1491[var2] = class96.field1491[var2 + 1];
                    class96.field1491[var2 + 1] = var4;
                    int var5 = class100.field1553[var2];
                    class100.field1553[var2] = class100.field1553[var2 + 1];
                    class100.field1553[var2 + 1] = var5;
                    int var6 = class222.field3591[var2];
                    class222.field3591[var2] = class222.field3591[var2 + 1];
                    class222.field3591[var2 + 1] = var6;
                    int var7 = client.field2330[var2];
                    client.field2330[var2] = client.field2330[var2 + 1];
                    client.field2330[var2 + 1] = var7;
                    short var8 = class2.field21[var2];
                    class2.field21[var2] = class2.field21[var2 + 1];
                    class2.field21[var2 + 1] = var8;
                    long var9 = class25.field347[var2];
                    class25.field347[var2] = class25.field347[var2 + 1];
                    class25.field347[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public static void method841(byte arg0) {
        field1855 = null;
        field1853 = null;
        if (arg0 <= 91) {
            field1853 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lma;IZ)V")
    public static final void method842(class188 arg0, int arg1, boolean arg2) {
        field1848++;
        if (arg2) {
            int var3 = class98.field1510;
            int var4 = var3 * 956 / 503;
            class121.field1758.method91((class135.field1960 - var4) / 2, 0, var4, var3);
            class66.field915.method106(class135.field1960 / 2 - (class66.field915.field2148 / 2), 18);
        }
        arg0.method1315(class62.field855, class135.field1960 / 2, class98.field1510 / 2 - 26, 16777215, -1);
        int var5 = class98.field1510 / 2 - 18;
        class127.method855(class135.field1960 / 2 - 152, var5, 304, 34, 9179409);
        class127.method855(class135.field1960 / 2 - 151, var5 - -1, 302, 32, 0);
        if (arg1 != 7772) {
            field1853 = null;
        }
        class127.method876(class135.field1960 / 2 - 150, var5 + 2, class115.field1697 * 3, 30, 9179409);
        class127.method876(class135.field1960 / 2 + (class115.field1697 * 3) - 150, var5 + 2, 300 - class115.field1697 * 3, 30, 0);
        arg0.method1315(class139.field2054, class135.field1960 / 2, class98.field1510 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
    public static final void method843(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class194.field3046; var3++) {
            for (int var4 = 0; var4 < class158.field2433; var4++) {
                for (int var5 = 0; var5 < class54.field749; var5++) {
                    class49 var6 = class90.field1382[var3][var4][var5];
                    if (var6 != null) {
                        class69 var7 = var6.field627;
                        if (var7 != null && var7.field963.method1089()) {
                            class154.method1025(var7.field963, var3, var4, var5, 1, 1);
                            if (var7.field965 != null && var7.field965.method1089()) {
                                class154.method1025(var7.field965, var3, var4, var5, 1, 1);
                                var7.field963.method1080(var7.field965, 0, 0, 0, false);
                                var7.field965 = var7.field965.method1100(arg0, arg1, arg2);
                            }
                            var7.field963 = var7.field963.method1100(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field639; var8++) {
                            class284 var10 = var6.field643[var8];
                            if (var10 != null && var10.field4500.method1089()) {
                                class154.method1025(var10.field4500, var3, var4, var5, var10.field4504 + 1 - var10.field4494, var10.field4510 - var10.field4498 + 1);
                                var10.field4500 = var10.field4500.method1100(arg0, arg1, arg2);
                            }
                        }
                        class17 var9 = var6.field635;
                        if (var9 != null && var9.field203.method1089()) {
                            class40.method315(var9.field203, var3, var4, var5);
                            var9.field203 = var9.field203.method1100(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    public static final void method844(int arg0, int arg1) {
        class49.method361((byte) -78);
        class254.method1716(false);
        field1849++;
        int var2 = class254.method1711(arg0, false).field70;
        if (var2 == 0) {
            return;
        }
        int var3 = class258.field4166[arg0];
        if (arg1 <= 47) {
            field1855 = null;
        }
        if (var2 == 6) {
            class152.field2256 = var3;
        }
        if (var2 == 5) {
            class190.field3017 = var3;
        }
        if (var2 == 9) {
            class111.field1683 = var3;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(III)Ldb;")
    public static final class17 method845(int arg0, int arg1, int arg2) {
        class49 var3 = class90.field1382[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class17 var4 = var3.field635;
            var3.field635 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lsg;I)V")
    public static final void method846(class163 arg0, int arg1) {
        if (arg1 != 5) {
            method843(100, 83, 4);
        }
        field1852++;
        class151.field2242 = arg0;
    }
}
