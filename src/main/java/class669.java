import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class669 extends class571 {

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Ldd;")
    public class146 field9416;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "[Z")
    public static boolean[] field9419 = new boolean[200];

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field9414;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field9415;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lqk;")
    public static class148 field9418;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Leea;")
    public static class458 field9413;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3831(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -28 % ((arg2 - 15) / 32);
        if (arg0 == arg8 && arg4 == arg6 && arg3 == arg9 && arg1 == arg7) {
            class241.method1534(arg7, true, arg6, arg5, arg3, arg0);
        } else {
            int var11 = arg0;
            int var12 = arg6;
            int var13 = arg0 * 3;
            int var14 = arg6 * 3;
            int var15 = arg8 * 3;
            int var16 = arg4 * 3;
            int var17 = arg9 * 3;
            int var18 = arg1 * 3;
            int var19 = arg3 + var15 - arg0 - var17;
            int var20 = arg7 + var16 - var18 - arg6;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 + var18 - var16 - var16;
            int var23 = var15 - var13;
            int var24 = var16 - var14;
            for (int var25 = 128; var25 <= 4096; var25 += 128) {
                int var26 = var25 * var25 >> 12;
                int var27 = var25 * var26 >> 12;
                int var28 = var19 * var27;
                int var29 = var20 * var27;
                int var30 = var21 * var26;
                int var31 = var22 * var26;
                int var32 = var23 * var25;
                int var33 = var24 * var25;
                int var34 = (var28 + var32 + var30 >> 12) + arg0;
                int var35 = arg6 + (var29 + var31 + var33 >> 12);
                class241.method1534(var35, true, var12, arg5, var34, var11);
                var11 = var34;
                var12 = var35;
            }
        }
        field9417++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static void method3832(byte arg0) {
        field9413 = null;
        if (arg0 != -60) {
            field9418 = null;
        }
        field9419 = null;
        field9418 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Z")
    public static final boolean method3833(int arg0, int arg1) {
        field9414++;
        if (arg0 == 128) {
            return arg1 == 4 || arg1 == 6 || arg1 == 20 || arg1 == 47 || arg1 == 17 || arg1 == 49 || arg1 == 9;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lep;II[B)V")
    public class669(class371 arg0, int arg1, int arg2, byte[] arg3) {
        this.field9416 = class60.method392(arg3, false, (byte) 126, 6406, arg0, arg1, arg2, 6406);
        this.field9416.method1364(false, false, 10242);
    }
}
