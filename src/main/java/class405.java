import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public abstract class class405 {

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[I")
    public static int[] field5620 = new int[13];

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
    public static int[] field5619 = new int[2];

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "F")
    public static float field5624;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "[Lcw;")
    public static class21[] field5621;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(FIIIIFFI)[F", line = 4)
    public static final float[] method2457(float arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, int arg7) {
        field5622++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg7 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg7 * 0.024543693F));
        var8[1] = 0.0F;
        var8[2] = var11;
        var8[4] = 1.0F;
        var8[8] = var10;
        var8[6] = -var11;
        var8[7] = 0.0F;
        var8[0] = var10;
        var8[5] = 0.0F;
        float var12 = 1.0F - var10;
        var8[3] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg4 / 32767.0F;
        float var16 = 0.0F;
        float var17 = 1.0F - var15;
        float var18 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var19 = (float) Math.sqrt((double) (arg1 * arg1 + arg3 * arg3));
        if ((float) arg2 == var19 && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg1) / var19;
                var16 = (float) arg3 / var19;
            }
            var13[1] = var16 * var18;
            var13[2] = var14 * var16 * var17;
            var13[3] = -var16 * var18;
            var13[7] = -var14 * var18;
            var13[0] = var14 * var14 * var17 + var15;
            var13[6] = var14 * var16 * var17;
            var13[4] = var15;
            var13[5] = var14 * var18;
            var13[8] = var16 * var16 * var17 + var15;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[7] *= arg0;
        var9[5] *= arg5;
        var9[4] *= arg5;
        var9[1] *= arg6;
        var9[6] *= arg0;
        var9[8] *= arg0;
        var9[2] *= arg6;
        var9[0] *= arg6;
        var9[3] *= arg5;
        return var9;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V", line = 86)
    public static void method2460(boolean arg0) {
        field5620 = null;
        if (!arg0) {
            field5619 = null;
            field5621 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public abstract void method2458(int arg0);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Z")
    public abstract boolean method2459(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
    public abstract void method2461(boolean arg0);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[BI)V")
    public abstract void method2462(int arg0, int arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III[B)I")
    public abstract int method2463(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;
}
