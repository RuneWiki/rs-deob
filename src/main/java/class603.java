import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class603 {

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "I")
    public static int field8412;

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "Lkfa;")
    public class603 field8413;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "Lha;")
    public static class60 field8409;

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "Llr;")
    public class752 field8410;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V")
    public final void method3335(int arg0) {
        field8411++;
        if (class122.field1585 >= 500) {
            return;
        }
        this.field8413 = class389.field5485;
        if (arg0 != 2) {
            this.field8410 = null;
        }
        this.field8410 = null;
        class122.field1585++;
        class389.field5485 = this;
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)V")
    public static void method3336(int arg0) {
        field8409 = null;
        if (arg0 != -1) {
            method3336(65);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II[[[BII[IZ[IBZII[II[II[IZ)V")
    public static final void method3337(int arg0, int arg1, byte[][][] arg2, int arg3, int arg4, int[] arg5, boolean arg6, int[] arg7, byte arg8, boolean arg9, int arg10, int arg11, int[] arg12, int arg13, int[] arg14, int arg15, int[] arg16, boolean arg17) {
        field8412++;
        if (class392.field5553 == -1) {
            return;
        }
        int[] var18 = field8409.method453();
        if (!arg9) {
            return;
        }
        int var19 = var18[0];
        int var20 = var18[1];
        int var21 = var18[2];
        int var22 = var18[3];
        int var23 = var21;
        int var24 = var22;
        if (class392.field5553 == 1) {
            var23 = (int) ((double) class135.field1726 * (double) var21 / (double) class569.field8021);
            var24 = (int) ((double) class135.field1726 * (double) var22 / (double) class569.field8021);
        }
        if (!class315.field4252) {
            if (class392.field5553 == 1) {
                class695.method3922(0);
            }
            int var25 = arg4 - class445.field6180;
            int var26 = arg0 - class678.field9461;
            int var27 = arg15 - class292.field3853;
            int var28 = (int) (((double) var27 * class161.field2029 + (double) var25 * class247.field3208 + (double) var26 * class242.field3147) * (double) var23 / (double) arg3);
            int var29 = (int) (((double) var27 * class412.field5822 + (double) var25 * class721.field10081 + (double) var26 * class376.field5222) * (double) var24 / (double) arg3);
            double var30 = (double) var27 * class275.field3675 + (double) var25 * class302.field4083 + (double) var26 * class572.field8053;
            int var32 = class459.field6352 + var28 - class31.field275;
            int var33 = var29 + class648.field9008 - class729.field10180;
            int var34 = var32 + class460.field6372;
            int var35 = var33 + class135.field1726;
            if (!(var32 < 0 || var33 < 0 || class582.field8155 < var34 || class569.field8021 < var35) || class392.field5553 == 2) {
                class435.field6103 = var32;
                class99.field1312 = var33;
                if (class392.field5553 == 2) {
                    class706.field9891 = -var30;
                }
            } else if (var34 > 0 && var35 > 0 && class582.field8155 > var32 && var33 < class569.field8021) {
                int var36 = var32 - class459.field6352;
                int var37 = var33 - class648.field9008;
                int var38 = 0;
                int var39 = 0;
                int var40 = 0;
                int var41 = 0;
                double var42 = 0.0D;
                if (class392.field5553 == 0) {
                    var42 = class706.field9891 + var30;
                    var38 = var36;
                    var39 = var37;
                } else if (class392.field5553 == 1) {
                    var41 = var37 / class759.field10586;
                    var40 = var36 / class377.field5235;
                    var39 = class759.field10586 * var41;
                    var38 = class377.field5235 * var40;
                    var42 = (class706.field9891 + var30) * (double) (var36 * var38 + (var37 * var39)) / (double) (var36 * var36 + var37 * var37);
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
                    var51 = class582.field8155 - var38;
                    var52 = 0;
                    if (class392.field5553 == 1) {
                        var50 = var40;
                        var48 = class56.field573 - var40;
                    }
                    var53 = var38;
                    var54 = var51;
                } else {
                    var54 = 0;
                    var52 = -var38;
                    var51 = class582.field8155 + var38;
                    var53 = var52;
                    if (class392.field5553 == 1) {
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
                if (var39 >= 0) {
                    var56 = 0;
                    var57 = class569.field8021 - var39;
                    if (class392.field5553 == 1) {
                        var49 = 0;
                        var47 = var41;
                        var46 = class676.field9447 - var41;
                        var55 = var46;
                    }
                    var58 = var57;
                    var59 = var57;
                    var60 = 0;
                    var61 = var39;
                } else {
                    var57 = class569.field8021 + var39;
                    var59 = 0;
                    var56 = -var39;
                    var61 = var56;
                    var60 = var56;
                    if (class392.field5553 == 1) {
                        var46 = 0;
                        var47 = -var41;
                        var55 = class676.field9447 + var41;
                        var49 = var47;
                    }
                    var58 = var57;
                }
                class29 var62 = class736.field10272.field9074;
                for (class62 var63 = (class62) var62.method113((byte) 15); var63 != null; var63 = (class62) var62.method119(false)) {
                    class486[] var69 = var63.field678;
                    boolean var70 = true;
                    for (int var71 = 0; var71 < var69.length; var71++) {
                        class486 var72 = var69[var71];
                        int var73 = var72.field6673;
                        int var74 = var72.field6675;
                        int var75 = var72.field6672;
                        int var76 = var72.field6674;
                        int var77;
                        var72.field6672 = var77 = var75 - var38;
                        int var78 = var72.field6671;
                        int var79;
                        var72.field6674 = var79 = var76 - var39;
                        int var80;
                        var72.field6673 = var80 = var73 - var38;
                        int var81;
                        var72.field6675 = var81 = var74 - var39;
                        if (var70) {
                            int var82 = (var77 <= var80 ? var77 : var80) - var78;
                            if (class582.field8155 >= var82) {
                                int var83 = (var81 < var79 ? var81 : var79) - var78;
                                if (class569.field8021 >= var83) {
                                    int var84 = var78 + (var77 > var80 ? var77 : var80);
                                    if (var84 >= 0) {
                                        int var85 = var78 + (var79 > var81 ? var79 : var81);
                                        if (var85 >= 0) {
                                            var70 = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var70) {
                        var63.method975((byte) -64);
                        class614.method3456(var63, 9);
                    }
                }
                if (class392.field5553 == 0) {
                    field8409.method339(class173.field2147);
                }
                field8409.method358(-var38, -var39);
                field8409.method428(var52, var56, var51, var57, var44);
                class344.method2021(class706.field9891 + var44, 14794);
                class757.field10561 = class706.field9891 + var44;
                if (class392.field5553 == 1) {
                    class144.field1867 = var20 - var39 - class729.field10180;
                    class468.field6473 = var19 - class31.field275 - var38;
                    class342.field4600 = var23;
                    class501.field6820 = var24;
                    field8409.method354(class468.field6473, class144.field1867, class342.field4600, class501.field6820);
                } else {
                    class144.field1867 = class648.field9008 + var20 - class729.field10180 - var39;
                    class468.field6473 = class459.field6352 + var19 - class31.field275 - var38;
                    class501.field6820 = var24;
                    class342.field4600 = var23;
                    field8409.method354(class468.field6473, class144.field1867, class342.field4600, class501.field6820);
                }
                class382.method2245(class736.field10272);
                if (var61 > 0) {
                    field8409.method426(0, var59, class582.field8155, var59 + var61);
                    field8409.method370();
                    field8409.method402(class235.field3092);
                    class589.method3280(arg13, arg4, arg0, arg15, arg2, arg7, arg16, arg12, arg14, arg5, arg1, arg8, arg10, arg11, arg6, arg17, arg3, 1, false);
                }
                if (var53 > 0) {
                    field8409.method426(var54, var60, var53 + var54, var60 - -var58);
                    field8409.method370();
                    field8409.method402(class235.field3092);
                    class589.method3280(arg13, arg4, arg0, arg15, arg2, arg7, arg16, arg12, arg14, arg5, arg1, arg8, arg10, arg11, arg6, arg17, arg3, 1, false);
                }
                field8409.method406();
                class131.method827();
                if (class392.field5553 == 0) {
                    field8409.method388();
                }
                class706.field9891 += var44;
                class729.field10180 += var39;
                class31.field275 += var38;
                class435.field6103 = class459.field6352 + var28 - class31.field275;
                class99.field1312 = var29 + class648.field9008 - class729.field10180;
                if (class392.field5553 == 1) {
                    class65.field716 += var41;
                    class122.field1606 += var40;
                    for (int var64 = 0; var64 < class676.field9447; var64++) {
                        int var65 = class304.method1837((byte) 6, var64 + class65.field716, class676.field9447) * class56.field573;
                        for (int var66 = 0; var66 < class56.field573; var66++) {
                            int var67 = class304.method1837((byte) 6, class122.field1606 + var66, class56.field573) + var65;
                            boolean var68 = var64 >= var46 && var64 < var46 + var47 || var49 <= var64 && var64 < var49 + var55 && var66 >= var48 && (var48 + var50) > var66;
                            class624.field8731[var67].method3450(class377.field5235 * var66, class759.field10586 * var64, class377.field5235, class759.field10586, 0, 0, var68, true);
                        }
                    }
                }
            } else {
                class315.field4252 = true;
            }
        }
        if (class315.field4252) {
            class706.field9891 = 0.0D;
            class435.field6103 = class459.field6352;
            class31.field275 = 0;
            class678.field9461 = arg0;
            class292.field3853 = arg15;
            class99.field1312 = class648.field9008;
            class445.field6180 = arg4;
            class729.field10180 = 0;
            if (class392.field5553 == 0) {
                field8409.method339(class173.field2147);
            }
            field8409.method406();
            field8409.method370();
            field8409.method402(class235.field3092);
            class527.field7074.method26(class445.field6180, class678.field9461, class292.field3853, class689.field9653, class581.field8134, class582.field8158);
            field8409.method367(class527.field7074);
            if (class392.field5553 == 1) {
                class342.field4600 = var23;
                class501.field6820 = var24;
                class144.field1867 = var20;
                class468.field6473 = var19;
                field8409.method354(class468.field6473, class144.field1867, class342.field4600, class501.field6820);
            } else {
                class501.field6820 = var24;
                class468.field6473 = class459.field6352 + var19;
                class342.field4600 = var23;
                class144.field1867 = class648.field9008 + var20;
                field8409.method354(class468.field6473, class144.field1867, class342.field4600, class501.field6820);
            }
            class757.field10561 = 0.0D;
            class736.field10272.method3675(0);
            class382.method2245(class736.field10272);
            class589.method3280(arg13, arg4, arg0, arg15, arg2, arg7, arg16, arg12, arg14, arg5, arg1, arg8, arg10, arg11, arg6, arg17, arg3, 1, false);
            class131.method827();
            class315.field4252 = false;
            if (class392.field5553 == 0) {
                field8409.method388();
            }
            if (class392.field5553 == 1) {
                class690.method3897(0);
            }
        }
        if (class392.field5553 == 0) {
            class173.field2147.method3453(class435.field6103, class99.field1312, class460.field6372, class135.field1726, 0, 0, true, true);
        }
        class339.field4577++;
        class344.method2021(class706.field9891, 14794);
        class105.field1408 = class706.field9891;
        if (class392.field5553 == 0 || class392.field5553 == 2) {
            if (class392.field5553 == 2) {
                field8409.method402(class235.field3092);
                field8409.method370();
            }
            class727.field10146 = var20 + class648.field9008 - class729.field10180 - class99.field1312;
            class689.field9657 = class459.field6352 + var19 - (class435.field6103 + class31.field275);
            class137.field1747 = var23;
            class215.field2601 = var24;
            field8409.method354(class689.field9657, class727.field10146, class137.field1747, class215.field2601);
        } else if (class392.field5553 == 1) {
            class689.field9657 = var19 - class31.field275;
            class727.field10146 = var20 - class729.field10180;
            class215.field2601 = var24;
            class137.field1747 = var23;
            field8409.method354(class689.field9657, class727.field10146, class137.field1747, class215.field2601);
            field8409.method426(class435.field6103, class99.field1312, class435.field6103 + class460.field6372, class99.field1312 + class135.field1726);
        }
        class589.method3280(arg13, arg4, arg0, arg15, arg2, arg7, arg16, arg12, arg14, arg5, arg1, arg8, arg10, arg11, arg6, arg17, arg3, class392.field5553 == 2 ? 0 : 2, class392.field5553 == 1);
        field8409.method406();
        field8409.method354(var19, var20, var21, var22);
    }
}
