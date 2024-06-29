import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class111 {

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public int field2048 = -1;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Lcd;")
    public static class64 field2050 = class44.method335((byte) 71, "::fpson");

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lmf;")
    public static class43 field2047 = new class43(64);

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Lcd;")
    private static class64 field2054 = class44.method335((byte) 71, "Mar");

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Lcd;")
    private static class64 field2056 = class44.method335((byte) 71, "Feb");

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Lcd;")
    private static class64 field2057 = class44.method335((byte) 71, "Aug");

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Lcd;")
    private static class64 field2052 = class44.method335((byte) 71, "Jul");

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Lcd;")
    private static class64 field2058 = class44.method335((byte) 71, "Dec");

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lcd;")
    private static class64 field2053 = class44.method335((byte) 71, "Jan");

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "Lcd;")
    private static class64 field2064 = class44.method335((byte) 71, "Nov");

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "Lcd;")
    private static class64 field2060 = class44.method335((byte) 71, "Oct");

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "Lcd;")
    private static class64 field2062 = class44.method335((byte) 71, "Sep");

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Lcd;")
    private static class64 field2061 = class44.method335((byte) 71, "Jun");

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "Lcd;")
    public static class64 field2067 = class44.method335((byte) 71, "<img=0>");

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "Lcd;")
    private static class64 field2070 = class44.method335((byte) 71, "May");

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "Lcd;")
    public static class64 field2069 = class44.method335((byte) 71, "Fallen lassen");

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "Lcd;")
    private static class64 field2071 = class44.method335((byte) 71, "Apr");

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "[Lcd;")
    public static class64[] field2068 = new class64[] { field2053, field2056, field2054, field2071, field2070, field2061, field2052, field2057, field2062, field2060, field2064, field2058 };

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Lrl;")
    public static class185 field2055;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "Lqg;")
    public static class231 field2066;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Lid;")
    public class248 field2045;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
    public int[] field2046;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "[Lcd;")
    public class64[] field2065;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)I", line = 26)
    public static final int method804(int arg0) {
        field2044++;
        int var1 = -61 % ((arg0 + 2) / 42);
        if ((double) class106.field1965 == 3.0D) {
            return 37;
        } else if ((double) class106.field1965 == 4.0D) {
            return 50;
        } else if ((double) class106.field1965 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)Z", line = 52)
    public static final boolean method805(boolean arg0) {
        if (!arg0) {
            field2054 = (class64) null;
        }
        field2063++;
        if (class224.field3814) {
            try {
                class197.field3377.method530(0, class228.field3876.field4845);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 73)
    public static void method806(int arg0) {
        field2060 = null;
        field2055 = null;
        field2067 = null;
        field2058 = null;
        field2070 = null;
        field2064 = null;
        field2071 = null;
        field2068 = null;
        if (arg0 != 10) {
            return;
        }
        field2052 = null;
        field2050 = null;
        field2053 = null;
        field2047 = null;
        field2061 = null;
        field2062 = null;
        field2066 = null;
        field2069 = null;
        field2057 = null;
        field2056 = null;
        field2054 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIBIII)V", line = 113)
    public static final void method807(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -33) {
            field2062 = (class64) null;
        }
        field2049++;
        if (arg4 > class201.field3444 || arg1 < class180.field3098) {
            return;
        }
        boolean var6;
        if (arg5 < class290.field4976) {
            var6 = false;
            arg5 = class290.field4976;
        } else if (class153.field2714 >= arg5) {
            var6 = true;
        } else {
            arg5 = class153.field2714;
            var6 = false;
        }
        boolean var7;
        if (arg0 < class290.field4976) {
            arg0 = class290.field4976;
            var7 = false;
        } else if (class153.field2714 >= arg0) {
            var7 = true;
        } else {
            arg0 = class153.field2714;
            var7 = false;
        }
        if (class180.field3098 <= arg4) {
            class31.method268(arg0, 120, arg5, class124.field2241[arg4++], arg3);
        } else {
            arg4 = class180.field3098;
        }
        if (arg1 <= class201.field3444) {
            class31.method268(arg0, 120, arg5, class124.field2241[arg1--], arg3);
        } else {
            arg1 = class201.field3444;
        }
        if (var6 && var7) {
            for (int var8 = arg4; var8 <= arg1; var8++) {
                int[] var9 = class124.field2241[var8];
                var9[arg5] = var9[arg0] = arg3;
            }
        } else if (var6) {
            for (int var11 = arg4; var11 <= arg1; var11++) {
                class124.field2241[var11][arg5] = arg3;
            }
        } else if (var7) {
            for (int var10 = arg4; var10 <= arg1; var10++) {
                class124.field2241[var10][arg0] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V", line = 283)
    public static final void method808(int arg0) {
        class255.method1821(false, (byte) -105);
        boolean var1 = true;
        class64.field1236 = 0;
        field2051++;
        for (int var2 = arg0; var2 < class13.field268.length; var2++) {
            if (class292.field5045[var2] != -1 && class13.field268[var2] == null) {
                class13.field268[var2] = class253.field4413.method1580(0, 0, class292.field5045[var2]);
                if (class13.field268[var2] == null) {
                    var1 = false;
                    class64.field1236++;
                }
            }
            if (class53.field864[var2] != -1 && class71.field1360[var2] == null) {
                class71.field1360[var2] = class253.field4413.method1591(0, class120.field2165[var2], class53.field864[var2], (byte) -102);
                if (class71.field1360[var2] == null) {
                    var1 = false;
                    class64.field1236++;
                }
            }
            if (class123.field2216) {
                if (class211.field3540[var2] != -1 && class97.field1768[var2] == null) {
                    class97.field1768[var2] = class253.field4413.method1580(0, 0, class211.field3540[var2]);
                    if (class97.field1768[var2] == null) {
                        class64.field1236++;
                        var1 = false;
                    }
                }
                if (class65.field1295[var2] != -1 && class134.field2384[var2] == null) {
                    class134.field2384[var2] = class253.field4413.method1580(class74.method597(arg0, 0), 0, class65.field1295[var2]);
                    if (class134.field2384[var2] == null) {
                        var1 = false;
                        class64.field1236++;
                    }
                }
            }
            if (class82.field1515 != null && class180.field3099[var2] == null && class82.field1515[var2] != -1) {
                class180.field3099[var2] = class253.field4413.method1591(0, class120.field2165[var2], class82.field1515[var2], (byte) -102);
                if (class180.field3099[var2] == null) {
                    var1 = false;
                    class64.field1236++;
                }
            }
        }
        if (class140.field2476 == null || !class114.field2096.method1596(-4, class104.method768(new class64[] { class140.field2476.field5233, class35.field572 }, false))) {
            class125.field2262 = null;
        } else if (class114.field2096.method1602(-120, class104.method768(new class64[] { class140.field2476.field5233, class35.field572 }, false))) {
            class125.field2262 = class313.method2168((byte) -113, class104.method768(new class64[] { class140.field2476.field5233, class35.field572 }, false), class114.field2096);
        } else {
            var1 = false;
            class64.field1236++;
        }
        if (!var1) {
            class28.field453 = 1;
            return;
        }
        class9.field187 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class13.field268.length; var4++) {
            byte[] var5 = class71.field1360[var4];
            if (var5 != null) {
                int var6 = (class89.field1611[var4] >> 8) * 64 - class190.field3269;
                int var7 = (class89.field1611[var4] & 0xFF) * 64 - class121.field2184;
                if (class70.field1350) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class77.method613(var6, (byte) -67, var7, var5);
            }
            if (class123.field2216) {
                byte[] var8 = class134.field2384[var4];
                if (var8 != null) {
                    int var9 = (class89.field1611[var4] >> 8) * 64 - class190.field3269;
                    int var10 = (class89.field1611[var4] & 0xFF) * 64 - class121.field2184;
                    if (class70.field1350) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class77.method613(var9, (byte) -67, var10, var8);
                }
            }
        }
        if (!var3) {
            class28.field453 = 2;
            return;
        }
        if (class28.field453 != 0) {
            class78.method617(true, class104.method768(new class64[] { class139.field2466, class229.field3889 }, false), (byte) -110);
        }
        class246.method1778(arg0 ^ 0x5);
        class70.method574(false);
        boolean var11 = false;
        if (class123.field2216 && class250.field4342) {
            for (int var12 = 0; var12 < class13.field268.length; var12++) {
                if (class134.field2384[var12] != null || class97.field1768[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class2.method11(4, 104, 104, class123.field2216 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class91.field1637[var13].method413((byte) -102);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class82.field1508[var14][var15][var16] = 0;
                }
            }
        }
        class307.method2141(false, 0);
        if (class123.field2216) {
            class302.field5184.method1229();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class302.field5183[var17][var18].field383 = true;
                }
            }
        }
        if (class123.field2216) {
            class177.method1245();
        }
        if (class123.field2216) {
            class165.method1179(64);
        }
        class246.method1778(5);
        System.gc();
        class255.method1821(true, (byte) -93);
        class83.method639(5974, false);
        if (!class70.field1350) {
            class109.method793(-120, false);
            class255.method1821(true, (byte) 124);
            if (class123.field2216) {
                int var19 = class139.field2472.field1876[0] >> 3;
                int var20 = class139.field2472.field1898[0] >> 3;
                class263.method1848(arg0 + 4096, var20, var19);
            }
            class99.method735(false, -24557);
            if (class180.field3099 != null) {
                class175.method1224(115);
            }
        }
        if (class70.field1350) {
            class307.method2139((byte) 114, false);
            class255.method1821(true, (byte) 103);
            if (class123.field2216) {
                int var21 = class139.field2472.field1876[0] >> 3;
                int var22 = class139.field2472.field1898[0] >> 3;
                class263.method1848(4096, var22, var21);
            }
            class185.method1306(114, false);
        }
        class70.method574(false);
        class255.method1821(true, (byte) 108);
        class299.method2092((byte) -80, false, class91.field1637);
        if (class123.field2216) {
            class177.method1241();
        }
        class255.method1821(true, (byte) -103);
        int var23 = class120.field2173;
        if (var23 > class20.field364) {
            var23 = class20.field364;
        }
        if ((class20.field364 - 1) > var23) {
            int var24 = class20.field364 - 1;
        }
        if (class141.method1001((byte) -84)) {
            class181.method1287(0);
        } else {
            class181.method1287(class120.field2173);
        }
        class180.method1281((byte) -83);
        if (class123.field2216 && var11) {
            class110.method803(true);
            class83.method639(5974, true);
            if (!class70.field1350) {
                class109.method793(-107, true);
                class255.method1821(true, (byte) 124);
                class99.method735(true, -24557);
            }
            if (class70.field1350) {
                class307.method2139((byte) 114, true);
                class255.method1821(true, (byte) -125);
                class185.method1306(-119, true);
            }
            class70.method574(false);
            class255.method1821(true, (byte) 68);
            class299.method2092((byte) -80, true, class91.field1637);
            class255.method1821(true, (byte) -92);
            class180.method1281((byte) -61);
            class110.method803(false);
        }
        if (class123.field2216) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class302.field5183[var25][var26].method217(class96.field1764[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class227.method1642(-17700, var27, var28);
            }
        }
        class46.method346(-4);
        class246.method1778(arg0 + 5);
        class253.method1813(0);
        class70.method574(false);
        if (class27.field441 != null && class216.field3626 != null && class128.field2277 == 25) {
            class17.field353.method1214(-63, 102);
            class185.field3166++;
            class17.field353.method128((byte) -95, 1057001181);
        }
        if (!class70.field1350) {
            int var29 = (class295.field5066 + 6) / 8;
            int var30 = (class295.field5066 - 6) / 8;
            int var31 = (class233.field3931 - 6) / 8;
            int var32 = (class233.field3931 + 6) / 8;
            for (int var33 = var30 - 1; var33 <= (var29 + 1); var33++) {
                for (int var34 = var31 - 1; var34 <= (var32 + 1); var34++) {
                    if (var30 > var33 || var29 < var33 || var31 > var34 || var34 > var32) {
                        class253.field4413.method1594(0, class104.method768(new class64[] { class180.field3092, class310.method2149(var33, (byte) -61), class121.field2187, class310.method2149(var34, (byte) 100) }, false));
                        class253.field4413.method1594(0, class104.method768(new class64[] { class250.field4338, class310.method2149(var33, (byte) -127), class121.field2187, class310.method2149(var34, (byte) -18) }, false));
                    }
                }
            }
        }
        if (class128.field2277 == 28) {
            class153.method1107(10, (byte) -115);
        } else {
            class153.method1107(30, (byte) -88);
            if (class216.field3626 != null) {
                class17.field353.method1214(arg0 ^ 0xFFFFFF8E, 74);
            }
        }
        class246.method1778(arg0 + 5);
        class31.method270((byte) 24);
    }
}
