import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class614 {

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "Lba;")
    private static class607 field8822 = new class607(16);

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public static int field8830 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field8835 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "[S")
    private static short[] field8833 = new short[1];

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "[B")
    private static byte[] field8836 = new byte[1];

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "Lbv;")
    public static class568 field8834 = new class568();

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "F")
    public static float field8831;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "F")
    public static float field8837;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!eq", name = "B", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!eq", name = "N", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!eq", name = "O", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "Lcq;")
    public static class106 field8832;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "Ldd;")
    private static class166 field8821;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "Lfl;")
    public static class177 field8825;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "Lso;")
    public static class256 field8823;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "Lhd;")
    public static class270 field8826;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "Lkr;")
    public static class329 field8827;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "Ltv;")
    public static class361 field8828;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "Lrk;")
    public static class419 field8824;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "Ltc;")
    private static class552 field8829;

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "Lba;")
    private static class607 field8852;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "[B")
    private static byte[] field8840;

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "[B")
    private static byte[] field8844;

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "[B")
    private static byte[] field8845;

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "[B")
    private static byte[] field8847;

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "[B")
    private static byte[] field8855;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "[I")
    private static int[] field8843;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "[S")
    private static short[] field8842;

    @OriginalMember(owner = "client!eq", name = "M", descriptor = "[S")
    private static short[] field8859;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "[[[B")
    public static byte[][][] field8838;

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "[[[Lvda;")
    private static class311[][][] field8853;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lqa;IIII)V")
    private static final void method3504(class167 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field8861 - field8849;
        int var6 = field8841 - field8858;
        if (field8861 < field8856) {
            var5++;
        }
        if (field8841 < field8851) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field8854;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field8854;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field8849 + var7;
                if (var52 >= 0 && var52 < field8856) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field8860 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field8860 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field8858 + var53;
                            int var58 = field8856 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field8851) {
                                var59 = (field8855[var58] & 0xFF) << 16 | field8842[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field8845[var58] & 0xFF;
                                var61 = field8859[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field8826.field3437 != -1) {
                                    var62 = field8826.field3437 | 0xFF000000;
                                } else if ((field8849 + var7 & 0x4) == (field8841 + var53 & 0x4)) {
                                    var62 = field8843[field8829.field7737 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method997(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method3507(arg0, var49, var54, var51, var56, var59, var60, field8847[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class340 var63 = (class340) field8852.method3476((long) (var52 << 16 | var57), (byte) 28);
                                if (var63 != null) {
                                    method3507(arg0, var49, var54, var51, var56, var59, var60, field8847[var58], var63.field4734, var63.field4733, true);
                                }
                            } else {
                                field8833[0] = (short) (var61 - 1);
                                field8836[0] = field8844[var58];
                                method3507(arg0, var49, var54, var51, var56, var59, var60, field8847[var58], field8833, field8836, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field8860 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field8860 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field8826.field3437 != -1) {
                            var68 = field8826.field3437 | 0xFF000000;
                        } else if ((field8849 + var7 & 0x4) == (field8841 + var64 & 0x4)) {
                            var68 = field8843[field8829.field7737 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method997(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field8854;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field8854;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field8849 + var8;
                if (var41 >= 0 && var41 < field8856) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field8860 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field8860 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field8858 + var42;
                            if (var46 >= 0 && var46 < field8851) {
                                int var47 = field8859[field8856 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method3515(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class340 var48 = (class340) field8852.method3476((long) (var41 << 16 | var46), (byte) 28);
                                    if (var48 != null) {
                                        method3515(arg0, var38, var43, var40, var45, var48.field4734, var48.field4733);
                                    }
                                } else {
                                    field8833[0] = (short) (var47 - 1);
                                    field8836[0] = field8844[field8856 * var46 + var41];
                                    method3515(arg0, var38, var43, var40, var45, field8833, field8836);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field8849 >> 6;
        int var10 = field8858 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field8861 >> 6;
        int var12 = field8841 >> 6;
        if (var11 >= field8853[0].length) {
            var11 = field8853[0].length - 1;
        }
        if (var12 >= field8853[0][0].length) {
            var12 = field8853[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class311 var28 = field8853[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field8850 >> 6) + var14) * 64;
                        int var30 = ((field8848 >> 6) + var27) * 64;
                        for (class454 var31 = (class454) var28.method1876((byte) 93); var31 != null; var31 = (class454) var28.method1877(0)) {
                            int var32 = var31.field6432 + var29 - field8850 - field8849;
                            int var33 = var31.field6434 + var30 - field8848 - field8858;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field8854;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field8854;
                            int var36 = field8860 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field8860 - (arg2 * var33 + arg4 >> 16);
                            method3507(arg0, var34, var36, var35 - var34, var37 - var36, var31.field6430, var31.field6436 & 0xFF, var31.field6431, var31.field6433, var31.field6435, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class311 var17 = field8853[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field8850 >> 6) + var15) * 64;
                        int var19 = ((field8848 >> 6) + var16) * 64;
                        for (class454 var20 = (class454) var17.method1876((byte) 97); var20 != null; var20 = (class454) var17.method1877(0)) {
                            int var21 = var20.field6432 + var18 - field8850 - field8849;
                            int var22 = var20.field6434 + var19 - field8848 - field8858;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field8854;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field8854;
                            int var25 = field8860 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field8860 - (arg2 * var22 + arg4 >> 16);
                            method3515(arg0, var23, var25, var24 - var23, var26 - var25, var20.field6433, var20.field6435);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "()V")
    private static final void method3505() {
        for (int var0 = 0; var0 < field8856; var0++) {
            for (int var11 = 0; var11 < field8851; var11++) {
                int var12 = field8859[field8856 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class340 var13 = (class340) field8852.method3476((long) (var0 << 16 | var11), (byte) 28);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field4734.length; var14++) {
                                class137 var15 = field8825.method1093(0, var13.field4734[var14] & 0xFFFF);
                                int var16 = var15.field1699;
                                if (var15.field1719 != null) {
                                    class137 var17 = var15.method722(field8828, -1);
                                    if (var17 != null) {
                                        var16 = var17.field1699;
                                    }
                                }
                                if (var16 != -1) {
                                    class625 var18 = new class625(var16);
                                    var18.field9038 = var0;
                                    var18.field9039 = var11;
                                    field8834.method3181(var18, true);
                                }
                            }
                        }
                    } else {
                        class137 var19 = field8825.method1093(0, var12 - 1);
                        int var20 = var19.field1699;
                        if (var19.field1719 != null) {
                            class137 var21 = var19.method722(field8828, -1);
                            if (var21 != null) {
                                var20 = var21.field1699;
                            }
                        }
                        if (var20 != -1) {
                            class625 var22 = new class625(var20);
                            var22.field9038 = var0;
                            var22.field9039 = var11;
                            field8834.method3181(var22, true);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field8853[0].length; var2++) {
                for (int var3 = 0; var3 < field8853[0][0].length; var3++) {
                    class311 var4 = field8853[var1][var2][var3];
                    if (var4 != null) {
                        for (class454 var5 = (class454) var4.method1876((byte) 88); var5 != null; var5 = (class454) var4.method1877(0)) {
                            if (var5.field6433 != null) {
                                for (int var6 = 0; var6 < var5.field6433.length; var6++) {
                                    class137 var7 = field8825.method1093(0, var5.field6433[var6] & 0xFFFF);
                                    int var8 = var7.field1699;
                                    if (var7.field1719 != null) {
                                        class137 var9 = var7.method722(field8828, -1);
                                        if (var9 != null) {
                                            var8 = var9.field1699;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class625 var10 = new class625(var8);
                                        var10.field9038 = ((field8850 >> 6) + var2) * 64 + var5.field6432 - field8850;
                                        var10.field9039 = ((field8848 >> 6) + var3) * 64 + var5.field6434 - field8848;
                                        field8834.method3181(var10, true);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)Lhd;")
    public static final class270 method3506(int arg0, int arg1) {
        for (class270 var2 = (class270) field8822.method3473(-27089); var2 != null; var2 = (class270) field8822.method3478((byte) 5)) {
            if (var2.field3428 && var2.method1651(arg1, arg0, 0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lqa;IIIIIII[S[BZ)V")
    private static final void method3507(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method997(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field8843[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method997(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class123.method666(arg0, var12, arg1, arg5, arg3, field8839, field8838, arg2, arg7 >> 6 & 0x3, var11, (byte) 72, field8843[arg6], arg4);
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
                class137 var18 = field8825.method1093(0, arg8[var16] & 0xFFFF);
                if (var18.field1730 == -1) {
                    int var19 = -3355444;
                    if (var18.field1749 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method979(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method943(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method979(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method943(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method979(arg1, arg2, arg4, -1, 0);
                            arg0.method943(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method979(var14, arg2, arg4, -1, 0);
                            arg0.method943(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method979(var14, arg2, arg4, -1, 0);
                            arg0.method943(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method979(arg1, arg2, arg4, -1, 0);
                            arg0.method943(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method943(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method943(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method943(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method943(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method943(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method943(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lqa;II)V")
    public static final void method3508(class167 arg0, int arg1, int arg2) {
        class551 var3 = new class551(field8827.method2045("area", (byte) -22, field8826.field3440));
        int var4 = var3.method3045(-125);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method3045(-125);
        }
        int var7 = var3.method3045(-125);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method3045(-128);
        }
        while (true) {
            while (var3.field7707 < var3.field7693.length) {
                if (var3.method3045(-126) == 0) {
                    int var22 = var3.method3045(-127);
                    int var23 = var3.method3045(-127);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field8850;
                            int var27 = var23 * 64 + var25 - field8848;
                            method3512(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method3045(-126);
                    int var29 = var3.method3045(-127);
                    int var30 = var3.method3045(-127);
                    int var31 = var3.method3045(-127);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field8850;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field8848;
                            method3512(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field8855 = new byte[field8856 * field8851];
            field8842 = new short[field8856 * field8851];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field8856 * field8851];
                for (int var13 = 0; var13 < field8853[var11].length; var13++) {
                    for (int var19 = 0; var19 < field8853[var11][0].length; var19++) {
                        class311 var20 = field8853[var11][var13][var19];
                        if (var20 != null) {
                            for (class454 var21 = (class454) var20.method1876((byte) -119); var21 != null; var21 = (class454) var20.method1877(0)) {
                                var12[(var19 * 64 + var21.field6434) * field8856 + var13 * 64 + var21.field6432] = (byte) var21.field6430;
                            }
                        }
                    }
                }
                method3519(var12, field8855, field8842, arg1, arg2);
                for (int var14 = 0; var14 < field8853[var11].length; var14++) {
                    for (int var15 = 0; var15 < field8853[var11][0].length; var15++) {
                        class311 var16 = field8853[var11][var14][var15];
                        if (var16 != null) {
                            for (class454 var17 = (class454) var16.method1876((byte) 98); var17 != null; var17 = (class454) var16.method1877(0)) {
                                int var18 = (var15 * 64 + var17.field6434) * field8856 + var14 * 64 + var17.field6432;
                                var17.field6430 = (field8855[var18] & 0xFF) << 16 | field8842[var18] & 0xFFFF;
                                if (var17.field6430 != 0) {
                                    var17.field6430 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method3519(field8840, field8855, field8842, arg1, arg2);
            field8840 = null;
            method3505();
            return;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lqa;)V")
    public static final void method3509(class167 arg0) {
        int var1 = field8861 - field8849;
        int var2 = field8841 - field8858;
        int var3 = (field8846 - field8854 << 16) / var1;
        int var4 = (field8860 - field8857 << 16) / var2;
        method3504(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lkr;Ltc;Ldd;Lfl;Lso;Lrk;Ltv;)V")
    public static final void method3510(class329 arg0, class552 arg1, class166 arg2, class177 arg3, class256 arg4, class419 arg5, class361 arg6) {
        field8827 = arg0;
        field8829 = arg1;
        field8821 = arg2;
        field8825 = arg3;
        field8823 = arg4;
        field8824 = arg5;
        field8828 = arg6;
        field8822.method3472((byte) -128);
        int var7 = field8827.method2053((byte) 40, "details");
        int[] var8 = field8827.method2068(0, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class270 var10 = class542.method3006(var7, var8[var9], field8827, 0);
                field8822.method3475(-123, var10, (long) var10.field3429);
            }
        }
        class367.method2250((byte) 94, false, true);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8849 = arg0 - field8850;
        field8841 = arg1 - field8848;
        field8861 = arg2 - field8850;
        field8858 = arg3 - field8848;
        field8854 = arg4;
        field8857 = arg5;
        field8846 = arg6;
        field8860 = arg7;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lqa;Lge;IIII[I[I)V")
    private static final void method3512(class167 arg0, class551 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method3045(-125);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method3045(-125);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field8840[field8856 * arg5 + arg4] = (byte) var11;
                    field8845[field8856 * arg5 + arg4] = 0;
                } else {
                    field8845[field8856 * arg5 + arg4] = (byte) var11;
                    field8847[field8856 * arg5 + arg4] = 0;
                    field8840[field8856 * arg5 + arg4] = arg1.method3051((byte) 83);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method3045(-128);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method3045(-125);
                var18 = arg1.method3045(-128);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method3045(-128);
            }
            if (var15 == 0) {
                field8840[field8856 * arg5 + arg4] = (byte) var16;
                field8845[field8856 * arg5 + arg4] = (byte) var17;
                field8847[field8856 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field8859[field8856 * arg5 + arg4] = (short) (arg1.method3090(-105) + 1);
                    field8844[field8856 * arg5 + arg4] = arg1.method3051((byte) -65);
                } else if (var19 > 1) {
                    field8859[field8856 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method3090(-114);
                        var21[var22] = arg1.method3051((byte) -98);
                    }
                    field8852.method3475(-121, new class340(var20, var21), (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method3090(-113);
                        var24[var25] = arg1.method3051((byte) 95);
                    }
                }
                if (field8853[var15 - 1][arg2 - (field8850 >> 6)][arg3 - (field8848 >> 6)] == null) {
                    field8853[var15 - 1][arg2 - (field8850 >> 6)][arg3 - (field8848 >> 6)] = new class311();
                }
                class454 var26 = new class454(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field8853[var15 - 1][arg2 - (field8850 >> 6)][arg3 - (field8848 >> 6)].method1873(var26, true);
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ln;II)V")
    public static final void method3513(class473 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field8829.field7726; var3++) {
            field8843[var3 + 1] = method3526(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lqa;Lraa;IIII)V")
    private static final void method3514(class167 arg0, class625 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field9042 = ((arg1.field9038 - field8849) * arg2 + arg4 >> 16) + field8854;
        arg1.field9040 = field8860 - ((arg1.field9039 - field8858) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lqa;IIII[S[B)V")
    private static final void method3515(class167 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class137 var8 = field8825.method1093(0, arg5[var7] & 0xFFFF);
            int var9 = var8.field1730;
            if (var9 != -1) {
                class264 var10 = field8824.method2485(3146, var9);
                class116 var11 = var10.method1629(var8.field1746 ? arg6[var7] >> 6 & 0x3 : 0, var8.field1739 ? var8.field1688 : false, arg0, (byte) 120);
                if (var11 != null) {
                    int var12 = arg3 * var11.method627() >> 2;
                    int var13 = arg4 * var11.method631() >> 2;
                    if (var10.field3363) {
                        int var14 = var8.field1717;
                        int var15 = var8.field1670;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field3372 == 0) {
                            var11.method638(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method625(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field3372 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "()V")
    public static final void method3516() {
        field8840 = null;
        field8855 = null;
        field8842 = null;
        field8845 = null;
        field8847 = null;
        field8859 = null;
        field8844 = null;
        field8852 = null;
        field8853 = null;
        field8843 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)Lhd;")
    public static final class270 method3517(int arg0) {
        return (class270) field8822.method3476((long) arg0, (byte) 28);
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(Lqa;)Lbv;")
    public static final class568 method3518(class167 arg0) {
        int var1 = field8861 - field8849;
        int var2 = field8841 - field8858;
        int var3 = (field8846 - field8854 << 16) / var1;
        int var4 = (field8860 - field8857 << 16) / var2;
        return method3520(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([B[B[SII)V")
    private static final void method3519(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field8851];
        int[] var6 = new int[field8851];
        int[] var7 = new int[field8851];
        int[] var8 = new int[field8851];
        int[] var9 = new int[field8851];
        for (int var10 = -5; var10 < field8856; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field8851; var13++) {
                int var10002;
                if (var11 < field8856) {
                    int var28 = arg0[field8856 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class355 var29 = field8821.method903(var28 - 1, -52);
                        var5[var13] += var29.field4964;
                        var6[var13] += var29.field4969;
                        var7[var13] += var29.field4973;
                        var8[var13] += var29.field4967;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field8856 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class355 var31 = field8821.method903(var30 - 1, -121);
                        var5[var13] -= var31.field4964;
                        var6[var13] -= var31.field4969;
                        var7[var13] -= var31.field4973;
                        var8[var13] -= var31.field4967;
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
                for (int var19 = -5; var19 < field8851; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field8851) {
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
                        if ((arg0[field8856 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field8856 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class539.method2998(var15 / var18, var16 / var18, var14 * 256 / var17, 255);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field8856 * var19 + var10;
                            int var27 = class351.field4940[class433.method2528(class7.method26(0, var25, 96), 15048) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(Lqa;IIII)Lbv;")
    private static final class568 method3520(class167 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class625 var5 = (class625) field8834.method3188((byte) -100); var5 != null; var5 = (class625) field8834.method3182((byte) -31)) {
            method3514(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field8834;
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "()V")
    public static final void method3521() {
        field8840 = new byte[field8856 * field8851];
        field8845 = new byte[field8856 * field8851];
        field8847 = new byte[field8856 * field8851];
        field8859 = new short[field8856 * field8851];
        field8844 = new byte[field8856 * field8851];
        field8852 = new class607(1024);
        field8853 = new class311[3][field8856 >> 6][field8851 >> 6];
        field8843 = new int[field8829.field7726 + 1];
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "()V")
    public static final void method3522() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field8832.field1371; var1++) {
            boolean var2 = field8826.method1654(field8832.field1374[var1] & 0x3FFF, var0, -70, field8832.field1374[var1] >> 14 & 0x3FFF, field8832.field1374[var1] >> 28 & 0x3);
            if (var2) {
                class625 var3 = new class625(field8832.field1373[var1]);
                var3.field9038 = var0[1] - field8850;
                var3.field9039 = var0[2] - field8848;
                field8834.method3181(var3, true);
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(II)Lgba;")
    public static final class358 method3523(int arg0, int arg1) {
        class358 var2 = new class358();
        for (class270 var3 = (class270) field8822.method3473(-27089); var3 != null; var3 = (class270) field8822.method3478((byte) 5)) {
            if (var3.field3428 && var3.method1651(arg1, arg0, 0)) {
                var2.method2228((byte) 100, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "()V")
    public static void method3524() {
        field8829 = null;
        field8821 = null;
        field8825 = null;
        field8823 = null;
        field8824 = null;
        field8828 = null;
        field8826 = null;
        field8827 = null;
        field8822 = null;
        field8838 = null;
        field8833 = null;
        field8836 = null;
        field8832 = null;
        field8834 = null;
        field8843 = null;
        field8840 = null;
        field8855 = null;
        field8842 = null;
        field8845 = null;
        field8847 = null;
        field8859 = null;
        field8844 = null;
        field8852 = null;
        field8853 = null;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
    public static final void method3525(int arg0) {
        field8826 = (class270) field8822.method3476((long) arg0, (byte) 28);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ln;III)I")
    private static final int method3526(class473 arg0, int arg1, int arg2, int arg3) {
        class335 var4 = field8829.method3101(false, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field4683;
        if (var5 >= 0 && arg0.method2151(true, var5).field604) {
            var5 = -1;
        }
        int var9;
        if (var4.field4693 >= 0) {
            int var6 = var4.field4693;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class351.field4940[class433.method2528(class72.method423(8689, 96, var8), 15048) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class351.field4940[class433.method2528(class72.method423(8689, 96, arg0.method2151(true, var5).field612), 15048) & 0xFFFF] | 0xFF000000;
        } else if (var4.field4674 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field4674;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class351.field4940[class433.method2528(class72.method423(8689, 96, var12), 15048) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }
}
