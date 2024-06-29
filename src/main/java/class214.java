import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class214 extends class236 {

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "Liu;")
    public static class390 field3023 = new class390(41, 3);

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public int field3024;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "Lbn;")
    public class294 field3019;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method1323(int arg0) {
        field3023 = null;
        int var1 = 121 % ((15 - arg0) / 42);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IFFIIIFI)[F")
    public static final float[] method1324(int arg0, float arg1, float arg2, int arg3, int arg4, int arg5, float arg6, int arg7) {
        field3027++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        var8[4] = 1.0F;
        var8[6] = -var11;
        var8[0] = var10;
        var8[1] = 0.0F;
        var8[7] = 0.0F;
        var8[3] = 0.0F;
        int var12 = 16 / ((arg4 - 86) / 38);
        var8[5] = 0.0F;
        var8[2] = var11;
        float var13 = 1.0F - var10;
        var8[8] = var10;
        float[] var14 = new float[9];
        float var15 = 1.0F;
        float var16 = 0.0F;
        float var17 = (float) arg5 / 32767.0F;
        float var18 = -((float) Math.sqrt((double) (1.0F - var17 * var17)));
        float var19 = 1.0F - var17;
        float var20 = (float) Math.sqrt((double) (arg0 * arg0 + arg7 * arg7));
        if (var20 == 0.0F && var17 == 0.0F) {
            var9 = var8;
        } else {
            if (var20 != 0.0F) {
                var15 = (float) (-arg0) / var20;
                var16 = (float) arg7 / var20;
            }
            var14[1] = var16 * var18;
            var14[6] = var15 * var16 * var19;
            var14[5] = var15 * var18;
            var14[0] = var15 * var15 * var19 + var17;
            var14[2] = var15 * var16 * var19;
            var14[8] = var16 * var16 * var19 + var17;
            var14[4] = var17;
            var14[7] = -var15 * var18;
            var14[3] = -var16 * var18;
            var9[0] = var8[2] * var14[6] + var8[1] * var14[3] + var8[0] * var14[0];
            var9[1] = var8[2] * var14[7] + var8[0] * var14[1] + var8[1] * var14[4];
            var9[2] = var8[2] * var14[8] + var8[1] * var14[5] + var8[0] * var14[2];
            var9[3] = var8[5] * var14[6] + var8[4] * var14[3] + var8[3] * var14[0];
            var9[4] = var8[5] * var14[7] + var8[4] * var14[4] + var8[3] * var14[1];
            var9[5] = var8[5] * var14[8] + var8[3] * var14[2] + var8[4] * var14[5];
            var9[6] = var8[8] * var14[6] + var8[6] * var14[0] + var8[7] * var14[3];
            var9[7] = var8[8] * var14[7] + var8[6] * var14[1] + var8[7] * var14[4];
            var9[8] = var8[8] * var14[8] + var8[7] * var14[5] + var8[6] * var14[2];
        }
        var9[6] *= arg1;
        var9[3] *= arg2;
        var9[0] *= arg6;
        var9[4] *= arg2;
        var9[7] *= arg1;
        var9[5] *= arg2;
        var9[2] *= arg6;
        var9[1] *= arg6;
        var9[8] *= arg1;
        return var9;
    }
}
