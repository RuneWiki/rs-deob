import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class226 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "[I")
    public static int[] field3591 = new int[128];

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Lwj;")
    public static class270 field3593;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 4)
    public static void method1599(int arg0) {
        field3591 = null;
        if (arg0 == 4386) {
            field3593 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIII)V", line = 27)
    public static final void method1600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3592++;
        int var8 = arg7 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class7.field98 - class87.field1401) * var8 / 100 + class87.field1401;
        int var10 = 2048 - arg2 & 0x7FF;
        int var11 = arg1 * var9 >> 8;
        int var12 = 2048 - arg6 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var11;
        if (var12 != 0) {
            int var16 = class15.field216[var12];
            int var17 = class15.field204[var12];
            var14 = -var11 * var17 >> 16;
            var15 = var11 * var16 >> 16;
        }
        if (var10 != 0) {
            int var18 = class15.field204[var10];
            var13 = var15 * var18 >> 16;
            int var19 = class15.field216[var10];
            var15 = var15 * var19 >> 16;
        }
        class218.field3323 = arg2;
        class265.field4116 = arg4 - var15;
        class194.field2897 = arg6;
        class258.field4052 = arg3 - var14;
        class337.field5278 = arg5 - var13;
        if (arg0 != -19326) {
            field3591 = (int[]) null;
        }
    }
}
