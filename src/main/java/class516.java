import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class516 {

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "[I")
    private int[] field7054 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "[I")
    private int[] field7071 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
    public int field7066;

    @OriginalMember(owner = "client!mt", name = "q", descriptor = "Lum;")
    private class169 field7068;

    @OriginalMember(owner = "client!mt", name = "w", descriptor = "I")
    public int field7074;

    @OriginalMember(owner = "client!mt", name = "s", descriptor = "Z")
    public boolean field7070;

    @OriginalMember(owner = "client!mt", name = "u", descriptor = "Lvb;")
    private class411 field7072;

    @OriginalMember(owner = "client!mt", name = "r", descriptor = "I")
    public int field7069;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "[[[B")
    private byte[][][] field7064;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "[[[B")
    private byte[][][] field7063;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "[[[B")
    private byte[][][] field7058;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "[[[I")
    public int[][][] field7060;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "[[[B")
    private byte[][][] field7059;

    @OriginalMember(owner = "client!mt", name = "x", descriptor = "[[[B")
    public byte[][][] field7075;

    @OriginalMember(owner = "client!mt", name = "B", descriptor = "Lcb;")
    public static class318 field7079 = new class318(51, 14);

    @OriginalMember(owner = "client!mt", name = "C", descriptor = "Lnn;")
    public static class446 field7080 = new class446(0, 5);

    @OriginalMember(owner = "client!mt", name = "D", descriptor = "[I")
    public static int[] field7081 = new int[1];

    @OriginalMember(owner = "client!mt", name = "E", descriptor = "D")
    public static double field7082 = -1.0D;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!mt", name = "v", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!mt", name = "y", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!mt", name = "A", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "[[[B")
    public byte[][][] field7065;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IILdga;IIIIIIZI)V", line = 3)
    private final void method2924(int arg0, int arg1, class138 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field7056++;
        if (arg8 == 1) {
            arg3 = 1;
        } else if (arg8 == 2) {
            arg3 = 1;
            arg10 = 1;
        } else if (arg8 == 3) {
            arg10 = 1;
        }
        if (arg5 > arg4 || arg4 >= this.field7069 || arg1 < 0 || arg1 >= this.field7074) {
            while (true) {
                int var14 = arg2.method957((byte) -123);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg2.method957((byte) -63);
                    return;
                }
                if (var14 <= 49) {
                    arg2.method957((byte) -75);
                }
            }
        }
        if (!this.field7070 && !arg9) {
            class645.field9140[arg0][arg4][arg1] = 0;
        }
        while (true) {
            int var12 = arg2.method957((byte) -69);
            if (var12 == 0) {
                if (this.field7070) {
                    this.field7060[0][arg4 + arg10][arg1 + arg3] = 0;
                    return;
                } else if (arg0 == 0) {
                    this.field7060[0][arg4 + arg10][arg1 + arg3] = -class245.method1498(2883872, arg6 + 556238, arg7 + 932731) * 8 << 2;
                    return;
                } else {
                    this.field7060[arg0][arg4 + arg10][arg1 + arg3] = this.field7060[arg0 - 1][arg4 + arg10][arg1 + arg3] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg2.method957((byte) -116);
                if (!this.field7070) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg0 != 0) {
                        this.field7060[arg0][arg4 + arg10][arg1 + arg3] = this.field7060[arg0 - 1][arg4 + arg10][arg1 + arg3] - (var13 * 8 << 2);
                        return;
                    }
                    this.field7060[0][arg4 + arg10][arg1 + arg3] = -var13 * 8 << 2;
                    return;
                }
                this.field7060[0][arg4 + arg10][arg1 + arg3] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg9) {
                    arg2.method957((byte) -86);
                } else {
                    this.field7064[arg0][arg4][arg1] = arg2.method950(false);
                    this.field7058[arg0][arg4][arg1] = (byte) ((var12 - 2) / 4);
                    this.field7063[arg0][arg4][arg1] = (byte) class230.method1424(3, arg8 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field7070 && !arg9) {
                    class645.field9140[arg0][arg4][arg1] = (byte) (var12 - 49);
                }
            } else if (!arg9) {
                this.field7059[arg0][arg4][arg1] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ldga;IIII[Lsl;I)V", line = 128)
    public final void method2925(class138 arg0, int arg1, int arg2, int arg3, int arg4, class245[] arg5, int arg6) {
        if (arg3 > -38) {
            return;
        }
        field7055++;
        if (!this.field7070) {
            for (int var8 = 0; var8 < 4; var8++) {
                class245 var9 = arg5[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg4 + var10;
                        int var13 = arg1 + var11;
                        if (var12 >= 0 && var12 < this.field7069 && var13 >= 0 && var13 < this.field7074) {
                            var9.method1509(var13, var12, 45);
                        }
                    }
                }
            }
        }
        int var14 = arg4 + arg6;
        int var15 = arg1 + arg2;
        for (int var16 = 0; var16 < this.field7066; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method2924(var16, var18 + arg1, arg0, 0, arg4 + var17, 0, var15 + var18, var14 - -var17, 0, false, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[Z[[BI[[BLss;ILeba;Loa;IIIB[[B)V", line = 206)
    private final void method2926(int arg0, boolean[] arg1, byte[][] arg2, int arg3, byte[][] arg4, class283 arg5, int arg6, class235 arg7, class689 arg8, int arg9, int arg10, int arg11, byte arg12, byte[][] arg13) {
        field7076++;
        boolean[] var15 = arg5 != null && arg5.field3833 ? class380.field5453[arg3] : class333.field4857[arg3];
        if (arg0 > 0) {
            if (arg9 > 0) {
                int var16 = arg4[arg9 - 1][arg0 - 1] & 0xFF;
                if (var16 > 0) {
                    class283 var17 = this.field7072.method2412(arg12 ^ 0x1E, var16 - 1);
                    if (var17.field3820 != -1 && var17.field3833) {
                        byte var18 = arg13[arg9 - 1][arg0 - 1];
                        int var19 = arg2[arg9 - 1][arg0 - 1] * 2 + 4 & 0x7;
                        int var20 = class145.method987(false, arg8, var17);
                        if (class224.field2906[var18][var19]) {
                            class502.field6790[0] = var17.field3820;
                            class37.field375[0] = var20;
                            class58.field818[0] = arg8.method1791() ? var17.field3824 : var17.field3825;
                            class576.field7966[0] = var17.field3831;
                            class419.field5830[0] = var17.field3815;
                            class573.field7937[0] = 256;
                        }
                    }
                }
            }
            if (arg6 - 1 > arg9) {
                int var21 = arg4[arg9 + 1][arg0 - 1] & 0xFF;
                if (var21 > 0) {
                    class283 var22 = this.field7072.method2412(4, var21 - 1);
                    if (var22.field3820 != -1 && var22.field3833) {
                        byte var23 = arg13[arg9 + 1][arg0 - 1];
                        int var24 = arg2[arg9 + 1][arg0 - 1] * 2 + 6 & 0x7;
                        int var25 = class145.method987(false, arg8, var22);
                        if (class224.field2906[var23][var24]) {
                            class502.field6790[2] = var22.field3820;
                            class37.field375[2] = var25;
                            class58.field818[2] = arg8.method1791() ? var22.field3824 : var22.field3825;
                            class576.field7966[2] = var22.field3831;
                            class419.field5830[2] = var22.field3815;
                            class573.field7937[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg0 < arg10 - 1) {
            if (arg9 > 0) {
                int var26 = arg4[arg9 - 1][arg0 + 1] & 0xFF;
                if (var26 > 0) {
                    class283 var27 = this.field7072.method2412(4, var26 - 1);
                    if (var27.field3820 != -1 && var27.field3833) {
                        byte var28 = arg13[arg9 - 1][arg0 + 1];
                        int var29 = arg2[arg9 - 1][arg0 + 1] * 2 + 2 & 0x7;
                        int var30 = class145.method987(false, arg8, var27);
                        if (class224.field2906[var28][var29]) {
                            class502.field6790[6] = var27.field3820;
                            class37.field375[6] = var30;
                            class58.field818[6] = arg8.method1791() ? var27.field3824 : var27.field3825;
                            class576.field7966[6] = var27.field3831;
                            class419.field5830[6] = var27.field3815;
                            class573.field7937[6] = 64;
                        }
                    }
                }
            }
            if ((arg6 - 1) > arg9) {
                int var31 = arg4[arg9 + 1][arg0 + 1] & 0xFF;
                if (var31 > 0) {
                    class283 var32 = this.field7072.method2412(4, var31 - 1);
                    if (var32.field3820 != -1 && var32.field3833) {
                        byte var33 = arg13[arg9 + 1][arg0 + 1];
                        int var34 = arg2[arg9 + 1][arg0 + 1] * 2 & 0x7;
                        int var35 = class145.method987(false, arg8, var32);
                        if (class224.field2906[var33][var34]) {
                            class502.field6790[4] = var32.field3820;
                            class37.field375[4] = var35;
                            class58.field818[4] = arg8.method1791() ? var32.field3824 : var32.field3825;
                            class576.field7966[4] = var32.field3831;
                            class419.field5830[4] = var32.field3815;
                            class573.field7937[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg0 > 0) {
            int var36 = arg4[arg9][arg0 - 1] & 0xFF;
            if (var36 > 0) {
                class283 var37 = this.field7072.method2412(4, var36 - 1);
                if (var37.field3820 != -1) {
                    byte var38 = arg13[arg9][arg0 - 1];
                    byte var39 = arg2[arg9][arg0 - 1];
                    if (var37.field3833) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class145.method987(false, arg8, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class224.field2906[var38][var41] && class419.field5830[var40] <= var37.field3815) {
                                class502.field6790[var40] = var37.field3820;
                                class37.field375[var40] = var42;
                                class58.field818[var40] = arg8.method1791() ? var37.field3824 : var37.field3825;
                                class576.field7966[var40] = var37.field3831;
                                if (class419.field5830[var40] == var37.field3815) {
                                    class573.field7937[var40] = class288.method1722(class573.field7937[var40], 32);
                                } else {
                                    class573.field7937[var40] = 32;
                                }
                                class419.field5830[var40] = var37.field3815;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg11 & 0x3]) {
                            arg1[0] = class380.field5453[var38][class230.method1424(var39 + 2, 3)];
                        }
                    } else if (!var15[arg11 & 0x3]) {
                        arg1[0] = class333.field4857[var38][class230.method1424(3, var39 + 2)];
                    }
                }
            }
        }
        if ((arg10 - 1) > arg0) {
            int var44 = arg4[arg9][arg0 + 1] & 0xFF;
            if (var44 > 0) {
                class283 var45 = this.field7072.method2412(4, var44 - 1);
                if (var45.field3820 != -1) {
                    byte var46 = arg13[arg9][arg0 + 1];
                    byte var47 = arg2[arg9][arg0 + 1];
                    if (var45.field3833) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class145.method987(false, arg8, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class224.field2906[var46][var49] && var45.field3815 >= class419.field5830[var48]) {
                                class502.field6790[var48] = var45.field3820;
                                class37.field375[var48] = var50;
                                class58.field818[var48] = arg8.method1791() ? var45.field3824 : var45.field3825;
                                class576.field7966[var48] = var45.field3831;
                                if (class419.field5830[var48] == var45.field3815) {
                                    class573.field7937[var48] = class288.method1722(class573.field7937[var48], 16);
                                } else {
                                    class573.field7937[var48] = 16;
                                }
                                class419.field5830[var48] = var45.field3815;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg11 + 2 & 0x3]) {
                            arg1[2] = class380.field5453[var46][class230.method1424(3, var47)];
                        }
                    } else if (!var15[arg11 + 2 & 0x3]) {
                        arg1[2] = class333.field4857[var46][class230.method1424(var47, 3)];
                    }
                }
            }
        }
        if (arg9 > 0) {
            int var52 = arg4[arg9 - 1][arg0] & 0xFF;
            if (var52 > 0) {
                class283 var53 = this.field7072.method2412(4, var52 - 1);
                if (var53.field3820 != -1) {
                    byte var54 = arg13[arg9 - 1][arg0];
                    byte var55 = arg2[arg9 - 1][arg0];
                    if (var53.field3833) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class145.method987(false, arg8, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class224.field2906[var54][var57] && class419.field5830[var56] <= var53.field3815) {
                                class502.field6790[var56] = var53.field3820;
                                class37.field375[var56] = var58;
                                class58.field818[var56] = arg8.method1791() ? var53.field3824 : var53.field3825;
                                class576.field7966[var56] = var53.field3831;
                                if (class419.field5830[var56] == var53.field3815) {
                                    class573.field7937[var56] = class288.method1722(class573.field7937[var56], 8);
                                } else {
                                    class573.field7937[var56] = 8;
                                }
                                class419.field5830[var56] = var53.field3815;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg11 + 3 & 0x3]) {
                            arg1[3] = class380.field5453[var54][class230.method1424(var55 + 1, 3)];
                        }
                    } else if (!var15[arg11 + 3 & 0x3]) {
                        arg1[3] = class333.field4857[var54][class230.method1424(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg6 - 1 > arg9) {
            int var60 = arg4[arg9 + 1][arg0] & 0xFF;
            if (var60 > 0) {
                class283 var61 = this.field7072.method2412(arg12 ^ 0x1E, var60 - 1);
                if (var61.field3820 != -1) {
                    byte var62 = arg13[arg9 + 1][arg0];
                    byte var63 = arg2[arg9 + 1][arg0];
                    if (var61.field3833) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class145.method987(false, arg8, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class224.field2906[var62][var65] && class419.field5830[var64] <= var61.field3815) {
                                class502.field6790[var64] = var61.field3820;
                                class37.field375[var64] = var66;
                                class58.field818[var64] = arg8.method1791() ? var61.field3824 : var61.field3825;
                                class576.field7966[var64] = var61.field3831;
                                if (class419.field5830[var64] == var61.field3815) {
                                    class573.field7937[var64] = class288.method1722(class573.field7937[var64], 4);
                                } else {
                                    class573.field7937[var64] = 4;
                                }
                                class419.field5830[var64] = var61.field3815;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg11 + 1 & 0x3]) {
                            arg1[1] = class380.field5453[var62][class230.method1424(3, var63 + 3)];
                        }
                    } else if (!var15[arg11 + 1 & 0x3]) {
                        arg1[1] = class333.field4857[var62][class230.method1424(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg12 != 26) {
            this.method2926(-43, null, null, -63, null, null, 23, null, null, 109, 52, -109, (byte) -38, null);
        }
        if (arg5 == null) {
            return;
        }
        int var68 = class145.method987(false, arg8, arg5);
        if (!arg5.field3833) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - arg11 * 2 & 0x7;
            if (class224.field2906[arg3][var69] && class419.field5830[var70] <= arg5.field3815) {
                class502.field6790[var70] = arg5.field3820;
                class37.field375[var70] = var68;
                class58.field818[var70] = arg8.method1791() ? arg5.field3824 : arg5.field3825;
                class576.field7966[var70] = arg5.field3831;
                if (class419.field5830[var70] == arg5.field3815) {
                    class573.field7937[var70] = class288.method1722(class573.field7937[var70], 2);
                } else {
                    class573.field7937[var70] = 2;
                }
                class419.field5830[var70] = arg5.field3815;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Loa;IBLd;Ld;[[ILd;)V", line = 673)
    private final void method2927(class689 arg0, int arg1, byte arg2, class176 arg3, class176 arg4, int[][] arg5, class176 arg6) {
        for (int var8 = 0; var8 < this.field7069; var8++) {
            for (int var9 = 0; var9 < this.field7074; var9++) {
                if (class669.field9513 == -1 || class548.method3081(arg1, var8, var9, class669.field9513, -16623)) {
                    byte var10 = this.field7058[arg1][var8][var9];
                    byte var11 = this.field7063[arg1][var8][var9];
                    int var12 = this.field7064[arg1][var8][var9] & 0xFF;
                    int var13 = this.field7059[arg1][var8][var9] & 0xFF;
                    class283 var14 = var12 == 0 ? null : this.field7072.method2412(4, var12 - 1);
                    class235 var15 = var13 == 0 ? null : this.field7068.method1127(var13 - 1, 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class559.field7614[var10];
                        var16 = var15 == null ? 0 : class573.field7939[var10];
                    } else if (var14 != null) {
                        var17 = class559.field7614[var10];
                    } else if (var15 != null) {
                        var16 = class559.field7614[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field3820 == -1 && var14.field3816 == -1 && var14.field3824 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg0.method1791() ? var14.field3824 : var14.field3825;
                            if (class553.field7575) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field3831;
                                if (var14.field3820 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field3820;
                                }
                                if (var14.field3816 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field3816;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field7070 && arg1 == 0) {
                                class623.method3408(var8, var9, var14.field3813, var14.field3817 * 8, var14.field3814);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var28 = var15.field3061;
                            if (class553.field7575) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field3058;
                                var20[var19] = arg5[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field7071.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg3 == null ? null : new int[var31];
                        int[] var35 = arg3 == null && arg4 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field7071[var36];
                            int var46 = this.field7054[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 512 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 512 - var45;
                                var33[var36] = 512 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 512 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class224.field2906[var10][var36]) {
                                int var49 = (var8 << 9) + var45;
                                int var50 = (var9 << 9) + var45;
                                var34[var36] = arg3.method159(var49, var50) - arg6.method159(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg3 != null && !class224.field2906[var10][var36]) {
                                    int var51 = (var8 << 9) + var45;
                                    int var52 = (var9 << 9) + var45;
                                    var35[var36] = arg6.method159(var51, var52) - arg3.method159(var51, var52);
                                } else if (arg4 != null && !class46.field609[var10][var36]) {
                                    int var53 = (var8 << 9) + var45;
                                    int var54 = (var9 << 9) + var45;
                                    var35[var36] = arg4.method159(var53, var54) - arg6.method159(var53, var54);
                                }
                            }
                        }
                        int var37 = arg6.method150(var8, var9);
                        int var38 = arg6.method150(var8 + 1, var9);
                        int var39 = arg6.method150(var8 + 1, var9 - -1);
                        int var40 = arg6.method150(var8, var9 + 1);
                        if (arg1 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field3818) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field7075[arg1][var8][var9] = (byte) class288.method1722(this.field7075[arg1][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field7070) {
                            var42 = class191.method1225(var8, var9);
                            var43 = class380.method2302(var8, var9);
                            var44 = class528.method3006(var8, var9);
                        }
                        arg6.method162(var8, var9, var32, var34, var33, var35, class47.field632[var10], class653.field9253[var10], class11.field110[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class207.method1295(arg1, var8, var9);
                    }
                }
            }
        }
        if (arg2 <= 7) {
            this.method2933(93, 90, 73, 111, -26, false);
        }
        field7078++;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IILdga;IIII[Lsl;II)V", line = 985)
    public final void method2928(int arg0, int arg1, class138 arg2, int arg3, int arg4, int arg5, int arg6, class245[] arg7, int arg8, int arg9) {
        field7057++;
        int var11 = (arg1 & 0x7) * 8;
        int var12 = (arg3 & 0x7) * 8;
        if (!this.field7070) {
            class245 var13 = arg7[arg4];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg0 + class245.method1506(var14 & 0x7, var15 & 0x7, false, arg5);
                    int var17 = class103.method554(arg5, var14 & 0x7, var15 & 0x7, false) + arg9;
                    if (var16 > 0 && (this.field7069 - 1) > var16 && var17 > 0 && (this.field7074 - 1) > var17) {
                        var13.method1509(var17, var16, 81);
                    }
                }
            }
        }
        int var18 = arg1 & 0x1FFFFFF8 << 3;
        int var19 = (arg3 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        if (arg6 != -21124) {
            this.field7054 = null;
        }
        byte var21 = 0;
        if (arg5 == 1) {
            var21 = 1;
        } else if (arg5 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg5 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field7066; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg8 == var22 && var23 >= var11 && var23 <= var11 + 8 && var24 >= var12 && var24 <= var12 + 8) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || (var12 + 8) == var24) {
                            if (arg5 == 0) {
                                var26 = var24 + arg9 - var12;
                                var25 = var23 + arg0 - var11;
                            } else if (arg5 == 1) {
                                var25 = arg0 - (var12 - var24);
                                var26 = var11 + arg9 + 8 - var23;
                            } else if (arg5 == 2) {
                                var25 = var11 + arg0 + 8 - var23;
                                var26 = 8 - var24 - (-var12 - arg9);
                            } else {
                                var25 = arg0 + var12 + 8 - var24;
                                var26 = arg9 + var23 - var11;
                            }
                            this.method2924(arg4, var26, arg2, 0, var25, 0, var19 + var24, var18 - -var23, 0, true, 0);
                        } else {
                            var25 = arg0 + class245.method1506(var23 & 0x7, var24 & 0x7, false, arg5);
                            var26 = class103.method554(arg5, var23 & 0x7, var24 & 0x7, false) + arg9;
                            this.method2924(arg4, var26, arg2, var21, var25, 0, var19 + var24, var18 + var23, arg5, false, var20);
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
                                    var31 = arg9 + var30 - var12;
                                    var32 = var29 + arg0 - var11;
                                } else if (arg5 == 1) {
                                    var31 = var11 + arg9 + 8 - var29;
                                    var32 = arg0 + var30 - var12;
                                } else if (arg5 == 2) {
                                    var32 = arg0 + var11 + 8 - var29;
                                    var31 = arg9 + var12 + 8 - var30;
                                } else {
                                    var32 = arg0 + var12 + 8 - var30;
                                    var31 = var29 + arg9 - var11;
                                }
                                if (var32 >= 0 && var32 < this.field7069 && var31 >= 0 && this.field7074 > var31) {
                                    this.field7060[arg4][var32][var31] = this.field7060[arg4][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method2924(0, -1, arg2, 0, -1, arg6 ^ -21124, 0, 0, 0, false, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V", line = 1185)
    public static void method2929(int arg0) {
        field7081 = null;
        if (arg0 == -7048) {
            field7079 = null;
            field7080 = null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(IIIZLvb;Lum;)V", line = 2429)
    public class516(int arg0, int arg1, int arg2, boolean arg3, class411 arg4, class169 arg5) {
        this.field7066 = arg0;
        this.field7068 = arg5;
        this.field7074 = arg2;
        this.field7070 = arg3;
        this.field7072 = arg4;
        this.field7069 = arg1;
        this.field7064 = new byte[this.field7066][this.field7069][this.field7074];
        this.field7063 = new byte[this.field7066][this.field7069][this.field7074];
        this.field7058 = new byte[this.field7066][this.field7069][this.field7074];
        this.field7060 = new int[this.field7066][this.field7069 + 1][this.field7074 + 1];
        this.field7059 = new byte[this.field7066][this.field7069][this.field7074];
        this.field7075 = new byte[this.field7066][this.field7069 + 1][this.field7074 + 1];
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIII)V", line = 1203)
    public final void method2930(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7052++;
        for (int var6 = 0; var6 < this.field7066; var6++) {
            this.method2933(var6, arg0, arg2, arg3, arg4, false);
        }
        if (arg1 != 8297) {
            this.method2928(55, 120, null, -26, -15, 83, -42, null, -64, -111);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[[II)V", line = 1224)
    public final void method2931(int arg0, int[][] arg1, int arg2) {
        field7061++;
        if (arg2 < 0) {
            this.field7066 = -86;
        }
        int[][] var4 = this.field7060[arg0];
        for (int var5 = 0; var5 < (this.field7069 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field7074 + 1); var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILd;[[IILoa;Ld;Ld;)V", line = 1255)
    private final void method2932(int arg0, class176 arg1, int[][] arg2, int arg3, class689 arg4, class176 arg5, class176 arg6) {
        field7067++;
        byte[][] var8 = this.field7058[arg0];
        byte[][] var9 = this.field7063[arg0];
        byte[][] var10 = this.field7059[arg0];
        byte[][] var11 = this.field7064[arg0];
        if (arg3 != 3) {
            this.method2933(-37, -102, 69, 61, -84, false);
        }
        for (int var12 = 0; var12 < this.field7069; var12++) {
            int var13 = this.field7069 - 1 <= var12 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field7074; var14++) {
                int var15 = this.field7074 - 1 <= var14 ? var14 : var14 + 1;
                if (class669.field9513 == -1 || class548.method3081(arg0, var12, var14, class669.field9513, -16623)) {
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
                        class283 var26 = var21 == 0 ? null : this.field7072.method2412(arg3 + 1, var21 + -1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class235 var27 = var22 == 0 ? null : this.field7068.method1127(var22 - 1, 1);
                        class283 var28 = var26;
                        if (var26 != null) {
                            if (var26.field3820 == -1 && var26.field3816 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field3833;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field7069 > var12 && this.field7074 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            byte var35 = 0;
                            int var36 = var35 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var33++;
                                var34++;
                            } else {
                                var33--;
                                var34--;
                            }
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var33++;
                            } else {
                                var33--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var32--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var36--;
                                var34--;
                            }
                            int var37 = var34 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg5.method150(var12, var14) - arg5.method150(var13, var15);
                                var38 = arg5.method150(var13, var14) - arg5.method150(var12, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 >= var38 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class419.field5830[var39] = -1;
                            class573.field7937[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field3833 ? class380.field5453[var19] : class333.field4857[var19];
                        this.method2926(var14, var18, var9, var19, var11, var26, this.field7069, var27, arg4, var12, this.field7074, var20, (byte) 26, var8);
                        boolean var41 = var26 != null && var26.field3820 != var26.field3816;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class419.field5830[var42] >= 0 && class502.field6790[var42] != class37.field375[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class95.method525(var18[1], class230.method1424(class573.field7937[2], class573.field7937[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class95.method525(var18[3], class230.method1424(class573.field7937[6], class573.field7937[0]) == 0);
                        }
                        if (!var40[-(-var20) & 0x3]) {
                            var18[0] = class95.method525(var18[0], class230.method1424(class573.field7937[0], class573.field7937[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class95.method525(var18[2], class230.method1424(class573.field7937[4], class573.field7937[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                                var18[2] = var18[3] = false;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int var46;
                        int[] var47;
                        int[] var48;
                        int[] var49;
                        if (var43) {
                            var49 = class47.field632[var19];
                            var46 = var27 == null ? 0 : class573.field7939[var19];
                            var48 = class653.field9253[var19];
                            var47 = class11.field110[var19];
                            var45 = var26 == null ? 0 : class559.field7614[var19];
                        } else if (var17) {
                            var48 = class587.field8071[var19];
                            var46 = var27 == null ? 0 : class220.field2861[var19];
                            var49 = class500.field6744[var19];
                            var47 = class618.field8415[var19];
                            var45 = var26 == null ? 0 : class307.field4118[var19];
                            var44 = class528.field7315[var19];
                        } else {
                            var45 = var26 == null ? 0 : class411.field5769[var19];
                            var46 = var27 == null ? 0 : class361.field5204[var19];
                            var47 = class46.field625[var19];
                            var44 = class618.field8416[var19];
                            var48 = class502.field6794[var19];
                            var49 = class356.field5175[var19];
                        }
                        int var50 = var45 + var46;
                        if (var50 <= 0) {
                            class207.method1295(arg0, var12, var14);
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
                            int[] var60 = arg1 == null ? null : new int[var53];
                            int[] var61 = arg1 == null && arg6 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field3820;
                                var63 = arg4.method1791() ? var26.field3824 : var26.field3825;
                                var64 = var26.field3831;
                                int var65 = class145.method987(false, arg4, var26);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class485.field6556[0] = var49[var51];
                                        class485.field6556[1] = 1;
                                        class485.field6556[2] = var47[var51];
                                        class485.field6556[3] = 1;
                                        class485.field6556[4] = var48[var51];
                                        class485.field6556[5] = var47[var51];
                                        var98 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class485.field6556[0] = var49[var51];
                                        class485.field6556[1] = 5;
                                        class485.field6556[2] = var47[var51];
                                        class485.field6556[3] = 5;
                                        class485.field6556[4] = var48[var51];
                                        var98 = 6;
                                        class485.field6556[5] = var47[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class485.field6556[0] = var49[var51];
                                        class485.field6556[1] = 3;
                                        class485.field6556[2] = var47[var51];
                                        class485.field6556[3] = 3;
                                        class485.field6556[4] = var48[var51];
                                        class485.field6556[5] = var47[var51];
                                        var98 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class485.field6556[0] = var49[var51];
                                        class485.field6556[1] = 7;
                                        class485.field6556[2] = var47[var51];
                                        class485.field6556[3] = 7;
                                        class485.field6556[4] = var48[var51];
                                        var98 = 6;
                                        class485.field6556[5] = var47[var51];
                                    } else {
                                        class485.field6556[0] = var49[var51];
                                        class485.field6556[1] = var48[var51];
                                        var98 = 3;
                                        class485.field6556[2] = var47[var51];
                                    }
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class485.field6556[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field7071[var100];
                                        int var103 = this.field7054[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = 512 - var102;
                                            var105 = var103;
                                        } else if (var20 == 2) {
                                            var104 = 512 - var103;
                                            var105 = 512 - var102;
                                        } else if (var20 == 3) {
                                            var104 = var102;
                                            var105 = 512 - var103;
                                        } else {
                                            var104 = var103;
                                            var105 = var102;
                                        }
                                        var55[var52] = var105;
                                        var56[var52] = var104;
                                        if (var60 != null && class224.field2906[var19][var100]) {
                                            int var106 = (var12 << 9) + var105;
                                            int var107 = (var14 << 9) + var104;
                                            var60[var52] = arg1.method159(var106, var107) - arg5.method159(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class224.field2906[var19][var100]) {
                                                int var108 = (var12 << 9) + var105;
                                                int var109 = (var14 << 9) + var104;
                                                var61[var52] = arg5.method159(var108, var109) - arg1.method159(var108, var109);
                                            } else if (arg6 != null && !class46.field609[var19][var100]) {
                                                int var110 = (var12 << 9) + var105;
                                                int var111 = (var14 << 9) + var104;
                                                var61[var52] = arg6.method159(var110, var111) - arg5.method159(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && var26.field3815 < class419.field5830[var101]) {
                                            if (var54 != null) {
                                                var54[var52] = class37.field375[var101];
                                            }
                                            var59[var52] = class576.field7966[var101];
                                            var58[var52] = class58.field818[var101];
                                            var57[var52] = class502.field6790[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg4.method1791() ? var26.field3824 : var26.field3825;
                                            var59[var52] = var26.field3831;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field7070 && arg0 == 0) {
                                    class623.method3408(var12, var14, var26.field3813, var26.field3817 * 8, var26.field3814);
                                }
                                if (var19 != 12 && var26.field3820 != -1 && var26.field3819) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class559.field7614[var19];
                            } else if (var17) {
                                var51 += class307.field4118[var19];
                            } else {
                                var51 += class411.field5769[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class235 var67 = this.field7068.method1127(var22 - 1, 1);
                                class235 var68 = this.field7068.method1127(var23 - 1, 1);
                                class235 var69 = this.field7068.method1127(var24 - 1, 1);
                                class235 var70 = this.field7068.method1127(var25 - 1, arg3 + -2);
                                for (int var71 = 0; var71 < var46; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class485.field6556[0] = var49[var51];
                                        class485.field6556[1] = 1;
                                        class485.field6556[2] = var47[var51];
                                        class485.field6556[3] = 1;
                                        class485.field6556[4] = var48[var51];
                                        class485.field6556[5] = var47[var51];
                                        var73 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class485.field6556[0] = var49[var51];
                                        class485.field6556[1] = 5;
                                        class485.field6556[2] = var47[var51];
                                        class485.field6556[3] = 5;
                                        class485.field6556[4] = var48[var51];
                                        var73 = 6;
                                        class485.field6556[5] = var47[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class485.field6556[0] = var49[var51];
                                        class485.field6556[1] = 3;
                                        class485.field6556[2] = var47[var51];
                                        class485.field6556[3] = 3;
                                        class485.field6556[4] = var48[var51];
                                        class485.field6556[5] = var47[var51];
                                        var73 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class485.field6556[0] = var49[var51];
                                        class485.field6556[1] = 7;
                                        class485.field6556[2] = var47[var51];
                                        class485.field6556[3] = 7;
                                        class485.field6556[4] = var48[var51];
                                        class485.field6556[5] = var47[var51];
                                        var73 = 6;
                                    } else {
                                        class485.field6556[0] = var49[var51];
                                        class485.field6556[1] = var48[var51];
                                        class485.field6556[2] = var47[var51];
                                        var73 = 3;
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class485.field6556[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field7071[var75];
                                        int var78 = this.field7054[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = var78;
                                            var80 = 512 - var77;
                                        } else if (var20 == 2) {
                                            var80 = 512 - var78;
                                            var79 = 512 - var77;
                                        } else if (var20 == 3) {
                                            var79 = 512 - var78;
                                            var80 = var77;
                                        } else {
                                            var79 = var77;
                                            var80 = var78;
                                        }
                                        var55[var52] = var79;
                                        var56[var52] = var80;
                                        if (var60 != null && class224.field2906[var19][var75]) {
                                            int var81 = (var12 << 9) + var79;
                                            int var82 = (var14 << 9) + var80;
                                            var60[var52] = arg1.method159(var81, var82) - arg5.method159(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class224.field2906[var19][var75]) {
                                                int var83 = (var12 << 9) + var79;
                                                int var84 = (var14 << 9) + var80;
                                                var61[var52] = arg5.method159(var83, var84) - arg1.method159(var83, var84);
                                            } else if (arg6 != null && !class46.field609[var19][var75]) {
                                                int var85 = (var12 << 9) + var79;
                                                int var86 = (var14 << 9) + var80;
                                                var61[var52] = arg6.method159(var85, var86) - arg5.method159(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class419.field5830[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class37.field375[var76];
                                            }
                                            var59[var52] = class576.field7966[var76];
                                            var58[var52] = class58.field818[var76];
                                            var57[var52] = class502.field6790[var76];
                                        } else {
                                            if (var17 && class224.field2906[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var79 == 0 && var80 == 0) {
                                                var57[var52] = arg2[var12][var14];
                                                var58[var52] = var67.field3061;
                                                var59[var52] = var67.field3058;
                                            } else if (var79 == 0 && var80 == 512) {
                                                var57[var52] = arg2[var12][var15];
                                                var58[var52] = var68.field3061;
                                                var59[var52] = var68.field3058;
                                            } else if (var79 == 512 && var80 == 512) {
                                                var57[var52] = arg2[var13][var15];
                                                var58[var52] = var69.field3061;
                                                var59[var52] = var69.field3058;
                                            } else if (var79 == 512 && var80 == 0) {
                                                var57[var52] = arg2[var13][var14];
                                                var58[var52] = var70.field3061;
                                                var59[var52] = var70.field3058;
                                            } else {
                                                if (var79 >= 256) {
                                                    if (var80 >= 256) {
                                                        var58[var52] = var69.field3061;
                                                        var59[var52] = var69.field3058;
                                                    } else {
                                                        var58[var52] = var70.field3061;
                                                        var59[var52] = var70.field3058;
                                                    }
                                                } else if (var80 >= 256) {
                                                    var58[var52] = var68.field3061;
                                                    var59[var52] = var68.field3058;
                                                } else {
                                                    var58[var52] = var67.field3061;
                                                    var59[var52] = var67.field3058;
                                                }
                                                int var87 = class267.method1652((byte) -105, arg2[var13][var14], arg2[var12][var14], var79 << 7 >> 9);
                                                int var88 = class267.method1652((byte) -79, arg2[var13][var15], arg2[var12][var15], var79 << 7 >> 9);
                                                var57[var52] = class267.method1652((byte) -69, var88, var87, var80 << 7 >> 9);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field3055) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg5.method150(var12, var14);
                            int var90 = arg5.method150(var13, var14);
                            int var91 = arg5.method150(var13, var15);
                            int var92 = arg5.method150(var12, var15);
                            if (arg0 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field3818) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field7075[arg0][var12][var14] = (byte) class288.method1722(this.field7075[arg0][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field7070) {
                                var94 = class191.method1225(var12, var14);
                                var95 = class380.method2302(var12, var14);
                                var96 = class528.method3006(var12, var14);
                            }
                            arg5.method153(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class207.method1295(arg0, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIZ)V", line = 2123)
    private final void method2933(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        for (int var7 = arg1; var7 < (arg1 + arg3); var7++) {
            for (int var10 = arg2; var10 < arg2 + arg4; var10++) {
                if (var10 >= 0 && this.field7069 > var10 && var7 >= 0 && var7 < this.field7074) {
                    this.field7060[arg0][var10][var7] = arg0 <= 0 ? 0 : this.field7060[arg0 - 1][var10][var7] - 960;
                }
            }
        }
        field7053++;
        if (arg2 > 0 && arg2 < this.field7069) {
            for (int var8 = arg1 + 1; var8 < (arg1 + arg3); var8++) {
                if (var8 >= 0 && this.field7074 > var8) {
                    this.field7060[arg0][arg2][var8] = this.field7060[arg0][arg2 - 1][var8];
                }
            }
        }
        if (arg5) {
            return;
        }
        if (arg1 > 0 && arg1 < this.field7074) {
            for (int var9 = arg2 + 1; var9 < (arg2 + arg4); var9++) {
                if (var9 >= 0 && this.field7069 > var9) {
                    this.field7060[arg0][var9][arg1] = this.field7060[arg0][var9][arg1 - 1];
                }
            }
        }
        if (arg2 < 0 || arg1 < 0 || this.field7069 <= arg2 || arg1 >= this.field7074) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 > 0 && this.field7060[arg0][arg2 - 1][arg1] != 0) {
                this.field7060[arg0][arg2][arg1] = this.field7060[arg0][arg2 - 1][arg1];
                return;
            }
            if (arg1 > 0 && this.field7060[arg0][arg2][arg1 - 1] != 0) {
                this.field7060[arg0][arg2][arg1] = this.field7060[arg0][arg2][arg1 - 1];
                return;
            }
            if (arg2 > 0 && arg1 > 0 && this.field7060[arg0][arg2 - 1][arg1 - 1] != 0) {
                this.field7060[arg0][arg2][arg1] = this.field7060[arg0][arg2 - 1][arg1 - 1];
                return;
            }
        } else if (arg2 <= 0 || this.field7060[arg0 - 1][arg2 - 1][arg1] == this.field7060[arg0][arg2 - 1][arg1]) {
            if (arg1 > 0 && this.field7060[arg0][arg2][arg1 - 1] != this.field7060[arg0 - 1][arg2][arg1 - 1]) {
                this.field7060[arg0][arg2][arg1] = this.field7060[arg0][arg2][arg1 - 1];
                return;
            }
            if (arg2 > 0 && arg1 > 0 && this.field7060[arg0 - 1][arg2 - 1][arg1 - 1] != this.field7060[arg0][arg2 - 1][arg1 - 1]) {
                this.field7060[arg0][arg2][arg1] = this.field7060[arg0][arg2 - 1][arg1 - 1];
                return;
            }
            return;
        } else {
            this.field7060[arg0][arg2][arg1] = this.field7060[arg0][arg2 - 1][arg1];
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLjava/lang/String;IIIIII)V", line = 2231)
    public static final void method2934(byte arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7062++;
        class620 var8 = new class620();
        var8.field8423 = class430.field5984 + arg2;
        var8.field8425 = arg1;
        var8.field8433 = arg5;
        var8.field8430 = arg7;
        var8.field8426 = arg6;
        var8.field8427 = arg3;
        var8.field8431 = arg4;
        if (arg0 > -40) {
            field7082 = -1.4194374612140084D;
        }
        class565.field7805.method2216(4, var8);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ld;BLd;Loa;)V", line = 2252)
    public final void method2935(class176 arg0, byte arg1, class176 arg2, class689 arg3) {
        field7073++;
        if (class527.field7298 == null || class527.field7298.length != this.field7074) {
            class527.field7298 = new int[this.field7074];
            class316.field4603 = new int[this.field7074];
            class99.field1205 = new int[this.field7074];
            class59.field822 = new int[this.field7074];
            class572.field7935 = new int[this.field7074];
        }
        int[][] var5 = new int[this.field7069][this.field7074];
        for (int var6 = 0; var6 < this.field7066; var6++) {
            for (int var8 = 0; var8 < this.field7074; var8++) {
                class527.field7298[var8] = 0;
                class316.field4603[var8] = 0;
                class572.field7935[var8] = 0;
                class99.field1205[var8] = 0;
                class59.field822[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field7069; var9++) {
                for (int var10 = 0; var10 < this.field7074; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field7069) {
                        int var20 = this.field7059[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class235 var21 = this.field7068.method1127(var20 - 1, 1);
                            class527.field7298[var10] += var21.field3066;
                            class316.field4603[var10] += var21.field3072;
                            class572.field7935[var10] += var21.field3068;
                            class99.field1205[var10] += var21.field3069;
                            var10002 = class59.field822[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field7059[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class235 var24 = this.field7068.method1127(var23 - 1, arg1 + -26);
                            class527.field7298[var10] -= var24.field3066;
                            class316.field4603[var10] -= var24.field3072;
                            class572.field7935[var10] -= var24.field3068;
                            class99.field1205[var10] -= var24.field3069;
                            var10002 = class59.field822[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field7074; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field7074) {
                            var13 += class572.field7935[var17];
                            var15 += class59.field822[var17];
                            var12 += class316.field4603[var17];
                            var11 += class527.field7298[var17];
                            var14 += class99.field1205[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class572.field7935[var18];
                            var15 -= class59.field822[var18];
                            var12 -= class316.field4603[var18];
                            var14 -= class99.field1205[var18];
                            var11 -= class527.field7298[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class609.method3361(var11 * 256 / var14, (byte) 38, var12 / var15, var13 / var15);
                        }
                    }
                }
            }
            if (class473.field6396) {
                this.method2932(var6, var6 == 0 ? arg2 : null, var5, 3, arg3, class397.field5666[var6], var6 == 0 ? arg0 : null);
            } else {
                this.method2927(arg3, var6, (byte) 61, var6 == 0 ? arg2 : null, var6 == 0 ? arg0 : null, var5, class397.field5666[var6]);
            }
            this.field7059[var6] = null;
            this.field7064[var6] = null;
            this.field7058[var6] = null;
            this.field7063[var6] = null;
        }
        if (!this.field7070) {
            if (class523.field7249 != 0) {
                class365.method2237();
            }
            if (class593.field8135) {
                class484.method2701();
            }
        }
        if (arg1 != 27) {
            field7080 = null;
        }
        for (int var7 = 0; var7 < this.field7066; var7++) {
            class397.field5666[var7].method148();
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "([[[IBLoa;[Lsl;)V", line = 2448)
    public final void method2936(int[][][] arg0, byte arg1, class689 arg2, class245[] arg3) {
        if (arg1 != -67) {
            this.method2935(null, (byte) 13, null, null);
        }
        if (!this.field7070) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field7069; var6++) {
                    for (int var7 = 0; var7 < this.field7074; var7++) {
                        if ((class645.field9140[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class645.field9140[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg3[var8].method1501(var7, var6, (byte) 49);
                            }
                        }
                    }
                }
            }
        }
        field7077++;
        for (int var9 = 0; var9 < this.field7066; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field7070) {
                if (class593.field8135) {
                    var10 |= 0x2;
                }
                if (class223.field2896) {
                    var11 |= 0x8;
                }
                if (class523.field7249 != 0) {
                    var10 |= 0x1;
                    if (class308.field4132 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class593.field8135) {
                var11 |= 0x7;
            }
            if (!class118.field1523) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || var9 >= arg0.length ? this.field7060[var9] : arg0[var9];
            class100.method543(var9, arg2.method1787(this.field7069, this.field7074, this.field7060[var9], var12, 512, var10, var11));
        }
    }
}
