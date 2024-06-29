import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class530 {

    @OriginalMember(owner = "client!au", name = "a", descriptor = "[I")
    public static int[] field7787 = new int[2048];

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public int field7788;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public int field7789;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public int field7790;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    public static int field7791;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V")
    public static void method3150(boolean arg0) {
        if (arg0) {
            method3152(99, 39, -10, -31, -61, -96, 74, -28, -38, 4);
        }
        field7787 = null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BLjd;)Z")
    public static final boolean method3151(byte arg0, class426 arg1) {
        field7792++;
        int var2 = -20 / ((61 - arg0) / 45);
        return class180.field2622 == arg1 || class193.field2858 == arg1 || class257.field4151 == arg1 || class506.field7562 == arg1;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7791++;
        if (arg7 != 3) {
            field7787 = null;
        }
        if (arg1 == arg3 && arg2 == arg4 && arg5 == arg6 && arg0 == arg8) {
            class74.method541(arg1, arg5, arg9, (byte) -61, arg2, arg0);
            return;
        }
        int var10 = arg1;
        int var11 = arg2;
        int var12 = arg1 * 3;
        int var13 = arg2 * 3;
        int var14 = arg3 * 3;
        int var15 = arg4 * 3;
        int var16 = arg6 * 3;
        int var17 = arg8 * 3;
        int var18 = var14 + arg5 - arg1 - var16;
        int var19 = var15 + arg0 - arg2 - var17;
        int var20 = var16 - var14 - (var14 - var12);
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
            int var33 = arg1 + (var27 + var31 + var29 >> 12);
            int var34 = (var28 + var32 + var30 >> 12) + arg2;
            class74.method541(var10, var33, arg9, (byte) -109, var11, var34);
            var10 = var33;
            var11 = var34;
        }
    }
}
