import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class158 extends class83 implements class28 {

    @OriginalMember(owner = "client!ufa", name = "M", descriptor = "I")
    private int field2053;

    @OriginalMember(owner = "client!ufa", name = "E", descriptor = "I")
    private int field2047;

    @OriginalMember(owner = "client!ufa", name = "I", descriptor = "I")
    public static int field2050 = 0;

    @OriginalMember(owner = "client!ufa", name = "B", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!ufa", name = "C", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!ufa", name = "D", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!ufa", name = "G", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!ufa", name = "J", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!ufa", name = "L", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!ufa", name = "N", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!ufa", name = "O", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!ufa", name = "P", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!ufa", name = "Q", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!ufa", name = "R", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!ufa", name = "S", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!ufa", name = "T", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!ufa", name = "H", descriptor = "[[[Z")
    public static boolean[][][] field2049;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(IB)I")
    public static final int method1015(int arg0, byte arg1) {
        ++field2046;
        if (~arg0 > -97) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            if (arg1 != -40) {
                method1019(120, -125, -51, 66, (class391) null);
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Loaa;Lpb;Loea;II)V")
    public class158(class556 arg0, class2 arg1, class612 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field2053 = arg4;
        this.field2047 = arg3;
        super.field1006.method1492(this, 2);
        OpenGL.glTexImage2Dub(super.field1016, 0, this.method631(-67), arg3, arg4, 0, class723.method4029(64, super.field994), class402.method2466(super.field1017, false), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)I")
    public final int method124(byte arg0) {
        ++field2045;
        return arg0 != 95 ? 105 : this.field2053;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ZZZ)V")
    public final void method129(boolean arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            ++field2059;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(B)I")
    public final int method130(byte arg0) {
        if (arg0 != 11) {
            field2050 = 13;
        }
        ++field2057;
        return this.field2047;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II[BLpb;IIIII)V")
    public final void method127(int arg0, int arg1, byte[] arg2, class2 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2051;
        if (~arg1 == -1) {
            arg1 = arg4;
        }
        super.field1006.method1492(this, 2);
        OpenGL.glPixelStorei(3317, 1);
        if (arg1 != arg4) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Dub(super.field1016, 0, arg6, arg8, arg4, arg7, class723.method4029(23, arg3), 5121, arg2, arg0);
        if (arg1 != arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        if (arg5 != 22217) {
            this.method132(26);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIII[III)V")
    public final void method125(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        ++field2054;
        int[] var8 = new int[this.field2053 * this.field2047];
        super.field1006.method1492(this, 2);
        OpenGL.glGetTexImagei(super.field1016, 0, 32993, 5121, var8, 0);
        int var9 = 0;
        if (arg0 != -15104) {
            method1019(-84, 118, -67, 111, (class391) null);
        }
        while (~arg3 < ~var9) {
            class335.method2124(var8, (-1 - -arg3 + arg1 - var9) * this.field2047, arg4, arg5 * var9 + arg2, arg5);
            ++var9;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "(B)V")
    public static void method1016(byte arg0) {
        field2049 = null;
        int var1 = -77 / ((arg0 - -56) / 32);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(FI)F")
    public final float method126(float arg0, int arg1) {
        ++field2044;
        if (arg1 != 5263) {
            field2049 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Loaa;Lpb;II[BII)V")
    public class158(class556 arg0, class2 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class612.field8616, arg2 * arg3, false);
        this.field2053 = arg3;
        this.field2047 = arg2;
        super.field1006.method1492(this, 2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field1016, 0, this.method631(93), arg2, arg3, 0, class723.method4029(78, super.field994), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I[IIIIZII)V")
    public final void method131(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        super.field1006.method1492(this, 2);
        if (arg5) {
            this.field2053 = -90;
        }
        if (~arg2 == -1) {
            arg2 = arg7;
        }
        ++field2058;
        if (~arg2 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Di(super.field1016, 0, arg3, arg6, arg7, arg4, 32993, super.field1006.field7816, arg1, arg0);
        if (~arg2 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "(IB)V")
    public static final void method1017(int arg0, byte arg1) {
        class793.field10868 = -1;
        class164.field2097 = null;
        ++field2055;
        class574.field8079 = null;
        if (arg1 > -124) {
            field2050 = -99;
        }
        class565.field7982 = arg0;
        class354.field5120 = 0;
        class20.field171 = 1;
        class748.field10330 = -1;
        class194.field2599 = false;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BLsha;ILha;I)V")
    public static final void method1018(byte arg0, class115 arg1, int arg2, class473 arg3, int arg4) {
        ++field2048;
        class87 var5 = arg1.method843(arg3, 1531777828);
        if (arg0 < 0) {
            method1016((byte) 117);
        }
        if (var5 != null) {
            arg3.method225(arg4, arg2, arg1.field1560 + arg4, arg2 - -arg1.field1517);
            if (~class255.field3779 != -3 && ~class255.field3779 != -6 && class175.field2207 != null) {
                int var6;
                int var7;
                int var8;
                int var9;
                if (~class695.field9691 != -5) {
                    var6 = class724.field10031.field3460;
                    var7 = -(class686.field9577 * 16) + 4096;
                    var8 = class724.field10031.field3470;
                    var9 = 16383 & (int) (-class702.field9790) - -class703.field9795;
                } else {
                    var7 = 4096;
                    var9 = 16383 & (int) (-class702.field9790);
                    var8 = class568.field8011;
                    var6 = class177.field2234;
                }
                int var10 = 48 - (-(var8 / 128) - 208 - -(class741.field10208 * 2));
                int var11 = class525.field7224 * 4 - (class525.field7224 * 2 + -208) + -(var6 / 128) + 48;
                class175.field2207.method2023((float) arg1.field1560 / 2.0F + (float) arg4, (float) arg1.field1517 / 2.0F + (float) arg2, (float) var10, (float) var11, var7, var9 << 2, var5, arg4, arg2);
                for (class324 var12 = (class324) class202.field2841.method1041(1048832); var12 != null; var12 = (class324) class202.field2841.method1033(-1)) {
                    int var58 = var12.field4575;
                    int var59 = ((class787.field10808.field10469[var58] & 268426244) >> 14) + -class444.field6151;
                    int var60 = (16383 & class787.field10808.field10469[var58]) + -class236.field3535;
                    int var61 = var59 * 4 + -(var8 / 128) + 2;
                    int var62 = var60 * 4 + -(var6 / 128) - -2;
                    class76.method560(var5, arg1, var61, arg3, var62, class787.field10808.field10468[var58], arg4, arg2, true);
                }
                for (int var13 = 0; var13 < class181.field2288; ++var13) {
                    int var55 = class49.field593[var13] * 4 - -2 + -(var8 / 128);
                    int var56 = class535.field7407[var13] * 4 - var6 / 128 + 2;
                    class286 var57 = class390.field5558.method3065(71, class130.field1682[var13]);
                    if (var57.field4136 != null) {
                        var57 = var57.method1889(class173.field2192, false);
                        if (var57 == null || var57.field4209 == -1) {
                            continue;
                        }
                    }
                    class76.method560(var5, arg1, var55, arg3, var56, var57.field4209, arg4, arg2, true);
                }
                for (class656 var14 = (class656) class752.field10377.method3668(38); var14 != null; var14 = (class656) class752.field10377.method3667((byte) 50)) {
                    int var50 = (int) (3L & var14.field762 >> 28);
                    if (~class306.field4440 == ~var50) {
                        int var51 = (int) (var14.field762 & 16383L) + -class444.field6151;
                        int var52 = -class236.field3535 + (int) (var14.field762 >> 14 & 16383L);
                        int var53 = var51 * 4 - -2 - var8 / 128;
                        int var54 = var52 * 4 + -(var6 / 128) - -2;
                        class353.method2221(var5, var54, class672.field9437[0], arg1, arg4, (byte) 37, var53, arg2);
                    }
                }
                for (int var15 = 0; ~class429.field5988 < ~var15; ++var15) {
                    class685 var45 = (class685) class450.field6288.method3669(false, (long) class425.field5934[var15]);
                    if (var45 != null) {
                        class359 var46 = var45.field9573;
                        if (var46.method2253(-27674) && class724.field10031.field3467 == var46.field3467) {
                            class636 var47 = var46.field5172;
                            if (var47 != null && var47.field8872 != null) {
                                var47 = var47.method3650(class173.field2192, (byte) 55);
                            }
                            if (var47 != null && var47.field8892 && var47.field8927) {
                                int var48 = var46.field3470 / 128 + -(var8 / 128);
                                int var49 = var46.field3460 / 128 + -(var6 / 128);
                                if (~var47.field8902 != 0) {
                                    class76.method560(var5, arg1, var48, arg3, var49, var47.field8902, arg4, arg2, true);
                                } else {
                                    class353.method2221(var5, var49, class672.field9437[1], arg1, arg4, (byte) 110, var48, arg2);
                                }
                            }
                        }
                    }
                }
                int var16 = class783.field10748;
                int[] var17 = class244.field3610;
                for (int var18 = 0; var18 < var16; ++var18) {
                    class723 var37 = class413.field5787[var17[var18]];
                    if (var37 != null && var37.method4031(-27674) && !var37.field9989 && class724.field10031 != var37 && class724.field10031.field3467 == var37.field3467) {
                        int var38 = var37.field3470 / 128 + -(var8 / 128);
                        int var39 = var37.field3460 / 128 + -(var6 / 128);
                        boolean var40 = false;
                        for (int var41 = 0; ~var41 > ~class688.field9600; ++var41) {
                            if (var37.field9965.equals(class396.field5622[var41]) && ~class617.field8669[var41] != -1) {
                                var40 = true;
                                break;
                            }
                        }
                        boolean var42 = false;
                        for (int var43 = 0; var43 < class165.field2117; ++var43) {
                            if (var37.field9965.equals(class456.field6371[var43].field3572)) {
                                var42 = true;
                                break;
                            }
                        }
                        boolean var44 = false;
                        if (~class724.field10031.field9976 != -1 && var37.field9976 != 0 && ~class724.field10031.field9976 == ~var37.field9976) {
                            var44 = true;
                        }
                        if (var37.field10008) {
                            class353.method2221(var5, var39, class672.field9437[6], arg1, arg4, (byte) 104, var38, arg2);
                        } else if (var44) {
                            class353.method2221(var5, var39, class672.field9437[4], arg1, arg4, (byte) 34, var38, arg2);
                        } else if (!var37.field9996) {
                            if (var40) {
                                class353.method2221(var5, var39, class672.field9437[3], arg1, arg4, (byte) 73, var38, arg2);
                            } else if (!var42) {
                                class353.method2221(var5, var39, class672.field9437[2], arg1, arg4, (byte) 105, var38, arg2);
                            } else {
                                class353.method2221(var5, var39, class672.field9437[5], arg1, arg4, (byte) 36, var38, arg2);
                            }
                        } else {
                            class353.method2221(var5, var39, class672.field9437[7], arg1, arg4, (byte) 52, var38, arg2);
                        }
                    }
                }
                class657[] var19 = class115.field1569;
                for (int var20 = 0; var20 < var19.length; ++var20) {
                    class657 var23 = var19[var20];
                    if (var23 != null && ~var23.field9270 != -1 && ~(class533.field7336 % 20) > -11) {
                        if (var23.field9270 == 1) {
                            class685 var24 = (class685) class450.field6288.method3669(false, (long) var23.field9275);
                            if (var24 != null) {
                                class359 var25 = var24.field9573;
                                int var26 = var25.field3470 / 128 + -(var8 / 128);
                                int var27 = var25.field3460 / 128 + -(var6 / 128);
                                class16.method62(var23.field9268, arg2, arg4, 360000L, arg1, var27, var5, (byte) 97, var26);
                            }
                        }
                        if (~var23.field9270 == -3) {
                            int var28 = var23.field9277 / 128 + -(var8 / 128);
                            int var29 = var23.field9272 / 128 + -(var6 / 128);
                            long var30 = (long) (var23.field9263 << 7);
                            long var32 = var30 * var30;
                            class16.method62(var23.field9268, arg2, arg4, var32, arg1, var29, var5, (byte) 110, var28);
                        }
                        if (~var23.field9270 == -11 && ~var23.field9275 <= -1 && ~class413.field5787.length < ~var23.field9275) {
                            class723 var34 = class413.field5787[var23.field9275];
                            if (var34 != null) {
                                int var35 = var34.field3470 / 128 + -(var8 / 128);
                                int var36 = var34.field3460 / 128 + -(var6 / 128);
                                class16.method62(var23.field9268, arg2, arg4, 360000L, arg1, var36, var5, (byte) 101, var35);
                            }
                        }
                    }
                }
                if (~class695.field9691 != -5) {
                    if (~class683.field9568 != -1) {
                        int var21 = class683.field9568 * 4 - -2 + (-(var8 / 128) - -((class724.field10031.method3744(1) + -1) * 2));
                        int var22 = class461.field6447 * 4 - (var6 / 128 + -2 - (class724.field10031.method3744(1) - 1) * 2);
                        class353.method2221(var5, var22, class683.field9569[!class773.field10654 ? 0 : 1], arg1, arg4, (byte) 15, var21, arg2);
                    }
                    if (!class724.field10031.field9989) {
                        arg3.method2822(3, 3, arg1.field1560 / 2 + (arg4 - 1), 1, arg1.field1517 / 2 + arg2 + -1, -1);
                        return;
                    }
                }
            } else {
                arg3.method176(-16777216, var5, arg4, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Loaa;II[III)V")
    public class158(class556 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class75.field837, class612.field8616, arg1 * arg2, false);
        this.field2047 = arg1;
        this.field2053 = arg2;
        super.field1006.method1492(this, 2);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field1016, 0, 6408, this.field2047, this.field2053, 0, 32993, super.field1006.field7816, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Loaa;Lpb;II[FII)V")
    public class158(class556 arg0, class2 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class612.field8620, arg2 * arg3, false);
        this.field2053 = arg3;
        this.field2047 = arg2;
        super.field1006.method1492(this, 2);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field1016, 0, this.method631(-71), arg2, arg3, 0, class723.method4029(29, super.field994), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(FZ)F")
    public final float method128(float arg0, boolean arg1) {
        ++field2056;
        if (!arg1) {
            field2049 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIILwc;)Z")
    public static final boolean method1019(int arg0, int arg1, int arg2, int arg3, class391 arg4) {
        int var5 = 17 / ((arg2 - 9) / 57);
        ++field2052;
        if (class623.field8736 && class19.field125) {
            if (~class380.field5448 > -101) {
                return false;
            } else if (!class322.method2044(arg1, arg3, arg0, 1)) {
                return false;
            } else {
                int var6 = arg1 << class732.field10110;
                int var7 = arg3 << class732.field10110;
                int var8 = class661.field9303[arg0].method2525(arg1, arg3, (byte) 114) + -1;
                int var9 = var8 + arg4.method78((byte) -82);
                if (arg4.field5564 == 1) {
                    if (!class351.method2215(var7, 62, var6, var6, var8, var6, var9, var9, class179.field2263 + var7, var7)) {
                        return false;
                    } else if (!class351.method2215(var7, 98, var6, var6, var8, var6, var9, var8, class179.field2263 + var7, class179.field2263 + var7)) {
                        return false;
                    } else {
                        ++class759.field10431;
                        return true;
                    }
                } else if (~arg4.field5564 == -3) {
                    if (!class351.method2215(var7 - -class179.field2263, 77, var6, var6, var8, var6 - -class179.field2263, var9, var9, var7 - -class179.field2263, class179.field2263 + var7)) {
                        return false;
                    } else if (!class351.method2215(var7 - -class179.field2263, 59, var6, var6 - -class179.field2263, var8, class179.field2263 + var6, var8, var9, class179.field2263 + var7, var7 - -class179.field2263)) {
                        return false;
                    } else {
                        ++class759.field10431;
                        return true;
                    }
                } else if (~arg4.field5564 == -5) {
                    if (!class351.method2215(var7, -67, class179.field2263 + var6, class179.field2263 + var6, var8, class179.field2263 + var6, var9, var9, class179.field2263 + var7, var7)) {
                        return false;
                    } else if (!class351.method2215(var7, -91, class179.field2263 + var6, class179.field2263 + var6, var8, class179.field2263 + var6, var9, var8, var7 - -class179.field2263, class179.field2263 + var7)) {
                        return false;
                    } else {
                        ++class759.field10431;
                        return true;
                    }
                } else if (~arg4.field5564 == -9) {
                    if (!class351.method2215(var7, 89, var6, var6, var8, class179.field2263 + var6, var9, var9, var7, var7)) {
                        return false;
                    } else if (!class351.method2215(var7, -109, var6, var6 - -class179.field2263, var8, class179.field2263 + var6, var8, var9, var7, var7)) {
                        return false;
                    } else {
                        ++class759.field10431;
                        return true;
                    }
                } else if (arg4.field5564 == 16) {
                    if (!class554.method3262(var8, class760.field10442, var9, class760.field10442 + var7, -10796, var6, class760.field10442)) {
                        return false;
                    } else {
                        ++class759.field10431;
                        return true;
                    }
                } else if (~arg4.field5564 == -33) {
                    if (!class554.method3262(var8, class760.field10442, var9, class760.field10442 + var7, -10796, class760.field10442 + var6, class760.field10442)) {
                        return false;
                    } else {
                        ++class759.field10431;
                        return true;
                    }
                } else if (~arg4.field5564 == -65) {
                    if (!class554.method3262(var8, class760.field10442, var9, var7, -10796, class760.field10442 + var6, class760.field10442)) {
                        return false;
                    } else {
                        ++class759.field10431;
                        return true;
                    }
                } else if (arg4.field5564 == 128) {
                    if (!class554.method3262(var8, class760.field10442, var9, var7, -10796, var6, class760.field10442)) {
                        return false;
                    } else {
                        ++class759.field10431;
                        return true;
                    }
                } else {
                    return true;
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)Z")
    public final boolean method132(int arg0) {
        if (arg0 <= 32) {
            return true;
        } else {
            ++field2060;
            return false;
        }
    }
}
