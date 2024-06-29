import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class214 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lqv;")
    public static class316 field3228 = new class316(47, -2);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Ltf;")
    public static class198 field3230;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Ljk;")
    public static class456 field3231;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[[Z")
    public static boolean[][] field3232;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method1435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3226++;
        if (arg2 != -7533) {
            method1435(-110, 0, -76, -119, -43, -110);
        }
        if (arg5 >= class465.field6763 && arg0 <= class176.field2630 && class424.field5996 <= arg4 && arg3 <= class333.field4936) {
            class400.method2397((byte) 92, arg4, arg1, arg5, arg0, arg3);
        } else {
            class97.method735(arg3, arg5, arg2 ^ 0xFFFFA8DE, arg1, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIFFIFB)[F", line = 21)
    public static final float[] method1436(int arg0, int arg1, int arg2, float arg3, float arg4, int arg5, float arg6, byte arg7) {
        field3229++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
        if (arg7 <= 102) {
            method1437(95);
        }
        float var11 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
        var8[3] = 0.0F;
        float var12 = 1.0F - var10;
        var8[6] = -var11;
        var8[7] = 0.0F;
        var8[4] = 1.0F;
        var8[5] = 0.0F;
        var8[1] = 0.0F;
        var8[2] = var11;
        var8[8] = var10;
        var8[0] = var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var18 = 1.0F - var15;
        float var19 = (float) Math.sqrt((double) (arg2 * arg2 + arg5 * arg5));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var16 = (float) arg5 / var19;
                var14 = (float) (-arg2) / var19;
            }
            var13[6] = var14 * var16 * var18;
            var13[3] = -var16 * var17;
            var13[4] = var15;
            var13[5] = var14 * var17;
            var13[1] = var16 * var17;
            var13[0] = var14 * var14 * var18 + var15;
            var13[2] = var14 * var16 * var18;
            var13[7] = -var14 * var17;
            var13[8] = var16 * var16 * var18 + var15;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[3] *= arg3;
        var9[2] *= arg4;
        var9[0] *= arg4;
        var9[6] *= arg6;
        var9[4] *= arg3;
        var9[1] *= arg4;
        var9[5] *= arg3;
        var9[8] *= arg6;
        var9[7] *= arg6;
        return var9;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 110)
    public static void method1437(int arg0) {
        field3231 = null;
        field3228 = null;
        field3230 = null;
        field3232 = null;
        if (arg0 != 6) {
            method1437(-103);
        }
    }
}
