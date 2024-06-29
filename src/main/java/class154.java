import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class154 {

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
    public static int field1735 = 0;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(FIIFIBIF)[F", line = 15)
    public static final float[] method839(float arg0, int arg1, int arg2, float arg3, int arg4, byte arg5, int arg6, float arg7) {
        field1734++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
        if (arg5 != 101) {
            field1735 = -111;
        }
        var8[5] = 0.0F;
        var8[7] = 0.0F;
        var8[2] = var11;
        var8[6] = -var11;
        var8[1] = 0.0F;
        var8[3] = 0.0F;
        float var12 = 1.0F - var10;
        var8[0] = var10;
        var8[4] = 1.0F;
        var8[8] = var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg1 / 32767.0F;
        float var17 = 1.0F - var16;
        float var18 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var19 = (float) Math.sqrt((double) (arg6 * arg6 + (arg2 * arg2)));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var15 = (float) arg6 / var19;
                var14 = (float) (-arg2) / var19;
            }
            var13[4] = var16;
            var13[5] = var14 * var18;
            var13[6] = var14 * var15 * var17;
            var13[2] = var14 * var15 * var17;
            var13[3] = -var15 * var18;
            var13[1] = var15 * var18;
            var13[8] = var15 * var15 * var17 + var16;
            var13[0] = var14 * var14 * var17 + var16;
            var13[7] = -var14 * var18;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[5] *= arg7;
        var9[7] *= arg3;
        var9[0] *= arg0;
        var9[1] *= arg0;
        var9[6] *= arg3;
        var9[3] *= arg7;
        var9[4] *= arg7;
        var9[2] *= arg0;
        var9[8] *= arg3;
        return var9;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;I)V", line = 99)
    public static final void method840(File arg0, String arg1, int arg2) {
        if (arg2 != 3639) {
            method839(0.10003093F, 127, 125, 0.3459992F, 45, (byte) 59, 105, -0.9591493F);
        }
        class168.field2012.put(arg1, arg0);
        field1736++;
    }
}
