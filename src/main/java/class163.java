import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class163 extends class412 {

    @OriginalMember(owner = "client!qda", name = "G", descriptor = "I")
    public static int field2068 = 1;

    @OriginalMember(owner = "client!qda", name = "O", descriptor = "Z")
    public static boolean field2076 = false;

    @OriginalMember(owner = "client!qda", name = "K", descriptor = "Lba;")
    public static class607 field2072 = new class607(8);

    @OriginalMember(owner = "client!qda", name = "A", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!qda", name = "F", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!qda", name = "H", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!qda", name = "I", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!qda", name = "J", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!qda", name = "L", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!qda", name = "M", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!qda", name = "N", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I[[Z[IILeda;I[IIIIII)V")
    private final void method880(int arg0, boolean[][] arg1, int[] arg2, int arg3, class518 arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field2070;
        int var13 = (-arg11 + arg10) * arg0 / 256;
        arg4.field7229 = false;
        arg4.field7221 = false;
        int var14 = arg0 >> 8;
        int var15 = arg3;
        int var16 = arg7 + var13;
        for (int var17 = arg9; arg5 > var17; ++var17) {
            for (int var18 = arg11; var18 < arg10; ++var18) {
                if (arg1[-arg9 + var17][var18 - arg11]) {
                    if (super.field5668[var17][var18] != null) {
                        class531 var34 = super.field5668[var17][var18];
                        if (~var34.field7413 != 0 && (2 & var34.field7417) == 0 && var34.field7414 == -1) {
                            int var35 = super.field5656.method3720(var34.field7413);
                            arg4.method2882(var16 - var14, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, 0, 0, 0, class494.method2775(var35, 31745, var34.field7419 & 65535), class494.method2775(var35, 31745, var34.field7416 & 65535), class494.method2775(var35, 31745, 65535 & var34.field7418));
                            arg4.method2882(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, class494.method2775(var35, 31745, 65535 & var34.field7415), class494.method2775(var35, arg8 ^ -933962865, 65535 & var34.field7418), class494.method2775(var35, 31745, var34.field7416 & 65535));
                        } else if (var34.field7414 != -1) {
                            int var36 = var34.field7414;
                            arg4.method2882(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var15 - -var14, 0, 0, 0, var36, var36, var36);
                            arg4.method2882(var16, var16, -var14 + var16, var15, var15 - -var14, var15, 0, 0, 0, var36, var36, var36);
                        } else {
                            arg4.method2882(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, 0, 0, 0, var34.field7419 & 65535, 65535 & var34.field7416, 65535 & var34.field7418);
                            arg4.method2882(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, 65535 & var34.field7415, 65535 & var34.field7418, var34.field7416 & 65535);
                        }
                    } else if (super.field5673[var17][var18] != null) {
                        class13 var19 = super.field5673[var17][var18];
                        for (int var20 = 0; ~var19.field134 < ~var20; ++var20) {
                            arg6[var20] = var19.field130[var20] * var14 / super.field7582 + var15;
                            arg2[var20] = var16 - var19.field132[var20] * var14 / super.field7582;
                        }
                        for (int var21 = 0; ~var21 > ~var19.field128; ++var21) {
                            short var22 = var19.field133[var21];
                            short var23 = var19.field135[var21];
                            short var24 = var19.field126[var21];
                            int var25 = arg6[var22];
                            int var26 = arg6[var23];
                            int var27 = arg6[var24];
                            int var28 = arg2[var22];
                            int var29 = arg2[var23];
                            int var30 = arg2[var24];
                            if (var19.field125 != null && var19.field125[var21] != -1) {
                                int var31 = var19.field125[var21];
                                arg4.method2882(var28, var29, var30, var25, var26, var27, 0, 0, 0, class494.method2775(var31, arg8 ^ -933962865, var19.field127[var22]), class494.method2775(var31, 31745, var19.field127[var23]), class494.method2775(var31, 31745, var19.field127[var24]));
                            } else if (var19.field131 != null && ~var19.field131[var21] != 0) {
                                int var32 = super.field5656.method3720(var19.field131[var21]);
                                arg4.method2882(var28, var29, var30, var25, var26, var27, 0, 0, 0, class494.method2775(var32, 31745, var19.field127[var22]), class494.method2775(var32, 31745, var19.field127[var23]), class494.method2775(var32, 31745, var19.field127[var24]));
                            } else {
                                int var33 = var19.field129[var21];
                                arg4.method2882(var28, var29, var30, var25, var26, var27, 0, 0, 0, class494.method2775(var33, 31745, var19.field127[var22]), class494.method2775(var33, arg8 + 934007923, var19.field127[var23]), class494.method2775(var33, 31745, var19.field127[var24]));
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var16 = arg7 - -var13;
            var15 += var14;
        }
        if (arg8 != -933976178) {
            this.method886((int[]) null, false, (int[]) null, (class518) null, 32, (int[]) null, (int[]) null, 86, -79);
        }
        arg4.field7229 = true;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "([II[I[ILeda;[III)V")
    private final void method881(int[] arg0, int arg1, int[] arg2, int[] arg3, class518 arg4, int[] arg5, int arg6, int arg7) {
        if (arg7 != -14053) {
            method887(-65);
        }
        ++field2066;
        class531 var9 = super.field5668[arg6][arg1];
        if (var9 != null) {
            if ((2 & var9.field7417) == 0) {
                int var10 = super.field7582 * arg6;
                int var11 = var10 - -super.field7582;
                int var12 = super.field7582 * arg1;
                int var13 = super.field7582 + var12;
                int var15;
                int var16;
                int var17;
                int var18;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var28;
                int var29;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                if (~(var9.field7417 & 1) != -1) {
                    int var14 = super.field5677[arg6][arg1];
                    if (super.field5657 != -1) {
                        var15 = super.field5657;
                        var16 = super.field5657;
                        var17 = super.field5657;
                        var18 = super.field5657;
                    } else {
                        int var19 = super.field5663 * var14;
                        var18 = (super.field5660 * var10 - -var19 - -(super.field5672 * var12) >> 14) + super.field5661;
                        if (~var18 >= ~super.field5656.field9379) {
                            return;
                        }
                        var17 = (super.field5672 * var12 + super.field5660 * var11 + var19 >> 14) + super.field5661;
                        if (~var17 >= ~super.field5656.field9379) {
                            return;
                        }
                        var16 = super.field5661 - -(super.field5660 * var11 + super.field5672 * var13 + var19 >> 14);
                        if (~var16 >= ~super.field5656.field9379) {
                            return;
                        }
                        var15 = (super.field5672 * var13 + super.field5660 * var10 + var19 >> 14) + super.field5661;
                        if (var15 <= super.field5656.field9379) {
                            return;
                        }
                    }
                    int var20 = super.field5667 * var14;
                    int var21 = super.field5670 * var14;
                    var22 = (super.field5669 * var10 + super.field5666 * var12 - -var20 >> 14) + super.field5665;
                    var23 = super.field5656.field9374 * var22 / var18 + arg4.field7222;
                    var24 = super.field5674 - -(super.field5676 * var10 + super.field5659 * var12 - -var21 >> 14);
                    var25 = super.field5656.field9399 * var24 / var18 + arg4.field7234;
                    var26 = (super.field5669 * var11 - (-var20 - super.field5666 * var12) >> 14) + super.field5665;
                    var27 = super.field5674 - -(super.field5676 * var11 + var21 - -(super.field5659 * var12) >> 14);
                    var28 = super.field5656.field9374 * var26 / var17 + arg4.field7222;
                    var29 = super.field5656.field9399 * var27 / var17 + arg4.field7234;
                    int var30 = (super.field5666 * var13 + super.field5669 * var11 + var20 >> 14) + super.field5665;
                    int var31 = (super.field5676 * var11 + var21 - -(super.field5659 * var13) >> 14) + super.field5674;
                    var32 = super.field5656.field9374 * var30 / var16 + arg4.field7222;
                    var33 = (super.field5666 * var13 + super.field5669 * var10 + var20 >> 14) + super.field5665;
                    var34 = arg4.field7234 - -(super.field5656.field9399 * var31 / var16);
                    var35 = (super.field5659 * var13 + super.field5676 * var10 + var21 >> 14) + super.field5674;
                    var36 = super.field5656.field9374 * var33 / var15 + arg4.field7222;
                    var37 = arg4.field7234 - -(super.field5656.field9399 * var35 / var15);
                } else {
                    int var38 = super.field5677[arg6][arg1];
                    int var39 = super.field5677[arg6 + 1][arg1];
                    int var40 = super.field5677[arg6 + 1][arg1 + 1];
                    int var41 = super.field5677[arg6][arg1 + 1];
                    if (~super.field5657 == 0) {
                        var18 = super.field5661 - -(super.field5672 * var12 + (super.field5660 * var10 - -(super.field5663 * var38)) >> 14);
                        if (super.field5656.field9379 >= var18) {
                            return;
                        }
                        var17 = (super.field5663 * var39 + super.field5672 * var12 + super.field5660 * var11 >> 14) + super.field5661;
                        if (super.field5656.field9379 >= var17) {
                            return;
                        }
                        var16 = (super.field5660 * var11 - (-(super.field5672 * var13) + -(super.field5663 * var40)) >> 14) + super.field5661;
                        if (var16 <= super.field5656.field9379) {
                            return;
                        }
                        var15 = (super.field5660 * var10 - (-(super.field5663 * var41) - super.field5672 * var13) >> 14) + super.field5661;
                        if (super.field5656.field9379 >= var15) {
                            return;
                        }
                    } else {
                        var15 = super.field5657;
                        var16 = super.field5657;
                        var17 = super.field5657;
                        var18 = super.field5657;
                    }
                    var22 = super.field5665 - -(super.field5669 * var10 + super.field5667 * var38 + super.field5666 * var12 >> 14);
                    var23 = super.field5656.field9374 * var22 / var18 + arg4.field7222;
                    var24 = (super.field5676 * var10 + super.field5659 * var12 - -(super.field5670 * var38) >> 14) + super.field5674;
                    var25 = super.field5656.field9399 * var24 / var18 + arg4.field7234;
                    var26 = (super.field5669 * var11 - -(super.field5667 * var39) - -(super.field5666 * var12) >> 14) + super.field5665;
                    var28 = arg4.field7222 - -(super.field5656.field9374 * var26 / var17);
                    var27 = super.field5674 - -(super.field5659 * var12 + super.field5676 * var11 + super.field5670 * var39 >> 14);
                    var29 = super.field5656.field9399 * var27 / var17 + arg4.field7234;
                    int var42 = super.field5665 - -(super.field5667 * var40 + super.field5669 * var11 + super.field5666 * var13 >> 14);
                    int var43 = (super.field5659 * var13 + super.field5676 * var11 + super.field5670 * var40 >> 14) + super.field5674;
                    var32 = arg4.field7222 - -(super.field5656.field9374 * var42 / var16);
                    var33 = (super.field5669 * var10 + super.field5667 * var41 + super.field5666 * var13 >> 14) + super.field5665;
                    var34 = super.field5656.field9399 * var43 / var16 + arg4.field7234;
                    var36 = arg4.field7222 - -(super.field5656.field9374 * var33 / var15);
                    var35 = super.field5674 - -(super.field5676 * var10 + super.field5659 * var13 - -(super.field5670 * var41) >> 14);
                    var37 = arg4.field7234 - -(super.field5656.field9399 * var35 / var15);
                }
                if (~((var32 - var36) * (-var37 + var29) - (var28 - var36) * (var34 - var37)) < -1) {
                    arg4.field7232 = ~var32 > -1 || var36 < 0 || ~var28 > -1 || ~var32 < ~arg4.field7235 || var36 > arg4.field7235 || arg4.field7235 < var28;
                    if (var9.field7413 >= 0) {
                        if (this.method2460(super.field5656.field2114.method2151(true, var9.field7413).field620)) {
                            arg4.field7224 = 100;
                        }
                        arg4.method2880(var34, var37, var29, var32, var36, var28, 65535 & var9.field7419, var9.field7416 & 65535, var9.field7418 & 65535, var22, var26, var33, var24, var27, var35, var18, var17, var15, var9.field7413);
                        arg4.field7224 = 0;
                    } else {
                        arg4.method2882(var34, var37, var29, var32, var36, var28, var16, var15, var17, var9.field7419 & 65535, 65535 & var9.field7416, var9.field7418 & 65535);
                    }
                }
                if (~((var23 - var28) * (-var29 + var37) + -((var25 - var29) * (-var28 + var36))) < -1) {
                    arg4.field7232 = var23 < 0 || ~var28 > -1 || ~var36 > -1 || arg4.field7235 < var23 || ~arg4.field7235 > ~var28 || ~arg4.field7235 > ~var36;
                    if (var9.field7413 >= 0) {
                        if (this.method2460(super.field5656.field2114.method2151(true, var9.field7413).field620)) {
                            arg4.field7224 = 100;
                        }
                        arg4.method2880(var25, var29, var37, var23, var28, var36, 65535 & var9.field7415, 65535 & var9.field7418, var9.field7416 & 65535, var22, var26, var33, var24, var27, var35, var18, var17, var15, var9.field7413);
                        arg4.field7224 = 0;
                        return;
                    }
                    arg4.method2882(var25, var29, var37, var23, var28, var36, var18, var17, var15, 65535 & var9.field7415, var9.field7418 & 65535, var9.field7416 & 65535);
                }
            }
        } else {
            class13 var44 = super.field5673[arg6][arg1];
            if (var44 != null) {
                if (~super.field5657 == 0) {
                    for (int var45 = 0; var45 < var44.field134; ++var45) {
                        int var46 = (arg6 << super.field7583) + var44.field130[var45];
                        short var47 = var44.field124[var45];
                        int var48 = (arg1 << super.field7583) + var44.field132[var45];
                        int var49 = (super.field5663 * var47 + super.field5672 * var48 + super.field5660 * var46 >> 14) + super.field5661;
                        if (~var49 >= ~super.field5656.field9379) {
                            return;
                        }
                        int var50 = (super.field5676 * var46 + super.field5670 * var47 - -(super.field5659 * var48) >> 14) + super.field5674;
                        int var51 = (super.field5666 * var48 + super.field5669 * var46 + super.field5667 * var47 >> 14) + super.field5665;
                        arg0[var45] = arg4.field7222 - -(super.field5656.field9374 * var51 / var49);
                        arg2[var45] = super.field5656.field9399 * var50 / var49 + arg4.field7234;
                        arg3[var45] = var49;
                    }
                } else {
                    for (int var52 = 0; ~var52 > ~var44.field134; ++var52) {
                        int var92 = var44.field130[var52] - -(arg6 << super.field7583);
                        short var93 = var44.field124[var52];
                        int var94 = var44.field132[var52] - -(arg1 << super.field7583);
                        int var95 = super.field5665 - -(super.field5669 * var92 + super.field5666 * var94 - -(super.field5667 * var93) >> 14);
                        int var96 = (super.field5659 * var94 + super.field5676 * var92 + super.field5670 * var93 >> 14) + super.field5674;
                        arg0[var52] = super.field5656.field9374 * var95 / super.field5657 + arg4.field7222;
                        arg2[var52] = super.field5656.field9399 * var96 / super.field5657 + arg4.field7234;
                        arg3[var52] = super.field5657;
                    }
                }
                if (var44.field131 != null) {
                    int var53 = super.field5677[arg6][arg1];
                    int var54 = super.field5677[arg6 + 1][arg1];
                    int var55 = super.field5677[arg6][arg1 + 1];
                    int var56 = super.field7582 * arg6;
                    int var57 = super.field7582 + var56;
                    int var58 = super.field7582 * arg1;
                    int var59 = super.field7582 + var58;
                    int var60 = super.field5665 - -(super.field5667 * var53 + super.field5669 * var56 + super.field5666 * var58 >> 14);
                    int var61 = super.field5674 - -(super.field5670 * var53 + super.field5676 * var56 + super.field5659 * var58 >> 14);
                    int var62 = super.field5661 - -(super.field5663 * var53 + super.field5660 * var56 - -(super.field5672 * var58) >> 14);
                    int var63 = (super.field5669 * var57 + super.field5666 * var58 - -(super.field5667 * var54) >> 14) + super.field5665;
                    int var64 = (super.field5670 * var54 + (super.field5676 * var57 - -(super.field5659 * var58)) >> 14) + super.field5674;
                    int var65 = (super.field5672 * var58 + super.field5663 * var54 + super.field5660 * var57 >> 14) + super.field5661;
                    int var66 = (super.field5669 * var56 - (-(super.field5667 * var55) - super.field5666 * var59) >> 14) + super.field5665;
                    int var67 = (super.field5659 * var59 + super.field5676 * var56 + super.field5670 * var55 >> 14) + super.field5674;
                    int var68 = (super.field5663 * var55 + super.field5672 * var59 + super.field5660 * var56 >> 14) + super.field5661;
                    for (int var69 = 0; var44.field128 > var69; ++var69) {
                        short var70 = var44.field133[var69];
                        short var71 = var44.field135[var69];
                        short var72 = var44.field126[var69];
                        int var73 = arg0[var70];
                        int var74 = arg0[var71];
                        int var75 = arg0[var72];
                        int var76 = arg2[var70];
                        int var77 = arg2[var71];
                        int var78 = arg2[var72];
                        if ((-var74 + var73) * (-var77 + var78) + -((-var74 + var75) * (-var77 + var76)) > 0) {
                            arg4.field7232 = ~var73 > -1 || ~var74 > -1 || ~var75 > -1 || ~arg4.field7235 > ~var73 || arg4.field7235 < var74 || var75 > arg4.field7235;
                            short var79 = var44.field131[var69];
                            if (~var79 == 0) {
                                int var80 = var44.field129[var69];
                                if (var80 != -1) {
                                    arg4.method2882(var76, var77, var78, var73, var74, var75, arg3[1], arg3[2], arg3[3], class494.method2775(var80, 31745, var44.field127[var70]), class494.method2775(var80, 31745, var44.field127[var71]), class494.method2775(var80, 31745, var44.field127[var72]));
                                }
                            } else {
                                if (this.method2460(super.field5656.field2114.method2151(true, var79).field620)) {
                                    arg4.field7224 = 100;
                                }
                                arg4.method2880(var76, var77, var78, var73, var74, var75, var44.field127[var70], var44.field127[var71], var44.field127[var72], var60, var63, var66, var61, var64, var67, var62, var65, var68, var79);
                                arg4.field7224 = 0;
                            }
                        }
                    }
                } else {
                    for (int var81 = 0; ~var44.field128 < ~var81; ++var81) {
                        short var82 = var44.field133[var81];
                        short var83 = var44.field135[var81];
                        short var84 = var44.field126[var81];
                        int var85 = arg0[var82];
                        int var86 = arg0[var83];
                        int var87 = arg0[var84];
                        int var88 = arg2[var82];
                        int var89 = arg2[var83];
                        int var90 = arg2[var84];
                        if (~((-var86 + var85) * (-var89 + var90) + -((var88 - var89) * (-var86 + var87))) < -1) {
                            int var91 = var44.field129[var81];
                            if (~var91 != 0) {
                                arg4.field7232 = ~var85 > -1 || var86 < 0 || var87 < 0 || ~var85 < ~arg4.field7235 || ~arg4.field7235 > ~var86 || ~var87 < ~arg4.field7235;
                                arg4.method2882(var88, var89, var90, var85, var86, var87, arg3[1], arg3[2], arg3[3], class494.method2775(var91, 31745, var44.field127[var82]), class494.method2775(var91, arg7 + 45798, var44.field127[var83]), class494.method2775(var91, arg7 + 45798, var44.field127[var84]));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Ljba;IIII[[I[[II)V")
    public class163(class647 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(I)V")
    public static void method882(int arg0) {
        if (arg0 != -24494) {
            field2072 = null;
        }
        field2072 = null;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)V")
    public final void method883(int arg0, int arg1) {
        ++field2071;
        class298 var3 = (class298) super.field5656.method199(Thread.currentThread());
        var3.field3899.field7224 = 0;
        if (super.field5671 != null) {
            this.method886(var3.field6835, super.field5656.field9360, var3.field6845, var3.field3899, arg0, var3.field6856, var3.field6818, 125, arg1);
        } else if (super.field5668 != null) {
            this.method881(var3.field6835, arg1, var3.field6856, var3.field6818, var3.field3899, var3.field6845, arg0, -14053);
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIIB[II[I[[ZIILeda;)V")
    private final void method884(int arg0, int arg1, int arg2, int arg3, byte arg4, int[] arg5, int arg6, int[] arg7, boolean[][] arg8, int arg9, int arg10, class518 arg11) {
        ++field2075;
        int var13 = (-arg6 + arg2) * arg10 / 256;
        arg11.field7229 = false;
        arg11.field7221 = false;
        int var14 = arg10 >> 8;
        int var15 = arg1;
        int var16 = arg9 + var13;
        int var17 = -60 / ((-75 - arg4) / 48);
        for (int var18 = arg0; ~arg3 < ~var18; ++var18) {
            for (int var19 = arg6; arg2 > var19; ++var19) {
                if (arg8[-arg0 + var18][var19 - arg6]) {
                    if (super.field5671[var18][var19] != null) {
                        class574 var20 = super.field5671[var18][var19];
                        if (var20.field8014 != -1 && (2 & var20.field8020) == 0 && var20.field8011 == 0) {
                            int var21 = super.field5656.method3720(var20.field8014);
                            arg11.method2882(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, 0, 0, 0, class494.method2775(var21, 31745, var20.field8019), class494.method2775(var21, 31745, var20.field8016), class494.method2775(var21, 31745, var20.field8012));
                            arg11.method2882(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, class494.method2775(var21, 31745, var20.field8018), class494.method2775(var21, 31745, var20.field8012), class494.method2775(var21, 31745, var20.field8016));
                        } else if (var20.field8011 != 0) {
                            int var22 = var20.field8011;
                            arg11.method2891(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, 0, 0, 0, class93.method508(var20.field8019 & -16777216, var22, (byte) -44), class93.method508(-16777216 & var20.field8016, var22, (byte) -44), class93.method508(-16777216 & var20.field8012, var22, (byte) -44));
                            arg11.method2891(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, class93.method508(-16777216 & var20.field8018, var22, (byte) -44), class93.method508(var20.field8012 & -16777216, var22, (byte) -44), class93.method508(-16777216 & var20.field8016, var22, (byte) -44));
                        } else {
                            arg11.method2891(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, 0, 0, 0, var20.field8019, var20.field8016, var20.field8012);
                            arg11.method2891(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, var20.field8018, var20.field8012, var20.field8016);
                        }
                    } else if (super.field5658[var18][var19] != null) {
                        class472 var23 = super.field5658[var18][var19];
                        for (int var24 = 0; var23.field6690 > var24; ++var24) {
                            arg5[var24] = var15 - -(var23.field6688[var24] * var14 / super.field7582);
                            arg7[var24] = var16 - var23.field6683[var24] * var14 / super.field7582;
                        }
                        for (int var25 = 0; ~var25 > ~var23.field6686; ++var25) {
                            int var26 = var25 * 3;
                            int var27 = var26 + 1;
                            int var28 = var27 + 1;
                            int var29 = arg5[var26];
                            int var30 = arg5[var27];
                            int var31 = arg5[var28];
                            int var32 = arg7[var26];
                            int var33 = arg7[var27];
                            int var34 = arg7[var28];
                            if (var23.field6681 == null || ~var23.field6681[var25] == -1 || var23.field6687 != null && (var23.field6687 == null || ~var23.field6687[var25] != 0)) {
                                if (var23.field6687 != null && ~var23.field6687[var25] != 0) {
                                    int var36 = super.field5656.method3720(var23.field6687[var25]);
                                    arg11.method2882(var32, var33, var34, var29, var30, var31, 0, 0, 0, var36, var36, var36);
                                } else {
                                    arg11.method2891(var32, var33, var34, var29, var30, var31, 0, 0, 0, var23.field6684[var26], var23.field6684[var27], var23.field6684[var28]);
                                }
                            } else {
                                int var35 = var23.field6681[var25];
                                arg11.method2891(var32, var33, var34, var29, var30, var31, 0, 0, 0, class93.method508(-16777216 - (-16777216 & var23.field6684[var26]), var35, (byte) -44), class93.method508(-(-16777216 & var23.field6684[var27]) + -16777216, var35, (byte) -44), class93.method508(-(var23.field6684[var28] & -16777216) + -16777216, var35, (byte) -44));
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var16 = arg9 - -var13;
            var15 += var14;
        }
        arg11.field7229 = true;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field2074;
        class298 var9 = (class298) super.field5656.method199(Thread.currentThread());
        class518 var10 = var9.field3899;
        var10.field7224 = 0;
        var10.field7232 = false;
        if (super.field5671 == null) {
            if (super.field5668 != null) {
                this.method880(arg2, arg7, var9.field6856, arg0, var10, arg5, var9.field6835, arg1, -933976178, arg3, arg6, arg4);
                return;
            }
        } else {
            this.method884(arg3, arg0, arg6, arg5, (byte) -126, var9.field6835, arg4, var9.field6856, arg7, arg1, arg2, var10);
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "([IZ[ILeda;I[I[III)V")
    private final void method886(int[] arg0, boolean arg1, int[] arg2, class518 arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8) {
        if (arg7 > 101) {
            ++field2067;
            class574 var10 = super.field5671[arg4][arg8];
            if (var10 != null) {
                if ((var10.field8020 & 2) == 0) {
                    int var11 = super.field7582 * arg4;
                    int var12 = var11 - -super.field7582;
                    int var13 = super.field7582 * arg8;
                    int var14 = super.field7582 + var13;
                    int var15 = 0;
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    int var30;
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
                    int var46;
                    if (~(var10.field8020 & 1) != -1 && !arg1) {
                        int var19 = super.field5677[arg4][arg8];
                        if (super.field5657 != -1) {
                            var20 = super.field5657;
                            var21 = super.field5657;
                            var22 = super.field5657;
                            var23 = super.field5657;
                        } else {
                            int var24 = super.field5663 * var19;
                            var23 = (super.field5660 * var11 - -(super.field5672 * var13) + var24 >> 14) + super.field5661;
                            if (~var23 >= ~super.field5656.field9379) {
                                return;
                            }
                            var22 = super.field5661 - -(super.field5672 * var13 + super.field5660 * var12 + var24 >> 14);
                            if (~var22 >= ~super.field5656.field9379) {
                                return;
                            }
                            var21 = (super.field5672 * var14 + super.field5660 * var12 + var24 >> 14) + super.field5661;
                            if (super.field5656.field9379 >= var21) {
                                return;
                            }
                            var20 = super.field5661 - -(super.field5672 * var14 + super.field5660 * var11 + var24 >> 14);
                            if (super.field5656.field9379 >= var20) {
                                return;
                            }
                        }
                        if (super.field5656.field9389) {
                            int var25 = -super.field5656.field9400 + var23;
                            if (~var25 < -1) {
                                var15 = var25;
                                if (~var25 < -256) {
                                    var15 = 255;
                                }
                            }
                            int var26 = var22 - super.field5656.field9400;
                            if (~var26 < -1) {
                                var16 = var26;
                                if (var26 > 255) {
                                    var16 = 255;
                                }
                            }
                            int var27 = -super.field5656.field9400 + var21;
                            if (var27 > 0) {
                                var17 = var27;
                                if (var27 > 255) {
                                    var17 = 255;
                                }
                            }
                            int var28 = -super.field5656.field9400 + var20;
                            if (var28 > 0) {
                                var18 = var28;
                                if (~var28 < -256) {
                                    var18 = 255;
                                }
                            }
                        }
                        int var29 = super.field5667 * var19;
                        var30 = (super.field5669 * var11 + super.field5666 * var13 - -var29 >> 14) + super.field5665;
                        int var31 = super.field5670 * var19;
                        var32 = (super.field5676 * var11 + super.field5659 * var13 + var31 >> 14) + super.field5674;
                        var33 = super.field5656.field9374 * var30 / var23 + arg3.field7222;
                        var34 = (super.field5669 * var12 + var29 - -(super.field5666 * var13) >> 14) + super.field5665;
                        var35 = super.field5656.field9399 * var32 / var23 + arg3.field7234;
                        var36 = super.field5656.field9374 * var34 / var22 + arg3.field7222;
                        var37 = (super.field5676 * var12 - -var31 - -(super.field5659 * var13) >> 14) + super.field5674;
                        var38 = super.field5656.field9399 * var37 / var22 + arg3.field7234;
                        var39 = (super.field5669 * var12 + (var29 - -(super.field5666 * var14)) >> 14) + super.field5665;
                        var40 = arg3.field7222 - -(super.field5656.field9374 * var39 / var21);
                        var41 = super.field5674 - -(super.field5676 * var12 - (-var31 - super.field5659 * var14) >> 14);
                        var42 = arg3.field7234 - -(super.field5656.field9399 * var41 / var21);
                        var43 = (super.field5669 * var11 + (var29 - -(super.field5666 * var14)) >> 14) + super.field5665;
                        var44 = (super.field5676 * var11 + (var31 - -(super.field5659 * var14)) >> 14) + super.field5674;
                        var45 = super.field5656.field9374 * var43 / var20 + arg3.field7222;
                        var46 = arg3.field7234 - -(super.field5656.field9399 * var44 / var20);
                    } else {
                        int var47 = super.field5677[arg4][arg8];
                        int var48 = super.field5677[arg4 + 1][arg8];
                        int var49 = super.field5677[arg4 + 1][arg8 + 1];
                        int var50 = super.field5677[arg4][arg8 + 1];
                        if (super.field5657 == -1) {
                            var23 = (super.field5663 * var47 + super.field5672 * var13 + super.field5660 * var11 >> 14) + super.field5661;
                            if (~super.field5656.field9379 <= ~var23) {
                                return;
                            }
                            var22 = (super.field5672 * var13 + super.field5663 * var48 + super.field5660 * var12 >> 14) + super.field5661;
                            if (~var22 >= ~super.field5656.field9379) {
                                return;
                            }
                            var21 = (super.field5672 * var14 + super.field5663 * var49 + super.field5660 * var12 >> 14) + super.field5661;
                            if (var21 <= super.field5656.field9379) {
                                return;
                            }
                            var20 = (super.field5672 * var14 + super.field5663 * var50 + super.field5660 * var11 >> 14) + super.field5661;
                            if (~var20 >= ~super.field5656.field9379) {
                                return;
                            }
                        } else {
                            var20 = super.field5657;
                            var21 = super.field5657;
                            var22 = super.field5657;
                            var23 = super.field5657;
                        }
                        if (!arg1) {
                            if (super.field5656.field9389) {
                                int var51 = -super.field5656.field9400 + var23;
                                if (var51 > 0) {
                                    var15 = var51;
                                    if (var51 > 255) {
                                        var15 = 255;
                                    }
                                }
                                int var52 = -super.field5656.field9400 + var22;
                                if (~var52 < -1) {
                                    var16 = var52;
                                    if (var52 > 255) {
                                        var16 = 255;
                                    }
                                }
                                int var53 = -super.field5656.field9400 + var21;
                                if (~var53 < -1) {
                                    var17 = var53;
                                    if (var53 > 255) {
                                        var17 = 255;
                                    }
                                }
                                int var54 = -super.field5656.field9400 + var20;
                                if (var54 > 0) {
                                    var18 = var54;
                                    if (~var54 < -256) {
                                        var18 = 255;
                                    }
                                }
                            }
                        } else {
                            int var55 = var23 - super.field5656.field9400;
                            if (var55 > 255) {
                                var55 = 255;
                            }
                            if (~var55 < -1) {
                                var15 = var55;
                                int var56 = var10.field8015 * var55 / 255;
                                if (var56 > 0) {
                                    var47 -= var56;
                                }
                            }
                            int var57 = var22 - super.field5656.field9400;
                            if (var57 > 255) {
                                var57 = 255;
                            }
                            if (var57 > 0) {
                                var16 = var57;
                                int var58 = var10.field8013 * var57 / 255;
                                if (~var58 < -1) {
                                    var48 -= var58;
                                }
                            }
                            int var59 = -super.field5656.field9400 + var21;
                            if (~var59 < -256) {
                                var59 = 255;
                            }
                            if (var59 > 0) {
                                var17 = var59;
                                int var60 = var10.field8021 * var59 / 255;
                                if (~var60 < -1) {
                                    var49 -= var60;
                                }
                            }
                            int var61 = -super.field5656.field9400 + var20;
                            if (~var61 < -256) {
                                var61 = 255;
                            }
                            if (~var61 < -1) {
                                var18 = var61;
                                int var62 = var10.field8017 * var61 / 255;
                                if (var62 > 0) {
                                    var50 -= var62;
                                }
                            }
                        }
                        var30 = super.field5665 - -(super.field5666 * var13 + super.field5669 * var11 + super.field5667 * var47 >> 14);
                        var32 = (super.field5659 * var13 + super.field5676 * var11 + super.field5670 * var47 >> 14) + super.field5674;
                        var33 = arg3.field7222 - -(super.field5656.field9374 * var30 / var23);
                        var35 = super.field5656.field9399 * var32 / var23 + arg3.field7234;
                        var34 = (super.field5669 * var12 - (-(super.field5667 * var48) + -(super.field5666 * var13)) >> 14) + super.field5665;
                        var36 = super.field5656.field9374 * var34 / var22 + arg3.field7222;
                        var37 = (super.field5676 * var12 + super.field5670 * var48 + super.field5659 * var13 >> 14) + super.field5674;
                        var38 = arg3.field7234 - -(super.field5656.field9399 * var37 / var22);
                        var39 = (super.field5669 * var12 + super.field5667 * var49 + super.field5666 * var14 >> 14) + super.field5665;
                        var41 = super.field5674 - -(super.field5670 * var49 + (super.field5676 * var12 - -(super.field5659 * var14)) >> 14);
                        var40 = super.field5656.field9374 * var39 / var21 + arg3.field7222;
                        var43 = super.field5665 - -(super.field5666 * var14 + super.field5669 * var11 + super.field5667 * var50 >> 14);
                        var42 = super.field5656.field9399 * var41 / var21 + arg3.field7234;
                        var45 = super.field5656.field9374 * var43 / var20 + arg3.field7222;
                        var44 = (super.field5659 * var14 + super.field5676 * var11 + super.field5670 * var50 >> 14) + super.field5674;
                        var46 = super.field5656.field9399 * var44 / var20 + arg3.field7234;
                    }
                    boolean var63 = var10.field8014 != -1 && this.method2460(super.field5656.field2114.method2151(true, var10.field8014).field620);
                    int var64 = var16 - (-var17 - var18);
                    if (~((var38 - var46) * (-var45 + var40) + -((-var45 + var36) * (-var46 + var42))) < -1) {
                        arg3.field7232 = ~var40 > -1 || ~var45 > -1 || var36 < 0 || ~var40 < ~arg3.field7235 || arg3.field7235 < var45 || var36 > arg3.field7235;
                        if (~var64 <= -766) {
                            arg3.method2885(var42, var46, var38, var40, var45, var36, var21, var20, var22, super.field5656.field9387);
                        } else {
                            if (var63) {
                                arg3.field7224 = 100;
                            }
                            if (var64 <= 0) {
                                if (var10.field8014 >= 0) {
                                    arg3.method2880(var42, var46, var38, var40, var45, var36, var10.field8019, var10.field8016, var10.field8012, var39, var43, var34, var41, var44, var37, var21, var20, var22, var10.field8014);
                                } else {
                                    arg3.method2891(var42, var46, var38, var40, var45, var36, var21, var20, var22, var10.field8019, var10.field8016, var10.field8012);
                                }
                            } else if (var10.field8014 < 0) {
                                arg3.method2891(var42, var46, var38, var40, var45, var36, var21, var20, var22, class93.method508(var17 << 24 | super.field5656.field9387, var10.field8019, (byte) -44), class93.method508(super.field5656.field9387 | var18 << 24, var10.field8016, (byte) -44), class93.method508(super.field5656.field9387 | var16 << 24, var10.field8012, (byte) -44));
                            } else {
                                arg3.method2877(var42, var46, var38, var40, var45, var36, var21, var20, var22, super.field5656.field9387, var17, var18, var16, var10.field8019, var10.field8016, var10.field8012, var39, var43, var34, var41, var44, var37, var21, var20, var22, var10.field8014);
                            }
                            arg3.field7224 = 0;
                        }
                    }
                    int var65 = var15 + var16 + var18;
                    if ((var33 - var36) * (-var38 + var46) + -((-var36 + var45) * (-var38 + var35)) > 0) {
                        arg3.field7232 = var33 < 0 || ~var36 > -1 || ~var45 > -1 || var33 > arg3.field7235 || ~var36 < ~arg3.field7235 || var45 > arg3.field7235;
                        if (~var65 > -766) {
                            if (var63) {
                                arg3.field7224 = 100;
                            }
                            if (var65 <= 0) {
                                if (var10.field8014 < 0) {
                                    arg3.method2891(var35, var38, var46, var33, var36, var45, var23, var22, var20, var10.field8018, var10.field8012, var10.field8016);
                                } else {
                                    arg3.method2880(var35, var38, var46, var33, var36, var45, var10.field8018, var10.field8012, var10.field8016, var30, var34, var43, var32, var37, var44, var23, var22, var20, var10.field8014);
                                }
                            } else if (~var10.field8014 > -1) {
                                arg3.method2891(var35, var38, var46, var33, var36, var45, var23, var22, var20, class93.method508(super.field5656.field9387 | var15 << 24, var10.field8018, (byte) -44), class93.method508(super.field5656.field9387 | var16 << 24, var10.field8012, (byte) -44), class93.method508(super.field5656.field9387 | var18 << 24, var10.field8016, (byte) -44));
                            } else {
                                arg3.method2877(var35, var38, var46, var33, var36, var45, var23, var22, var20, super.field5656.field9387, var15, var16, var18, var10.field8018, var10.field8012, var10.field8016, var30, var34, var43, var32, var37, var44, var23, var22, var20, var10.field8014);
                            }
                            arg3.field7224 = 0;
                            return;
                        }
                        arg3.method2885(var35, var38, var46, var33, var36, var45, var23, var22, var20, super.field5656.field9387);
                    }
                }
            } else {
                class472 var66 = super.field5658[arg4][arg8];
                if (var66 != null) {
                    if (super.field5657 == -1) {
                        for (int var67 = 0; var66.field6690 > var67; ++var67) {
                            int var68 = (arg4 << super.field7583) + var66.field6688[var67];
                            int var69 = var66.field6682[var67];
                            int var70 = var66.field6683[var67] - -(arg8 << super.field7583);
                            int var71 = (super.field5672 * var70 + super.field5663 * var69 + super.field5660 * var68 >> 14) + super.field5661;
                            if (~super.field5656.field9379 <= ~var71) {
                                return;
                            }
                            arg2[var67] = 0;
                            if (!arg1) {
                                if (super.field5656.field9389) {
                                    int var72 = -super.field5656.field9400 + var71;
                                    if (~var72 < -1) {
                                        arg2[var67] = var72;
                                        if (arg2[var67] > 255) {
                                            arg2[var67] = 255;
                                        }
                                    }
                                }
                            } else {
                                int var73 = -super.field5656.field9400 + var71;
                                if (var73 > 255) {
                                    var73 = 255;
                                }
                                if (~var73 < -1) {
                                    arg2[var67] = var73;
                                    int var74 = var66.field6685[var67] * var73 / 255;
                                    if (var74 > 0) {
                                        var69 -= var74;
                                    }
                                }
                            }
                            int var75 = (super.field5666 * var70 + super.field5669 * var68 + super.field5667 * var69 >> 14) + super.field5665;
                            int var76 = super.field5674 - -(super.field5676 * var68 + super.field5659 * var70 - -(super.field5670 * var69) >> 14);
                            arg0[var67] = super.field5656.field9374 * var75 / var71 + arg3.field7222;
                            arg5[var67] = super.field5656.field9399 * var76 / var71 + arg3.field7234;
                            arg6[var67] = var71;
                        }
                    } else {
                        for (int var77 = 0; ~var66.field6690 < ~var77; ++var77) {
                            int var117 = (arg4 << super.field7583) + var66.field6688[var77];
                            int var118 = var66.field6682[var77];
                            int var119 = var66.field6683[var77] - -(arg8 << super.field7583);
                            arg2[var77] = 0;
                            if (arg1) {
                                int var120 = super.field5657 - super.field5656.field9400;
                                if (var120 > 255) {
                                    var120 = 255;
                                }
                                if (var120 > 0) {
                                    arg2[var77] = var120;
                                    int var121 = var66.field6685[var77] * var120 / 255;
                                    if (~var121 < -1) {
                                        var118 -= var121;
                                    }
                                }
                            } else if (super.field5656.field9389) {
                                int var122 = -super.field5656.field9400 + super.field5657;
                                if (~var122 < -1) {
                                    arg2[var77] = var122;
                                    if (~arg2[var77] < -256) {
                                        arg2[var77] = 255;
                                    }
                                }
                            }
                            int var123 = super.field5674 - -(super.field5676 * var117 + super.field5670 * var118 + super.field5659 * var119 >> 14);
                            int var124 = super.field5665 - -(super.field5669 * var117 - (-(super.field5667 * var118) - super.field5666 * var119) >> 14);
                            arg0[var77] = super.field5656.field9374 * var124 / super.field5657 + arg3.field7222;
                            arg5[var77] = arg3.field7234 - -(super.field5656.field9399 * var123 / super.field5657);
                            arg6[var77] = super.field5657;
                        }
                    }
                    if (var66.field6687 == null) {
                        for (int var78 = 0; ~var66.field6686 < ~var78; ++var78) {
                            int var79 = var78 * 3;
                            int var80 = var79 + 1;
                            int var81 = var80 + 1;
                            int var82 = arg0[var79];
                            int var83 = arg0[var80];
                            int var84 = arg0[var81];
                            int var85 = arg5[var79];
                            int var86 = arg5[var80];
                            int var87 = arg5[var81];
                            int var88 = arg2[var79] - -arg2[var80] + arg2[var81];
                            if ((-var83 + var82) * (-var86 + var87) + -((-var83 + var84) * (-var86 + var85)) > 0) {
                                arg3.field7232 = ~var82 > -1 || var83 < 0 || var84 < 0 || ~arg3.field7235 > ~var82 || ~arg3.field7235 > ~var83 || arg3.field7235 < var84;
                                if (~var88 > -766) {
                                    if (~var88 >= -1) {
                                        if ((var66.field6684[var79] & 16777215) != 0) {
                                            arg3.method2891(var85, var86, var87, var82, var83, var84, arg6[var79], arg6[var80], arg6[var81], var66.field6684[var79], var66.field6684[var80], var66.field6684[var81]);
                                        }
                                    } else if (~(16777215 & var66.field6684[var79]) != -1) {
                                        arg3.method2891(var85, var86, var87, var82, var83, var84, arg6[var79], arg6[var80], arg6[var81], class480.method2717(arg2[var79], (byte) 93, var66.field6684[var79], super.field5656.field9387), class480.method2717(arg2[var80], (byte) 99, var66.field6684[var80], super.field5656.field9387), class480.method2717(arg2[var81], (byte) 121, var66.field6684[var81], super.field5656.field9387));
                                    }
                                } else {
                                    arg3.method2885(var85, var86, var87, var82, var83, var84, arg6[var79], arg6[var80], arg6[var81], super.field5656.field9387);
                                }
                            }
                        }
                    } else {
                        int var89 = super.field5677[arg4][arg8];
                        int var90 = super.field5677[arg4 + 1][arg8];
                        int var91 = super.field5677[arg4][arg8 - -1];
                        int var92 = super.field7582 * arg4;
                        int var93 = super.field7582 + var92;
                        int var94 = super.field7582 * arg8;
                        int var95 = super.field7582 + var94;
                        int var96 = (super.field5666 * var94 + super.field5669 * var92 + super.field5667 * var89 >> 14) + super.field5665;
                        int var97 = (super.field5676 * var92 + super.field5670 * var89 + super.field5659 * var94 >> 14) + super.field5674;
                        int var98 = (super.field5672 * var94 + super.field5663 * var89 + super.field5660 * var92 >> 14) + super.field5661;
                        int var99 = (super.field5666 * var94 + (super.field5669 * var93 - -(super.field5667 * var90)) >> 14) + super.field5665;
                        int var100 = (super.field5676 * var93 + super.field5670 * var90 + super.field5659 * var94 >> 14) + super.field5674;
                        int var101 = super.field5661 - -(super.field5672 * var94 + super.field5660 * var93 - -(super.field5663 * var90) >> 14);
                        int var102 = (super.field5669 * var92 - (-(super.field5667 * var91) + -(super.field5666 * var95)) >> 14) + super.field5665;
                        int var103 = super.field5674 - -(super.field5676 * var92 - -(super.field5670 * var91) - -(super.field5659 * var95) >> 14);
                        int var104 = (super.field5663 * var91 + super.field5660 * var92 - -(super.field5672 * var95) >> 14) + super.field5661;
                        for (int var105 = 0; var105 < var66.field6686; ++var105) {
                            int var106 = var105 * 3;
                            int var107 = var106 + 1;
                            int var108 = var107 + 1;
                            int var109 = arg0[var106];
                            int var110 = arg0[var107];
                            int var111 = arg0[var108];
                            int var112 = arg5[var106];
                            int var113 = arg5[var107];
                            int var114 = arg5[var108];
                            int var115 = arg2[var107] + arg2[var108] + arg2[var106];
                            if (~((var114 - var113) * (-var110 + var109) - (-var110 + var111) * (-var113 + var112)) < -1) {
                                arg3.field7232 = var109 < 0 || ~var110 > -1 || var111 < 0 || var109 > arg3.field7235 || ~var110 < ~arg3.field7235 || ~var111 < ~arg3.field7235;
                                short var116 = var66.field6687[var105];
                                if (var115 >= 765) {
                                    arg3.method2885(var112, var113, var114, var109, var110, var111, arg6[var106], arg6[var107], arg6[var108], super.field5656.field9387);
                                } else {
                                    if (~var116 != 0 && this.method2460(super.field5656.field2114.method2151(true, var116).field620)) {
                                        arg3.field7224 = 100;
                                    }
                                    if (var115 <= 0) {
                                        if (var116 != -1) {
                                            arg3.method2880(var112, var113, var114, var109, var110, var111, var66.field6684[var106], var66.field6684[var107], var66.field6684[var108], var96, var99, var102, var97, var100, var103, var98, var101, var104, var116);
                                        } else if ((16777215 & var66.field6684[var106]) != 0) {
                                            arg3.method2891(var112, var113, var114, var109, var110, var111, arg6[var106], arg6[var107], arg6[var108], var66.field6684[var106], var66.field6684[var107], var66.field6684[var108]);
                                        }
                                    } else if (~var116 == 0) {
                                        if (~(var66.field6684[var106] & 16777215) != -1) {
                                            arg3.method2891(var112, var113, var114, var109, var110, var111, arg6[var106], arg6[var107], arg6[var108], class93.method508(super.field5656.field9387 | arg2[var106] << 24, var66.field6684[var106], (byte) -44), class93.method508(super.field5656.field9387 | arg2[var107] << 24, var66.field6684[var107], (byte) -44), class93.method508(arg2[var108] << 24 | super.field5656.field9387, var66.field6684[var108], (byte) -44));
                                        }
                                    } else {
                                        arg3.method2877(var112, var113, var114, var109, var110, var111, arg6[var106], arg6[var107], arg6[var108], super.field5656.field9387, arg2[var106], arg2[var107], arg2[var108], var66.field6684[var106], var66.field6684[var107], var66.field6684[var108], var96, var99, var102, var97, var100, var103, var98, var101, var104, var116);
                                    }
                                    arg3.field7224 = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "(I)Z")
    public static final boolean method887(int arg0) {
        if (arg0 != 2) {
            field2069 = -49;
        }
        ++field2073;
        return class628.field9174 != class602.field8701 || class615.field8876 >= 2;
    }
}
