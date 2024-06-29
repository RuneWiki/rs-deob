import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class37 {

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Lec;")
    public static class25 field480 = new class25(8);

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Ljava/lang/String;")
    public static String field481 = "M";

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field482 = 0;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "[Lma;")
    public static class202[] field483 = new class202[2048];

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field484 = 0;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "Ljava/lang/String;")
    public static String field487 = null;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Lbe;")
    public static class30 field485;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method227(int arg0, Component arg1);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)I")
    public static final int method228(byte arg0) {
        field476++;
        int var1 = 89 % ((arg0 - 26) / 58);
        return class253.field4019 && class3.field26[81] && class18.field251 > 2 ? class214.field3420[class18.field251 - 2] : class214.field3420[class18.field251 - 1];
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lfa;B)V")
    public static final void method229(class273 arg0, byte arg1) {
        field474++;
        class199.field3156 = class2.method7(true, 0, arg0, class124.field1903);
        class71.field1027 = class2.method7(true, 0, arg0, class103.field1554);
        class141.field2172 = class2.method7(true, 0, arg0, class135.field2110);
        class173.field2689 = class2.method7(true, 0, arg0, class197.field3129);
        class127.field1961 = class2.method7(true, 0, arg0, class115.field1743);
        class197.field3126 = class2.method7(true, 0, arg0, class48.field668);
        class250.field3987 = class8.method42(0, class29.field368, (byte) 68, arg0);
        class274.field4519 = class8.method42(0, class304.field4967, (byte) 105, arg0);
        if (arg1 != -123) {
            return;
        }
        class25.field320 = class8.method42(0, class85.field1344, (byte) 31, arg0);
        class176.field2749 = class241.method1686(0, class260.field4265, arg1 ^ 0x26, arg0);
        class126.field1958 = class241.method1686(0, class165.field2602, -121, arg0);
        class249.field3970.method751(class126.field1958, (int[]) null);
        class48.field667.method751(class126.field1958, (int[]) null);
        class202.field3227.method751(class126.field1958, (int[]) null);
        class38 var2 = class14.method86(0, class107.field1651, arg1 ^ 0xFFFFFFE4, arg0);
        var2.method259();
        class60.field922 = var2;
        class38[] var3 = class309.method2106(-6409, 0, class84.field1323, arg0);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method259();
        }
        class236.field3746 = var3;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
    public static void method230(byte arg0) {
        field485 = null;
        field481 = null;
        field480 = null;
        if (arg0 != -17) {
            method234(-95);
        }
        field483 = null;
        field487 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIIIII[BZI[Lwi;I)[I")
    public static final int[] method231(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, boolean arg7, int arg8, class142[] arg9, int arg10) {
        field479++;
        if (!arg7) {
            return null;
        }
        int var11 = (arg10 & 0x7) * 8;
        int var12 = (arg4 & 0x7) * 8;
        byte var13;
        if (arg0) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        if (!arg0) {
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class254.method1754(arg8, var14 & 0x7, (byte) -15, var15 & 0x7) + arg1;
                    int var17 = class35.method203(arg8, 3, var14 & 0x7, var15 & 0x7) + arg5;
                    if (var16 > 0 && var16 < 103 && var17 > 0 && var17 < 103) {
                        arg9[arg3].field2211[var16][var17] = class10.method53(arg9[arg3].field2211[var16][var17], -2097153);
                    }
                }
            }
        }
        class202 var18 = new class202(arg6);
        int var19 = arg10 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        int var21 = arg4 & 0x1FFFFFF8 << 3;
        byte var22 = 0;
        if (arg8 == 1) {
            var22 = 1;
        } else if (arg8 == 2) {
            var22 = 1;
            var20 = 1;
        } else if (arg8 == 3) {
            var20 = 1;
        }
        for (int var23 = 0; var23 < var13; var23++) {
            for (int var44 = 0; var44 < 64; var44++) {
                for (int var45 = 0; var45 < 64; var45++) {
                    if (arg2 != var23 || var44 < var11 || var44 > (var11 + 8) || var12 > var45 || var45 > (var12 + 8)) {
                        class164.method1104(0, arg0, 0, -1, 0, 0, var18, 0, 0, (byte) -126, -1, false);
                    } else if (var11 + 8 == var44 || (var12 + 8) == var45) {
                        int var52;
                        int var53;
                        if (arg8 == 0) {
                            var53 = arg1 + var44 - var11;
                            var52 = arg5 - (var12 - var45);
                        } else if (arg8 == 1) {
                            var53 = var45 - (var12 - arg1);
                            var52 = arg5 - (var44 - var11 - 8);
                        } else if (arg8 == 2) {
                            var52 = var12 + arg5 + 8 - var45;
                            var53 = var11 + arg1 + 8 - var44;
                        } else {
                            var52 = var44 + arg5 - var11;
                            var53 = var12 + arg1 + 8 - var45;
                        }
                        class164.method1104(var21 + var45, arg0, arg3, var53, 0, 0, var18, 0, var19 + var44, (byte) -125, var52, true);
                    } else {
                        int var46 = arg1 + class254.method1754(arg8, var44 & 0x7, (byte) -15, var45 & 0x7);
                        int var47 = arg5 + class35.method203(arg8, 3, var44 & 0x7, var45 & 0x7);
                        class164.method1104(var21 + var45, arg0, arg3, var46, var20, arg8, var18, var22, var19 + var44, (byte) -125, var47, false);
                        if (var44 == 63 || var45 == 63) {
                            int var48 = var44 == 63 ? 64 : var44;
                            int var49 = var45 == 63 ? 64 : var45;
                            int var50;
                            int var51;
                            if (arg8 == 0) {
                                var50 = arg5 + var49 - var12;
                                var51 = var48 + arg1 - var11;
                            } else if (arg8 == 1) {
                                var50 = var11 + arg5 + 8 - var48;
                                var51 = arg1 + var49 - var12;
                            } else if (arg8 == 2) {
                                var50 = var12 + arg5 + 8 - var49;
                                var51 = var11 + arg1 + 8 - var48;
                            } else {
                                var51 = var12 + arg1 + 8 - var49;
                                var50 = var48 + arg5 - var11;
                            }
                            if (var51 >= 0 && var51 < 104 && var50 >= 0 && var50 < 104) {
                                class242.field3842[arg3][var51][var50] = class242.field3842[arg3][var20 + var46][var22 + var47];
                            }
                        }
                    }
                }
            }
        }
        boolean var24 = false;
        while (var18.field3234.length > var18.field3272) {
            int var25 = var18.method1420((byte) 0);
            if (var25 == 128) {
                var24 = true;
                class179.field2779[0] = var18.method1419(91);
                class179.field2779[1] = var18.method1442(-1970239824);
                class179.field2779[2] = var18.method1442(-1970239824);
                class179.field2779[3] = var18.method1442(-1970239824);
                class179.field2779[4] = var18.method1419(125);
            } else {
                if (var25 != 129) {
                    var18.field3272--;
                    break;
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    byte var32 = var18.method1457((byte) -100);
                    if (var32 == 0) {
                        if (var31 <= arg2) {
                            int var33 = arg1;
                            int var34 = arg1 + 7;
                            if (var34 < 0) {
                                var34 = 0;
                            } else if (var34 >= 104) {
                                var34 = 104;
                            }
                            int var35 = arg5;
                            if (arg5 < 0) {
                                var35 = 0;
                            } else if (arg5 >= 104) {
                                var35 = 104;
                            }
                            int var36 = arg5 + 7;
                            if (arg1 < 0) {
                                var33 = 0;
                            } else if (arg1 >= 104) {
                                var33 = 104;
                            }
                            if (var36 < 0) {
                                var36 = 0;
                            } else if (var36 >= 104) {
                                var36 = 104;
                            }
                            while (var34 > var33) {
                                while (var36 > var35) {
                                    class148.field2318[arg3][var33][var35] = 0;
                                    var35++;
                                }
                                var33++;
                            }
                        }
                    } else if (var32 == 1) {
                        for (int var37 = 0; var37 < 64; var37 += 4) {
                            for (int var38 = 0; var38 < 64; var38 += 4) {
                                byte var39 = var18.method1457((byte) -40);
                                if (arg2 >= var31) {
                                    for (int var40 = var37; var40 < (var37 + 4); var40++) {
                                        for (int var41 = var38; var41 < var38 + 4; var41++) {
                                            if (var11 <= var40 && var40 < (var11 + 8) && var12 <= var41 && var12 + 8 > var12) {
                                                int var42 = class254.method1754(arg8, var40 & 0x7, (byte) -15, var41 & 0x7) + arg1;
                                                int var43 = arg5 + class35.method203(arg8, 3, var40 & 0x7, var41 & 0x7);
                                                if (var42 >= 0 && var42 < 104 && var43 >= 0 && var43 < 104) {
                                                    class148.field2318[arg3][var42][var43] = var39;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var26 = false;
        if (!var26) {
            int var27 = arg1 + 7;
            int var28 = arg5 + 7;
            for (int var29 = arg1; var29 < var27; var29++) {
                for (int var30 = arg5; var30 < var28; var30++) {
                    class148.field2318[arg3][var29][var30] = 0;
                }
            }
        }
        if (var24) {
            return class179.field2779;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method232(int arg0, Component arg1);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)I")
    public abstract int method233(int arg0);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public static final void method234(int arg0) {
        field475++;
        if (arg0 > -45) {
            field487 = null;
        }
        if (class27.field341 != -1) {
            class169.method1115(8, -1, class27.field341, -1, false);
            class27.field341 = -1;
        }
    }
}
