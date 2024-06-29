import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class523 {

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "[I")
    public static int[] field7351 = new int[1];

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "F")
    public static float field7352;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "[B")
    public static byte[] field7353;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method3016(int arg0) {
        field7353 = null;
        field7351 = null;
        if (arg0 != 621199212) {
            method3016(-30);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIII)V")
    public static final void method3017(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7354++;
        int var6 = arg1 - arg4;
        int var7 = arg5 - arg0;
        if (var6 == 0) {
            if (var7 != 0) {
                class94.method685(arg4, arg5, false, arg0, arg2);
            }
        } else if (var7 == 0) {
            class352.method2110(arg4, 0, arg0, arg2, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (class326.field4387 > arg1) {
                var11 = (class326.field4387 * var8 >> 12) + var9;
                var10 = class326.field4387;
            } else if (arg1 > class596.field8621) {
                var10 = class596.field8621;
                var11 = var9 + (class596.field8621 * var8 >> 12);
            } else {
                var11 = arg5;
                var10 = arg1;
            }
            int var12;
            int var13;
            if (arg4 < class326.field4387) {
                var12 = class326.field4387;
                var13 = (class326.field4387 * var8 >> 12) + var9;
            } else if (class596.field8621 < arg4) {
                var12 = class596.field8621;
                var13 = (class596.field8621 * var8 >> 12) + var9;
            } else {
                var12 = arg4;
                var13 = arg0;
            }
            if (class264.field3687 > var11) {
                var10 = (class264.field3687 - var9 << 12) / var8;
                var11 = class264.field3687;
            } else if (var11 > class591.field8435) {
                var10 = (class591.field8435 - var9 << 12) / var8;
                var11 = class591.field8435;
            }
            if (class264.field3687 > var13) {
                var12 = (class264.field3687 - var9 << 12) / var8;
                var13 = class264.field3687;
            } else if (class591.field8435 < var13) {
                var12 = (class591.field8435 - var9 << 12) / var8;
                var13 = class591.field8435;
            }
            if (arg3 != 1135) {
                field7353 = null;
            }
            class233.method1469(var11, var13, var10, (byte) -49, var12, arg2);
        }
    }

    static {
        new class104("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
    }
}
