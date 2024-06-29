import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class30 {

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Ljp;")
    public static class241 field357 = new class241(5000);

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "[I")
    public static int[] field358 = new int[25];

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Z")
    public static boolean field359;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
    public static void method185(boolean arg0) {
        if (arg0) {
            method185(true);
        }
        field358 = null;
        field357 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZFFIIIIF)[F")
    public static final float[] method186(boolean arg0, float arg1, float arg2, int arg3, int arg4, int arg5, int arg6, float arg7) {
        field356++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
        var8[2] = var11;
        float var12 = 1.0F - var10;
        var8[5] = 0.0F;
        var8[8] = var10;
        var8[3] = 0.0F;
        var8[1] = 0.0F;
        if (arg0) {
            return null;
        }
        var8[4] = 1.0F;
        var8[7] = 0.0F;
        var8[0] = var10;
        var8[6] = -var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg5 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg3) / var19;
                var15 = (float) arg4 / var19;
            }
            var13[1] = var15 * var17;
            var13[3] = -var15 * var17;
            var13[5] = var14 * var17;
            var13[8] = var15 * var15 * var18 + var16;
            var13[6] = var14 * var15 * var18;
            var13[4] = var16;
            var13[2] = var14 * var15 * var18;
            var13[0] = var14 * var14 * var18 + var16;
            var13[7] = -var14 * var17;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[2] *= arg1;
        var9[3] *= arg7;
        var9[4] *= arg7;
        var9[0] *= arg1;
        var9[5] *= arg7;
        var9[8] *= arg2;
        var9[6] *= arg2;
        var9[7] *= arg2;
        var9[1] *= arg1;
        return var9;
    }

    static {
        new class530("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field360 = 0;
        field359 = false;
        field361 = -1;
    }
}
