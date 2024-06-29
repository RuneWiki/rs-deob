import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class370 {

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public int field5227 = 0;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[I")
    public static int[] field5219 = new int[14];

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[Z")
    public static boolean[] field5220 = new boolean[200];

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "[[[Lak;")
    public static class193[][][] field5218;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IZIIII)V", line = 3)
    public static final void method2354(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        class98.field1193 = arg4;
        class371.field5229 = arg3;
        class168.field2346 = arg5;
        field5225++;
        if (arg1) {
            field5219 = null;
        }
        class253.field3627 = arg0;
        class392.field5532 = arg2;
        if (class98.field1193 >= 100) {
            int var6 = class168.field2346 * 128 + 64;
            int var7 = class253.field3627 * 128 + 64;
            int var8 = class114.method709(class129.field1570, var6, 0, var7) - class371.field5229;
            int var9 = var6 - class334.field4730;
            int var10 = var8 - class276.field3925;
            int var11 = var7 - class265.field3774;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class138.field1722 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class377.field5324 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            class232.field3265 = 0;
            if (class138.field1722 < 1024) {
                class138.field1722 = 1024;
            }
            if (class138.field1722 > 3072) {
                class138.field1722 = 3072;
            }
        }
        class129.field1568 = 2;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILdg;)V", line = 49)
    private final void method2355(int arg0, int arg1, class236 arg2) {
        if (arg0 != 4) {
            method2354(-118, false, 33, 29, 108, -7);
        }
        if (arg1 == 5) {
            this.field5227 = arg2.method1617((byte) 48);
        }
        field5228++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ltq;B)V", line = 68)
    public static final void method2356(class376 arg0, byte arg1) {
        field5222++;
        class212.field3011 = arg0;
        if (arg1 != -12) {
            field5218 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII[[BLda;[[BILor;I[[BLae;[Z)V", line = 79)
    public static final void method2357(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][] arg5, class36 arg6, byte[][] arg7, int arg8, class383 arg9, int arg10, byte[][] arg11, class134 arg12, boolean[] arg13) {
        if (arg9 != null && arg6 != null || arg6 != null && arg1 == 12 || arg9 != null && arg1 == 0) {
            boolean[] var14 = arg9 != null && arg9.field5399 ? class152.field1876[arg1] : class26.field326[arg1];
            if (arg4 > 0) {
                if (arg8 > 0) {
                    int var15 = arg7[arg8 - 1][arg4 - 1] & 0xFF;
                    if (var15 > 0) {
                        class383 var16 = class181.method1222(var15 - 1, 15610);
                        if (var16.field5400 != -1 && var16.field5399) {
                            byte var17 = arg11[arg8 - 1][arg4 - 1];
                            int var18 = arg5[arg8 - 1][arg4 - 1] * 2 + 4 & 0x7;
                            int var19 = class162.method1054(arg12, var16, false);
                            if (class302.field4252[var17][var18]) {
                                class93.field1124[0] = var16.field5400;
                                class146.field1790[0] = var19;
                                class164.field2322[0] = arg12.method609() ? var16.field5412 : var16.field5398;
                                class261.field3735[0] = var16.field5401;
                                class322.field4585[0] = var16.field5410;
                                class158.field2065[0] = 256;
                            }
                        }
                    }
                }
                if ((arg2 - 1) > arg8) {
                    int var20 = arg7[arg8 + 1][arg4 - 1] & 0xFF;
                    if (var20 > 0) {
                        class383 var21 = class181.method1222(var20 - 1, 15610);
                        if (var21.field5400 != -1 && var21.field5399) {
                            byte var22 = arg11[arg8 + 1][arg4 - 1];
                            int var23 = arg5[arg8 + 1][arg4 - 1] * 2 + 6 & 0x7;
                            int var24 = class162.method1054(arg12, var21, false);
                            if (class302.field4252[var22][var23]) {
                                class93.field1124[2] = var21.field5400;
                                class146.field1790[2] = var24;
                                class164.field2322[2] = arg12.method609() ? var21.field5412 : var21.field5398;
                                class261.field3735[2] = var21.field5401;
                                class322.field4585[2] = var21.field5410;
                                class158.field2065[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg4 < arg0 - 1) {
                if (arg8 > 0) {
                    int var25 = arg7[arg8 - 1][arg4 + 1] & 0xFF;
                    if (var25 > 0) {
                        class383 var26 = class181.method1222(var25 - 1, 15610);
                        if (var26.field5400 != -1 && var26.field5399) {
                            byte var27 = arg11[arg8 - 1][arg4 + 1];
                            int var28 = arg5[arg8 - 1][arg4 + 1] * 2 + 2 & 0x7;
                            int var29 = class162.method1054(arg12, var26, false);
                            if (class302.field4252[var27][var28]) {
                                class93.field1124[6] = var26.field5400;
                                class146.field1790[6] = var29;
                                class164.field2322[6] = arg12.method609() ? var26.field5412 : var26.field5398;
                                class261.field3735[6] = var26.field5401;
                                class322.field4585[6] = var26.field5410;
                                class158.field2065[6] = 64;
                            }
                        }
                    }
                }
                if (arg8 < (arg2 - 1)) {
                    int var30 = arg7[arg8 + 1][arg4 + 1] & 0xFF;
                    if (var30 > 0) {
                        class383 var31 = class181.method1222(var30 - 1, 15610);
                        if (var31.field5400 != -1 && var31.field5399) {
                            byte var32 = arg11[arg8 + 1][arg4 + 1];
                            int var33 = arg5[arg8 + 1][arg4 + 1] * 2 & 0x7;
                            int var34 = class162.method1054(arg12, var31, false);
                            if (class302.field4252[var32][var33]) {
                                class93.field1124[4] = var31.field5400;
                                class146.field1790[4] = var34;
                                class164.field2322[4] = arg12.method609() ? var31.field5412 : var31.field5398;
                                class261.field3735[4] = var31.field5401;
                                class322.field4585[4] = var31.field5410;
                                class158.field2065[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg4 > 0) {
                int var35 = arg7[arg8][arg4 - 1] & 0xFF;
                if (var35 > 0) {
                    class383 var36 = class181.method1222(var35 - 1, 15610);
                    if (var36.field5400 != -1) {
                        byte var37 = arg11[arg8][arg4 - 1];
                        byte var38 = arg5[arg8][arg4 - 1];
                        if (var36.field5399) {
                            int var39 = 2;
                            int var40 = var38 * 2 + 4;
                            int var41 = class162.method1054(arg12, var36, false);
                            for (int var42 = 0; var42 < 3; var42++) {
                                var40 &= 0x7;
                                var39 &= 0x7;
                                if (class302.field4252[var37][var40] && class322.field4585[var39] <= var36.field5410) {
                                    class93.field1124[var39] = var36.field5400;
                                    class146.field1790[var39] = var41;
                                    class164.field2322[var39] = arg12.method609() ? var36.field5412 : var36.field5398;
                                    class261.field3735[var39] = var36.field5401;
                                    if (class322.field4585[var39] == var36.field5410) {
                                        class158.field2065[var39] = class429.method2704(class158.field2065[var39], 32);
                                    } else {
                                        class158.field2065[var39] = 32;
                                    }
                                    class322.field4585[var39] = var36.field5410;
                                }
                                var40++;
                                var39--;
                            }
                            if (!var14[arg10 & 0x3]) {
                                arg13[0] = class152.field1876[var37][class33.method210(var38 + 2, 3)];
                            }
                        } else if (!var14[-(-arg10) & 0x3]) {
                            arg13[0] = class26.field326[var37][class33.method210(3, var38 + 2)];
                        }
                    }
                }
            }
            if (arg4 < (arg0 - 1)) {
                int var43 = arg7[arg8][arg4 + 1] & 0xFF;
                if (var43 > 0) {
                    class383 var44 = class181.method1222(var43 - 1, 15610);
                    if (var44.field5400 != -1) {
                        byte var45 = arg11[arg8][arg4 + 1];
                        byte var46 = arg5[arg8][arg4 + 1];
                        if (var44.field5399) {
                            int var47 = 4;
                            int var48 = var46 * 2 + 2;
                            int var49 = class162.method1054(arg12, var44, false);
                            for (int var50 = 0; var50 < 3; var50++) {
                                var47 &= 0x7;
                                var48 &= 0x7;
                                if (class302.field4252[var45][var48] && class322.field4585[var47] <= var44.field5410) {
                                    class93.field1124[var47] = var44.field5400;
                                    class146.field1790[var47] = var49;
                                    class164.field2322[var47] = arg12.method609() ? var44.field5412 : var44.field5398;
                                    class261.field3735[var47] = var44.field5401;
                                    if (class322.field4585[var47] == var44.field5410) {
                                        class158.field2065[var47] = class429.method2704(class158.field2065[var47], 16);
                                    } else {
                                        class158.field2065[var47] = 16;
                                    }
                                    class322.field4585[var47] = var44.field5410;
                                }
                                var48--;
                                var47++;
                            }
                            if (!var14[arg10 + 2 & 0x3]) {
                                arg13[2] = class152.field1876[var45][class33.method210(var46, 3)];
                            }
                        } else if (!var14[arg10 + 2 & 0x3]) {
                            arg13[2] = class26.field326[var45][class33.method210(var46, 3)];
                        }
                    }
                }
            }
            if (arg8 > 0) {
                int var51 = arg7[arg8 - 1][arg4] & 0xFF;
                if (var51 > 0) {
                    class383 var52 = class181.method1222(var51 - 1, 15610);
                    if (var52.field5400 != -1) {
                        byte var53 = arg11[arg8 - 1][arg4];
                        byte var54 = arg5[arg8 - 1][arg4];
                        if (var52.field5399) {
                            int var55 = 6;
                            int var56 = var54 * 2 + 4;
                            int var57 = class162.method1054(arg12, var52, false);
                            for (int var58 = 0; var58 < 3; var58++) {
                                var55 &= 0x7;
                                var56 &= 0x7;
                                if (class302.field4252[var53][var56] && var52.field5410 >= class322.field4585[var55]) {
                                    class93.field1124[var55] = var52.field5400;
                                    class146.field1790[var55] = var57;
                                    class164.field2322[var55] = arg12.method609() ? var52.field5412 : var52.field5398;
                                    class261.field3735[var55] = var52.field5401;
                                    if (class322.field4585[var55] == var52.field5410) {
                                        class158.field2065[var55] = class429.method2704(class158.field2065[var55], 8);
                                    } else {
                                        class158.field2065[var55] = 8;
                                    }
                                    class322.field4585[var55] = var52.field5410;
                                }
                                var56--;
                                var55++;
                            }
                            if (!var14[arg10 + 3 & 0x3]) {
                                arg13[3] = class152.field1876[var53][class33.method210(3, var54 + 1)];
                            }
                        } else if (!var14[arg10 + 3 & 0x3]) {
                            arg13[3] = class26.field326[var53][class33.method210(var54 + 1, 3)];
                        }
                    }
                }
            }
            if (arg8 < (arg2 - 1)) {
                int var59 = arg7[arg8 + 1][arg4] & 0xFF;
                if (var59 > 0) {
                    class383 var60 = class181.method1222(var59 - 1, 15610);
                    if (var60.field5400 != -1) {
                        byte var61 = arg11[arg8 + 1][arg4];
                        byte var62 = arg5[arg8 + 1][arg4];
                        if (var60.field5399) {
                            int var63 = 4;
                            int var64 = var62 * 2 + 6;
                            int var65 = class162.method1054(arg12, var60, false);
                            for (int var66 = 0; var66 < 3; var66++) {
                                var64 &= 0x7;
                                var63 &= 0x7;
                                if (class302.field4252[var61][var64] && var60.field5410 >= class322.field4585[var63]) {
                                    class93.field1124[var63] = var60.field5400;
                                    class146.field1790[var63] = var65;
                                    class164.field2322[var63] = arg12.method609() ? var60.field5412 : var60.field5398;
                                    class261.field3735[var63] = var60.field5401;
                                    if (class322.field4585[var63] == var60.field5410) {
                                        class158.field2065[var63] = class429.method2704(class158.field2065[var63], 4);
                                    } else {
                                        class158.field2065[var63] = 4;
                                    }
                                    class322.field4585[var63] = var60.field5410;
                                }
                                var63--;
                                var64++;
                            }
                            if (!var14[arg10 + 1 & 0x3]) {
                                arg13[1] = class152.field1876[var61][class33.method210(3, var62 + 3)];
                            }
                        } else if (!var14[arg10 + 1 & 0x3]) {
                            arg13[1] = class26.field326[var61][class33.method210(var62 + 3, 3)];
                        }
                    }
                }
            }
        }
        int var67 = -39 % ((76 - arg3) / 46);
        field5226++;
        if (arg9 == null) {
            return;
        }
        int var68 = class162.method1054(arg12, arg9, false);
        if (!arg9.field5399) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - arg10 * 2 & 0x7;
            if (class302.field4252[arg1][var69] && arg9.field5410 >= class322.field4585[var70]) {
                class93.field1124[var70] = arg9.field5400;
                class146.field1790[var70] = var68;
                class164.field2322[var70] = arg12.method609() ? arg9.field5412 : arg9.field5398;
                class261.field3735[var70] = arg9.field5401;
                if (class322.field4585[var70] == arg9.field5410) {
                    class158.field2065[var70] = class429.method2704(class158.field2065[var70], 2);
                } else {
                    class158.field2065[var70] = 2;
                }
                class322.field4585[var70] = arg9.field5410;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILwl;)Lrp;", line = 554)
    public static final class250 method2358(int arg0, int arg1, class233 arg2) {
        field5224++;
        if (arg0 != -1) {
            field5220 = null;
        }
        class250 var3;
        if (class441.field6327 == null) {
            var3 = new class250();
        } else {
            var3 = class441.field6327;
            class441.field6327 = class441.field6327.field3568;
            class94.field1132--;
            var3.field3568 = null;
        }
        var3.field3571 = arg2;
        var3.field3565 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILae;Lon;B)V", line = 586)
    public static final void method2359(int arg0, int arg1, class134 arg2, class184 arg3, byte arg4) {
        field5221++;
        class433 var5 = arg3.method1240(arg2, -127);
        if (var5 == null) {
            return;
        }
        arg2.method660(arg0, arg1, arg3.field2618 + arg0, arg3.field2516 + arg1);
        if (arg4 != -50) {
            field5219 = null;
        }
        if (class39.field447 == 2 || class39.field447 == 5 || class295.field4112 == null) {
            arg2.method597(-16777216, var5, arg0, arg1);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class129.field1568 == 4) {
            var6 = 4096;
            var7 = (int) (-class441.field6333) & 0x3FFF;
            var8 = class79.field929;
            var9 = class130.field1576;
        } else {
            var6 = 4096 - (class292.field4089 * 16);
            var9 = class384.field5422.field3284;
            var7 = (int) (-class441.field6333) + class297.field4137 & 0x3FFF;
            var8 = class384.field5422.field3269;
        }
        int var10 = (var9 / 32) + 48 - (class176.field2403 * 2 + -208);
        int var11 = class383.field5395 * 4 + 48 + 208 - (var8 / 32) - (class383.field5395 * 2);
        class295.field4112.method2450((float) arg3.field2618 / 2.0F + (float) arg0, (float) arg3.field2516 / 2.0F + (float) arg1, (float) var10, (float) var11, var6, var7 << 2, var5, arg0, arg1);
        for (class25 var12 = (class25) class178.field2440.method506((byte) -128); var12 != null; var12 = (class25) class178.field2440.method514(true)) {
            int var50 = var12.field311;
            int var51 = ((class330.field4667.field3248[var50] & 0xFFFFA0C) >> 14) - class114.field1403;
            int var52 = (class330.field4667.field3248[var50] & 0x3FFF) - class41.field496;
            int var53 = var51 * 4 + 2 - var9 / 32;
            int var54 = var52 * 4 + 2 - (var8 / 32);
            class144.method879(arg1, var54, arg2, arg0, class330.field4667.field3250[var50], (byte) 106, var5, arg3, var53);
        }
        for (int var13 = 0; var13 < class160.field2113; var13++) {
            int var47 = class43.field526[var13] * 4 + 2 - (var9 / 32);
            int var48 = class267.field3806[var13] * 4 + 2 - var8 / 32;
            class88 var49 = class374.method2382(class49.field588[var13], false);
            if (var49.field1068 != null) {
                var49 = var49.method480(119);
                if (var49 == null || var49.field1018 == -1) {
                    continue;
                }
            }
            class144.method879(arg1, var48, arg2, arg0, var49.field1018, (byte) 106, var5, arg3, var47);
        }
        for (class282 var14 = (class282) class330.field4663.method1884(0); var14 != null; var14 = (class282) class330.field4663.method1890(-1)) {
            int var44 = (int) (var14.field5855 >> 28 & 0x3L);
            if (class35.field405 == var44) {
                int var45 = (int) (var14.field5855 & 0x3FFFL) * 4 + 2 - var9 / 32;
                int var46 = (int) (var14.field5855 >> 14 & 0x3FFFL) * 4 + 2 - (var8 / 32);
                class435.method2730(var46, class286.field4017[0], arg3, arg0, (byte) 1, var5, var45, arg1);
            }
        }
        for (int var15 = 0; var15 < class102.field1250; var15++) {
            class77 var40 = class167.field2335[class86.field981[var15]];
            if (var40 != null && var40.method428(-27076)) {
                class135 var41 = var40.field912;
                if (var41 != null && var41.field1655 != null) {
                    var41 = var41.method836((byte) -116);
                }
                if (var41 != null && var41.field1633 && var41.field1664) {
                    int var42 = var40.field3284 / 32 - (var9 / 32);
                    int var43 = var40.field3269 / 32 - var8 / 32;
                    if (var41.field1638 == -1) {
                        class435.method2730(var43, class286.field4017[1], arg3, arg0, (byte) 29, var5, var42, arg1);
                    } else {
                        class144.method879(arg1, var43, arg2, arg0, var41.field1638, (byte) 106, var5, arg3, var42);
                    }
                }
            }
        }
        for (int var16 = 0; var16 < class305.field4287; var16++) {
            class40 var32 = class26.field314[class94.field1135[var16]];
            if (var32 != null && var32.method244(-27076)) {
                int var33 = var32.field3284 / 32 - (var9 / 32);
                int var34 = var32.field3269 / 32 - var8 / 32;
                boolean var35 = false;
                for (int var36 = 0; var36 < class247.field3533; var36++) {
                    if (var32.field487.equals(class334.field4733[var36]) && class109.field1344[var36] != 0) {
                        var35 = true;
                        break;
                    }
                }
                boolean var37 = false;
                for (int var38 = 0; var38 < class118.field1445; var38++) {
                    if (var32.field487.equals(class65.field748[var38].field201)) {
                        var37 = true;
                        break;
                    }
                }
                boolean var39 = false;
                if (class384.field5422.field458 != 0 && var32.field458 != 0 && class384.field5422.field458 == var32.field458) {
                    var39 = true;
                }
                if (var35) {
                    class435.method2730(var34, class286.field4017[3], arg3, arg0, (byte) 56, var5, var33, arg1);
                } else if (var37) {
                    class435.method2730(var34, class286.field4017[5], arg3, arg0, (byte) 77, var5, var33, arg1);
                } else if (var39) {
                    class435.method2730(var34, class286.field4017[4], arg3, arg0, (byte) 117, var5, var33, arg1);
                } else {
                    class435.method2730(var34, class286.field4017[2], arg3, arg0, (byte) 65, var5, var33, arg1);
                }
            }
        }
        class219[] var17 = class360.field5138;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class219 var21 = var17[var18];
            if (var21 != null && var21.field3092 != 0 && (class189.field2726 % 20) < 10) {
                if (var21.field3092 == 1 && var21.field3085 >= 0 && var21.field3085 < class167.field2335.length) {
                    class77 var22 = class167.field2335[var21.field3085];
                    if (var22 != null) {
                        int var23 = var22.field3284 / 32 - (var9 / 32);
                        int var24 = var22.field3269 / 32 - var8 / 32;
                        class64.method363(arg0, 360000, arg3, arg1, var5, var23, var21.field3081, var24, -127);
                    }
                }
                if (var21.field3092 == 2) {
                    int var25 = (var21.field3088 - class114.field1403) * 4 + 2 - (var9 / 32);
                    int var26 = (var21.field3094 - class41.field496) * 4 + (2 - var8 / 32);
                    int var27 = var21.field3086 * 4;
                    int var28 = var27 * var27;
                    class64.method363(arg0, var28, arg3, arg1, var5, var25, var21.field3081, var26, -122);
                }
                if (var21.field3092 == 10 && var21.field3085 >= 0 && class26.field314.length > var21.field3085) {
                    class40 var29 = class26.field314[var21.field3085];
                    if (var29 != null) {
                        int var30 = var29.field3284 / 32 - (var9 / 32);
                        int var31 = var29.field3269 / 32 - (var8 / 32);
                        class64.method363(arg0, 360000, arg3, arg1, var5, var30, var21.field3081, var31, -114);
                    }
                }
            }
        }
        if (class129.field1568 == 4) {
            return;
        }
        if (class33.field386 != 0) {
            int var19 = class33.field386 * 4 + 2 - (var9 / 32 + -((class384.field5422.method242(-30129) - 1) * 2));
            int var20 = class443.field6343 * 4 + (class384.field5422.method242(-30129) * 2 - 2) + 2 - var8 / 32;
            class435.method2730(var20, class71.field818[class360.field5136 ? 1 : 0], arg3, arg0, (byte) 32, var5, var19, arg1);
        }
        arg2.method827(arg1 + (arg3.field2516 / 2) - 1, arg3.field2618 / 2 + arg0 - 1, 3, -99, 3, -1);
        return;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 877)
    public static void method2360(int arg0) {
        field5219 = null;
        if (arg0 != -1) {
            method2356((class376) null, (byte) -61);
        }
        field5220 = null;
        field5218 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ldg;B)V", line = 891)
    public final void method2361(class236 arg0, byte arg1) {
        int var3 = -104 / ((arg1 - 43) / 44);
        field5223++;
        while (true) {
            int var4 = arg0.method1574(-125);
            if (var4 == 0) {
                return;
            }
            this.method2355(4, var4, arg0);
        }
    }
}
