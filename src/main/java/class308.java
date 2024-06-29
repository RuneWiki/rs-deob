import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public abstract class class308 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "[I")
    public static int[] field4270 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Z")
    public static boolean field4271 = false;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "F")
    public static float field4274;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Loea;")
    public static class597 field4276;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII[FIFIIF[F)V")
    public static final void method2004(int arg0, int arg1, int arg2, int arg3, int arg4, float[] arg5, int arg6, float arg7, int arg8, int arg9, float arg10, float[] arg11) {
        int var12 = arg6 - arg8;
        int var13 = arg1 - arg0;
        field4272++;
        int var14 = arg4 - arg9;
        float var15 = arg11[2] * (float) var13 + arg11[1] * (float) var12 + arg11[0] * (float) var14;
        float var16 = arg11[5] * (float) var13 + arg11[3] * (float) var14 + arg11[4] * (float) var12;
        float var17 = arg11[arg3] * (float) var13 + arg11[6] * (float) var14 + arg11[7] * (float) var12;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg10 != 1.0F) {
            var18 = arg10 * var18;
        }
        float var19 = var16 + arg7 + 0.5F;
        if (arg2 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg2 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg2 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg5[1] = var19;
        arg5[0] = var18;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method2005(int arg0) {
        if (arg0 != 4908) {
            method2004(-84, 89, 50, 37, 107, null, -109, 0.5058839F, -21, -30, 0.003914575F, null);
        }
        field4270 = null;
        field4276 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)Z")
    public static final boolean method2006(int arg0, int arg1, int arg2) {
        field4275++;
        if (arg0 == 0) {
            return class175.method1311(63, arg2, arg1) | (arg2 & 0x70000) != 0 || class231.method1607(arg2, arg1, arg0 + 7);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILqia;)Lqia;")
    public abstract class21 method2000(int arg0, class21 arg1);
}
