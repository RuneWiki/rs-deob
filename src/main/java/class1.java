import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 {

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field6 = 0;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[S")
    public static short[] field2 = new short[] { 20, 36, 21, 40, 41, 26, 22, 16 };

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "[[Lkc;")
    public static class37[][] field1;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1(boolean arg0) {
        field1 = (class37[][]) null;
        field2 = null;
        if (!arg0) {
            field4 = -82;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lqb;IIIIIIIZ)V", line = 28)
    public static final void method2(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class331.field5639;
        int var11;
        int var12 = var11 = (arg7 << 7) - class61.field1045;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class132.field2328[arg1][arg6][arg7] - class42.field754;
        int var18 = class132.field2328[arg1][arg6 + 1][arg7] - class42.field754;
        int var19 = class132.field2328[arg1][arg6 + 1][arg7 + 1] - class42.field754;
        int var20 = class132.field2328[arg1][arg6][arg7 + 1] - class42.field754;
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
        int var45 = (var21 << 9) / var25 + class227.field3909;
        int var46 = (var24 << 9) / var25 + class227.field3895;
        int var47 = (var27 << 9) / var31 + class227.field3909;
        int var48 = (var30 << 9) / var31 + class227.field3895;
        int var49 = (var33 << 9) / var37 + class227.field3909;
        int var50 = (var36 << 9) / var37 + class227.field3895;
        int var51 = (var39 << 9) / var43 + class227.field3909;
        int var52 = (var42 << 9) / var43 + class227.field3895;
        class227.field3900 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class10.field115 && class290.method2018(class227.field3909 + class115.field2075, class29.field508 + class227.field3895, var50, var52, var48, var49, var51, var47)) {
                class270.field4630 = arg6;
                class273.field4678 = arg7;
            }
            if (!class108.field1900 && !arg8) {
                class227.field3897 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class227.field3912 || var51 > class227.field3912 || var47 > class227.field3912) {
                    class227.field3897 = true;
                }
                if (arg0.field1783 == -1) {
                    if (arg0.field1771 != 12345678) {
                        class227.method1579(var50, var52, var48, var49, var51, var47, arg0.field1771, arg0.field1776, arg0.field1769);
                    }
                } else if (!class38.field713) {
                    int var53 = class227.field3904.method1509((byte) 124, arg0.field1783);
                    class227.method1579(var50, var52, var48, var49, var51, var47, class70.method519(var53, arg0.field1771), class70.method519(var53, arg0.field1776), class70.method519(var53, arg0.field1769));
                } else if (arg0.field1784) {
                    class227.method1599(var50, var52, var48, var49, var51, var47, arg0.field1771, arg0.field1776, arg0.field1769, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1783);
                } else {
                    class227.method1599(var50, var52, var48, var49, var51, var47, arg0.field1771, arg0.field1776, arg0.field1769, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1783);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class10.field115 && class290.method2018(class227.field3909 + class115.field2075, class29.field508 + class227.field3895, var46, var48, var52, var45, var47, var51)) {
            class270.field4630 = arg6;
            class273.field4678 = arg7;
        }
        if (class108.field1900 || arg8) {
            return;
        }
        class227.field3897 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class227.field3912 || var47 > class227.field3912 || var51 > class227.field3912) {
            class227.field3897 = true;
        }
        if (arg0.field1783 == -1) {
            if (arg0.field1768 != 12345678) {
                class227.method1579(var46, var48, var52, var45, var47, var51, arg0.field1768, arg0.field1769, arg0.field1776);
            }
        } else if (class38.field713) {
            class227.method1599(var46, var48, var52, var45, var47, var51, arg0.field1768, arg0.field1769, arg0.field1776, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1783);
        } else {
            int var54 = class227.field3904.method1509((byte) 126, arg0.field1783);
            class227.method1579(var46, var48, var52, var45, var47, var51, class70.method519(var54, arg0.field1768), class70.method519(var54, arg0.field1769), class70.method519(var54, arg0.field1776));
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 209)
    public static final Class method3(String arg0, int arg1) throws ClassNotFoundException {
        field3++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        }
        if (arg1 > -52) {
            field1 = (class37[][]) ((class37[][]) null);
        }
        if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILnf;B)Ljf;", line = 262)
    public static final class229 method4(int arg0, class67 arg1, byte arg2) {
        field5++;
        if (arg2 != 96) {
            return (class229) null;
        } else if (!class217.method1502(client.method1820(arg1), -1, arg0) && arg1.field1223 == null) {
            return null;
        } else if (arg1.field1257 == null || arg0 >= arg1.field1257.length || arg1.field1257[arg0] == null || arg1.field1257[arg0].method1644(true).method1626(74) == 0) {
            return class131.field2317 ? class142.method989(new class229[] { class64.field1103, class84.method607(91, arg0) }, -113) : null;
        } else {
            return arg1.field1257[arg0];
        }
    }
}
