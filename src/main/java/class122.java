import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class122 {

    @OriginalMember(owner = "client!n", name = "o", descriptor = "J")
    public long field2573 = 0L;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lrf;")
    public static class163 field2562 = class53.method392(48, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!n", name = "g", descriptor = "[Lrh;")
    public static class165[] field2565 = new class165[1000];

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field2560 = 1;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lrf;")
    public static class163 field2566 = class53.method392(44, "cross");

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Lrf;")
    private static class163 field2561 = class53.method392(103, "To play on this world move to a free area first)3");

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field2574 = 0;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lrf;")
    public static class163 field2563 = field2561;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public int field2559;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public int field2564;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public int field2567;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public int field2568;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public int field2569;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public int field2571;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Ls;")
    public class166 field2570;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Ls;")
    public class166 field2579;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Lsa;")
    public static class167 field2578;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V")
    public static final void method824(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class62.field1326 == 0 && !class189.field3766) {
            class62.method453((short) 5, 0L, arg3 - arg0, arg4 - arg1, class97.field2077, (byte) -93, class36.field728);
            class21.field363++;
        }
        long var5 = -1L;
        for (int var7 = 0; var7 < class91.field1979; var7++) {
            long var8 = class91.field1959[var7];
            int var10 = (int) var8 & 0x7F;
            int var11 = (int) var8 >> 29 & 0x3;
            int var12 = (int) var8 >> 7 & 0x7F;
            int var13 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            if (var5 != var8) {
                var5 = var8;
                if (var11 == 2 && class193.method1291(class60.field1227, var10, var12, var8)) {
                    class61 var14 = class199.method1314((byte) 126, var13);
                    if (var14.field1246 != null) {
                        var14 = var14.method435(-50);
                    }
                    if (var14 == null) {
                        continue;
                    }
                    if (class62.field1326 == 1) {
                        class20.field358++;
                        class62.method453((short) 41, var8, var10, var12, class193.field3794, (byte) -56, class180.method1216(new class163[] { class119.field2516, class12.field237, var14.field1287 }, false));
                    } else if (!class189.field3766) {
                        class163[] var15 = var14.field1284;
                        if (class19.field312) {
                            var15 = class197.method1306(var15, true);
                        }
                        if (var15 != null) {
                            for (int var16 = 4; var16 >= 0; var16--) {
                                if (var15[var16] != null) {
                                    class195.field3841++;
                                    short var17 = 0;
                                    if (var16 == 0) {
                                        var17 = 24;
                                    }
                                    if (var16 == 1) {
                                        var17 = 33;
                                    }
                                    if (var16 == 2) {
                                        var17 = 34;
                                    }
                                    if (var16 == 3) {
                                        var17 = 49;
                                    }
                                    if (var16 == 4) {
                                        var17 = 1007;
                                    }
                                    class62.method453(var17, var8, var10, var12, var15[var16], (byte) -28, class180.method1216(new class163[] { class148.field3060, var14.field1287 }, false));
                                }
                            }
                        }
                        class62.method453((short) 1002, (long) var14.field1244, var10, var12, class167.field3391, (byte) 115, class180.method1216(new class163[] { class148.field3060, var14.field1287 }, false));
                        class70.field1481++;
                    } else if ((class112.field2362 & 0x4) == 4) {
                        class80.field1627++;
                        class62.method453((short) 36, var8, var10, var12, class181.field3635, (byte) -66, class180.method1216(new class163[] { class6.field134, class12.field237, var14.field1287 }, false));
                    }
                }
                if (var11 == 1) {
                    class70 var18 = class187.field3723[var13];
                    if (var18.field1482.field2644 == 1 && (var18.field716 & 0x7F) == 64 && (var18.field679 & 0x7F) == 64) {
                        for (int var19 = 0; var19 < class93.field2013; var19++) {
                            class70 var22 = class187.field3723[class170.field3459[var19]];
                            if (var22 != null && var18 != var22 && var22.field1482.field2644 == 1 && var18.field716 == var22.field716 && var18.field679 == var22.field679) {
                                class191.method1286(4, var10, var12, class170.field3459[var19], var22.field1482);
                            }
                        }
                        for (int var20 = 0; var20 < class112.field2377; var20++) {
                            class38 var21 = class121.field2553[class27.field504[var20]];
                            if (var21 != null && var18.field716 == var21.field716 && var18.field679 == var21.field679) {
                                class102.method696(var21, -104, class27.field504[var20], var10, var12);
                            }
                        }
                    }
                    class191.method1286(4, var10, var12, var13, var18.field1482);
                }
                if (var11 == 0) {
                    class38 var23 = class121.field2553[var13];
                    if ((var23.field716 & 0x7F) == 64 && (var23.field679 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < class93.field2013; var24++) {
                            class70 var27 = class187.field3723[class170.field3459[var24]];
                            if (var27 != null && var27.field1482.field2644 == 1 && var23.field716 == var27.field716 && var23.field679 == var27.field679) {
                                class191.method1286(4, var10, var12, class170.field3459[var24], var27.field1482);
                            }
                        }
                        for (int var25 = 0; var25 < class112.field2377; var25++) {
                            class38 var26 = class121.field2553[class27.field504[var25]];
                            if (var26 != null && var23 != var26 && var23.field716 == var26.field716 && var23.field679 == var26.field679) {
                                class102.method696(var26, -82, class27.field504[var25], var10, var12);
                            }
                        }
                    }
                    class102.method696(var23, -89, var13, var10, var12);
                }
                if (var11 == 3) {
                    class5 var28 = class69.field1434[class60.field1227][var10][var12];
                    if (var28 != null) {
                        for (class148 var29 = (class148) var28.method48(0); var29 != null; var29 = (class148) var28.method47(126)) {
                            class4 var30 = class97.method669(arg2 - 1613782249, var29.field3057);
                            if (class62.field1326 == 1) {
                                class62.method453((short) 6, (long) var29.field3057, var10, var12, class193.field3794, (byte) -117, class180.method1216(new class163[] { class119.field2516, class29.field538, var30.field62 }, false));
                                class170.field3456++;
                            } else if (!class189.field3766) {
                                class27.field499++;
                                class163[] var31 = var30.field88;
                                if (class19.field312) {
                                    var31 = class197.method1306(var31, true);
                                }
                                for (int var32 = 4; var32 >= 0; var32--) {
                                    if (var31 != null && var31[var32] != null) {
                                        byte var33 = 0;
                                        class15.field264++;
                                        if (var32 == 0) {
                                            var33 = 16;
                                        }
                                        if (var32 == 1) {
                                            var33 = 4;
                                        }
                                        if (var32 == 2) {
                                            var33 = 38;
                                        }
                                        if (var32 == 3) {
                                            var33 = 58;
                                        }
                                        if (var32 == 4) {
                                            var33 = 26;
                                        }
                                        class62.method453(var33, (long) var29.field3057, var10, var12, var31[var32], (byte) 103, class180.method1216(new class163[] { class191.field3787, var30.field62 }, false));
                                    } else if (var32 == 2) {
                                        class62.method453((short) 38, (long) var29.field3057, var10, var12, class148.field3045, (byte) 106, class180.method1216(new class163[] { class191.field3787, var30.field62 }, false));
                                        class62.field1308++;
                                    }
                                }
                                class62.method453((short) 1005, (long) var29.field3057, var10, var12, class167.field3391, (byte) 119, class180.method1216(new class163[] { class191.field3787, var30.field62 }, false));
                            } else if ((class112.field2362 & 0x1) == 1) {
                                class55.field1119++;
                                class62.method453((short) 57, (long) var29.field3057, var10, var12, class181.field3635, (byte) -53, class180.method1216(new class163[] { class6.field134, class29.field538, var30.field62 }, false));
                            }
                        }
                    }
                }
            }
        }
        field2575++;
        if (arg2 != 1613782141) {
            field2561 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Lqa;")
    public static final class149 method825(int arg0, int arg1) {
        class149 var2 = (class149) class208.field4064.method401((long) arg0, (byte) 127);
        field2576++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class95.field2032.method1235(0, (byte) -64, arg0);
        if (var3 == null) {
            return null;
        }
        class149 var4 = new class149();
        class52 var5 = new class52(var3);
        var5.field1033 = var5.field1054.length + arg1;
        int var6 = var5.method383(26);
        var4.field3062 = var5.method390((byte) 118);
        int var7 = 0;
        var4.field3071 = var5.method390((byte) 117);
        var4.field3067 = var5.method390((byte) 101);
        var4.field3072 = var5.method390((byte) 91);
        var5.field1033 = 0;
        var4.field3065 = var5.method362((byte) 51);
        var4.field3068 = new int[var6];
        var4.field3070 = new class163[var6];
        var4.field3074 = new int[var6];
        while (var5.field1033 < var5.field1054.length - 12) {
            int var8 = var5.method390((byte) 92);
            if (var8 == 3) {
                var4.field3070[var7] = var5.method363(class70.method502(arg1, -19053));
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field3068[var7] = var5.method344(255);
            } else {
                var4.field3068[var7] = var5.method383(class70.method502(arg1, -99));
            }
            var4.field3074[var7++] = var8;
        }
        class208.field4064.method398(var4, (long) arg0, (byte) 104);
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method826(byte arg0) {
        field2566 = null;
        field2563 = null;
        field2578 = null;
        field2565 = null;
        if (arg0 <= 18) {
            field2560 = 30;
        }
        field2562 = null;
        field2561 = null;
    }
}
