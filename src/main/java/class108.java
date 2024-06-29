import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class108 {

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1845 = "purple:";

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field1843 = 0;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Llg;")
    public static class137 field1846;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I", line = 4)
    public static final int method945(int arg0) {
        field1849++;
        return class290.field4627 == arg0 ? 0 : class259.field4204[class290.field4627].method237();
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V", line = 16)
    public static void method946(int arg0) {
        field1846 = null;
        field1845 = null;
        if (arg0 != 4985) {
            method948(74);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lpf;IIIIIIIZ)V", line = 29)
    public static final void method947(class95 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class233.field3870;
        int var11;
        int var12 = var11 = (arg7 << 7) - class75.field1226;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class137.field2487[arg1][arg6][arg7] - class205.field3502;
        int var18 = class137.field2487[arg1][arg6 + 1][arg7] - class205.field3502;
        int var19 = class137.field2487[arg1][arg6 + 1][arg7 + 1] - class205.field3502;
        int var20 = class137.field2487[arg1][arg6][arg7 + 1] - class205.field3502;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class62.field951;
        int var46 = (var24 << 9) / var25 + class62.field960;
        int var47 = (var27 << 9) / var31 + class62.field951;
        int var48 = (var30 << 9) / var31 + class62.field960;
        int var49 = (var33 << 9) / var37 + class62.field951;
        int var50 = (var36 << 9) / var37 + class62.field960;
        int var51 = (var39 << 9) / var43 + class62.field951;
        int var52 = (var42 << 9) / var43 + class62.field960;
        class62.field954 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class50.field785 && class77.method703(class62.field951 + class160.field2841, class62.field960 + class158.field2805, var50, var52, var48, var49, var51, var47)) {
                class97.field1565 = arg6;
                class290.field4628 = arg7;
            }
            if (!class43.field680 && !arg8) {
                class62.field950 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class62.field952 || var51 > class62.field952 || var47 > class62.field952) {
                    class62.field950 = true;
                }
                if (arg0.field1490 == -1) {
                    if (arg0.field1488 != 12345678) {
                        class62.method587(var50, var52, var48, var49, var51, var47, arg0.field1488, arg0.field1485, arg0.field1482);
                    }
                } else if (!class95.field1487) {
                    int var53 = class62.field953.method1220(arg0.field1490, -108);
                    class62.method587(var50, var52, var48, var49, var51, var47, class78.method714(var53, arg0.field1488), class78.method714(var53, arg0.field1485), class78.method714(var53, arg0.field1482));
                } else if (arg0.field1491) {
                    class62.method571(var50, var52, var48, var49, var51, var47, arg0.field1488, arg0.field1485, arg0.field1482, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1490);
                } else {
                    class62.method571(var50, var52, var48, var49, var51, var47, arg0.field1488, arg0.field1485, arg0.field1482, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1490);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class50.field785 && class77.method703(class62.field951 + class160.field2841, class62.field960 + class158.field2805, var46, var48, var52, var45, var47, var51)) {
            class97.field1565 = arg6;
            class290.field4628 = arg7;
        }
        if (class43.field680 || arg8) {
            return;
        }
        class62.field950 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class62.field952 || var47 > class62.field952 || var51 > class62.field952) {
            class62.field950 = true;
        }
        if (arg0.field1490 == -1) {
            if (arg0.field1489 != 12345678) {
                class62.method587(var46, var48, var52, var45, var47, var51, arg0.field1489, arg0.field1482, arg0.field1485);
            }
        } else if (class95.field1487) {
            class62.method571(var46, var48, var52, var45, var47, var51, arg0.field1489, arg0.field1482, arg0.field1485, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1490);
        } else {
            int var54 = class62.field953.method1220(arg0.field1490, -127);
            class62.method587(var46, var48, var52, var45, var47, var51, class78.method714(var54, arg0.field1489), class78.method714(var54, arg0.field1482), class78.method714(var54, arg0.field1485));
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)I", line = 196)
    public static final int method948(int arg0) {
        field1847++;
        if (arg0 > -46) {
            method948(46);
        }
        return ((class51.field796 == 0 ? 0 : 1) << 21) + ((class79.field1280 == 0 ? 0 : 1) << 20) + ((class285.field4521 ? 1 : 0) << 15) + ((class64.field1001 ? 1 : 0) << 13) + ((class95.field1487 ? 1 : 0) << 9) + ((class249.field4036 ? 1 : 0) << 8) + ((class291.field4666 ? 1 : 0) << 7) + ((class129.field2225 ? 1 : 0) << 4) + ((class287.field4570 ? 1 : 0) << 3) + (class32.field462 & 0x7) + ((class48.field735 ? 1 : 0) << 5) + ((class328.field5216 ? 1 : 0) << 6) - (-((class195.field3276 ? 1 : 0) << 10) - (((class137.field2549 & 0x3) << 11) - -((class181.field3043 ? 1 : 0) << 16)) + -(class255.field4104 << 17) + (-((class57.field875 ? 1 : 0) << 19) - (((class29.field393 == 0 ? 0 : 1) << 22) - -(class65.method622() << 23))));
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V", line = 219)
    public static final void method949(int arg0, int arg1) {
        field1848++;
        if (class246.field3999 == null || class246.field3999.length < arg0) {
            class246.field3999 = new int[arg0];
        }
        if (arg1 != -12143) {
            method945(-94);
        }
    }
}
