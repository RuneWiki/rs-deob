import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public abstract class class500 {

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "Lwb;")
    public static class215 field7377;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "[I")
    public static int[] field7379;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)I")
    public static final int method2992(int arg0, int arg1) {
        return class360.field5465 == null ? 0 : (class360.field5465[arg0][arg1] & 0xFF) << 3;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
    public static final void method2993(int arg0) {
        class201.field2942 = new class392();
        int var1 = -103 % ((arg0 + 65) / 38);
        field7378++;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lqf;IIII)V")
    public static final void method2994(class478 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class250.method1610(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class151.field2408) {
            class250.method1610(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class250.method1610(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class261.field3792) {
            class250.method1610(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class261.field3792) {
            class250.method1610(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class151.field2408 && arg4 <= class261.field3792) {
            class250.method1610(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class250.method1610(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class151.field2408 && arg4 > 0) {
            class250.method1610(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIILqa;II)Lc;")
    public static final class121 method2995(int arg0, int arg1, int arg2, int arg3, class162 arg4, int arg5, int arg6) {
        field7381++;
        long var7 = (long) arg5;
        class121 var9 = (class121) class6.field130.method494(0, var7);
        short var10 = 2055;
        if (var9 == null) {
            class380 var11 = class410.method2492(0, true, class474.field7088, arg5);
            if (var11 == null) {
                return null;
            }
            if (var11.field5736 < 13) {
                var11.method2369((byte) -57, 0);
            }
            var9 = arg4.method265(var11, var10, class334.field5045, 64, 768);
            class6.field130.method485(var7, (byte) -125, var9);
        }
        class121 var12 = var9.method938((byte) 2, var10, true);
        if (arg3 != 0) {
            var12.method912(arg3);
        }
        int var13 = 10 / ((arg6 + 27) / 49);
        if (arg2 != 0) {
            var12.method922(arg2);
        }
        if (arg1 != 0) {
            var12.method895(arg1);
        }
        if (arg0 != 0) {
            var12.method923(0, arg0, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIZIII)I")
    public static final int method2996(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field7380++;
        if ((arg0 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg6;
            arg6 = var7;
        }
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return 1 + 7 - arg1 - arg2;
        } else {
            if (!arg3) {
                field7379 = null;
            }
            return var8 == 2 ? 7 + 1 - arg5 - arg6 : arg2;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BLcr;)Lcr;")
    public abstract class403 method646(byte arg0, class403 arg1);

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V")
    public static void method2997(int arg0) {
        field7379 = null;
        if (arg0 != 16) {
            method2996(-87, -70, 97, true, 122, -17, 23);
        }
        field7377 = null;
    }
}
