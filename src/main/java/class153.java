import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class153 {

    @OriginalMember(owner = "client!um", name = "h", descriptor = "[S")
    public static short[] field2110 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "[I")
    public static int[] field2108;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "[[B")
    public static byte[][] field2105;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "[[S")
    public static short[][] field2109;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZII)I", line = 15)
    public static final int method1018(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            method1020(-77);
        }
        field2106++;
        if (arg0 == arg2) {
            return arg2;
        } else {
            int var4 = 128 - arg3;
            int var5 = ((arg0 & 0xFF00FF00) >>> 7) * arg3 + ((arg2 & 0xFF00FF00) >>> 7) * var4 & 0xFF00FF00;
            int var6 = (arg0 & 0xFF00FF) * arg3 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00;
            return (var6 >> 7) + var5;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V", line = 35)
    public static final void method1019(int arg0, int arg1) {
        field2103++;
        if (arg1 >= -101) {
            field2107 = -100;
        }
        class172.field2479.method1236(-495037017, arg0);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 57)
    public static void method1020(int arg0) {
        field2108 = null;
        field2110 = null;
        if (arg0 == 0) {
            field2105 = (byte[][]) null;
            field2109 = (short[][]) null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lwe;IIIIIIIZ)V", line = 71)
    public static final void method1021(class57 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class330.field5053;
        int var11;
        int var12 = var11 = (arg7 << 7) - class165.field2287;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class167.field2324[arg1][arg6][arg7] - class329.field5024;
        int var18 = class167.field2324[arg1][arg6 + 1][arg7] - class329.field5024;
        int var19 = class167.field2324[arg1][arg6 + 1][arg7 + 1] - class329.field5024;
        int var20 = class167.field2324[arg1][arg6][arg7 + 1] - class329.field5024;
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
        int var45 = (var21 << 9) / var25 + class215.field3022;
        int var46 = (var24 << 9) / var25 + class215.field3021;
        int var47 = (var27 << 9) / var31 + class215.field3022;
        int var48 = (var30 << 9) / var31 + class215.field3021;
        int var49 = (var33 << 9) / var37 + class215.field3022;
        int var50 = (var36 << 9) / var37 + class215.field3021;
        int var51 = (var39 << 9) / var43 + class215.field3022;
        int var52 = (var42 << 9) / var43 + class215.field3021;
        class215.field3016 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class283.field4449 && class220.method1513(class215.field3022 + class115.field1632, class267.field4207 + class215.field3021, var50, var52, var48, var49, var51, var47)) {
                class298.field4658 = arg6;
                class62.field785 = arg7;
            }
            if (!class250.field3787 && !arg8) {
                class215.field3010 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class215.field3018 || var51 > class215.field3018 || var47 > class215.field3018) {
                    class215.field3010 = true;
                }
                if (arg0.field692 == -1) {
                    if (arg0.field696 != 12345678) {
                        class215.method1468(var50, var52, var48, var49, var51, var47, arg0.field696, arg0.field693, arg0.field689);
                    }
                } else if (!class229.field3332) {
                    int var53 = class215.field3020.method375(arg0.field692, 4964);
                    class215.method1468(var50, var52, var48, var49, var51, var47, class220.method1511(var53, arg0.field696), class220.method1511(var53, arg0.field693), class220.method1511(var53, arg0.field689));
                } else if (arg0.field688) {
                    class215.method1480(var50, var52, var48, var49, var51, var47, arg0.field696, arg0.field693, arg0.field689, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field692);
                } else {
                    class215.method1480(var50, var52, var48, var49, var51, var47, arg0.field696, arg0.field693, arg0.field689, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field692);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class283.field4449 && class220.method1513(class215.field3022 + class115.field1632, class267.field4207 + class215.field3021, var46, var48, var52, var45, var47, var51)) {
            class298.field4658 = arg6;
            class62.field785 = arg7;
        }
        if (class250.field3787 || arg8) {
            return;
        }
        class215.field3010 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class215.field3018 || var47 > class215.field3018 || var51 > class215.field3018) {
            class215.field3010 = true;
        }
        if (arg0.field692 == -1) {
            if (arg0.field695 != 12345678) {
                class215.method1468(var46, var48, var52, var45, var47, var51, arg0.field695, arg0.field689, arg0.field693);
            }
        } else if (class229.field3332) {
            class215.method1480(var46, var48, var52, var45, var47, var51, arg0.field695, arg0.field689, arg0.field693, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field692);
        } else {
            int var54 = class215.field3020.method375(arg0.field692, 4964);
            class215.method1468(var46, var48, var52, var45, var47, var51, class220.method1511(var54, arg0.field695), class220.method1511(var54, arg0.field689), class220.method1511(var54, arg0.field693));
        }
    }
}
