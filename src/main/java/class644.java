import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public abstract class class644 extends class280 {

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "S")
    public short field9265;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "[I")
    public static int[] field9264 = new int[2];

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "[[I")
    public static int[][] field9262 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "[I")
    public static int[] field9261 = new int[2];

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field9258;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field9259;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public static int field9260;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public static int field9263;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public static int field9266;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "(I)Lg;", line = 3)
    public static final class592 method3713(int arg0) {
        ++field9263;
        if (class537.field7803.length > class367.field5374) {
            return class537.field7803[class367.field5374++];
        } else {
            return arg0 != 31240 ? null : null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[Lwh;)I", line = 18)
    public final int method90(int arg0, class40[] arg1) {
        if (arg0 != -1) {
            this.method88(-82);
        }
        ++field9260;
        return this.method1794(super.field3923 >> class639.field9095, arg1, arg0, super.field3916 >> class639.field9095);
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(B)Z", line = 29)
    public final boolean method92(byte arg0) {
        if (arg0 <= 16) {
            method3713(-96);
        }
        ++field9258;
        return class437.field6237[(super.field3923 >> class639.field9095) + class430.field6190 + -class613.field8757][(super.field3916 >> class639.field9095) + -class140.field1915 + class430.field6190];
    }

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "(B)V", line = 44)
    public static void method3714(byte arg0) {
        field9262 = null;
        field9261 = null;
        if (arg0 == -48) {
            field9264 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[IIZI[I[IZ[[[BBIII[II[III)V", line = 56)
    public static final void method3715(int arg0, int[] arg1, int arg2, boolean arg3, int arg4, int[] arg5, int[] arg6, boolean arg7, byte[][][] arg8, byte arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14, int[] arg15, int arg16, int arg17) {
        ++field9259;
        if (~class270.field3833 != 0) {
            int[] var18 = class301.field4129.method247();
            int var19 = var18[0];
            if (arg4 >= -97) {
                field9261 = null;
            }
            int var20 = var18[1];
            int var21 = var18[2];
            int var22 = var18[3];
            int var23 = var21;
            int var24 = var22;
            if (class270.field3833 == 1) {
                var23 = (int) ((double) class327.field4442 * (double) var21 / (double) class492.field7090);
                var24 = (int) ((double) class327.field4442 * (double) var22 / (double) class492.field7090);
            }
            if (!class235.field3518) {
                if (~class270.field3833 == -2) {
                    class150.method1090(82);
                }
                int var25 = -class84.field1243 + arg17;
                int var26 = -class48.field791 + arg11;
                int var27 = -class468.field6675 + arg14;
                int var28 = (int) (((double) var27 * class385.field5572 + (double) var25 * class38.field487 + (double) var26 * class240.field3559) * (double) var23 / (double) arg12);
                int var29 = (int) (((double) var27 * class350.field5199 + (double) var25 * class288.field3994 + (double) var26 * class614.field8763) * (double) var24 / (double) arg12);
                double var30 = (double) var27 * class283.field3954 + (double) var25 * class660.field9442 + (double) var26 * class393.field5651;
                int var32 = class572.field8257 + var28 + -class730.field10239;
                int var33 = class678.field9625 + var29 + -class633.field8930;
                int var34 = class271.field3851 + var32;
                int var35 = class327.field4442 + var33;
                if ((~var32 > -1 || var33 < 0 || ~class222.field3279 > ~var34 || ~var35 < ~class492.field7090) && ~class270.field3833 != -3) {
                    if (var34 > 0 && var35 > 0 && ~class222.field3279 < ~var32 && ~class492.field7090 < ~var33) {
                        int var36 = var32 - class572.field8257;
                        int var37 = var33 - class678.field9625;
                        int var38 = 0;
                        int var39 = 0;
                        int var40 = 0;
                        int var41 = 0;
                        double var42 = 0.0D;
                        if (~class270.field3833 == -1) {
                            var42 = class360.field5281 + var30;
                            var38 = var36;
                            var39 = var37;
                        } else if (~class270.field3833 == -2) {
                            var41 = var37 / class519.field7488;
                            var40 = var36 / class381.field5523;
                            var38 = class381.field5523 * var40;
                            var39 = class519.field7488 * var41;
                            var42 = (class360.field5281 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + var37 * var37);
                        }
                        double var44 = -var42;
                        int var46 = 0;
                        int var47 = 0;
                        int var48 = 0;
                        int var49 = 0;
                        int var50 = 0;
                        int var51;
                        int var52;
                        int var53;
                        int var54;
                        if (var38 < 0) {
                            var51 = -var38;
                            var52 = class222.field3279 + var38;
                            var53 = 0;
                            var54 = var51;
                            if (~class270.field3833 == -2) {
                                var50 = -var40;
                                var48 = 0;
                            }
                        } else {
                            var51 = 0;
                            var52 = -var38 + class222.field3279;
                            if (class270.field3833 == 1) {
                                var50 = var40;
                                var48 = -var40 + class565.field8192;
                            }
                            var53 = var52;
                            var54 = var38;
                        }
                        int var55 = 0;
                        int var56;
                        int var57;
                        int var58;
                        int var59;
                        int var60;
                        int var61;
                        if (var39 >= 0) {
                            var56 = 0;
                            var57 = -var39 + class492.field7090;
                            var58 = var57;
                            var59 = 0;
                            if (class270.field3833 == 1) {
                                var49 = 0;
                                var46 = class595.field8451 - var41;
                                var47 = var41;
                                var55 = var46;
                            }
                            var60 = var57;
                            var61 = var39;
                        } else {
                            var56 = -var39;
                            var57 = class492.field7090 + var39;
                            var60 = 0;
                            var61 = var56;
                            var58 = var57;
                            var59 = var56;
                            if (class270.field3833 == 1) {
                                var46 = 0;
                                var47 = -var41;
                                var55 = class595.field8451 + var41;
                                var49 = var47;
                            }
                        }
                        class215 var62 = class639.field9052.field9626;
                        for (class603 var63 = (class603) var62.method1527(56); var63 != null; var63 = (class603) var62.method1523(true)) {
                            class373[] var69 = var63.field8543;
                            boolean var70 = true;
                            for (int var71 = 0; var71 < var69.length; ++var71) {
                                class373 var72 = var69[var71];
                                int var73 = var72.field5407;
                                int var74 = var72.field5410;
                                int var75 = var72.field5408;
                                int var76 = var72.field5411;
                                int var77;
                                var72.field5408 = var77 = -var38 + var75;
                                int var78 = var72.field5412;
                                int var79;
                                var72.field5411 = var79 = var76 - var39;
                                int var80;
                                var72.field5407 = var80 = -var38 + var73;
                                int var81;
                                var72.field5410 = var81 = var74 - var39;
                                if (var70) {
                                    int var82 = (var77 > var80 ? var80 : var77) + -var78;
                                    if (var82 <= class222.field3279) {
                                        int var83 = (~var81 <= ~var79 ? var79 : var81) - var78;
                                        if (~var83 >= ~class492.field7090) {
                                            int var84 = var78 + (var77 > var80 ? var77 : var80);
                                            if (~var84 <= -1) {
                                                int var85 = var78 + (var79 <= var81 ? var81 : var79);
                                                if (var85 >= 0) {
                                                    var70 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var70) {
                                var63.method814(127);
                                class111.method809(var63, true);
                            }
                        }
                        if (class270.field3833 == 0) {
                            class301.field4129.method1239(class675.field9607);
                        }
                        class301.field4129.method1254(-var38, -var39);
                        class301.field4129.method1249(var51, var56, var52, var57, var44);
                        class83.method668(class360.field5281 + var44, (byte) 120);
                        class252.field3649 = class360.field5281 + var44;
                        if (class270.field3833 == 1) {
                            class347.field5127 = -class633.field8930 + -var39 + var20;
                            class499.field7179 = -class730.field10239 + var19 + -var38;
                            class469.field6681 = var24;
                            class479.field6862 = var23;
                            class301.field4129.method398(class499.field7179, class347.field5127, class479.field6862, class469.field6681);
                        } else {
                            class347.field5127 = var20 - -class678.field9625 + -class633.field8930 - var39;
                            class479.field6862 = var23;
                            class469.field6681 = var24;
                            class499.field7179 = var19 - -class572.field8257 + -var38 + -class730.field10239;
                            class301.field4129.method398(class499.field7179, class347.field5127, class479.field6862, class469.field6681);
                        }
                        class3.method11(class639.field9052);
                        if (~var61 < -1) {
                            class301.field4129.method297(0, var60, class222.field3279, var60 + var61);
                            class301.field4129.method1235();
                            class301.field4129.method1240(class325.field4417);
                            class115.method818(arg2, arg17, arg11, arg14, arg8, arg1, arg6, arg15, arg5, arg13, arg10, arg9, arg0, arg16, arg3, arg7, arg12, 1, false);
                        }
                        if (~var54 < -1) {
                            class301.field4129.method297(var53, var59, var53 + var54, var58 + var59);
                            class301.field4129.method1235();
                            class301.field4129.method1240(class325.field4417);
                            class115.method818(arg2, arg17, arg11, arg14, arg8, arg1, arg6, arg15, arg5, arg13, arg10, arg9, arg0, arg16, arg3, arg7, arg12, 1, false);
                        }
                        class301.field4129.method328();
                        class294.method1844();
                        if (~class270.field3833 == -1) {
                            class301.field4129.method1224();
                        }
                        class730.field10239 += var38;
                        class360.field5281 += var44;
                        class633.field8930 += var39;
                        class72.field1098 = class572.field8257 - -var28 + -class730.field10239;
                        class677.field9619 = class678.field9625 - class633.field8930 + var29;
                        if (~class270.field3833 == -2) {
                            class641.field9120 += var40;
                            class647.field9322 += var41;
                            for (int var64 = 0; ~var64 > ~class595.field8451; ++var64) {
                                int var65 = class316.method1941(121, class647.field9322 + var64, class595.field8451) * class565.field8192;
                                for (int var66 = 0; var66 < class565.field8192; ++var66) {
                                    int var67 = class316.method1941(117, var66 - -class641.field9120, class565.field8192) + var65;
                                    boolean var68 = var64 >= var46 && var64 < var46 + var47 || var64 >= var49 && var64 < var49 + var55 && ~var66 <= ~var48 && var66 < var48 + var50;
                                    class577.field8283[var67].method687(class381.field5523 * var66, class519.field7488 * var64, class381.field5523, class519.field7488, 0, 0, var68, true);
                                }
                            }
                        }
                    } else {
                        class235.field3518 = true;
                    }
                } else {
                    class677.field9619 = var33;
                    if (class270.field3833 == 2) {
                        class360.field5281 = -var30;
                    }
                    class72.field1098 = var32;
                }
            }
            if (class235.field3518) {
                class72.field1098 = class572.field8257;
                class360.field5281 = 0.0D;
                class48.field791 = arg11;
                class468.field6675 = arg14;
                class633.field8930 = 0;
                class677.field9619 = class678.field9625;
                class84.field1243 = arg17;
                class730.field10239 = 0;
                if (~class270.field3833 == -1) {
                    class301.field4129.method1239(class675.field9607);
                }
                class301.field4129.method328();
                class301.field4129.method1235();
                class301.field4129.method1240(class325.field4417);
                class487.field7023.method854(class84.field1243, class48.field791, class468.field6675, class405.field5774, class662.field9461, class365.field5334);
                class301.field4129.method364(class487.field7023);
                if (class270.field3833 == 1) {
                    class469.field6681 = var24;
                    class479.field6862 = var23;
                    class347.field5127 = var20;
                    class499.field7179 = var19;
                    class301.field4129.method398(class499.field7179, class347.field5127, class479.field6862, class469.field6681);
                } else {
                    class469.field6681 = var24;
                    class479.field6862 = var23;
                    class499.field7179 = class572.field8257 + var19;
                    class347.field5127 = class678.field9625 + var20;
                    class301.field4129.method398(class499.field7179, class347.field5127, class479.field6862, class469.field6681);
                }
                class252.field3649 = 0.0D;
                class639.field9052.method3855(false);
                class3.method11(class639.field9052);
                class115.method818(arg2, arg17, arg11, arg14, arg8, arg1, arg6, arg15, arg5, arg13, arg10, arg9, arg0, arg16, arg3, arg7, arg12, 1, false);
                class294.method1844();
                class235.field3518 = false;
                if (class270.field3833 == 0) {
                    class301.field4129.method1224();
                }
                if (class270.field3833 == 1) {
                    class747.method4162(0);
                }
            }
            if (~class270.field3833 == -1) {
                class675.field9607.method686(class72.field1098, class677.field9619, class271.field3851, class327.field4442, 0, 0, true, true);
            }
            ++class721.field10151;
            class83.method668(class360.field5281, (byte) 120);
            class472.field6701 = class360.field5281;
            if (~class270.field3833 != -1 && ~class270.field3833 != -3) {
                if (~class270.field3833 == -2) {
                    class131.field1811 = var23;
                    class47.field775 = -class633.field8930 + var20;
                    class486.field7005 = var24;
                    class275.field3881 = -class730.field10239 + var19;
                    class301.field4129.method398(class275.field3881, class47.field775, class131.field1811, class486.field7005);
                    class301.field4129.method297(class72.field1098, class677.field9619, class72.field1098 - -class271.field3851, class677.field9619 + class327.field4442);
                }
            } else {
                if (~class270.field3833 == -3) {
                    class301.field4129.method1240(class325.field4417);
                    class301.field4129.method1235();
                }
                class486.field7005 = var24;
                class275.field3881 = class572.field8257 + var19 - class72.field1098 + -class730.field10239;
                class131.field1811 = var23;
                class47.field775 = -class633.field8930 + var20 + class678.field9625 - class677.field9619;
                class301.field4129.method398(class275.field3881, class47.field775, class131.field1811, class486.field7005);
            }
            class115.method818(arg2, arg17, arg11, arg14, arg8, arg1, arg6, arg15, arg5, arg13, arg10, arg9, arg0, arg16, arg3, arg7, arg12, ~class270.field3833 == -3 ? 0 : 2, class270.field3833 == 1);
            class301.field4129.method328();
            class301.field4129.method398(var19, var20, var21, var22);
        }
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)Z", line = 502)
    public final boolean method88(int arg0) {
        if (arg0 != -1) {
            this.field9265 = -119;
        }
        ++field9266;
        return class141.method998(super.field3923 >> class639.field9095, 125, super.field3916 >> class639.field9095, super.field3924);
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(IIIIII)V", line = 519)
    public class644(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9265 = (short) arg5;
        super.field3922 = arg1;
        super.field3920 = (byte) arg3;
        super.field3923 = arg0;
        super.field3924 = (byte) arg4;
        super.field3916 = arg2;
    }
}
