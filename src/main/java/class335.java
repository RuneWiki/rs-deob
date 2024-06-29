import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class335 {

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field5140 = 0;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5145 = "cyan:";

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Lpd;")
    public static class276 field5137;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "Lbm;")
    public static class307 field5144;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V", line = 10)
    public static final void method2309(int arg0, int arg1) {
        field5142++;
        int var2 = class305.field4623;
        if (arg1 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class278 var4;
            if (arg1 == 0) {
                var4 = class66.field1265;
            } else {
                var4 = class97.field1715[class283.field4384[var3]];
            }
            if (var4 != null && var4.method701(-7080)) {
                int var5 = var4.method710(-1);
                if (arg1 == 0 || arg1 == var5) {
                    if (var5 == 1) {
                        if ((var4.field1869 & 0x7F) == 64 && (var4.field1872 & 0x7F) == 64) {
                            int var6 = var4.field1869 >> 7;
                            int var7 = var4.field1872 >> 7;
                            if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                                var10002 = class67.field1274[var6][var7]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field1869 & 0x7F) == 0 && (var4.field1872 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field1869 & 0x7F) == 64 && (var4.field1872 & 0x7F) == 64)) {
                        int var8 = var4.field1872 - (var5 * 64) >> 7;
                        int var9 = var4.field1869 - (var5 * 64) >> 7;
                        int var10 = var9 + var4.method710(-1);
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        int var11 = var8 + var4.method710(-1);
                        if (var10 > 104) {
                            var10 = 104;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        for (int var12 = var9; var12 < var10; var12++) {
                            for (int var13 = var8; var13 < var11; var13++) {
                                var10002 = class67.field1274[var12][var13]++;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 21319) {
            method2315(105, (byte) -40, true);
        }
        label226: for (int var14 = 0; var14 < var2; var14++) {
            long var15;
            class278 var17;
            if (arg1 == 0) {
                var15 = 8791798054912L;
                var17 = class66.field1265;
            } else {
                var15 = (long) class283.field4384[var14] << 32;
                var17 = class97.field1715[class283.field4384[var14]];
            }
            if (var17 != null && var17.method701(arg0 ^ 0xFFFFB71F)) {
                int var18 = var17.method710(arg0 ^ 0xFFFFACB8);
                if (arg1 == 0 || arg1 == var18) {
                    var17.field1866 = true;
                    var17.field4282 = false;
                    if ((class79.field1555 && class305.field4623 > 200 || class305.field4623 > 50) && arg1 != 0 && var17.field1893 == var17.method698(86).field4907) {
                        var17.field4282 = true;
                    }
                    if (var18 == 1) {
                        if ((var17.field1869 & 0x7F) == 64 && (var17.field1872 & 0x7F) == 64) {
                            int var19 = var17.field1869 >> 7;
                            int var20 = var17.field1872 >> 7;
                            if (var19 < 0 || var19 >= 104 || var20 < 0 || var20 >= 104) {
                                continue;
                            }
                            if (class67.field1274[var19][var20] > 1) {
                                var10002 = class67.field1274[var19][var20]--;
                                continue;
                            }
                        }
                    } else if ((var18 & 0x1) == 0 && (var17.field1869 & 0x7F) == 0 && (var17.field1872 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var17.field1869 & 0x7F) == 64 && (var17.field1872 & 0x7F) == 0) {
                        int var21 = var17.field1869 - (var18 * 64) >> 7;
                        int var22 = var17.field1872 - (var18 * 64) >> 7;
                        int var23 = var18 + var21;
                        boolean var24 = true;
                        if (var23 > 104) {
                            var23 = 104;
                        }
                        int var25 = var18 + var22;
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        if (var25 > 104) {
                            var25 = 104;
                        }
                        for (int var26 = var21; var26 < var23; var26++) {
                            for (int var27 = var22; var27 < var25; var27++) {
                                if (class67.field1274[var26][var27] <= 1) {
                                    var24 = false;
                                    break;
                                }
                            }
                        }
                        if (var24) {
                            int var28 = var21;
                            while (true) {
                                if (var23 <= var28) {
                                    continue label226;
                                }
                                for (int var29 = var22; var29 < var25; var29++) {
                                    var10002 = class67.field1274[var28][var29]--;
                                }
                                var28++;
                            }
                        }
                    }
                    if (var17.field1904 == null || class25.field494 < var17.field1860 || class25.field494 >= var17.field1885) {
                        var17.field1866 = false;
                        var17.field1898 = class325.method2250(var17.field1872, 22771, class289.field4438, var17.field1869);
                        class50.method380(class289.field4438, var17.field1869, var17.field1872, var17.field1898, var18 * 64 - 4, var17, var17.field1927, var15, var17.field1891);
                    } else {
                        var17.field4282 = false;
                        var17.field1866 = false;
                        var17.field1898 = class325.method2250(var17.field1872, 22771, class289.field4438, var17.field1869);
                        class162.method1034(class289.field4438, var17.field1869, var17.field1872, var17.field1898, var17, var17.field1927, var15, var17.field1931, var17.field1946, var17.field1874, var17.field1868);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIII)V", line = 271)
    public static final void method2310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5139++;
        if (arg1 >= class147.field2416 && class259.field4024 >= arg5 && arg6 >= class59.field1162 && arg3 <= class186.field3028) {
            class154.method999(arg2, arg0, 1280, arg3, arg7, arg5, arg1, arg6);
        } else {
            class303.method2014(arg0, arg1, (byte) 108, arg3, arg6, arg5, arg7, arg2);
        }
        if (arg4 < 54) {
            method2315(-111, (byte) -80, true);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)Lvj;", line = 291)
    public static final class103 method2311(boolean arg0, int arg1) {
        field5146++;
        if (!arg0) {
            method2313((byte) 32);
        }
        return class263.field4089 && arg1 >= class72.field1512 && class104.field1797 >= arg1 ? class202.field3294[arg1 - class72.field1512] : null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[J[I)V", line = 306)
    public static final void method2312(int arg0, long[] arg1, int[] arg2) {
        field5143++;
        class334.method2308(106, arg1.length - 1, arg1, arg2, 0);
        int var3 = -70 / ((arg0 + 31) / 57);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 316)
    public static void method2313(byte arg0) {
        field5144 = null;
        field5137 = null;
        field5145 = null;
        int var1 = -87 % ((arg0 - 40) / 47);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V", line = 327)
    public static final void method2314(byte arg0) {
        field5135++;
        int var1 = -100 / ((46 - arg0) / 49);
        if (!class63.field1219 && class260.field4068 != 2) {
            try {
                class102.method666(class72.field1506, false, "tbrefresh");
            } catch (Throwable var3) {
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBZ)Ljava/lang/String;", line = 348)
    public static final String method2315(int arg0, byte arg1, boolean arg2) {
        field5138++;
        if (arg2 && arg0 >= 0) {
            if (arg1 != 74) {
                method2309(67, -96);
            }
            return class151.method983(arg2, -119, 10, arg0);
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILbm;)V", line = 372)
    public static final void method2316(int arg0, class307 arg1) {
        field5141++;
        class253.field3960 = arg1.method2052("p11_full", true);
        if (arg0 != 127) {
            return;
        }
        class321.field4895 = arg1.method2052("p12_full", true);
        class169.field2724 = arg1.method2052("b12_full", true);
        class79.field1564 = arg1.method2052("mapfunction", true);
        class302.field4574 = arg1.method2052("hitmarks", true);
        class99.field1750 = arg1.method2052("hitbar_default", true);
        class331.field5093 = arg1.method2052("headicons_pk", true);
        class165.field2659 = arg1.method2052("headicons_prayer", true);
        class25.field489 = arg1.method2052("hint_headicons", true);
        class326.field4985 = arg1.method2052("hint_mapmarkers", true);
        class190.field3083 = arg1.method2052("mapflag", true);
        class68.field1306 = arg1.method2052("cross", true);
        class2.field42 = arg1.method2052("mapdots", true);
        class174.field2783 = arg1.method2052("scrollbar", true);
        class222.field3515 = arg1.method2052("name_icons", true);
        class306.field4632 = arg1.method2052("floorshadows", true);
        class336.field5168 = arg1.method2052("compass", true);
        class135.field2269 = arg1.method2052("hint_mapedge", true);
    }
}
