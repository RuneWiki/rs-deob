import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 extends class148 {

    @OriginalMember(owner = "client!hf", name = "Ic", descriptor = "I")
    public int field1204 = 0;

    @OriginalMember(owner = "client!hf", name = "Yc", descriptor = "I")
    public int field1220 = -1;

    @OriginalMember(owner = "client!hf", name = "Zc", descriptor = "I")
    public int field1221 = 0;

    @OriginalMember(owner = "client!hf", name = "Tc", descriptor = "I")
    public int field1215 = -1;

    @OriginalMember(owner = "client!hf", name = "kd", descriptor = "I")
    public int field1232 = 0;

    @OriginalMember(owner = "client!hf", name = "hd", descriptor = "Z")
    public boolean field1229 = false;

    @OriginalMember(owner = "client!hf", name = "Nc", descriptor = "I")
    public int field1209 = 0;

    @OriginalMember(owner = "client!hf", name = "jd", descriptor = "I")
    public int field1231 = 0;

    @OriginalMember(owner = "client!hf", name = "ed", descriptor = "Loa;")
    private static class98 field1226 = class38.method349(255, "System update in: ");

    @OriginalMember(owner = "client!hf", name = "Wc", descriptor = "I")
    public static int field1218 = 0;

    @OriginalMember(owner = "client!hf", name = "nd", descriptor = "Loa;")
    public static class98 field1235 = class38.method349(255, "k");

    @OriginalMember(owner = "client!hf", name = "Jc", descriptor = "Loa;")
    public static class98 field1205 = field1226;

    @OriginalMember(owner = "client!hf", name = "Kc", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "client!hf", name = "Mc", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!hf", name = "Oc", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "client!hf", name = "Pc", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!hf", name = "Sc", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!hf", name = "Vc", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!hf", name = "ad", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!hf", name = "bd", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!hf", name = "cd", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "client!hf", name = "dd", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!hf", name = "gd", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!hf", name = "ld", descriptor = "I")
    public int field1233;

    @OriginalMember(owner = "client!hf", name = "md", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!hf", name = "od", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!hf", name = "pd", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!hf", name = "Uc", descriptor = "Lt;")
    public class128 field1216;

    @OriginalMember(owner = "client!hf", name = "Rc", descriptor = "Ltb;")
    public static class130 field1213;

    @OriginalMember(owner = "client!hf", name = "Xc", descriptor = "Lkb;")
    public class71 field1219;

    @OriginalMember(owner = "client!hf", name = "id", descriptor = "Lb;")
    public static class8 field1230;

    @OriginalMember(owner = "client!hf", name = "fd", descriptor = "Lnc;")
    public static class93 field1227;

    @OriginalMember(owner = "client!hf", name = "Qc", descriptor = "Loa;")
    public class98 field1212;

    @OriginalMember(owner = "client!hf", name = "Lc", descriptor = "[I")
    public static int[] field1207;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)V")
    public static final void method448(boolean arg0) {
        ++field1214;
        try {
            Graphics var1 = class73.field1506.getGraphics();
            if (!arg0) {
                method452(13);
            }
            class97.field2244.method406(32, 4, 550, var1);
        } catch (Exception var2) {
            class73.field1506.repaint();
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B[Ltd;IIIIIIII)Z")
    public static final boolean method449(byte arg0, class132[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1208;
        class7.method52(arg8, arg2, arg5, arg4);
        boolean var10 = true;
        for (int var11 = 0; var11 < arg1.length; ++var11) {
            class132 var12 = arg1[var11];
            if (var12 != null && (~var12.field3195 == ~arg9 || ~arg9 == 1412584498 && class16.field334 == var12)) {
                if (~var12.field3126 < -1) {
                    class19.method184(false, var12);
                }
                int var13 = var12.field3216 + arg8 - arg6;
                int var14 = var12.field3102 + arg2 + -arg3;
                int var15 = var12.field3145;
                if (class16.field334 == var12) {
                    if (~arg9 != 1412584498 && !var12.field3164) {
                        class124.field2770 = -arg8 + arg6;
                        class1.field10 = arg3 - arg2;
                        class11.field244 = arg1;
                        continue;
                    }
                    class132 var16 = class58.method468((byte) -106, var12);
                    if (var16 == null) {
                        class16.field334 = null;
                    } else {
                        int var17 = class123.field2749;
                        int var18 = class42.field990;
                        if (class51.field1135 == 0) {
                            var18 -= 4;
                            var17 -= 4;
                        }
                        if (~class51.field1135 == -2) {
                            var18 -= 553;
                            var17 -= 205;
                        }
                        if (~class51.field1135 == -3) {
                            var17 -= 357;
                            var18 -= 17;
                        }
                        int var19 = var17 - class63.field1346;
                        int var20 = var18 - class31.field729;
                        int[] var21 = class147.method1176(var16, (byte) 62);
                        class132 var22 = class36.field901[var12.field3135 >> 16][65535 & var12.field3195];
                        if (~var21[0] < ~var20) {
                            var20 = var21[0];
                        }
                        if (~(var12.field3215 + var20) < ~(var21[0] + var16.field3215)) {
                            var20 = var21[0] + var16.field3215 - var12.field3215;
                        }
                        if (var21[1] > var19) {
                            var19 = var21[1];
                        }
                        if (var21[1] + var16.field3165 < var19 - -var12.field3165) {
                            var19 = var21[1] + -var12.field3165 + var16.field3165;
                        }
                        int[] var23 = class147.method1176(var22, (byte) 23);
                        if (!var12.field3164) {
                            var15 = 128;
                        }
                        int var24 = var22.field3114 + var19 - var23[1];
                        int var25 = -var23[0] + var20 - -var22.field3189;
                        int var26 = -var12.field3102 + var24;
                        int var27 = -var12.field3216 + var25;
                        if (~var27 >= ~var12.field3101 && -var12.field3101 <= var27 && ~var26 >= ~var12.field3101 && -var12.field3101 <= var26 && !class29.field691) {
                            var26 = 0;
                            var27 = 0;
                        } else if (class19.field424 <= var12.field3168 && !class29.field691) {
                            var26 = 0;
                            var27 = 0;
                        }
                        var13 += var27;
                        var14 += var26;
                    }
                }
                if ((!var12.field3152 || var13 <= class7.field116 && class7.field121 >= var14 && ~(var12.field3215 + var13) <= ~class7.field118 && ~class7.field115 >= ~(var14 - -var12.field3165)) && (!var12.field3152 || !class130.method1068(true, var12))) {
                    if (~var12.field3219 == -1) {
                        if (!var12.field3152 && class130.method1068(true, var12) && !class3.method15(var11, 3, arg7)) {
                            continue;
                        }
                        if (!var12.field3152) {
                            if (var12.field3114 > -var12.field3165 + var12.field3167) {
                                var12.field3114 = -var12.field3165 + var12.field3167;
                            }
                            if (var12.field3114 < 0) {
                                var12.field3114 = 0;
                            }
                        }
                        var10 &= method449((byte) 51, arg1, var14, var12.field3114, var12.field3165 + var14, var12.field3215 + var13, var12.field3189, arg7, var13, var12.field3135);
                        if (var12.field3113 != null) {
                            var10 &= method449((byte) 57, var12.field3113, var14, var12.field3114, var12.field3165 + var14, var12.field3215 + var13, var12.field3189, arg7, var13, var12.field3135);
                        }
                        class7.method52(arg8, arg2, arg5, arg4);
                        if (~var12.field3167 < ~var12.field3165 && !var12.field3152) {
                            class118.method936(var12.field3165, var14, 26882, var12.field3167, var12.field3114, var12.field3215 + var13);
                        }
                    }
                    if (~var12.field3219 != -2) {
                        if (var12.field3219 == 2) {
                            int var28 = 0;
                            for (int var29 = 0; var29 < var12.field3165; ++var29) {
                                for (int var30 = 0; var12.field3215 > var30; ++var30) {
                                    int var31 = (32 - -var12.field3146) * var30 + var13;
                                    int var32 = (var12.field3184 + 32) * var29 + var14;
                                    if (var28 < 20) {
                                        var31 += var12.field3159[var28];
                                        var32 += var12.field3163[var28];
                                    }
                                    if (var12.field3149[var28] <= 0) {
                                        if (var12.field3125 != null && var28 < 20) {
                                            class60 var33 = var12.method1079(var28, (byte) -106);
                                            if (var33 == null) {
                                                if (class96.field2198) {
                                                    var10 = false;
                                                }
                                            } else {
                                                var33.method495(var31, var32);
                                            }
                                        }
                                    } else {
                                        boolean var34 = false;
                                        int var35 = var12.field3149[var28] + -1;
                                        boolean var36 = false;
                                        if (~var31 < ~(class7.field118 + -32) && var31 < class7.field116 && var32 > class7.field115 + -32 && ~class7.field121 < ~var32 || class36.field879 != 0 && ~class131.field3061 == ~var28) {
                                            class60 var37;
                                            if (class119.field2669 == 1 && ~class82.field1850 == ~var28 && ~class15.field320 == ~var12.field3135) {
                                                var37 = class51.method426((byte) 96, false, var35, 0, var12.field3128[var28], 2);
                                            } else {
                                                var37 = class51.method426((byte) 118, false, var35, 3153952, var12.field3128[var28], 1);
                                            }
                                            if (var37 != null) {
                                                if (~class36.field879 != -1 && ~class131.field3061 == ~var28 && class121.field2711 == var12.field3135) {
                                                    int var38 = -class114.field2576 + class123.field2749;
                                                    int var39 = class42.field990 - class118.field2640;
                                                    if (~var39 > -6 && ~var39 < 4) {
                                                        var39 = 0;
                                                    }
                                                    if (~var38 > -6 && ~var38 < 4) {
                                                        var38 = 0;
                                                    }
                                                    if (class20.field433 < 5) {
                                                        var38 = 0;
                                                        var39 = 0;
                                                    }
                                                    var37.method490(var31 + var39, var32 - -var38, 128);
                                                    if (arg9 != -1) {
                                                        class132 var40 = arg1[arg9 & 65535];
                                                        if (class7.field115 > var32 - -var38 && var40.field3114 > 0) {
                                                            int var41 = (-var32 + class7.field115 + -var38) * class52.field1161 / 3;
                                                            if (~var41 < ~(class52.field1161 * 10)) {
                                                                var41 = class52.field1161 * 10;
                                                            }
                                                            if (~var41 < ~var40.field3114) {
                                                                var41 = var40.field3114;
                                                            }
                                                            var40.field3114 -= var41;
                                                            class114.field2576 += var41;
                                                        }
                                                        if (class7.field121 < var32 + var38 + 32 && -var40.field3165 + var40.field3167 > var40.field3114) {
                                                            int var42 = (-class7.field121 + 32 + var32 + var38) * class52.field1161 / 3;
                                                            if (class52.field1161 * 10 < var42) {
                                                                var42 = class52.field1161 * 10;
                                                            }
                                                            if (~(var40.field3167 - var40.field3165 + -var40.field3114) > ~var42) {
                                                                var42 = -var40.field3165 + var40.field3167 + -var40.field3114;
                                                            }
                                                            class114.field2576 -= var42;
                                                            var40.field3114 += var42;
                                                        }
                                                    }
                                                } else if (~class1.field18 != -1 && class83.field1933 == var28 && ~class26.field635 == ~var12.field3135) {
                                                    var37.method490(var31, var32, 128);
                                                } else {
                                                    var37.method495(var31, var32);
                                                }
                                            } else {
                                                var10 = false;
                                            }
                                        }
                                    }
                                    ++var28;
                                }
                            }
                        } else if (~var12.field3219 == -4) {
                            int var43;
                            if (!class54.method438(114, var12)) {
                                var43 = var12.field3148;
                                if (class3.method15(var11, 3, arg7) && ~var12.field3224 != -1) {
                                    var43 = var12.field3224;
                                }
                            } else {
                                var43 = var12.field3130;
                                if (class3.method15(var11, 3, arg7) && var12.field3221 != 0) {
                                    var43 = var12.field3221;
                                }
                            }
                            if (var15 == 0) {
                                if (var12.field3144) {
                                    class7.method41(var13, var14, var12.field3215, var12.field3165, var43);
                                } else {
                                    class7.method49(var13, var14, var12.field3215, var12.field3165, var43);
                                }
                            } else if (var12.field3144) {
                                class7.method48(var13, var14, var12.field3215, var12.field3165, var43, -(var15 & 255) + 256);
                            } else {
                                class7.method47(var13, var14, var12.field3215, var12.field3165, var43, 256 - (var15 & 255));
                            }
                        } else if (~var12.field3219 == -5) {
                            class45 var44 = var12.method1082((byte) -85);
                            if (var44 == null) {
                                if (class96.field2198) {
                                    var10 = false;
                                }
                            } else {
                                class98 var45 = var12.field3204;
                                int var46;
                                if (!class54.method438(56, var12)) {
                                    var46 = var12.field3148;
                                    if (class3.method15(var11, 3, arg7) && var12.field3224 != 0) {
                                        var46 = var12.field3224;
                                    }
                                } else {
                                    var46 = var12.field3130;
                                    if (class3.method15(var11, 3, arg7) && var12.field3221 != 0) {
                                        var46 = var12.field3221;
                                    }
                                    if (~var12.field3178.method790(85) < -1) {
                                        var45 = var12.field3178;
                                    }
                                }
                                if (var12.field3152 && ~var12.field3169 != 0) {
                                    class74 var47 = class15.method152(30, var12.field3169);
                                    var45 = var47.field1567;
                                    if (var45 == null) {
                                        var45 = class139.field3402;
                                    }
                                    if ((var47.field1544 == 1 || var12.field3131 != 1) && ~var12.field3131 != 0) {
                                        var45 = class102.method840(new class98[] { var45, class88.field2029, class134.method1092(var12.field3131, 0) }, 10);
                                    }
                                }
                                if (class96.field2195 == var12.field3135 && class71.field1444 == var12.field3115) {
                                    var45 = class37.field906;
                                    var46 = var12.field3148;
                                }
                                if (~class7.field119 == -480) {
                                    if (var46 == 16776960) {
                                        var46 = 255;
                                    }
                                    if (~var46 == -49153) {
                                        var46 = 16777215;
                                    }
                                }
                                class98 var48 = class46.method403(var12, 15359, var45);
                                var44.method387(var48, var13, var14, var12.field3215, var12.field3165, var46, var12.field3140, var12.field3206, var12.field3118, var12.field3207);
                            }
                        } else if (var12.field3219 == 5) {
                            if (!var12.field3152) {
                                class60 var62 = var12.method1083(class54.method438(84, var12), 103);
                                if (var62 != null) {
                                    var62.method495(var13, var14);
                                } else if (class96.field2198) {
                                    var10 = false;
                                }
                            } else {
                                class60 var49;
                                if (var12.field3169 != -1) {
                                    var49 = class51.method426((byte) 93, false, var12.field3169, var12.field3196, var12.field3131, var12.field3182);
                                } else {
                                    var49 = var12.method1083(false, -108);
                                }
                                if (var49 == null) {
                                    if (class96.field2198) {
                                        var10 = false;
                                    }
                                } else {
                                    int var50 = var49.field1309;
                                    int var51 = var49.field1314;
                                    if (!var12.field3142) {
                                        int var61 = var12.field3215 * 4096 / var50;
                                        if (~var12.field3173 != -1) {
                                            var49.method478(var12.field3215 / 2 + var13, var14 - -(var12.field3165 / 2), var12.field3173, var61);
                                        } else if (var15 == 0) {
                                            if (~var12.field3215 == ~var50 && var12.field3165 == var51) {
                                                var49.method495(var13, var14);
                                            } else {
                                                var49.method482(var13, var14, var12.field3215, var12.field3165);
                                            }
                                        } else {
                                            var49.method483(var13, var14, var12.field3215, var12.field3165, -(255 & var15) + 256);
                                        }
                                    } else {
                                        int[] var52 = new int[4];
                                        class7.method42(var52);
                                        int var53 = var13;
                                        if (var13 < var52[0]) {
                                            var53 = var52[0];
                                        }
                                        int var54 = var14;
                                        if (~var14 > ~var52[1]) {
                                            var54 = var52[1];
                                        }
                                        int var55 = var13 - -var12.field3215;
                                        int var56 = var12.field3165 + var14;
                                        if (~var52[3] > ~var56) {
                                            var56 = var52[3];
                                        }
                                        if (~var55 < ~var52[2]) {
                                            var55 = var52[2];
                                        }
                                        class7.method52(var53, var54, var55, var56);
                                        int var57 = (var50 - 1 + var12.field3215) / var50;
                                        int var58 = (var51 + -1 + var12.field3165) / var51;
                                        for (int var59 = 0; ~var57 < ~var59; ++var59) {
                                            for (int var60 = 0; ~var58 < ~var60; ++var60) {
                                                if (var12.field3173 == 0) {
                                                    if (var15 == 0) {
                                                        var49.method495(var13 - -(var50 * var59), var51 * var60 + var14);
                                                    } else {
                                                        var49.method490(var13 - -(var50 * var59), var14 - -(var51 * var60), 256 - (255 & var15));
                                                    }
                                                } else {
                                                    var49.method478(var50 / 2 + (var13 - -(var50 * var59)), var51 / 2 + var51 * var60 + var14, var12.field3173, 4096);
                                                }
                                            }
                                        }
                                        class7.method50(var52);
                                    }
                                }
                            }
                        } else if (~var12.field3219 == -7) {
                            boolean var63 = class54.method438(119, var12);
                            int var64;
                            if (!var63) {
                                var64 = var12.field3177;
                            } else {
                                var64 = var12.field3175;
                            }
                            int var65 = 0;
                            class128 var66 = null;
                            if (var12.field3169 == -1) {
                                if (~var12.field3187 == -6) {
                                    if (~var12.field3112 != -1) {
                                        var66 = class73.field1536.method273((byte) 112);
                                    } else {
                                        var66 = class91.field2088.method570(-1, (class33) null, -1, 850, (class33) null);
                                    }
                                } else if (~var64 == 0) {
                                    var66 = var12.method1076(class73.field1536.field1219, (class33) null, var63, -1, -43);
                                    if (var66 == null && class96.field2198) {
                                        var10 = false;
                                    }
                                } else {
                                    class33 var67 = class48.method413(-97, var64);
                                    var66 = var12.method1076(class73.field1536.field1219, var67, var63, var12.field3132, -91);
                                    if (var66 == null && class96.field2198) {
                                        var10 = false;
                                    }
                                }
                            } else {
                                class74 var68 = class15.method152(30, var12.field3169);
                                if (var68 != null) {
                                    class74 var69 = var68.method614(var12.field3131, -4333);
                                    var66 = var69.method607(1, -20567);
                                    if (var66 == null) {
                                        var10 = false;
                                    } else {
                                        var66.method1021();
                                        var65 = var66.field2153 / 2;
                                    }
                                }
                            }
                            class66.method547(var12.field3215 / 2 + var13, var12.field3165 / 2 + var14);
                            int var70 = class66.field1419[var12.field3218] * var12.field3181 >> 16;
                            int var71 = class66.field1417[var12.field3218] * var12.field3181 >> 16;
                            if (var66 != null) {
                                if (!var12.field3152) {
                                    var66.method1014(0, var12.field3220, 0, var12.field3218, 0, var70, var71);
                                } else {
                                    var66.method1021();
                                    if (var12.field3183) {
                                        var66.method1027(0, var12.field3220, var12.field3107, var12.field3218, var12.field3120, var70 - -var65 + var12.field3162, var71 - -var12.field3162, var12.field3181);
                                    } else {
                                        var66.method1014(0, var12.field3220, var12.field3107, var12.field3218, var12.field3120, var70 - -var65 + var12.field3162, var12.field3162 + var71);
                                    }
                                }
                            }
                            class66.method531();
                        } else {
                            if (var12.field3219 == 7) {
                                class45 var72 = var12.method1082((byte) -22);
                                if (var72 == null) {
                                    if (class96.field2198) {
                                        var10 = false;
                                    }
                                    continue;
                                }
                                int var73 = 0;
                                for (int var74 = 0; ~var74 > ~var12.field3165; ++var74) {
                                    for (int var75 = 0; var12.field3215 > var75; ++var75) {
                                        if (~var12.field3149[var73] < -1) {
                                            class74 var76 = class15.method152(30, var12.field3149[var73] + -1);
                                            class98 var77 = var76.field1567;
                                            if (var77 == null) {
                                                var77 = class139.field3402;
                                            }
                                            if (var76.field1544 == 1 || ~var12.field3128[var73] != -2) {
                                                var77 = class102.method840(new class98[] { var77, class88.field2029, class134.method1092(var12.field3128[var73], 0) }, 10);
                                            }
                                            int var78 = (var12.field3146 + 115) * var75 + var13;
                                            int var79 = var14 - -((var12.field3184 + 12) * var74);
                                            if (var12.field3206 != 0) {
                                                if (~var12.field3206 == -2) {
                                                    var72.method381(var77, var12.field3215 / 2 + var78, var79, var12.field3148, var12.field3140);
                                                } else {
                                                    var72.method382(var77, var12.field3215 + var78 + -1, var79, var12.field3148, var12.field3140);
                                                }
                                            } else {
                                                var72.method386(var77, var78, var79, var12.field3148, var12.field3140);
                                            }
                                        }
                                        ++var73;
                                    }
                                }
                            }
                            if (~var12.field3219 == -9 && class80.method634(var11, 23979, arg7) && class77.field1692 == class74.field1552) {
                                int var80 = 0;
                                int var81 = 0;
                                class45 var82 = class97.field2231;
                                class98 var83 = var12.field3204;
                                class98 var84 = class46.method403(var12, 15359, var83);
                                while (var84.method790(103) > 0) {
                                    int var92 = var84.method788((byte) -65, class78.field1712);
                                    class98 var93;
                                    if (var92 != -1) {
                                        var93 = var84.method815(var92, -95, 0);
                                        var84 = var84.method781(0, var92 + 2);
                                    } else {
                                        var93 = var84;
                                        var84 = class145.field3503;
                                    }
                                    int var94 = var82.method384(var93);
                                    var81 += var82.field1041 + 1;
                                    if (~var94 < ~var80) {
                                        var80 = var94;
                                    }
                                }
                                var80 += 6;
                                var81 += 7;
                                int var85 = var12.field3215 + -5 + var13 + -var80;
                                if (~var85 > ~(var13 + 5)) {
                                    var85 = var13 - -5;
                                }
                                if (~arg5 > ~(var80 + var85)) {
                                    var85 = -var80 + arg5;
                                }
                                int var86 = var14 + 5 + var12.field3165;
                                if (~arg4 > ~(var86 - -var81)) {
                                    var86 = -var81 + arg4;
                                }
                                class7.method41(var85, var86, var80, var81, 16777120);
                                class7.method49(var85, var86, var80, var81, 0);
                                int var87 = var86 + 2 - -var82.field1041;
                                class98 var88 = var12.field3204;
                                class98 var89 = class46.method403(var12, 15359, var88);
                                while (var89.method790(101) > 0) {
                                    int var90 = var89.method788((byte) -65, class78.field1712);
                                    class98 var91;
                                    if (~var90 != 0) {
                                        var91 = var89.method815(var90, -125, 0);
                                        var89 = var89.method781(0, var90 + 2);
                                    } else {
                                        var91 = var89;
                                        var89 = class145.field3503;
                                    }
                                    var82.method386(var91, var85 - -3, var87, 0, false);
                                    var87 += var82.field1041 + 1;
                                }
                            }
                            if (~var12.field3219 == -10) {
                                if (~var12.field3191 != -2) {
                                    int var95 = var12.field3215 >= 0 ? var12.field3215 : -var12.field3215;
                                    int var96 = ~var12.field3165 <= -1 ? var12.field3165 : -var12.field3165;
                                    int var97 = var95;
                                    if (var95 < var96) {
                                        var97 = var96;
                                    }
                                    if (~var97 != -1) {
                                        int var98 = (var12.field3165 << 16) / var97;
                                        int var99 = (var12.field3215 << 16) / var97;
                                        if (~var98 >= ~var99) {
                                            var99 = -var99;
                                        } else {
                                            var98 = -var98;
                                        }
                                        int var100 = var12.field3191 * var98 - -1 >> 17;
                                        int var101 = var12.field3191 * var99 >> 17;
                                        int var102 = var12.field3191 * var98 >> 17;
                                        int var103 = var13 - -var102;
                                        int var104 = var12.field3191 * var99 + 1 >> 17;
                                        int var105 = var13 - var100;
                                        int var106 = var13 - -var12.field3215 + -var100;
                                        int var107 = var12.field3215 + var102 + var13;
                                        int var108 = var14 - -var101;
                                        int var109 = -var104 + var14;
                                        int var110 = var12.field3165 + var14 - var104;
                                        int var111 = var12.field3165 + var14 - -var101;
                                        class66.method541(var103, var105, var106);
                                        class66.method538(var108, var109, var110, var103, var105, var106, var12.field3148);
                                        class66.method541(var103, var106, var107);
                                        class66.method538(var108, var110, var111, var103, var106, var107, var12.field3148);
                                    }
                                } else {
                                    class7.method46(var13, var14, var12.field3215 + var13, var12.field3165 + var14, var12.field3148);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 <= 4) {
            method452(40);
        }
        return var10;
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)Z")
    public final boolean method450(int arg0) {
        ++field1217;
        if (arg0 != -2289) {
            method449((byte) 30, (class132[]) null, 112, 15, 17, 12, 49, 121, 108, 102);
        }
        return this.field1219 != null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILb;)V")
    public final void method451(int arg0, class8 arg1) {
        arg1.field182 = arg0;
        ++field1222;
        int var3 = -1;
        int var4 = arg1.method62((byte) 125);
        int[] var5 = new int[12];
        this.field1215 = arg1.method57(80);
        this.field1220 = arg1.method57(105);
        this.field1231 = 0;
        for (int var6 = 0; var6 < 12; ++var6) {
            int var7 = arg1.method62((byte) 78);
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg1.method62((byte) 85);
                var5[var6] = (var7 << 8) - -var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var3 = arg1.method68(-2);
                    break;
                }
                if (var5[var6] >= 512) {
                    int var12 = class15.method152(arg0 ^ 30, var5[var6] + -512).field1583;
                    if (~var12 != -1) {
                        this.field1231 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; ~var10 > -6; ++var10) {
            int var11 = arg1.method62((byte) 123);
            if (var11 < 0 || ~class71.field1475[var10].length >= ~var11) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field3626 = arg1.method68(-2);
        if (~super.field3626 == -65536) {
            super.field3626 = -1;
        }
        super.field3616 = arg1.method68(-2);
        if (~super.field3616 == -65536) {
            super.field3616 = -1;
        }
        super.field3642 = super.field3616;
        super.field3617 = arg1.method68(-2);
        if (super.field3617 == 65535) {
            super.field3617 = -1;
        }
        super.field3640 = arg1.method68(-2);
        if (~super.field3640 == -65536) {
            super.field3640 = -1;
        }
        super.field3624 = arg1.method68(-2);
        if (~super.field3624 == -65536) {
            super.field3624 = -1;
        }
        super.field3628 = arg1.method68(-2);
        if (~super.field3628 == -65536) {
            super.field3628 = -1;
        }
        super.field3638 = arg1.method68(arg0 + -2);
        if (~super.field3638 == -65536) {
            super.field3638 = -1;
        }
        this.field1212 = class19.method183(-30, arg1.method58(arg0 ^ -12271)).method785(10);
        this.field1204 = arg1.method62((byte) 103);
        this.field1209 = arg1.method68(-2);
        if (this.field1219 == null) {
            this.field1219 = new class71();
        }
        this.field1219.method565(var5, 5790, var9, var3, var4 == 1);
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)I")
    public static final int method452(int arg0) {
        ++field1211;
        return arg0 != 20971 ? 43 : class114.field2582++;
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(B)Lt;")
    public final class128 method273(byte arg0) {
        ++field1236;
        if (this.field1219 == null) {
            return null;
        } else {
            class33 var2 = super.field3612 != -1 && super.field3605 == 0 ? class48.method413(-84, super.field3612) : null;
            class33 var3 = super.field3655 == -1 || this.field1229 || ~super.field3655 == ~super.field3626 && var2 != null ? null : class48.method413(-92, super.field3655);
            class128 var4 = this.field1219.method570(super.field3641, var3, super.field3631, 850, var2);
            if (var4 == null) {
                return null;
            } else {
                var4.method1021();
                super.field3650 = var4.field2153;
                if (!this.field1229 && super.field3669 != -1 && ~super.field3627 != 0) {
                    class128 var5 = class51.method425(super.field3669, 4).method182((byte) 126, super.field3627);
                    if (var5 != null) {
                        var5.method1006(0, -super.field3645, 0);
                        class128[] var6 = new class128[] { var4, var5 };
                        var4 = new class128(var6, 2);
                    }
                }
                if (!this.field1229 && this.field1216 != null) {
                    if (~this.field1221 >= ~class119.field2680) {
                        this.field1216 = null;
                    }
                    if (~this.field1232 >= ~class119.field2680 && ~this.field1221 < ~class119.field2680) {
                        class128 var7 = this.field1216;
                        var7.method1006(this.field1228 - super.field3657, -this.field1223 + this.field1233, -super.field3667 + this.field1210);
                        if (super.field3652 != 512) {
                            if (~super.field3652 != -1025) {
                                if (~super.field3652 == -1537) {
                                    var7.method1007();
                                }
                            } else {
                                var7.method1007();
                                var7.method1007();
                            }
                        } else {
                            var7.method1007();
                            var7.method1007();
                            var7.method1007();
                        }
                        class128[] var8 = new class128[] { var4, var7 };
                        var4 = new class128(var8, 2);
                        if (~super.field3652 == -513) {
                            var7.method1007();
                        } else if (~super.field3652 != -1025) {
                            if (~super.field3652 == -1537) {
                                var7.method1007();
                                var7.method1007();
                                var7.method1007();
                            }
                        } else {
                            var7.method1007();
                            var7.method1007();
                        }
                        var7.method1006(super.field3657 - this.field1228, -this.field1233 + this.field1223, super.field3667 - this.field1210);
                    }
                }
                if (arg0 < 104) {
                    return null;
                } else {
                    var4.field2880 = true;
                    return var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V")
    public static void method453(int arg0) {
        field1207 = null;
        field1235 = null;
        field1226 = null;
        field1205 = null;
        field1213 = null;
        field1227 = null;
        if (arg0 != 24717) {
            method452(-26);
        }
        field1230 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZZ[B)Ljava/lang/Object;")
    public static final Object method454(boolean arg0, boolean arg1, byte[] arg2) {
        if (arg1) {
            field1227 = null;
        }
        ++field1234;
        if (arg2 == null) {
            return null;
        } else {
            if (arg2.length > 136 && !class105.field2399) {
                try {
                    class57 var3 = (class57) Class.forName("ie").newInstance();
                    var3.method462(114, arg2);
                    return var3;
                } catch (Throwable var4) {
                    class105.field2399 = true;
                }
            }
            return arg0 ? class146.method1170((byte) -80, arg2) : arg2;
        }
    }
}
