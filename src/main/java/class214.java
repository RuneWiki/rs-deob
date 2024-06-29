import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class214 extends class271 {

    @OriginalMember(owner = "client!hp", name = "G", descriptor = "Lnu;")
    public class417 field3121;

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
    public static int field3120 = 0;

    @OriginalMember(owner = "client!hp", name = "B", descriptor = "Llt;")
    public static class475 field3116 = new class475("K", "T", "K", "K");

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
    public static int field3122 = 0;

    @OriginalMember(owner = "client!hp", name = "I", descriptor = "[[B")
    public static byte[][] field3123 = new byte[250][];

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "Z")
    public static boolean field3124 = false;

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "Ljava/awt/Frame;")
    public static Frame field3119;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public static void method1490(int arg0) {
        field3116 = null;
        if (arg0 != -31) {
            field3116 = null;
        }
        field3123 = null;
        field3119 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIF[FIIFII)V")
    public static final void method1491(int arg0, int arg1, int arg2, int arg3, float arg4, float[] arg5, int arg6, int arg7, float arg8, int arg9, int arg10) {
        field3117++;
        int var11 = arg6 - arg3;
        int var12 = arg9 - arg7;
        int var13 = arg2 - arg0;
        float var14 = arg5[2] * (float) var12 + arg5[1] * (float) var11 + arg5[0] * (float) var13;
        float var15 = arg5[5] * (float) var12 + arg5[3] * (float) var13 + arg5[4] * (float) var11;
        if (arg1 < 100) {
            method1491(-121, 59, 33, 112, -0.8356094F, null, 122, 109, -1.0615379F, -41, -36);
        }
        float var16 = arg5[8] * (float) var12 + arg5[6] * (float) var13 + arg5[7] * (float) var11;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg4 != 1.0F) {
            var17 = arg4 * var17;
        }
        float var18 = var15 + arg8 + 0.5F;
        if (arg10 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg10 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg10 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class493.field7290 = var18;
        class317.field4550 = var17;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lnu;)V")
    public class214(class417 arg0) {
        this.field3121 = arg0;
    }
}
