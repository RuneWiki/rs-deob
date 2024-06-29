import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class419 extends Canvas {

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field5918;

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "[I")
    public static int[] field5915 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "[[Ljb;")
    public static class493[][] field5914;

    @OriginalMember(owner = "client!mba", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 3)
    public final void paint(Graphics arg0) {
        field5921++;
        this.field5918.paint(arg0);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(III[FIIIFI[FI)V", line = 14)
    public static final void method2570(int arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, float arg7, int arg8, float[] arg9, int arg10) {
        int var11 = arg2 - arg5;
        field5920++;
        int var12 = arg1 - arg4;
        int var13 = arg10 - arg0;
        float var14 = arg3[2] * (float) var13 + arg3[1] * (float) var11 + arg3[0] * (float) var12;
        float var15 = arg3[5] * (float) var13 + arg3[3] * (float) var12 + arg3[4] * (float) var11;
        float var16 = arg3[8] * (float) var13 + arg3[arg8] * (float) var11 + arg3[6] * (float) var12;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = (float) Math.asin((double) (var15 / var17)) / 3.1415927F + arg7 + 0.5F;
        if (arg6 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg6 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg6 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        arg9[1] = var19;
        arg9[0] = var18;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V", line = 63)
    public static final void method2571(int arg0) {
        class748.method4156(0);
        field5917++;
        class647.field8902 = null;
        class452.field6394 = null;
        if (arg0 == 16) {
            class703.field9787 = null;
            class279.field3943 = null;
            class687.field9393 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIII)V", line = 80)
    public static final void method2572(int arg0, int arg1, int arg2, int arg3) {
        class165 var4 = class553.field7776[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class458 var5 = var4.field2267;
        class458 var6 = var4.field2278;
        if (var5 != null) {
            var5.field6453 = (short) (var5.field6453 * arg3 / (0x10 << class660.field9038 - 7));
            var5.field6458 = (short) (var5.field6458 * arg3 / (0x10 << class660.field9038 - 7));
        }
        if (var6 != null) {
            var6.field6453 = (short) (var6.field6453 * arg3 / (0x10 << class660.field9038 - 7));
            var6.field6458 = (short) (var6.field6458 * arg3 / (0x10 << class660.field9038 - 7));
        }
    }

    @OriginalMember(owner = "client!mba", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 104)
    public final void update(Graphics arg0) {
        field5916++;
        this.field5918.update(arg0);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lee;I)Lcfa;", line = 112)
    public static final class166 method2573(class675 arg0, int arg1) {
        field5922++;
        class166 var2 = new class166();
        var2.field2279 = arg0.method3757((byte) -65);
        int var3 = -69 / ((arg1 - 54) / 32);
        var2.field2282 = class5.field50.method3340(var2.field2279, false);
        return var2;
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 125)
    public class419(Component arg0) {
        this.field5918 = arg0;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V", line = 133)
    public static void method2574(byte arg0) {
        field5914 = null;
        int var1 = 34 / ((arg0 + 61) / 32);
        field5915 = null;
    }
}
