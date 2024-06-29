import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class252 {

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Lpr;")
    public static class407 field3232 = new class407(109, -1);

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field3233 = -1;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3230++;
        if (arg4 == arg7 && arg1 == arg9 && arg3 == arg6 && arg2 == arg8) {
            class649.method3665(arg3, arg9, arg4, arg0, true, arg2);
        } else {
            int var10 = arg4;
            int var11 = arg9;
            int var12 = arg4 * 3;
            int var13 = arg9 * 3;
            int var14 = arg7 * 3;
            int var15 = arg1 * 3;
            int var16 = arg6 * 3;
            int var17 = arg8 * 3;
            int var18 = var14 + arg3 - var16 - arg4;
            int var19 = arg2 + var15 - arg9 - var17;
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
                int var33 = arg4 + (var27 + var29 + var31 >> 12);
                int var34 = (var28 + var32 + var30 >> 12) + arg9;
                class649.method3665(var33, var11, var10, arg0, true, var34);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg5 >= -22) {
            method1447(true);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V")
    public static void method1447(boolean arg0) {
        if (!arg0) {
            field3232 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/util/Random;IB)I")
    public static final int method1448(Random arg0, int arg1, byte arg2) {
        field3231++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class644.method3612(false, arg1)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            return arg2 == 50 ? class674.method3775(arg1, var4, -1) : -67;
        }
    }
}
