import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class68 implements class299 {

    @OriginalMember(owner = "client!la", name = "c", descriptor = "[Lae;")
    public static class23[] field1091 = new class23[27];

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lbd;")
    private static class162 field1094 = class17.method142(0, "Loading fonts )2 ");

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lbd;")
    public static class162 field1095 = field1094;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lbd;")
    public static class162 field1089 = class17.method142(0, "gelb:");

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Lbd;")
    public static class162 field1096 = class17.method142(0, "scrollbar");

    @OriginalMember(owner = "client!la", name = "l", descriptor = "[I")
    public static int[] field1100 = new int[32];

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 8)
    public static void method484(byte arg0) {
        field1096 = null;
        if (arg0 != -63) {
            field1089 = (class162) null;
        }
        field1091 = null;
        field1089 = null;
        field1095 = null;
        field1094 = null;
        field1100 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[IJZ)Lbd;", line = 23)
    public final class162 method485(int arg0, int[] arg1, long arg2, boolean arg3) {
        if (arg3) {
            return (class162) null;
        }
        field1097++;
        if (arg0 == 0) {
            class313 var7 = class179.method1359(19661184, arg1[0]);
            return var7.method2141(0, (int) arg2);
        } else if (arg0 == 1 || arg0 == 10) {
            class116 var6 = class304.method2075((int) arg2, 4);
            return var6.field2091;
        } else if (arg0 == 6 || arg0 == 7) {
            return class179.method1359(19661184, arg1[0]).method2141(0, (int) arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILsi;Ldj;ILlb;I)V", line = 69)
    public static final void method486(int arg0, int arg1, int arg2, class311 arg3, class39 arg4, int arg5, class60 arg6, int arg7) {
        field1093++;
        class64 var8 = new class64();
        var8.field1021 = arg0 * 128;
        var8.field1006 = arg7 * 128;
        var8.field1011 = arg5;
        int var9 = -56 / ((arg1 - 44) / 62);
        if (arg3 != null) {
            var8.field1024 = arg3.field5213;
            var8.field997 = arg3.field5249;
            var8.field1002 = arg3.field5202 * 128;
            var8.field1017 = arg3;
            var8.field1004 = arg3.field5206;
            var8.field992 = arg3.field5215;
            int var10 = arg3.field5201;
            int var11 = arg3.field5217;
            if (arg2 == 1 || arg2 == 3) {
                var10 = arg3.field5217;
                var11 = arg3.field5201;
            }
            var8.field1013 = (arg7 + var10) * 128;
            var8.field1023 = (arg0 + var11) * 128;
            if (arg3.field5191 != null) {
                var8.field1022 = true;
                var8.method442((byte) -119);
            }
            if (var8.field1004 != null) {
                var8.field1009 = (int) (Math.random() * (double) (var8.field1024 - var8.field997)) + var8.field997;
            }
            class149.field2678.method167(false, var8);
        } else if (arg6 != null) {
            var8.field995 = arg6;
            class83 var12 = arg6.field926;
            if (var12.field1502 != null) {
                var8.field1022 = true;
                var12 = var12.method643(true);
            }
            if (var12 != null) {
                var8.field1013 = (arg7 + var12.field1485) * 128;
                var8.field1023 = (var12.field1485 + arg0) * 128;
                var8.field992 = class84.method649(false, arg6);
                var8.field1002 = var12.field1451 * 128;
            }
            client.field1884.method167(false, var8);
        } else if (arg4 != null) {
            var8.field996 = arg4;
            var8.field1013 = (arg4.method293((byte) 25) + arg7) * 128;
            var8.field1023 = (arg0 + arg4.method293((byte) 25)) * 128;
            var8.field992 = class119.method973(arg4, true);
            var8.field1002 = arg4.field609 * 128;
            class51.field811.method1674(var8, false, arg4.field611.method1256(0));
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[[F[[F[[I[[B[[B[[BI[[F[Laa;[[B)V", line = 157)
    public static final void method487(int arg0, int arg1, float[][] arg2, float[][] arg3, int[][] arg4, byte[][] arg5, byte[][] arg6, byte[][] arg7, int arg8, float[][] arg9, class196[] arg10, byte[][] arg11) {
        for (int var12 = 0; var12 < arg0; var12++) {
            class196 var13 = arg10[var12];
            if (var13.field3337 == arg1) {
                int var14 = 0;
                class130 var15 = new class130();
                int var16 = (var13.field3334 >> 7) - var13.field3349;
                int var17 = (var13.field3335 >> 7) + var13.field3349;
                if (var17 > 103) {
                    var17 = 103;
                }
                int var18 = (var13.field3335 >> 7) - var13.field3349;
                if (var18 < 0) {
                    var14 -= var18;
                    var18 = 0;
                }
                for (int var19 = var18; var19 <= var17; var19++) {
                    short var20 = var13.field3345[var14];
                    int var21 = (var20 >> 8) + var16;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg11[var23][var19] & 0xFF;
                        boolean var25 = false;
                        int var26 = arg5[var23][var19] & 0xFF;
                        if (var24 == 0) {
                            if (var26 == 0) {
                                continue;
                            }
                            class266 var31 = class83.method644(-124, var26 - 1);
                            if (var31.field4426 == -1) {
                                continue;
                            }
                            if (arg7[var23][var19] != 0) {
                                int[] var55 = class43.field710[arg7[var23][var19]];
                                var15.field2340 += (var55.length >> 1) * 3 - 6;
                                var15.field2345 += var55.length >> 1;
                                continue;
                            }
                        } else if (var26 != 0) {
                            class266 var27 = class83.method644(-117, var26 - 1);
                            if (var27.field4426 == -1) {
                                byte var29 = arg7[var23][var19];
                                if (var29 != 0) {
                                    int[] var30 = class230.field3830[var29];
                                    var15.field2340 += (var30.length >> 1) * 3 - 6;
                                    var15.field2345 += var30.length >> 1;
                                }
                                continue;
                            }
                            byte var28 = arg7[var23][var19];
                            if (var28 != 0) {
                                var25 = true;
                            }
                        }
                        class43 var32 = class112.method899(arg1, var23, var19);
                        if (var32 != null) {
                            int var33 = (int) (var32.field697 >> 14) & 0x3F;
                            if (var33 == 9) {
                                int[] var34 = null;
                                int var35 = (int) (var32.field697 >> 20) & 0x3;
                                if ((var35 & 0x1) == 0) {
                                    boolean var36 = var23 + 1 <= var22;
                                    boolean var37 = var21 <= (var23 - 1);
                                    if (!var37 && (var19 + 1) <= var17) {
                                        short var38 = var13.field3345[var14 + 1];
                                        int var39 = (var38 >> 8) + var16;
                                        int var40 = (var38 & 0xFF) + var39;
                                        var37 = var39 < var23 && var23 < var40;
                                    }
                                    if (!var36 && var18 <= (var19 - 1)) {
                                        short var41 = var13.field3345[var14 - 1];
                                        int var42 = (var41 >> 8) + var16;
                                        int var43 = (var41 & 0xFF) + var42;
                                        var36 = var23 > var42 && var43 > var23;
                                    }
                                    if (var37 && var36) {
                                        var34 = class43.field710[0];
                                    } else if (var37) {
                                        var34 = class43.field710[1];
                                    } else if (var36) {
                                        var34 = class43.field710[1];
                                    }
                                } else {
                                    boolean var44 = var23 + 1 <= var22;
                                    boolean var45 = var21 <= var23 - 1;
                                    if (!var45 && (var19 - 1) >= var18) {
                                        short var46 = var13.field3345[var14 - 1];
                                        int var47 = (var46 >> 8) + var16;
                                        int var48 = var47 + (var46 & 0xFF);
                                        var45 = var47 < var23 && var48 > var23;
                                    }
                                    if (!var44 && (var19 + 1) <= var17) {
                                        short var49 = var13.field3345[var14 + 1];
                                        int var50 = (var49 >> 8) + var16;
                                        int var51 = (var49 & 0xFF) + var50;
                                        var44 = var23 > var50 && var51 > var23;
                                    }
                                    if (var45 && var44) {
                                        var34 = class43.field710[0];
                                    } else if (var45) {
                                        var34 = class43.field710[1];
                                    } else if (var44) {
                                        var34 = class43.field710[1];
                                    }
                                }
                                if (var34 != null) {
                                    var15.field2340 += (var34.length >> 1) * 3 - 6;
                                    var15.field2345 += var34.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var25) {
                            int[] var52 = class43.field710[arg7[var23][var19]];
                            int[] var53 = class230.field3830[arg7[var23][var19]];
                            var15.field2340 += ((var52.length >> 1) - 2) * 3;
                            var15.field2340 += ((var53.length >> 1) - 2) * 3;
                            var15.field2345 += var52.length >> 1;
                            var15.field2345 += var53.length >> 1;
                        } else {
                            int[] var54 = class43.field710[0];
                            var15.field2340 += (var54.length >> 1) * 3 - 6;
                            var15.field2345 += var54.length >> 1;
                        }
                    }
                    var14++;
                }
                int var56 = 0;
                var15.method1040();
                if ((var13.field3335 >> 7) - var13.field3349 < 0) {
                    var56 -= (var13.field3335 >> 7) - var13.field3349;
                }
                for (int var57 = var18; var57 <= var17; var57++) {
                    short var58 = var13.field3345[var56];
                    int var59 = var16 + (var58 >> 8);
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg6[var61][var57];
                        int var63 = arg11[var61][var57] & 0xFF;
                        boolean var64 = false;
                        int var65 = arg5[var61][var57] & 0xFF;
                        if (var63 == 0) {
                            if (var65 == 0) {
                                continue;
                            }
                            class266 var66 = class83.method644(-125, var65 - 1);
                            if (var66.field4426 == -1) {
                                continue;
                            }
                            if (arg7[var61][var57] != 0) {
                                class66.method468(class43.field710[arg7[var61][var57]], arg9, var15, var13, arg6[var61][var57], arg4, var57, arg2, (byte) 115, var61, arg3);
                                continue;
                            }
                        } else if (var65 == 0) {
                            var62 = 0;
                        } else {
                            class266 var67 = class83.method644(-121, var65 - 1);
                            if (var67.field4426 == -1) {
                                class66.method468(class230.field3830[arg7[var61][var57]], arg9, var15, var13, arg6[var61][var57], arg4, var57, arg2, (byte) 115, var61, arg3);
                                continue;
                            }
                            byte var68 = arg7[var61][var57];
                            if (var68 != 0) {
                                var64 = true;
                            }
                        }
                        class43 var69 = class112.method899(arg1, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field697 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int var71 = (int) (var69.field697 >> 20) & 0x3;
                                int[] var72 = null;
                                if ((var71 & 0x1) == 0) {
                                    boolean var81 = var61 + 1 <= var60;
                                    boolean var82 = var59 <= var61 - 1;
                                    if (!var82 && (var57 + 1) <= var17) {
                                        short var83 = var13.field3345[var56 + 1];
                                        int var84 = (var83 >> 8) + var16;
                                        int var85 = (var83 & 0xFF) + var84;
                                        var82 = var61 > var84 && var61 < var85;
                                    }
                                    if (!var81 && var57 - 1 >= var18) {
                                        short var86 = var13.field3345[var56 - 1];
                                        int var87 = var16 + (var86 >> 8);
                                        int var88 = (var86 & 0xFF) + var87;
                                        var81 = var61 > var87 && var88 > var61;
                                    }
                                    if (var82 && var81) {
                                        var72 = class43.field710[0];
                                    } else if (var82) {
                                        var62 = 1;
                                        var72 = class43.field710[1];
                                    } else if (var81) {
                                        var62 = 3;
                                        var72 = class43.field710[1];
                                    }
                                } else {
                                    boolean var73 = var59 <= (var61 - 1);
                                    if (!var73 && var18 <= (var57 - 1)) {
                                        short var74 = var13.field3345[var56 - 1];
                                        int var75 = (var74 >> 8) + var16;
                                        int var76 = var75 + (var74 & 0xFF);
                                        var73 = var75 < var61 && var76 > var61;
                                    }
                                    boolean var77 = var60 >= var61 + 1;
                                    if (!var77 && var57 + 1 <= var17) {
                                        short var78 = var13.field3345[var56 + 1];
                                        int var79 = (var78 >> 8) + var16;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var77 = var61 > var79 && var80 > var61;
                                    }
                                    if (var73 && var77) {
                                        var72 = class43.field710[0];
                                    } else if (var73) {
                                        var72 = class43.field710[1];
                                        var62 = 0;
                                    } else if (var77) {
                                        var62 = 2;
                                        var72 = class43.field710[1];
                                    }
                                }
                                if (var72 != null) {
                                    class66.method468(var72, arg9, var15, var13, var62, arg4, var57, arg2, (byte) 115, var61, arg3);
                                }
                                continue;
                            }
                        }
                        if (var64) {
                            class66.method468(class230.field3830[arg7[var61][var57]], arg9, var15, var13, arg6[var61][var57], arg4, var57, arg2, (byte) 115, var61, arg3);
                            class66.method468(class43.field710[arg7[var61][var57]], arg9, var15, var13, arg6[var61][var57], arg4, var57, arg2, (byte) 115, var61, arg3);
                        } else {
                            class66.method468(class43.field710[0], arg9, var15, var13, var62, arg4, var57, arg2, (byte) 115, var61, arg3);
                        }
                    }
                    var56++;
                }
                if (var15.field2353 > 0 && var15.field2344 > 0) {
                    var15.method1042();
                    var13.field3350 = var15;
                }
            }
        }
        if (arg8 >= -119) {
            method487(37, -34, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), 98, (float[][]) ((float[][]) null), (class196[]) null, (byte[][]) ((byte[][]) null));
        }
        field1099++;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V", line = 685)
    public static final void method488(byte arg0) {
        if (arg0 != 28) {
            return;
        }
        field1090++;
        for (class148 var1 = (class148) class291.field4899.method169(-127); var1 != null; var1 = (class148) class291.field4899.method165((byte) -101)) {
            class110 var2 = var1.field2672;
            if (class157.field2765 != var2.field1997 || class90.field1598 > var2.field1971) {
                var1.method1183(false);
            } else if (class90.field1598 >= var2.field1966) {
                if (var2.field1970 > 0) {
                    class60 var3 = class204.field3446[var2.field1970 - 1];
                    if (var3 != null && var3.field5013 >= 0 && var3.field5013 < 13312 && var3.field5047 >= 0 && var3.field5047 < 13312) {
                        var2.method892(class90.field1598, var3.field5047, var3.field5013, (byte) 127, class3.method15(var3.field5013, var2.field1997, var3.field5047, false) - var2.field1964);
                    }
                }
                if (var2.field1970 < 0) {
                    int var4 = -var2.field1970 - 1;
                    class39 var5;
                    if (class263.field4390 == var4) {
                        var5 = class122.field2215;
                    } else {
                        var5 = class270.field4520[var4];
                    }
                    if (var5 != null && var5.field5013 >= 0 && var5.field5013 < 13312 && var5.field5047 >= 0 && var5.field5047 < 13312) {
                        var2.method892(class90.field1598, var5.field5047, var5.field5013, (byte) 127, class3.method15(var5.field5013, var2.field1997, var5.field5047, false) - var2.field1964);
                    }
                }
                var2.method889(-88, class149.field2680);
                class238.method1684(class157.field2765, (int) var2.field2001, (int) var2.field1988, (int) var2.field1974, 60, var2, var2.field1987, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(B)V", line = 743)
    public static final void method489(byte arg0) {
        field1092++;
        class116.method913(true, 0, 0);
        if (arg0 <= 50) {
            field1096 = (class162) null;
        }
    }
}
