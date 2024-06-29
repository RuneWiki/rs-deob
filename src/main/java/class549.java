import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class549 extends class660 {

    @OriginalMember(owner = "client!et", name = "g", descriptor = "Lwo;")
    public static class690 field7965 = new class690(84, 6);

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    public static int field7968 = 0;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public static int field7966;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "Lkv;")
    public static class245 field7964;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "[[Lub;")
    public static class20[][] field7969;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V")
    public static void method3213(byte arg0) {
        field7969 = null;
        if (arg0 != -68) {
            method3214(-24, -27, 14, 52, -59, -15, 2, 38, -28, -48);
        }
        field7964 = null;
        field7965 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 < 80) {
            return;
        }
        if (arg1 == arg4 && arg3 == arg8 && arg6 == arg9 && arg0 == arg2) {
            class621.method3554(arg5, arg9, arg4, 58, arg3, arg2);
        } else {
            int var10 = arg4;
            int var11 = arg3;
            int var12 = arg4 * 3;
            int var13 = arg3 * 3;
            int var14 = arg1 * 3;
            int var15 = arg8 * 3;
            int var16 = arg6 * 3;
            int var17 = arg0 * 3;
            int var18 = var14 + arg9 - arg4 - var16;
            int var19 = arg2 - (arg3 - var15) - var17;
            int var20 = var16 + var12 - var14 - var14;
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
                int var33 = arg4 + (var27 + var31 + var29 >> 12);
                int var34 = (var28 + var30 + var32 >> 12) + arg3;
                class621.method3554(arg5, var33, var10, 42, var11, var34);
                var11 = var34;
                var10 = var33;
            }
        }
        field7966++;
    }
}
