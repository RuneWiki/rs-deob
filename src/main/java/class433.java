import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class433 extends class739 {

    @OriginalMember(owner = "client!uba", name = "G", descriptor = "I")
    private int field5774 = 1;

    @OriginalMember(owner = "client!uba", name = "L", descriptor = "I")
    private int field5779 = 1;

    @OriginalMember(owner = "client!uba", name = "E", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!uba", name = "F", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!uba", name = "H", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!uba", name = "J", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!uba", name = "K", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!uba", name = "M", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!uba", name = "I", descriptor = "[Lwga;")
    public static class750[] field5776;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "([[[BIIBIZ[IIZ[IIII[II[I[II)V")
    public static final void method2474(byte[][][] arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int[] arg6, int arg7, boolean arg8, int[] arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14, int[] arg15, int[] arg16, int arg17) {
        ++field5777;
        if (arg10 != -21228) {
            field5776 = null;
        }
        if (~class259.field3281 != 0) {
            int[] var18 = class565.field7943.method509();
            int var19 = var18[0];
            int var20 = var18[1];
            int var21 = var18[2];
            int var22 = var18[3];
            int var23 = var21;
            int var24 = var22;
            if (class259.field3281 == 1) {
                var23 = (int) ((double) class640.field8891 * (double) var21 / (double) class631.field8709);
                var24 = (int) ((double) class640.field8891 * (double) var22 / (double) class631.field8709);
            }
            if (!class563.field7924) {
                if (~class259.field3281 == -2) {
                    class444.method2516(1);
                }
                int var25 = -class374.field4796 + arg14;
                int var26 = -class469.field6285 + arg4;
                int var27 = -class414.field5287 + arg12;
                int var28 = (int) (((double) var27 * class643.field8916 + (double) var25 * class111.field1607 + (double) var26 * class39.field602) * (double) var23 / (double) arg11);
                int var29 = (int) (((double) var27 * class746.field10388 + (double) var25 * class106.field1524 + (double) var26 * class615.field8489) * (double) var24 / (double) arg11);
                double var30 = (double) var27 * class7.field79 + (double) var25 * class198.field2705 + (double) var26 * class334.field4251;
                int var32 = class207.field2746 + var28 - class387.field4933;
                int var33 = class178.field2492 - (-var29 + class438.field5835);
                int var34 = class695.field9673 + var32;
                int var35 = class640.field8891 + var33;
                if ((var32 < 0 || var33 < 0 || ~var34 < ~class300.field3937 || class631.field8709 < var35) && class259.field3281 != 2) {
                    if (var34 > 0 && var35 > 0 && ~class300.field3937 < ~var32 && var33 < class631.field8709) {
                        int var36 = var32 - class207.field2746;
                        int var37 = -class178.field2492 + var33;
                        int var38 = 0;
                        int var39 = 0;
                        int var40 = 0;
                        int var41 = 0;
                        double var42 = 0.0D;
                        if (class259.field3281 != 0) {
                            if (~class259.field3281 == -2) {
                                var41 = var37 / class543.field7592;
                                var40 = var36 / class409.field5194;
                                var38 = class409.field5194 * var40;
                                var39 = class543.field7592 * var41;
                                var42 = (class472.field6326 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 - -(var37 * var37));
                            }
                        } else {
                            var38 = var36;
                            var42 = class472.field6326 + var30;
                            var39 = var37;
                        }
                        double var44 = -var42;
                        int var46 = 0;
                        int var47 = 0;
                        int var48 = 0;
                        int var49 = 0;
                        int var50 = 0;
                        int var51 = 0;
                        int var52;
                        int var53;
                        int var54;
                        int var55;
                        if (~var38 > -1) {
                            var52 = class300.field3937 + var38;
                            var53 = 0;
                            var54 = -var38;
                            if (~class259.field3281 == -2) {
                                var50 = -var40;
                                var48 = 0;
                            }
                            var55 = var54;
                        } else {
                            var52 = -var38 + class300.field3937;
                            var54 = 0;
                            if (class259.field3281 == 1) {
                                var50 = var40;
                                var48 = -var40 + class15.field303;
                            }
                            var55 = var38;
                            var53 = var52;
                        }
                        int var56;
                        int var57;
                        int var58;
                        int var59;
                        int var60;
                        int var61;
                        if (var39 < 0) {
                            var56 = -var39;
                            var57 = class631.field8709 + var39;
                            var58 = 0;
                            var59 = var56;
                            var60 = var57;
                            var61 = var56;
                            if (class259.field3281 == 1) {
                                var47 = -var41;
                                var46 = 0;
                                var51 = class405.field5126 + var41;
                                var49 = var47;
                            }
                        } else {
                            var57 = class631.field8709 - var39;
                            var56 = 0;
                            var61 = 0;
                            var59 = var39;
                            var58 = var57;
                            if (~class259.field3281 == -2) {
                                var47 = var41;
                                var46 = class405.field5126 - var41;
                                var49 = 0;
                                var51 = var46;
                            }
                            var60 = var57;
                        }
                        class23 var62 = class407.field5164.field8902;
                        for (class635 var63 = (class635) var62.method162(-22305); var63 != null; var63 = (class635) var62.method158(false)) {
                            class314[] var69 = var63.field8760;
                            boolean var70 = true;
                            for (int var71 = 0; var71 < var69.length; ++var71) {
                                class314 var72 = var69[var71];
                                int var73 = var72.field4102;
                                int var74 = var72.field4098;
                                int var75 = var72.field4101;
                                int var76 = var72.field4100;
                                int var77 = var72.field4103;
                                int var78;
                                var72.field4098 = var78 = var74 - var39;
                                int var79;
                                var72.field4101 = var79 = -var38 + var75;
                                int var80;
                                var72.field4100 = var80 = -var39 + var76;
                                int var81;
                                var72.field4102 = var81 = -var38 + var73;
                                if (var70) {
                                    int var82 = -var77 + (var81 >= var79 ? var79 : var81);
                                    if (var82 <= class300.field3937) {
                                        int var83 = (~var78 <= ~var80 ? var80 : var78) - var77;
                                        if (class631.field8709 >= var83) {
                                            int var84 = var77 + (~var81 > ~var79 ? var79 : var81);
                                            if (~var84 <= -1) {
                                                int var85 = var77 + (var80 > var78 ? var80 : var78);
                                                if (var85 >= 0) {
                                                    var70 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var70) {
                                var63.method3835(0);
                                class358.method2077((byte) -14, var63);
                            }
                        }
                        if (~class259.field3281 == -1) {
                            class565.field7943.method550(class55.field761);
                        }
                        class565.field7943.method493(-var38, -var39);
                        class565.field7943.method524(var54, var56, var52, var57, var44);
                        class622.method3498(-119, class472.field6326 + var44);
                        class16.field327 = class472.field6326 + var44;
                        if (class259.field3281 == 1) {
                            class708.field9835 = var24;
                            class698.field9715 = var20 - class438.field5835 + -var39;
                            class130.field1837 = var23;
                            class491.field6979 = -class387.field4933 + -var38 + var19;
                            class565.field7943.method437(class491.field6979, class698.field9715, class130.field1837, class708.field9835);
                        } else {
                            class130.field1837 = var23;
                            class491.field6979 = -var38 + var19 - (-class207.field2746 - -class387.field4933);
                            class698.field9715 = -class438.field5835 + class178.field2492 - var39 + var20;
                            class708.field9835 = var24;
                            class565.field7943.method437(class491.field6979, class698.field9715, class130.field1837, class708.field9835);
                        }
                        class239.method1494(class407.field5164);
                        if (~var59 < -1) {
                            class565.field7943.method534(0, var58, class300.field3937, var58 + var59);
                            class565.field7943.method512();
                            class565.field7943.method462(class526.field7351);
                            class595.method3372(arg1, arg14, arg4, arg12, arg0, arg6, arg15, arg13, arg16, arg9, arg7, arg3, arg17, arg2, arg5, arg8, arg11, 1, false);
                        }
                        if (~var55 < -1) {
                            class565.field7943.method534(var53, var61, var53 + var55, var60 + var61);
                            class565.field7943.method512();
                            class565.field7943.method462(class526.field7351);
                            class595.method3372(arg1, arg14, arg4, arg12, arg0, arg6, arg15, arg13, arg16, arg9, arg7, arg3, arg17, arg2, arg5, arg8, arg11, 1, false);
                        }
                        class565.field7943.method446();
                        class335.method1931();
                        if (~class259.field3281 == -1) {
                            class565.field7943.method444();
                        }
                        class387.field4933 += var38;
                        class438.field5835 += var39;
                        class472.field6326 += var44;
                        class480.field6536 = -class438.field5835 + var29 + class178.field2492;
                        class89.field1237 = class207.field2746 + var28 - class387.field4933;
                        if (class259.field3281 == 1) {
                            class124.field1784 += var41;
                            class405.field5127 += var40;
                            for (int var64 = 0; ~var64 > ~class405.field5126; ++var64) {
                                int var65 = class759.method4223(class124.field1784 + var64, class405.field5126, -18845) * class15.field303;
                                for (int var66 = 0; var66 < class15.field303; ++var66) {
                                    int var67 = var65 - -class759.method4223(class405.field5127 + var66, class15.field303, arg10 + 2383);
                                    boolean var68 = var46 <= var64 && ~var64 > ~(var46 + var47) || var49 <= var64 && ~var64 > ~(var49 - -var51) && var66 >= var48 && ~var66 > ~(var48 + var50);
                                    class313.field4093[var67].method2341(class409.field5194 * var66, class543.field7592 * var64, class409.field5194, class543.field7592, 0, 0, var68, true);
                                }
                            }
                        }
                    } else {
                        class563.field7924 = true;
                    }
                } else {
                    class480.field6536 = var33;
                    if (~class259.field3281 == -3) {
                        class472.field6326 = -var30;
                    }
                    class89.field1237 = var32;
                }
            }
            if (class563.field7924) {
                class480.field6536 = class178.field2492;
                class374.field4796 = arg14;
                class89.field1237 = class207.field2746;
                class387.field4933 = 0;
                class438.field5835 = 0;
                class414.field5287 = arg12;
                class469.field6285 = arg4;
                class472.field6326 = 0.0D;
                if (class259.field3281 == 0) {
                    class565.field7943.method550(class55.field761);
                }
                class565.field7943.method446();
                class565.field7943.method512();
                class565.field7943.method462(class526.field7351);
                class277.field3474.method592(class374.field4796, class469.field6285, class414.field5287, class542.field7499, class289.field3788, class713.field9903);
                class565.field7943.method505(class277.field3474);
                if (~class259.field3281 != -2) {
                    class491.field6979 = class207.field2746 + var19;
                    class708.field9835 = var24;
                    class130.field1837 = var23;
                    class698.field9715 = class178.field2492 + var20;
                    class565.field7943.method437(class491.field6979, class698.field9715, class130.field1837, class708.field9835);
                } else {
                    class698.field9715 = var20;
                    class708.field9835 = var24;
                    class491.field6979 = var19;
                    class130.field1837 = var23;
                    class565.field7943.method437(class491.field6979, class698.field9715, class130.field1837, class708.field9835);
                }
                class16.field327 = 0.0D;
                class407.field5164.method3603(-14913);
                class239.method1494(class407.field5164);
                class595.method3372(arg1, arg14, arg4, arg12, arg0, arg6, arg15, arg13, arg16, arg9, arg7, arg3, arg17, arg2, arg5, arg8, arg11, 1, false);
                class335.method1931();
                class563.field7924 = false;
                if (~class259.field3281 == -1) {
                    class565.field7943.method444();
                }
                if (class259.field3281 == 1) {
                    class629.method3530((byte) 82);
                }
            }
            if (class259.field3281 == 0) {
                class55.field761.method2343(class89.field1237, class480.field6536, class695.field9673, class640.field8891, 0, 0, true, true);
            }
            ++class224.field2988;
            class622.method3498(113, class472.field6326);
            class740.field10330 = class472.field6326;
            if (~class259.field3281 != -1 && class259.field3281 != 2) {
                if (~class259.field3281 == -2) {
                    class545.field7605 = var23;
                    class70.field986 = var24;
                    class649.field9013 = -class387.field4933 + var19;
                    class710.field9855 = -class438.field5835 + var20;
                    class565.field7943.method437(class649.field9013, class710.field9855, class545.field7605, class70.field986);
                    class565.field7943.method534(class89.field1237, class480.field6536, class89.field1237 + class695.field9673, class640.field8891 + class480.field6536);
                }
            } else {
                if (~class259.field3281 == -3) {
                    class565.field7943.method462(class526.field7351);
                    class565.field7943.method512();
                }
                class649.field9013 = var19 - class387.field4933 + class207.field2746 - class89.field1237;
                class70.field986 = var24;
                class545.field7605 = var23;
                class710.field9855 = -class438.field5835 + var20 + class178.field2492 + -class480.field6536;
                class565.field7943.method437(class649.field9013, class710.field9855, class545.field7605, class70.field986);
            }
            class595.method3372(arg1, arg14, arg4, arg12, arg0, arg6, arg15, arg13, arg16, arg9, arg7, arg3, arg17, arg2, arg5, arg8, arg11, class259.field3281 != 2 ? 2 : 0, class259.field3281 == 1);
            class565.field7943.method446();
            class565.field7943.method437(var19, var20, var21, var22);
        }
    }

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "(Z)V")
    public static void method2475(boolean arg0) {
        if (arg0) {
            field5776 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "()V")
    public class433() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)[I")
    public final int[] method215(int arg0, int arg1) {
        if (arg0 != -23347) {
            this.field5779 = -94;
        }
        ++field5773;
        int[] var3 = super.field10311.method2116(arg1, (byte) 53);
        if (super.field10311.field4728) {
            int var4 = this.field5779 + 1 + this.field5779;
            int var5 = 65536 / var4;
            int var6 = this.field5774 - -this.field5774 - -1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field5779 + arg1; ~(arg1 - -this.field5779) <= ~var9; ++var9) {
                int[] var13 = this.method4115(-121, var9 & class683.field9515, 0);
                int[] var14 = new int[class29.field523];
                int var15 = 0;
                for (int var16 = -this.field5774; var16 <= this.field5774; ++var16) {
                    var15 += var13[class346.field4366 & var16];
                }
                int var17 = 0;
                while (~var17 > ~class29.field523) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class346.field4366 & -this.field5774 + var17];
                    ++var17;
                    var15 = var13[this.field5774 + var17 & class346.field4366] + var18;
                }
                var8[var9 - -this.field5779 + -arg1] = var14;
            }
            for (int var10 = 0; class29.field523 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "(I)V")
    public static final void method2476(int arg0) {
        ++field5772;
        int var1 = 71 % ((arg0 - -11) / 33);
        for (int var2 = 0; ~var2 > -101; ++var2) {
            class559.field7782[var2] = true;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        ++field5775;
        if (arg2 == -3) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        super.field10297 = arg0.method2600((byte) -126) == 1;
                    }
                } else {
                    this.field5779 = arg0.method2600((byte) -126);
                }
            } else {
                this.field5774 = arg0.method2600((byte) -125);
            }
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BI)[[I")
    public final int[][] method223(byte arg0, int arg1) {
        if (arg0 < 26) {
            return null;
        } else {
            ++field5778;
            int[][] var3 = super.field10312.method2191((byte) 52, arg1);
            if (super.field10312.field4922) {
                int var4 = this.field5779 - -this.field5779 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field5774 + 1 - -this.field5774;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field5779 + arg1; ~(this.field5779 + arg1) <= ~var9; ++var9) {
                    int[][] var19 = this.method4119(2, 0, class683.field9515 & var9);
                    int[][] var20 = new int[3][class29.field523];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field5774; this.field5774 >= var27; ++var27) {
                        int var37 = var27 & class346.field4366;
                        var21 += var24[var37];
                        var23 += var26[var37];
                        var22 += var25[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (var31 < class29.field523) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = class346.field4366 & var31 - this.field5774;
                        int var33 = var23 - var26[var32];
                        int var34 = var22 - var25[var32];
                        int var35 = var21 - var24[var32];
                        ++var31;
                        int var36 = this.field5774 + var31 & class346.field4366;
                        var23 = var26[var36] + var33;
                        var21 = var24[var36] + var35;
                        var22 = var25[var36] + var34;
                    }
                    var8[this.field5779 + var9 + -arg1] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; class29.field523 > var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var4 > var17; ++var17) {
                        int[][] var18 = var8[var17];
                        var14 += var18[0][var13];
                        var15 += var18[1][var13];
                        var16 += var18[2][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }
}
