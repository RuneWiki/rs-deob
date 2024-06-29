import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class196 {

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "[S")
    public static short[] field3292 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "[I")
    public static int[] field3290 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "[Lbh;")
    public static class258[] field3295;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 7)
    public static void method1461(byte arg0) {
        field3295 = null;
        if (arg0 >= 54) {
            field3290 = null;
            field3292 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([[FBB[[IILcg;IBII[[FIIIZ[[F)V", line = 20)
    public static final void method1462(float[][] arg0, byte arg1, byte arg2, int[][] arg3, int arg4, class38 arg5, int arg6, byte arg7, int arg8, int arg9, float[][] arg10, int arg11, int arg12, int arg13, boolean arg14, float[][] arg15) {
        field3298++;
        int var16 = (arg11 << 8) + 255;
        int var17 = (arg6 << 8) + 255;
        int var18 = (arg12 << 8) + 255;
        int var19 = (arg13 << 8) + 255;
        int[] var20 = class238.field4010[arg1];
        int[] var21 = new int[var20.length >> 1];
        int[] var22 = null;
        if (arg7 < 125) {
            field3292 = (short[]) null;
        }
        for (int var23 = 0; var23 < var21.length; var23++) {
            var21[var23] = class82.method684(var20[var23 + var23 + 1], false, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, var20[var23 + var23], arg9, arg3, arg2, arg4, var17);
        }
        if (arg14) {
            if (arg1 == 1) {
                var22 = new int[6];
                int var25 = class82.method684(128, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 64, arg9, arg3, arg2, arg4, var17);
                int var26 = class82.method684(64, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 128, arg9, arg3, arg2, arg4, var17);
                var22[2] = var21[2];
                var22[3] = var25;
                var22[1] = var25;
                var22[5] = var21[2];
                var22[0] = var26;
                var22[4] = var21[0];
            } else if (arg1 == 2) {
                var22 = new int[6];
                int var27 = class82.method684(128, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 128, arg9, arg3, arg2, arg4, var17);
                int var28 = class82.method684(0, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 64, arg9, arg3, arg2, arg4, var17);
                var22[1] = var28;
                var22[2] = var27;
                var22[0] = var21[0];
                var22[5] = var21[0];
                var22[3] = var27;
                var22[4] = var21[1];
            } else if (arg1 == 3) {
                var22 = new int[6];
                int var29 = class82.method684(128, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 0, arg9, arg3, arg2, arg4, var17);
                int var30 = class82.method684(0, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 64, arg9, arg3, arg2, arg4, var17);
                var22[1] = var21[1];
                var22[4] = var30;
                var22[0] = var21[2];
                var22[3] = var29;
                var22[2] = var29;
                var22[5] = var21[2];
            } else if (arg1 == 4) {
                int var43 = class82.method684(128, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 0, arg9, arg3, arg2, arg4, var17);
                var22 = new int[] { var21[3], var43, var21[0] };
            } else if (arg1 == 5) {
                int var31 = class82.method684(128, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 128, arg9, arg3, arg2, arg4, var17);
                var22 = new int[] { var21[2], var31, var21[3] };
            } else if (arg1 == 6) {
                int var32 = class82.method684(0, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 128, arg9, arg3, arg2, arg4, var17);
                int var33 = class82.method684(128, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 128, arg9, arg3, arg2, arg4, var17);
                var22 = new int[] { var21[3], var32, var33, var33, var21[0], var21[3] };
            } else if (arg1 == 7) {
                var22 = new int[6];
                int var34 = class82.method684(128, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 0, arg9, arg3, arg2, arg4, var17);
                int var35 = class82.method684(0, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 128, arg9, arg3, arg2, arg4, var17);
                var22[0] = var21[1];
                var22[3] = var34;
                var22[2] = var34;
                var22[4] = var21[2];
                var22[1] = var35;
                var22[5] = var21[1];
            } else if (arg1 == 8) {
                var22 = new int[3];
                int var42 = class82.method684(0, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 0, arg9, arg3, arg2, arg4, var17);
                var22[1] = var42;
                var22[2] = var21[4];
                var22[0] = var21[3];
            } else if (arg1 == 9) {
                var22 = new int[15];
                int var39 = class82.method684(64, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 128, arg9, arg3, arg2, arg4, var17);
                int var40 = class82.method684(32, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 96, arg9, arg3, arg2, arg4, var17);
                int var41 = class82.method684(0, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 64, arg9, arg3, arg2, arg4, var17);
                var22[12] = var40;
                var22[6] = var40;
                var22[2] = var21[4];
                var22[14] = var41;
                var22[10] = var21[2];
                var22[9] = var40;
                var22[1] = var39;
                var22[0] = var40;
                var22[13] = var21[1];
                var22[8] = var21[2];
                var22[4] = var21[4];
                var22[3] = var40;
                var22[5] = var21[3];
                var22[7] = var21[3];
                var22[11] = var21[1];
            } else if (arg1 == 10) {
                var22 = new int[9];
                int var38 = class82.method684(128, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 0, arg9, arg3, arg2, arg4, var17);
                var22[7] = var38;
                var22[4] = var38;
                var22[5] = var21[4];
                var22[0] = var21[2];
                var22[1] = var38;
                var22[2] = var21[3];
                var22[3] = var21[3];
                var22[8] = var21[0];
                var22[6] = var21[4];
            } else if (arg1 == 11) {
                var22 = new int[12];
                int var36 = class82.method684(64, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 0, arg9, arg3, arg2, arg4, var17);
                int var37 = class82.method684(64, true, arg0, (int[][]) null, 0.0F, arg15, 14613, var19, arg5, var18, arg10, var16, 128, arg9, arg3, arg2, arg4, var17);
                var22[1] = var36;
                var22[10] = var21[1];
                var22[5] = var36;
                var22[7] = var37;
                var22[8] = var36;
                var22[11] = var37;
                var22[0] = var21[3];
                var22[2] = var21[0];
                var22[6] = var21[2];
                var22[3] = var21[3];
                var22[4] = var21[2];
                var22[9] = var21[2];
            }
        }
        arg5.method259(arg8, arg9, arg4, var21, var22, false);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)J", line = 294)
    public static final long method1463(int arg0, int arg1, int arg2) {
        class242 var3 = class271.field4681[arg0][arg1][arg2];
        return var3 == null || var3.field4092 == null ? 0L : var3.field4092.field3704;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIII)V", line = 322)
    public static final void method1464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3299++;
        class266.field4586 = 0;
        if (arg0 != 18103) {
            return;
        }
        for (int var7 = -1; var7 < class229.field3894 + class121.field2031; var7++) {
            class194 var8;
            if (var7 == -1) {
                var8 = class279.field4831;
            } else if (var7 < class229.field3894) {
                var8 = class169.field2842[class65.field1131[var7]];
            } else {
                var8 = class35.field521[class132.field2281[var7 - class229.field3894]];
            }
            if (var8 != null && var8.method744((byte) -92)) {
                if (var8 instanceof class295) {
                    class229 var9 = ((class295) var8).field5070;
                    if (var9.field3868 != null) {
                        var9 = var9.method1673(false);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class229.field3894) {
                    class229 var15 = ((class295) var8).field5070;
                    if (var15.field3868 != null) {
                        var15 = var15.method1673(false);
                    }
                    if (var15.field3832 >= 0 && var15.field3832 < class215.field3675.length) {
                        int var16;
                        if (var15.field3842 == -1) {
                            var16 = var8.method1451((byte) 114) + 15;
                        } else {
                            var16 = var15.field3842 + 15;
                        }
                        class26.method172(arg1 >> 1, arg4, var8, arg5 >> 1, arg2, true, var16);
                        if (class16.field208 > -1) {
                            class215.field3675[var15.field3832].method157(class16.field208 + arg3 - 12, arg6 - -class283.field4873 - 30);
                        }
                    }
                    class51[] var17 = class219.field3747;
                    for (int var18 = 0; var18 < var17.length; var18++) {
                        class51 var19 = var17[var18];
                        if (var19 != null && var19.field839 == 1 && class132.field2281[var7 - class229.field3894] == var19.field851 && class143.field2463 % 20 < 10) {
                            int var20;
                            if (var15.field3842 == -1) {
                                var20 = var8.method1451((byte) 114) + 15;
                            } else {
                                var20 = var15.field3842 + 15;
                            }
                            class26.method172(arg1 >> 1, arg4, var8, arg5 >> 1, arg2, true, var20);
                            if (class16.field208 > -1) {
                                class63.field1101[var19.field846].method157(arg3 + class16.field208 - 12, arg6 + -28 + class283.field4873);
                            }
                        }
                    }
                } else {
                    class96 var10 = (class96) var8;
                    int var11 = 30;
                    if (var10.field1586 != -1 || var10.field1552 != -1) {
                        class26.method172(arg1 >> 1, arg4, var8, arg5 >> 1, arg2, true, var8.method1451((byte) 114) + 15);
                        if (class16.field208 > -1) {
                            if (var10.field1586 != -1) {
                                class89.field1473[var10.field1586].method157(class16.field208 + arg3 - 12, class283.field4873 - var11 + arg6);
                                var11 += 25;
                            }
                            if (var10.field1552 != -1) {
                                class215.field3675[var10.field1552].method157(class16.field208 + arg3 - 12, class283.field4873 + arg6 + -var11);
                                var11 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var12 = 0;
                        class51[] var13 = class219.field3747;
                        while (var12 < var13.length) {
                            class51 var14 = var13[var12];
                            if (var14 != null && var14.field839 == 10 && class65.field1131[var7] == var14.field851) {
                                class26.method172(arg1 >> 1, arg4, var8, arg5 >> 1, arg2, true, var8.method1451((byte) 114) + 15);
                                if (class16.field208 > -1) {
                                    class63.field1101[var14.field846].method157(arg3 + class16.field208 - 12, class283.field4873 + arg6 + -var11);
                                }
                            }
                            var12++;
                        }
                    }
                }
                if (var8.field3243 != null && (class229.field3894 <= var7 || class185.field3065 == 0 || class185.field3065 == 3 || class185.field3065 == 1 && class263.method1882(((class96) var8).field1561, false))) {
                    class26.method172(arg1 >> 1, arg4, var8, arg5 >> 1, arg2, true, var8.method1451((byte) 114));
                    if (class16.field208 > -1 && class28.field391 > class266.field4586) {
                        class28.field390[class266.field4586] = class3.field28.method779(var8.field3243) / 2;
                        class28.field393[class266.field4586] = class3.field28.field1672;
                        class28.field394[class266.field4586] = class16.field208;
                        class28.field395[class266.field4586] = class283.field4873;
                        class28.field389[class266.field4586] = var8.field3250;
                        class28.field398[class266.field4586] = var8.field3263;
                        class28.field396[class266.field4586] = var8.field3275;
                        class28.field388[class266.field4586] = var8.field3243;
                        class266.field4586++;
                    }
                }
                if (class143.field2463 < var8.field3245) {
                    class258 var21 = class61.field1072[0];
                    class258 var22 = class61.field1072[1];
                    int var23;
                    if ((var8 instanceof class295)) {
                        class295 var24 = (class295) var8;
                        class258[] var25 = (class258[]) ((class258[]) class134.field2307.method1193((long) var24.field5070.field3836, 93));
                        if (var25 == null) {
                            var25 = class304.method2094(-7865, var24.field5070.field3836, 0, class136.field2333);
                            if (var25 != null) {
                                class134.field2307.method1194(var25, (long) var24.field5070.field3836, false);
                            }
                        }
                        class229 var26 = var24.field5070;
                        if (var25 != null && var25.length == 2) {
                            var22 = var25[1];
                            var21 = var25[0];
                        }
                        if (var26.field3842 == -1) {
                            var23 = var8.method1451((byte) 114);
                        } else {
                            var23 = var26.field3842;
                        }
                    } else {
                        var23 = var8.method1451((byte) 114);
                    }
                    class26.method172(arg1 >> 1, arg4, var8, arg5 >> 1, arg2, true, var21.field4320 + var23 + 10);
                    if (class16.field208 > -1) {
                        int var27 = class16.field208 + arg3 - (var21.field4318 >> 1);
                        int var28 = class283.field4873 + arg6 - 3;
                        var21.method157(var27, var28);
                        int var29 = var8.field3226 * var21.field4318 / 255;
                        int var30 = var21.field4320;
                        class222.method1631(var27, var28, var27 + var29, var28 + var30);
                        var22.method157(var27, var28);
                        class222.method1638(arg3, arg6, arg1 + arg3, arg5 + arg6);
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field3216[var31] > class143.field2463) {
                        int var34;
                        if (var8 instanceof class295) {
                            class295 var32 = (class295) var8;
                            class229 var33 = var32.field5070;
                            if (var33.field3842 == -1) {
                                var34 = var8.method1451((byte) 114) / 2;
                            } else {
                                var34 = var33.field3842 / 2;
                            }
                        } else {
                            var34 = var8.method1451((byte) 114) / 2;
                        }
                        class26.method172(arg1 >> 1, arg4, var8, arg5 >> 1, arg2, true, var34);
                        if (class16.field208 > -1) {
                            if (var31 == 1) {
                                class283.field4873 -= 20;
                            }
                            if (var31 == 2) {
                                class283.field4873 -= 10;
                                class16.field208 -= 15;
                            }
                            if (var31 == 3) {
                                class283.field4873 -= 10;
                                class16.field208 += 15;
                            }
                            class133.field2290[var8.field3235[var31]].method157(class16.field208 + arg3 - 12, class283.field4873 + arg6 - 12);
                            class132.field2280.method774(class67.method565(86, var8.field3212[var31]), arg3 + class16.field208 - 1, arg6 + 3 + class283.field4873, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var35 = 0; var35 < class266.field4586; var35++) {
            int var36 = class28.field394[var35];
            int var37 = class28.field395[var35];
            int var38 = class28.field393[var35];
            int var39 = class28.field390[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (class28.field395[var41] - class28.field393[var41] < var37 + 2 && (var37 - var38) < (class28.field395[var41] + 2) && class28.field394[var41] + class28.field390[var41] > -var39 + var36 && class28.field394[var41] - class28.field390[var41] < var36 + var39 && class28.field395[var41] - class28.field393[var41] < var37) {
                        var37 = class28.field395[var41] - class28.field393[var41];
                        var40 = true;
                    }
                }
            }
            class16.field208 = class28.field394[var35];
            class283.field4873 = class28.field395[var35] = var37;
            class75 var42 = class28.field388[var35];
            if (class270.field4656 == 0) {
                int var43 = 16776960;
                if (class28.field389[var35] < 6) {
                    var43 = class140.field2439[class28.field389[var35]];
                }
                if (class28.field389[var35] == 6) {
                    var43 = class190.field3167 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class28.field389[var35] == 7) {
                    var43 = (class190.field3167 % 20) < 10 ? 255 : 65535;
                }
                if (class28.field389[var35] == 8) {
                    var43 = (class190.field3167 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class28.field389[var35] == 9) {
                    int var44 = 150 - class28.field396[var35];
                    if (var44 < 50) {
                        var43 = (var44 * 1280) + 16711680;
                    } else if (var44 < 100) {
                        var43 = 33160960 - var44 * 327680;
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (class28.field389[var35] == 10) {
                    int var45 = 150 - class28.field396[var35];
                    if (var45 < 50) {
                        var43 = (var45 * 5) + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - (var45 - 50) * 327680;
                    } else if (var45 < 150) {
                        var43 = (var45 * 327680) + 500 - (var45 * 5 + 32767745);
                    }
                }
                if (class28.field389[var35] == 11) {
                    int var46 = 150 - class28.field396[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - var46 * 327685;
                    } else if (var46 < 100) {
                        var43 = var46 * 327685 + 65280 - 16384250;
                    } else if (var46 < 150) {
                        var43 = 16777215 - (var46 - 100) * 327680;
                    }
                }
                if (class28.field398[var35] == 0) {
                    class3.field28.method774(var42, class16.field208 + arg3, class283.field4873 + arg6, var43, 0);
                }
                if (class28.field398[var35] == 1) {
                    class3.field28.method778(var42, arg3 + class16.field208, class283.field4873 + arg6, var43, 0, class190.field3167);
                }
                if (class28.field398[var35] == 2) {
                    class3.field28.method790(var42, class16.field208 + arg3, class283.field4873 + arg6, var43, 0, class190.field3167);
                }
                if (class28.field398[var35] == 3) {
                    class3.field28.method777(var42, class16.field208 + arg3, class283.field4873 + arg6, var43, 0, class190.field3167, 150 - class28.field396[var35]);
                }
                if (class28.field398[var35] == 4) {
                    int var47 = (150 - class28.field396[var35]) * (class3.field28.method779(var42) + 100) / 150;
                    class222.method1631(class16.field208 + arg3 - 50, arg6, class16.field208 + arg3 + 50, arg5 + arg6);
                    class3.field28.method784(var42, class16.field208 + arg3 + 50 - var47, class283.field4873 + arg6, var43, 0);
                    class222.method1638(arg3, arg6, arg1 + arg3, arg5 + arg6);
                }
                if (class28.field398[var35] == 5) {
                    int var48 = 0;
                    int var49 = 150 - class28.field396[var35];
                    class222.method1631(arg3, arg6 + class283.field4873 - class3.field28.field1672 - 1, arg3 - -arg1, arg6 + class283.field4873 + 5);
                    if (var49 < 25) {
                        var48 = var49 - 25;
                    } else if (var49 > 125) {
                        var48 = var49 - 125;
                    }
                    class3.field28.method774(var42, arg3 + class16.field208, class283.field4873 + arg6 + var48, var43, 0);
                    class222.method1638(arg3, arg6, arg1 + arg3, arg5 + arg6);
                }
            } else {
                class3.field28.method774(var42, class16.field208 + arg3, class283.field4873 + arg6, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 793)
    public static final void method1465(int arg0) {
        field3296++;
        if (arg0 != 3) {
            field3290 = (int[]) null;
        }
        if (class263.field4546 != null) {
            class310 var1 = class263.field4546;
            synchronized (class263.field4546) {
                class263.field4546 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZIZZI)Lcb;", line = 815)
    public static final class267 method1466(boolean arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        class188 var5 = null;
        if (arg1 != 69051521) {
            return (class267) null;
        }
        field3294++;
        if (class245.field4119 != null) {
            var5 = new class188(arg4, class245.field4119, class10.field126[arg4], 1000000);
        }
        class175.field2940[arg4] = class83.field1389.method1949(class111.field1900, var5, (byte) -91, arg4);
        if (arg3) {
            class175.field2940[arg4].method1413(false);
        }
        return new class267(class175.field2940[arg4], arg2, arg0);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)[B", line = 847)
    public static final synchronized byte[] method1467(int arg0, int arg1) {
        if (arg0 != 6386) {
            method1463(95, -1, -56);
        }
        field3291++;
        if (arg1 == 100 && class200.field3383 > 0) {
            byte[] var2 = class217.field3706[--class200.field3383];
            class217.field3706[class200.field3383] = null;
            return var2;
        } else if (arg1 == 5000 && class134.field2311 > 0) {
            byte[] var3 = class79.field1354[--class134.field2311];
            class79.field1354[class134.field2311] = null;
            return var3;
        } else if (arg1 == 30000 && class143.field2472 > 0) {
            byte[] var4 = class162.field2762[--class143.field2472];
            class162.field2762[class143.field2472] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
