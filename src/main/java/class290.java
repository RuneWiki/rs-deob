import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class290 extends class71 {

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "Lqg;")
    public static class256 field4574 = new class256();

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "Ljava/lang/String;")
    public static String field4577 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "B")
    public byte field4572;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public int field4569;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "Lok;")
    public static class160 field4576;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "Ljava/lang/String;")
    public String field4566;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "Ljava/lang/String;")
    public String field4573;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V", line = 4)
    public static final void method2031(byte arg0) {
        class129.field1911.method1623(1);
        if (arg0 < 77) {
            method2034((class160) null, 104, 14);
        }
        field4575++;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)I", line = 16)
    public static final int method2032(int arg0, int arg1) {
        field4570++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        if (arg0 <= 39) {
            field4576 = (class160) null;
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIILh;IJZ)Z", line = 33)
    public static final boolean method2033(int arg0, int arg1, int arg2, int arg3, int arg4, class232 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class161.method1121(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lok;II)I", line = 70)
    public static final int method2034(class160 arg0, int arg1, int arg2) {
        field4567++;
        if (!client.method1913(arg0).method1171(8, arg2) && arg0.field2440 == null) {
            return -1;
        } else {
            if (arg1 < 123) {
                method2037((byte) -83);
            }
            return arg0.field2465 == null || arg0.field2465.length <= arg2 ? -1 : arg0.field2465[arg2];
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Llk;IIIIIIIZ)V", line = 86)
    public static final void method2035(class293 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class88.field1347;
        int var11;
        int var12 = var11 = (arg7 << 7) - class2.field15;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class84.field1282[arg1][arg6][arg7] - class189.field3081;
        int var18 = class84.field1282[arg1][arg6 + 1][arg7] - class189.field3081;
        int var19 = class84.field1282[arg1][arg6 + 1][arg7 + 1] - class189.field3081;
        int var20 = class84.field1282[arg1][arg6][arg7 + 1] - class189.field3081;
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
        int var45 = (var21 << 9) / var25 + class25.field369;
        int var46 = (var24 << 9) / var25 + class25.field358;
        int var47 = (var27 << 9) / var31 + class25.field369;
        int var48 = (var30 << 9) / var31 + class25.field358;
        int var49 = (var33 << 9) / var37 + class25.field369;
        int var50 = (var36 << 9) / var37 + class25.field358;
        int var51 = (var39 << 9) / var43 + class25.field369;
        int var52 = (var42 << 9) / var43 + class25.field358;
        class25.field370 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class88.field1323 && class300.method2093(class25.field369 + class239.field3787, class25.field358 + class114.field1720, var50, var52, var48, var49, var51, var47)) {
                class209.field3412 = arg6;
                class48.field664 = arg7;
            }
            if (!class186.field2991 && !arg8) {
                class25.field371 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class25.field363 || var51 > class25.field363 || var47 > class25.field363) {
                    class25.field371 = true;
                }
                if (arg0.field4615 == -1) {
                    if (arg0.field4605 != 12345678) {
                        class25.method175(var50, var52, var48, var49, var51, var47, arg0.field4605, arg0.field4612, arg0.field4611);
                    }
                } else if (!class226.field3598) {
                    int var53 = class25.field365.method376((byte) -125, arg0.field4615);
                    class25.method175(var50, var52, var48, var49, var51, var47, class248.method1758(var53, arg0.field4605), class248.method1758(var53, arg0.field4612), class248.method1758(var53, arg0.field4611));
                } else if (arg0.field4613) {
                    class25.method168(var50, var52, var48, var49, var51, var47, arg0.field4605, arg0.field4612, arg0.field4611, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4615);
                } else {
                    class25.method168(var50, var52, var48, var49, var51, var47, arg0.field4605, arg0.field4612, arg0.field4611, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field4615);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class88.field1323 && class300.method2093(class25.field369 + class239.field3787, class25.field358 + class114.field1720, var46, var48, var52, var45, var47, var51)) {
            class209.field3412 = arg6;
            class48.field664 = arg7;
        }
        if (class186.field2991 || arg8) {
            return;
        }
        class25.field371 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class25.field363 || var47 > class25.field363 || var51 > class25.field363) {
            class25.field371 = true;
        }
        if (arg0.field4615 == -1) {
            if (arg0.field4610 != 12345678) {
                class25.method175(var46, var48, var52, var45, var47, var51, arg0.field4610, arg0.field4611, arg0.field4612);
            }
        } else if (class226.field3598) {
            class25.method168(var46, var48, var52, var45, var47, var51, arg0.field4610, arg0.field4611, arg0.field4612, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4615);
        } else {
            int var54 = class25.field365.method376((byte) -124, arg0.field4615);
            class25.method175(var46, var48, var52, var45, var47, var51, class248.method1758(var54, arg0.field4610), class248.method1758(var54, arg0.field4611), class248.method1758(var54, arg0.field4612));
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V", line = 247)
    public static final void method2036(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 16) {
            return;
        }
        if (arg0 > arg1) {
            for (int var5 = arg1; var5 < arg0; var5++) {
                class310.field4841[var5][arg3] = arg2;
            }
        } else {
            for (int var6 = arg0; var6 < arg1; var6++) {
                class310.field4841[var6][arg3] = arg2;
            }
        }
        field4565++;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)V", line = 288)
    public static void method2037(byte arg0) {
        if (arg0 >= 4) {
            field4577 = null;
            field4576 = null;
            field4574 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIBIIIIII)V", line = 303)
    public static final void method2038(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4571++;
        if (arg3 >= -37) {
            method2033(-121, -101, 11, -43, 105, (class232) null, 112, -128L, false);
        }
        class125 var10 = null;
        for (class125 var11 = (class125) class119.field1831.method1807((byte) 22); var11 != null; var11 = (class125) class119.field1831.method1808(18051)) {
            if (var11.field1859 == arg5 && var11.field1865 == arg1 && var11.field1872 == arg2 && var11.field1875 == arg9) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class125();
            var10.field1872 = arg2;
            var10.field1865 = arg1;
            var10.field1859 = arg5;
            var10.field1875 = arg9;
            class334.method2301(var10, -128);
            class119.field1831.method1815((byte) 120, var10);
        }
        var10.field1866 = arg4;
        var10.field1874 = arg6;
        var10.field1870 = arg8;
        var10.field1860 = arg7;
        var10.field1862 = arg0;
    }
}
