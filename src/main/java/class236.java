import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class236 {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lfe;")
    public static class231 field3804;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method1655(int arg0, String arg1, int arg2, String arg3) {
        if (arg2 > 88) {
            class102.method686(arg3, (String) null, (byte) -113, arg1, -1, arg0);
            field3805++;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIIIIZ)V")
    public static final void method1656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (!arg9) {
            method1656(56, -33, 105, -90, -113, -51, 77, -59, 4, true);
        }
        if (arg4 == arg8 && arg1 == arg3 && arg0 == arg5 && arg2 == arg6) {
            class209.method1451(arg5, arg2, 5238, arg4, arg7, arg1);
        } else {
            int var10 = arg4;
            int var11 = arg1 * 3;
            int var12 = arg1;
            int var13 = arg8 * 3;
            int var14 = arg3 * 3;
            int var15 = arg4 * 3;
            int var16 = arg0 * 3;
            int var17 = arg6 * 3;
            int var18 = arg5 + var13 - arg4 - var16;
            int var19 = arg2 + var14 - var17 - arg1;
            int var20 = var16 + var15 - var13 - var13;
            int var21 = var11 + var17 - var14 - var14;
            int var22 = var14 - var11;
            int var23 = var13 - var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var21 * var25;
                int var27 = var20 * var25;
                int var28 = var22 * var24;
                int var29 = var24 * var25 >> 12;
                int var30 = var23 * var24;
                int var31 = var18 * var29;
                int var32 = arg4 + (var30 + var31 + var27 >> 12);
                int var33 = var19 * var29;
                int var34 = (var26 + var33 + var28 >> 12) + arg1;
                class209.method1451(var32, var34, 5238, var10, arg7, var12);
                var12 = var34;
                var10 = var32;
            }
        }
        field3803++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    public static void method1657(boolean arg0) {
        if (arg0) {
            method1656(-23, 119, 29, -101, 109, 51, 84, 9, 62, false);
        }
        field3804 = null;
    }
}
