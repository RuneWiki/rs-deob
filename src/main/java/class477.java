import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class477 {

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "J")
    public long field6192;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "Lck;")
    private class733 field6191;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "F")
    public static float field6185;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "Ld;")
    public static class284 field6188;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V", line = 3)
    public static final void method2681(int arg0, int arg1) {
        field6186++;
        class423.field5576 = arg0;
        if (arg1 != 0) {
            method2681(7, 52);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([[[BZIIIIZ[IIB[I[I[IIII[II)V", line = 14)
    public static final void method2682(byte[][][] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int[] arg7, int arg8, byte arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, int[] arg16, int arg17) {
        field6187++;
        if (class596.field7567 == -1 || arg13 != 20205) {
            return;
        }
        int[] var18 = class699.field9263.method916();
        int var19 = var18[0];
        int var20 = var18[1];
        int var21 = var18[2];
        int var22 = var18[3];
        int var23 = var21;
        int var24 = var22;
        if (class596.field7567 == 1) {
            var23 = (int) ((double) class524.field6671 * (double) var21 / (double) class386.field4933);
            var24 = (int) ((double) class524.field6671 * (double) var22 / (double) class386.field4933);
        }
        if (!class689.field8852) {
            if (class596.field7567 == 1) {
                class555.method3016((byte) -123);
            }
            int var25 = arg8 - class682.field8800;
            int var26 = arg15 - class450.field5872;
            int var27 = arg17 - class661.field8630;
            int var28 = (int) (((double) var27 * class64.field842 + (double) var25 * class329.field4027 + (double) var26 * class313.field3900) * (double) var23 / (double) arg4);
            int var29 = (int) (((double) var27 * class733.field9684 + (double) var25 * class595.field7565 + (double) var26 * class215.field2934) * (double) var24 / (double) arg4);
            double var30 = (double) var27 * class633.field8026 + (double) var25 * class585.field7402 + (double) var26 * class252.field3436;
            int var32 = class230.field3093 + var28 - class204.field2822;
            int var33 = class296.field3757 + var29 - class400.field5285;
            int var34 = class134.field1779 + var32;
            int var35 = class524.field6671 + var33;
            if (!(var32 < 0 || var33 < 0 || var34 > class669.field8694 || class386.field4933 < var35) || class596.field7567 == 2) {
                class329.field4033 = var33;
                class340.field4159 = var32;
                if (class596.field7567 == 2) {
                    class678.field8758 = -var30;
                }
            } else if (var34 > 0 && var35 > 0 && var32 < class669.field8694 && class386.field4933 > var33) {
                int var36 = var32 - class230.field3093;
                int var37 = var33 - class296.field3757;
                int var38 = 0;
                int var39 = 0;
                int var40 = 0;
                int var41 = 0;
                double var42 = 0.0D;
                if (class596.field7567 == 0) {
                    var38 = var36;
                    var39 = var37;
                    var42 = class678.field8758 + var30;
                } else if (class596.field7567 == 1) {
                    var40 = var36 / class65.field852;
                    var41 = var37 / class422.field5550;
                    var39 = class422.field5550 * var41;
                    var38 = class65.field852 * var40;
                    var42 = (class678.field8758 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + var37 * var37);
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
                if (var38 >= 0) {
                    var51 = 0;
                    var52 = class669.field8694 - var38;
                    var53 = var38;
                    if (class596.field7567 == 1) {
                        var50 = var40;
                        var48 = class66.field867 - var40;
                    }
                    var54 = var52;
                } else {
                    var51 = -var38;
                    var54 = 0;
                    var52 = class669.field8694 + var38;
                    var53 = var51;
                    if (class596.field7567 == 1) {
                        var50 = -var40;
                        var48 = 0;
                    }
                }
                int var55 = 0;
                int var56;
                int var57;
                int var58;
                int var59;
                int var60;
                int var61;
                if (var39 < 0) {
                    var56 = class386.field4933 + var39;
                    var57 = -var39;
                    var58 = 0;
                    var59 = var57;
                    var60 = var56;
                    if (class596.field7567 == 1) {
                        var46 = 0;
                        var47 = -var41;
                        var55 = class449.field5867 + var41;
                        var49 = var47;
                    }
                    var61 = var57;
                } else {
                    var57 = 0;
                    var56 = class386.field4933 - var39;
                    var60 = var56;
                    var58 = var56;
                    var59 = var39;
                    if (class596.field7567 == 1) {
                        var49 = 0;
                        var46 = class449.field5867 - var41;
                        var47 = var41;
                        var55 = var46;
                    }
                    var61 = 0;
                }
                class151 var62 = class734.field9967.field10644;
                for (class266 var63 = (class266) var62.method857(arg13 ^ 0xFFFFB159); var63 != null; var63 = (class266) var62.method864(true)) {
                    class706[] var69 = var63.field3533;
                    boolean var70 = true;
                    for (int var71 = 0; var71 < var69.length; var71++) {
                        class706 var72 = var69[var71];
                        int var73 = var72.field9321;
                        int var74 = var72.field9323;
                        int var75 = var72.field9322;
                        int var76 = var72.field9320;
                        int var77;
                        var72.field9322 = var77 = var75 - var38;
                        int var78;
                        var72.field9321 = var78 = var73 - var38;
                        int var79;
                        var72.field9323 = var79 = var74 - var39;
                        int var80;
                        var72.field9320 = var80 = var76 - var39;
                        int var81 = var72.field9325;
                        if (var70) {
                            int var82 = (var78 < var77 ? var78 : var77) - var81;
                            if (var82 <= class669.field8694) {
                                int var83 = (var79 >= var80 ? var80 : var79) - var81;
                                if (class386.field4933 >= var83) {
                                    int var84 = var81 + (var77 <= var78 ? var78 : var77);
                                    if (var84 >= 0) {
                                        int var85 = (var80 <= var79 ? var79 : var80) + var81;
                                        if (var85 >= 0) {
                                            var70 = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var70) {
                        var63.method3306(false);
                        class57.method348(var63, 18);
                    }
                }
                if (class596.field7567 == 0) {
                    class699.field9263.method905(class264.field3511);
                }
                class699.field9263.method988(-var38, -var39);
                class699.field9263.method894(var51, var57, var52, var56, var44);
                class589.method3168(class678.field8758 + var44, -93);
                class419.field5524 = class678.field8758 + var44;
                if (class596.field7567 == 1) {
                    class696.field9015 = var23;
                    class357.field4363 = var19 - var38 - class204.field2822;
                    class693.field8896 = var24;
                    class669.field8691 = var20 - var39 - class400.field5285;
                    class699.field9263.method967(class357.field4363, class669.field8691, class696.field9015, class693.field8896);
                } else {
                    class696.field9015 = var23;
                    class669.field8691 = class296.field3757 + var20 - var39 - class400.field5285;
                    class357.field4363 = class230.field3093 + var19 - class204.field2822 - var38;
                    class693.field8896 = var24;
                    class699.field9263.method967(class357.field4363, class669.field8691, class696.field9015, class693.field8896);
                }
                class433.method2487(class734.field9967);
                if (var59 > 0) {
                    class699.field9263.method915(0, var58, class669.field8694, var58 + var59);
                    class699.field9263.method937();
                    class699.field9263.method907(class423.field5576);
                    class139.method796(arg2, arg8, arg15, arg17, arg0, arg16, arg7, arg12, arg10, arg11, arg5, arg9, arg14, arg3, arg1, arg6, arg4, 1, false);
                }
                if (var53 > 0) {
                    class699.field9263.method915(var54, var61, var54 + var53, var61 - -var60);
                    class699.field9263.method937();
                    class699.field9263.method907(class423.field5576);
                    class139.method796(arg2, arg8, arg15, arg17, arg0, arg16, arg7, arg12, arg10, arg11, arg5, arg9, arg14, arg3, arg1, arg6, arg4, 1, false);
                }
                class699.field9263.method957();
                class38.method231();
                if (class596.field7567 == 0) {
                    class699.field9263.method962();
                }
                class400.field5285 += var39;
                class678.field8758 += var44;
                class204.field2822 += var38;
                class329.field4033 = var29 + class296.field3757 - class400.field5285;
                class340.field4159 = class230.field3093 + var28 - class204.field2822;
                if (class596.field7567 == 1) {
                    class235.field3224 += var41;
                    class5.field58 += var40;
                    for (int var64 = 0; var64 < class449.field5867; var64++) {
                        int var65 = class679.method3654(var64 + class235.field3224, class449.field5867, -4595) * class66.field867;
                        for (int var66 = 0; var66 < class66.field867; var66++) {
                            int var67 = var65 + class679.method3654(class5.field58 + var66, class66.field867, -4595);
                            boolean var68 = var64 >= var46 && var64 < var46 + var47 || var49 <= var64 && (var49 + var55) > var64 && var48 <= var66 && var66 < var48 + var50;
                            class465.field6034[var67].method3183(class65.field852 * var66, class422.field5550 * var64, class65.field852, class422.field5550, 0, 0, var68, true);
                        }
                    }
                }
            } else {
                class689.field8852 = true;
            }
        }
        if (class689.field8852) {
            class204.field2822 = 0;
            class340.field4159 = class230.field3093;
            class400.field5285 = 0;
            class329.field4033 = class296.field3757;
            class450.field5872 = arg15;
            class661.field8630 = arg17;
            class678.field8758 = 0.0D;
            class682.field8800 = arg8;
            if (class596.field7567 == 0) {
                class699.field9263.method905(class264.field3511);
            }
            class699.field9263.method957();
            class699.field9263.method937();
            class699.field9263.method907(class423.field5576);
            class467.field6041.method465(class682.field8800, class450.field5872, class661.field8630, class575.field7313, class203.field2814, class746.field10200);
            class699.field9263.method991(class467.field6041);
            if (class596.field7567 == 1) {
                class669.field8691 = var20;
                class357.field4363 = var19;
                class696.field9015 = var23;
                class693.field8896 = var24;
                class699.field9263.method967(class357.field4363, class669.field8691, class696.field9015, class693.field8896);
            } else {
                class669.field8691 = class296.field3757 + var20;
                class693.field8896 = var24;
                class357.field4363 = class230.field3093 + var19;
                class696.field9015 = var23;
                class699.field9263.method967(class357.field4363, class669.field8691, class696.field9015, class693.field8896);
            }
            class419.field5524 = 0.0D;
            class734.field9967.method4275(0);
            class433.method2487(class734.field9967);
            class139.method796(arg2, arg8, arg15, arg17, arg0, arg16, arg7, arg12, arg10, arg11, arg5, arg9, arg14, arg3, arg1, arg6, arg4, 1, false);
            class38.method231();
            class689.field8852 = false;
            if (class596.field7567 == 0) {
                class699.field9263.method962();
            }
            if (class596.field7567 == 1) {
                class81.method507(0);
            }
        }
        if (class596.field7567 == 0) {
            class264.field3511.method3182(class340.field4159, class329.field4033, class134.field1779, class524.field6671, 0, 0, true, true);
        }
        class398.field5255++;
        class589.method3168(class678.field8758, -47);
        class621.field7863 = class678.field8758;
        if (class596.field7567 == 0 || class596.field7567 == 2) {
            if (class596.field7567 == 2) {
                class699.field9263.method907(class423.field5576);
                class699.field9263.method937();
            }
            class271.field3570 = class230.field3093 + var19 - class204.field2822 - class340.field4159;
            class1.field2 = var24;
            class458.field5984 = var23;
            class72.field984 = var20 - (class400.field5285 - class296.field3757) - class329.field4033;
            class699.field9263.method967(class271.field3570, class72.field984, class458.field5984, class1.field2);
        } else if (class596.field7567 == 1) {
            class1.field2 = var24;
            class458.field5984 = var23;
            class271.field3570 = var19 - class204.field2822;
            class72.field984 = var20 - class400.field5285;
            class699.field9263.method967(class271.field3570, class72.field984, class458.field5984, class1.field2);
            class699.field9263.method915(class340.field4159, class329.field4033, class340.field4159 + class134.field1779, class524.field6671 + class329.field4033);
        }
        class139.method796(arg2, arg8, arg15, arg17, arg0, arg16, arg7, arg12, arg10, arg11, arg5, arg9, arg14, arg3, arg1, arg6, arg4, class596.field7567 == 2 ? 0 : 2, class596.field7567 == 1);
        class699.field9263.method957();
        class699.field9263.method967(var19, var20, var21, var22);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)Llia;", line = 462)
    public static final class200 method2683(byte arg0) {
        field6190++;
        if (arg0 >= -43) {
            method2683((byte) 47);
        }
        return class45.method275((byte) -66, 1);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 476)
    public static void method2684(int arg0) {
        field6188 = null;
        if (arg0 > -121) {
            field6188 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "finalize", descriptor = "()V", line = 487)
    protected final void finalize() throws Throwable {
        field6189++;
        this.field6191.method3966(this.field6192, false);
        super.finalize();
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lck;J[Ll;)V", line = 497)
    public class477(class733 arg0, long arg1, class668[] arg2) {
        this.field6192 = arg1;
        this.field6191 = arg0;
    }
}
