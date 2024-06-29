import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class214 {

    @OriginalMember(owner = "client!h", name = "f", descriptor = "[S")
    public static short[] field3494 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field3493 = 5063219;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "[Z")
    public static boolean[] field3495 = new boolean[100];

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Z")
    public static boolean field3498 = true;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field3497 = 0;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Luf;")
    public static class168 field3496 = class148.method1019(-1720, "mem=");

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lcd;")
    public static class35 field3492;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "[I")
    public static int[] field3490;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V", line = 18)
    public static final void method1485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 == arg8 && arg0 == arg7 && arg1 == arg6 && arg4 == arg9) {
            class126.method892(arg4, arg3, arg1, arg8, arg7, 861304876);
        } else {
            int var10 = arg8;
            int var11 = arg7;
            int var12 = arg8 * 3;
            int var13 = arg7 * 3;
            int var14 = arg6 * 3;
            int var15 = arg0 * 3;
            int var16 = arg5 * 3;
            int var17 = arg9 * 3;
            int var18 = arg4 + var15 - arg7 - var17;
            int var19 = arg1 + var16 - arg8 - var14;
            int var20 = var14 + var12 - (var16 + var16);
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var16 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var21 * var25;
                int var29 = var20 * var25;
                int var30 = var19 * var26;
                int var31 = var23 * var24;
                int var32 = var22 * var24;
                int var33 = (var29 + var30 + var32 >> 12) + arg8;
                int var34 = arg7 + (var27 + var28 + var31 >> 12);
                class126.method892(var34, arg3, var33, var10, var11, 861304876);
                var10 = var33;
                var11 = var34;
            }
        }
        field3489++;
        if (arg2 != 3) {
            field3495 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)V", line = 104)
    public static final void method1486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3491++;
        for (int var6 = arg2; var6 <= arg1; var6++) {
            class133.method925(arg4 + 35314, arg0, arg5, arg3, class284.field4810[var6]);
        }
        if (arg4 != -20636) {
            field3497 = 116;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 131)
    public static void method1487(boolean arg0) {
        field3490 = null;
        field3495 = null;
        field3492 = null;
        field3496 = null;
        field3494 = null;
        if (arg0) {
            field3495 = (boolean[]) null;
        }
    }
}
