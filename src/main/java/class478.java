import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class478 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lfha;")
    public static class522 field6510 = new class522();

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field6513 = 0;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lmd;")
    public static class624 field6515;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 10)
    public static void method2827(int arg0) {
        field6515 = null;
        if (arg0 != 0) {
            method2827(63);
        }
        field6510 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BIII[II[I[[[B[IZZ[IIIIIZ[I)V", line = 21)
    public static final void method2828(byte arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, byte[][][] arg7, int[] arg8, boolean arg9, boolean arg10, int[] arg11, int arg12, int arg13, int arg14, int arg15, boolean arg16, int[] arg17) {
        field6512++;
        if (class589.field8461 == -1) {
            return;
        }
        int[] var18 = class410.field5731.method2107();
        int var19 = var18[0];
        int var20 = var18[1];
        int var21 = var18[2];
        int var22 = var18[3];
        int var23 = var21;
        int var24 = var22;
        if (class589.field8461 == 1) {
            var23 = (int) ((double) class54.field756 * (double) var21 / (double) class647.field9167);
            var24 = (int) ((double) class54.field756 * (double) var22 / (double) class647.field9167);
        }
        if (!class380.field5357) {
            if (class589.field8461 == 1) {
                class654.method3779(128);
            }
            int var25 = arg5 - class632.field9001;
            int var26 = arg2 - class654.field9231;
            int var27 = arg12 - class382.field5365;
            int var28 = (int) (((double) var27 * class253.field3503 + (double) var25 * class287.field3780 + (double) var26 * class366.field4704) * (double) var23 / (double) arg3);
            int var29 = (int) (((double) var27 * class378.field5260 + (double) var25 * class498.field6981 + (double) var26 * class557.field7926) * (double) var24 / (double) arg3);
            double var30 = (double) var27 * class683.field9603 + (double) var25 * class70.field992 + (double) var26 * class551.field7789;
            int var32 = class608.field8659 + var28 - class528.field7380;
            int var33 = class481.field6530 + var29 - class623.field8904;
            int var34 = var32 + class45.field658;
            int var35 = var33 + class54.field756;
            if (!(var32 < 0 || var33 < 0 || class577.field8260 < var34 || var35 > class647.field9167) || class589.field8461 == 2) {
                class720.field10169 = var33;
                class694.field9698 = var32;
                if (class589.field8461 == 2) {
                    class608.field8649 = -var30;
                }
            } else if (var34 > 0 && var35 > 0 && class577.field8260 > var32 && class647.field9167 > var33) {
                int var36 = var32 - class608.field8659;
                int var37 = var33 - class481.field6530;
                int var38 = 0;
                int var39 = 0;
                int var40 = 0;
                int var41 = 0;
                double var42 = 0.0D;
                if (class589.field8461 == 0) {
                    var39 = var37;
                    var38 = var36;
                    var42 = class608.field8649 + var30;
                } else if (class589.field8461 == 1) {
                    var41 = var37 / class459.field6317;
                    var40 = var36 / class61.field829;
                    var38 = class61.field829 * var40;
                    var39 = class459.field6317 * var41;
                    var42 = (class608.field8649 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + var37 * var37);
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
                if (var38 < 0) {
                    var52 = -var38;
                    var53 = 0;
                    var54 = class577.field8260 + var38;
                    if (class589.field8461 == 1) {
                        var50 = -var40;
                        var48 = 0;
                    }
                    var55 = var52;
                } else {
                    var54 = class577.field8260 - var38;
                    var52 = 0;
                    if (class589.field8461 == 1) {
                        var48 = class209.field2976 - var40;
                        var50 = var40;
                    }
                    var55 = var38;
                    var53 = var54;
                }
                int var56;
                int var57;
                int var58;
                int var59;
                int var60;
                int var61;
                if (var39 >= 0) {
                    var56 = 0;
                    var57 = class647.field9167 - var39;
                    var58 = var39;
                    var59 = 0;
                    var60 = var57;
                    if (class589.field8461 == 1) {
                        var49 = 0;
                        var46 = class446.field6100 - var41;
                        var47 = var41;
                        var51 = var46;
                    }
                    var61 = var57;
                } else {
                    var61 = 0;
                    var57 = class647.field9167 + var39;
                    var56 = -var39;
                    var58 = var56;
                    var60 = var57;
                    if (class589.field8461 == 1) {
                        var46 = 0;
                        var47 = -var41;
                        var51 = class446.field6100 + var41;
                        var49 = var47;
                    }
                    var59 = var56;
                }
                class336 var62 = class216.field3059.field4135;
                for (class596 var63 = (class596) var62.method1945(false); var63 != null; var63 = (class596) var62.method1944(9408)) {
                    class247[] var69 = var63.field8579;
                    boolean var70 = true;
                    for (int var71 = 0; var71 < var69.length; var71++) {
                        class247 var72 = var69[var71];
                        int var73 = var72.field3428;
                        int var74 = var72.field3429;
                        int var75 = var72.field3430;
                        int var76 = var72.field3433;
                        int var77;
                        var72.field3430 = var77 = var75 - var38;
                        int var78;
                        var72.field3428 = var78 = var73 - var38;
                        int var79;
                        var72.field3429 = var79 = var74 - var39;
                        int var80 = var72.field3432;
                        int var81;
                        var72.field3433 = var81 = var76 - var39;
                        if (var70) {
                            int var82 = (var78 < var77 ? var78 : var77) - var80;
                            if (class577.field8260 >= var82) {
                                int var83 = (var81 > var79 ? var79 : var81) - var80;
                                if (class647.field9167 >= var83) {
                                    int var84 = var80 + (var78 < var77 ? var77 : var78);
                                    if (var84 >= 0) {
                                        int var85 = var80 + (var79 < var81 ? var81 : var79);
                                        if (var85 >= 0) {
                                            var70 = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var70) {
                        var63.method1(-44);
                        class149.method957(var63, 0);
                    }
                }
                if (class589.field8461 == 0) {
                    class410.field5731.method595(class637.field9059);
                }
                class410.field5731.method572(-var38, -var39);
                class410.field5731.method614(var52, var56, var54, var57, var44);
                class63.method409(true, class608.field8649 + var44);
                class155.field2124 = class608.field8649 + var44;
                if (class589.field8461 == 1) {
                    class312.field3995 = var20 - var39 - class623.field8904;
                    class281.field3736 = var23;
                    class526.field7363 = var24;
                    class111.field1588 = var19 - class528.field7380 - var38;
                    class410.field5731.method2081(class111.field1588, class312.field3995, class281.field3736, class526.field7363);
                } else {
                    class111.field1588 = class608.field8659 + var19 - (class528.field7380 + var38);
                    class312.field3995 = class481.field6530 + var20 - class623.field8904 - var39;
                    class526.field7363 = var24;
                    class281.field3736 = var23;
                    class410.field5731.method2081(class111.field1588, class312.field3995, class281.field3736, class526.field7363);
                }
                class94.method642(class216.field3059);
                if (var58 > 0) {
                    class410.field5731.method2097(0, var61, class577.field8260, var58 + var61);
                    class410.field5731.method610();
                    class410.field5731.method563(class230.field3205);
                    class218.method1428(arg14, arg5, arg2, arg12, arg7, arg6, arg8, arg17, arg4, arg11, arg15, arg0, arg1, arg13, arg10, arg16, arg3, 1, false);
                }
                if (var55 > 0) {
                    class410.field5731.method2097(var53, var59, var53 + var55, var59 + var60);
                    class410.field5731.method610();
                    class410.field5731.method563(class230.field3205);
                    class218.method1428(arg14, arg5, arg2, arg12, arg7, arg6, arg8, arg17, arg4, arg11, arg15, arg0, arg1, arg13, arg10, arg16, arg3, 1, false);
                }
                class410.field5731.method2198();
                class547.method3271();
                if (class589.field8461 == 0) {
                    class410.field5731.method635();
                }
                class623.field8904 += var39;
                class528.field7380 += var38;
                class608.field8649 += var44;
                class694.field9698 = class608.field8659 + var28 - class528.field7380;
                class720.field10169 = class481.field6530 + var29 - class623.field8904;
                if (class589.field8461 == 1) {
                    class11.field136 += var41;
                    class717.field10140 += var40;
                    for (int var64 = 0; var64 < class446.field6100; var64++) {
                        int var65 = class611.method3569(2439, var64 + class11.field136, class446.field6100) * class209.field2976;
                        for (int var66 = 0; var66 < class209.field2976; var66++) {
                            int var67 = var65 + class611.method3569(2439, class717.field10140 + var66, class209.field2976);
                            boolean var68 = var64 >= var46 && var46 + var47 > var64 || var64 >= var49 && var64 < (var49 + var51) && var66 >= var48 && var48 + var50 > var66;
                            class264.field3599[var67].method1677(class61.field829 * var66, class459.field6317 * var64, class61.field829, class459.field6317, 0, 0, var68, true);
                        }
                    }
                }
            } else {
                class380.field5357 = true;
            }
        }
        if (class380.field5357) {
            class528.field7380 = 0;
            class632.field9001 = arg5;
            class623.field8904 = 0;
            class382.field5365 = arg12;
            class654.field9231 = arg2;
            class608.field8649 = 0.0D;
            class694.field9698 = class608.field8659;
            class720.field10169 = class481.field6530;
            if (class589.field8461 == 0) {
                class410.field5731.method595(class637.field9059);
            }
            class410.field5731.method2198();
            class410.field5731.method610();
            class410.field5731.method563(class230.field3205);
            class19.field237.method853(class632.field9001, class654.field9231, class382.field5365, class679.field9565, class485.field6557, class675.field9510);
            class410.field5731.method2068(class19.field237);
            if (class589.field8461 == 1) {
                class526.field7363 = var24;
                class281.field3736 = var23;
                class111.field1588 = var19;
                class312.field3995 = var20;
                class410.field5731.method2081(class111.field1588, class312.field3995, class281.field3736, class526.field7363);
            } else {
                class312.field3995 = class481.field6530 + var20;
                class281.field3736 = var23;
                class111.field1588 = class608.field8659 + var19;
                class526.field7363 = var24;
                class410.field5731.method2081(class111.field1588, class312.field3995, class281.field3736, class526.field7363);
            }
            class155.field2124 = 0.0D;
            class216.field3059.method1876(105);
            class94.method642(class216.field3059);
            class218.method1428(arg14, arg5, arg2, arg12, arg7, arg6, arg8, arg17, arg4, arg11, arg15, arg0, arg1, arg13, arg10, arg16, arg3, 1, false);
            class547.method3271();
            class380.field5357 = false;
            if (class589.field8461 == 0) {
                class410.field5731.method635();
            }
            if (class589.field8461 == 1) {
                class486.method2848(122);
            }
        }
        if (class589.field8461 == 0) {
            class637.field9059.method1678(class694.field9698, class720.field10169, class45.field658, class54.field756, 0, 0, true, true);
        }
        class677.field9538++;
        class63.method409(true, class608.field8649);
        class448.field6150 = class608.field8649;
        if (arg9) {
            return;
        }
        if (class589.field8461 == 0 || class589.field8461 == 2) {
            if (class589.field8461 == 2) {
                class410.field5731.method563(class230.field3205);
                class410.field5731.method610();
            }
            class477.field6505 = class481.field6530 + var20 - class623.field8904 - class720.field10169;
            class667.field9393 = var24;
            class319.field4116 = class608.field8659 + var19 - class528.field7380 - class694.field9698;
            class127.field1745 = var23;
            class410.field5731.method2081(class319.field4116, class477.field6505, class127.field1745, class667.field9393);
        } else if (class589.field8461 == 1) {
            class477.field6505 = var20 - class623.field8904;
            class127.field1745 = var23;
            class667.field9393 = var24;
            class319.field4116 = var19 - class528.field7380;
            class410.field5731.method2081(class319.field4116, class477.field6505, class127.field1745, class667.field9393);
            class410.field5731.method2097(class694.field9698, class720.field10169, class694.field9698 + class45.field658, class720.field10169 + class54.field756);
        }
        class218.method1428(arg14, arg5, arg2, arg12, arg7, arg6, arg8, arg17, arg4, arg11, arg15, arg0, arg1, arg13, arg10, arg16, arg3, class589.field8461 == 2 ? 0 : 2, class589.field8461 == 1);
        class410.field5731.method2198();
        class410.field5731.method2081(var19, var20, var21, var22);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BC)C", line = 468)
    public static final char method2829(byte arg0, char arg1) {
        field6511++;
        if (arg0 != 5) {
            field6515 = null;
        }
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }
}
