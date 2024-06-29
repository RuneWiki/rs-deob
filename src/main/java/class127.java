import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class127 {

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "[I")
    public static int[] field1893 = new int[128];

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "[I")
    public static int[] field1896;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "[Lun;")
    public static class386[] field1895;

    static {
        for (int var0 = 0; var0 < field1893.length; var0++) {
            field1893[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field1893[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field1893[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field1893[var3] = var3 + 4;
        }
        field1893[42] = field1893[43] = 62;
        field1893[45] = field1893[47] = 63;
        field1894 = 0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 5)
    public static void method954(byte arg0) {
        field1893 = null;
        field1895 = null;
        field1896 = null;
        if (arg0 <= 21) {
            method954((byte) 70);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V", line = 19)
    public static final void method955(int arg0, int arg1) {
        field1888++;
        class120.field1823.method2290(false, arg1);
        class138.field2010.method2290(false, arg1);
        class123.field1855.method2290(false, arg1);
        class201.field2841.method2290(false, arg1);
        if (arg0 != 9358) {
            method959(59);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIF[FFBIIIF)V", line = 33)
    public static final void method956(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float[] arg6, float arg7, byte arg8, int arg9, int arg10, int arg11, float arg12) {
        field1890++;
        if (arg8 != 71) {
            method954((byte) -66);
        }
        int var13 = arg10 - arg2;
        int var14 = arg4 - arg1;
        int var15 = arg3 - arg11;
        float var16 = arg6[2] * (float) var14 + arg6[0] * (float) var13 + arg6[1] * (float) var15;
        float var17 = arg6[5] * (float) var14 + arg6[3] * (float) var13 + arg6[4] * (float) var15;
        float var18 = arg6[8] * (float) var14 + arg6[7] * (float) var15 + arg6[6] * (float) var13;
        float var19;
        float var20;
        if (arg0 == 0) {
            var19 = arg12 + 0.5F - var18;
            var20 = arg7 + var16 + 0.5F;
        } else if (arg0 == 1) {
            var20 = arg7 + var16 + 0.5F;
            var19 = arg12 + var18 + 0.5F;
        } else if (arg0 == 2) {
            var19 = arg5 + 0.5F - var17;
            var20 = arg7 + 0.5F - var16;
        } else if (arg0 == 3) {
            var19 = arg5 + 0.5F - var17;
            var20 = arg7 + var16 + 0.5F;
        } else if (arg0 == 4) {
            var19 = arg5 + 0.5F - var17;
            var20 = arg12 + var18 + 0.5F;
        } else {
            var20 = arg12 + 0.5F - var18;
            var19 = arg5 + 0.5F - var17;
        }
        if (arg9 == 1) {
            float var21 = var20;
            var20 = -var19;
            var19 = var21;
        } else if (arg9 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg9 == 3) {
            float var22 = var20;
            var20 = var19;
            var19 = -var22;
        }
        class598.field8456 = var20;
        class264.field4007 = var19;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)Lws;", line = 119)
    public static final class325 method957(int arg0, int arg1) {
        field1891++;
        return arg1 == 5492 ? new class325(arg0, false) : null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILr;ILvg;IILua;I)V", line = 133)
    public static final void method958(int arg0, int arg1, class166 arg2, int arg3, class49 arg4, int arg5, int arg6, class617 arg7, int arg8) {
        field1892++;
        class588 var9 = class255.field3916.method812((byte) 127, arg8);
        if (var9 != null && var9.field8257 && var9.method3329(34379, class61.field1163)) {
            if (var9.field8243 != null) {
                int[] var10 = new int[var9.field8243.length];
                for (int var11 = 0; var11 < var10.length / 2; var11++) {
                    int var13;
                    if (class43.field700 == 4) {
                        var13 = (int) class630.field8811 & 0x3FFF;
                    } else {
                        var13 = (int) class630.field8811 + class252.field3880 & 0x3FFF;
                    }
                    int var14 = class189.field2719[var13];
                    int var15 = class189.field2721[var13];
                    if (class43.field700 != 4) {
                        var15 = var15 * 256 / (class287.field4280 + 256);
                        var14 = var14 * 256 / (class287.field4280 + 256);
                    }
                    var10[var11 * 2] = ((var9.field8243[var11 * 2 + 1] * 4 + arg6) * var14 + ((var9.field8243[var11 * 2] * 4 + arg0) * var15) >> 14) + arg4.field967 / 2 + arg3;
                    var10[var11 * 2 + 1] = arg1 + (arg4.field877 / 2) - ((var9.field8243[var11 * 2 - -1] * 4 + arg6) * var15 + -((var9.field8243[var11 * 2] * 4 + arg0) * var14) >> 14);
                }
                class464.method2735(arg2, var10, var9.field8224, arg4.field863, arg4.field998);
                for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                    arg2.method144(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[(var12 + 1) * 2 + 1], var9.field8231, 1, arg7, arg3, arg1);
                }
                arg2.method144(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field8231, 1, arg7, arg3, arg1);
            }
            class702 var16 = null;
            if (var9.field8237 != -1) {
                var16 = var9.method3327(false, 123, arg2);
                if (var16 != null) {
                    class326.method2049((byte) 55, arg7, arg0, arg4, arg1, arg3, arg6, var16);
                }
            }
            if (var9.field8265 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method939();
                }
                class416 var18 = class351.field5064;
                class146 var19 = class597.field8436;
                if (var9.field8252 == 1) {
                    var19 = class244.field3796;
                    var18 = class563.field7931;
                }
                if (var9.field8252 == 2) {
                    var18 = class26.field391;
                    var19 = class467.field6721;
                }
                class573.method3254(var18, arg3, arg4, var9.field8239, arg0, var19, arg7, arg1, var9.field8265, (byte) -49, arg6, var17);
            }
        }
        if (arg5 <= 6) {
            field1895 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 235)
    public static final void method959(int arg0) {
        field1889++;
        for (int var1 = 0; var1 < class9.field94; var1++) {
            class178.field2538[var1] = null;
        }
        class9.field94 = 0;
        if (arg0 < 1) {
            return;
        }
        for (int var2 = 0; var2 < class41.field685; var2++) {
            for (int var46 = 0; var46 < class302.field4492; var46++) {
                for (int var47 = 0; var47 < class8.field82; var47++) {
                    class40 var48 = class153.field2210[var2][var47][var46];
                    if (var48 != null) {
                        if (var48.field660 > 0) {
                            var48.field660 = (short) (var48.field660 * -1);
                        }
                        if (var48.field670 > 0) {
                            var48.field670 = (short) (var48.field670 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class41.field685; var3++) {
            for (int var4 = 0; var4 < class302.field4492; var4++) {
                for (int var5 = 0; var5 < class8.field82; var5++) {
                    class40 var6 = class153.field2210[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class153.field2210[0][var5][var4] != null && class153.field2210[0][var5][var4].field668 != null;
                        if (var6.field660 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var10 = var3;
                            int var11 = var3;
                            class40 var12 = class153.field2210[var3][var5][var4 - 1];
                            int var13 = class420.field6108[var3].method432(var5, false, var4);
                            while (var8 > 0 && var12 != null && var12.field660 < 0 && var6.field660 == var12.field660 && var6.field666 == var12.field666 && class420.field6108[var3].method432(var5, false, var8 - 1) == var13 && ((var8 - 1) <= 0 || var13 == class420.field6108[var3].method432(var5, false, var8 - 2))) {
                                var8--;
                                var12 = class153.field2210[var3][var5][var8 - 1];
                            }
                            for (class40 var14 = class153.field2210[var3][var5][var4 + 1]; var9 < class8.field82 && var14 != null && var14.field660 < 0 && var6.field660 == var14.field660 && var6.field666 == var14.field666 && class420.field6108[var3].method432(var5, false, var9 + 1) == var13 && (class8.field82 <= var9 + 1 || class420.field6108[var3].method432(var5, false, var9 + 2) == var13); var14 = class153.field2210[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            label304: while (var10 > 0) {
                                for (int var15 = var8; var15 <= var9; var15++) {
                                    if (class153.field2210[var10 - 1][var5][var15] == null || class153.field2210[var10 - 1][var5][var15].field660 != var6.field660 || class153.field2210[var10 - 1][var5][var15].field666 != var6.field666) {
                                        break label304;
                                    }
                                }
                                var10--;
                            }
                            label321: while (var11 < class41.field685 - 1) {
                                for (int var16 = var8; var16 <= var9; var16++) {
                                    if (class153.field2210[var11 + 1][var5][var16] == null || class153.field2210[var11 + 1][var5][var16].field660 != var6.field660 || class153.field2210[var11 + 1][var5][var16].field666 != var6.field666) {
                                        break label321;
                                    }
                                }
                                var11++;
                            }
                            int var17 = var11 + 1 - var10;
                            int var18 = class420.field6108[var7 ? var10 + 1 : var10].method432(var5, false, var8);
                            int var19 = var6.field660 * var17 + var18;
                            int var20 = class420.field6108[var7 ? var10 + 1 : var10].method432(var5, false, var9 + 1);
                            int var21 = var6.field660 * var17 + var20;
                            int var22 = var5 << class310.field4593;
                            int var23 = var8 << class310.field4593;
                            int var24 = (var9 << class310.field4593) + class437.field6392;
                            class178.field2538[class9.field94++] = new class327(1, var11, var6.field666 + var22, var22 - -var6.field666, var6.field666 + var22, var6.field666 + var22, var18, var20, var21, var19, var23, var24, var24, var23);
                            for (int var25 = var10; var25 <= var11; var25++) {
                                for (int var26 = var8; var26 <= var9; var26++) {
                                    class153.field2210[var25][var5][var26].field660 = (short) (class153.field2210[var25][var5][var26].field660 * -1);
                                }
                            }
                        }
                        if (var6.field670 < 0) {
                            int var27 = var5;
                            int var28 = var5;
                            int var29 = var3;
                            int var30 = var3;
                            class40 var31 = class153.field2210[var3][var5 - 1][var4];
                            int var32 = class420.field6108[var3].method432(var5, false, var4);
                            while (var27 > 0 && var31 != null && var31.field670 < 0 && var6.field670 == var31.field670 && var6.field667 == var31.field667 && class420.field6108[var3].method432(var27 - 1, false, var4) == var32 && (var27 - 1 <= 0 || class420.field6108[var3].method432(var27 - 2, false, var4) == var32)) {
                                var27--;
                                var31 = class153.field2210[var3][var27 - 1][var4];
                            }
                            for (class40 var33 = class153.field2210[var3][var5 + 1][var4]; var28 < class302.field4492 && var33 != null && var33.field670 < 0 && var6.field670 == var33.field670 && var6.field667 == var33.field667 && var32 == class420.field6108[var3].method432(var28 + 1, false, var4) && (var28 + 1 >= class302.field4492 || var32 == class420.field6108[var3].method432(var28 + 2, false, var4)); var33 = class153.field2210[var3][var28 + 1][var4]) {
                                var28++;
                            }
                            label220: while (var29 > 0) {
                                for (int var34 = var27; var34 <= var28; var34++) {
                                    if (class153.field2210[var29 - 1][var34][var4] == null || class153.field2210[var29 - 1][var34][var4].field670 != var6.field670 || class153.field2210[var29 - 1][var34][var4].field667 != var6.field667) {
                                        break label220;
                                    }
                                }
                                var29--;
                            }
                            label205: while (var30 < class41.field685 - 1) {
                                for (int var35 = var27; var35 <= var28; var35++) {
                                    if (class153.field2210[var30 + 1][var35][var4] == null || class153.field2210[var30 + 1][var35][var4].field670 != var6.field670 || class153.field2210[var30 + 1][var35][var4].field667 != var6.field667) {
                                        break label205;
                                    }
                                }
                                var30++;
                            }
                            int var36 = var30 + 1 - var29;
                            int var37 = class420.field6108[var7 ? var29 + 1 : var29].method432(var27, false, var4);
                            int var38 = var6.field670 * var36 + var37;
                            int var39 = class420.field6108[var7 ? var29 + 1 : var29].method432(var28 + 1, false, var4);
                            int var40 = var6.field670 * var36 + var39;
                            int var41 = var27 << class310.field4593;
                            int var42 = (var28 << class310.field4593) + class437.field6392;
                            int var43 = var4 << class310.field4593;
                            class178.field2538[class9.field94++] = new class327(2, var30, var41, var42, var42, var41, var37, var39, var40, var38, var43 + var6.field667, var6.field667 + var43, var6.field667 + var43, var43 - -var6.field667);
                            for (int var44 = var29; var44 <= var30; var44++) {
                                for (int var45 = var27; var45 <= var28; var45++) {
                                    class153.field2210[var44][var45][var4].field670 = (short) (class153.field2210[var44][var45][var4].field670 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class375.field5342 = true;
    }
}
