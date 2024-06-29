import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public abstract class class26 extends class224 {

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "Lrf;")
    public class83 field373;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "Lqe;")
    public static class465 field375 = new class465(75, 12);

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "Z")
    public static boolean field376 = false;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(FFIFIIII)[F", line = 7)
    public static final float[] method191(float arg0, float arg1, int arg2, float arg3, int arg4, int arg5, int arg6, int arg7) {
        field372++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
        var8[6] = -var11;
        var8[4] = 1.0F;
        var8[0] = var10;
        var8[3] = 0.0F;
        var8[7] = 0.0F;
        var8[1] = 0.0F;
        var8[5] = 0.0F;
        float var12 = 1.0F - var10;
        var8[8] = var10;
        var8[2] = var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg4 / 32767.0F;
        float var17 = 1.0F - var16;
        float var18 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        if (arg2 != 12) {
            return null;
        }
        float var19 = (float) Math.sqrt((double) (arg7 * arg7 + (arg5 * arg5)));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg5) / var19;
                var15 = (float) arg7 / var19;
            }
            var13[5] = var14 * var18;
            var13[4] = var16;
            var13[8] = var15 * var15 * var17 + var16;
            var13[1] = var15 * var18;
            var13[0] = var14 * var14 * var17 + var16;
            var13[6] = var14 * var15 * var17;
            var13[7] = -var14 * var18;
            var13[2] = var14 * var15 * var17;
            var13[3] = -var15 * var18;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[2] *= arg1;
        var9[7] *= arg0;
        var9[3] *= arg3;
        var9[8] *= arg0;
        var9[4] *= arg3;
        var9[6] *= arg0;
        var9[1] *= arg1;
        var9[5] *= arg3;
        var9[0] *= arg1;
        return var9;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 92)
    public static void method193(int arg0) {
        if (arg0 != -28893) {
            method191(-0.6753086F, 0.47601667F, 58, 0.8296225F, -78, -28, -10, -107);
        }
        field375 = null;
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lrf;I)V", line = 108)
    public class26(class83 arg0, int arg1) {
        this.field373 = arg0;
        this.field374 = arg1;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)Z")
    public abstract boolean method192(byte arg0);

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method194(int arg0);
}
