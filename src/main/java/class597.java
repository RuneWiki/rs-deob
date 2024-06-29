import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class597 {

    @OriginalMember(owner = "client!kia", name = "i", descriptor = "[I")
    private int[] field7579 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!kia", name = "s", descriptor = "[I")
    private int[] field7589 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!kia", name = "C", descriptor = "I")
    public int field7599;

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "Lsc;")
    private class472 field7573;

    @OriginalMember(owner = "client!kia", name = "D", descriptor = "Lvg;")
    private class199 field7600;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "Z")
    public boolean field7571;

    @OriginalMember(owner = "client!kia", name = "u", descriptor = "I")
    public int field7591;

    @OriginalMember(owner = "client!kia", name = "l", descriptor = "I")
    public int field7582;

    @OriginalMember(owner = "client!kia", name = "f", descriptor = "[[[B")
    private byte[][][] field7576;

    @OriginalMember(owner = "client!kia", name = "h", descriptor = "[[[B")
    private byte[][][] field7578;

    @OriginalMember(owner = "client!kia", name = "t", descriptor = "[[[I")
    public int[][][] field7590;

    @OriginalMember(owner = "client!kia", name = "p", descriptor = "[[[B")
    private byte[][][] field7586;

    @OriginalMember(owner = "client!kia", name = "x", descriptor = "[[[B")
    public byte[][][] field7594;

    @OriginalMember(owner = "client!kia", name = "B", descriptor = "[[[B")
    private byte[][][] field7598;

    @OriginalMember(owner = "client!kia", name = "j", descriptor = "Z")
    public static boolean field7580 = false;

    @OriginalMember(owner = "client!kia", name = "r", descriptor = "[I")
    public static int[] field7588 = new int[2];

    @OriginalMember(owner = "client!kia", name = "m", descriptor = "[B")
    public static byte[] field7583 = new byte[520];

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!kia", name = "d", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!kia", name = "e", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!kia", name = "g", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!kia", name = "k", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!kia", name = "o", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!kia", name = "q", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!kia", name = "v", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!kia", name = "w", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!kia", name = "y", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!kia", name = "z", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!kia", name = "E", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!kia", name = "F", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!kia", name = "n", descriptor = "Lvba;")
    public static class765 field7584;

    @OriginalMember(owner = "client!kia", name = "A", descriptor = "[[[B")
    public byte[][][] field7597;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(B)V", line = 8)
    public static void method3217(byte arg0) {
        if (arg0 < 85) {
            field7583 = null;
        }
        field7584 = null;
        field7583 = null;
        field7588 = null;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Ls;[[ILs;Lha;ILs;B)V", line = 24)
    private final void method3218(class358 arg0, int[][] arg1, class358 arg2, class570 arg3, int arg4, class358 arg5, byte arg6) {
        field7602++;
        int var8 = -12 / ((-arg6 - 10) / 57);
        for (int var9 = 0; var9 < this.field7582; var9++) {
            for (int var10 = 0; var10 < this.field7599; var10++) {
                if (class47.field547 == -1 || class408.method2373(class47.field547, 16, var10, var9, arg4)) {
                    byte var11 = this.field7576[arg4][var9][var10];
                    byte var12 = this.field7598[arg4][var9][var10];
                    int var13 = this.field7586[arg4][var9][var10] & 0xFF;
                    int var14 = this.field7578[arg4][var9][var10] & 0xFF;
                    class363 var15 = var13 == 0 ? null : this.field7600.method1361(4, var13 - 1);
                    if (var11 == 0 && var15 == null) {
                        var11 = 12;
                    }
                    class631 var16 = var14 == 0 ? null : this.field7573.method2663(var14 - 1, (byte) -54);
                    class363 var17 = var15;
                    if (var15 != null && var15.field4424 == -1 && var15.field4428 == -1) {
                        var17 = var15;
                        var15 = null;
                    }
                    if (var15 != null || var16 != null) {
                        int var18 = class422.field5560[var11];
                        int var19 = class1.field4[var11];
                        int var20 = (var15 == null ? 0 : var19) + (var16 == null ? 0 : var18);
                        int var21 = 0;
                        int var22 = 0;
                        int var23 = var15 == null ? -1 : var15.field4413;
                        int var24 = var16 == null ? -1 : var16.field8007;
                        int[] var25 = new int[var20];
                        int[] var26 = new int[var20];
                        int[] var27 = new int[var20];
                        int[] var28 = new int[var20];
                        int[] var29 = new int[var20];
                        int[] var30 = new int[var20];
                        int[] var31 = var15 == null || var15.field4428 == -1 ? null : new int[var20];
                        if (var15 == null) {
                            var22 += var19;
                        } else {
                            for (int var32 = 0; var32 < var19; var32++) {
                                var25[var21] = class318.field3972[var11][var22];
                                var26[var21] = class469.field6109[var11][var22];
                                var27[var21] = class761.field10379[var11][var22];
                                var29[var21] = var23;
                                var30[var21] = var15.field4417;
                                var28[var21] = var15.field4424;
                                if (var31 != null) {
                                    var31[var21] = var15.field4428;
                                }
                                var22++;
                                var21++;
                            }
                            if (!this.field7571 && arg4 == 0) {
                                class704.method3814(var9, var10, var15.field4416, var15.field4423 * 8, var15.field4412);
                            }
                        }
                        if (var16 != null) {
                            for (int var33 = 0; var33 < var18; var33++) {
                                var25[var21] = class318.field3972[var11][var22];
                                var26[var21] = class469.field6109[var11][var22];
                                var27[var21] = class761.field10379[var11][var22];
                                var29[var21] = var24;
                                var30[var21] = var16.field8013;
                                var28[var21] = arg1[var9][var10];
                                if (var31 != null) {
                                    var31[var21] = var28[var21];
                                }
                                var22++;
                                var21++;
                            }
                        }
                        int var34 = this.field7589.length;
                        int[] var35 = new int[var34];
                        int[] var36 = new int[var34];
                        int[] var37 = arg5 == null ? null : new int[var34];
                        int[] var38 = arg5 == null && arg0 == null ? null : new int[var34];
                        for (int var39 = 0; var39 < var34; var39++) {
                            int var49 = this.field7589[var39];
                            int var50 = this.field7579[var39];
                            if (var12 == 0) {
                                var35[var39] = var49;
                                var36[var39] = var50;
                            } else if (var12 == 1) {
                                var35[var39] = var50;
                                var36[var39] = 512 - var49;
                            } else if (var12 == 2) {
                                var35[var39] = 512 - var49;
                                var36[var39] = 512 - var50;
                            } else if (var12 == 3) {
                                var35[var39] = 512 - var50;
                                var36[var39] = var49;
                            }
                            if (var37 != null && class480.field6209[var11][var39]) {
                                int var53 = (var9 << 9) + var35[var39];
                                int var54 = (var10 << 9) + var36[var39];
                                var37[var39] = arg5.method2072((byte) -58, var53, var54) - arg2.method2072((byte) -106, var53, var54);
                            }
                            if (var38 != null) {
                                if (arg5 != null && !class480.field6209[var11][var39]) {
                                    int var55 = (var9 << 9) + var35[var39];
                                    int var56 = (var10 << 9) + var36[var39];
                                    var38[var39] = arg2.method2072((byte) 106, var55, var56) - arg5.method2072((byte) -82, var55, var56);
                                } else if (arg0 != null && !class356.field4343[var11][var39]) {
                                    int var57 = (var9 << 9) + var35[var39];
                                    int var58 = (var10 << 9) + var36[var39];
                                    var38[var39] = arg0.method2072((byte) -85, var57, var58) - arg2.method2072((byte) -27, var57, var58);
                                }
                            }
                        }
                        int var40 = arg2.method2060(var10, -105, var9);
                        int var41 = arg2.method2060(var10, -112, var9 + 1);
                        int var42 = arg2.method2060(var10 + 1, -108, var9 + 1);
                        int var43 = arg2.method2060(var10 + 1, -127, var9);
                        boolean var44 = class433.method2484(var10, 0, var9);
                        if (var44 && arg4 > 1 || !var44 && arg4 > 0) {
                            boolean var45 = true;
                            if (var16 != null && !var16.field8005) {
                                var45 = false;
                            } else if (var14 == 0 && var11 != 0) {
                                var45 = false;
                            } else if (var13 > 0 && var17 != null && !var17.field4427) {
                                var45 = false;
                            }
                            if (var45 && var40 == var41 && var40 == var42 && var40 == var43) {
                                this.field7594[arg4][var9][var10] = (byte) class77.method473(this.field7594[arg4][var9][var10], 4);
                            }
                        }
                        int var46 = 0;
                        int var47 = 0;
                        int var48 = 0;
                        if (this.field7571) {
                            var46 = class596.method3215(var9, var10);
                            var47 = class415.method2398(var9, var10);
                            var48 = class627.method3352(var9, var10);
                        }
                        arg2.method2068(var9, var10, var35, var37, var36, var38, var25, var26, var27, var28, var31, var29, var30, var46, var47, var48, false);
                        class191.method1337(arg4, var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(BI[[I)V", line = 308)
    public final void method3219(byte arg0, int arg1, int[][] arg2) {
        field7587++;
        int[][] var4 = this.field7590[arg1];
        if (arg0 != 53) {
            return;
        }
        for (int var5 = 0; var5 < (this.field7582 + 1); var5++) {
            for (int var6 = 0; var6 < this.field7599 + 1; var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)V", line = 337)
    public static final void method3220(int arg0) {
        class167.field2221 = -1;
        class380.field4658 = arg0;
        class270.field3560 = -1;
        field7595++;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IILmc;II[Leo;IIII)V", line = 357)
    public final void method3221(int arg0, int arg1, class234 arg2, int arg3, int arg4, class340[] arg5, int arg6, int arg7, int arg8, int arg9) {
        field7575++;
        int var11 = (arg7 & 0x7) * 8;
        if (arg4 >= -52) {
            this.method3226(true, null, 80, -84, -62, null, null, null, null, null, 57, -40, 48, null);
        }
        if (!this.field7571) {
            class340 var12 = arg5[arg8];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg6 + class753.method4089(var14 & 0x7, 7, arg3, var13 & 0x7);
                    int var16 = arg9 + class427.method2472((byte) 127, arg3, var14 & 0x7, var13 & 0x7);
                    if (var15 > 0 && var15 < this.field7582 - 1 && var16 > 0 && this.field7599 - 1 > var16) {
                        var12.method1959(-4, var16, var15);
                    }
                }
            }
        }
        int var17 = (arg1 & 0x7) * 8;
        int var18 = (arg7 & 0xFFFFFFF8) << 3;
        int var19 = arg1 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg3 == 1) {
            var21 = 1;
        } else if (arg3 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg3 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field7591; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg0 == var22 && var11 <= var23 && (var11 + 8) >= var23 && var24 >= var17 && var17 + 8 >= var24) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || (var17 + 8) == var24) {
                            if (arg3 == 0) {
                                var25 = var23 - (var11 - arg6);
                                var26 = var24 + arg9 - var17;
                            } else if (arg3 == 1) {
                                var25 = arg6 + var24 - var17;
                                var26 = var11 + arg9 + 8 - var23;
                            } else if (arg3 == 2) {
                                var26 = var17 + arg9 + 8 - var24;
                                var25 = var11 + arg6 + 8 - var23;
                            } else {
                                var26 = arg9 + var23 - var11;
                                var25 = arg6 + 8 - (-var17 + var24);
                            }
                            this.method3230(0, 0, false, var25, arg2, arg8, 0, var18 + var23, var26, var19 + var24, true);
                        } else {
                            var25 = class753.method4089(var24 & 0x7, 7, arg3, var23 & 0x7) + arg6;
                            var26 = arg9 + class427.method2472((byte) 123, arg3, var24 & 0x7, var23 & 0x7);
                            this.method3230(var20, var21, false, var25, arg2, arg8, arg3, var18 + var23, var26, var19 + var24, false);
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
                                if (arg3 == 0) {
                                    var32 = arg6 - (var11 - var29);
                                    var31 = arg9 + var30 - var17;
                                } else if (arg3 == 1) {
                                    var31 = var11 + (arg9 - -8) - var29;
                                    var32 = var30 - (var17 - arg6);
                                } else if (arg3 == 2) {
                                    var31 = arg9 - (var30 - var17 - 8);
                                    var32 = arg6 - (-(var11 - var29) - 8);
                                } else {
                                    var32 = var17 - (var30 - arg6 - 8);
                                    var31 = var29 + arg9 - var11;
                                }
                                if (var32 >= 0 && var32 < this.field7582 && var31 >= 0 && this.field7599 > var31) {
                                    this.field7590[arg8][var32][var31] = this.field7590[arg8][var25 + var20][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method3230(0, 0, false, -1, arg2, 0, 0, 0, -1, 0, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "([Leo;Lha;I[[[I)V", line = 557)
    public final void method3222(class340[] arg0, class570 arg1, int arg2, int[][][] arg3) {
        int var5 = 3 % ((78 - arg2) / 47);
        field7585++;
        if (!this.field7571) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < this.field7582; var7++) {
                    for (int var8 = 0; var8 < this.field7599; var8++) {
                        if ((class410.field5439[var6][var7][var8] & 0x1) != 0) {
                            int var9 = var6;
                            if ((class410.field5439[1][var7][var8] & 0x2) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg0[var9].method1960(var7, var8, -1);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < this.field7591; var10++) {
            int var11 = 0;
            int var12 = 0;
            if (!this.field7571) {
                if (class791.field10839) {
                    var12 |= 0x8;
                }
                if (class186.field2610) {
                    var11 |= 0x2;
                }
                if (class411.field5452 != 0) {
                    var11 |= 0x1;
                    if (class754.field10277 | var10 == 0) {
                        var12 |= 0x10;
                    }
                }
            }
            if (class186.field2610) {
                var12 |= 0x7;
            }
            if (!class723.field9497) {
                var12 |= 0x20;
            }
            int[][] var13 = arg3 == null || var10 >= arg3.length ? this.field7590[var10] : arg3[var10];
            class596.method3211(var10, arg1.method890(this.field7582, this.field7599, this.field7590[var10], var13, 512, var11, var12));
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIIIB)V", line = 663)
    public final void method3223(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        for (int var6 = 0; var6 < this.field7591; var6++) {
            this.method3227(arg3, var6, arg2, arg1, 3, arg0);
        }
        if (arg4 > -95) {
            this.method3218(null, null, null, null, -113, null, (byte) 24);
        }
        field7572++;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIILmc;I[Leo;I)V", line = 680)
    public final void method3224(int arg0, int arg1, int arg2, class234 arg3, int arg4, class340[] arg5, int arg6) {
        field7593++;
        if (!this.field7571) {
            for (int var8 = 0; var8 < 4; var8++) {
                class340 var9 = arg5[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg1 + var10;
                        int var13 = arg4 + var11;
                        if (var12 >= 0 && var12 < this.field7582 && var13 >= 0 && this.field7599 > var13) {
                            var9.method1959(arg0 - 11513, var13, var12);
                        }
                    }
                }
            }
        }
        int var14 = arg1 + arg6;
        int var15 = arg2 + arg4;
        if (arg0 != 11509) {
            return;
        }
        for (int var16 = 0; var16 < this.field7591; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method3230(0, 0, false, arg1 + var17, arg3, var16, 0, var14 + var17, var18 - -arg4, var15 + var18, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(IIIZLvg;Lsc;)V", line = 2521)
    public class597(int arg0, int arg1, int arg2, boolean arg3, class199 arg4, class472 arg5) {
        this.field7599 = arg2;
        this.field7573 = arg5;
        this.field7600 = arg4;
        this.field7571 = arg3;
        this.field7591 = arg0;
        this.field7582 = arg1;
        this.field7576 = new byte[this.field7591][this.field7582][this.field7599];
        this.field7578 = new byte[this.field7591][this.field7582][this.field7599];
        this.field7590 = new int[this.field7591][this.field7582 + 1][this.field7599 + 1];
        this.field7586 = new byte[this.field7591][this.field7582][this.field7599];
        this.field7594 = new byte[this.field7591][this.field7582 + 1][this.field7599 + 1];
        this.field7598 = new byte[this.field7591][this.field7582][this.field7599];
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IB)Z", line = 763)
    public static final boolean method3225(int arg0, byte arg1) {
        if (arg1 == 45) {
            field7577++;
            return arg0 == 4 || arg0 == 8 || arg0 == 11;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Z[[BIII[[B[Z[[BLha;Ltg;IIILdaa;)V", line = 774)
    private final void method3226(boolean arg0, byte[][] arg1, int arg2, int arg3, int arg4, byte[][] arg5, boolean[] arg6, byte[][] arg7, class570 arg8, class631 arg9, int arg10, int arg11, int arg12, class363 arg13) {
        if (arg0) {
            this.method3223(87, 62, 24, 35, (byte) -106);
        }
        field7596++;
        boolean[] var15 = arg13 != null && arg13.field4415 ? class695.field8912[arg4] : class356.field4345[arg4];
        if (arg10 > 0) {
            if (arg11 > 0) {
                int var16 = arg7[arg11 - 1][arg10 - 1] & 0xFF;
                if (var16 > 0) {
                    class363 var17 = this.field7600.method1361(4, var16 - 1);
                    if (var17.field4424 != -1 && var17.field4415) {
                        byte var18 = arg1[arg11 - 1][arg10 - 1];
                        int var19 = arg5[arg11 - 1][arg10 - 1] * 2 + 4 & 0x7;
                        int var20 = class497.method2761(var17, 65535, arg8);
                        if (class480.field6209[var18][var19]) {
                            class24.field209[0] = var17.field4424;
                            class43.field491[0] = var20;
                            class55.field714[0] = var17.field4413;
                            class289.field3695[0] = var17.field4417;
                            class144.field1865[0] = var17.field4426;
                            class640.field8183[0] = 256;
                        }
                    }
                }
            }
            if (arg11 < arg3 - 1) {
                int var21 = arg7[arg11 + 1][arg10 - 1] & 0xFF;
                if (var21 > 0) {
                    class363 var22 = this.field7600.method1361(4, var21 - 1);
                    if (var22.field4424 != -1 && var22.field4415) {
                        byte var23 = arg1[arg11 + 1][arg10 - 1];
                        int var24 = (arg5[arg11 + 1][arg10 - 1] * 2) + 6 & 0x7;
                        int var25 = class497.method2761(var22, 65535, arg8);
                        if (class480.field6209[var23][var24]) {
                            class24.field209[2] = var22.field4424;
                            class43.field491[2] = var25;
                            class55.field714[2] = var22.field4413;
                            class289.field3695[2] = var22.field4417;
                            class144.field1865[2] = var22.field4426;
                            class640.field8183[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg10 < arg2 - 1) {
            if (arg11 > 0) {
                int var26 = arg7[arg11 - 1][arg10 + 1] & 0xFF;
                if (var26 > 0) {
                    class363 var27 = this.field7600.method1361(4, var26 - 1);
                    if (var27.field4424 != -1 && var27.field4415) {
                        byte var28 = arg1[arg11 - 1][arg10 + 1];
                        int var29 = arg5[arg11 - 1][arg10 + 1] * 2 + 2 & 0x7;
                        int var30 = class497.method2761(var27, 65535, arg8);
                        if (class480.field6209[var28][var29]) {
                            class24.field209[6] = var27.field4424;
                            class43.field491[6] = var30;
                            class55.field714[6] = var27.field4413;
                            class289.field3695[6] = var27.field4417;
                            class144.field1865[6] = var27.field4426;
                            class640.field8183[6] = 64;
                        }
                    }
                }
            }
            if (arg11 < (arg3 - 1)) {
                int var31 = arg7[arg11 + 1][arg10 + 1] & 0xFF;
                if (var31 > 0) {
                    class363 var32 = this.field7600.method1361(4, var31 - 1);
                    if (var32.field4424 != -1 && var32.field4415) {
                        byte var33 = arg1[arg11 + 1][arg10 + 1];
                        int var34 = arg5[arg11 + 1][arg10 + 1] * 2 & 0x7;
                        int var35 = class497.method2761(var32, 65535, arg8);
                        if (class480.field6209[var33][var34]) {
                            class24.field209[4] = var32.field4424;
                            class43.field491[4] = var35;
                            class55.field714[4] = var32.field4413;
                            class289.field3695[4] = var32.field4417;
                            class144.field1865[4] = var32.field4426;
                            class640.field8183[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg10 > 0) {
            int var36 = arg7[arg11][arg10 - 1] & 0xFF;
            if (var36 > 0) {
                class363 var37 = this.field7600.method1361(4, var36 - 1);
                if (var37.field4424 != -1) {
                    byte var38 = arg1[arg11][arg10 - 1];
                    byte var39 = arg5[arg11][arg10 - 1];
                    if (var37.field4415) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class497.method2761(var37, 65535, arg8);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class480.field6209[var38][var41] && class144.field1865[var40] <= var37.field4426) {
                                class24.field209[var40] = var37.field4424;
                                class43.field491[var40] = var42;
                                class55.field714[var40] = var37.field4413;
                                class289.field3695[var40] = var37.field4417;
                                if (class144.field1865[var40] == var37.field4426) {
                                    class640.field8183[var40] = class77.method473(class640.field8183[var40], 32);
                                } else {
                                    class640.field8183[var40] = 32;
                                }
                                class144.field1865[var40] = var37.field4426;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg12 & 0x3]) {
                            arg6[0] = class695.field8912[var38][class249.method1625(var39 + 2, 3)];
                        }
                    } else if (!var15[arg12 & 0x3]) {
                        arg6[0] = class356.field4345[var38][class249.method1625(var39 + 2, 3)];
                    }
                }
            }
        }
        if (arg10 < arg2 - 1) {
            int var44 = arg7[arg11][arg10 + 1] & 0xFF;
            if (var44 > 0) {
                class363 var45 = this.field7600.method1361(4, var44 - 1);
                if (var45.field4424 != -1) {
                    byte var46 = arg1[arg11][arg10 + 1];
                    byte var47 = arg5[arg11][arg10 + 1];
                    if (var45.field4415) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class497.method2761(var45, 65535, arg8);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class480.field6209[var46][var49] && var45.field4426 >= class144.field1865[var48]) {
                                class24.field209[var48] = var45.field4424;
                                class43.field491[var48] = var50;
                                class55.field714[var48] = var45.field4413;
                                class289.field3695[var48] = var45.field4417;
                                if (class144.field1865[var48] == var45.field4426) {
                                    class640.field8183[var48] = class77.method473(class640.field8183[var48], 16);
                                } else {
                                    class640.field8183[var48] = 16;
                                }
                                class144.field1865[var48] = var45.field4426;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg12 + 2 & 0x3]) {
                            arg6[2] = class695.field8912[var46][class249.method1625(3, var47)];
                        }
                    } else if (!var15[arg12 + 2 & 0x3]) {
                        arg6[2] = class356.field4345[var46][class249.method1625(var47, 3)];
                    }
                }
            }
        }
        if (arg11 > 0) {
            int var52 = arg7[arg11 - 1][arg10] & 0xFF;
            if (var52 > 0) {
                class363 var53 = this.field7600.method1361(4, var52 - 1);
                if (var53.field4424 != -1) {
                    byte var54 = arg1[arg11 - 1][arg10];
                    byte var55 = arg5[arg11 - 1][arg10];
                    if (var53.field4415) {
                        int var56 = 6;
                        int var57 = (var55 * 2) + 4;
                        int var58 = class497.method2761(var53, 65535, arg8);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class480.field6209[var54][var57] && class144.field1865[var56] <= var53.field4426) {
                                class24.field209[var56] = var53.field4424;
                                class43.field491[var56] = var58;
                                class55.field714[var56] = var53.field4413;
                                class289.field3695[var56] = var53.field4417;
                                if (class144.field1865[var56] == var53.field4426) {
                                    class640.field8183[var56] = class77.method473(class640.field8183[var56], 8);
                                } else {
                                    class640.field8183[var56] = 8;
                                }
                                class144.field1865[var56] = var53.field4426;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg12 + 3 & 0x3]) {
                            arg6[3] = class695.field8912[var54][class249.method1625(3, var55 + 1)];
                        }
                    } else if (!var15[arg12 + 3 & 0x3]) {
                        arg6[3] = class356.field4345[var54][class249.method1625(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg11 < arg3 - 1) {
            int var60 = arg7[arg11 + 1][arg10] & 0xFF;
            if (var60 > 0) {
                class363 var61 = this.field7600.method1361(4, var60 - 1);
                if (var61.field4424 != -1) {
                    byte var62 = arg1[arg11 + 1][arg10];
                    byte var63 = arg5[arg11 + 1][arg10];
                    if (var61.field4415) {
                        int var64 = 4;
                        int var65 = (var63 * 2) + 6;
                        int var66 = class497.method2761(var61, 65535, arg8);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class480.field6209[var62][var65] && class144.field1865[var64] <= var61.field4426) {
                                class24.field209[var64] = var61.field4424;
                                class43.field491[var64] = var66;
                                class55.field714[var64] = var61.field4413;
                                class289.field3695[var64] = var61.field4417;
                                if (class144.field1865[var64] == var61.field4426) {
                                    class640.field8183[var64] = class77.method473(class640.field8183[var64], 4);
                                } else {
                                    class640.field8183[var64] = 4;
                                }
                                class144.field1865[var64] = var61.field4426;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg12 + 1 & 0x3]) {
                            arg6[1] = class695.field8912[var62][class249.method1625(3, var63 + 3)];
                        }
                    } else if (!var15[arg12 + 1 & 0x3]) {
                        arg6[1] = class356.field4345[var62][class249.method1625(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg13 == null) {
            return;
        }
        int var68 = class497.method2761(arg13, 65535, arg8);
        if (!arg13.field4415) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg12 * 2) & 0x7;
            if (class480.field6209[arg4][var69] && arg13.field4426 >= class144.field1865[var70]) {
                class24.field209[var70] = arg13.field4424;
                class43.field491[var70] = var68;
                class55.field714[var70] = arg13.field4413;
                class289.field3695[var70] = arg13.field4417;
                if (class144.field1865[var70] == arg13.field4426) {
                    class640.field8183[var70] = class77.method473(class640.field8183[var70], 2);
                } else {
                    class640.field8183[var70] = 2;
                }
                class144.field1865[var70] = arg13.field4426;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIIIII)V", line = 1246)
    public final void method3227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg3; var7 < arg3 + arg5; var7++) {
            for (int var10 = arg2; var10 < arg2 + arg0; var10++) {
                if (var10 >= 0 && this.field7582 > var10 && var7 >= 0 && var7 < this.field7599) {
                    this.field7590[arg1][var10][var7] = arg1 > 0 ? this.field7590[arg1 - 1][var10][var7] - 960 : 0;
                }
            }
        }
        field7574++;
        if (arg2 > 0 && arg2 < this.field7582) {
            for (int var8 = arg3 + 1; var8 < (arg3 + arg5); var8++) {
                if (var8 >= 0 && this.field7599 > var8) {
                    this.field7590[arg1][arg2][var8] = this.field7590[arg1][arg2 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < this.field7599) {
            for (int var9 = arg2 + 1; var9 < (arg0 + arg2); var9++) {
                if (var9 >= 0 && this.field7582 > var9) {
                    this.field7590[arg1][var9][arg3] = this.field7590[arg1][var9][arg3 - 1];
                }
            }
        }
        if (arg4 != 3 || arg2 < 0 || arg3 < 0 || this.field7582 <= arg2 || this.field7599 <= arg3) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 <= 0 || this.field7590[arg1][arg2 - 1][arg3] == 0) {
                if (arg3 > 0 && this.field7590[arg1][arg2][arg3 - 1] != 0) {
                    this.field7590[arg1][arg2][arg3] = this.field7590[arg1][arg2][arg3 - 1];
                    return;
                }
                if (arg2 > 0 && arg3 > 0 && this.field7590[arg1][arg2 - 1][arg3 - 1] != 0) {
                    this.field7590[arg1][arg2][arg3] = this.field7590[arg1][arg2 - 1][arg3 - 1];
                    return;
                }
                return;
            }
            this.field7590[arg1][arg2][arg3] = this.field7590[arg1][arg2 - 1][arg3];
        } else if (arg2 <= 0 || this.field7590[arg1 - 1][arg2 - 1][arg3] == this.field7590[arg1][arg2 - 1][arg3]) {
            if (arg3 > 0 && this.field7590[arg1 - 1][arg2][arg3 - 1] != this.field7590[arg1][arg2][arg3 - 1]) {
                this.field7590[arg1][arg2][arg3] = this.field7590[arg1][arg2][arg3 - 1];
                return;
            }
            if (arg2 > 0 && arg3 > 0 && this.field7590[arg1][arg2 - 1][arg3 - 1] != this.field7590[arg1 - 1][arg2 - 1][arg3 - 1]) {
                this.field7590[arg1][arg2][arg3] = this.field7590[arg1][arg2 - 1][arg3 - 1];
                return;
            }
        } else {
            this.field7590[arg1][arg2][arg3] = this.field7590[arg1][arg2 - 1][arg3];
            return;
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Ls;[[IILs;Ls;ILha;)V", line = 1344)
    private final void method3228(class358 arg0, int[][] arg1, int arg2, class358 arg3, class358 arg4, int arg5, class570 arg6) {
        if (arg5 != 1) {
            this.field7578 = null;
        }
        field7581++;
        byte[][] var8 = this.field7576[arg2];
        byte[][] var9 = this.field7598[arg2];
        byte[][] var10 = this.field7578[arg2];
        byte[][] var11 = this.field7586[arg2];
        for (int var12 = 0; var12 < this.field7582; var12++) {
            int var13 = (this.field7582 - 1) > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field7599; var14++) {
                int var15 = var14 < (this.field7599 - 1) ? var14 + 1 : var14;
                if (class47.field547 == -1 || class408.method2373(class47.field547, 16, var14, var12, arg2)) {
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
                        class363 var26 = var21 == 0 ? null : this.field7600.method1361(4, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class631 var27 = var22 == 0 ? null : this.field7573.method2663(var22 - 1, (byte) -54);
                        class363 var28 = var26;
                        if (var26 != null) {
                            if (var26.field4424 == -1 && var26.field4428 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field4415;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field7582 && this.field7599 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            byte var35 = 0;
                            int var36 = var35 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var34++;
                                var33++;
                            } else {
                                var33--;
                                var34--;
                            }
                            if (var10[var13][var14] == var22) {
                                var33++;
                                var32++;
                            } else {
                                var33--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var32++;
                                var36++;
                            } else {
                                var32--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var34++;
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
                                var37 = arg0.method2060(var14, arg5 ^ 0xFFFFFF89, var12) - arg0.method2060(var15, arg5 ^ 0xFFFFFF8F, var13);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg0.method2060(var14, -91, var13) - arg0.method2060(var15, -106, var12);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 < var38 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class144.field1865[var39] = -1;
                            class640.field8183[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field4415 ? class695.field8912[var19] : class356.field4345[var19];
                        this.method3226(false, var8, this.field7599, this.field7582, var19, var9, var18, var11, arg6, var27, var14, var12, var20, var26);
                        boolean var41 = var26 != null && var26.field4428 != var26.field4424;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class144.field1865[var42] >= 0 && class43.field491[var42] != class24.field209[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class768.method4167(var18[1], class249.method1625(class640.field8183[4], class640.field8183[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class768.method4167(var18[3], class249.method1625(class640.field8183[0], class640.field8183[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class768.method4167(var18[0], class249.method1625(class640.field8183[0], class640.field8183[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class768.method4167(var18[2], class249.method1625(class640.field8183[6], class640.field8183[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var18[0] = var18[1] = false;
                                var19 = var19 == 0 ? 13 : 14;
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
                        int var45;
                        int var46;
                        int[] var47;
                        int[] var48;
                        int[] var49;
                        if (var43) {
                            var45 = var26 == null ? 0 : class1.field4[var19];
                            var46 = var27 == null ? 0 : class422.field5560[var19];
                            var47 = class318.field3972[var19];
                            var48 = class469.field6109[var19];
                            var49 = class761.field10379[var19];
                        } else if (var17) {
                            var48 = class787.field10785[var19];
                            var44 = class92.field1275[var19];
                            var45 = var26 == null ? 0 : class641.field8227[var19];
                            var47 = class488.field6276[var19];
                            var46 = var27 == null ? 0 : class423.field5571[var19];
                            var49 = class633.field8031[var19];
                        } else {
                            var44 = class164.field2173[var19];
                            var49 = class389.field4955[var19];
                            var47 = class576.field7315[var19];
                            var46 = var27 == null ? 0 : class682.field8798[var19];
                            var48 = class37.field415[var19];
                            var45 = var26 == null ? 0 : class392.field5162[var19];
                        }
                        int var50 = var45 + var46;
                        if (var50 <= 0) {
                            class191.method1337(arg2, var12, var14);
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
                            int[] var61 = arg4 == null && arg3 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field4424;
                                var64 = var26.field4417;
                                var63 = var26.field4413;
                                int var65 = class497.method2761(var26, arg5 + 65534, arg6);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var98 = false;
                                    byte var99;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class505.field6460[0] = var47[var51];
                                        class505.field6460[1] = 1;
                                        class505.field6460[2] = var49[var51];
                                        class505.field6460[3] = 1;
                                        class505.field6460[4] = var48[var51];
                                        var99 = 6;
                                        class505.field6460[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class505.field6460[0] = var47[var51];
                                        class505.field6460[1] = 5;
                                        class505.field6460[2] = var49[var51];
                                        class505.field6460[3] = 5;
                                        class505.field6460[4] = var48[var51];
                                        class505.field6460[5] = var49[var51];
                                        var99 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class505.field6460[0] = var47[var51];
                                        class505.field6460[1] = 3;
                                        class505.field6460[2] = var49[var51];
                                        class505.field6460[3] = 3;
                                        class505.field6460[4] = var48[var51];
                                        class505.field6460[5] = var49[var51];
                                        var99 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class505.field6460[0] = var47[var51];
                                        class505.field6460[1] = 7;
                                        class505.field6460[2] = var49[var51];
                                        class505.field6460[3] = 7;
                                        class505.field6460[4] = var48[var51];
                                        class505.field6460[5] = var49[var51];
                                        var99 = 6;
                                    } else {
                                        class505.field6460[0] = var47[var51];
                                        class505.field6460[1] = var48[var51];
                                        var99 = 3;
                                        class505.field6460[2] = var49[var51];
                                    }
                                    for (int var100 = 0; var100 < var99; var100++) {
                                        int var101 = class505.field6460[var100];
                                        int var102 = var101 - (var20 * 2) & 0x7;
                                        int var103 = this.field7589[var101];
                                        int var104 = this.field7579[var101];
                                        int var105;
                                        int var106;
                                        if (var20 == 1) {
                                            var105 = 512 - var103;
                                            var106 = var104;
                                        } else if (var20 == 2) {
                                            var105 = 512 - var104;
                                            var106 = 512 - var103;
                                        } else if (var20 == 3) {
                                            var105 = var103;
                                            var106 = 512 - var104;
                                        } else {
                                            var106 = var103;
                                            var105 = var104;
                                        }
                                        var55[var52] = var106;
                                        var56[var52] = var105;
                                        if (var60 != null && class480.field6209[var19][var101]) {
                                            int var107 = (var12 << 9) + var106;
                                            int var108 = (var14 << 9) + var105;
                                            var60[var52] = arg4.method2072((byte) -63, var107, var108) - arg0.method2072((byte) 98, var107, var108);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class480.field6209[var19][var101]) {
                                                int var109 = (var12 << 9) + var106;
                                                int var110 = (var14 << 9) + var105;
                                                var61[var52] = arg0.method2072((byte) -73, var109, var110) - arg4.method2072((byte) -93, var109, var110);
                                            } else if (arg3 != null && !class356.field4343[var19][var101]) {
                                                int var111 = (var12 << 9) + var106;
                                                int var112 = (var14 << 9) + var105;
                                                var61[var52] = arg3.method2072((byte) 76, var111, var112) - arg0.method2072((byte) 98, var111, var112);
                                            }
                                        }
                                        if (var101 < 8 && var26.field4426 < class144.field1865[var102]) {
                                            if (var54 != null) {
                                                var54[var52] = class43.field491[var102];
                                            }
                                            var59[var52] = class289.field3695[var102];
                                            var58[var52] = class55.field714[var102];
                                            var57[var52] = class24.field209[var102];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field4413;
                                            var59[var52] = var26.field4417;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field7571 && arg2 == 0) {
                                    class704.method3814(var12, var14, var26.field4416, var26.field4423 * 8, var26.field4412);
                                }
                                if (var19 != 12 && var26.field4424 != -1 && var26.field4425) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class1.field4[var19];
                            } else if (var17) {
                                var51 += class641.field8227[var19];
                            } else {
                                var51 += class392.field5162[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                class631 var67 = this.field7573.method2663(var22 - 1, (byte) -54);
                                class631 var68 = this.field7573.method2663(var23 - 1, (byte) -54);
                                class631 var69 = this.field7573.method2663(var24 - 1, (byte) -54);
                                class631 var70 = this.field7573.method2663(var25 - 1, (byte) -54);
                                for (int var71 = 0; var71 < var46; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class505.field6460[0] = var47[var51];
                                        class505.field6460[1] = 1;
                                        class505.field6460[2] = var49[var51];
                                        class505.field6460[3] = 1;
                                        class505.field6460[4] = var48[var51];
                                        var73 = 6;
                                        class505.field6460[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class505.field6460[0] = var47[var51];
                                        class505.field6460[1] = 5;
                                        class505.field6460[2] = var49[var51];
                                        class505.field6460[3] = 5;
                                        class505.field6460[4] = var48[var51];
                                        var73 = 6;
                                        class505.field6460[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class505.field6460[0] = var47[var51];
                                        class505.field6460[1] = 3;
                                        class505.field6460[2] = var49[var51];
                                        class505.field6460[3] = 3;
                                        class505.field6460[4] = var48[var51];
                                        class505.field6460[5] = var49[var51];
                                        var73 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class505.field6460[0] = var47[var51];
                                        class505.field6460[1] = 7;
                                        class505.field6460[2] = var49[var51];
                                        class505.field6460[3] = 7;
                                        class505.field6460[4] = var48[var51];
                                        class505.field6460[5] = var49[var51];
                                        var73 = 6;
                                    } else {
                                        class505.field6460[0] = var47[var51];
                                        class505.field6460[1] = var48[var51];
                                        var73 = 3;
                                        class505.field6460[2] = var49[var51];
                                    }
                                    var51++;
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class505.field6460[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field7589[var75];
                                        int var78 = this.field7579[var75];
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
                                        if (var60 != null && class480.field6209[var19][var75]) {
                                            int var81 = (var12 << 9) + var79;
                                            int var82 = (var14 << 9) + var80;
                                            var60[var52] = arg4.method2072((byte) -39, var81, var82) - arg0.method2072((byte) -31, var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class480.field6209[var19][var75]) {
                                                int var83 = (var12 << 9) + var79;
                                                int var84 = (var14 << 9) + var80;
                                                var61[var52] = arg0.method2072((byte) -106, var83, var84) - arg4.method2072((byte) -103, var83, var84);
                                            } else if (arg3 != null && !class356.field4343[var19][var75]) {
                                                int var85 = (var12 << 9) + var79;
                                                int var86 = (var14 << 9) + var80;
                                                var61[var52] = arg3.method2072((byte) 47, var85, var86) - arg0.method2072((byte) 110, var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class144.field1865[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class43.field491[var76];
                                            }
                                            var59[var52] = class289.field3695[var76];
                                            var58[var52] = class55.field714[var76];
                                            var57[var52] = class24.field209[var76];
                                        } else {
                                            if (var17 && class480.field6209[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var79 == 0 && var80 == 0) {
                                                var57[var52] = arg1[var12][var14];
                                                var58[var52] = var67.field8007;
                                                var59[var52] = var67.field8013;
                                            } else if (var79 == 0 && var80 == 512) {
                                                var57[var52] = arg1[var12][var15];
                                                var58[var52] = var68.field8007;
                                                var59[var52] = var68.field8013;
                                            } else if (var79 == 512 && var80 == 512) {
                                                var57[var52] = arg1[var13][var15];
                                                var58[var52] = var69.field8007;
                                                var59[var52] = var69.field8013;
                                            } else if (var79 == 512 && var80 == 0) {
                                                var57[var52] = arg1[var13][var14];
                                                var58[var52] = var70.field8007;
                                                var59[var52] = var70.field8013;
                                            } else {
                                                if (var79 >= 256) {
                                                    if (var80 < 256) {
                                                        var58[var52] = var70.field8007;
                                                        var59[var52] = var70.field8013;
                                                    } else {
                                                        var58[var52] = var69.field8007;
                                                        var59[var52] = var69.field8013;
                                                    }
                                                } else if (var80 < 256) {
                                                    var58[var52] = var67.field8007;
                                                    var59[var52] = var67.field8013;
                                                } else {
                                                    var58[var52] = var68.field8007;
                                                    var59[var52] = var68.field8013;
                                                }
                                                int var87 = class728.method3893(var79 << 7 >> 9, arg1[var13][var14], arg5 ^ 0xFFFFB18B, arg1[var12][var14]);
                                                int var88 = class728.method3893(var79 << 7 >> 9, arg1[var13][var15], arg5 ^ 0xFFFFB18B, arg1[var12][var15]);
                                                var57[var52] = class728.method3893(var80 << 7 >> 9, var88, arg5 - 20087, var87);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field8004) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg0.method2060(var14, arg5 ^ 0xFFFFFF8E, var12);
                            int var90 = arg0.method2060(var14, -96, var13);
                            int var91 = arg0.method2060(var15, -100, var13);
                            int var92 = arg0.method2060(var15, arg5 - 120, var12);
                            boolean var93 = class433.method2484(var14, 0, var12);
                            if (var93 && arg2 > 1 || !var93 && arg2 > 0) {
                                boolean var94 = true;
                                if (var27 != null && !var27.field8005) {
                                    var94 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var94 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field4427) {
                                    var94 = false;
                                }
                                if (var94 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field7594[arg2][var12][var14] = (byte) class77.method473(this.field7594[arg2][var12][var14], 4);
                                }
                            }
                            int var95 = 0;
                            int var96 = 0;
                            int var97 = 0;
                            if (this.field7571) {
                                var95 = class596.method3215(var12, var14);
                                var96 = class415.method2398(var12, var14);
                                var97 = class627.method3352(var12, var14);
                            }
                            arg0.method2070(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var95, var96, var97, var16);
                            class191.method1337(arg2, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(ZLha;Ls;Ls;)V", line = 2216)
    public final void method3229(boolean arg0, class570 arg1, class358 arg2, class358 arg3) {
        field7592++;
        int[][] var5 = new int[this.field7582][this.field7599];
        if (class504.field6457 == null || class504.field6457.length != this.field7599) {
            class504.field6457 = new int[this.field7599];
            class218.field2967 = new int[this.field7599];
            class609.field7701 = new int[this.field7599];
            class382.field4771 = new int[this.field7599];
            class390.field4981 = new int[this.field7599];
        }
        for (int var6 = 0; var6 < this.field7591; var6++) {
            for (int var8 = 0; var8 < this.field7599; var8++) {
                class504.field6457[var8] = 0;
                class390.field4981[var8] = 0;
                class218.field2967[var8] = 0;
                class609.field7701[var8] = 0;
                class382.field4771[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field7582; var9++) {
                for (int var10 = 0; var10 < this.field7599; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field7582) {
                        int var20 = this.field7578[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class631 var21 = this.field7573.method2663(var20 - 1, (byte) -54);
                            class504.field6457[var10] += var21.field8001;
                            class390.field4981[var10] += var21.field8010;
                            class218.field2967[var10] += var21.field8008;
                            class609.field7701[var10] += var21.field8006;
                            var10002 = class382.field4771[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field7578[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class631 var24 = this.field7573.method2663(var23 - 1, (byte) -54);
                            class504.field6457[var10] -= var24.field8001;
                            class390.field4981[var10] -= var24.field8010;
                            class218.field2967[var10] -= var24.field8008;
                            class609.field7701[var10] -= var24.field8006;
                            var10002 = class382.field4771[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field7599; var16++) {
                        int var17 = var16 + 5;
                        if (this.field7599 > var17) {
                            var13 += class218.field2967[var17];
                            var12 += class390.field4981[var17];
                            var11 += class504.field6457[var17];
                            var15 += class382.field4771[var17];
                            var14 += class609.field7701[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var15 -= class382.field4771[var18];
                            var12 -= class390.field4981[var18];
                            var14 -= class609.field7701[var18];
                            var13 -= class218.field2967[var18];
                            var11 -= class504.field6457[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class382.method2192(var11 * 256 / var14, var13 / var15, var12 / var15, (byte) -57);
                        }
                    }
                }
            }
            if (class549.field6887) {
                this.method3228(class116.field1542[var6], var5, var6, var6 == 0 ? arg2 : null, var6 == 0 ? arg3 : null, 1, arg1);
            } else {
                this.method3218(var6 == 0 ? arg2 : null, var5, class116.field1542[var6], arg1, var6, var6 == 0 ? arg3 : null, (byte) -121);
            }
            this.field7578[var6] = null;
            this.field7586[var6] = null;
            this.field7576[var6] = null;
            this.field7598[var6] = null;
        }
        if (!this.field7571) {
            if (class411.field5452 != 0) {
                class757.method4119();
            }
            if (class186.field2610) {
                class343.method1993();
            }
        }
        if (arg0) {
            for (int var7 = 0; var7 < this.field7591; var7++) {
                class116.field1542[var7].method2066();
            }
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIZILmc;IIIIIZ)V", line = 2396)
    private final void method3230(int arg0, int arg1, boolean arg2, int arg3, class234 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        if (arg6 == 1) {
            arg1 = 1;
        } else if (arg6 == 2) {
            arg1 = 1;
            arg0 = 1;
        } else if (arg6 == 3) {
            arg0 = 1;
        }
        field7601++;
        if (arg3 >= 0 && arg3 < this.field7582 && arg8 >= 0 && this.field7599 > arg8) {
            if (!this.field7571 && !arg10) {
                class410.field5439[arg5][arg3][arg8] = 0;
            }
            while (true) {
                int var12 = arg4.method1509(true);
                if (var12 == 0) {
                    if (this.field7571) {
                        this.field7590[0][arg0 + arg3][arg1 + arg8] = 0;
                    } else if (arg5 == 0) {
                        this.field7590[0][arg0 + arg3][arg1 + arg8] = -class615.method3292(false, arg9 + 556238, arg7 + 932731) * 8 << 2;
                    } else {
                        this.field7590[arg5][arg0 + arg3][arg8 + arg1] = this.field7590[arg5 - 1][arg0 + arg3][arg1 + arg8] - 960;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg4.method1509(true);
                    if (this.field7571) {
                        this.field7590[0][arg3 + arg0][arg1 + arg8] = var13 * 8 << 2;
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg5 == 0) {
                            this.field7590[0][arg3 + arg0][arg1 + arg8] = -var13 * 8 << 2;
                        } else {
                            this.field7590[arg5][arg3 + arg0][arg1 + arg8] = this.field7590[arg5 - 1][arg0 + arg3][arg1 + arg8] - (var13 * 8 << 2);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg10) {
                        arg4.method1509(true);
                    } else {
                        this.field7586[arg5][arg3][arg8] = arg4.method1554(27806);
                        this.field7576[arg5][arg3][arg8] = (byte) ((var12 - 2) / 4);
                        this.field7598[arg5][arg3][arg8] = (byte) class249.method1625(var12 + arg6 - 2, 3);
                    }
                } else if (var12 <= 81) {
                    if (!this.field7571 && !arg10) {
                        class410.field5439[arg5][arg3][arg8] = (byte) (var12 - 49);
                    }
                } else if (!arg10) {
                    this.field7578[arg5][arg3][arg8] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg4.method1509(true);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg4.method1509(true);
                    break;
                }
                if (var14 <= 49) {
                    arg4.method1509(true);
                }
            }
        }
        if (arg2) {
            this.field7599 = 97;
        }
    }
}
