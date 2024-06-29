import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class706 {

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "Lbc;")
    private static class9 field9830 = new class9(16);

    @OriginalMember(owner = "client!dfa", name = "n", descriptor = "I")
    public static int field9839 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!dfa", name = "l", descriptor = "[B")
    private static byte[] field9837 = new byte[1];

    @OriginalMember(owner = "client!dfa", name = "s", descriptor = "I")
    public static int field9844 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!dfa", name = "p", descriptor = "[S")
    private static short[] field9841 = new short[1];

    @OriginalMember(owner = "client!dfa", name = "m", descriptor = "Lki;")
    public static class364 field9838 = new class364();

    @OriginalMember(owner = "client!dfa", name = "j", descriptor = "F")
    public static float field9835;

    @OriginalMember(owner = "client!dfa", name = "k", descriptor = "F")
    public static float field9836;

    @OriginalMember(owner = "client!dfa", name = "r", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!dfa", name = "v", descriptor = "I")
    public static int field9847;

    @OriginalMember(owner = "client!dfa", name = "x", descriptor = "I")
    public static int field9849;

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "I")
    public static int field9851;

    @OriginalMember(owner = "client!dfa", name = "C", descriptor = "I")
    public static int field9854;

    @OriginalMember(owner = "client!dfa", name = "D", descriptor = "I")
    public static int field9855;

    @OriginalMember(owner = "client!dfa", name = "E", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!dfa", name = "H", descriptor = "I")
    public static int field9859;

    @OriginalMember(owner = "client!dfa", name = "I", descriptor = "I")
    public static int field9860;

    @OriginalMember(owner = "client!dfa", name = "J", descriptor = "I")
    public static int field9861;

    @OriginalMember(owner = "client!dfa", name = "L", descriptor = "I")
    public static int field9863;

    @OriginalMember(owner = "client!dfa", name = "M", descriptor = "I")
    public static int field9864;

    @OriginalMember(owner = "client!dfa", name = "O", descriptor = "I")
    public static int field9866;

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "Lh;")
    private static class214 field9831;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "Ldga;")
    public static class230 field9826;

    @OriginalMember(owner = "client!dfa", name = "i", descriptor = "Lmd;")
    private static class245 field9834;

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "Lhp;")
    public static class329 field9828;

    @OriginalMember(owner = "client!dfa", name = "h", descriptor = "Laj;")
    public static class401 field9833;

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "Lse;")
    public static class4 field9829;

    @OriginalMember(owner = "client!dfa", name = "g", descriptor = "Ltp;")
    public static class545 field9832;

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "Lpe;")
    public static class615 field9827;

    @OriginalMember(owner = "client!dfa", name = "o", descriptor = "Loda;")
    public static class657 field9840;

    @OriginalMember(owner = "client!dfa", name = "F", descriptor = "Lbc;")
    private static class9 field9857;

    @OriginalMember(owner = "client!dfa", name = "t", descriptor = "[B")
    private static byte[] field9845;

    @OriginalMember(owner = "client!dfa", name = "u", descriptor = "[B")
    private static byte[] field9846;

    @OriginalMember(owner = "client!dfa", name = "y", descriptor = "[B")
    private static byte[] field9850;

    @OriginalMember(owner = "client!dfa", name = "A", descriptor = "[B")
    private static byte[] field9852;

    @OriginalMember(owner = "client!dfa", name = "G", descriptor = "[B")
    private static byte[] field9858;

    @OriginalMember(owner = "client!dfa", name = "K", descriptor = "[I")
    private static int[] field9862;

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "[S")
    private static short[] field9848;

    @OriginalMember(owner = "client!dfa", name = "N", descriptor = "[S")
    private static short[] field9865;

    @OriginalMember(owner = "client!dfa", name = "q", descriptor = "[[[B")
    public static byte[][][] field9842;

    @OriginalMember(owner = "client!dfa", name = "B", descriptor = "[[[Lhca;")
    private static class365[][][] field9853;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Le;III)I", line = 6)
    private static final int method3853(class702 arg0, int arg1, int arg2, int arg3) {
        class612 var4 = field9834.method1533(false, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field8270;
        if (var5 >= 0 && arg0.method3162((byte) -104, var5).field799) {
            var5 = -1;
        }
        int var9;
        if (var4.field8262 >= 0) {
            int var6 = var4.field8262;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class127.field1637[class111.method855(class463.method2589(96, var8, (byte) -108), -3159) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class127.field1637[class111.method855(class463.method2589(96, arg0.method3162((byte) -104, var5).field804, (byte) -128), -3159) & 0xFFFF] | 0xFF000000;
        } else if (var4.field8275 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field8275;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class127.field1637[class111.method855(class463.method2589(96, var12, (byte) -112), -3159) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Loa;Lfd;IIII[I[I)V", line = 68)
    private static final void method3854(class43 arg0, class418 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2396(1);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2396(1);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field9858[field9861 * arg5 + arg4] = (byte) var11;
                    field9845[field9861 * arg5 + arg4] = 0;
                } else {
                    field9845[field9861 * arg5 + arg4] = (byte) var11;
                    field9846[field9861 * arg5 + arg4] = 0;
                    field9858[field9861 * arg5 + arg4] = arg1.method2387((byte) 107);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2396(101);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2396(22);
                var18 = arg1.method2396(89);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2396(-11);
            }
            if (var15 == 0) {
                field9858[field9861 * arg5 + arg4] = (byte) var16;
                field9845[field9861 * arg5 + arg4] = (byte) var17;
                field9846[field9861 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field9848[field9861 * arg5 + arg4] = (short) (arg1.method2393(-30727) + 1);
                    field9850[field9861 * arg5 + arg4] = arg1.method2387((byte) 125);
                } else if (var19 > 1) {
                    field9848[field9861 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2393(-30727);
                        var21[var22] = arg1.method2387((byte) -95);
                    }
                    field9857.method38(new class179(var20, var21), 103, (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2393(-30727);
                        var24[var25] = arg1.method2387((byte) -56);
                    }
                }
                if (field9853[var15 - 1][arg2 - (field9866 >> 6)][arg3 - (field9860 >> 6)] == null) {
                    field9853[var15 - 1][arg2 - (field9866 >> 6)][arg3 - (field9860 >> 6)] = new class365();
                }
                class474 var26 = new class474(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field9853[var15 - 1][arg2 - (field9866 >> 6)][arg3 - (field9860 >> 6)].method2104((byte) -22, var26);
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Loa;II)V", line = 203)
    public static final void method3855(class43 arg0, int arg1, int arg2) {
        class418 var3 = new class418(field9827.method3355(0, "area", field9826.field3075));
        int var4 = var3.method2396(112);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2396(-5);
        }
        int var7 = var3.method2396(-30);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2396(29);
        }
        while (true) {
            while (var3.field5367 < var3.field5393.length) {
                if (var3.method2396(-103) == 0) {
                    int var22 = var3.method2396(-4);
                    int var23 = var3.method2396(33);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field9866;
                            int var27 = var23 * 64 + var25 - field9860;
                            method3854(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2396(102);
                    int var29 = var3.method2396(78);
                    int var30 = var3.method2396(3);
                    int var31 = var3.method2396(-122);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field9866;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field9860;
                            method3854(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field9852 = new byte[field9861 * field9851];
            field9865 = new short[field9861 * field9851];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field9861 * field9851];
                for (int var13 = 0; var13 < field9853[var11].length; var13++) {
                    for (int var19 = 0; var19 < field9853[var11][0].length; var19++) {
                        class365 var20 = field9853[var11][var13][var19];
                        if (var20 != null) {
                            for (class474 var21 = (class474) var20.method2101(260); var21 != null; var21 = (class474) var20.method2098((byte) 57)) {
                                var12[(var19 * 64 + var21.field6178) * field9861 + var13 * 64 + var21.field6177] = (byte) var21.field6172;
                            }
                        }
                    }
                }
                method3868(var12, field9852, field9865, arg1, arg2);
                for (int var14 = 0; var14 < field9853[var11].length; var14++) {
                    for (int var15 = 0; var15 < field9853[var11][0].length; var15++) {
                        class365 var16 = field9853[var11][var14][var15];
                        if (var16 != null) {
                            for (class474 var17 = (class474) var16.method2101(260); var17 != null; var17 = (class474) var16.method2098((byte) 57)) {
                                int var18 = (var15 * 64 + var17.field6178) * field9861 + var14 * 64 + var17.field6177;
                                var17.field6172 = (field9852[var18] & 0xFF) << 16 | field9865[var18] & 0xFFFF;
                                if (var17.field6172 != 0) {
                                    var17.field6172 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method3868(field9858, field9852, field9865, arg1, arg2);
            field9858 = null;
            method3861();
            return;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Loa;IIII)V", line = 382)
    private static final void method3856(class43 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field9856 - field9863;
        int var6 = field9859 - field9864;
        if (field9856 < field9861) {
            var5++;
        }
        if (field9859 < field9851) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field9849;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field9849;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field9863 + var7;
                if (var52 >= 0 && var52 < field9861) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field9855 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field9855 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field9864 + var53;
                            int var58 = field9861 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field9851) {
                                var59 = (field9852[var58] & 0xFF) << 16 | field9865[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field9845[var58] & 0xFF;
                                var61 = field9848[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field9826.field3077 != -1) {
                                    var62 = field9826.field3077 | 0xFF000000;
                                } else if ((field9863 + var7 & 0x4) == (field9859 + var53 & 0x4)) {
                                    var62 = field9862[field9834.field3284 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method353(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method3860(arg0, var49, var54, var51, var56, var59, var60, field9846[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class179 var63 = (class179) field9857.method39((long) (var52 << 16 | var57), 31750);
                                if (var63 != null) {
                                    method3860(arg0, var49, var54, var51, var56, var59, var60, field9846[var58], var63.field2222, var63.field2223, true);
                                }
                            } else {
                                field9841[0] = (short) (var61 - 1);
                                field9837[0] = field9850[var58];
                                method3860(arg0, var49, var54, var51, var56, var59, var60, field9846[var58], field9841, field9837, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field9855 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field9855 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field9826.field3077 != -1) {
                            var68 = field9826.field3077 | 0xFF000000;
                        } else if ((field9863 + var7 & 0x4) == (field9859 + var64 & 0x4)) {
                            var68 = field9862[field9834.field3284 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method353(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field9849;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field9849;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field9863 + var8;
                if (var41 >= 0 && var41 < field9861) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field9855 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field9855 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field9864 + var42;
                            if (var46 >= 0 && var46 < field9851) {
                                int var47 = field9848[field9861 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method3859(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class179 var48 = (class179) field9857.method39((long) (var41 << 16 | var46), 31750);
                                    if (var48 != null) {
                                        method3859(arg0, var38, var43, var40, var45, var48.field2222, var48.field2223);
                                    }
                                } else {
                                    field9841[0] = (short) (var47 - 1);
                                    field9837[0] = field9850[field9861 * var46 + var41];
                                    method3859(arg0, var38, var43, var40, var45, field9841, field9837);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field9863 >> 6;
        int var10 = field9864 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field9856 >> 6;
        int var12 = field9859 >> 6;
        if (var11 >= field9853[0].length) {
            var11 = field9853[0].length - 1;
        }
        if (var12 >= field9853[0][0].length) {
            var12 = field9853[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class365 var28 = field9853[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field9866 >> 6) + var14) * 64;
                        int var30 = ((field9860 >> 6) + var27) * 64;
                        for (class474 var31 = (class474) var28.method2101(260); var31 != null; var31 = (class474) var28.method2098((byte) 57)) {
                            int var32 = var31.field6177 + var29 - field9866 - field9863;
                            int var33 = var31.field6178 + var30 - field9860 - field9864;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field9849;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field9849;
                            int var36 = field9855 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field9855 - (arg2 * var33 + arg4 >> 16);
                            method3860(arg0, var34, var36, var35 - var34, var37 - var36, var31.field6172, var31.field6176 & 0xFF, var31.field6174, var31.field6175, var31.field6173, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class365 var17 = field9853[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field9866 >> 6) + var15) * 64;
                        int var19 = ((field9860 >> 6) + var16) * 64;
                        for (class474 var20 = (class474) var17.method2101(260); var20 != null; var20 = (class474) var17.method2098((byte) 57)) {
                            int var21 = var20.field6177 + var18 - field9866 - field9863;
                            int var22 = var20.field6178 + var19 - field9860 - field9864;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field9849;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field9849;
                            int var25 = field9855 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field9855 - (arg2 * var22 + arg4 >> 16);
                            method3859(arg0, var23, var25, var24 - var23, var26 - var25, var20.field6175, var20.field6173);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "()V", line = 724)
    public static final void method3857() {
        field9858 = new byte[field9861 * field9851];
        field9845 = new byte[field9861 * field9851];
        field9846 = new byte[field9861 * field9851];
        field9848 = new short[field9861 * field9851];
        field9850 = new byte[field9861 * field9851];
        field9857 = new class9(1024);
        field9853 = new class365[3][field9861 >> 6][field9851 >> 6];
        field9862 = new int[field9834.field3277 + 1];
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Le;II)V", line = 736)
    public static final void method3858(class702 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field9834.field3277; var3++) {
            field9862[var3 + 1] = method3853(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Loa;IIII[S[B)V", line = 746)
    private static final void method3859(class43 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class698 var8 = field9828.method1900(-122, arg5[var7] & 0xFFFF);
            int var9 = var8.field9621;
            if (var9 != -1) {
                class631 var10 = field9832.method2890((byte) -128, var9);
                class511 var11 = var10.method3503(arg0, (byte) -2, var8.field9620 ? var8.field9599 : false, var8.field9666 ? arg6[var7] >> 6 & 0x3 : 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method602() >> 2;
                    int var13 = arg4 * var11.method595() >> 2;
                    if (var10.field8793) {
                        int var14 = var8.field9589;
                        int var15 = var8.field9654;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field8797 == 0) {
                            var11.method2754(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method604(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field8797 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Loa;IIIIIII[S[BZ)V", line = 804)
    private static final void method3860(class43 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method353(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field9862[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method353(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class240.method1517(var12, 3, field9862[arg6], arg1, arg2, arg7 >> 6 & 0x3, field9843, field9842, var11, arg0, arg4, arg5, arg3);
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var14;
        if (arg3 == 1) {
            var14 = arg1;
        } else {
            var14 = arg1 + arg3 - 1;
        }
        int var15;
        if (arg4 == 1) {
            var15 = arg2;
        } else {
            var15 = arg2 + arg4 - 1;
        }
        for (int var16 = 0; var16 < arg8.length; var16++) {
            int var17 = arg9[var16] & 0x3F;
            if (var17 == 0 || var17 == 2 || var17 == 3 || var17 == 9) {
                class698 var18 = field9828.method1900(-115, arg8[var16] & 0xFFFF);
                if (var18.field9621 == -1) {
                    int var19 = -3355444;
                    if (var18.field9660 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method378(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method347(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method378(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method347(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method378(arg1, arg2, arg4, -1, 0);
                            arg0.method347(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method378(var14, arg2, arg4, -1, 0);
                            arg0.method347(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method378(var14, arg2, arg4, -1, 0);
                            arg0.method347(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method378(arg1, arg2, arg4, -1, 0);
                            arg0.method347(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method347(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method347(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method347(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method347(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method347(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method347(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "()V", line = 969)
    private static final void method3861() {
        for (int var0 = 0; var0 < field9861; var0++) {
            for (int var11 = 0; var11 < field9851; var11++) {
                int var12 = field9848[field9861 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class179 var13 = (class179) field9857.method39((long) (var0 << 16 | var11), 31750);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field2222.length; var14++) {
                                class698 var15 = field9828.method1900(-123, var13.field2222[var14] & 0xFFFF);
                                int var16 = var15.field9681;
                                if (var15.field9630 != null) {
                                    class698 var17 = var15.method3815(65535, field9829);
                                    if (var17 != null) {
                                        var16 = var17.field9681;
                                    }
                                }
                                if (var16 != -1) {
                                    class700 var18 = new class700(var16);
                                    var18.field9760 = var0;
                                    var18.field9759 = var11;
                                    field9838.method2087(var18, -112);
                                }
                            }
                        }
                    } else {
                        class698 var19 = field9828.method1900(-118, var12 - 1);
                        int var20 = var19.field9681;
                        if (var19.field9630 != null) {
                            class698 var21 = var19.method3815(65535, field9829);
                            if (var21 != null) {
                                var20 = var21.field9681;
                            }
                        }
                        if (var20 != -1) {
                            class700 var22 = new class700(var20);
                            var22.field9760 = var0;
                            var22.field9759 = var11;
                            field9838.method2087(var22, 83);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field9853[0].length; var2++) {
                for (int var3 = 0; var3 < field9853[0][0].length; var3++) {
                    class365 var4 = field9853[var1][var2][var3];
                    if (var4 != null) {
                        for (class474 var5 = (class474) var4.method2101(260); var5 != null; var5 = (class474) var4.method2098((byte) 57)) {
                            if (var5.field6175 != null) {
                                for (int var6 = 0; var6 < var5.field6175.length; var6++) {
                                    class698 var7 = field9828.method1900(-121, var5.field6175[var6] & 0xFFFF);
                                    int var8 = var7.field9681;
                                    if (var7.field9630 != null) {
                                        class698 var9 = var7.method3815(65535, field9829);
                                        if (var9 != null) {
                                            var8 = var9.field9681;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class700 var10 = new class700(var8);
                                        var10.field9760 = ((field9866 >> 6) + var2) * 64 + var5.field6177 - field9866;
                                        var10.field9759 = ((field9860 >> 6) + var3) * 64 + var5.field6178 - field9860;
                                        field9838.method2087(var10, -103);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "()V", line = 1126)
    public static final void method3862() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field9840.field9164; var1++) {
            boolean var2 = field9826.method1446(var0, field9840.field9165[var1] & 0x3FFF, (byte) -124, field9840.field9165[var1] >> 28 & 0x3, field9840.field9165[var1] >> 14 & 0x3FFF);
            if (var2) {
                class700 var3 = new class700(field9840.field9162[var1]);
                var3.field9760 = var0[1] - field9866;
                var3.field9759 = var0[2] - field9860;
                field9838.method2087(var3, -114);
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)V", line = 1147)
    public static final void method3863(int arg0) {
        field9826 = (class230) field9830.method39((long) arg0, 31750);
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(Loa;IIII)Lki;", line = 1152)
    private static final class364 method3864(class43 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class700 var5 = (class700) field9838.method2090(true); var5 != null; var5 = (class700) field9838.method2088(-152)) {
            method3865(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field9838;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Loa;Lkq;IIII)V", line = 1162)
    private static final void method3865(class43 arg0, class700 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field9764 = ((arg1.field9760 - field9863) * arg2 + arg4 >> 16) + field9849;
        arg1.field9767 = field9855 - ((arg1.field9759 - field9864) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "()V", line = 1168)
    public static final void method3866() {
        field9858 = null;
        field9852 = null;
        field9865 = null;
        field9845 = null;
        field9846 = null;
        field9848 = null;
        field9850 = null;
        field9857 = null;
        field9853 = null;
        field9862 = null;
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)Ldga;", line = 1180)
    public static final class230 method3867(int arg0) {
        return (class230) field9830.method39((long) arg0, 31750);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "([B[B[SII)V", line = 1185)
    private static final void method3868(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field9851];
        int[] var6 = new int[field9851];
        int[] var7 = new int[field9851];
        int[] var8 = new int[field9851];
        int[] var9 = new int[field9851];
        for (int var10 = -5; var10 < field9861; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field9851; var13++) {
                int var10002;
                if (var11 < field9861) {
                    int var28 = arg0[field9861 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class280 var29 = field9831.method1370(var28 - 1, 128);
                        var5[var13] += var29.field3660;
                        var6[var13] += var29.field3668;
                        var7[var13] += var29.field3657;
                        var8[var13] += var29.field3656;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field9861 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class280 var31 = field9831.method1370(var30 - 1, 128);
                        var5[var13] -= var31.field3660;
                        var6[var13] -= var31.field3668;
                        var7[var13] -= var31.field3657;
                        var8[var13] -= var31.field3656;
                        var10002 = var9[var13]--;
                    }
                }
            }
            if (var10 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                for (int var19 = -5; var19 < field9851; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field9851) {
                        var14 += var5[var20];
                        var15 += var6[var20];
                        var16 += var7[var20];
                        var17 += var8[var20];
                        var18 += var9[var20];
                    }
                    int var21 = var19 - 5;
                    if (var21 >= 0) {
                        var14 -= var5[var21];
                        var15 -= var6[var21];
                        var16 -= var7[var21];
                        var17 -= var8[var21];
                        var18 -= var9[var21];
                    }
                    if (var19 >= 0 && var18 > 0) {
                        if ((arg0[field9861 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field9861 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class311.method1809(var16 / var18, false, var15 / var18, var14 * 256 / var17);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field9861 * var19 + var10;
                            int var27 = class127.field1637[class111.method855(class277.method1678(-31711, 96, var25), -3159) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Loa;)Lki;", line = 1329)
    public static final class364 method3869(class43 arg0) {
        int var1 = field9856 - field9863;
        int var2 = field9859 - field9864;
        int var3 = (field9847 - field9849 << 16) / var1;
        int var4 = (field9855 - field9854 << 16) / var2;
        return method3864(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lpe;Lmd;Lh;Lhp;Laj;Ltp;Lse;)V", line = 1340)
    public static final void method3870(class615 arg0, class245 arg1, class214 arg2, class329 arg3, class401 arg4, class545 arg5, class4 arg6) {
        field9827 = arg0;
        field9834 = arg1;
        field9831 = arg2;
        field9828 = arg3;
        field9833 = arg4;
        field9832 = arg5;
        field9829 = arg6;
        field9830.method41(62);
        int var7 = field9827.method3359("details", (byte) -112);
        int[] var8 = field9827.method3369((byte) -101, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class230 var10 = class469.method2603(var7, (byte) 82, field9827, var8[var9]);
                field9830.method38(var10, 122, (long) var10.field3064);
            }
        }
        class315.method1837(-1753516255, false, true);
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(Loa;)V", line = 1371)
    public static final void method3871(class43 arg0) {
        int var1 = field9856 - field9863;
        int var2 = field9859 - field9864;
        int var3 = (field9847 - field9849 << 16) / var1;
        int var4 = (field9855 - field9854 << 16) / var2;
        method3856(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIIIIII)V", line = 1381)
    public static final void method3872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9863 = arg0 - field9866;
        field9859 = arg1 - field9860;
        field9856 = arg2 - field9866;
        field9864 = arg3 - field9860;
        field9849 = arg4;
        field9854 = arg5;
        field9847 = arg6;
        field9855 = arg7;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)Ldga;", line = 1394)
    public static final class230 method3873(int arg0, int arg1) {
        for (class230 var2 = (class230) field9830.method42((byte) 30); var2 != null; var2 = (class230) field9830.method40(false)) {
            if (var2.field3058 && var2.method1450(-93, arg0, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "()V", line = 1407)
    public static void method3874() {
        field9834 = null;
        field9831 = null;
        field9828 = null;
        field9833 = null;
        field9832 = null;
        field9829 = null;
        field9826 = null;
        field9827 = null;
        field9830 = null;
        field9842 = null;
        field9841 = null;
        field9837 = null;
        field9840 = null;
        field9838 = null;
        field9862 = null;
        field9858 = null;
        field9852 = null;
        field9865 = null;
        field9845 = null;
        field9846 = null;
        field9848 = null;
        field9850 = null;
        field9857 = null;
        field9853 = null;
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(II)Lca;", line = 1445)
    public static final class119 method3875(int arg0, int arg1) {
        class119 var2 = new class119();
        for (class230 var3 = (class230) field9830.method42((byte) 109); var3 != null; var3 = (class230) field9830.method40(false)) {
            if (var3.field3058 && var3.method1450(123, arg0, arg1)) {
                var2.method890((byte) -10, var3);
            }
        }
        return var2;
    }
}
