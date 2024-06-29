import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class463 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "[I")
    public static int[] field6517 = new int[1000];

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Z")
    public static boolean field6519 = false;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6518 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field6522 = 0;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lht;")
    public static class499 field6521;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 7)
    public static void method2791(int arg0) {
        field6517 = null;
        field6518 = null;
        if (arg0 >= 42) {
            field6521 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[FIIIIIIFI)V", line = 35)
    public static final void method2792(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8, int arg9) {
        field6520++;
        int var10 = arg7 - arg3;
        int var11 = arg6 - arg5;
        int var12 = arg2 - arg4;
        float var13 = arg1[2] * (float) var10 + arg1[1] * (float) var12 + arg1[0] * (float) var11;
        float var14 = arg1[5] * (float) var10 + arg1[arg9] * (float) var12 + arg1[3] * (float) var11;
        float var15 = arg1[8] * (float) var10 + arg1[7] * (float) var12 + arg1[6] * (float) var11;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg8 + 0.5F;
        if (arg0 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg0 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg0 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class39.field476 = var18;
        class496.field7051 = var17;
    }
}
