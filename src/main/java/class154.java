import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class154 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "J")
    public static long field2788 = 0L;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Lud;")
    public static class279 field2787 = class130.method1024("details", 255);

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "[J")
    public static long[] field2790 = new long[500];

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Lud;")
    public static class279 field2791 = class130.method1024("(U5", 255);

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIIIII)V", line = 9)
    public static final void method1214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class249.field4449 <= arg0 && arg0 <= class44.field929 && class249.field4449 <= arg8 && arg8 <= class44.field929 && arg1 >= class249.field4449 && arg1 <= class44.field929 && class249.field4449 <= arg4 && class44.field929 >= arg4 && class135.field2463 <= arg5 && arg5 <= class108.field2002 && arg6 >= class135.field2463 && arg6 <= class108.field2002 && class135.field2463 <= arg2 && class108.field2002 >= arg2 && class135.field2463 <= arg3 && class108.field2002 >= arg3) {
            class209.method1537(arg5, arg2, arg3, arg0, arg1, arg8, arg6, (byte) 98, arg7, arg4);
        } else {
            class307.method2189(arg0, arg4, arg5, arg7, arg8, 3, arg2, arg1, arg6, arg3);
        }
        field2789++;
        if (arg9 != 0) {
            field2788 = -76L;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lug;IIIIIIIZ)V", line = 29)
    public static final void method1215(class304 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class306.field5430;
        int var11;
        int var12 = var11 = (arg7 << 7) - class233.field4083;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class165.field2970[arg1][arg6][arg7] - class318.field5581;
        int var18 = class165.field2970[arg1][arg6 + 1][arg7] - class318.field5581;
        int var19 = class165.field2970[arg1][arg6 + 1][arg7 + 1] - class318.field5581;
        int var20 = class165.field2970[arg1][arg6][arg7 + 1] - class318.field5581;
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
        int var45 = (var21 << 9) / var25 + class27.field643;
        int var46 = (var24 << 9) / var25 + class27.field655;
        int var47 = (var27 << 9) / var31 + class27.field643;
        int var48 = (var30 << 9) / var31 + class27.field655;
        int var49 = (var33 << 9) / var37 + class27.field643;
        int var50 = (var36 << 9) / var37 + class27.field655;
        int var51 = (var39 << 9) / var43 + class27.field643;
        int var52 = (var42 << 9) / var43 + class27.field655;
        class27.field646 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class322.field5625 && class310.method2203(class27.field643 + class26.field635, class27.field655 + class192.field3472, var50, var52, var48, var49, var51, var47)) {
                class289.field5146 = arg6;
                class276.field4889 = arg7;
            }
            if (!class97.field1824 && !arg8) {
                class27.field651 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class27.field657 || var51 > class27.field657 || var47 > class27.field657) {
                    class27.field651 = true;
                }
                if (arg0.field5403 == -1) {
                    if (arg0.field5386 != 12345678) {
                        class27.method235(var50, var52, var48, var49, var51, var47, arg0.field5386, arg0.field5388, arg0.field5381);
                    }
                } else if (!class198.field3536) {
                    int var53 = class27.field656.method316(false, arg0.field5403);
                    class27.method235(var50, var52, var48, var49, var51, var47, class37.method331(var53, arg0.field5386), class37.method331(var53, arg0.field5388), class37.method331(var53, arg0.field5381));
                } else if (arg0.field5391) {
                    class27.method247(var50, var52, var48, var49, var51, var47, arg0.field5386, arg0.field5388, arg0.field5381, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field5403);
                } else {
                    class27.method247(var50, var52, var48, var49, var51, var47, arg0.field5386, arg0.field5388, arg0.field5381, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field5403);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class322.field5625 && class310.method2203(class27.field643 + class26.field635, class27.field655 + class192.field3472, var46, var48, var52, var45, var47, var51)) {
            class289.field5146 = arg6;
            class276.field4889 = arg7;
        }
        if (class97.field1824 || arg8) {
            return;
        }
        class27.field651 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class27.field657 || var47 > class27.field657 || var51 > class27.field657) {
            class27.field651 = true;
        }
        if (arg0.field5403 == -1) {
            if (arg0.field5380 != 12345678) {
                class27.method235(var46, var48, var52, var45, var47, var51, arg0.field5380, arg0.field5381, arg0.field5388);
            }
        } else if (class198.field3536) {
            class27.method247(var46, var48, var52, var45, var47, var51, arg0.field5380, arg0.field5381, arg0.field5388, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field5403);
        } else {
            int var54 = class27.field656.method316(false, arg0.field5403);
            class27.method235(var46, var48, var52, var45, var47, var51, class37.method331(var54, arg0.field5380), class37.method331(var54, arg0.field5381), class37.method331(var54, arg0.field5388));
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 196)
    public static void method1216(byte arg0) {
        field2790 = null;
        field2787 = null;
        if (arg0 <= -105) {
            field2791 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 225)
    public static final void method1217(int arg0) {
        if (arg0 != -17234) {
            field2793 = 122;
        }
        field2794++;
        Container var1;
        if (class120.field2159 != null) {
            var1 = class120.field2159;
        } else if (class5.field115 == null) {
            var1 = class110.field2022.field5418;
        } else {
            var1 = class5.field115;
        }
        class113.field2082 = var1.getSize().width;
        class105.field1985 = var1.getSize().height;
        if (class5.field115 == var1) {
            Insets var2 = class5.field115.getInsets();
            class105.field1985 -= var2.top + var2.bottom;
            class113.field2082 -= var2.left + var2.right;
        }
        if (class20.method196(arg0 + 17237) < 2) {
            class90.field1703 = (class113.field2082 - 765) / 2;
            class221.field3899 = 765;
            class176.field3150 = 503;
            class252.field4496 = 0;
        } else {
            class90.field1703 = 0;
            class221.field3899 = class113.field2082;
            class252.field4496 = 0;
            class176.field3150 = class105.field1985;
        }
        if (class97.field1824) {
            class97.method816(class221.field3899, class176.field3150);
        }
        class132.field2419.setSize(class221.field3899, class176.field3150);
        if (class5.field115 == var1) {
            Insets var3 = class5.field115.getInsets();
            class132.field2419.setLocation(class90.field1703 + var3.left, class252.field4496 + var3.top);
        } else {
            class132.field2419.setLocation(class90.field1703, class252.field4496);
        }
        if (class307.field5444 != -1) {
            class237.method1702(true, (byte) -15);
        }
        class100.method848((byte) -85);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIBII)V", line = 311)
    public static final void method1218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field2795++;
        int var9 = arg1 - arg2;
        int var10 = arg4 - arg0;
        int var11 = (arg7 - arg3 << 16) / var10;
        int var12 = (arg5 - arg8 << 16) / var9;
        if (arg6 != 99) {
            field2791 = (class279) null;
        }
        class20.method194(false, arg2, arg8, var12, 0, arg0, arg1, var11, 0, arg4, arg3);
    }
}
