import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class174 {

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Ljd;")
    public static class265 field2918 = new class265(200);

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "D")
    public static double field2921 = -1.0D;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Ljh;")
    public static class250 field2914;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "[Lpg;")
    public static class69[] field2920;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "[[[B")
    public static byte[][][] field2919;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2917++;
        class18.method169((byte) -125, arg0);
        int var7 = 0;
        int var8 = arg0;
        int var9 = arg0 - arg6;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = -arg0;
        int var11 = -var9;
        int var12 = -1;
        int var13 = var9;
        int var14 = arg1;
        int var15 = arg4 + var9;
        int var16 = arg4 - var9;
        int[] var17 = class149.field2507[arg5];
        class171.method1133(var17, arg4 - arg0, arg3, var16, (byte) 127);
        class171.method1133(var17, var16, arg2, var15, (byte) 127);
        class171.method1133(var17, var15, arg3, arg0 + arg4, (byte) 126);
        while (var7 < var8) {
            var12 += 2;
            var14 += 2;
            var10 += var14;
            var11 += var12;
            if (var11 >= 0 && var13 >= 1) {
                class80.field1291[var13] = var7;
                var13--;
                var11 -= var13 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var8--;
                var10 -= var8 << 1;
                if (var8 < var9) {
                    int[] var18 = class149.field2507[arg5 - var8];
                    int[] var19 = class149.field2507[arg5 + var8];
                    int var20 = class80.field1291[var8];
                    int var21 = arg4 + var7;
                    int var22 = arg4 + var20;
                    int var23 = arg4 - var7;
                    int var24 = arg4 - var20;
                    class171.method1133(var19, var23, arg3, var24, (byte) 127);
                    class171.method1133(var19, var24, arg2, var22, (byte) 127);
                    class171.method1133(var19, var22, arg3, var21, (byte) 127);
                    class171.method1133(var18, var23, arg3, var24, (byte) 125);
                    class171.method1133(var18, var24, arg2, var22, (byte) 125);
                    class171.method1133(var18, var22, arg3, var21, (byte) 126);
                } else {
                    int[] var25 = class149.field2507[arg5 - var8];
                    int[] var26 = class149.field2507[arg5 + var8];
                    int var27 = arg4 + var7;
                    int var28 = arg4 - var7;
                    class171.method1133(var26, var28, arg3, var27, (byte) 127);
                    class171.method1133(var25, var28, arg3, var27, (byte) 126);
                }
            }
            int[] var29 = class149.field2507[arg5 + var7];
            int var30 = arg4 + var8;
            int[] var31 = class149.field2507[arg5 - var7];
            int var32 = arg4 - var8;
            if (var7 >= var9) {
                class171.method1133(var29, var32, arg3, var30, (byte) 125);
                class171.method1133(var31, var32, arg3, var30, (byte) 125);
            } else {
                int var33 = var13 >= var7 ? var13 : class80.field1291[var7];
                int var34 = arg4 - var33;
                int var35 = arg4 + var33;
                class171.method1133(var29, var32, arg3, var34, (byte) 127);
                class171.method1133(var29, var34, arg2, var35, (byte) 126);
                class171.method1133(var29, var35, arg3, var30, (byte) 125);
                class171.method1133(var31, var32, arg3, var34, (byte) 127);
                class171.method1133(var31, var34, arg2, var35, (byte) 126);
                class171.method1133(var31, var35, arg3, var30, (byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIZLo;)V")
    public static final void method1157(int arg0, int arg1, int arg2, boolean arg3, class175 arg4) {
        class4.method36((byte) 18);
        class17.method157(arg2, arg1, arg4.field3057 + arg2, arg4.field3041 + arg1);
        field2915++;
        if (arg3) {
            method1156(59, -12, -23, 123, 83, 43, -13);
        }
        if (class25.field439 == 2 || class25.field439 == 5 || class247.field4312 == null) {
            class17.method153(arg2, arg1, 0, arg4.field2968, arg4.field3055);
        } else {
            int var5 = 464 - class258.field4507.field2681 / 32;
            int var6 = class214.field3682 + class144.field2348 & 0x7FF;
            int var7 = (class258.field4507.field2654 / 32) + 48;
            ((class48) class247.field4312).method321(arg2, arg1, arg4.field3057, arg4.field3041, var7, var5, var6, class221.field3821 + 256, arg4.field2968, arg4.field3055);
            if (class123.field2023 != null) {
                for (int var8 = 0; var8 < class123.field2023.field3717; var8++) {
                    if (class123.field2023.method1442((byte) -23, var8)) {
                        int var9 = (class123.field2023.field3716[var8] - class222.field3844) * 4 + 2 - (class258.field4507.field2681 / 32);
                        int var10 = class72.field1150[var6];
                        int var11 = (class123.field2023.field3734[var8] - class253.field4420) * 4 + 2 - class258.field4507.field2654 / 32;
                        int var12 = class72.field1145[var6];
                        class245 var13 = class164.field2797;
                        int var14 = var12 * 256 / (class221.field3821 + 256);
                        int var15 = var10 * 256 / (class221.field3821 + 256);
                        if (class123.field2023.method1443(var8, (byte) 57) == 1) {
                            var13 = class18.field316;
                        }
                        if (class123.field2023.method1443(var8, (byte) 88) == 2) {
                            var13 = class114.field1853;
                        }
                        int var16 = var9 * var15 + var11 * var14 >> 16;
                        int var17 = var13.method1676(class123.field2023.field3732[var8], 100);
                        int var18 = var9 * var14 - var11 * var15 >> 16;
                        int var19 = var16 - var17 / 2;
                        if (var19 >= (-arg4.field3057) && var19 <= arg4.field3057 && -arg4.field3041 <= var18 && var18 <= arg4.field3041) {
                            int var20 = 16777215;
                            if (class123.field2023.field3715[var8] != -1) {
                                var20 = class123.field2023.field3715[var8];
                            }
                            class17.method160(arg4.field2968, arg4.field3055);
                            var13.method1663(class123.field2023.field3732[var8], arg4.field3057 / 2 + arg2 + var19, arg1 - -(arg4.field3041 / 2) - var18, var17, 50, var20, 0, 256, 1, 0, 0);
                            class17.method154();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class257.field4499; var21++) {
                int var54 = class82.field1318[var21] * 4 + 2 - (class258.field4507.field2654 / 32);
                int var55 = class131.field2173[var21] * 4 + 2 - class258.field4507.field2681 / 32;
                class148 var56 = class62.method442((byte) 79, class43.field682[var21]);
                if (var56.field2446 != null) {
                    var56 = var56.method966((byte) 15);
                    if (var56 == null || var56.field2457 == -1) {
                        continue;
                    }
                }
                class138.method887(arg1, class18.field320[var56.field2457], var54, (byte) 92, var55, arg4, arg2);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    class247 var51 = class132.field2183[class38.field581][var22][var50];
                    if (var51 != null) {
                        int var52 = var22 * 4 + 2 - class258.field4507.field2654 / 32;
                        int var53 = var50 * 4 + 2 - class258.field4507.field2681 / 32;
                        class138.method887(arg1, class243.field4224[0], var52, (byte) 92, var53, arg4, arg2);
                    }
                }
            }
            for (int var23 = 0; var23 < class137.field2237; var23++) {
                class178 var46 = class129.field2140[class263.field4581[var23]];
                if (var46 != null && var46.method768((byte) -82)) {
                    class64 var47 = var46.field3117;
                    if (var47 != null && var47.field1050 != null) {
                        var47 = var47.method458((byte) -54);
                    }
                    if (var47 != null && var47.field1017 && var47.field1030) {
                        int var48 = var46.field2654 / 32 - (class258.field4507.field2654 / 32);
                        int var49 = var46.field2681 / 32 - (class258.field4507.field2681 / 32);
                        class138.method887(arg1, class243.field4224[1], var48, (byte) 92, var49, arg4, arg2);
                    }
                }
            }
            for (int var24 = 0; var24 < class152.field2538; var24++) {
                class116 var38 = class39.field602[class218.field3750[var24]];
                if (var38 != null && var38.method768((byte) -76)) {
                    int var39 = var38.field2654 / 32 - (class258.field4507.field2654 / 32);
                    int var40 = var38.field2681 / 32 - (class258.field4507.field2681 / 32);
                    long var41 = var38.field1883.method1197(-125);
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class149.field2483; var44++) {
                        if (class182.field3213[var44] == var41 && class140.field2272[var44] != 0) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class258.field4507.field1920 != 0 && var38.field1920 != 0 && class258.field4507.field1920 == var38.field1920) {
                        var45 = true;
                    }
                    if (var43) {
                        class138.method887(arg1, class243.field4224[3], var39, (byte) 92, var40, arg4, arg2);
                    } else if (var45) {
                        class138.method887(arg1, class243.field4224[4], var39, (byte) 92, var40, arg4, arg2);
                    } else {
                        class138.method887(arg1, class243.field4224[2], var39, (byte) 92, var40, arg4, arg2);
                    }
                }
            }
            class203[] var25 = class74.field1187;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class203 var29 = var25[var26];
                if (var29 != null && var29.field3503 != 0 && (class237.field4125 % 20) < 10) {
                    if (var29.field3503 == 1 && var29.field3496 >= 0 && var29.field3496 < class129.field2140.length) {
                        class178 var30 = class129.field2140[var29.field3496];
                        if (var30 != null) {
                            int var31 = var30.field2681 / 32 - (class258.field4507.field2681 / 32);
                            int var32 = var30.field2654 / 32 - class258.field4507.field2654 / 32;
                            class37.method270(var31, var32, arg4, var29.field3488, arg1, arg2, true);
                        }
                    }
                    if (var29.field3503 == 2) {
                        int var33 = (var29.field3495 - class253.field4420) * 4 + 2 - (class258.field4507.field2654 / 32);
                        int var34 = (var29.field3484 - class222.field3844) * 4 + 2 - class258.field4507.field2681 / 32;
                        class37.method270(var34, var33, arg4, var29.field3488, arg1, arg2, true);
                    }
                    if (var29.field3503 == 10 && var29.field3496 >= 0 && var29.field3496 < class39.field602.length) {
                        class116 var35 = class39.field602[var29.field3496];
                        if (var35 != null) {
                            int var36 = var35.field2654 / 32 - class258.field4507.field2654 / 32;
                            int var37 = var35.field2681 / 32 - (class258.field4507.field2681 / 32);
                            class37.method270(var37, var36, arg4, var29.field3488, arg1, arg2, !arg3);
                        }
                    }
                }
            }
            if (class210.field3612 != 0) {
                int var27 = class210.field3612 * 4 + 2 - class258.field4507.field2654 / 32;
                int var28 = class146.field2400 * 4 + 2 - class258.field4507.field2681 / 32;
                class138.method887(arg1, class41.field610, var27, (byte) 92, var28, arg4, arg2);
            }
            class17.method156(arg4.field3057 / 2 + arg2 - 1, arg4.field3041 / 2 + arg1 + -1, 3, 3, 16777215);
        }
        class114.field1849[arg0] = true;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V")
    public static final void method1158(int arg0, int arg1, int arg2) {
        if (arg0 != -8210) {
            field2919 = null;
        }
        field2916++;
        class91 var3 = class31.method252(arg1, 1, false);
        var3.method605(32370);
        var3.field1443 = arg2;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
    public static void method1159(boolean arg0) {
        if (!arg0) {
            field2918 = null;
            field2920 = null;
            field2914 = null;
            field2919 = null;
        }
    }
}
