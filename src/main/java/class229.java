import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class229 {

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "[Z")
    public static boolean[] field2926 = new boolean[5];

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Lud;")
    public static class27 field2924 = new class27(10, 2, 2, 0);

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Z")
    public static boolean field2927 = false;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "[Z")
    public static boolean[] field2928 = new boolean[100];

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IFIIIII[FII)V", line = 3)
    public static final void method1390(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, int arg9) {
        int var10 = arg4 - arg2;
        int var11 = arg9 - arg0;
        field2925++;
        int var12 = arg6 - arg5;
        float var13 = arg7[2] * (float) var11 + arg7[0] * (float) var12 + arg7[1] * (float) var10;
        float var14 = arg7[5] * (float) var11 + arg7[4] * (float) var10 + arg7[3] * (float) var12;
        float var15 = arg7[arg3] * (float) var11 + arg7[7] * (float) var10 + arg7[6] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg1 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg8 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg8 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg8 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class341.field4285 = var18;
        class468.field6773 = var17;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V", line = 53)
    public static final void method1391(int arg0, int arg1, int arg2) {
        class490 var3 = class125.field1664[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field7126 != null) {
            var3.field7126 = null;
        }
        if (var3.field7130 != null) {
            var3.field7130 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 74)
    public static void method1392(int arg0) {
        if (arg0 != 1) {
            method1391(70, 3, 109);
        }
        field2926 = null;
        field2924 = null;
        field2928 = null;
    }
}
