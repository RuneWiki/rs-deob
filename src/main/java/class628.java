import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class628 extends class543 {

    @OriginalMember(owner = "client!vfa", name = "D", descriptor = "I")
    public static int field8526 = -1;

    @OriginalMember(owner = "client!vfa", name = "B", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!vfa", name = "C", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!vfa", name = "E", descriptor = "I")
    public static int field8527;

    @OriginalMember(owner = "client!vfa", name = "F", descriptor = "I")
    public static int field8528;

    @OriginalMember(owner = "client!vfa", name = "G", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!vfa", name = "H", descriptor = "I")
    public static int field8530;

    @OriginalMember(owner = "client!vfa", name = "I", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!vfa", name = "J", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!vfa", name = "K", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!vfa", name = "L", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "([III[ILkc;[IZ)V")
    private final void method3505(int[] arg0, int arg1, int arg2, int[] arg3, class123 arg4, int[] arg5, boolean arg6) {
        if (!arg6) {
            ++field8525;
            class88 var8 = super.field6837[arg2][arg1];
            if (var8 != null) {
                if (~(2 & var8.field1139) == -1) {
                    int var9 = super.field1686 * arg2;
                    int var10 = var9 - -super.field1686;
                    int var11 = super.field1686 * arg1;
                    int var12 = super.field1686 + var11;
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
                    if ((1 & var8.field1139) == 0) {
                        int var13 = super.field6853[arg2][arg1];
                        int var14 = super.field6853[arg2 + 1][arg1];
                        int var15 = super.field6853[arg2 + 1][arg1 - -1];
                        int var16 = super.field6853[arg2][arg1 - -1];
                        int var19;
                        if (~super.field6849 == 0) {
                            var17 = (super.field6847 * var11 + super.field6846 * var9 + super.field6844 * var13 >> 14) + super.field6848;
                            if (~var17 >= ~super.field6832.field7351) {
                                return;
                            }
                            var18 = (super.field6844 * var14 + (super.field6846 * var10 - -(super.field6847 * var11)) >> 14) + super.field6848;
                            if (~super.field6832.field7351 <= ~var18) {
                                return;
                            }
                            var19 = (super.field6844 * var15 + super.field6847 * var12 + super.field6846 * var10 >> 14) + super.field6848;
                            if (~super.field6832.field7351 <= ~var19) {
                                return;
                            }
                            var20 = (super.field6846 * var9 - (-(super.field6847 * var12) + -(super.field6844 * var16)) >> 14) + super.field6848;
                            if (var20 <= super.field6832.field7351) {
                                return;
                            }
                        } else {
                            var20 = super.field6849;
                            var19 = super.field6849;
                            var18 = super.field6849;
                            var17 = super.field6849;
                        }
                        var21 = super.field6843 - -(super.field6838 * var13 + super.field6839 * var11 + super.field6836 * var9 >> 14);
                        var22 = super.field6845 - -(super.field6842 * var13 + super.field6852 * var9 + super.field6851 * var11 >> 14);
                        var23 = super.field6832.field7340 * var21 / var17 + arg4.field1497;
                        var24 = (super.field6839 * var11 + super.field6838 * var14 + super.field6836 * var10 >> 14) + super.field6843;
                        var25 = super.field6832.field7363 * var22 / var17 + arg4.field1494;
                        var26 = arg4.field1497 - -(super.field6832.field7340 * var24 / var18);
                        var27 = (super.field6851 * var11 + super.field6852 * var10 + super.field6842 * var14 >> 14) + super.field6845;
                        int var28 = super.field6843 - -(super.field6836 * var10 + super.field6839 * var12 + super.field6838 * var15 >> 14);
                        var29 = super.field6832.field7363 * var27 / var18 + arg4.field1494;
                        int var30 = (super.field6851 * var12 + (super.field6852 * var10 - -(super.field6842 * var15)) >> 14) + super.field6845;
                        var31 = super.field6832.field7340 * var28 / var19 + arg4.field1497;
                        var32 = (super.field6838 * var16 + super.field6839 * var12 + super.field6836 * var9 >> 14) + super.field6843;
                        var33 = arg4.field1494 - -(super.field6832.field7363 * var30 / var19);
                        var34 = (super.field6852 * var9 + super.field6851 * var12 + super.field6842 * var16 >> 14) + super.field6845;
                        var35 = super.field6832.field7340 * var32 / var20 + arg4.field1497;
                        var36 = super.field6832.field7363 * var34 / var20 + arg4.field1494;
                    } else {
                        int var37 = super.field6853[arg2][arg1];
                        int var39;
                        if (~super.field6849 == 0) {
                            int var38 = super.field6844 * var37;
                            var17 = (super.field6847 * var11 + (super.field6846 * var9 - -var38) >> 14) + super.field6848;
                            if (var17 <= super.field6832.field7351) {
                                return;
                            }
                            var18 = (super.field6846 * var10 + var38 - -(super.field6847 * var11) >> 14) + super.field6848;
                            if (~var18 >= ~super.field6832.field7351) {
                                return;
                            }
                            var39 = (super.field6846 * var10 + super.field6847 * var12 + var38 >> 14) + super.field6848;
                            if (~super.field6832.field7351 <= ~var39) {
                                return;
                            }
                            var20 = (super.field6847 * var12 + (super.field6846 * var9 - -var38) >> 14) + super.field6848;
                            if (super.field6832.field7351 >= var20) {
                                return;
                            }
                        } else {
                            var20 = super.field6849;
                            var39 = super.field6849;
                            var18 = super.field6849;
                            var17 = super.field6849;
                        }
                        int var40 = super.field6838 * var37;
                        int var41 = super.field6842 * var37;
                        var21 = super.field6843 - -(super.field6839 * var11 + super.field6836 * var9 + var40 >> 14);
                        var22 = (super.field6852 * var9 + super.field6851 * var11 + var41 >> 14) + super.field6845;
                        var23 = super.field6832.field7340 * var21 / var17 + arg4.field1497;
                        var25 = super.field6832.field7363 * var22 / var17 + arg4.field1494;
                        var24 = (super.field6836 * var10 - -(super.field6839 * var11) + var40 >> 14) + super.field6843;
                        var27 = (super.field6851 * var11 + super.field6852 * var10 + var41 >> 14) + super.field6845;
                        var26 = super.field6832.field7340 * var24 / var18 + arg4.field1497;
                        var29 = super.field6832.field7363 * var27 / var18 + arg4.field1494;
                        int var42 = (super.field6839 * var12 + (super.field6836 * var10 - -var40) >> 14) + super.field6843;
                        var31 = arg4.field1497 - -(super.field6832.field7340 * var42 / var39);
                        int var43 = super.field6845 - -(super.field6852 * var10 + super.field6851 * var12 + var41 >> 14);
                        var33 = arg4.field1494 - -(super.field6832.field7363 * var43 / var39);
                        var32 = (super.field6839 * var12 + (super.field6836 * var9 - -var40) >> 14) + super.field6843;
                        var34 = super.field6845 - -(super.field6852 * var9 + super.field6851 * var12 + var41 >> 14);
                        var35 = super.field6832.field7340 * var32 / var20 + arg4.field1497;
                        var36 = arg4.field1494 - -(super.field6832.field7363 * var34 / var20);
                    }
                    if ((-var35 + var31) * (-var36 + var29) - (-var35 + var26) * (-var36 + var33) > 0) {
                        arg4.field1500 = ~var31 > -1 || ~var35 > -1 || ~var26 > -1 || var31 > arg4.field1495 || arg4.field1495 < var35 || ~arg4.field1495 > ~var26;
                        if (~var8.field1140 > -1) {
                            arg4.method811(var33, var36, var29, var31, var35, var26, var8.field1143 & 65535, var8.field1138 & 65535, 65535 & var8.field1142);
                        } else {
                            if (this.method2917(super.field6832.field8781.method2718(var8.field1140, (byte) 72).field1809)) {
                                arg4.field1496 = 100;
                            }
                            arg4.method822(var33, var36, var29, var31, var35, var26, 65535 & var8.field1143, 65535 & var8.field1138, var8.field1142 & 65535, var21, var24, var32, var22, var27, var34, var17, var18, var20, var8.field1140);
                            arg4.field1496 = 0;
                        }
                    }
                    if ((-var26 + var23) * (-var29 + var36) + -((var35 - var26) * (-var29 + var25)) > 0) {
                        arg4.field1500 = ~var23 > -1 || var26 < 0 || ~var35 > -1 || var23 > arg4.field1495 || var26 > arg4.field1495 || arg4.field1495 < var35;
                        if (var8.field1140 >= 0) {
                            if (this.method2917(super.field6832.field8781.method2718(var8.field1140, (byte) 72).field1809)) {
                                arg4.field1496 = 100;
                            }
                            arg4.method822(var25, var29, var36, var23, var26, var35, 65535 & var8.field1141, 65535 & var8.field1142, var8.field1138 & 65535, var21, var24, var32, var22, var27, var34, var17, var18, var20, var8.field1140);
                            arg4.field1496 = 0;
                            return;
                        }
                        arg4.method811(var25, var29, var36, var23, var26, var35, 65535 & var8.field1141, var8.field1142 & 65535, 65535 & var8.field1138);
                    }
                }
            } else {
                class166 var44 = super.field6840[arg2][arg1];
                if (var44 != null) {
                    if (super.field6849 == -1) {
                        for (int var45 = 0; ~var44.field1954 < ~var45; ++var45) {
                            int var46 = (arg2 << super.field1683) + var44.field1949[var45];
                            short var47 = var44.field1955[var45];
                            int var48 = var44.field1948[var45] - -(arg1 << super.field1683);
                            int var49 = (super.field6846 * var46 + super.field6847 * var48 + super.field6844 * var47 >> 14) + super.field6848;
                            if (~super.field6832.field7351 <= ~var49) {
                                return;
                            }
                            int var50 = (super.field6852 * var46 + super.field6851 * var48 + super.field6842 * var47 >> 14) + super.field6845;
                            int var51 = (super.field6839 * var48 + super.field6838 * var47 + super.field6836 * var46 >> 14) + super.field6843;
                            arg5[var45] = super.field6832.field7340 * var51 / var49 + arg4.field1497;
                            arg0[var45] = arg4.field1494 - -(super.field6832.field7363 * var50 / var49);
                        }
                    } else {
                        for (int var52 = 0; var44.field1954 > var52; ++var52) {
                            int var92 = var44.field1949[var52] - -(arg2 << super.field1683);
                            short var93 = var44.field1955[var52];
                            int var94 = var44.field1948[var52] - -(arg1 << super.field1683);
                            int var95 = (super.field6851 * var94 + super.field6852 * var92 + super.field6842 * var93 >> 14) + super.field6845;
                            int var96 = super.field6843 - -(super.field6838 * var93 + (super.field6836 * var92 - -(super.field6839 * var94)) >> 14);
                            arg5[var52] = arg4.field1497 - -(super.field6832.field7340 * var96 / super.field6849);
                            arg0[var52] = arg4.field1494 - -(super.field6832.field7363 * var95 / super.field6849);
                        }
                    }
                    if (var44.field1945 == null) {
                        for (int var53 = 0; var44.field1953 > var53; ++var53) {
                            short var54 = var44.field1950[var53];
                            short var55 = var44.field1946[var53];
                            short var56 = var44.field1943[var53];
                            int var57 = arg5[var54];
                            int var58 = arg5[var55];
                            int var59 = arg5[var56];
                            int var60 = arg0[var54];
                            int var61 = arg0[var55];
                            int var62 = arg0[var56];
                            if (~((-var58 + var57) * (-var61 + var62) - (-var58 + var59) * (-var61 + var60)) < -1) {
                                int var63 = var44.field1947[var53];
                                if (var63 != -1) {
                                    arg4.field1500 = ~var57 > -1 || ~var58 > -1 || ~var59 > -1 || arg4.field1495 < var57 || ~arg4.field1495 > ~var58 || ~arg4.field1495 > ~var59;
                                    arg4.method811(var60, var61, var62, var57, var58, var59, class497.method2710(var63, var44.field1952[var54], 127), class497.method2710(var63, var44.field1952[var55], 127), class497.method2710(var63, var44.field1952[var56], 127));
                                }
                            }
                        }
                    } else {
                        int var64 = super.field6853[arg2][arg1];
                        int var65 = super.field6853[arg2 + 1][arg1];
                        int var66 = super.field6853[arg2][arg1 + 1];
                        int var67 = super.field1686 * arg2;
                        int var68 = var67 - -super.field1686;
                        int var69 = super.field1686 * arg1;
                        int var70 = super.field1686 + var69;
                        int var71 = (super.field6836 * var67 + super.field6839 * var69 + super.field6838 * var64 >> 14) + super.field6843;
                        int var72 = (super.field6851 * var69 + (super.field6852 * var67 - -(super.field6842 * var64)) >> 14) + super.field6845;
                        int var73 = (super.field6847 * var69 + (super.field6846 * var67 - -(super.field6844 * var64)) >> 14) + super.field6848;
                        int var74 = super.field6843 - -(super.field6836 * var68 + super.field6839 * var69 + super.field6838 * var65 >> 14);
                        int var75 = (super.field6852 * var68 + super.field6842 * var65 - -(super.field6851 * var69) >> 14) + super.field6845;
                        int var76 = (super.field6847 * var69 + super.field6846 * var68 + super.field6844 * var65 >> 14) + super.field6848;
                        int var77 = super.field6843 - -(super.field6839 * var70 + super.field6836 * var67 - -(super.field6838 * var66) >> 14);
                        int var78 = super.field6845 - -(super.field6852 * var67 + super.field6851 * var70 + super.field6842 * var66 >> 14);
                        int var79 = (super.field6846 * var67 + super.field6847 * var70 + super.field6844 * var66 >> 14) + super.field6848;
                        for (int var80 = 0; var80 < var44.field1953; ++var80) {
                            short var81 = var44.field1950[var80];
                            short var82 = var44.field1946[var80];
                            short var83 = var44.field1943[var80];
                            int var84 = arg5[var81];
                            int var85 = arg5[var82];
                            int var86 = arg5[var83];
                            int var87 = arg0[var81];
                            int var88 = arg0[var82];
                            int var89 = arg0[var83];
                            if (~((var89 - var88) * (-var85 + var84) - (-var85 + var86) * (-var88 + var87)) < -1) {
                                arg4.field1500 = var84 < 0 || var85 < 0 || ~var86 > -1 || ~var84 < ~arg4.field1495 || ~arg4.field1495 > ~var85 || ~arg4.field1495 > ~var86;
                                short var90 = var44.field1945[var80];
                                if (var90 != -1) {
                                    if (this.method2917(super.field6832.field8781.method2718(var90, (byte) 72).field1809)) {
                                        arg4.field1496 = 100;
                                    }
                                    arg4.method822(var87, var88, var89, var84, var85, var86, var44.field1952[var81], var44.field1952[var82], var44.field1952[var83], var71, var74, var77, var72, var75, var78, var73, var76, var79, var90);
                                    arg4.field1496 = 0;
                                } else {
                                    int var91 = var44.field1947[var80];
                                    if (var91 != -1) {
                                        arg4.method811(var87, var88, var89, var84, var85, var86, class497.method2710(var91, var44.field1952[var81], 127), class497.method2710(var91, var44.field1952[var82], 127), class497.method2710(var91, var44.field1952[var83], 127));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field8528;
        class596 var9 = (class596) super.field6832.method937(Thread.currentThread());
        class123 var10 = var9.field7995;
        var10.field1500 = false;
        var10.field1496 = 0;
        if (super.field6850 != null) {
            this.method3507(arg3, arg1, arg7, arg4, arg5, var10, arg2, 0, var9.field9337, arg6, arg0, var9.field9319);
        } else if (super.field6837 != null) {
            this.method3509(arg4, arg3, arg7, arg0, arg6, var9.field9319, 0, arg2, arg1, var10, var9.field9337, arg5);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Led;)V")
    public static final void method3506(class660 arg0) {
        if (class303.field3838 < 65535) {
            class227 var1 = arg0.field8960;
            class370.field4785[class303.field3838] = arg0;
            class686.field9370[class303.field3838] = false;
            ++class303.field3838;
            int var2 = arg0.field8956;
            if (arg0.field8954) {
                var2 = 0;
            }
            int var3 = arg0.field8956;
            if (arg0.field8946) {
                var3 = class709.field9904 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method1370((byte) -5) - var1.method1367(-72) + class660.field8949 >> class480.field5972;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method1370((byte) -5) + var1.method1367(122) - class660.field8949 >> class480.field5972;
                if (var7 >= class36.field538) {
                    var7 = class36.field538 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field8958[var5++];
                    int var10 = (var1.method1374((byte) 48) - var1.method1367(-110) + class660.field8949 >> class480.field5972) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class546.field6871) {
                        var11 = class546.field6871 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class189.field2250[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class189.field2250[var4][var12][var8] = var13 | (long) class303.field3838;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class189.field2250[var4][var12][var8] = var13 | (long) class303.field3838 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class189.field2250[var4][var12][var8] = var13 | (long) class303.field3838 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class189.field2250[var4][var12][var8] = var13 | (long) class303.field3838 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II[[ZIILkc;II[III[I)V")
    private final void method3507(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4, class123 arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10, int[] arg11) {
        ++field8529;
        int var13 = (-arg3 + arg9) * arg6 / 256;
        arg5.field1507 = false;
        arg5.field1502 = false;
        int var14 = arg6 >> 8;
        int var15 = arg10;
        int var16 = arg1 + var13;
        for (int var17 = arg0; arg4 > var17; ++var17) {
            for (int var18 = arg3; var18 < arg9; ++var18) {
                if (arg2[-arg0 + var17][-arg3 + var18]) {
                    if (super.field6850[var17][var18] != null) {
                        class679 var19 = super.field6850[var17][var18];
                        if (~var19.field9239 != 0 && ~(2 & var19.field9246) == -1 && ~var19.field9244 == -1) {
                            int var20 = super.field6832.method3104(var19.field9239);
                            arg5.method811(-var14 + var16, var16 - var14, var16, var15 - -var14, var15, var14 + var15, class497.method2710(var20, var19.field9240, 127), class497.method2710(var20, var19.field9241, 127), class497.method2710(var20, var19.field9247, arg7 ^ 127));
                            arg5.method811(var16, var16, -var14 + var16, var15, var14 + var15, var15, class497.method2710(var20, var19.field9242, 127), class497.method2710(var20, var19.field9247, 127), class497.method2710(var20, var19.field9241, 127));
                        } else if (~var19.field9244 == -1) {
                            arg5.method816(-var14 + var16, var16 - var14, var16, var14 + var15, var15, var14 + var15, var19.field9240, var19.field9241, var19.field9247);
                            arg5.method816(var16, var16, -var14 + var16, var15, var14 + var15, var15, var19.field9242, var19.field9247, var19.field9241);
                        } else {
                            int var21 = var19.field9244;
                            arg5.method816(var16 - var14, -var14 + var16, var16, var14 + var15, var15, var15 - -var14, class232.method1402(4379, -16777216 & var19.field9240, var21), class232.method1402(4379, var19.field9241 & -16777216, var21), class232.method1402(4379, -16777216 & var19.field9247, var21));
                            arg5.method816(var16, var16, -var14 + var16, var15, var14 + var15, var15, class232.method1402(4379, -16777216 & var19.field9242, var21), class232.method1402(arg7 ^ 4379, -16777216 & var19.field9247, var21), class232.method1402(4379, var19.field9241 & -16777216, var21));
                        }
                    } else if (super.field6841[var17][var18] != null) {
                        class316 var22 = super.field6841[var17][var18];
                        for (int var23 = 0; ~var22.field3957 < ~var23; ++var23) {
                            arg11[var23] = var22.field3960[var23] * var14 / super.field1686 + var15;
                            arg8[var23] = var16 - var22.field3961[var23] * var14 / super.field1686;
                        }
                        for (int var24 = 0; var24 < var22.field3952; ++var24) {
                            int var25 = var24 * 3;
                            int var26 = var25 - -1;
                            int var27 = var26 + 1;
                            int var28 = arg11[var25];
                            int var29 = arg11[var26];
                            int var30 = arg11[var27];
                            int var31 = arg8[var25];
                            int var32 = arg8[var26];
                            int var33 = arg8[var27];
                            if (var22.field3953 != null && ~var22.field3953[var24] != -1 && (var22.field3959 == null || var22.field3959 != null && var22.field3959[var24] == -1)) {
                                int var34 = var22.field3953[var24];
                                arg5.method816(var31, var32, var33, var28, var29, var30, class232.method1402(4379, -(var22.field3958[var25] & -16777216) + -16777216, var34), class232.method1402(4379, -(-16777216 & var22.field3958[var26]) + -16777216, var34), class232.method1402(4379, -(var22.field3958[var27] & -16777216) + -16777216, var34));
                            } else if (var22.field3959 != null && ~var22.field3959[var24] != 0) {
                                int var35 = super.field6832.method3104(var22.field3959[var24]);
                                arg5.method811(var31, var32, var33, var28, var29, var30, var35, var35, var35);
                            } else {
                                arg5.method816(var31, var32, var33, var28, var29, var30, var22.field3958[var25], var22.field3958[var26], var22.field3958[var27]);
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var15 += var14;
            var16 = arg1 + var13;
        }
        arg5.field1502 = true;
        if (arg7 != 0) {
            method3510(-57, (class263) null, (class263) null);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lrr;III)V")
    public static final void method3508(class337 arg0, int arg1, int arg2, int arg3) {
        class576.field7412 = arg1;
        class502.field6256 = arg3;
        ++field8534;
        if (arg2 == -1354365800) {
            class228.field2941 = arg0;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II[[ZII[IIIILkc;[II)V")
    private final void method3509(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, class123 arg9, int[] arg10, int arg11) {
        ++field8532;
        if (arg6 != 0) {
            this.method3507(117, -46, (boolean[][]) null, 4, -33, (class123) null, -73, -93, (int[]) null, 6, 75, (int[]) null);
        }
        int var13 = (-arg0 + arg4) * arg7 / 256;
        int var14 = arg7 >> 8;
        arg9.field1502 = false;
        arg9.field1507 = false;
        int var15 = arg3;
        int var16 = arg8 + var13;
        for (int var17 = arg1; var17 < arg11; ++var17) {
            for (int var18 = arg0; ~var18 > ~arg4; ++var18) {
                if (arg2[var17 - arg1][-arg0 + var18]) {
                    if (super.field6837[var17][var18] != null) {
                        class88 var34 = super.field6837[var17][var18];
                        if (var34.field1140 != -1 && (var34.field1139 & 2) == 0 && ~var34.field1137 == 0) {
                            int var35 = super.field6832.method3104(var34.field1140);
                            arg9.method811(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, class497.method2710(var35, var34.field1143 & 65535, arg6 ^ 127), class497.method2710(var35, var34.field1138 & 65535, arg6 + 127), class497.method2710(var35, var34.field1142 & 65535, 127));
                            arg9.method811(var16, var16, -var14 + var16, var15, var14 + var15, var15, class497.method2710(var35, var34.field1141 & 65535, 127), class497.method2710(var35, 65535 & var34.field1142, arg6 ^ 127), class497.method2710(var35, 65535 & var34.field1138, 127));
                        } else if (var34.field1137 != -1) {
                            int var36 = var34.field1137;
                            arg9.method811(-var14 + var16, var16 - var14, var16, var14 + var15, var15, var14 + var15, var36, var36, var36);
                            arg9.method811(var16, var16, -var14 + var16, var15, var14 + var15, var15, var36, var36, var36);
                        } else {
                            arg9.method811(-var14 + var16, var16 - var14, var16, var14 + var15, var15, var14 + var15, var34.field1143 & 65535, 65535 & var34.field1138, 65535 & var34.field1142);
                            arg9.method811(var16, var16, -var14 + var16, var15, var14 + var15, var15, 65535 & var34.field1141, var34.field1142 & 65535, var34.field1138 & 65535);
                        }
                    } else if (super.field6840[var17][var18] != null) {
                        class166 var19 = super.field6840[var17][var18];
                        for (int var20 = 0; var20 < var19.field1954; ++var20) {
                            arg5[var20] = var15 - -(var19.field1949[var20] * var14 / super.field1686);
                            arg10[var20] = -(var19.field1948[var20] * var14 / super.field1686) + var16;
                        }
                        for (int var21 = 0; ~var21 > ~var19.field1953; ++var21) {
                            short var22 = var19.field1950[var21];
                            short var23 = var19.field1946[var21];
                            short var24 = var19.field1943[var21];
                            int var25 = arg5[var22];
                            int var26 = arg5[var23];
                            int var27 = arg5[var24];
                            int var28 = arg10[var22];
                            int var29 = arg10[var23];
                            int var30 = arg10[var24];
                            if (var19.field1951 != null && ~var19.field1951[var21] != 0) {
                                int var31 = var19.field1951[var21];
                                arg9.method811(var28, var29, var30, var25, var26, var27, class497.method2710(var31, var19.field1952[var22], 127), class497.method2710(var31, var19.field1952[var23], arg6 + 127), class497.method2710(var31, var19.field1952[var24], 127));
                            } else if (var19.field1945 != null && var19.field1945[var21] != -1) {
                                int var32 = super.field6832.method3104(var19.field1945[var21]);
                                arg9.method811(var28, var29, var30, var25, var26, var27, class497.method2710(var32, var19.field1952[var22], arg6 + 127), class497.method2710(var32, var19.field1952[var23], 127), class497.method2710(var32, var19.field1952[var24], 127));
                            } else {
                                int var33 = var19.field1947[var21];
                                arg9.method811(var28, var29, var30, var25, var26, var27, class497.method2710(var33, var19.field1952[var22], 127), class497.method2710(var33, var19.field1952[var23], 127), class497.method2710(var33, var19.field1952[var24], 127));
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var15 += var14;
            var16 = arg8 - -var13;
        }
        arg9.field1502 = true;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)V")
    public final void method186(int arg0, int arg1) {
        ++field8524;
        class596 var3 = (class596) super.field6832.method937(Thread.currentThread());
        var3.field7995.field1496 = 0;
        if (super.field6850 != null) {
            this.method3511(var3.field7995, super.field6832.field7343, arg1, var3.field9322, var3.field9319, (byte) 70, var3.field9337, arg0);
        } else if (super.field6837 != null) {
            this.method3505(var3.field9337, arg1, arg0, var3.field9322, var3.field7995, var3.field9319, false);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ILkd;Lkd;)V")
    public static final void method3510(int arg0, class263 arg1, class263 arg2) {
        ++field8533;
        if (arg1.field3319 != null) {
            arg1.method1566(-77);
        }
        arg1.field3320 = arg2;
        arg1.field3319 = arg2.field3319;
        arg1.field3319.field3320 = arg1;
        int var3 = 37 % ((89 - arg0) / 32);
        arg1.field3320.field3319 = arg1;
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Llea;IIII[[I[[II)V")
    public class628(class574 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lkc;ZI[I[IB[II)V")
    private final void method3511(class123 arg0, boolean arg1, int arg2, int[] arg3, int[] arg4, byte arg5, int[] arg6, int arg7) {
        ++field8527;
        class679 var9 = super.field6850[arg7][arg2];
        if (var9 != null) {
            if ((var9.field9246 & 2) == 0) {
                int var10 = super.field1686 * arg7;
                int var11 = var10 - -super.field1686;
                int var12 = super.field1686 * arg2;
                int var13 = super.field1686 + var12;
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
                if ((var9.field9246 & 1) != 0 && !arg1) {
                    int var18 = super.field6853[arg7][arg2];
                    if (~super.field6849 != 0) {
                        var19 = super.field6849;
                        var20 = super.field6849;
                        var21 = super.field6849;
                        var22 = super.field6849;
                    } else {
                        int var23 = super.field6844 * var18;
                        var22 = super.field6848 - -(super.field6847 * var12 + super.field6846 * var10 + var23 >> 14);
                        if (~var22 >= ~super.field6832.field7351) {
                            return;
                        }
                        var21 = (super.field6846 * var11 - -(super.field6847 * var12) + var23 >> 14) + super.field6848;
                        if (var21 <= super.field6832.field7351) {
                            return;
                        }
                        var20 = super.field6848 - -(super.field6847 * var13 + super.field6846 * var11 + var23 >> 14);
                        if (~var20 >= ~super.field6832.field7351) {
                            return;
                        }
                        var19 = super.field6848 - -(super.field6846 * var10 + super.field6847 * var13 + var23 >> 14);
                        if (var19 <= super.field6832.field7351) {
                            return;
                        }
                    }
                    if (super.field6832.field7375) {
                        int var24 = var22 - super.field6832.field7377;
                        if (~var24 < -1) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - super.field6832.field7377;
                        if (var25 > 0) {
                            var15 = var25;
                            if (~var25 < -256) {
                                var15 = 255;
                            }
                        }
                        int var26 = var20 - super.field6832.field7377;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = var19 - super.field6832.field7377;
                        if (~var27 < -1) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                    }
                    int var28 = super.field6838 * var18;
                    int var29 = super.field6842 * var18;
                    var30 = (super.field6839 * var12 + super.field6836 * var10 + var28 >> 14) + super.field6843;
                    var31 = (super.field6852 * var10 + super.field6851 * var12 + var29 >> 14) + super.field6845;
                    var32 = super.field6832.field7340 * var30 / var22 + arg0.field1497;
                    var33 = super.field6832.field7363 * var31 / var22 + arg0.field1494;
                    var34 = (super.field6839 * var12 + super.field6836 * var11 + var28 >> 14) + super.field6843;
                    var35 = super.field6832.field7340 * var34 / var21 + arg0.field1497;
                    var36 = (super.field6851 * var12 + super.field6852 * var11 + var29 >> 14) + super.field6845;
                    var37 = arg0.field1494 - -(super.field6832.field7363 * var36 / var21);
                    var38 = (super.field6836 * var11 + super.field6839 * var13 + var28 >> 14) + super.field6843;
                    var39 = (super.field6851 * var13 + super.field6852 * var11 + var29 >> 14) + super.field6845;
                    var40 = super.field6832.field7340 * var38 / var20 + arg0.field1497;
                    var41 = super.field6832.field7363 * var39 / var20 + arg0.field1494;
                    var42 = (super.field6839 * var13 + (super.field6836 * var10 - -var28) >> 14) + super.field6843;
                    var43 = super.field6832.field7340 * var42 / var19 + arg0.field1497;
                    var44 = (super.field6852 * var10 + super.field6851 * var13 + var29 >> 14) + super.field6845;
                    var45 = super.field6832.field7363 * var44 / var19 + arg0.field1494;
                } else {
                    int var46 = super.field6853[arg7][arg2];
                    int var47 = super.field6853[arg7 - -1][arg2];
                    int var48 = super.field6853[arg7 - -1][arg2 + 1];
                    int var49 = super.field6853[arg7][arg2 + 1];
                    if (~super.field6849 != 0) {
                        var19 = super.field6849;
                        var20 = super.field6849;
                        var21 = super.field6849;
                        var22 = super.field6849;
                    } else {
                        var22 = (super.field6846 * var10 + super.field6847 * var12 + super.field6844 * var46 >> 14) + super.field6848;
                        if (var22 <= super.field6832.field7351) {
                            return;
                        }
                        var21 = super.field6848 - -(super.field6846 * var11 + super.field6844 * var47 - -(super.field6847 * var12) >> 14);
                        if (var21 <= super.field6832.field7351) {
                            return;
                        }
                        var20 = (super.field6847 * var13 + super.field6846 * var11 + super.field6844 * var48 >> 14) + super.field6848;
                        if (~super.field6832.field7351 <= ~var20) {
                            return;
                        }
                        var19 = super.field6848 - -(super.field6846 * var10 + super.field6847 * var13 + super.field6844 * var49 >> 14);
                        if (~var19 >= ~super.field6832.field7351) {
                            return;
                        }
                    }
                    if (arg1) {
                        int var50 = -super.field6832.field7377 + var22;
                        if (var50 > 255) {
                            var50 = 255;
                        }
                        if (var50 > 0) {
                            var14 = var50;
                            int var51 = var9.field9248 * var50 / 255;
                            if (var51 > 0) {
                                var46 -= var51;
                            }
                        }
                        int var52 = -super.field6832.field7377 + var21;
                        if (~var52 < -256) {
                            var52 = 255;
                        }
                        if (~var52 < -1) {
                            var15 = var52;
                            int var53 = var9.field9238 * var52 / 255;
                            if (~var53 < -1) {
                                var47 -= var53;
                            }
                        }
                        int var54 = -super.field6832.field7377 + var20;
                        if (var54 > 255) {
                            var54 = 255;
                        }
                        if (var54 > 0) {
                            var16 = var54;
                            int var55 = var9.field9243 * var54 / 255;
                            if (~var55 < -1) {
                                var48 -= var55;
                            }
                        }
                        int var56 = -super.field6832.field7377 + var19;
                        if (var56 > 255) {
                            var56 = 255;
                        }
                        if (~var56 < -1) {
                            var17 = var56;
                            int var57 = var9.field9245 * var56 / 255;
                            if (~var57 < -1) {
                                var49 -= var57;
                            }
                        }
                    } else if (super.field6832.field7375) {
                        int var58 = -super.field6832.field7377 + var22;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = -super.field6832.field7377 + var21;
                        if (~var59 < -1) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = -super.field6832.field7377 + var20;
                        if (var60 > 0) {
                            var16 = var60;
                            if (~var60 < -256) {
                                var16 = 255;
                            }
                        }
                        int var61 = -super.field6832.field7377 + var19;
                        if (var61 > 0) {
                            var17 = var61;
                            if (~var61 < -256) {
                                var17 = 255;
                            }
                        }
                    }
                    var30 = (super.field6836 * var10 - (-(super.field6839 * var12) + -(super.field6838 * var46)) >> 14) + super.field6843;
                    var31 = (super.field6852 * var10 - (-(super.field6851 * var12) + -(super.field6842 * var46)) >> 14) + super.field6845;
                    var32 = super.field6832.field7340 * var30 / var22 + arg0.field1497;
                    var34 = (super.field6839 * var12 + super.field6838 * var47 + super.field6836 * var11 >> 14) + super.field6843;
                    var33 = super.field6832.field7363 * var31 / var22 + arg0.field1494;
                    var35 = super.field6832.field7340 * var34 / var21 + arg0.field1497;
                    var36 = (super.field6852 * var11 + super.field6842 * var47 - -(super.field6851 * var12) >> 14) + super.field6845;
                    var37 = super.field6832.field7363 * var36 / var21 + arg0.field1494;
                    var38 = (super.field6839 * var13 + super.field6838 * var48 + super.field6836 * var11 >> 14) + super.field6843;
                    var39 = (super.field6851 * var13 + super.field6852 * var11 + super.field6842 * var48 >> 14) + super.field6845;
                    var40 = super.field6832.field7340 * var38 / var20 + arg0.field1497;
                    var41 = super.field6832.field7363 * var39 / var20 + arg0.field1494;
                    var42 = (super.field6839 * var13 + (super.field6836 * var10 - -(super.field6838 * var49)) >> 14) + super.field6843;
                    var43 = super.field6832.field7340 * var42 / var19 + arg0.field1497;
                    var44 = (super.field6851 * var13 + super.field6852 * var10 + super.field6842 * var49 >> 14) + super.field6845;
                    var45 = super.field6832.field7363 * var44 / var19 + arg0.field1494;
                }
                boolean var62 = ~var9.field9239 != 0 && this.method2917(super.field6832.field8781.method2718(var9.field9239, (byte) 72).field1809);
                int var63 = var15 + var16 + var17;
                if (~((var40 - var43) * (-var45 + var37) + -((var35 - var43) * (-var45 + var41))) < -1) {
                    arg0.field1500 = ~var40 > -1 || var43 < 0 || ~var35 > -1 || ~var40 < ~arg0.field1495 || ~arg0.field1495 > ~var43 || arg0.field1495 < var35;
                    if (~var63 <= -766) {
                        arg0.method820(var41, var45, var37, var40, var43, var35, super.field6832.field7372);
                    } else {
                        if (var62) {
                            arg0.field1496 = 100;
                        }
                        if (var63 > 0) {
                            if (~var9.field9239 > -1) {
                                arg0.method816(var41, var45, var37, var40, var43, var35, class232.method1402(4379, var16 << 24 | super.field6832.field7372, var9.field9240), class232.method1402(4379, var17 << 24 | super.field6832.field7372, var9.field9241), class232.method1402(4379, super.field6832.field7372 | var15 << 24, var9.field9247));
                            } else {
                                arg0.method814(var41, var45, var37, var40, var43, var35, super.field6832.field7372, var16, var17, var15, var9.field9240, var9.field9241, var9.field9247, var38, var42, var34, var39, var44, var36, var20, var19, var21, var9.field9239);
                            }
                        } else if (var9.field9239 < 0) {
                            arg0.method816(var41, var45, var37, var40, var43, var35, var9.field9240, var9.field9241, var9.field9247);
                        } else {
                            arg0.method822(var41, var45, var37, var40, var43, var35, var9.field9240, var9.field9241, var9.field9247, var38, var42, var34, var39, var44, var36, var20, var19, var21, var9.field9239);
                        }
                        arg0.field1496 = 0;
                    }
                }
                int var64 = var14 + var15 + var17;
                if ((-var35 + var32) * (-var37 + var45) + -((-var35 + var43) * (-var37 + var33)) > 0) {
                    arg0.field1500 = ~var32 > -1 || ~var35 > -1 || ~var43 > -1 || var32 > arg0.field1495 || ~arg0.field1495 > ~var35 || var43 > arg0.field1495;
                    if (~var64 <= -766) {
                        arg0.method820(var33, var37, var45, var32, var35, var43, super.field6832.field7372);
                        return;
                    }
                    if (var62) {
                        arg0.field1496 = 100;
                    }
                    if (var64 > 0) {
                        if (var9.field9239 >= 0) {
                            arg0.method814(var33, var37, var45, var32, var35, var43, super.field6832.field7372, var14, var15, var17, var9.field9242, var9.field9247, var9.field9241, var30, var34, var42, var31, var36, var44, var22, var21, var19, var9.field9239);
                        } else {
                            arg0.method816(var33, var37, var45, var32, var35, var43, class232.method1402(4379, super.field6832.field7372 | var14 << 24, var9.field9242), class232.method1402(4379, super.field6832.field7372 | var15 << 24, var9.field9247), class232.method1402(4379, super.field6832.field7372 | var17 << 24, var9.field9241));
                        }
                    } else if (~var9.field9239 <= -1) {
                        arg0.method822(var33, var37, var45, var32, var35, var43, var9.field9242, var9.field9247, var9.field9241, var30, var34, var42, var31, var36, var44, var22, var21, var19, var9.field9239);
                    } else {
                        arg0.method816(var33, var37, var45, var32, var35, var43, var9.field9242, var9.field9247, var9.field9241);
                    }
                    arg0.field1496 = 0;
                }
            }
        } else if (arg5 >= 41) {
            class316 var65 = super.field6841[arg7][arg2];
            if (var65 != null) {
                if (super.field6849 == -1) {
                    for (int var66 = 0; ~var66 > ~var65.field3957; ++var66) {
                        int var67 = (arg7 << super.field1683) + var65.field3960[var66];
                        int var68 = var65.field3954[var66];
                        int var69 = (arg2 << super.field1683) + var65.field3961[var66];
                        int var70 = (super.field6846 * var67 + super.field6844 * var68 - -(super.field6847 * var69) >> 14) + super.field6848;
                        if (var70 <= super.field6832.field7351) {
                            return;
                        }
                        arg3[var66] = 0;
                        if (arg1) {
                            int var71 = -super.field6832.field7377 + var70;
                            if (var71 > 255) {
                                var71 = 255;
                            }
                            if (var71 > 0) {
                                arg3[var66] = var71;
                                int var72 = var65.field3956[var66] * var71 / 255;
                                if (var72 > 0) {
                                    var68 -= var72;
                                }
                            }
                        } else if (super.field6832.field7375) {
                            int var73 = -super.field6832.field7377 + var70;
                            if (var73 > 0) {
                                arg3[var66] = var73;
                                if (arg3[var66] > 255) {
                                    arg3[var66] = 255;
                                }
                            }
                        }
                        int var74 = (super.field6852 * var67 + super.field6851 * var69 - -(super.field6842 * var68) >> 14) + super.field6845;
                        int var75 = (super.field6839 * var69 + super.field6836 * var67 - -(super.field6838 * var68) >> 14) + super.field6843;
                        arg4[var66] = super.field6832.field7340 * var75 / var70 + arg0.field1497;
                        arg6[var66] = super.field6832.field7363 * var74 / var70 + arg0.field1494;
                    }
                } else {
                    for (int var76 = 0; var65.field3957 > var76; ++var76) {
                        int var116 = (arg7 << super.field1683) + var65.field3960[var76];
                        int var117 = var65.field3954[var76];
                        int var118 = var65.field3961[var76] - -(arg2 << super.field1683);
                        arg3[var76] = 0;
                        if (!arg1) {
                            if (super.field6832.field7375) {
                                int var119 = -super.field6832.field7377 + super.field6849;
                                if (~var119 < -1) {
                                    arg3[var76] = var119;
                                    if (arg3[var76] > 255) {
                                        arg3[var76] = 255;
                                    }
                                }
                            }
                        } else {
                            int var120 = -super.field6832.field7377 + super.field6849;
                            if (~var120 < -256) {
                                var120 = 255;
                            }
                            if (var120 > 0) {
                                arg3[var76] = var120;
                                int var121 = var65.field3956[var76] * var120 / 255;
                                if (var121 > 0) {
                                    var117 -= var121;
                                }
                            }
                        }
                        int var122 = (super.field6842 * var117 + super.field6852 * var116 + super.field6851 * var118 >> 14) + super.field6845;
                        int var123 = (super.field6839 * var118 + super.field6838 * var117 + super.field6836 * var116 >> 14) + super.field6843;
                        arg4[var76] = super.field6832.field7340 * var123 / super.field6849 + arg0.field1497;
                        arg6[var76] = super.field6832.field7363 * var122 / super.field6849 + arg0.field1494;
                    }
                }
                if (var65.field3959 == null) {
                    for (int var77 = 0; var65.field3952 > var77; ++var77) {
                        int var78 = var77 * 3;
                        int var79 = var78 + 1;
                        int var80 = var79 + 1;
                        int var81 = arg4[var78];
                        int var82 = arg4[var79];
                        int var83 = arg4[var80];
                        int var84 = arg6[var78];
                        int var85 = arg6[var79];
                        int var86 = arg6[var80];
                        int var87 = arg3[var78] + arg3[var79] + arg3[var80];
                        if (~((var81 - var82) * (-var85 + var86) + -((-var82 + var83) * (-var85 + var84))) < -1) {
                            arg0.field1500 = var81 < 0 || var82 < 0 || ~var83 > -1 || ~arg0.field1495 > ~var81 || var82 > arg0.field1495 || var83 > arg0.field1495;
                            if (~var87 <= -766) {
                                arg0.method820(var84, var85, var86, var81, var82, var83, super.field6832.field7372);
                            } else if (var87 > 0) {
                                if ((var65.field3958[var78] & 16777215) != 0) {
                                    arg0.method816(var84, var85, var86, var81, var82, var83, class29.method184(var65.field3958[var78], -16322, arg3[var78], super.field6832.field7372), class29.method184(var65.field3958[var79], -16322, arg3[var79], super.field6832.field7372), class29.method184(var65.field3958[var80], -16322, arg3[var80], super.field6832.field7372));
                                }
                            } else if ((16777215 & var65.field3958[var78]) != 0) {
                                arg0.method816(var84, var85, var86, var81, var82, var83, var65.field3958[var78], var65.field3958[var79], var65.field3958[var80]);
                            }
                        }
                    }
                } else {
                    int var88 = super.field6853[arg7][arg2];
                    int var89 = super.field6853[arg7 - -1][arg2];
                    int var90 = super.field6853[arg7][arg2 + 1];
                    int var91 = super.field1686 * arg7;
                    int var92 = super.field1686 + var91;
                    int var93 = super.field1686 * arg2;
                    int var94 = super.field1686 + var93;
                    int var95 = (super.field6839 * var93 + super.field6838 * var88 + super.field6836 * var91 >> 14) + super.field6843;
                    int var96 = (super.field6842 * var88 + (super.field6852 * var91 - -(super.field6851 * var93)) >> 14) + super.field6845;
                    int var97 = (super.field6844 * var88 + super.field6847 * var93 + super.field6846 * var91 >> 14) + super.field6848;
                    int var98 = (super.field6838 * var89 + super.field6836 * var92 - -(super.field6839 * var93) >> 14) + super.field6843;
                    int var99 = (super.field6852 * var92 + super.field6851 * var93 - -(super.field6842 * var89) >> 14) + super.field6845;
                    int var100 = (super.field6844 * var89 + super.field6847 * var93 + super.field6846 * var92 >> 14) + super.field6848;
                    int var101 = (super.field6839 * var94 + super.field6836 * var91 - -(super.field6838 * var90) >> 14) + super.field6843;
                    int var102 = (super.field6852 * var91 + super.field6842 * var90 - -(super.field6851 * var94) >> 14) + super.field6845;
                    int var103 = super.field6848 - -(super.field6844 * var90 + super.field6847 * var94 + super.field6846 * var91 >> 14);
                    for (int var104 = 0; var104 < var65.field3952; ++var104) {
                        int var105 = var104 * 3;
                        int var106 = var105 + 1;
                        int var107 = var106 + 1;
                        int var108 = arg4[var105];
                        int var109 = arg4[var106];
                        int var110 = arg4[var107];
                        int var111 = arg6[var105];
                        int var112 = arg6[var106];
                        int var113 = arg6[var107];
                        int var114 = arg3[var106] + arg3[var107] + arg3[var105];
                        if (~((-var109 + var108) * (-var112 + var113) + -((var111 - var112) * (-var109 + var110))) < -1) {
                            arg0.field1500 = ~var108 > -1 || var109 < 0 || ~var110 > -1 || ~var108 < ~arg0.field1495 || arg0.field1495 < var109 || var110 > arg0.field1495;
                            short var115 = var65.field3959[var104];
                            if (~var114 <= -766) {
                                arg0.method820(var111, var112, var113, var108, var109, var110, super.field6832.field7372);
                            } else {
                                if (var115 != -1 && this.method2917(super.field6832.field8781.method2718(var115, (byte) 72).field1809)) {
                                    arg0.field1496 = 100;
                                }
                                if (var114 > 0) {
                                    if (~var115 == 0) {
                                        if ((16777215 & var65.field3958[var105]) != 0) {
                                            arg0.method816(var111, var112, var113, var108, var109, var110, class232.method1402(4379, super.field6832.field7372 | arg3[var105] << 24, var65.field3958[var105]), class232.method1402(4379, super.field6832.field7372 | arg3[var106] << 24, var65.field3958[var106]), class232.method1402(4379, super.field6832.field7372 | arg3[var107] << 24, var65.field3958[var107]));
                                        }
                                    } else {
                                        arg0.method814(var111, var112, var113, var108, var109, var110, super.field6832.field7372, arg3[var105], arg3[var106], arg3[var107], var65.field3958[var105], var65.field3958[var106], var65.field3958[var107], var95, var98, var101, var96, var99, var102, var97, var100, var103, var115);
                                    }
                                } else if (~var115 != 0) {
                                    arg0.method822(var111, var112, var113, var108, var109, var110, var65.field3958[var105], var65.field3958[var106], var65.field3958[var107], var95, var98, var101, var96, var99, var102, var97, var100, var103, var115);
                                } else if (~(16777215 & var65.field3958[var105]) != -1) {
                                    arg0.method816(var111, var112, var113, var108, var109, var110, var65.field3958[var105], var65.field3958[var106], var65.field3958[var107]);
                                }
                                arg0.field1496 = 0;
                            }
                        }
                    }
                }
            }
        }
    }
}
