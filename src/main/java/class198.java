import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class198 extends class412 {

    @OriginalMember(owner = "client!se", name = "I", descriptor = "[I")
    public static int[] field2588 = new int[14];

    @OriginalMember(owner = "client!se", name = "O", descriptor = "Lim;")
    public static class353 field2594 = new class353(110, 6);

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public static int field2595 = 0;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "Ljn;")
    public static class491 field2596 = new class491();

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII[I[II[[ZIBILrt;)V")
    private final void method1263(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, boolean[][] arg7, int arg8, byte arg9, int arg10, class169 arg11) {
        ++field2585;
        int var13 = (-arg0 + arg1) * arg3 / 256;
        if (arg9 <= 95) {
            method1266((String) null, -60);
        }
        int var14 = arg3 >> 8;
        arg11.field2136 = false;
        arg11.field2143 = false;
        int var15 = arg10;
        int var16 = arg2 - -var13;
        for (int var17 = arg6; var17 < arg8; ++var17) {
            for (int var18 = arg0; arg1 > var18; ++var18) {
                if (arg7[-arg6 + var17][-arg0 + var18]) {
                    if (super.field5668[var17][var18] != null) {
                        class531 var34 = super.field5668[var17][var18];
                        if (~var34.field7413 != 0 && (2 & var34.field7417) == 0 && ~var34.field7414 == 0) {
                            int var35 = super.field5656.method3720(var34.field7413);
                            arg11.method1014(var16 - var14, -var14 + var16, var16, var14 + var15, var15, var14 + var15, class494.method2775(var35, 31745, var34.field7419 & 65535), class494.method2775(var35, 31745, 65535 & var34.field7416), class494.method2775(var35, 31745, 65535 & var34.field7418));
                            arg11.method1014(var16, var16, -var14 + var16, var15, var15 - -var14, var15, class494.method2775(var35, 31745, var34.field7415 & 65535), class494.method2775(var35, 31745, 65535 & var34.field7418), class494.method2775(var35, 31745, 65535 & var34.field7416));
                        } else if (~var34.field7414 != 0) {
                            int var36 = var34.field7414;
                            arg11.method1014(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, var36, var36, var36);
                            arg11.method1014(var16, var16, -var14 + var16, var15, var14 + var15, var15, var36, var36, var36);
                        } else {
                            arg11.method1014(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, var34.field7419 & 65535, 65535 & var34.field7416, 65535 & var34.field7418);
                            arg11.method1014(var16, var16, var16 - var14, var15, var14 + var15, var15, var34.field7415 & 65535, var34.field7418 & 65535, var34.field7416 & 65535);
                        }
                    } else if (super.field5673[var17][var18] != null) {
                        class13 var19 = super.field5673[var17][var18];
                        for (int var20 = 0; var20 < var19.field134; ++var20) {
                            arg5[var20] = var19.field130[var20] * var14 / super.field7582 + var15;
                            arg4[var20] = -(var19.field132[var20] * var14 / super.field7582) + var16;
                        }
                        for (int var21 = 0; ~var19.field128 < ~var21; ++var21) {
                            short var22 = var19.field133[var21];
                            short var23 = var19.field135[var21];
                            short var24 = var19.field126[var21];
                            int var25 = arg5[var22];
                            int var26 = arg5[var23];
                            int var27 = arg5[var24];
                            int var28 = arg4[var22];
                            int var29 = arg4[var23];
                            int var30 = arg4[var24];
                            if (var19.field125 != null && ~var19.field125[var21] != 0) {
                                int var31 = var19.field125[var21];
                                arg11.method1014(var28, var29, var30, var25, var26, var27, class494.method2775(var31, 31745, var19.field127[var22]), class494.method2775(var31, 31745, var19.field127[var23]), class494.method2775(var31, 31745, var19.field127[var24]));
                            } else if (var19.field131 != null && ~var19.field131[var21] != 0) {
                                int var32 = super.field5656.method3720(var19.field131[var21]);
                                arg11.method1014(var28, var29, var30, var25, var26, var27, class494.method2775(var32, 31745, var19.field127[var22]), class494.method2775(var32, 31745, var19.field127[var23]), class494.method2775(var32, 31745, var19.field127[var24]));
                            } else {
                                int var33 = var19.field129[var21];
                                arg11.method1014(var28, var29, var30, var25, var26, var27, class494.method2775(var33, 31745, var19.field127[var22]), class494.method2775(var33, 31745, var19.field127[var23]), class494.method2775(var33, 31745, var19.field127[var24]));
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var16 = arg2 + var13;
            var15 += var14;
        }
        arg11.field2136 = true;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lrt;II[II[[ZIII[III)V")
    private final void method1264(class169 arg0, int arg1, int arg2, int[] arg3, int arg4, boolean[][] arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11) {
        ++field2587;
        int var13 = (-arg2 + arg8) * arg10 / 256;
        int var14 = arg10 >> 8;
        arg0.field2136 = false;
        arg0.field2143 = false;
        int var15 = arg11;
        int var16 = arg4 + var13;
        if (arg1 != 0) {
            field2596 = null;
        }
        for (int var17 = arg6; var17 < arg7; ++var17) {
            for (int var18 = arg2; ~var18 > ~arg8; ++var18) {
                if (arg5[var17 - arg6][-arg2 + var18]) {
                    if (super.field5671[var17][var18] != null) {
                        class574 var19 = super.field5671[var17][var18];
                        if (~var19.field8014 != 0 && (2 & var19.field8020) == 0 && ~var19.field8011 == -1) {
                            int var20 = super.field5656.method3720(var19.field8014);
                            arg0.method1014(-var14 + var16, var16 - var14, var16, var15 - -var14, var15, var14 + var15, class494.method2775(var20, 31745, var19.field8019), class494.method2775(var20, 31745, var19.field8016), class494.method2775(var20, 31745, var19.field8012));
                            arg0.method1014(var16, var16, var16 - var14, var15, var15 - -var14, var15, class494.method2775(var20, 31745, var19.field8018), class494.method2775(var20, 31745, var19.field8012), class494.method2775(var20, 31745, var19.field8016));
                        } else if (var19.field8011 != 0) {
                            int var21 = var19.field8011;
                            arg0.method1007(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, class93.method508(-16777216 & var19.field8019, var21, (byte) -44), class93.method508(var19.field8016 & -16777216, var21, (byte) -44), class93.method508(var19.field8012 & -16777216, var21, (byte) -44));
                            arg0.method1007(var16, var16, -var14 + var16, var15, var14 + var15, var15, class93.method508(-16777216 & var19.field8018, var21, (byte) -44), class93.method508(var19.field8012 & -16777216, var21, (byte) -44), class93.method508(var19.field8016 & -16777216, var21, (byte) -44));
                        } else {
                            arg0.method1007(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, var19.field8019, var19.field8016, var19.field8012);
                            arg0.method1007(var16, var16, -var14 + var16, var15, var14 + var15, var15, var19.field8018, var19.field8012, var19.field8016);
                        }
                    } else if (super.field5658[var17][var18] != null) {
                        class472 var22 = super.field5658[var17][var18];
                        for (int var23 = 0; ~var22.field6690 < ~var23; ++var23) {
                            arg3[var23] = var22.field6688[var23] * var14 / super.field7582 + var15;
                            arg9[var23] = -(var22.field6683[var23] * var14 / super.field7582) + var16;
                        }
                        for (int var24 = 0; ~var24 > ~var22.field6686; ++var24) {
                            int var25 = var24 * 3;
                            int var26 = var25 + 1;
                            int var27 = var26 + 1;
                            int var28 = arg3[var25];
                            int var29 = arg3[var26];
                            int var30 = arg3[var27];
                            int var31 = arg9[var25];
                            int var32 = arg9[var26];
                            int var33 = arg9[var27];
                            if (var22.field6681 != null && ~var22.field6681[var24] != -1 && (var22.field6687 == null || var22.field6687 != null && ~var22.field6687[var24] == 0)) {
                                int var34 = var22.field6681[var24];
                                arg0.method1007(var31, var32, var33, var28, var29, var30, class93.method508(-(var22.field6684[var25] & -16777216) + -16777216, var34, (byte) -44), class93.method508(-(-16777216 & var22.field6684[var26]) + -16777216, var34, (byte) -44), class93.method508(-16777216 - (-16777216 & var22.field6684[var27]), var34, (byte) -44));
                            } else if (var22.field6687 != null && ~var22.field6687[var24] != 0) {
                                int var35 = super.field5656.method3720(var22.field6687[var24]);
                                arg0.method1014(var31, var32, var33, var28, var29, var30, var35, var35, var35);
                            } else {
                                arg0.method1007(var31, var32, var33, var28, var29, var30, var22.field6684[var25], var22.field6684[var26], var22.field6684[var27]);
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var16 = arg4 + var13;
            var15 += var14;
        }
        arg0.field2136 = true;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZLrt;[I[I[IZ)V")
    private final void method1265(int arg0, int arg1, boolean arg2, class169 arg3, int[] arg4, int[] arg5, int[] arg6, boolean arg7) {
        if (arg7) {
            this.method1268((int[]) null, 29, (int[]) null, -93, (class169) null, (int[]) null, 57);
        }
        ++field2590;
        class574 var9 = super.field5671[arg0][arg1];
        if (var9 != null) {
            if ((var9.field8020 & 2) == 0) {
                int var10 = super.field7582 * arg0;
                int var11 = var10 - -super.field7582;
                int var12 = super.field7582 * arg1;
                int var13 = super.field7582 + var12;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                int var45;
                if ((1 & var9.field8020) != 0 && !arg2) {
                    int var18 = super.field5677[arg0][arg1];
                    if (super.field5657 != -1) {
                        var19 = super.field5657;
                        var20 = super.field5657;
                        var21 = super.field5657;
                        var22 = super.field5657;
                    } else {
                        int var23 = super.field5663 * var18;
                        var22 = super.field5661 - -(super.field5672 * var12 + super.field5660 * var10 + var23 >> 14);
                        if (super.field5656.field9379 >= var22) {
                            return;
                        }
                        var21 = (super.field5660 * var11 + var23 - -(super.field5672 * var12) >> 14) + super.field5661;
                        if (super.field5656.field9379 >= var21) {
                            return;
                        }
                        var20 = (super.field5660 * var11 + super.field5672 * var13 + var23 >> 14) + super.field5661;
                        if (var20 <= super.field5656.field9379) {
                            return;
                        }
                        var19 = (super.field5672 * var13 + super.field5660 * var10 - -var23 >> 14) + super.field5661;
                        if (var19 <= super.field5656.field9379) {
                            return;
                        }
                    }
                    if (super.field5656.field9389) {
                        int var24 = -super.field5656.field9400 + var22;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = -super.field5656.field9400 + var21;
                        if (~var25 < -1) {
                            var15 = var25;
                            if (~var25 < -256) {
                                var15 = 255;
                            }
                        }
                        int var26 = -super.field5656.field9400 + var20;
                        if (var26 > 0) {
                            var16 = var26;
                            if (~var26 < -256) {
                                var16 = 255;
                            }
                        }
                        int var27 = -super.field5656.field9400 + var19;
                        if (~var27 < -1) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                    }
                    int var28 = super.field5667 * var18;
                    int var29 = super.field5670 * var18;
                    var30 = super.field5665 - -(super.field5669 * var10 + (var28 - -(super.field5666 * var12)) >> 14);
                    var31 = super.field5656.field9374 * var30 / var22 + arg3.field2135;
                    var32 = (super.field5659 * var12 + super.field5676 * var10 + var29 >> 14) + super.field5674;
                    var33 = (super.field5669 * var11 + super.field5666 * var12 + var28 >> 14) + super.field5665;
                    var34 = super.field5656.field9399 * var32 / var22 + arg3.field2139;
                    var35 = (super.field5676 * var11 + (var29 - -(super.field5659 * var12)) >> 14) + super.field5674;
                    var36 = arg3.field2135 - -(super.field5656.field9374 * var33 / var21);
                    var37 = (super.field5669 * var11 + super.field5666 * var13 + var28 >> 14) + super.field5665;
                    var38 = super.field5656.field9399 * var35 / var21 + arg3.field2139;
                    var39 = (super.field5659 * var13 + super.field5676 * var11 + var29 >> 14) + super.field5674;
                    var40 = super.field5656.field9374 * var37 / var20 + arg3.field2135;
                    var41 = arg3.field2139 - -(super.field5656.field9399 * var39 / var20);
                    var42 = (super.field5669 * var10 + super.field5666 * var13 + var28 >> 14) + super.field5665;
                    var43 = super.field5656.field9374 * var42 / var19 + arg3.field2135;
                    var44 = (super.field5659 * var13 + super.field5676 * var10 + var29 >> 14) + super.field5674;
                    var45 = arg3.field2139 - -(super.field5656.field9399 * var44 / var19);
                } else {
                    int var46 = super.field5677[arg0][arg1];
                    int var47 = super.field5677[arg0 + 1][arg1];
                    int var48 = super.field5677[arg0 + 1][arg1 + 1];
                    int var49 = super.field5677[arg0][arg1 + 1];
                    if (~super.field5657 != 0) {
                        var19 = super.field5657;
                        var20 = super.field5657;
                        var21 = super.field5657;
                        var22 = super.field5657;
                    } else {
                        var22 = (super.field5672 * var12 + super.field5663 * var46 + super.field5660 * var10 >> 14) + super.field5661;
                        if (var22 <= super.field5656.field9379) {
                            return;
                        }
                        var21 = (super.field5672 * var12 + (super.field5660 * var11 - -(super.field5663 * var47)) >> 14) + super.field5661;
                        if (var21 <= super.field5656.field9379) {
                            return;
                        }
                        var20 = (super.field5672 * var13 + super.field5663 * var48 + super.field5660 * var11 >> 14) + super.field5661;
                        if (~super.field5656.field9379 <= ~var20) {
                            return;
                        }
                        var19 = (super.field5663 * var49 + super.field5660 * var10 - -(super.field5672 * var13) >> 14) + super.field5661;
                        if (var19 <= super.field5656.field9379) {
                            return;
                        }
                    }
                    if (!arg2) {
                        if (super.field5656.field9389) {
                            int var50 = -super.field5656.field9400 + var22;
                            if (var50 > 0) {
                                var14 = var50;
                                if (~var50 < -256) {
                                    var14 = 255;
                                }
                            }
                            int var51 = -super.field5656.field9400 + var21;
                            if (~var51 < -1) {
                                var15 = var51;
                                if (~var51 < -256) {
                                    var15 = 255;
                                }
                            }
                            int var52 = -super.field5656.field9400 + var20;
                            if (var52 > 0) {
                                var16 = var52;
                                if (var52 > 255) {
                                    var16 = 255;
                                }
                            }
                            int var53 = -super.field5656.field9400 + var19;
                            if (~var53 < -1) {
                                var17 = var53;
                                if (var53 > 255) {
                                    var17 = 255;
                                }
                            }
                        }
                    } else {
                        int var54 = -super.field5656.field9400 + var22;
                        if (var54 > 255) {
                            var54 = 255;
                        }
                        if (~var54 < -1) {
                            var14 = var54;
                            int var55 = var9.field8015 * var54 / 255;
                            if (var55 > 0) {
                                var46 -= var55;
                            }
                        }
                        int var56 = -super.field5656.field9400 + var21;
                        if (var56 > 255) {
                            var56 = 255;
                        }
                        if (var56 > 0) {
                            var15 = var56;
                            int var57 = var9.field8013 * var56 / 255;
                            if (var57 > 0) {
                                var47 -= var57;
                            }
                        }
                        int var58 = -super.field5656.field9400 + var20;
                        if (var58 > 255) {
                            var58 = 255;
                        }
                        if (var58 > 0) {
                            var16 = var58;
                            int var59 = var9.field8021 * var58 / 255;
                            if (var59 > 0) {
                                var48 -= var59;
                            }
                        }
                        int var60 = -super.field5656.field9400 + var19;
                        if (~var60 < -256) {
                            var60 = 255;
                        }
                        if (~var60 < -1) {
                            var17 = var60;
                            int var61 = var9.field8017 * var60 / 255;
                            if (var61 > 0) {
                                var49 -= var61;
                            }
                        }
                    }
                    var30 = (super.field5666 * var12 + super.field5669 * var10 + super.field5667 * var46 >> 14) + super.field5665;
                    var32 = (super.field5676 * var10 - (-(super.field5670 * var46) - super.field5659 * var12) >> 14) + super.field5674;
                    var31 = super.field5656.field9374 * var30 / var22 + arg3.field2135;
                    var34 = super.field5656.field9399 * var32 / var22 + arg3.field2139;
                    var33 = (super.field5666 * var12 + super.field5669 * var11 + super.field5667 * var47 >> 14) + super.field5665;
                    var35 = super.field5674 - -(super.field5676 * var11 + super.field5670 * var47 + super.field5659 * var12 >> 14);
                    var36 = super.field5656.field9374 * var33 / var21 + arg3.field2135;
                    var38 = arg3.field2139 - -(super.field5656.field9399 * var35 / var21);
                    var37 = (super.field5666 * var13 + super.field5669 * var11 + super.field5667 * var48 >> 14) + super.field5665;
                    var39 = (super.field5670 * var48 + super.field5676 * var11 + super.field5659 * var13 >> 14) + super.field5674;
                    var40 = super.field5656.field9374 * var37 / var20 + arg3.field2135;
                    var42 = (super.field5669 * var10 + super.field5667 * var49 - -(super.field5666 * var13) >> 14) + super.field5665;
                    var41 = arg3.field2139 - -(super.field5656.field9399 * var39 / var20);
                    var43 = super.field5656.field9374 * var42 / var19 + arg3.field2135;
                    var44 = (super.field5659 * var13 + super.field5676 * var10 + super.field5670 * var49 >> 14) + super.field5674;
                    var45 = super.field5656.field9399 * var44 / var19 + arg3.field2139;
                }
                boolean var62 = var9.field8014 != -1 && this.method2460(super.field5656.field2114.method2151(true, var9.field8014).field620);
                int var63 = var15 + var17 - -var16;
                if ((-var43 + var40) * (-var45 + var38) + -((-var43 + var36) * (-var45 + var41)) > 0) {
                    arg3.field2142 = ~var40 > -1 || var43 < 0 || ~var36 > -1 || var40 > arg3.field2141 || ~arg3.field2141 > ~var43 || arg3.field2141 < var36;
                    if (var63 < 765) {
                        if (var62) {
                            arg3.field2144 = 100;
                        }
                        if (~var63 < -1) {
                            if (~var9.field8014 > -1) {
                                arg3.method1007(var41, var45, var38, var40, var43, var36, class93.method508(super.field5656.field9387 | var16 << 24, var9.field8019, (byte) -44), class93.method508(var17 << 24 | super.field5656.field9387, var9.field8016, (byte) -44), class93.method508(super.field5656.field9387 | var15 << 24, var9.field8012, (byte) -44));
                            } else {
                                arg3.method1019(var41, var45, var38, var40, var43, var36, super.field5656.field9387, var16, var17, var15, var9.field8019, var9.field8016, var9.field8012, var37, var42, var33, var39, var44, var35, var20, var19, var21, var9.field8014);
                            }
                        } else if (var9.field8014 >= 0) {
                            arg3.method1011(var41, var45, var38, var40, var43, var36, var9.field8019, var9.field8016, var9.field8012, var37, var42, var33, var39, var44, var35, var20, var19, var21, var9.field8014);
                        } else {
                            arg3.method1007(var41, var45, var38, var40, var43, var36, var9.field8019, var9.field8016, var9.field8012);
                        }
                        arg3.field2144 = 0;
                    } else {
                        arg3.method1008(var41, var45, var38, var40, var43, var36, super.field5656.field9387);
                    }
                }
                int var64 = var15 + var17 + var14;
                if (~((var31 - var36) * (-var38 + var45) + -((-var36 + var43) * (-var38 + var34))) < -1) {
                    arg3.field2142 = var31 < 0 || var36 < 0 || var43 < 0 || arg3.field2141 < var31 || ~var36 < ~arg3.field2141 || var43 > arg3.field2141;
                    if (~var64 > -766) {
                        if (var62) {
                            arg3.field2144 = 100;
                        }
                        if (var64 <= 0) {
                            if (~var9.field8014 <= -1) {
                                arg3.method1011(var34, var38, var45, var31, var36, var43, var9.field8018, var9.field8012, var9.field8016, var30, var33, var42, var32, var35, var44, var22, var21, var19, var9.field8014);
                            } else {
                                arg3.method1007(var34, var38, var45, var31, var36, var43, var9.field8018, var9.field8012, var9.field8016);
                            }
                        } else if (~var9.field8014 <= -1) {
                            arg3.method1019(var34, var38, var45, var31, var36, var43, super.field5656.field9387, var14, var15, var17, var9.field8018, var9.field8012, var9.field8016, var30, var33, var42, var32, var35, var44, var22, var21, var19, var9.field8014);
                        } else {
                            arg3.method1007(var34, var38, var45, var31, var36, var43, class93.method508(super.field5656.field9387 | var14 << 24, var9.field8018, (byte) -44), class93.method508(super.field5656.field9387 | var15 << 24, var9.field8012, (byte) -44), class93.method508(super.field5656.field9387 | var17 << 24, var9.field8016, (byte) -44));
                        }
                        arg3.field2144 = 0;
                        return;
                    }
                    arg3.method1008(var34, var38, var45, var31, var36, var43, super.field5656.field9387);
                }
            }
        } else {
            class472 var65 = super.field5658[arg0][arg1];
            if (var65 != null) {
                if (super.field5657 == -1) {
                    for (int var66 = 0; var66 < var65.field6690; ++var66) {
                        int var67 = var65.field6688[var66] - -(arg0 << super.field7583);
                        int var68 = var65.field6682[var66];
                        int var69 = var65.field6683[var66] - -(arg1 << super.field7583);
                        int var70 = (super.field5663 * var68 + super.field5672 * var69 + super.field5660 * var67 >> 14) + super.field5661;
                        if (super.field5656.field9379 >= var70) {
                            return;
                        }
                        arg4[var66] = 0;
                        if (arg2) {
                            int var71 = -super.field5656.field9400 + var70;
                            if (~var71 < -256) {
                                var71 = 255;
                            }
                            if (var71 > 0) {
                                arg4[var66] = var71;
                                int var72 = var65.field6685[var66] * var71 / 255;
                                if (var72 > 0) {
                                    var68 -= var72;
                                }
                            }
                        } else if (super.field5656.field9389) {
                            int var73 = -super.field5656.field9400 + var70;
                            if (var73 > 0) {
                                arg4[var66] = var73;
                                if (arg4[var66] > 255) {
                                    arg4[var66] = 255;
                                }
                            }
                        }
                        int var74 = (super.field5666 * var69 + super.field5669 * var67 + super.field5667 * var68 >> 14) + super.field5665;
                        int var75 = (super.field5676 * var67 + super.field5670 * var68 + super.field5659 * var69 >> 14) + super.field5674;
                        arg5[var66] = super.field5656.field9374 * var74 / var70 + arg3.field2135;
                        arg6[var66] = super.field5656.field9399 * var75 / var70 + arg3.field2139;
                    }
                } else {
                    for (int var76 = 0; var76 < var65.field6690; ++var76) {
                        int var116 = var65.field6688[var76] - -(arg0 << super.field7583);
                        int var117 = var65.field6682[var76];
                        int var118 = (arg1 << super.field7583) + var65.field6683[var76];
                        arg4[var76] = 0;
                        if (!arg2) {
                            if (super.field5656.field9389) {
                                int var119 = super.field5657 - super.field5656.field9400;
                                if (~var119 < -1) {
                                    arg4[var76] = var119;
                                    if (arg4[var76] > 255) {
                                        arg4[var76] = 255;
                                    }
                                }
                            }
                        } else {
                            int var120 = super.field5657 - super.field5656.field9400;
                            if (~var120 < -256) {
                                var120 = 255;
                            }
                            if (~var120 < -1) {
                                arg4[var76] = var120;
                                int var121 = var65.field6685[var76] * var120 / 255;
                                if (var121 > 0) {
                                    var117 -= var121;
                                }
                            }
                        }
                        int var122 = super.field5665 - -(super.field5669 * var116 + (super.field5667 * var117 - -(super.field5666 * var118)) >> 14);
                        int var123 = (super.field5659 * var118 + super.field5676 * var116 + super.field5670 * var117 >> 14) + super.field5674;
                        arg5[var76] = super.field5656.field9374 * var122 / super.field5657 + arg3.field2135;
                        arg6[var76] = super.field5656.field9399 * var123 / super.field5657 + arg3.field2139;
                    }
                }
                if (var65.field6687 != null) {
                    int var77 = super.field5677[arg0][arg1];
                    int var78 = super.field5677[arg0 + 1][arg1];
                    int var79 = super.field5677[arg0][arg1 + 1];
                    int var80 = super.field7582 * arg0;
                    int var81 = super.field7582 + var80;
                    int var82 = super.field7582 * arg1;
                    int var83 = super.field7582 + var82;
                    int var84 = (super.field5669 * var80 + super.field5666 * var82 - -(super.field5667 * var77) >> 14) + super.field5665;
                    int var85 = super.field5674 - -(super.field5676 * var80 + super.field5659 * var82 - -(super.field5670 * var77) >> 14);
                    int var86 = (super.field5663 * var77 + super.field5660 * var80 - -(super.field5672 * var82) >> 14) + super.field5661;
                    int var87 = (super.field5666 * var82 + super.field5669 * var81 + super.field5667 * var78 >> 14) + super.field5665;
                    int var88 = super.field5674 - -(super.field5659 * var82 + (super.field5676 * var81 - -(super.field5670 * var78)) >> 14);
                    int var89 = (super.field5660 * var81 - (-(super.field5672 * var82) + -(super.field5663 * var78)) >> 14) + super.field5661;
                    int var90 = (super.field5666 * var83 + super.field5669 * var80 + super.field5667 * var79 >> 14) + super.field5665;
                    int var91 = super.field5674 - -(super.field5659 * var83 + super.field5676 * var80 + super.field5670 * var79 >> 14);
                    int var92 = super.field5661 - -(super.field5663 * var79 + super.field5660 * var80 - -(super.field5672 * var83) >> 14);
                    for (int var93 = 0; ~var93 > ~var65.field6686; ++var93) {
                        int var94 = var93 * 3;
                        int var95 = var94 + 1;
                        int var96 = var95 + 1;
                        int var97 = arg5[var94];
                        int var98 = arg5[var95];
                        int var99 = arg5[var96];
                        int var100 = arg6[var94];
                        int var101 = arg6[var95];
                        int var102 = arg6[var96];
                        int var103 = arg4[var94] + arg4[var95] + arg4[var96];
                        if (~((-var98 + var97) * (-var101 + var102) + -((-var98 + var99) * (-var101 + var100))) < -1) {
                            arg3.field2142 = var97 < 0 || ~var98 > -1 || ~var99 > -1 || ~arg3.field2141 > ~var97 || ~var98 < ~arg3.field2141 || ~arg3.field2141 > ~var99;
                            short var104 = var65.field6687[var93];
                            if (var103 >= 765) {
                                arg3.method1008(var100, var101, var102, var97, var98, var99, super.field5656.field9387);
                            } else {
                                if (~var104 != 0 && this.method2460(super.field5656.field2114.method2151(true, var104).field620)) {
                                    arg3.field2144 = 100;
                                }
                                if (var103 > 0) {
                                    if (var104 != -1) {
                                        arg3.method1019(var100, var101, var102, var97, var98, var99, super.field5656.field9387, arg4[var94], arg4[var95], arg4[var96], var65.field6684[var94], var65.field6684[var95], var65.field6684[var96], var84, var87, var90, var85, var88, var91, var86, var89, var92, var104);
                                    } else if ((16777215 & var65.field6684[var94]) != 0) {
                                        arg3.method1007(var100, var101, var102, var97, var98, var99, class93.method508(arg4[var94] << 24 | super.field5656.field9387, var65.field6684[var94], (byte) -44), class93.method508(arg4[var95] << 24 | super.field5656.field9387, var65.field6684[var95], (byte) -44), class93.method508(super.field5656.field9387 | arg4[var96] << 24, var65.field6684[var96], (byte) -44));
                                    }
                                } else if (~var104 != 0) {
                                    arg3.method1011(var100, var101, var102, var97, var98, var99, var65.field6684[var94], var65.field6684[var95], var65.field6684[var96], var84, var87, var90, var85, var88, var91, var86, var89, var92, var104);
                                } else if (~(16777215 & var65.field6684[var94]) != -1) {
                                    arg3.method1007(var100, var101, var102, var97, var98, var99, var65.field6684[var94], var65.field6684[var95], var65.field6684[var96]);
                                }
                                arg3.field2144 = 0;
                            }
                        }
                    }
                } else {
                    for (int var105 = 0; ~var105 > ~var65.field6686; ++var105) {
                        int var106 = var105 * 3;
                        int var107 = var106 + 1;
                        int var108 = var107 + 1;
                        int var109 = arg5[var106];
                        int var110 = arg5[var107];
                        int var111 = arg5[var108];
                        int var112 = arg6[var106];
                        int var113 = arg6[var107];
                        int var114 = arg6[var108];
                        int var115 = arg4[var106] + arg4[var107] + arg4[var108];
                        if (~((-var110 + var109) * (-var113 + var114) + -((var112 - var113) * (-var110 + var111))) < -1) {
                            arg3.field2142 = var109 < 0 || ~var110 > -1 || var111 < 0 || ~arg3.field2141 > ~var109 || arg3.field2141 < var110 || arg3.field2141 < var111;
                            if (var115 >= 765) {
                                arg3.method1008(var112, var113, var114, var109, var110, var111, super.field5656.field9387);
                            } else if (~var115 < -1) {
                                if ((16777215 & var65.field6684[var106]) != 0) {
                                    arg3.method1007(var112, var113, var114, var109, var110, var111, class480.method2717(arg4[var106], (byte) -104, var65.field6684[var106], super.field5656.field9387), class480.method2717(arg4[var107], (byte) 115, var65.field6684[var107], super.field5656.field9387), class480.method2717(arg4[var108], (byte) -113, var65.field6684[var108], super.field5656.field9387));
                                }
                            } else if ((var65.field6684[var106] & 16777215) != 0) {
                                arg3.method1007(var112, var113, var114, var109, var110, var111, var65.field6684[var106], var65.field6684[var107], var65.field6684[var108]);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1266(String arg0, int arg1) {
        ++field2593;
        if (!arg0.equals("")) {
            class118.method650(true, class515.field7167);
            if (arg1 < 16) {
                method1266((String) null, 104);
            }
            ++class509.field7090;
            class272.field3457.method3060(class194.method1241(arg0, -128), -25098);
            class272.field3457.method3040(false, arg0);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field2586;
        class567 var9 = (class567) super.field5656.method199(Thread.currentThread());
        class169 var10 = var9.field7928;
        var10.field2144 = 0;
        var10.field2142 = false;
        if (super.field5671 == null) {
            if (super.field5668 != null) {
                this.method1263(arg4, arg6, arg1, arg2, var9.field6856, var9.field6835, arg3, arg7, arg5, (byte) 105, arg0, var10);
                return;
            }
        } else {
            this.method1264(var10, 0, arg4, var9.field6835, arg1, arg7, arg3, arg5, arg6, var9.field6856, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
    public static void method1267(int arg0) {
        field2594 = null;
        if (arg0 == 1713699342) {
            field2596 = null;
            field2588 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([II[IILrt;[II)V")
    private final void method1268(int[] arg0, int arg1, int[] arg2, int arg3, class169 arg4, int[] arg5, int arg6) {
        ++field2592;
        class531 var8 = super.field5668[arg6][arg1];
        if (var8 != null) {
            if (~(var8.field7417 & 2) == -1) {
                int var9 = super.field7582 * arg6;
                int var10 = super.field7582 + var9;
                int var11 = super.field7582 * arg1;
                int var12 = super.field7582 + var11;
                int var17;
                int var18;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                if ((1 & var8.field7417) == 0) {
                    int var13 = super.field5677[arg6][arg1];
                    int var14 = super.field5677[arg6 + 1][arg1];
                    int var15 = super.field5677[arg6 - -1][arg1 + 1];
                    int var16 = super.field5677[arg6][arg1 - -1];
                    int var19;
                    if (super.field5657 == -1) {
                        var17 = (super.field5672 * var11 + (super.field5660 * var9 - -(super.field5663 * var13)) >> 14) + super.field5661;
                        if (~super.field5656.field9379 <= ~var17) {
                            return;
                        }
                        var18 = (super.field5663 * var14 + super.field5672 * var11 + super.field5660 * var10 >> 14) + super.field5661;
                        if (var18 <= super.field5656.field9379) {
                            return;
                        }
                        var19 = (super.field5672 * var12 + super.field5663 * var15 + super.field5660 * var10 >> 14) + super.field5661;
                        if (super.field5656.field9379 >= var19) {
                            return;
                        }
                        var20 = (super.field5672 * var12 + super.field5663 * var16 + super.field5660 * var9 >> 14) + super.field5661;
                        if (super.field5656.field9379 >= var20) {
                            return;
                        }
                    } else {
                        var20 = super.field5657;
                        var19 = super.field5657;
                        var18 = super.field5657;
                        var17 = super.field5657;
                    }
                    var21 = super.field5665 - -(super.field5669 * var9 + super.field5667 * var13 + super.field5666 * var11 >> 14);
                    var22 = super.field5656.field9374 * var21 / var17 + arg4.field2135;
                    var23 = (super.field5659 * var11 + super.field5676 * var9 + super.field5670 * var13 >> 14) + super.field5674;
                    var24 = (super.field5666 * var11 + super.field5669 * var10 + super.field5667 * var14 >> 14) + super.field5665;
                    var25 = super.field5656.field9399 * var23 / var17 + arg4.field2139;
                    var26 = super.field5674 - -(super.field5659 * var11 + super.field5676 * var10 + super.field5670 * var14 >> 14);
                    var27 = super.field5656.field9374 * var24 / var18 + arg4.field2135;
                    int var28 = (super.field5669 * var10 + super.field5666 * var12 - -(super.field5667 * var15) >> 14) + super.field5665;
                    var29 = super.field5656.field9399 * var26 / var18 + arg4.field2139;
                    int var30 = (super.field5659 * var12 + super.field5676 * var10 + super.field5670 * var15 >> 14) + super.field5674;
                    var31 = arg4.field2135 - -(super.field5656.field9374 * var28 / var19);
                    var32 = super.field5656.field9399 * var30 / var19 + arg4.field2139;
                    var33 = (super.field5666 * var12 + super.field5669 * var9 + super.field5667 * var16 >> 14) + super.field5665;
                    var34 = (super.field5659 * var12 + (super.field5676 * var9 - -(super.field5670 * var16)) >> 14) + super.field5674;
                    var35 = super.field5656.field9374 * var33 / var20 + arg4.field2135;
                    var36 = super.field5656.field9399 * var34 / var20 + arg4.field2139;
                } else {
                    int var37 = super.field5677[arg6][arg1];
                    int var38;
                    if (~super.field5657 != 0) {
                        var20 = super.field5657;
                        var38 = super.field5657;
                        var18 = super.field5657;
                        var17 = super.field5657;
                    } else {
                        int var39 = super.field5663 * var37;
                        var17 = (super.field5660 * var9 + var39 - -(super.field5672 * var11) >> 14) + super.field5661;
                        if (var17 <= super.field5656.field9379) {
                            return;
                        }
                        var18 = (super.field5672 * var11 + super.field5660 * var10 + var39 >> 14) + super.field5661;
                        if (~super.field5656.field9379 <= ~var18) {
                            return;
                        }
                        var38 = (super.field5660 * var10 + (var39 - -(super.field5672 * var12)) >> 14) + super.field5661;
                        if (super.field5656.field9379 >= var38) {
                            return;
                        }
                        var20 = super.field5661 - -(super.field5660 * var9 + super.field5672 * var12 + var39 >> 14);
                        if (~var20 >= ~super.field5656.field9379) {
                            return;
                        }
                    }
                    int var40 = super.field5667 * var37;
                    int var41 = super.field5670 * var37;
                    var21 = (super.field5669 * var9 - (-(super.field5666 * var11) + -var40) >> 14) + super.field5665;
                    var23 = (super.field5676 * var9 - -(super.field5659 * var11) + var41 >> 14) + super.field5674;
                    var22 = super.field5656.field9374 * var21 / var17 + arg4.field2135;
                    var25 = super.field5656.field9399 * var23 / var17 + arg4.field2139;
                    var24 = (super.field5669 * var10 + super.field5666 * var11 - -var40 >> 14) + super.field5665;
                    var26 = (super.field5659 * var11 + super.field5676 * var10 + var41 >> 14) + super.field5674;
                    var27 = super.field5656.field9374 * var24 / var18 + arg4.field2135;
                    int var42 = (super.field5669 * var10 + super.field5666 * var12 + var40 >> 14) + super.field5665;
                    var29 = arg4.field2139 - -(super.field5656.field9399 * var26 / var18);
                    int var43 = (super.field5676 * var10 - (-(super.field5659 * var12) + -var41) >> 14) + super.field5674;
                    var31 = super.field5656.field9374 * var42 / var38 + arg4.field2135;
                    var32 = super.field5656.field9399 * var43 / var38 + arg4.field2139;
                    var33 = super.field5665 - -(super.field5669 * var9 - (-(super.field5666 * var12) + -var40) >> 14);
                    var34 = super.field5674 - -(super.field5676 * var9 + var41 - -(super.field5659 * var12) >> 14);
                    var35 = super.field5656.field9374 * var33 / var20 + arg4.field2135;
                    var36 = super.field5656.field9399 * var34 / var20 + arg4.field2139;
                }
                if ((var31 - var35) * (-var36 + var29) + -((-var35 + var27) * (-var36 + var32)) > 0) {
                    arg4.field2142 = ~var31 > -1 || var35 < 0 || var27 < 0 || ~var31 < ~arg4.field2141 || var35 > arg4.field2141 || var27 > arg4.field2141;
                    if (var8.field7413 >= 0) {
                        if (this.method2460(super.field5656.field2114.method2151(true, var8.field7413).field620)) {
                            arg4.field2144 = 100;
                        }
                        arg4.method1011(var32, var36, var29, var31, var35, var27, var8.field7419 & 65535, 65535 & var8.field7416, 65535 & var8.field7418, var21, var24, var33, var23, var26, var34, var17, var18, var20, var8.field7413);
                        arg4.field2144 = 0;
                    } else {
                        arg4.method1014(var32, var36, var29, var31, var35, var27, 65535 & var8.field7419, 65535 & var8.field7416, 65535 & var8.field7418);
                    }
                }
                if ((var22 - var27) * (-var29 + var36) + -((-var27 + var35) * (-var29 + var25)) > 0) {
                    arg4.field2142 = ~var22 > -1 || ~var27 > -1 || var35 < 0 || ~arg4.field2141 > ~var22 || ~arg4.field2141 > ~var27 || ~var35 < ~arg4.field2141;
                    if (~var8.field7413 <= -1) {
                        if (this.method2460(super.field5656.field2114.method2151(true, var8.field7413).field620)) {
                            arg4.field2144 = 100;
                        }
                        arg4.method1011(var25, var29, var36, var22, var27, var35, var8.field7415 & 65535, var8.field7418 & 65535, 65535 & var8.field7416, var21, var24, var33, var23, var26, var34, var17, var18, var20, var8.field7413);
                        arg4.field2144 = 0;
                        return;
                    }
                    arg4.method1014(var25, var29, var36, var22, var27, var35, var8.field7415 & 65535, 65535 & var8.field7418, 65535 & var8.field7416);
                }
            }
        } else {
            if (arg3 != -32170) {
                this.method883(5, -57);
            }
            class13 var44 = super.field5673[arg6][arg1];
            if (var44 != null) {
                if (~super.field5657 != 0) {
                    for (int var45 = 0; var45 < var44.field134; ++var45) {
                        int var46 = var44.field130[var45] - -(arg6 << super.field7583);
                        short var47 = var44.field124[var45];
                        int var48 = var44.field132[var45] - -(arg1 << super.field7583);
                        int var49 = (super.field5666 * var48 + (super.field5669 * var46 - -(super.field5667 * var47)) >> 14) + super.field5665;
                        int var50 = (super.field5670 * var47 + (super.field5676 * var46 - -(super.field5659 * var48)) >> 14) + super.field5674;
                        arg0[var45] = arg4.field2135 - -(super.field5656.field9374 * var49 / super.field5657);
                        arg2[var45] = super.field5656.field9399 * var50 / super.field5657 + arg4.field2139;
                    }
                } else {
                    for (int var51 = 0; var44.field134 > var51; ++var51) {
                        int var91 = (arg6 << super.field7583) + var44.field130[var51];
                        short var92 = var44.field124[var51];
                        int var93 = var44.field132[var51] - -(arg1 << super.field7583);
                        int var94 = (super.field5663 * var92 + super.field5660 * var91 - -(super.field5672 * var93) >> 14) + super.field5661;
                        if (~super.field5656.field9379 <= ~var94) {
                            return;
                        }
                        int var95 = (super.field5670 * var92 + (super.field5676 * var91 - -(super.field5659 * var93)) >> 14) + super.field5674;
                        int var96 = super.field5665 - -(super.field5667 * var92 + super.field5669 * var91 + super.field5666 * var93 >> 14);
                        arg0[var51] = super.field5656.field9374 * var96 / var94 + arg4.field2135;
                        arg2[var51] = super.field5656.field9399 * var95 / var94 + arg4.field2139;
                    }
                }
                if (var44.field131 != null) {
                    int var52 = super.field5677[arg6][arg1];
                    int var53 = super.field5677[arg6 + 1][arg1];
                    int var54 = super.field5677[arg6][arg1 + 1];
                    int var55 = super.field7582 * arg6;
                    int var56 = super.field7582 + var55;
                    int var57 = super.field7582 * arg1;
                    int var58 = super.field7582 + var57;
                    int var59 = (super.field5669 * var55 + super.field5667 * var52 + super.field5666 * var57 >> 14) + super.field5665;
                    int var60 = (super.field5676 * var55 + (super.field5670 * var52 - -(super.field5659 * var57)) >> 14) + super.field5674;
                    int var61 = (super.field5660 * var55 - (-(super.field5672 * var57) + -(super.field5663 * var52)) >> 14) + super.field5661;
                    int var62 = super.field5665 - -(super.field5666 * var57 + (super.field5669 * var56 - -(super.field5667 * var53)) >> 14);
                    int var63 = (super.field5676 * var56 - (-(super.field5670 * var53) - super.field5659 * var57) >> 14) + super.field5674;
                    int var64 = super.field5661 - -(super.field5663 * var53 + super.field5660 * var56 - -(super.field5672 * var57) >> 14);
                    int var65 = (super.field5667 * var54 + (super.field5669 * var55 - -(super.field5666 * var58)) >> 14) + super.field5665;
                    int var66 = (super.field5676 * var55 - -(super.field5670 * var54) - -(super.field5659 * var58) >> 14) + super.field5674;
                    int var67 = (super.field5672 * var58 + (super.field5660 * var55 - -(super.field5663 * var54)) >> 14) + super.field5661;
                    for (int var68 = 0; var68 < var44.field128; ++var68) {
                        short var69 = var44.field133[var68];
                        short var70 = var44.field135[var68];
                        short var71 = var44.field126[var68];
                        int var72 = arg0[var69];
                        int var73 = arg0[var70];
                        int var74 = arg0[var71];
                        int var75 = arg2[var69];
                        int var76 = arg2[var70];
                        int var77 = arg2[var71];
                        if (~((var77 - var76) * (-var73 + var72) - (var74 - var73) * (-var76 + var75)) < -1) {
                            arg4.field2142 = ~var72 > -1 || var73 < 0 || ~var74 > -1 || arg4.field2141 < var72 || var73 > arg4.field2141 || var74 > arg4.field2141;
                            short var78 = var44.field131[var68];
                            if (~var78 == 0) {
                                int var79 = var44.field129[var68];
                                if (var79 != -1) {
                                    arg4.method1014(var75, var76, var77, var72, var73, var74, class494.method2775(var79, 31745, var44.field127[var69]), class494.method2775(var79, 31745, var44.field127[var70]), class494.method2775(var79, 31745, var44.field127[var71]));
                                }
                            } else {
                                if (this.method2460(super.field5656.field2114.method2151(true, var78).field620)) {
                                    arg4.field2144 = 100;
                                }
                                arg4.method1011(var75, var76, var77, var72, var73, var74, var44.field127[var69], var44.field127[var70], var44.field127[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg4.field2144 = 0;
                            }
                        }
                    }
                } else {
                    for (int var80 = 0; ~var80 > ~var44.field128; ++var80) {
                        short var81 = var44.field133[var80];
                        short var82 = var44.field135[var80];
                        short var83 = var44.field126[var80];
                        int var84 = arg0[var81];
                        int var85 = arg0[var82];
                        int var86 = arg0[var83];
                        int var87 = arg2[var81];
                        int var88 = arg2[var82];
                        int var89 = arg2[var83];
                        if (~((-var85 + var84) * (-var88 + var89) + -((-var85 + var86) * (-var88 + var87))) < -1) {
                            int var90 = var44.field129[var80];
                            if (~var90 != 0) {
                                arg4.field2142 = ~var84 > -1 || ~var85 > -1 || var86 < 0 || ~arg4.field2141 > ~var84 || var85 > arg4.field2141 || var86 > arg4.field2141;
                                arg4.method1014(var87, var88, var89, var84, var85, var86, class494.method2775(var90, 31745, var44.field127[var81]), class494.method2775(var90, 31745, var44.field127[var82]), class494.method2775(var90, 31745, var44.field127[var83]));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)Lhd;")
    public static final class270 method1269(byte arg0) {
        if (arg0 < 92) {
            method1266((String) null, 19);
        }
        ++field2584;
        return class614.field8826;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Ljba;IIII[[I[[II)V")
    public class198(class647 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
    public final void method883(int arg0, int arg1) {
        ++field2589;
        class567 var3 = (class567) super.field5656.method199(Thread.currentThread());
        var3.field7928.field2144 = 0;
        if (super.field5671 == null) {
            if (super.field5668 != null) {
                this.method1268(var3.field6835, arg1, var3.field6856, -32170, var3.field7928, var3.field6845, arg0);
                return;
            }
        } else {
            this.method1265(arg0, arg1, super.field5656.field9360, var3.field7928, var3.field6845, var3.field6835, var3.field6856, false);
        }
    }
}
