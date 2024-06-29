import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class609 extends OutputStream {

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "[I")
    public static int[] field8603 = new int[2];

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "[Llda;")
    public static class443[] field8605 = new class443[1024];

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
    public static int field8604;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "I")
    public static int field8606;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIIFZIIFI[F)V")
    public static final void method3398(int arg0, int arg1, int arg2, int arg3, float arg4, boolean arg5, int arg6, int arg7, float arg8, int arg9, float[] arg10) {
        int var11 = arg6 - arg0;
        int var12 = arg9 - arg1;
        int var13 = arg2 - arg7;
        field8604++;
        float var14 = arg10[2] * (float) var11 + arg10[1] * (float) var12 + arg10[0] * (float) var13;
        if (!arg5) {
            field8603 = null;
        }
        float var15 = arg10[5] * (float) var11 + arg10[3] * (float) var13 + arg10[4] * (float) var12;
        float var16 = arg10[8] * (float) var11 + arg10[6] * (float) var13 + arg10[7] * (float) var12;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg8 != 1.0F) {
            var17 = arg8 * var17;
        }
        float var18 = var15 + arg4 + 0.5F;
        if (arg3 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg3 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg3 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class480.field7041 = var18;
        class182.field2227 = var17;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)V")
    public static void method3399(byte arg0) {
        field8605 = null;
        if (arg0 != -70) {
            method3398(-25, 9, -58, -84, 0.11952833F, true, -68, -30, -0.22384362F, 70, null);
        }
        field8603 = null;
    }

    @OriginalMember(owner = "client!aga", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field8606++;
        throw new IOException();
    }
}
