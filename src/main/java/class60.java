import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public abstract class class60 {

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "[I")
    public static int[] field615 = new int[4096];

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "[I")
    public static int[] field613 = new int[3];

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Z")
    public static boolean field614;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZII)I", line = 7)
    public static final int method321(int arg0, boolean arg1, int arg2, int arg3) {
        field617++;
        if (arg3 != 3) {
            field615 = null;
        }
        class628 var4 = class555.method3150(arg2, 0, arg1);
        if (var4 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var4.field8858.length) {
            return var4.field8858[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(FIFFIIII)[F", line = 26)
    public static final float[] method322(float arg0, int arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7) {
        field612++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
        var8[2] = var11;
        float var12 = (float) arg5 - var10;
        var8[5] = 0.0F;
        var8[8] = var10;
        var8[7] = 0.0F;
        var8[6] = -var11;
        var8[0] = var10;
        var8[4] = 1.0F;
        var8[1] = 0.0F;
        var8[3] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg4 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var18 = 1.0F - var15;
        float var19 = (float) Math.sqrt((double) (arg1 * arg1 + arg7 * arg7));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var16 = (float) arg1 / var19;
                var14 = (float) (-arg7) / var19;
            }
            var13[2] = var14 * var16 * var18;
            var13[8] = var16 * var16 * var18 + var15;
            var13[5] = var14 * var17;
            var13[3] = -var16 * var17;
            var13[4] = var15;
            var13[6] = var14 * var16 * var18;
            var13[0] = var14 * var14 * var18 + var15;
            var13[7] = -var14 * var17;
            var13[1] = var16 * var17;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[2] *= arg0;
        var9[8] *= arg3;
        var9[1] *= arg0;
        var9[3] *= arg2;
        var9[4] *= arg2;
        var9[5] *= arg2;
        var9[7] *= arg3;
        var9[0] *= arg0;
        var9[6] *= arg3;
        return var9;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V", line = 107)
    public static void method323(byte arg0) {
        if (arg0 == -60) {
            field613 = null;
            field615 = null;
        }
    }
}
