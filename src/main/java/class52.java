import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class52 extends class68 {

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "Lae;")
    private static class6 field1163 = class64.method474(122, "Hide");

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "Lae;")
    private static class6 field1168 = class64.method474(118, "Walk here");

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field1176 = 0;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "Lae;")
    public static class6 field1181 = class64.method474(125, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "Lae;")
    public static class6 field1182 = field1168;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "[Lfe;")
    public static class38[] field1171 = new class38[50];

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field1172 = 0;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field1170 = 0;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field1180 = 0;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "Lae;")
    public static class6 field1184 = class64.method474(121, ")3");

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "Lae;")
    public static class6 field1169 = field1163;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "Lae;")
    private static class6 field1174 = class64.method474(127, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "Lae;")
    public static class6 field1175 = field1174;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "Lae;")
    public static class6 field1185 = class64.method474(106, "backvmid2");

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "Lae;")
    private static class6 field1173 = class64.method474(105, "System update in: ");

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "Lae;")
    public static class6 field1167 = field1173;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "Lae;")
    public class6 field1166;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIIIIIIILte;)V", line = 27)
    public static final void method412(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class121 arg8) {
        if (class25.field633) {
            class58.field1266 = 32;
        } else {
            class58.field1266 = 0;
        }
        if (arg0 != 121) {
            field1167 = null;
        }
        class25.field633 = false;
        if (arg1 <= arg2 && arg1 + 16 > arg2 && arg6 <= arg3 && arg3 < arg6 + 16) {
            arg8.field2847 -= class58.field1250 * 4;
            if (arg4 == 1) {
                class139.field3380 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                class20.field427 = true;
            }
        } else if (arg1 <= arg2 && arg2 < arg1 + 16 && arg5 + arg6 - 16 <= arg3 && arg3 < arg5 + arg6) {
            if (arg4 == 2 || arg4 == 3) {
                class20.field427 = true;
            }
            if (arg4 == 1) {
                class139.field3380 = true;
            }
            arg8.field2847 += class58.field1250 * 4;
        } else if (arg2 >= arg1 - class58.field1266 && arg2 < arg1 + class58.field1266 + 16 && arg6 + 16 <= arg3 && arg3 < arg6 + arg5 - 16 && class58.field1250 > 0) {
            class25.field633 = true;
            if (arg4 == 2 || arg4 == 3) {
                class20.field427 = true;
            }
            if (arg4 == 1) {
                class139.field3380 = true;
            }
            int var9 = (arg5 - 32) * arg5 / arg7;
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg5 - var9 - 32;
            int var11 = arg3 - var9 / 2 - arg6 - 16;
            arg8.field2847 = (arg7 - arg5) * var11 / var10;
        }
        field1165++;
        if (class108.field2591 == 0) {
            return;
        }
        int var12 = arg8.field2984;
        if (arg4 == -1) {
            var12 = 479;
        }
        if (arg1 - var12 > arg2 || arg6 > arg3 || arg2 >= arg1 + 16 || arg5 + arg6 < arg3) {
            return;
        }
        arg8.field2847 += class108.field2591 * 45;
        if (arg4 == 2 || arg4 == 3) {
            class20.field427 = true;
        }
        if (arg4 == 1) {
            class139.field3380 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V", line = 125)
    public static final void method413(int arg0, int arg1) {
        field1164++;
        if (arg1 == -1 || (!class21.method208(0, arg1) || arg0 < 37)) {
            return;
        }
        class121[] var2 = class35.field828[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class121 var4 = var2[var3];
            if (var4.field2895 != null) {
                class76.method612(0, var4.field2895, null, 120, 0, var4, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V", line = 167)
    public static void method414(int arg0) {
        field1167 = null;
        field1163 = null;
        field1174 = null;
        field1168 = null;
        field1185 = null;
        field1181 = null;
        if (arg0 >= -54) {
            return;
        }
        field1182 = null;
        field1171 = null;
        field1175 = null;
        field1173 = null;
        field1169 = null;
        field1184 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Z", line = 198)
    public static final boolean method415(int arg0, byte arg1) {
        field1183++;
        if (!class21.method208(0, arg0)) {
            return false;
        }
        boolean var2 = false;
        class121[] var3 = class35.field828[arg0];
        if (arg1 < 94) {
            method414(-19);
        }
        for (int var4 = 0; var4 < var3.length; var4++) {
            class121 var5 = var3[var4];
            if (var5 != null && var5.field2971 == 6) {
                if (var5.field2983 != -1 || var5.field2917 != -1) {
                    boolean var6 = class69.method502(var5, 6);
                    int var7;
                    if (var6) {
                        var7 = var5.field2917;
                    } else {
                        var7 = var5.field2983;
                    }
                    if (var7 != -1) {
                        class85 var8 = class35.method314(var7, (byte) 54);
                        var5.field2954 += class82.field2005;
                        label57: while (true) {
                            do {
                                do {
                                    if (var8.field2043[var5.field2853] >= var5.field2954) {
                                        break label57;
                                    }
                                    var5.field2954 -= var8.field2043[var5.field2853];
                                    var5.field2853++;
                                    var2 = true;
                                } while (var5.field2853 < var8.field2049.length);
                                var5.field2853 -= var8.field2056;
                            } while (var5.field2853 >= 0 && var5.field2853 < var8.field2049.length);
                            var5.field2853 = 0;
                        }
                    }
                }
                if (var5.field2941 != 0 && !var5.field2870) {
                    var2 = true;
                    int var9 = var5.field2941 << 16 >> 16;
                    int var10 = var5.field2941 >> 16;
                    int var11 = class82.field2005 * var10;
                    int var12 = class82.field2005 * var9;
                    var5.field2868 = var5.field2868 + var12 & 0x7FF;
                    var5.field2975 = var5.field2975 + var11 & 0x7FF;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIII[Lte;II)V", line = 302)
    public static final void method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class121[] arg9, int arg10, int arg11) {
        field1178++;
        if (arg8 > arg10 || arg4 > arg6 || arg10 >= arg2 || arg11 <= arg6) {
            return;
        }
        if (arg0 != -1) {
            field1174 = null;
        }
        for (int var12 = 0; var12 < arg9.length; var12++) {
            class121 var13 = arg9[var12];
            if (var13 != null && var13.field2915 == arg5 && (!var13.field2870 || !var13.method980(121, class30.field717))) {
                int var14 = arg4 + var13.field2879 - arg3;
                int var15 = var13.field2967 + arg8 - arg1;
                if ((var13.field2926 >= 0 || var13.field2905 != 0) && var15 <= arg10 && arg6 >= var14 && var15 + var13.field2984 > arg10 && arg6 < var13.field2872 + var14) {
                    if (var13.field2926 < 0) {
                        class91.field2171 = var12;
                    } else {
                        class91.field2171 = var13.field2926;
                    }
                }
                if (var13.field2971 == 8 && var15 <= arg10 && arg6 >= var14 && var13.field2984 + var15 > arg10 && var14 + var13.field2872 > arg6) {
                    class41.field933 = var12;
                }
                if (var13.field2971 == 0) {
                    if (!var13.field2870 && var13.method980(arg0 + 128, class30.field717) && !class22.method222(arg7, -1, var12)) {
                        continue;
                    }
                    method416(-1, var13.field2936, var13.field2984 + var15, var13.field2847, var14, var13.field2960, arg6, arg7, var15, arg9, arg10, var14 + var13.field2872);
                    if (var13.field2885 != null) {
                        method416(-1, var13.field2936, var13.field2984 + var15, var13.field2847, var14, var13.field2960, arg6, arg7, var15, var13.field2885, arg10, var14 + var13.field2872);
                    }
                    if (var13.field2872 < var13.field2972 && !var13.field2870) {
                        method412((byte) 121, var15 + var13.field2984, arg10, arg6, arg7, var13.field2872, var14, var13.field2972, var13);
                    }
                    if (!var13.field2870) {
                        continue;
                    }
                }
                if (var13.field2965 == 1 && arg10 >= var15 && arg6 >= var14 && arg10 < var13.field2984 + var15 && var13.field2872 + var14 > arg6) {
                    boolean var16 = false;
                    if (var13.field2953 != 0) {
                        var16 = class64.method470(var13, true);
                    }
                    if (!var16) {
                        class56.field1226++;
                        class6.method26(0, var13.field2940, var13.field2960, class133.field3262, (byte) -51, 0, 20);
                    }
                }
                if (var13.field2965 == 2 && !class117.field2783 && var15 <= arg10 && var14 <= arg6 && var13.field2984 + var15 > arg10 && var13.field2872 + var14 > arg6) {
                    class6 var17 = var13.method988(class30.field717, 64);
                    if (var17 != null) {
                        class103.field2442++;
                        class6.method26(-1, var17, var13.field2960, class85.method731(new class6[] { class70.field1575, var13.field2938 }, 14569), (byte) -72, 0, 14);
                    }
                }
                if (var13.field2965 == 3 && arg10 >= var15 && arg6 >= var14 && var15 + var13.field2984 > arg10 && var13.field2872 + var14 > arg6) {
                    class66.field1443++;
                    byte var18;
                    if (arg7 == 3) {
                        var18 = 24;
                    } else {
                        var18 = 29;
                    }
                    class6.method26(0, class126.field3091, var13.field2960, class133.field3262, (byte) -45, 0, var18);
                }
                if (var13.field2965 == 4 && arg10 >= var15 && arg6 >= var14 && var13.field2984 + var15 > arg10 && var13.field2872 + var14 > arg6) {
                    class6.method26(0, var13.field2940, var13.field2960, class133.field3262, (byte) -118, 0, 36);
                    class73.field1672++;
                }
                if (var13.field2965 == 5 && var15 <= arg10 && var14 <= arg6 && arg10 < var13.field2984 + var15 && arg6 < var13.field2872 + var14) {
                    class6.method26(0, var13.field2940, var13.field2960, class133.field3262, (byte) -89, 0, 41);
                    class66.field1461++;
                }
                if (var13.field2965 == 6 && class96.field2272 == -1 && var15 <= arg10 && var14 <= arg6 && var15 + var13.field2984 > arg10 && var13.field2872 + var14 > arg6) {
                    class7.field142++;
                    class6.method26(-1, var13.field2940, var13.field2960, class133.field3262, (byte) -6, 0, 8);
                }
                if (var13.field2971 == 2) {
                    int var19 = 0;
                    for (int var20 = 0; var20 < var13.field2872; var20++) {
                        for (int var21 = 0; var21 < var13.field2984; var21++) {
                            int var22 = (var13.field2854 + 32) * var21 + var15;
                            int var23 = (var13.field2866 + 32) * var20 + var14;
                            if (var19 < 20) {
                                var23 += var13.field2900[var19];
                                var22 += var13.field2888[var19];
                            }
                            if (var22 <= arg10 && arg6 >= var23 && var22 + 32 > arg10 && var23 + 32 > arg6) {
                                class70.field1550 = var13.field2960;
                                class20.field413 = var19;
                                if (var13.field2963[var19] > 0) {
                                    class22 var24 = class43.method356(arg0 ^ 0x1F, var13.field2963[var19] - 1);
                                    if (class19.field382 == 1 && var13.method995(105)) {
                                        if (class96.field2284 != var13.field2960 || class37.field845 != var19) {
                                            class6.method26(var19, class76.field1792, var13.field2960, class85.method731(new class6[] { class96.field2290, class30.field736, var24.field549 }, 14569), (byte) -33, var24.field537, 18);
                                            class80.field1945++;
                                        }
                                    } else if (!class117.field2783 || !var13.method995(82)) {
                                        class6[] var25 = var24.field542;
                                        if (class82.field2012) {
                                            var25 = class26.method233((byte) 127, var25);
                                        }
                                        if (var13.method995(arg0 ^ 0xFFFFFFCD)) {
                                            for (int var26 = 4; var26 >= 3; var26--) {
                                                if (var25 != null && var25[var26] != null) {
                                                    class4.field34++;
                                                    byte var27;
                                                    if (var26 == 3) {
                                                        var27 = 32;
                                                    } else {
                                                        var27 = 19;
                                                    }
                                                    class6.method26(var19, var25[var26], var13.field2960, class85.method731(new class6[] { class111.field2661, var24.field549 }, 14569), (byte) -99, var24.field537, var27);
                                                } else if (var26 == 4) {
                                                    class5.field58++;
                                                    class6.method26(var19, class136.field3318, var13.field2960, class85.method731(new class6[] { class111.field2661, var24.field549 }, 14569), (byte) -103, var24.field537, 19);
                                                }
                                            }
                                        }
                                        if (var13.method984(arg0 ^ 0xFFFFFFAE)) {
                                            class6.method26(var19, class76.field1792, var13.field2960, class85.method731(new class6[] { class111.field2661, var24.field549 }, 14569), (byte) -73, var24.field537, 23);
                                            class25.field624++;
                                        }
                                        class118.field2798++;
                                        if (var13.method995(arg0 ^ 0xFFFFFF93) && var25 != null) {
                                            for (int var28 = 2; var28 >= 0; var28--) {
                                                if (var25[var28] != null) {
                                                    class16.field320++;
                                                    byte var29 = 0;
                                                    if (var28 == 0) {
                                                        var29 = 28;
                                                    }
                                                    if (var28 == 1) {
                                                        var29 = 16;
                                                    }
                                                    if (var28 == 2) {
                                                        var29 = 54;
                                                    }
                                                    class6.method26(var19, var25[var28], var13.field2960, class85.method731(new class6[] { class111.field2661, var24.field549 }, arg0 ^ 0xFFFFC716), (byte) -117, var24.field537, var29);
                                                }
                                            }
                                        }
                                        class6[] var30 = var13.field2907;
                                        if (class82.field2012) {
                                            var30 = class26.method233((byte) 127, var30);
                                        }
                                        if (var30 != null) {
                                            for (int var31 = 4; var31 >= 0; var31--) {
                                                if (var30[var31] != null) {
                                                    byte var32 = 0;
                                                    if (var31 == 0) {
                                                        var32 = 35;
                                                    }
                                                    class109.field2639++;
                                                    if (var31 == 1) {
                                                        var32 = 30;
                                                    }
                                                    if (var31 == 2) {
                                                        var32 = 26;
                                                    }
                                                    if (var31 == 3) {
                                                        var32 = 25;
                                                    }
                                                    if (var31 == 4) {
                                                        var32 = 49;
                                                    }
                                                    class6.method26(var19, var30[var31], var13.field2960, class85.method731(new class6[] { class111.field2661, var24.field549 }, 14569), (byte) -117, var24.field537, var32);
                                                }
                                            }
                                        }
                                        class6.method26(var19, class25.field636, var13.field2960, class85.method731(new class6[] { class111.field2661, var24.field549 }, 14569), (byte) -53, var24.field537, 1004);
                                    } else if ((class70.field1562 & 0x10) == 16) {
                                        class6.method26(var19, client.field472, var13.field2960, class85.method731(new class6[] { class20.field395, class30.field736, var24.field549 }, 14569), (byte) -109, var24.field537, 5);
                                        class30.field715++;
                                    }
                                }
                            }
                            var19++;
                        }
                    }
                }
                if (var13.field2870) {
                    if (class117.field2783) {
                        if (var13.method976(12117) && (class70.field1562 & 0x20) == 32 && arg10 >= var15 && arg6 >= var14 && var13.field2984 + var15 > arg10 && var13.field2872 + var14 > arg6) {
                            class6.method26(var13.field2980, client.field472, var13.field2960, class85.method731(new class6[] { class20.field395, class16.field324, var13.field2937 }, 14569), (byte) -91, 0, 39);
                            class122.field3010++;
                        }
                    } else if (arg10 >= var15 && var14 <= arg6 && var13.field2984 + var15 > arg10 && arg6 < var13.field2872 + var14) {
                        for (int var33 = 9; var33 >= 5; var33--) {
                            class6 var37 = var13.method997(class30.field717, (byte) 50, var33);
                            if (var37 != null) {
                                class125.field3049++;
                                class6.method26(var13.field2980, var37, var13.field2960, var13.field2937, (byte) -64, var33 + 1, 51);
                            }
                        }
                        class6 var34 = var13.method988(class30.field717, arg0 + 65);
                        if (var34 != null) {
                            class103.field2442++;
                            class6.method26(var13.field2980, var34, var13.field2960, var13.field2937, (byte) -20, 0, 14);
                        }
                        for (int var35 = 4; var35 >= 0; var35--) {
                            class6 var36 = var13.method997(class30.field717, (byte) -105, var35);
                            if (var36 != null) {
                                class125.field3049++;
                                class6.method26(var13.field2980, var36, var13.field2960, var13.field2937, (byte) -54, var35 + 1, 51);
                            }
                        }
                        if (var13.method994(125)) {
                            class7.field142++;
                            class6.method26(-1, var13.field2940, var13.field2960, class133.field3262, (byte) -126, 0, 8);
                        }
                    }
                }
            }
        }
    }
}
