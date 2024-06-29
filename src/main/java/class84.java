import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class84 {

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field1931 = 0;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Ldd;")
    public static class35 field1927 = class180.method1196((byte) 126, "Clientscript error in: ");

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Ldd;")
    public static class35 field1925 = class180.method1196((byte) -114, "<col=00ff00>");

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Ldd;")
    public static class35 field1926 = class180.method1196((byte) 126, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Ldd;")
    public static class35 field1928 = class180.method1196((byte) 126, "Lade)3)3)3");

    @OriginalMember(owner = "client!id", name = "i", descriptor = "J")
    public static long field1930 = 0L;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public int field1924;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public int field1933;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public int field1934;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public int field1935;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Ldd;")
    public class35 field1936;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Z")
    public boolean field1922;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "[Lbg;")
    public static class18[] field1923;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILag;Lag;Lag;Lag;)V")
    public static final void method629(int arg0, class8 arg1, class8 arg2, class8 arg3, class8 arg4) {
        class95.field2088 = arg1;
        class69.field1674 = arg3;
        class121.field2666 = arg2;
        class148.field3116 = arg4;
        class163.field3299 = new class55[class69.field1674.method44(-118)][];
        if (arg0 <= 2) {
            field1925 = null;
        }
        field1929++;
        class52.field1192 = new boolean[class69.field1674.method44(-108)];
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V")
    public static final void method630(byte arg0, int arg1) {
        if (arg0 != 11) {
            method631(60);
        }
        field1937++;
        class17.field343 = arg1;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method631(int arg0) {
        field1927 = null;
        if (arg0 == 32) {
            field1926 = null;
            field1928 = null;
            field1923 = null;
            field1925 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILfd;II)V")
    public static final void method632(int arg0, int arg1, class55 arg2, int arg3, int arg4) {
        int var5 = -23 / ((arg0 - 32) / 49);
        field1932++;
        class145.method993(true);
        class140.method958(arg1, arg3, arg2.field1249 + arg1, arg3 - -arg2.field1329);
        if (class34.field702 == 2 || class34.field702 == 5) {
            class140.method971(arg1, arg3, 0, arg2.field1388, arg2.field1378);
        } else {
            int var6 = class71.field1704.field1664 / 32 + 48;
            int var7 = 464 - class71.field1704.field1676 / 32;
            int var8 = class90.field2003 + class2.field40 & 0x7FF;
            class174.field3556.method105(arg1, arg3, arg2.field1249, arg2.field1329, var6, var7, var8, class67.field1561 + 256, arg2.field1388, arg2.field1378);
            for (int var9 = 0; var9 < class101.field2228; var9++) {
                int var42 = class15.field272[var9] * 4 + 2 - class71.field1704.field1664 / 32;
                int var43 = class24.field486[var9] * 4 + 2 - class71.field1704.field1676 / 32;
                class138.method941(2, arg2, arg1, class31.field658[var9], var43, arg3, var42);
            }
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var38 = 0; var38 < 104; var38++) {
                    class187 var39 = class145.field3074[class175.field3585][var10][var38];
                    if (var39 != null) {
                        int var40 = var38 * 4 + 2 - class71.field1704.field1676 / 32;
                        int var41 = var10 * 4 + 2 - class71.field1704.field1664 / 32;
                        class138.method941(2, arg2, arg1, class43.field953[0], var40, arg3, var41);
                    }
                }
            }
            for (int var11 = 0; var11 < class83.field1921; var11++) {
                class19 var34 = class204.field4058[class73.field1738[var11]];
                if (var34 != null && var34.method169((byte) -46)) {
                    class182 var35 = var34.field377;
                    if (var35 != null && var35.field3719 != null) {
                        var35 = var35.method1211(103);
                    }
                    if (var35 != null && var35.field3744 && var35.field3733) {
                        int var36 = var34.field1664 / 32 - class71.field1704.field1664 / 32;
                        int var37 = var34.field1676 / 32 - class71.field1704.field1676 / 32;
                        class138.method941(2, arg2, arg1, class43.field953[1], var37, arg3, var36);
                    }
                }
            }
            for (int var12 = 0; var12 < class72.field1714; var12++) {
                class102 var26 = class51.field1154[class35.field748[var12]];
                if (var26 != null && var26.method169((byte) -47)) {
                    int var27 = var26.field1676 / 32 - class71.field1704.field1676 / 32;
                    boolean var28 = false;
                    int var29 = var26.field1664 / 32 - class71.field1704.field1664 / 32;
                    long var30 = var26.field2254.method321(21830);
                    for (int var32 = 0; var32 < class25.field505; var32++) {
                        if (class167.field3373[var32] == var30 && class181.field3691[var32] != 0) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var33 = false;
                    if (class71.field1704.field2283 != 0 && var26.field2283 != 0 && class71.field1704.field2283 == var26.field2283) {
                        var33 = true;
                    }
                    if (var28) {
                        class138.method941(2, arg2, arg1, class43.field953[3], var27, arg3, var29);
                    } else if (var33) {
                        class138.method941(2, arg2, arg1, class43.field953[4], var27, arg3, var29);
                    } else {
                        class138.method941(2, arg2, arg1, class43.field953[2], var27, arg3, var29);
                    }
                }
            }
            class89[] var13 = class162.field3297;
            for (int var14 = 0; var14 < var13.length; var14++) {
                class89 var17 = var13[var14];
                if (var17 != null && var17.field1994 != 0 && class89.field1988 % 20 < 10) {
                    if (var17.field1994 == 1 && var17.field1984 >= 0 && var17.field1984 < class204.field4058.length) {
                        class19 var18 = class204.field4058[var17.field1984];
                        if (var18 != null) {
                            int var19 = var18.field1664 / 32 - class71.field1704.field1664 / 32;
                            int var20 = var18.field1676 / 32 - class71.field1704.field1676 / 32;
                            class110.method806(4152, arg3, var20, var19, arg1, var17.field1981, arg2);
                        }
                    }
                    if (var17.field1994 == 2) {
                        int var21 = (var17.field1991 - class172.field3444) * 4 + 2 - class71.field1704.field1664 / 32;
                        int var22 = (var17.field1987 - class67.field1552) * 4 + 2 - class71.field1704.field1676 / 32;
                        class110.method806(4152, arg3, var22, var21, arg1, var17.field1981, arg2);
                    }
                    if (var17.field1994 == 10 && var17.field1984 >= 0 && class51.field1154.length > var17.field1984) {
                        class102 var23 = class51.field1154[var17.field1984];
                        if (var23 != null) {
                            int var24 = var23.field1664 / 32 - class71.field1704.field1664 / 32;
                            int var25 = var23.field1676 / 32 - class71.field1704.field1676 / 32;
                            class110.method806(4152, arg3, var25, var24, arg1, var17.field1981, arg2);
                        }
                    }
                }
            }
            if (class55.field1352 != 0) {
                int var15 = class79.field1858 * 4 + 2 - class71.field1704.field1676 / 32;
                int var16 = class55.field1352 * 4 + 2 - class71.field1704.field1664 / 32;
                class138.method941(2, arg2, arg1, class97.field2154, var15, arg3, var16);
            }
            class140.method970(arg2.field1249 / 2 + arg1 - 1, arg2.field1329 / 2 + -1 + arg3, 3, 3, 16777215);
        }
        class32.field680[arg4] = true;
    }
}
