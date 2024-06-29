import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class500 {

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field6863 = 0;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Lfc;")
    public static class235 field6864 = new class235(110, -1);

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Lcc;")
    public static class670 field6862;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method2793(byte arg0) {
        if (arg0 > 16) {
            field6862 = null;
            field6864 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6865++;
        if (arg1 != -32094) {
            return;
        }
        if (arg4 == arg6 && arg2 == arg3 && arg0 == arg8 && arg5 == arg9) {
            class162.method1126(arg7, (byte) 117, arg0, arg6, arg5, arg3);
            return;
        }
        int var10 = arg6;
        int var11 = arg3;
        int var12 = arg6 * 3;
        int var13 = arg3 * 3;
        int var14 = arg4 * 3;
        int var15 = arg2 * 3;
        int var16 = arg8 * 3;
        int var17 = arg9 * 3;
        int var18 = var14 + arg0 - arg6 - var16;
        int var19 = arg5 + var15 - arg3 - var17;
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
            int var33 = (var27 + var29 + var31 >> 12) + arg6;
            int var34 = (var28 + var30 + var32 >> 12) + arg3;
            class162.method1126(arg7, (byte) -84, var33, var10, var34, var11);
            var11 = var34;
            var10 = var33;
        }
    }
}
