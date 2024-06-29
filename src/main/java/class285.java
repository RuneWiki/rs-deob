import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class285 {

    @OriginalMember(owner = "client!gia", name = "d", descriptor = "[I")
    private int[] field3315 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "[I")
    private int[] field3312 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!gia", name = "p", descriptor = "Llk;")
    private class614 field3327;

    @OriginalMember(owner = "client!gia", name = "e", descriptor = "Z")
    public boolean field3316;

    @OriginalMember(owner = "client!gia", name = "o", descriptor = "I")
    public int field3326;

    @OriginalMember(owner = "client!gia", name = "A", descriptor = "Lib;")
    private class165 field3338;

    @OriginalMember(owner = "client!gia", name = "B", descriptor = "I")
    public int field3339;

    @OriginalMember(owner = "client!gia", name = "f", descriptor = "I")
    public int field3317;

    @OriginalMember(owner = "client!gia", name = "h", descriptor = "[[[B")
    private byte[][][] field3319;

    @OriginalMember(owner = "client!gia", name = "l", descriptor = "[[[B")
    private byte[][][] field3323;

    @OriginalMember(owner = "client!gia", name = "j", descriptor = "[[[B")
    private byte[][][] field3321;

    @OriginalMember(owner = "client!gia", name = "k", descriptor = "[[[B")
    public byte[][][] field3322;

    @OriginalMember(owner = "client!gia", name = "c", descriptor = "[[[B")
    private byte[][][] field3314;

    @OriginalMember(owner = "client!gia", name = "t", descriptor = "[[[I")
    public int[][][] field3331;

    @OriginalMember(owner = "client!gia", name = "r", descriptor = "Llja;")
    public static class744 field3329 = new class744(74, 8);

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!gia", name = "g", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!gia", name = "i", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!gia", name = "m", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!gia", name = "n", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!gia", name = "q", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!gia", name = "s", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!gia", name = "v", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!gia", name = "x", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!gia", name = "y", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!gia", name = "z", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!gia", name = "u", descriptor = "[I")
    public static int[] field3332;

    @OriginalMember(owner = "client!gia", name = "w", descriptor = "[[[B")
    public byte[][][] field3334;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIZIIILes;III)V")
    private final void method1642(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, class403 arg7, int arg8, int arg9, int arg10) {
        field3336++;
        if (arg6 == 1) {
            arg5 = 1;
        } else if (arg6 == 2) {
            arg4 = 1;
            arg5 = 1;
        } else if (arg6 == 3) {
            arg4 = 1;
        }
        if (arg10 != 1249) {
            this.field3327 = null;
        }
        if (arg2 < 0 || this.field3339 <= arg2 || arg1 < 0 || this.field3326 <= arg1) {
            while (true) {
                int var14 = arg7.method2396((byte) -80);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg7.method2396((byte) 119);
                    return;
                }
                if (var14 <= 49) {
                    arg7.method2396((byte) 115);
                }
            }
        }
        if (!this.field3316 && !arg3) {
            class124.field1585[arg0][arg2][arg1] = 0;
        }
        while (true) {
            int var12 = arg7.method2396((byte) -124);
            if (var12 == 0) {
                if (this.field3316) {
                    this.field3331[0][arg2 + arg4][arg1 + arg5] = 0;
                    return;
                } else if (arg0 == 0) {
                    this.field3331[0][arg2 + arg4][arg1 + arg5] = -class323.method1927(arg8 + 556238, (byte) 100, arg9 + 932731) * 8 << 2;
                    return;
                } else {
                    this.field3331[arg0][arg2 + arg4][arg1 + arg5] = this.field3331[arg0 - 1][arg2 + arg4][arg1 + arg5] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg7.method2396((byte) -97);
                if (this.field3316) {
                    this.field3331[0][arg2 + arg4][arg1 + arg5] = var13 * 8 << 2;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg0 == 0) {
                    this.field3331[0][arg2 + arg4][arg1 + arg5] = -var13 * 8 << 2;
                    return;
                }
                this.field3331[arg0][arg2 + arg4][arg1 + arg5] = this.field3331[arg0 - 1][arg2 + arg4][arg1 + arg5] - (var13 * 8 << 2);
                return;
            }
            if (var12 <= 49) {
                if (arg3) {
                    arg7.method2396((byte) 126);
                } else {
                    this.field3319[arg0][arg2][arg1] = arg7.method2392(class241.method1459(arg10, 1182));
                    this.field3323[arg0][arg2][arg1] = (byte) ((var12 - 2) / 4);
                    this.field3321[arg0][arg2][arg1] = (byte) class296.method1733(var12 + arg6 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field3316 && !arg3) {
                    class124.field1585[arg0][arg2][arg1] = (byte) (var12 - 49);
                }
            } else if (!arg3) {
                this.field3314[arg0][arg2][arg1] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IB[Lwj;Les;III)V")
    public final void method1643(int arg0, byte arg1, class415[] arg2, class403 arg3, int arg4, int arg5, int arg6) {
        field3320++;
        if (!this.field3316) {
            for (int var8 = 0; var8 < 4; var8++) {
                class415 var9 = arg2[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg5 + var10;
                        int var13 = arg0 + var11;
                        if (var12 >= 0 && this.field3339 > var12 && var13 >= 0 && this.field3326 > var13) {
                            var9.method2470(var12, var13, (byte) 108);
                        }
                    }
                }
            }
        }
        int var14 = arg4 + arg5;
        if (arg1 > -81) {
            this.field3315 = null;
        }
        int var15 = arg0 + arg6;
        for (int var16 = 0; var16 < this.field3317; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1642(var16, arg0 + var18, arg5 + var17, false, 0, 0, 0, arg3, var15 + var18, var14 - -var17, 1249);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(Laj;I[[BI[[BIILfw;II[Z[[BLha;I)V")
    private final void method1644(class333 arg0, int arg1, byte[][] arg2, int arg3, byte[][] arg4, int arg5, int arg6, class63 arg7, int arg8, int arg9, boolean[] arg10, byte[][] arg11, class66 arg12, int arg13) {
        field3337++;
        boolean[] var15 = arg7 != null && arg7.field855 ? class135.field1695[arg1] : class518.field7288[arg1];
        if (arg8 < 96) {
            this.method1650(null, null, 0, null);
        }
        if (arg9 > 0) {
            if (arg3 > 0) {
                int var16 = arg2[arg3 - 1][arg9 - 1] & 0xFF;
                if (var16 > 0) {
                    class63 var17 = this.field3327.method3479((byte) 81, var16 - 1);
                    if (var17.field857 != -1 && var17.field855) {
                        byte var18 = arg4[arg3 - 1][arg9 - 1];
                        int var19 = arg11[arg3 - 1][arg9 - 1] * 2 + 4 & 0x7;
                        int var20 = class53.method478(var17, (byte) -103, arg12);
                        if (class199.field2390[var18][var19]) {
                            class482.field6737[0] = var17.field857;
                            class610.field8195[0] = var20;
                            class543.field7621[0] = var17.field856;
                            class318.field3920[0] = var17.field870;
                            class448.field6027[0] = var17.field863;
                            class606.field8166[0] = 256;
                        }
                    }
                }
            }
            if (arg6 - 1 > arg3) {
                int var21 = arg2[arg3 + 1][arg9 - 1] & 0xFF;
                if (var21 > 0) {
                    class63 var22 = this.field3327.method3479((byte) 81, var21 - 1);
                    if (var22.field857 != -1 && var22.field855) {
                        byte var23 = arg4[arg3 + 1][arg9 - 1];
                        int var24 = arg11[arg3 + 1][arg9 - 1] * 2 + 6 & 0x7;
                        int var25 = class53.method478(var22, (byte) -128, arg12);
                        if (class199.field2390[var23][var24]) {
                            class482.field6737[2] = var22.field857;
                            class610.field8195[2] = var25;
                            class543.field7621[2] = var22.field856;
                            class318.field3920[2] = var22.field870;
                            class448.field6027[2] = var22.field863;
                            class606.field8166[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg5 - 1 > arg9) {
            if (arg3 > 0) {
                int var26 = arg2[arg3 - 1][arg9 + 1] & 0xFF;
                if (var26 > 0) {
                    class63 var27 = this.field3327.method3479((byte) 81, var26 - 1);
                    if (var27.field857 != -1 && var27.field855) {
                        byte var28 = arg4[arg3 - 1][arg9 + 1];
                        int var29 = arg11[arg3 - 1][arg9 + 1] * 2 + 2 & 0x7;
                        int var30 = class53.method478(var27, (byte) -86, arg12);
                        if (class199.field2390[var28][var29]) {
                            class482.field6737[6] = var27.field857;
                            class610.field8195[6] = var30;
                            class543.field7621[6] = var27.field856;
                            class318.field3920[6] = var27.field870;
                            class448.field6027[6] = var27.field863;
                            class606.field8166[6] = 64;
                        }
                    }
                }
            }
            if (arg6 - 1 > arg3) {
                int var31 = arg2[arg3 + 1][arg9 + 1] & 0xFF;
                if (var31 > 0) {
                    class63 var32 = this.field3327.method3479((byte) 81, var31 - 1);
                    if (var32.field857 != -1 && var32.field855) {
                        byte var33 = arg4[arg3 + 1][arg9 + 1];
                        int var34 = arg11[arg3 + 1][arg9 + 1] * 2 & 0x7;
                        int var35 = class53.method478(var32, (byte) -104, arg12);
                        if (class199.field2390[var33][var34]) {
                            class482.field6737[4] = var32.field857;
                            class610.field8195[4] = var35;
                            class543.field7621[4] = var32.field856;
                            class318.field3920[4] = var32.field870;
                            class448.field6027[4] = var32.field863;
                            class606.field8166[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg9 > 0) {
            int var36 = arg2[arg3][arg9 - 1] & 0xFF;
            if (var36 > 0) {
                class63 var37 = this.field3327.method3479((byte) 81, var36 - 1);
                if (var37.field857 != -1) {
                    byte var38 = arg4[arg3][arg9 - 1];
                    byte var39 = arg11[arg3][arg9 - 1];
                    if (var37.field855) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class53.method478(var37, (byte) -126, arg12);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class199.field2390[var38][var41] && var37.field863 >= class448.field6027[var40]) {
                                class482.field6737[var40] = var37.field857;
                                class610.field8195[var40] = var42;
                                class543.field7621[var40] = var37.field856;
                                class318.field3920[var40] = var37.field870;
                                if (class448.field6027[var40] == var37.field863) {
                                    class606.field8166[var40] = class5.method105(class606.field8166[var40], 32);
                                } else {
                                    class606.field8166[var40] = 32;
                                }
                                class448.field6027[var40] = var37.field863;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg13 & 0x3]) {
                            arg10[0] = class135.field1695[var38][class296.method1733(var39 + 2, 3)];
                        }
                    } else if (!var15[arg13 & 0x3]) {
                        arg10[0] = class518.field7288[var38][class296.method1733(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg5 - 1 > arg9) {
            int var44 = arg2[arg3][arg9 + 1] & 0xFF;
            if (var44 > 0) {
                class63 var45 = this.field3327.method3479((byte) 81, var44 - 1);
                if (var45.field857 != -1) {
                    byte var46 = arg4[arg3][arg9 + 1];
                    byte var47 = arg11[arg3][arg9 + 1];
                    if (var45.field855) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class53.method478(var45, (byte) -103, arg12);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class199.field2390[var46][var49] && class448.field6027[var48] <= var45.field863) {
                                class482.field6737[var48] = var45.field857;
                                class610.field8195[var48] = var50;
                                class543.field7621[var48] = var45.field856;
                                class318.field3920[var48] = var45.field870;
                                if (class448.field6027[var48] == var45.field863) {
                                    class606.field8166[var48] = class5.method105(class606.field8166[var48], 16);
                                } else {
                                    class606.field8166[var48] = 16;
                                }
                                class448.field6027[var48] = var45.field863;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg13 + 2 & 0x3]) {
                            arg10[2] = class135.field1695[var46][class296.method1733(var47, 3)];
                        }
                    } else if (!var15[arg13 + 2 & 0x3]) {
                        arg10[2] = class518.field7288[var46][class296.method1733(3, var47)];
                    }
                }
            }
        }
        if (arg3 > 0) {
            int var52 = arg2[arg3 - 1][arg9] & 0xFF;
            if (var52 > 0) {
                class63 var53 = this.field3327.method3479((byte) 81, var52 - 1);
                if (var53.field857 != -1) {
                    byte var54 = arg4[arg3 - 1][arg9];
                    byte var55 = arg11[arg3 - 1][arg9];
                    if (var53.field855) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class53.method478(var53, (byte) -93, arg12);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class199.field2390[var54][var57] && var53.field863 >= class448.field6027[var56]) {
                                class482.field6737[var56] = var53.field857;
                                class610.field8195[var56] = var58;
                                class543.field7621[var56] = var53.field856;
                                class318.field3920[var56] = var53.field870;
                                if (class448.field6027[var56] == var53.field863) {
                                    class606.field8166[var56] = class5.method105(class606.field8166[var56], 8);
                                } else {
                                    class606.field8166[var56] = 8;
                                }
                                class448.field6027[var56] = var53.field863;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg13 + 3 & 0x3]) {
                            arg10[3] = class135.field1695[var54][class296.method1733(var55 + 1, 3)];
                        }
                    } else if (!var15[arg13 + 3 & 0x3]) {
                        arg10[3] = class518.field7288[var54][class296.method1733(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg6 - 1 > arg3) {
            int var60 = arg2[arg3 + 1][arg9] & 0xFF;
            if (var60 > 0) {
                class63 var61 = this.field3327.method3479((byte) 81, var60 - 1);
                if (var61.field857 != -1) {
                    byte var62 = arg4[arg3 + 1][arg9];
                    byte var63 = arg11[arg3 + 1][arg9];
                    if (var61.field855) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class53.method478(var61, (byte) -108, arg12);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class199.field2390[var62][var65] && var61.field863 >= class448.field6027[var64]) {
                                class482.field6737[var64] = var61.field857;
                                class610.field8195[var64] = var66;
                                class543.field7621[var64] = var61.field856;
                                class318.field3920[var64] = var61.field870;
                                if (class448.field6027[var64] == var61.field863) {
                                    class606.field8166[var64] = class5.method105(class606.field8166[var64], 4);
                                } else {
                                    class606.field8166[var64] = 4;
                                }
                                class448.field6027[var64] = var61.field863;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg13 + 1 & 0x3]) {
                            arg10[1] = class135.field1695[var62][class296.method1733(var63 + 3, 3)];
                        }
                    } else if (!var15[arg13 + 1 & 0x3]) {
                        arg10[1] = class518.field7288[var62][class296.method1733(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg7 == null) {
            return;
        }
        int var68 = class53.method478(arg7, (byte) -95, arg12);
        if (!arg7.field855) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg13 * 2) & 0x7;
            if (class199.field2390[arg1][var69] && class448.field6027[var70] <= arg7.field863) {
                class482.field6737[var70] = arg7.field857;
                class610.field8195[var70] = var68;
                class543.field7621[var70] = arg7.field856;
                class318.field3920[var70] = arg7.field870;
                if (class448.field6027[var70] == arg7.field863) {
                    class606.field8166[var70] = class5.method105(class606.field8166[var70], 2);
                } else {
                    class606.field8166[var70] = 2;
                }
                class448.field6027[var70] = arg7.field863;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)V")
    public static void method1645(int arg0) {
        if (arg0 > -11) {
            field3329 = null;
        }
        field3329 = null;
        field3332 = null;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIIIII[Lwj;BLes;)V")
    public final void method1646(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class415[] arg7, byte arg8, class403 arg9) {
        field3335++;
        int var11 = (arg1 & 0x7) * 8;
        if (!this.field3316) {
            class415 var12 = arg7[arg6];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class571.method3311(var14 & 0x7, var13 & 0x7, -127, arg5) + arg4;
                    int var16 = class107.method872(var13 & 0x7, var14 & 0x7, (byte) -25, arg5) + arg3;
                    if (var15 > 0 && (this.field3339 - 1) > var15 && var16 > 0 && var16 < this.field3326 - 1) {
                        var12.method2470(var15, var16, (byte) 108);
                    }
                }
            }
        }
        int var17 = (arg2 & 0x7) * 8;
        int var18 = arg1 & 0x1FFFFFF8 << 3;
        if (arg8 > -92) {
            this.method1648(null, null, -18, null, null, null, 88);
        }
        int var19 = (arg2 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg5 == 1) {
            var21 = 1;
        } else if (arg5 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg5 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field3317; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg0 == var22 && var23 >= var11 && var23 <= var11 + 8 && var24 >= var17 && var24 <= (var17 + 8)) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || (var17 + 8) == var24) {
                            if (arg5 == 0) {
                                var25 = var23 + arg4 - var11;
                                var26 = arg3 + var24 - var17;
                            } else if (arg5 == 1) {
                                var26 = arg3 - var23 - (-var11 - 8);
                                var25 = arg4 - (var17 - var24);
                            } else if (arg5 == 2) {
                                var26 = var17 + arg3 + 8 - var24;
                                var25 = arg4 - (var23 - var11 - 8);
                            } else {
                                var26 = var23 + arg3 - var11;
                                var25 = var17 + arg4 + 8 - var24;
                            }
                            this.method1642(arg6, var26, var25, true, 0, 0, 0, arg9, var19 + var24, var18 + var23, 1249);
                        } else {
                            var25 = class571.method3311(var24 & 0x7, var23 & 0x7, -126, arg5) + arg4;
                            var26 = arg3 + class107.method872(var23 & 0x7, var24 & 0x7, (byte) -25, arg5);
                            this.method1642(arg6, var26, var25, false, var20, var21, arg5, arg9, var19 + var24, var18 + var23, 1249);
                        }
                        if (var23 == 63 || var24 == 63) {
                            byte var27 = 1;
                            if (var23 == 63 && var24 == 63) {
                                var27 = 3;
                            }
                            for (int var28 = 0; var28 < var27; var28++) {
                                int var29 = var23;
                                int var30 = var24;
                                if (var28 == 0) {
                                    var29 = var23 == 63 ? 64 : var23;
                                    var30 = var24 == 63 ? 64 : var24;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg5 == 0) {
                                    var31 = arg4 + var29 - var11;
                                    var32 = var30 + arg3 - var17;
                                } else if (arg5 == 1) {
                                    var32 = arg3 + var11 + 8 - var29;
                                    var31 = var30 - (var17 - arg4);
                                } else if (arg5 == 2) {
                                    var32 = arg3 + var17 + 8 - var30;
                                    var31 = var11 + arg4 + 8 - var29;
                                } else {
                                    var32 = arg3 + var29 - var11;
                                    var31 = arg4 + var17 + 8 - var30;
                                }
                                if (var31 >= 0 && this.field3339 > var31 && var32 >= 0 && var32 < this.field3326) {
                                    this.field3331[arg6][var31][var32] = this.field3331[arg6][var25 + var20][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method1642(0, -1, -1, false, 0, 0, 0, arg9, 0, 0, 1249);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIII)V")
    public final void method1647(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == -9) {
            field3318++;
            for (int var6 = 0; var6 < this.field3317; var6++) {
                this.method1652(arg2, var6, arg3, arg4, arg1, (byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(Ls;Ls;ILha;Ls;[[II)V")
    private final void method1648(class296 arg0, class296 arg1, int arg2, class66 arg3, class296 arg4, int[][] arg5, int arg6) {
        field3313++;
        byte[][] var8 = this.field3323[arg6];
        byte[][] var9 = this.field3321[arg6];
        byte[][] var10 = this.field3314[arg6];
        byte[][] var11 = this.field3319[arg6];
        for (int var12 = arg2; var12 < this.field3339; var12++) {
            int var13 = this.field3339 - 1 <= var12 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field3326; var14++) {
                int var15 = var14 < this.field3326 - 1 ? var14 + 1 : var14;
                if (class774.field10679 == -1 || class99.method845(var14, arg6, class774.field10679, var12, arg2 ^ 0x10)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class63 var26 = var21 == 0 ? null : this.field3327.method3479((byte) 81, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class333 var27 = var22 == 0 ? null : this.field3338.method1152(var22 - 1, (byte) 102);
                        class63 var28 = var26;
                        if (var26 != null) {
                            if (var26.field857 == -1 && var26.field853 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field855;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field3339 > var12 && this.field3326 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var34++;
                                var33++;
                            } else {
                                var33--;
                                var34--;
                            }
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var35++;
                                var34++;
                            } else {
                                var34--;
                                var35--;
                            }
                            if (var10[var12][var15] == var22) {
                                var35++;
                                var36++;
                            } else {
                                var36--;
                                var35--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var33++;
                                var36++;
                            } else {
                                var36--;
                                var33--;
                            }
                            int var37 = var33 - var35;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var34 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg0.method1728(var14, (byte) -90, var12) - arg0.method1728(var15, (byte) -26, var13);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg0.method1728(var14, (byte) -57, var13) - arg0.method1728(var15, (byte) -113, var12);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 > var37 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class448.field6027[var39] = -1;
                            class606.field8166[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field855 ? class135.field1695[var19] : class518.field7288[var19];
                        this.method1644(var27, var19, var11, var12, var8, this.field3326, this.field3339, var26, 108, var14, var18, var9, arg3, var20);
                        boolean var41 = var26 != null && var26.field857 != var26.field853;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class448.field6027[var42] >= 0 && class610.field8195[var42] != class482.field6737[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class706.method4011(var18[1], class296.method1733(class606.field8166[2], class606.field8166[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class706.method4011(var18[3], class296.method1733(class606.field8166[0], class606.field8166[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class706.method4011(var18[0], class296.method1733(class606.field8166[0], class606.field8166[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class706.method4011(var18[2], class296.method1733(class606.field8166[6], class606.field8166[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int[] var46;
                        int var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var45 = class111.field1402[var19];
                            var46 = class622.field8546[var19];
                            var47 = var26 == null ? 0 : class383.field4899[var19];
                            var48 = var27 == null ? 0 : class508.field7227[var19];
                            var49 = class27.field421[var19];
                        } else if (var17) {
                            var44 = class463.field6492[var19];
                            var47 = var26 == null ? 0 : class534.field7528[var19];
                            var45 = class409.field5357[var19];
                            var46 = class100.field1300[var19];
                            var48 = var27 == null ? 0 : class556.field7733[var19];
                            var49 = class207.field2458[var19];
                        } else {
                            var48 = var27 == null ? 0 : class155.field1919[var19];
                            var45 = class497.field6947[var19];
                            var49 = class565.field7795[var19];
                            var46 = class620.field8357[var19];
                            var44 = class733.field10258[var19];
                            var47 = var26 == null ? 0 : class399.field5216[var19];
                        }
                        int var50 = var47 + var48;
                        if (var50 <= 0) {
                            class651.method3677(arg6, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg4 == null ? null : new int[var53];
                            int[] var61 = arg4 == null && arg1 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field857;
                                var63 = var26.field856;
                                var64 = var26.field870;
                                int var65 = class53.method478(var26, (byte) -116, arg3);
                                for (int var66 = 0; var66 < var47; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class226.field2637[0] = var45[var51];
                                        class226.field2637[1] = 1;
                                        class226.field2637[2] = var46[var51];
                                        class226.field2637[3] = 1;
                                        class226.field2637[4] = var49[var51];
                                        class226.field2637[5] = var46[var51];
                                        var68 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class226.field2637[0] = var45[var51];
                                        class226.field2637[1] = 5;
                                        class226.field2637[2] = var46[var51];
                                        class226.field2637[3] = 5;
                                        class226.field2637[4] = var49[var51];
                                        class226.field2637[5] = var46[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class226.field2637[0] = var45[var51];
                                        class226.field2637[1] = 3;
                                        class226.field2637[2] = var46[var51];
                                        class226.field2637[3] = 3;
                                        class226.field2637[4] = var49[var51];
                                        class226.field2637[5] = var46[var51];
                                        var68 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class226.field2637[0] = var45[var51];
                                        class226.field2637[1] = 7;
                                        class226.field2637[2] = var46[var51];
                                        class226.field2637[3] = 7;
                                        class226.field2637[4] = var49[var51];
                                        class226.field2637[5] = var46[var51];
                                        var68 = 6;
                                    } else {
                                        class226.field2637[0] = var45[var51];
                                        class226.field2637[1] = var49[var51];
                                        var68 = 3;
                                        class226.field2637[2] = var46[var51];
                                    }
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class226.field2637[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field3312[var70];
                                        int var73 = this.field3315[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = var73;
                                            var75 = 512 - var72;
                                        } else if (var20 == 2) {
                                            var75 = 512 - var73;
                                            var74 = 512 - var72;
                                        } else if (var20 == 3) {
                                            var75 = var72;
                                            var74 = 512 - var73;
                                        } else {
                                            var74 = var72;
                                            var75 = var73;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class199.field2390[var19][var70]) {
                                            int var76 = (var12 << 9) + var74;
                                            int var77 = (var14 << 9) + var75;
                                            var60[var52] = arg4.method1730(var76, var77, -1) - arg0.method1730(var76, var77, class241.method1459(arg2, -1));
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class199.field2390[var19][var70]) {
                                                int var78 = (var12 << 9) + var74;
                                                int var79 = (var14 << 9) + var75;
                                                var61[var52] = arg0.method1730(var78, var79, arg2 - 1) - arg4.method1730(var78, var79, -1);
                                            } else if (arg1 != null && !class243.field2873[var19][var70]) {
                                                int var80 = (var12 << 9) + var74;
                                                int var81 = (var14 << 9) + var75;
                                                var61[var52] = arg1.method1730(var80, var81, -1) - arg0.method1730(var80, var81, -1);
                                            }
                                        }
                                        if (var70 < 8 && var26.field863 < class448.field6027[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class610.field8195[var71];
                                            }
                                            var59[var52] = class318.field3920[var71];
                                            var58[var52] = class543.field7621[var71];
                                            var57[var52] = class482.field6737[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field856;
                                            var59[var52] = var26.field870;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field3316 && arg6 == 0) {
                                    class225.method1384(var12, var14, var26.field861, var26.field860 * 8, var26.field852);
                                }
                                if (var19 != 12 && var26.field857 != -1 && var26.field867) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class383.field4899[var19];
                            } else if (var17) {
                                var51 += class534.field7528[var19];
                            } else {
                                var51 += class399.field5216[var19];
                            }
                            if (var27 != null) {
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                class333 var82 = this.field3338.method1152(var22 - 1, (byte) 92);
                                class333 var83 = this.field3338.method1152(var23 - 1, (byte) 127);
                                class333 var84 = this.field3338.method1152(var24 - 1, (byte) 86);
                                class333 var85 = this.field3338.method1152(var25 - 1, (byte) 98);
                                for (int var86 = 0; var86 < var48; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class226.field2637[0] = var45[var51];
                                        class226.field2637[1] = 1;
                                        class226.field2637[2] = var46[var51];
                                        class226.field2637[3] = 1;
                                        class226.field2637[4] = var49[var51];
                                        var88 = 6;
                                        class226.field2637[5] = var46[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class226.field2637[0] = var45[var51];
                                        class226.field2637[1] = 5;
                                        class226.field2637[2] = var46[var51];
                                        class226.field2637[3] = 5;
                                        class226.field2637[4] = var49[var51];
                                        var88 = 6;
                                        class226.field2637[5] = var46[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class226.field2637[0] = var45[var51];
                                        class226.field2637[1] = 3;
                                        class226.field2637[2] = var46[var51];
                                        class226.field2637[3] = 3;
                                        class226.field2637[4] = var49[var51];
                                        class226.field2637[5] = var46[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class226.field2637[0] = var45[var51];
                                        class226.field2637[1] = 7;
                                        class226.field2637[2] = var46[var51];
                                        class226.field2637[3] = 7;
                                        class226.field2637[4] = var49[var51];
                                        var88 = 6;
                                        class226.field2637[5] = var46[var51];
                                    } else {
                                        class226.field2637[0] = var45[var51];
                                        class226.field2637[1] = var49[var51];
                                        var88 = 3;
                                        class226.field2637[2] = var46[var51];
                                    }
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class226.field2637[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field3312[var90];
                                        int var93 = this.field3315[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = 512 - var92;
                                            var95 = var93;
                                        } else if (var20 == 2) {
                                            var95 = 512 - var92;
                                            var94 = 512 - var93;
                                        } else if (var20 == 3) {
                                            var94 = var92;
                                            var95 = 512 - var93;
                                        } else {
                                            var94 = var93;
                                            var95 = var92;
                                        }
                                        var55[var52] = var95;
                                        var56[var52] = var94;
                                        if (var60 != null && class199.field2390[var19][var90]) {
                                            int var96 = (var12 << 9) + var95;
                                            int var97 = (var14 << 9) + var94;
                                            var60[var52] = arg4.method1730(var96, var97, -1) - arg0.method1730(var96, var97, arg2 - 1);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class199.field2390[var19][var90]) {
                                                int var98 = (var12 << 9) + var95;
                                                int var99 = (var14 << 9) + var94;
                                                var61[var52] = arg0.method1730(var98, var99, -1) - arg4.method1730(var98, var99, -1);
                                            } else if (arg1 != null && !class243.field2873[var19][var90]) {
                                                int var100 = (var12 << 9) + var95;
                                                int var101 = (var14 << 9) + var94;
                                                var61[var52] = arg1.method1730(var100, var101, -1) - arg0.method1730(var100, var101, -1);
                                            }
                                        }
                                        if (var90 < 8 && class448.field6027[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class610.field8195[var91];
                                            }
                                            var59[var52] = class318.field3920[var91];
                                            var58[var52] = class543.field7621[var91];
                                            var57[var52] = class482.field6737[var91];
                                        } else {
                                            if (var17 && class199.field2390[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var95 == 0 && var94 == 0) {
                                                var57[var52] = arg5[var12][var14];
                                                var58[var52] = var82.field4120;
                                                var59[var52] = var82.field4112;
                                            } else if (var95 == 0 && var94 == 512) {
                                                var57[var52] = arg5[var12][var15];
                                                var58[var52] = var83.field4120;
                                                var59[var52] = var83.field4112;
                                            } else if (var95 == 512 && var94 == 512) {
                                                var57[var52] = arg5[var13][var15];
                                                var58[var52] = var84.field4120;
                                                var59[var52] = var84.field4112;
                                            } else if (var95 == 512 && var94 == 0) {
                                                var57[var52] = arg5[var13][var14];
                                                var58[var52] = var85.field4120;
                                                var59[var52] = var85.field4112;
                                            } else {
                                                if (var95 < 256) {
                                                    if (var94 < 256) {
                                                        var58[var52] = var82.field4120;
                                                        var59[var52] = var82.field4112;
                                                    } else {
                                                        var58[var52] = var83.field4120;
                                                        var59[var52] = var83.field4112;
                                                    }
                                                } else if (var94 < 256) {
                                                    var58[var52] = var85.field4120;
                                                    var59[var52] = var85.field4112;
                                                } else {
                                                    var58[var52] = var84.field4120;
                                                    var59[var52] = var84.field4112;
                                                }
                                                int var102 = class8.method142(arg5[var12][var14], (byte) 107, var95 << 7 >> 9, arg5[var13][var14]);
                                                int var103 = class8.method142(arg5[var12][var15], (byte) 107, var95 << 7 >> 9, arg5[var13][var15]);
                                                var57[var52] = class8.method142(var102, (byte) 107, var94 << 7 >> 9, var103);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field4124) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg0.method1728(var14, (byte) -81, var12);
                            int var105 = arg0.method1728(var14, (byte) -31, var13);
                            int var106 = arg0.method1728(var15, (byte) -55, var13);
                            int var107 = arg0.method1728(var15, (byte) -115, var12);
                            boolean var108 = class77.method708(var12, arg2 - 184949524, var14);
                            if (var108 && arg6 > 1 || !var108 && arg6 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field4121) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field868) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field3322[arg6][var12][var14] = (byte) class5.method105(this.field3322[arg6][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field3316) {
                                var110 = class61.method532(var12, var14);
                                var111 = class188.method1244(var12, var14);
                                var112 = class35.method315(var12, var14);
                            }
                            arg0.method1405(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class651.method3677(arg6, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lha;BLs;Ls;)V")
    public final void method1649(class66 arg0, byte arg1, class296 arg2, class296 arg3) {
        if (arg1 != 77) {
            this.field3317 = 22;
        }
        field3330++;
        int[][] var5 = new int[this.field3339][this.field3326];
        if (class372.field4690 == null || class372.field4690.length != this.field3326) {
            class372.field4690 = new int[this.field3326];
            class645.field8787 = new int[this.field3326];
            class256.field2987 = new int[this.field3326];
            class124.field1583 = new int[this.field3326];
            class304.field3625 = new int[this.field3326];
        }
        for (int var6 = 0; var6 < this.field3317; var6++) {
            for (int var8 = 0; var8 < this.field3326; var8++) {
                class372.field4690[var8] = 0;
                class304.field3625[var8] = 0;
                class645.field8787[var8] = 0;
                class256.field2987[var8] = 0;
                class124.field1583[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field3339; var9++) {
                for (int var10 = 0; var10 < this.field3326; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field3339) {
                        int var20 = this.field3314[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class333 var21 = this.field3338.method1152(var20 - 1, (byte) 120);
                            class372.field4690[var10] += var21.field4114;
                            class304.field3625[var10] += var21.field4126;
                            class645.field8787[var10] += var21.field4113;
                            class256.field2987[var10] += var21.field4123;
                            var10002 = class124.field1583[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field3314[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class333 var24 = this.field3338.method1152(var23 - 1, (byte) 76);
                            class372.field4690[var10] -= var24.field4114;
                            class304.field3625[var10] -= var24.field4126;
                            class645.field8787[var10] -= var24.field4113;
                            class256.field2987[var10] -= var24.field4123;
                            var10002 = class124.field1583[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field3326; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field3326) {
                            var13 += class645.field8787[var17];
                            var14 += class256.field2987[var17];
                            var12 += class304.field3625[var17];
                            var11 += class372.field4690[var17];
                            var15 += class124.field1583[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var11 -= class372.field4690[var18];
                            var14 -= class256.field2987[var18];
                            var15 -= class124.field1583[var18];
                            var13 -= class645.field8787[var18];
                            var12 -= class304.field3625[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class514.method3081(var11 * 256 / var14, var13 / var15, var12 / var15, arg1 + 8348);
                        }
                    }
                }
            }
            if (class194.field2310) {
                this.method1648(class621.field8523[var6], var6 == 0 ? arg3 : null, arg1 - 77, arg0, var6 == 0 ? arg2 : null, var5, var6);
            } else {
                this.method1653(256, var5, var6 == 0 ? arg2 : null, var6, class621.field8523[var6], arg0, var6 == 0 ? arg3 : null);
            }
            this.field3314[var6] = null;
            this.field3319[var6] = null;
            this.field3323[var6] = null;
            this.field3321[var6] = null;
        }
        if (!this.field3316) {
            if (class566.field7799 != 0) {
                class326.method1942();
            }
            if (class207.field2454) {
                class741.method4162();
            }
        }
        for (int var7 = 0; var7 < this.field3317; var7++) {
            class621.field8523[var7].method1389();
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "([[[ILha;I[Lwj;)V")
    public final void method1650(int[][][] arg0, class66 arg1, int arg2, class415[] arg3) {
        field3325++;
        if (!this.field3316) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field3339; var6++) {
                    for (int var7 = 0; var7 < this.field3326; var7++) {
                        if ((class124.field1585[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class124.field1585[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg3[var8].method2475(var7, var6, (byte) -109);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = arg2; var9 < this.field3317; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field3316) {
                if (class207.field2454) {
                    var10 |= 0x2;
                }
                if (class117.field1485) {
                    var11 |= 0x8;
                }
                if (class566.field7799 != 0) {
                    var10 |= 0x1;
                    if (var9 == 0 | class774.field10682) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class207.field2454) {
                var11 |= 0x7;
            }
            if (!class388.field4987) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || arg0.length <= var9 ? this.field3331[var9] : arg0[var9];
            class154.method1098(var9, arg1.method557(this.field3339, this.field3326, this.field3331[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(BI[[I)V")
    public final void method1651(byte arg0, int arg1, int[][] arg2) {
        field3333++;
        if (arg0 != -41) {
            this.field3316 = true;
        }
        int[][] var4 = this.field3331[arg1];
        for (int var5 = 0; var5 < this.field3339 + 1; var5++) {
            for (int var6 = 0; var6 < this.field3326 + 1; var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIIIB)V")
    public final void method1652(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        for (int var7 = arg4; var7 < arg2 + arg4; var7++) {
            for (int var10 = arg0; var10 < arg0 + arg3; var10++) {
                if (var10 >= 0 && var10 < this.field3339 && var7 >= 0 && this.field3326 > var7) {
                    this.field3331[arg1][var10][var7] = arg1 > 0 ? this.field3331[arg1 - 1][var10][var7] - 960 : 0;
                }
            }
        }
        if (arg5 <= 101) {
            this.field3339 = -59;
        }
        field3324++;
        if (arg0 > 0 && this.field3339 > arg0) {
            for (int var8 = arg4 + 1; var8 < arg2 + arg4; var8++) {
                if (var8 >= 0 && this.field3326 > var8) {
                    this.field3331[arg1][arg0][var8] = this.field3331[arg1][arg0 - 1][var8];
                }
            }
        }
        if (arg4 > 0 && this.field3326 > arg4) {
            for (int var9 = arg0 + 1; var9 < arg0 + arg3; var9++) {
                if (var9 >= 0 && var9 < this.field3339) {
                    this.field3331[arg1][var9][arg4] = this.field3331[arg1][var9][arg4 - 1];
                }
            }
        }
        if (arg0 < 0 || arg4 < 0 || arg0 >= this.field3339 || this.field3326 <= arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 <= 0 || this.field3331[arg1][arg0 - 1][arg4] == 0) {
                if (arg4 > 0 && this.field3331[arg1][arg0][arg4 - 1] != 0) {
                    this.field3331[arg1][arg0][arg4] = this.field3331[arg1][arg0][arg4 - 1];
                    return;
                }
                if (arg0 > 0 && arg4 > 0 && this.field3331[arg1][arg0 - 1][arg4 - 1] != 0) {
                    this.field3331[arg1][arg0][arg4] = this.field3331[arg1][arg0 - 1][arg4 - 1];
                    return;
                }
                return;
            }
            this.field3331[arg1][arg0][arg4] = this.field3331[arg1][arg0 - 1][arg4];
        } else if (arg0 <= 0 || this.field3331[arg1 - 1][arg0 - 1][arg4] == this.field3331[arg1][arg0 - 1][arg4]) {
            if (arg4 > 0 && this.field3331[arg1][arg0][arg4 - 1] != this.field3331[arg1 - 1][arg0][arg4 - 1]) {
                this.field3331[arg1][arg0][arg4] = this.field3331[arg1][arg0][arg4 - 1];
                return;
            }
            if (arg0 > 0 && arg4 > 0 && this.field3331[arg1 - 1][arg0 - 1][arg4 - 1] != this.field3331[arg1][arg0 - 1][arg4 - 1]) {
                this.field3331[arg1][arg0][arg4] = this.field3331[arg1][arg0 - 1][arg4 - 1];
                return;
            }
        } else {
            this.field3331[arg1][arg0][arg4] = this.field3331[arg1][arg0 - 1][arg4];
            return;
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(I[[ILs;ILs;Lha;Ls;)V")
    private final void method1653(int arg0, int[][] arg1, class296 arg2, int arg3, class296 arg4, class66 arg5, class296 arg6) {
        field3328++;
        if (arg0 != 256) {
            return;
        }
        for (int var8 = 0; var8 < this.field3339; var8++) {
            for (int var9 = 0; var9 < this.field3326; var9++) {
                if (class774.field10679 == -1 || class99.method845(var9, arg3, class774.field10679, var8, 16)) {
                    byte var10 = this.field3323[arg3][var8][var9];
                    byte var11 = this.field3321[arg3][var8][var9];
                    int var12 = this.field3319[arg3][var8][var9] & 0xFF;
                    int var13 = this.field3314[arg3][var8][var9] & 0xFF;
                    class63 var14 = var12 == 0 ? null : this.field3327.method3479((byte) 81, var12 - 1);
                    class333 var15 = var13 == 0 ? null : this.field3338.method1152(var13 - 1, (byte) 88);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    class63 var16 = var14;
                    if (var14 != null && var14.field857 == -1 && var14.field853 == -1) {
                        var16 = var14;
                        var14 = null;
                    }
                    if (var14 != null || var15 != null) {
                        int var17 = class508.field7227[var10];
                        int var18 = class383.field4899[var10];
                        int var19 = (var14 == null ? 0 : var18) + (var15 == null ? 0 : var17);
                        int var20 = 0;
                        int var21 = 0;
                        int var22 = var14 == null ? -1 : var14.field856;
                        int var23 = var15 == null ? -1 : var15.field4120;
                        int[] var24 = new int[var19];
                        int[] var25 = new int[var19];
                        int[] var26 = new int[var19];
                        int[] var27 = new int[var19];
                        int[] var28 = new int[var19];
                        int[] var29 = new int[var19];
                        int[] var30 = var14 == null || var14.field853 == -1 ? null : new int[var19];
                        if (var14 == null) {
                            var21 += var18;
                        } else {
                            for (int var31 = 0; var31 < var18; var31++) {
                                var24[var20] = class111.field1402[var10][var21];
                                var25[var20] = class27.field421[var10][var21];
                                var26[var20] = class622.field8546[var10][var21];
                                var28[var20] = var22;
                                var29[var20] = var14.field870;
                                var27[var20] = var14.field857;
                                if (var30 != null) {
                                    var30[var20] = var14.field853;
                                }
                                var20++;
                                var21++;
                            }
                            if (!this.field3316 && arg3 == 0) {
                                class225.method1384(var8, var9, var14.field861, var14.field860 * 8, var14.field852);
                            }
                        }
                        if (var15 != null) {
                            for (int var32 = 0; var32 < var17; var32++) {
                                var24[var20] = class111.field1402[var10][var21];
                                var25[var20] = class27.field421[var10][var21];
                                var26[var20] = class622.field8546[var10][var21];
                                var28[var20] = var23;
                                var29[var20] = var15.field4112;
                                var27[var20] = arg1[var8][var9];
                                if (var30 != null) {
                                    var30[var20] = var27[var20];
                                }
                                var21++;
                                var20++;
                            }
                        }
                        int var33 = this.field3312.length;
                        int[] var34 = new int[var33];
                        int[] var35 = new int[var33];
                        int[] var36 = arg2 == null ? null : new int[var33];
                        int[] var37 = arg2 == null && arg6 == null ? null : new int[var33];
                        for (int var38 = 0; var38 < var33; var38++) {
                            int var48 = this.field3312[var38];
                            int var49 = this.field3315[var38];
                            if (var11 == 0) {
                                var34[var38] = var48;
                                var35[var38] = var49;
                            } else if (var11 == 1) {
                                var34[var38] = var49;
                                var35[var38] = 512 - var48;
                            } else if (var11 == 2) {
                                var34[var38] = 512 - var48;
                                var35[var38] = 512 - var49;
                            } else if (var11 == 3) {
                                var34[var38] = 512 - var49;
                                var35[var38] = var48;
                            }
                            if (var36 != null && class199.field2390[var10][var38]) {
                                int var52 = (var8 << 9) + var34[var38];
                                int var53 = (var9 << 9) + var35[var38];
                                var36[var38] = arg2.method1730(var52, var53, -1) - arg4.method1730(var52, var53, arg0 - 257);
                            }
                            if (var37 != null) {
                                if (arg2 != null && !class199.field2390[var10][var38]) {
                                    int var54 = (var8 << 9) + var34[var38];
                                    int var55 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg4.method1730(var54, var55, -1) - arg2.method1730(var54, var55, arg0 - 257);
                                } else if (arg6 != null && !class243.field2873[var10][var38]) {
                                    int var56 = (var8 << 9) + var34[var38];
                                    int var57 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg6.method1730(var56, var57, -1) - arg4.method1730(var56, var57, -1);
                                }
                            }
                        }
                        int var39 = arg4.method1728(var9, (byte) -119, var8);
                        int var40 = arg4.method1728(var9, (byte) -65, var8 + 1);
                        int var41 = arg4.method1728(var9 + 1, (byte) -36, var8 + 1);
                        int var42 = arg4.method1728(var9 + 1, (byte) -46, var8);
                        boolean var43 = class77.method708(var8, -184949524, var9);
                        if (var43 && arg3 > 1 || !var43 && arg3 > 0) {
                            boolean var44 = true;
                            if (var15 != null && !var15.field4121) {
                                var44 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var44 = false;
                            } else if (var12 > 0 && var16 != null && !var16.field868) {
                                var44 = false;
                            }
                            if (var44 && var39 == var40 && var39 == var41 && var39 == var42) {
                                this.field3322[arg3][var8][var9] = (byte) class5.method105(this.field3322[arg3][var8][var9], 4);
                            }
                        }
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        if (this.field3316) {
                            var45 = class61.method532(var8, var9);
                            var46 = class188.method1244(var8, var9);
                            var47 = class35.method315(var8, var9);
                        }
                        arg4.method1394(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var45, var46, var47, false);
                        class651.method3677(arg3, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(IIIZLlk;Lib;)V")
    public class285(int arg0, int arg1, int arg2, boolean arg3, class614 arg4, class165 arg5) {
        this.field3327 = arg4;
        this.field3316 = arg3;
        this.field3326 = arg2;
        this.field3338 = arg5;
        this.field3339 = arg1;
        this.field3317 = arg0;
        this.field3319 = new byte[this.field3317][this.field3339][this.field3326];
        this.field3323 = new byte[this.field3317][this.field3339][this.field3326];
        this.field3321 = new byte[this.field3317][this.field3339][this.field3326];
        this.field3322 = new byte[this.field3317][this.field3339 + 1][this.field3326 + 1];
        this.field3314 = new byte[this.field3317][this.field3339][this.field3326];
        this.field3331 = new int[this.field3317][this.field3339 + 1][this.field3326 + 1];
    }
}
