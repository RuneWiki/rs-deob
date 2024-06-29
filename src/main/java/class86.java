import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class86 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lec;")
    private static class32 field2001 = class73.method594("Continue", true);

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field2005 = 0;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2002 = 0;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Lec;")
    public static class32 field2014 = class73.method594("::clientdrop", true);

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lec;")
    private static class32 field2013 = class73.method594("Create a free account", true);

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lec;")
    public static class32 field2010 = class73.method594("Abbrechen", true);

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lec;")
    public static class32 field2009 = class73.method594("sch-Utteln:", true);

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lec;")
    public static class32 field2004 = class73.method594("Welt", true);

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field2017 = 0;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lec;")
    private static class32 field2019 = class73.method594("Please wait )2 attempting to reestablish", true);

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field2015 = 1;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Lec;")
    public static class32 field2021 = field2013;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "Lec;")
    private static class32 field2023 = class73.method594("Service unavailable)3", true);

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lec;")
    public static class32 field2003 = field2001;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Lec;")
    public static class32 field2016 = field2023;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lec;")
    public static class32 field2008 = field2019;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field2012 = 0;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Ldc;")
    public static class25 field2011;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)V")
    public static final void method664(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class125.field2915 == 0 && !class151.field3470) {
            class135.field3135++;
            class56.method443(0, class47.field1117, 3231, arg4 - arg2, 3, class77.field1787, arg0 - arg3);
        }
        field2018++;
        int var5 = arg1;
        for (int var6 = 0; var6 < class101.field2384; var6++) {
            int var7 = class101.field2369[var6];
            int var8 = var7 >> 29 & 0x3;
            int var9 = var7 & 0x7F;
            int var10 = var7 >> 14 & 0x7FFF;
            int var11 = var7 >> 7 & 0x7F;
            if (var5 != var7) {
                var5 = var7;
                if (var8 == 2 && class159.field3659.method1123(class43.field990, var9, var11, var7) >= 0) {
                    class53 var12 = class5.method22(7, var10);
                    if (var12.field1252 != null) {
                        var12 = var12.method423((byte) -17);
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (class125.field2915 == 1) {
                        class119.field2853++;
                        class56.method443(var7, class41.field966, 3231, var11, 49, class52.method403(new class32[] { class50.field1149, class91.field2089, var12.field1214 }, (byte) -20), var9);
                    } else if (!class151.field3470) {
                        class12.field196++;
                        class32[] var13 = var12.field1256;
                        if (class94.field2166) {
                            var13 = class125.method986(var13, arg1 ^ 0xFFFFFFFC);
                        }
                        if (var13 != null) {
                            for (int var14 = 4; var14 >= 0; var14--) {
                                if (var13[var14] != null) {
                                    class56.field1308++;
                                    short var15 = 0;
                                    if (var14 == 0) {
                                        var15 = 37;
                                    }
                                    if (var14 == 1) {
                                        var15 = 11;
                                    }
                                    if (var14 == 2) {
                                        var15 = 32;
                                    }
                                    if (var14 == 3) {
                                        var15 = 1;
                                    }
                                    if (var14 == 4) {
                                        var15 = 1003;
                                    }
                                    class56.method443(var7, var13[var14], 3231, var11, var15, class52.method403(new class32[] { class133.field3054, var12.field1214 }, (byte) -20), var9);
                                }
                            }
                        }
                        class56.method443(var12.field1222 << 14, class135.field3142, 3231, var11, 1002, class52.method403(new class32[] { class133.field3054, var12.field1214 }, (byte) -20), var9);
                    } else if ((class88.field2047 & 0x4) == 4) {
                        class56.method443(var7, class147.field3355, 3231, var11, 2, class52.method403(new class32[] { class14.field234, class91.field2089, var12.field1214 }, (byte) -20), var9);
                        class34.field703++;
                    }
                }
                if (var8 == 1) {
                    class111 var16 = class14.field230[var10];
                    if (var16.field2597.field2198 == 1 && (var16.field2749 & 0x7F) == 64 && (var16.field2700 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < class102.field2399; var17++) {
                            class111 var20 = class14.field230[class15.field313[var17]];
                            if (var20 != null && var16 != var20 && var20.field2597.field2198 == 1 && var16.field2749 == var20.field2749 && var16.field2700 == var20.field2700) {
                                class32.method251(var9, var20.field2597, arg1 ^ 0xFFFFFCDE, class15.field313[var17], var11);
                            }
                        }
                        for (int var18 = 0; var18 < class62.field1405; var18++) {
                            class70 var19 = class52.field1176[class137.field3189[var18]];
                            if (var19 != null && var16.field2749 == var19.field2749 && var16.field2700 == var19.field2700) {
                                class61.method465(class137.field3189[var18], var11, var19, (byte) 52, var9);
                            }
                        }
                    }
                    class32.method251(var9, var16.field2597, 801, var10, var11);
                }
                if (var8 == 0) {
                    class70 var21 = class52.field1176[var10];
                    if ((var21.field2749 & 0x7F) == 64 && (var21.field2700 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < class102.field2399; var22++) {
                            class111 var25 = class14.field230[class15.field313[var22]];
                            if (var25 != null && var25.field2597.field2198 == 1 && var21.field2749 == var25.field2749 && var21.field2700 == var25.field2700) {
                                class32.method251(var9, var25.field2597, 801, class15.field313[var22], var11);
                            }
                        }
                        for (int var23 = 0; var23 < class62.field1405; var23++) {
                            class70 var24 = class52.field1176[class137.field3189[var23]];
                            if (var24 != null && var21 != var24 && var21.field2749 == var24.field2749 && var21.field2700 == var24.field2700) {
                                class61.method465(class137.field3189[var23], var11, var24, (byte) -102, var9);
                            }
                        }
                    }
                    class61.method465(var10, var11, var21, (byte) -123, var9);
                }
                if (var8 == 3) {
                    class157 var26 = class23.field397[class43.field990][var9][var11];
                    if (var26 != null) {
                        for (class17 var27 = (class17) var26.method1222(arg1 - 48); var27 != null; var27 = (class17) var26.method1210(-1)) {
                            class62 var28 = class146.method1094(var27.field333, arg1 + 50);
                            if (class125.field2915 == 1) {
                                class56.method443(var27.field333, class41.field966, 3231, var11, 20, class52.method403(new class32[] { class50.field1149, class48.field1133, var28.field1430 }, (byte) -20), var9);
                                class73.field1726++;
                            } else if (!class151.field3470) {
                                class38.field912++;
                                class32[] var29 = var28.field1411;
                                if (class94.field2166) {
                                    var29 = class125.method986(var29, 3);
                                }
                                for (int var30 = 4; var30 >= 0; var30--) {
                                    if (var29 != null && var29[var30] != null) {
                                        byte var31 = 0;
                                        if (var30 == 0) {
                                            var31 = 57;
                                        }
                                        if (var30 == 1) {
                                            var31 = 47;
                                        }
                                        class111.field2602++;
                                        if (var30 == 2) {
                                            var31 = 31;
                                        }
                                        if (var30 == 3) {
                                            var31 = 13;
                                        }
                                        if (var30 == 4) {
                                            var31 = 36;
                                        }
                                        class56.method443(var27.field333, var29[var30], arg1 ^ 0xFFFFF360, var11, var31, class52.method403(new class32[] { class38.field903, var28.field1430 }, (byte) -20), var9);
                                    } else if (var30 == 2) {
                                        class64.field1484++;
                                        class56.method443(var27.field333, class28.field507, 3231, var11, 31, class52.method403(new class32[] { class38.field903, var28.field1430 }, (byte) -20), var9);
                                    }
                                }
                                class56.method443(var27.field333, class135.field3142, 3231, var11, 1001, class52.method403(new class32[] { class38.field903, var28.field1430 }, (byte) -20), var9);
                            } else if ((class88.field2047 & 0x1) == 1) {
                                class156.field3572++;
                                class56.method443(var27.field333, class147.field3355, 3231, var11, 33, class52.method403(new class32[] { class14.field234, class48.field1133, var28.field1430 }, (byte) -20), var9);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILf;IIIIII)V")
    public static final void method665(int arg0, class36 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2007++;
        if (arg4 <= 105) {
            return;
        }
        if (class23.field416) {
            class72.field1707 = 32;
        } else {
            class72.field1707 = 0;
        }
        class23.field416 = false;
        if (field2017 != 0) {
            if (arg6 >= arg3 && arg3 + 16 > arg6 && arg2 >= arg0 && arg0 + 16 > arg2) {
                arg1.field873 -= 4;
                class132.method1010(arg1, (byte) -128);
            } else if (arg3 <= arg6 && arg6 < arg3 + 16 && arg2 >= arg0 + arg5 - 16 && arg0 + arg5 > arg2) {
                arg1.field873 += 4;
                class132.method1010(arg1, (byte) -110);
            } else if (arg6 >= arg3 - class72.field1707 && arg6 < arg3 + class72.field1707 + 16 && arg0 + 16 <= arg2 && arg2 < arg0 + arg5 - 16) {
                int var8 = (arg5 - 32) * arg5 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - arg0 - var8 / 2 - 16;
                int var10 = arg5 - var8 - 32;
                arg1.field873 = (arg7 - arg5) * var9 / var10;
                class132.method1010(arg1, (byte) -119);
                class23.field416 = true;
            }
        }
        if (class72.field1696 == 0) {
            return;
        }
        int var11 = arg1.field811;
        if (arg6 >= arg3 - var11 && arg0 <= arg2 && arg3 + 16 > arg6 && arg0 + arg5 >= arg2) {
            arg1.field873 += class72.field1696 * 45;
            class132.method1010(arg1, (byte) -105);
            return;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method666(int arg0) {
        field2016 = null;
        field2011 = null;
        field2013 = null;
        if (arg0 != 16351) {
            method666(90);
        }
        field2001 = null;
        field2010 = null;
        field2003 = null;
        field2009 = null;
        field2021 = null;
        field2023 = null;
        field2008 = null;
        field2019 = null;
        field2014 = null;
        field2004 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Lrc;")
    public static final class121 method667(byte arg0, int arg1) {
        class121 var2 = (class121) class64.field1481.method486(-28825, (long) arg1);
        field2024++;
        if (var2 != null) {
            return var2;
        }
        class121 var3 = class33.method287((byte) 79, class137.field3195, class3.field45, false, arg1);
        if (var3 != null) {
            class64.field1481.method485((long) arg1, (byte) -122, var3);
        }
        if (arg0 != -122) {
            field2013 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLea;IZIII)V")
    public static final void method668(boolean arg0, class30 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class73.field1725 = arg5;
        field2006++;
        class34.field719 = arg1;
        class157.field3608 = arg6;
        class121.field2872 = arg3;
        class57.field1322 = arg2;
        class98.field2265 = 1;
        if (!arg0) {
            field2012 = -71;
        }
        class126.field2930 = arg4;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method669(int arg0, byte[] arg1) {
        field2020++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        if (arg0 == 49) {
            class60.method458(arg1, 0, var3, 0, var2);
            return var3;
        } else {
            return null;
        }
    }
}
