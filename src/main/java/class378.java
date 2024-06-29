import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class378 {

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "Lsba;")
    private static class200 field5867 = new class200(16);

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
    public static int field5879 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
    public static int field5881 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "[S")
    private static short[] field5875 = new short[1];

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "[B")
    private static byte[] field5882 = new byte[1];

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "Lor;")
    public static class594 field5883 = new class594();

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "F")
    public static float field5877;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "F")
    public static float field5884;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!fr", name = "A", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!fr", name = "B", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!fr", name = "F", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!fr", name = "H", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!fr", name = "I", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!fr", name = "J", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!fr", name = "K", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!fr", name = "L", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!fr", name = "N", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!fr", name = "M", descriptor = "Lsba;")
    private static class200 field5904;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "Lsb;")
    public static class266 field5869;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "Lhfa;")
    public static class285 field5870;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "Lba;")
    public static class354 field5872;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "Ldp;")
    private static class3 field5866;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "Llk;")
    public static class544 field5873;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "Lck;")
    public static class595 field5880;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "Lkca;")
    private static class74 field5871;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "Lil;")
    public static class7 field5874;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "Lri;")
    public static class97 field5868;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "[B")
    private static byte[] field5885;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "[B")
    private static byte[] field5886;

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "[B")
    private static byte[] field5891;

    @OriginalMember(owner = "client!fr", name = "D", descriptor = "[B")
    private static byte[] field5895;

    @OriginalMember(owner = "client!fr", name = "E", descriptor = "[B")
    private static byte[] field5896;

    @OriginalMember(owner = "client!fr", name = "C", descriptor = "[I")
    private static int[] field5894;

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "[S")
    private static short[] field5889;

    @OriginalMember(owner = "client!fr", name = "G", descriptor = "[S")
    private static short[] field5898;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "[[[B")
    public static byte[][][] field5878;

    @OriginalMember(owner = "client!fr", name = "O", descriptor = "[[[Lqe;")
    private static class433[][][] field5906;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lr;Lie;IIII[I[I)V", line = 4)
    private static final void method2473(class167 arg0, class6 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method70(-9059);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method70(-9059);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field5896[field5905 * arg5 + arg4] = (byte) var11;
                    field5885[field5905 * arg5 + arg4] = 0;
                } else {
                    field5885[field5905 * arg5 + arg4] = (byte) var11;
                    field5891[field5905 * arg5 + arg4] = 0;
                    field5896[field5905 * arg5 + arg4] = arg1.method81(true);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method70(-9059);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method70(-9059);
                var18 = arg1.method70(-9059);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method70(-9059);
            }
            if (var15 == 0) {
                field5896[field5905 * arg5 + arg4] = (byte) var16;
                field5885[field5905 * arg5 + arg4] = (byte) var17;
                field5891[field5905 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field5889[field5905 * arg5 + arg4] = (short) (arg1.method67(12021) + 1);
                    field5886[field5905 * arg5 + arg4] = arg1.method81(true);
                } else if (var19 > 1) {
                    field5889[field5905 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method67(12021);
                        var21[var22] = arg1.method81(true);
                    }
                    field5904.method1564((long) (arg4 << 16 | arg5), new class21(var20, var21), (byte) 124);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method67(12021);
                        var24[var25] = arg1.method81(true);
                    }
                }
                if (field5906[var15 - 1][arg2 - (field5901 >> 6)][arg3 - (field5902 >> 6)] == null) {
                    field5906[var15 - 1][arg2 - (field5901 >> 6)][arg3 - (field5902 >> 6)] = new class433();
                }
                class699 var26 = new class699(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field5906[var15 - 1][arg2 - (field5901 >> 6)][arg3 - (field5902 >> 6)].method2757(var26, -1);
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "([B[B[SII)V", line = 139)
    private static final void method2474(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field5888];
        int[] var6 = new int[field5888];
        int[] var7 = new int[field5888];
        int[] var8 = new int[field5888];
        int[] var9 = new int[field5888];
        for (int var10 = -5; var10 < field5905; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field5888; var13++) {
                int var10002;
                if (var11 < field5905) {
                    int var28 = arg0[field5905 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class565 var29 = field5866.method16(var28 - 1, (byte) -111);
                        var5[var13] += var29.field8113;
                        var6[var13] += var29.field8116;
                        var7[var13] += var29.field8114;
                        var8[var13] += var29.field8111;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field5905 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class565 var31 = field5866.method16(var30 - 1, (byte) 105);
                        var5[var13] -= var31.field8113;
                        var6[var13] -= var31.field8116;
                        var7[var13] -= var31.field8114;
                        var8[var13] -= var31.field8111;
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
                for (int var19 = -5; var19 < field5888; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field5888) {
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
                        if ((arg0[field5905 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field5905 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class294.method2059((byte) 123, var14 * 256 / var17, var16 / var18, var15 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field5905 * var19 + var10;
                            int var27 = class444.field6749[class65.method702(-97, class333.method2308(96, var25, (byte) -22)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIIIII)V", line = 285)
    public static final void method2475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5903 = arg0 - field5901;
        field5900 = arg1 - field5902;
        field5892 = arg2 - field5901;
        field5893 = arg3 - field5902;
        field5887 = arg4;
        field5890 = arg5;
        field5899 = arg6;
        field5897 = arg7;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "()V", line = 295)
    public static final void method2476() {
        field5896 = new byte[field5905 * field5888];
        field5885 = new byte[field5905 * field5888];
        field5891 = new byte[field5905 * field5888];
        field5889 = new short[field5905 * field5888];
        field5886 = new byte[field5905 * field5888];
        field5904 = new class200(1024);
        field5906 = new class433[3][field5905 >> 6][field5888 >> 6];
        field5894 = new int[field5871.field938 + 1];
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lr;IIIIIII[S[BZ)V", line = 305)
    private static final void method2477(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method335(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field5894[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method335(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class111.method1030(var11, arg7 >> 6 & 0x3, (byte) 103, arg2, arg5, arg3, arg1, var12, arg0, field5878, field5876, arg4, field5894[arg6]);
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
                class698 var18 = field5874.method94(arg8[var16] & 0xFFFF, (byte) -42);
                if (var18.field9793 == -1) {
                    int var19 = -3355444;
                    if (var18.field9830 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method356(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method279(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method356(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method279(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method356(arg1, arg2, arg4, -1, 0);
                            arg0.method279(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method356(var14, arg2, arg4, -1, 0);
                            arg0.method279(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method356(var14, arg2, arg4, -1, 0);
                            arg0.method279(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method356(arg1, arg2, arg4, -1, 0);
                            arg0.method279(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method279(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method279(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method279(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method279(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method279(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method279(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lr;IIII)V", line = 470)
    private static final void method2478(class167 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field5892 - field5903;
        int var6 = field5900 - field5893;
        if (field5892 < field5905) {
            var5++;
        }
        if (field5900 < field5888) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field5887;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field5887;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field5903 + var7;
                if (var52 >= 0 && var52 < field5905) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field5897 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field5897 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field5893 + var53;
                            int var58 = field5905 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field5888) {
                                var59 = (field5895[var58] & 0xFF) << 16 | field5898[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field5885[var58] & 0xFF;
                                var61 = field5889[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field5872.field5639 != -1) {
                                    var62 = field5872.field5639 | 0xFF000000;
                                } else if ((field5903 + var7 & 0x4) == (field5900 + var53 & 0x4)) {
                                    var62 = field5894[field5871.field940 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method335(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2477(arg0, var49, var54, var51, var56, var59, var60, field5891[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class21 var63 = (class21) field5904.method1558((long) (var52 << 16 | var57), (byte) -93);
                                if (var63 != null) {
                                    method2477(arg0, var49, var54, var51, var56, var59, var60, field5891[var58], var63.field334, var63.field335, true);
                                }
                            } else {
                                field5875[0] = (short) (var61 - 1);
                                field5882[0] = field5886[var58];
                                method2477(arg0, var49, var54, var51, var56, var59, var60, field5891[var58], field5875, field5882, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field5897 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field5897 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field5872.field5639 != -1) {
                            var68 = field5872.field5639 | 0xFF000000;
                        } else if ((field5903 + var7 & 0x4) == (field5900 + var64 & 0x4)) {
                            var68 = field5894[field5871.field940 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method335(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field5887;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field5887;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field5903 + var8;
                if (var41 >= 0 && var41 < field5905) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field5897 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field5897 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field5893 + var42;
                            if (var46 >= 0 && var46 < field5888) {
                                int var47 = field5889[field5905 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2483(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class21 var48 = (class21) field5904.method1558((long) (var41 << 16 | var46), (byte) -93);
                                    if (var48 != null) {
                                        method2483(arg0, var38, var43, var40, var45, var48.field334, var48.field335);
                                    }
                                } else {
                                    field5875[0] = (short) (var47 - 1);
                                    field5882[0] = field5886[field5905 * var46 + var41];
                                    method2483(arg0, var38, var43, var40, var45, field5875, field5882);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field5903 >> 6;
        int var10 = field5893 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field5892 >> 6;
        int var12 = field5900 >> 6;
        if (var11 >= field5906[0].length) {
            var11 = field5906[0].length - 1;
        }
        if (var12 >= field5906[0][0].length) {
            var12 = field5906[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class433 var28 = field5906[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field5901 >> 6) + var14) * 64;
                        int var30 = ((field5902 >> 6) + var27) * 64;
                        for (class699 var31 = (class699) var28.method2754((byte) -119); var31 != null; var31 = (class699) var28.method2759(1486415172)) {
                            int var32 = var31.field9857 + var29 - field5901 - field5903;
                            int var33 = var31.field9859 + var30 - field5902 - field5893;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field5887;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field5887;
                            int var36 = field5897 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field5897 - (arg2 * var33 + arg4 >> 16);
                            method2477(arg0, var34, var36, var35 - var34, var37 - var36, var31.field9858, var31.field9861 & 0xFF, var31.field9862, var31.field9856, var31.field9860, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class433 var17 = field5906[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field5901 >> 6) + var15) * 64;
                        int var19 = ((field5902 >> 6) + var16) * 64;
                        for (class699 var20 = (class699) var17.method2754((byte) -51); var20 != null; var20 = (class699) var17.method2759(1486415172)) {
                            int var21 = var20.field9857 + var18 - field5901 - field5903;
                            int var22 = var20.field9859 + var19 - field5902 - field5893;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field5887;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field5887;
                            int var25 = field5897 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field5897 - (arg2 * var22 + arg4 >> 16);
                            method2483(arg0, var23, var25, var24 - var23, var26 - var25, var20.field9856, var20.field9860);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)Lba;", line = 814)
    public static final class354 method2479(int arg0, int arg1) {
        for (class354 var2 = (class354) field5867.method1556(74); var2 != null; var2 = (class354) field5867.method1559(74)) {
            if (var2.field5649 && var2.method2379(arg1, arg0, true)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lfa;II)V", line = 828)
    public static final void method2480(class214 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field5871.field938; var3++) {
            field5894[var3 + 1] = method2484(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)Lce;", line = 838)
    public static final class283 method2481(int arg0, int arg1) {
        class283 var2 = new class283();
        for (class354 var3 = (class354) field5867.method1556(94); var3 != null; var3 = (class354) field5867.method1559(83)) {
            if (var3.field5649 && var3.method2379(arg1, arg0, true)) {
                var2.method2015(var3, -98);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(Lr;IIII)Lor;", line = 855)
    private static final class594 method2482(class167 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class143 var5 = (class143) field5883.method3465((byte) 103); var5 != null; var5 = (class143) field5883.method3469(0)) {
            method2488(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field5883;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lr;IIII[S[B)V", line = 865)
    private static final void method2483(class167 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class698 var8 = field5874.method94(arg5[var7] & 0xFFFF, (byte) -42);
            int var9 = var8.field9793;
            if (var9 != -1) {
                class265 var10 = field5869.method1885(false, var9);
                class702 var11 = var10.method1879(64, var8.field9824 ? arg6[var7] >> 6 & 0x3 : 0, var8.field9845 ? var8.field9818 : false, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1076() >> 2;
                    int var13 = arg4 * var11.method1079() >> 2;
                    if (var10.field4310) {
                        int var14 = var8.field9851;
                        int var15 = var8.field9829;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field4317 == 0) {
                            var11.method3958(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method3954(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field4317 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lfa;III)I", line = 924)
    private static final int method2484(class214 arg0, int arg1, int arg2, int arg3) {
        class661 var4 = field5871.method748(arg1, (byte) 24);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field9201;
        if (var5 >= 0 && arg0.method1610(18904, var5).field4117) {
            var5 = -1;
        }
        int var9;
        if (var4.field9210 >= 0) {
            int var6 = var4.field9210;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class444.field6749[class65.method702(-84, class300.method2076(2, 96, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class444.field6749[class65.method702(-120, class300.method2076(2, 96, arg0.method1610(18904, var5).field4120)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field9206 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field9206;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class444.field6749[class65.method702(-117, class300.method2076(2, 96, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "()V", line = 983)
    public static final void method2485() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field5880.field8438; var1++) {
            boolean var2 = field5872.method2377(field5880.field8439[var1] >> 14 & 0x3FFF, var0, field5880.field8439[var1] & 0x3FFF, 12800, field5880.field8439[var1] >> 28 & 0x3);
            if (var2) {
                class143 var3 = new class143(field5880.field8433[var1]);
                var3.field2406 = var0[1] - field5901;
                var3.field2407 = var0[2] - field5902;
                field5883.method3463((byte) -87, var3);
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lr;)Lor;", line = 1006)
    public static final class594 method2486(class167 arg0) {
        int var1 = field5892 - field5903;
        int var2 = field5900 - field5893;
        int var3 = (field5899 - field5887 << 16) / var1;
        int var4 = (field5897 - field5890 << 16) / var2;
        return method2482(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lr;II)V", line = 1017)
    public static final void method2487(class167 arg0, int arg1, int arg2) {
        class6 var3 = new class6(field5868.method923(field5872.field5651, -25124, "area"));
        int var4 = var3.method70(-9059);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method70(-9059);
        }
        int var7 = var3.method70(-9059);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method70(-9059);
        }
        while (true) {
            while (var3.field57 < var3.field96.length) {
                if (var3.method70(-9059) == 0) {
                    int var22 = var3.method70(-9059);
                    int var23 = var3.method70(-9059);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field5901;
                            int var27 = var23 * 64 + var25 - field5902;
                            method2473(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method70(-9059);
                    int var29 = var3.method70(-9059);
                    int var30 = var3.method70(-9059);
                    int var31 = var3.method70(-9059);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field5901;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field5902;
                            method2473(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field5895 = new byte[field5905 * field5888];
            field5898 = new short[field5905 * field5888];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field5905 * field5888];
                for (int var13 = 0; var13 < field5906[var11].length; var13++) {
                    for (int var19 = 0; var19 < field5906[var11][0].length; var19++) {
                        class433 var20 = field5906[var11][var13][var19];
                        if (var20 != null) {
                            for (class699 var21 = (class699) var20.method2754((byte) -97); var21 != null; var21 = (class699) var20.method2759(1486415172)) {
                                var12[(var19 * 64 + var21.field9859) * field5905 + var13 * 64 + var21.field9857] = (byte) var21.field9858;
                            }
                        }
                    }
                }
                method2474(var12, field5895, field5898, arg1, arg2);
                for (int var14 = 0; var14 < field5906[var11].length; var14++) {
                    for (int var15 = 0; var15 < field5906[var11][0].length; var15++) {
                        class433 var16 = field5906[var11][var14][var15];
                        if (var16 != null) {
                            for (class699 var17 = (class699) var16.method2754((byte) -101); var17 != null; var17 = (class699) var16.method2759(1486415172)) {
                                int var18 = (var15 * 64 + var17.field9859) * field5905 + var14 * 64 + var17.field9857;
                                var17.field9858 = (field5895[var18] & 0xFF) << 16 | field5898[var18] & 0xFFFF;
                                if (var17.field9858 != 0) {
                                    var17.field9858 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2474(field5896, field5895, field5898, arg1, arg2);
            field5896 = null;
            method2493();
            return;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lr;Lkt;IIII)V", line = 1195)
    private static final void method2488(class167 arg0, class143 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field2401 = ((arg1.field2406 - field5903) * arg2 + arg4 >> 16) + field5887;
        arg1.field2400 = field5897 - ((arg1.field2407 - field5893) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 1199)
    public static final void method2489(int arg0) {
        field5872 = (class354) field5867.method1558((long) arg0, (byte) -93);
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)Lba;", line = 1203)
    public static final class354 method2490(int arg0) {
        return (class354) field5867.method1558((long) arg0, (byte) -93);
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(Lr;)V", line = 1212)
    public static final void method2491(class167 arg0) {
        int var1 = field5892 - field5903;
        int var2 = field5900 - field5893;
        int var3 = (field5899 - field5887 << 16) / var1;
        int var4 = (field5897 - field5890 << 16) / var2;
        method2478(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "()V", line = 1224)
    public static void method2492() {
        field5871 = null;
        field5866 = null;
        field5874 = null;
        field5873 = null;
        field5869 = null;
        field5870 = null;
        field5872 = null;
        field5868 = null;
        field5867 = null;
        field5878 = null;
        field5875 = null;
        field5882 = null;
        field5880 = null;
        field5883 = null;
        field5894 = null;
        field5896 = null;
        field5895 = null;
        field5898 = null;
        field5885 = null;
        field5891 = null;
        field5889 = null;
        field5886 = null;
        field5904 = null;
        field5906 = null;
    }

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "()V", line = 1252)
    private static final void method2493() {
        for (int var0 = 0; var0 < field5905; var0++) {
            for (int var11 = 0; var11 < field5888; var11++) {
                int var12 = field5889[field5905 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class21 var13 = (class21) field5904.method1558((long) (var0 << 16 | var11), (byte) -93);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field334.length; var14++) {
                                class698 var15 = field5874.method94(var13.field334[var14] & 0xFFFF, (byte) -42);
                                int var16 = var15.field9848;
                                if (var15.field9826 != null) {
                                    class698 var17 = var15.method3934(field5870, 96);
                                    if (var17 != null) {
                                        var16 = var17.field9848;
                                    }
                                }
                                if (var16 != -1) {
                                    class143 var18 = new class143(var16);
                                    var18.field2406 = var0;
                                    var18.field2407 = var11;
                                    field5883.method3463((byte) -87, var18);
                                }
                            }
                        }
                    } else {
                        class698 var19 = field5874.method94(var12 - 1, (byte) -42);
                        int var20 = var19.field9848;
                        if (var19.field9826 != null) {
                            class698 var21 = var19.method3934(field5870, -25);
                            if (var21 != null) {
                                var20 = var21.field9848;
                            }
                        }
                        if (var20 != -1) {
                            class143 var22 = new class143(var20);
                            var22.field2406 = var0;
                            var22.field2407 = var11;
                            field5883.method3463((byte) -87, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field5906[0].length; var2++) {
                for (int var3 = 0; var3 < field5906[0][0].length; var3++) {
                    class433 var4 = field5906[var1][var2][var3];
                    if (var4 != null) {
                        for (class699 var5 = (class699) var4.method2754((byte) -27); var5 != null; var5 = (class699) var4.method2759(1486415172)) {
                            if (var5.field9856 != null) {
                                for (int var6 = 0; var6 < var5.field9856.length; var6++) {
                                    class698 var7 = field5874.method94(var5.field9856[var6] & 0xFFFF, (byte) -42);
                                    int var8 = var7.field9848;
                                    if (var7.field9826 != null) {
                                        class698 var9 = var7.method3934(field5870, -35);
                                        if (var9 != null) {
                                            var8 = var9.field9848;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class143 var10 = new class143(var8);
                                        var10.field2406 = ((field5901 >> 6) + var2) * 64 + var5.field9857 - field5901;
                                        var10.field2407 = ((field5902 >> 6) + var3) * 64 + var5.field9859 - field5902;
                                        field5883.method3463((byte) -87, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lri;Lkca;Ldp;Lil;Llk;Lsb;Lhfa;)V", line = 1408)
    public static final void method2494(class97 arg0, class74 arg1, class3 arg2, class7 arg3, class544 arg4, class266 arg5, class285 arg6) {
        field5868 = arg0;
        field5871 = arg1;
        field5866 = arg2;
        field5874 = arg3;
        field5873 = arg4;
        field5869 = arg5;
        field5870 = arg6;
        field5867.method1562((byte) 113);
        int var7 = field5868.method928(false, "details");
        int[] var8 = field5868.method919((byte) 54, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class354 var10 = class166.method1344(var7, var8[var9], (byte) 118, field5868);
                field5867.method1564((long) var10.field5635, var10, (byte) 84);
            }
        }
        class597.method3480(false, true, (byte) -63);
    }

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "()V", line = 1438)
    public static final void method2495() {
        field5896 = null;
        field5895 = null;
        field5898 = null;
        field5885 = null;
        field5891 = null;
        field5889 = null;
        field5886 = null;
        field5904 = null;
        field5906 = null;
        field5894 = null;
    }
}
