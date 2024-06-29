import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class344 {

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "Lio;")
    public static class157 field4613;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)V", line = 8)
    public static void method2053(boolean arg0) {
        if (!arg0) {
            method2053(false);
        }
        field4613 = null;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIIIIIIII)V", line = 18)
    public static final void method2054(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 == arg9 && arg0 == arg1 && arg3 == arg8 && arg2 == arg6) {
            class287.method1703(arg6, arg1, 87, arg9, arg3, arg5);
        } else {
            int var10 = arg9;
            int var11 = arg1;
            int var12 = arg9 * 3;
            int var13 = arg1 * 3;
            int var14 = arg7 * 3;
            int var15 = arg0 * 3;
            int var16 = arg8 * 3;
            int var17 = arg2 * 3;
            int var18 = arg3 + var14 - arg9 - var16;
            int var19 = arg6 + var15 - var17 - arg1;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg9;
                int var34 = (var28 + var30 + var32 >> 12) + arg1;
                class287.method1703(var34, var11, arg4 - 13937, var10, var33, arg5);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg4 != 13884) {
            field4613 = null;
        }
        field4614++;
    }
}
