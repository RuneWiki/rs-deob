import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class338 {

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "S")
    public static short field4679 = 256;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field4680 = -1;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Lcu;")
    public static class206 field4681 = new class206(50, 0);

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "Lcu;")
    public static class206 field4682 = new class206(27, 7);

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "[I")
    public static int[] field4684 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)V")
    public static final void method2053(int arg0, int arg1, int arg2) {
        field4677++;
        if (class479.field6386 == 1) {
            class611.method3346(arg1, arg0, class350.field4794, (byte) 102);
        } else if (class479.field6386 == 2) {
            class679.method3793(arg0, (byte) -16, arg1);
        }
        class350.field4794 = null;
        class479.field6386 = 0;
        if (arg2 > -65) {
            field4680 = 69;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static void method2054(int arg0) {
        if (arg0 != 6) {
            method2053(-70, -11, 64);
        }
        field4682 = null;
        field4681 = null;
        field4684 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIFFI[FBIII)V")
    public static final void method2055(int arg0, int arg1, int arg2, float arg3, float arg4, int arg5, float[] arg6, byte arg7, int arg8, int arg9, int arg10) {
        int var11 = arg1 - arg8;
        int var12 = arg2 - arg9;
        if (arg7 != -120) {
            return;
        }
        int var13 = arg5 - arg0;
        field4678++;
        float var14 = arg6[2] * (float) var12 + arg6[0] * (float) var13 + arg6[1] * (float) var11;
        float var15 = arg6[5] * (float) var12 + arg6[4] * (float) var11 + arg6[3] * (float) var13;
        float var16 = arg6[8] * (float) var12 + arg6[7] * (float) var11 + arg6[6] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg4 != 1.0F) {
            var17 = arg4 * var17;
        }
        float var18 = var15 + arg3 + 0.5F;
        if (arg10 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg10 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg10 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class471.field6300 = var18;
        class568.field7543 = var17;
    }
}
