import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class class211 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lwa;")
    public static class75 field3593 = class66.method560("<)4col>", false);

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[S")
    public static short[] field3599 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Lwa;")
    public static class75 field3600 = class66.method560("<col=c0ff00>", false);

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Lwa;")
    public static class75 field3596 = class66.method560("scrollen:", false);

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field3603 = 0;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Lwa;")
    public static class75 field3602 = class66.method560("<img=0>", false);

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Lwa;")
    public static class75 field3597 = class66.method560("lila:", false);

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lcb;")
    public static class267 field3598;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Ljava/awt/Frame;")
    public static Frame field3601;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)Z", line = 8)
    public static final boolean method1559(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class34.field501 * arg0 + class270.field4667 * arg3 >> 16;
        int var6 = class34.field501 * arg3 - class270.field4667 * arg0 >> 16;
        int var7 = class42.field701 * arg1 + class130.field2257 * var6 >> 16;
        int var8 = class130.field2257 * arg1 - class42.field701 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class42.field701 * arg2 + class130.field2257 * var6 >> 16;
        int var12 = class130.field2257 * arg2 - class42.field701 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class253.field4250 && var13 < class253.field4250) {
            return false;
        } else if (var9 > class297.field5083 && var13 > class297.field5083) {
            return false;
        } else if (var10 < class180.field3021 && var14 < class180.field3021) {
            return false;
        } else {
            return var10 <= class2.field5 || var14 <= class2.field5;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 69)
    public static final void method1560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class236 var20 = new class236(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class271.field4681[var21][arg1][arg2] == null) {
                    class271.field4681[var21][arg1][arg2] = new class242(var21, arg1, arg2);
                }
            }
            class271.field4681[arg0][arg1][arg2].field4089 = var20;
        } else if (arg3 == 1) {
            class236 var22 = new class236(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class271.field4681[var23][arg1][arg2] == null) {
                    class271.field4681[var23][arg1][arg2] = new class242(var23, arg1, arg2);
                }
            }
            class271.field4681[arg0][arg1][arg2].field4089 = var22;
        } else {
            class129 var24 = new class129(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class271.field4681[var25][arg1][arg2] == null) {
                    class271.field4681[var25][arg1][arg2] = new class242(var25, arg1, arg2);
                }
            }
            class271.field4681[arg0][arg1][arg2].field4082 = var24;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IJI[I)Lwa;", line = 118)
    public static final class75 method1561(int arg0, long arg1, int arg2, int[] arg3) {
        field3595++;
        if (arg2 <= 74) {
            field3593 = (class75) null;
        }
        if (class54.field901 != null) {
            class75 var5 = class54.field901.method308(arg0, (byte) 82, arg3, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        return arg0 == 5 ? class260.method1855(arg1, false).method613(122) : class263.method1877(116, arg1);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V", line = 164)
    public static void method1562(boolean arg0) {
        if (arg0) {
            field3601 = (Frame) null;
        }
        field3601 = null;
        field3602 = null;
        field3593 = null;
        field3597 = null;
        field3599 = null;
        field3598 = null;
        field3596 = null;
        field3600 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
    public abstract int method1230(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public abstract void method1231(int arg0);
}
