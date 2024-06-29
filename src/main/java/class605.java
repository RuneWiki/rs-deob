import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class605 {

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public static int field8642 = 0;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "F")
    public static float field8639;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field8643;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)Z", line = 11)
    public static final boolean method3546(int arg0, int arg1) {
        if (arg1 == 21780) {
            field8640++;
            return arg0 == 0 || arg0 == 2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qs", name = "toString", descriptor = "()Ljava/lang/String;", line = 23)
    public final String toString() {
        field8641++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIBIII)V", line = 31)
    public static final void method3547(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class38.method262(arg1, (byte) -54);
        field8643++;
        int var7 = 0;
        int var8 = arg1 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int var15 = 19 / ((5 - arg3) / 40);
        int[] var16 = class591.field8480[arg2];
        int var17 = arg4 - var8;
        int var18 = arg4 + var8;
        class721.method4044(var16, arg4 - arg1, (byte) -120, var17, arg6);
        class721.method4044(var16, var17, (byte) -123, var18, arg5);
        class721.method4044(var16, var18, (byte) -126, arg1 + arg4, arg6);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class278.field3722[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 <= var9) {
                    int[] var19 = class591.field8480[arg2 + var9];
                    int[] var20 = class591.field8480[arg2 - var9];
                    int var21 = arg4 + var7;
                    int var22 = arg4 - var7;
                    class721.method4044(var19, var22, (byte) -123, var21, arg6);
                    class721.method4044(var20, var22, (byte) -120, var21, arg6);
                } else {
                    int[] var23 = class591.field8480[arg2 + var9];
                    int[] var24 = class591.field8480[arg2 - var9];
                    int var25 = class278.field3722[var9];
                    int var26 = arg4 + var7;
                    int var27 = arg4 - var7;
                    int var28 = arg4 + var25;
                    int var29 = arg4 - var25;
                    class721.method4044(var23, var27, (byte) -127, var29, arg6);
                    class721.method4044(var23, var29, (byte) -124, var28, arg5);
                    class721.method4044(var23, var28, (byte) -122, var26, arg6);
                    class721.method4044(var24, var27, (byte) -128, var29, arg6);
                    class721.method4044(var24, var29, (byte) -120, var28, arg5);
                    class721.method4044(var24, var28, (byte) -128, var26, arg6);
                }
            }
            int[] var30 = class591.field8480[arg2 + var7];
            int[] var31 = class591.field8480[arg2 - var7];
            int var32 = arg4 + var9;
            int var33 = arg4 - var9;
            if (var7 < var8) {
                int var34 = var7 > var11 ? class278.field3722[var7] : var11;
                int var35 = arg4 + var34;
                int var36 = arg4 - var34;
                class721.method4044(var30, var33, (byte) -126, var36, arg6);
                class721.method4044(var30, var36, (byte) -124, var35, arg5);
                class721.method4044(var30, var35, (byte) -122, var32, arg6);
                class721.method4044(var31, var33, (byte) -124, var36, arg6);
                class721.method4044(var31, var36, (byte) -127, var35, arg5);
                class721.method4044(var31, var35, (byte) -124, var32, arg6);
            } else {
                class721.method4044(var30, var33, (byte) -122, var32, arg6);
                class721.method4044(var31, var33, (byte) -120, var32, arg6);
            }
        }
    }
}
