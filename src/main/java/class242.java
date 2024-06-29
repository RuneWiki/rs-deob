import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class242 extends class74 {

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "[I")
    public static int[] field2999 = new int[1];

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIIFIFF)[F")
    public static final float[] method1437(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, float arg6, float arg7) {
        field2998++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        if (arg1 != 1369) {
            method1437(92, -16, -30, -93, -0.4656241F, 122, -1.0491012F, 0.792294F);
        }
        float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        var8[8] = var10;
        var8[1] = 0.0F;
        var8[2] = var11;
        float var12 = 1.0F - var10;
        var8[7] = 0.0F;
        var8[0] = var10;
        var8[6] = -var11;
        var8[3] = 0.0F;
        var8[5] = 0.0F;
        var8[4] = 1.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg2 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + arg5 * arg5));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var15 = (float) arg5 / var19;
                var14 = (float) (-arg0) / var19;
            }
            var13[4] = var16;
            var13[3] = -var15 * var17;
            var13[2] = var14 * var15 * var18;
            var13[0] = var14 * var14 * var18 + var16;
            var13[7] = -var14 * var17;
            var13[1] = var15 * var17;
            var13[8] = var15 * var15 * var18 + var16;
            var13[6] = var14 * var15 * var18;
            var13[5] = var14 * var17;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[6] *= arg4;
        var9[8] *= arg4;
        var9[7] *= arg4;
        var9[2] *= arg7;
        var9[0] *= arg7;
        var9[5] *= arg6;
        var9[1] *= arg7;
        var9[3] *= arg6;
        var9[4] *= arg6;
        return var9;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)V")
    public static void method1438(byte arg0) {
        field2999 = null;
        int var1 = 30 % ((arg0 + 3) / 51);
    }
}
