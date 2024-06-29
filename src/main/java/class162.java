import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class162 {

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Lqe;")
    public static class179 field2925 = class206.method1380("Bitte versuchen Sie es erneut)3", (byte) -126);

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Lqe;")
    public static class179 field2926 = class206.method1380("Regeln versto-8en hat)3", (byte) -128);

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "[I")
    public static int[] field2929 = new int[128];

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "[S")
    public static short[] field2928;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lph;IIIIIII)V")
    public static final void method1040(class171 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8;
        int var9 = var8 = (arg6 << 7) - class100.field1859;
        int var10;
        int var11 = var10 = (arg7 << 7) - class110.field2060;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14;
        int var15 = var14 = var11 + 128;
        int var16 = class30.field665[arg1][arg6][arg7] - class66.field1343;
        int var17 = class30.field665[arg1][arg6 + 1][arg7] - class66.field1343;
        int var18 = class30.field665[arg1][arg6 + 1][arg7 + 1] - class66.field1343;
        int var19 = class30.field665[arg1][arg6][arg7 + 1] - class66.field1343;
        int var20 = arg4 * var11 + arg5 * var9 >> 16;
        int var21 = arg5 * var11 - arg4 * var9 >> 16;
        int var23 = arg3 * var16 - arg2 * var21 >> 16;
        int var24 = arg2 * var16 + arg3 * var21 >> 16;
        if (var24 < 50) {
            return;
        }
        int var26 = arg4 * var10 + arg5 * var13 >> 16;
        int var27 = arg5 * var10 - arg4 * var13 >> 16;
        int var29 = arg3 * var17 - arg2 * var27 >> 16;
        int var30 = arg2 * var17 + arg3 * var27 >> 16;
        if (var30 < 50) {
            return;
        }
        int var32 = arg4 * var15 + arg5 * var12 >> 16;
        int var33 = arg5 * var15 - arg4 * var12 >> 16;
        int var35 = arg3 * var18 - arg2 * var33 >> 16;
        int var36 = arg2 * var18 + arg3 * var33 >> 16;
        if (var36 < 50) {
            return;
        }
        int var38 = arg4 * var14 + arg5 * var8 >> 16;
        int var39 = arg5 * var14 - arg4 * var8 >> 16;
        int var41 = arg3 * var19 - arg2 * var39 >> 16;
        int var42 = arg2 * var19 + arg3 * var39 >> 16;
        if (var42 < 50) {
            return;
        }
        int var44 = (var20 << 9) / var24 + class27.field608;
        int var45 = (var23 << 9) / var24 + class27.field610;
        int var46 = (var26 << 9) / var30 + class27.field608;
        int var47 = (var29 << 9) / var30 + class27.field610;
        int var48 = (var32 << 9) / var36 + class27.field608;
        int var49 = (var35 << 9) / var36 + class27.field610;
        int var50 = (var38 << 9) / var42 + class27.field608;
        int var51 = (var41 << 9) / var42 + class27.field610;
        class27.field609 = 0;
        if ((var47 - var51) * (var48 - var50) - (var46 - var50) * (var49 - var51) > 0) {
            if (class218.field4042 && class60.method409(class27.field608 + class193.field3599, class27.field610 + class240.field4413, var49, var51, var47, var48, var50, var46)) {
                class151.field2729 = arg6;
                class227.field4206 = arg7;
            }
            class27.field603 = false;
            if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > class27.field599 || var50 > class27.field599 || var46 > class27.field599) {
                class27.field603 = true;
            }
            if (arg0.field3065 == -1) {
                if (arg0.field3060 != 12345678) {
                    class27.method184(var49, var51, var47, var48, var50, var46, arg0.field3060, arg0.field3058, arg0.field3070);
                }
            } else if (class195.field3624) {
                int var52 = class27.field597.method515(-125, arg0.field3065);
                class27.method184(var49, var51, var47, var48, var50, var46, class10.method72(var52, arg0.field3060), class10.method72(var52, arg0.field3058), class10.method72(var52, arg0.field3070));
            } else if (arg0.field3061) {
                class27.method166(var49, var51, var47, var48, var50, var46, arg0.field3060, arg0.field3058, arg0.field3070, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field3065);
            } else {
                class27.method166(var49, var51, var47, var48, var50, var46, arg0.field3060, arg0.field3058, arg0.field3070, var32, var38, var26, var35, var41, var29, var36, var42, var30, arg0.field3065);
            }
        }
        if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) <= 0) {
            return;
        }
        if (class218.field4042 && class60.method409(class27.field608 + class193.field3599, class27.field610 + class240.field4413, var45, var47, var51, var44, var46, var50)) {
            class151.field2729 = arg6;
            class227.field4206 = arg7;
        }
        class27.field603 = false;
        if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > class27.field599 || var46 > class27.field599 || var50 > class27.field599) {
            class27.field603 = true;
        }
        if (arg0.field3065 != -1) {
            if (!class195.field3624) {
                class27.method166(var45, var47, var51, var44, var46, var50, arg0.field3072, arg0.field3070, arg0.field3058, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field3065);
                return;
            }
            int var53 = class27.field597.method515(-125, arg0.field3065);
            class27.method184(var45, var47, var51, var44, var46, var50, class10.method72(var53, arg0.field3072), class10.method72(var53, arg0.field3070), class10.method72(var53, arg0.field3058));
        } else if (arg0.field3072 != 12345678) {
            class27.method184(var45, var47, var51, var44, var46, var50, arg0.field3072, arg0.field3070, arg0.field3058);
            return;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lnh;")
    public static final class149 method1041(Throwable arg0, String arg1) {
        field2923++;
        class149 var2;
        if (arg0 instanceof class149) {
            var2 = (class149) arg0;
            var2.field2677 = var2.field2677 + ' ' + arg1;
        } else {
            var2 = new class149(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static void method1042(int arg0) {
        field2928 = null;
        if (arg0 > -30) {
            method1042(63);
        }
        field2926 = null;
        field2925 = null;
        field2929 = null;
    }
}
