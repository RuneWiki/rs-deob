import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class56 {

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
    public static int field796 = 0;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "S")
    public static short field797 = 256;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    public static int field799 = 0;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIIIIII)V", line = 16)
    public static final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field798++;
        if (arg1 == arg9 && arg0 == arg4 && arg3 == arg7 && arg2 == arg5) {
            class286.method1828(arg1, arg5, arg3, arg0, 854952684, arg6);
        } else {
            int var10 = arg1;
            int var11 = arg0;
            int var12 = arg1 * 3;
            int var13 = arg0 * 3;
            int var14 = arg9 * 3;
            int var15 = arg4 * 3;
            int var16 = arg7 * 3;
            int var17 = arg2 * 3;
            int var18 = arg3 + var14 - arg1 - var16;
            int var19 = arg5 - var17 - (-var15 + arg0);
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var18 * var27;
                int var29 = var19 * var27;
                int var30 = var20 * var26;
                int var31 = var21 * var26;
                int var32 = var22 * var24;
                int var33 = var23 * var24;
                int var34 = (var28 + var32 + var30 >> 12) + arg1;
                int var35 = (var29 + var31 + var33 >> 12) + arg0;
                class286.method1828(var10, var35, var34, var11, 854952684, arg6);
                var11 = var35;
                var10 = var34;
            }
        }
        int var25 = 89 % ((-arg8 - 56) / 39);
    }
}
