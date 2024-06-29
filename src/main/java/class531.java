import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class531 extends RuntimeException {

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field7240;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "Ljava/lang/String;")
    public String field7238;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "[F")
    public static float[] field7244 = new float[4];

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "Lfc;")
    public static class235 field7239 = new class235(88, 8);

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "J")
    public static long field7245 = 0L;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "Loa;")
    public static class638 field7242;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "Lqda;")
    public static class89 field7246;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "[S")
    public static short[] field7241;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V", line = 6)
    public static void method2940(byte arg0) {
        field7246 = null;
        if (arg0 < 102) {
            field7239 = null;
        }
        field7244 = null;
        field7242 = null;
        field7239 = null;
        field7241 = null;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(FIFIFIII)[F", line = 22)
    public static final float[] method2941(float arg0, int arg1, float arg2, int arg3, float arg4, int arg5, int arg6, int arg7) {
        field7243++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
        var8[2] = var11;
        var8[4] = 1.0F;
        float var12 = 1.0F - var10;
        var8[1] = 0.0F;
        var8[8] = var10;
        var8[3] = 0.0F;
        var8[7] = 0.0F;
        var8[5] = 0.0F;
        var8[6] = -var11;
        var8[0] = var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg7 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg5 * arg5 + arg6 * arg6));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg5) / var19;
                var15 = (float) arg6 / var19;
            }
            var13[0] = var14 * var14 * var18 + var16;
            var13[4] = var16;
            var13[6] = var14 * var15 * var18;
            var13[3] = -var15 * var17;
            var13[1] = var15 * var17;
            var13[8] = var15 * var15 * var18 + var16;
            var13[5] = var14 * var17;
            var13[2] = var14 * var15 * var18;
            var13[7] = -var14 * var17;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[2] *= arg0;
        var9[3] *= arg4;
        var9[0] *= arg0;
        if (arg3 >= -56) {
            return null;
        }
        var9[7] *= arg2;
        var9[6] *= arg2;
        var9[5] *= arg4;
        var9[4] *= arg4;
        var9[8] *= arg2;
        var9[1] *= arg0;
        return var9;
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 107)
    public class531(Throwable arg0, String arg1) {
        this.field7240 = arg0;
        this.field7238 = arg1;
    }
}
