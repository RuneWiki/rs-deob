import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class593 {

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Ldr;")
    public static class675 field7958 = new class675(90, 3);

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field7960 = 0;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Lvw;")
    public static class284 field7959;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IFFIIFBI)[F", line = 3)
    public static final float[] method3280(int arg0, float arg1, float arg2, int arg3, int arg4, float arg5, byte arg6, int arg7) {
        field7957++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
        var8[4] = 1.0F;
        var8[2] = var11;
        var8[5] = 0.0F;
        var8[8] = var10;
        var8[6] = -var11;
        float var12 = 1.0F - var10;
        var8[1] = 0.0F;
        var8[7] = 0.0F;
        var8[0] = var10;
        var8[3] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        if (arg6 >= -79) {
            field7960 = -89;
        }
        float var15 = (float) arg3 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var18 = 1.0F - var15;
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + arg7 * arg7));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg7) / var19;
                var16 = (float) arg0 / var19;
            }
            var13[1] = var16 * var17;
            var13[5] = var14 * var17;
            var13[4] = var15;
            var13[7] = -var14 * var17;
            var13[3] = -var16 * var17;
            var13[0] = var14 * var14 * var18 + var15;
            var13[2] = var14 * var16 * var18;
            var13[6] = var14 * var16 * var18;
            var13[8] = var16 * var16 * var18 + var15;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[5] *= arg5;
        var9[3] *= arg5;
        var9[1] *= arg2;
        var9[7] *= arg1;
        var9[8] *= arg1;
        var9[4] *= arg5;
        var9[2] *= arg2;
        var9[6] *= arg1;
        var9[0] *= arg2;
        return var9;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Lou;", line = 90)
    public static final class567 method3281(int arg0, int arg1, int arg2) {
        class565 var3 = class407.field5237[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7079;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 108)
    public static void method3282(byte arg0) {
        if (arg0 != 61) {
            field7958 = null;
        }
        field7958 = null;
        field7959 = null;
    }
}
