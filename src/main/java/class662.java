import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class662 {

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "Ltm;")
    public static class334 field9422 = new class334(113, -1);

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "Lpl;")
    public static class616 field9426 = new class616(4);

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
    public int field9421;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
    public static int field9423;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "I")
    public static int field9424;

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "I")
    public static int field9425;

    @OriginalMember(owner = "client!eba", name = "i", descriptor = "I")
    public static int field9427;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "Lmia;")
    public class660 field9420;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "[I")
    public int[] field9419;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V")
    public static final void method3722(byte arg0) {
        for (class447 var1 = (class447) class19.field197.method3463((byte) -50); var1 != null; var1 = (class447) class19.field197.method3469((byte) 107)) {
            if (var1.field6500) {
                var1.method2754(-70);
            }
        }
        field9424++;
        if (arg0 != -17) {
            return;
        }
        for (class447 var2 = (class447) class680.field9612.method3463((byte) -50); var2 != null; var2 = (class447) class680.field9612.method3469((byte) 107)) {
            if (var2.field6500) {
                var2.method2754(-108);
            }
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(FFFIIIIB)[F")
    public static final float[] method3723(float arg0, float arg1, float arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field9423++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
        float var12 = 1.0F - var10;
        var8[5] = 0.0F;
        var8[0] = var10;
        var8[2] = var11;
        var8[6] = -var11;
        var8[1] = 0.0F;
        var8[8] = var10;
        var8[4] = 1.0F;
        var8[3] = 0.0F;
        var8[7] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg6 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        int var18 = 50 / ((35 - arg7) / 38);
        float var19 = 1.0F - var16;
        float var20 = (float) Math.sqrt((double) (arg3 * arg3 + arg5 * arg5));
        if (var20 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var20 != 0.0F) {
                var15 = (float) arg3 / var20;
                var14 = (float) (-arg5) / var20;
            }
            var13[7] = -var14 * var17;
            var13[3] = -var15 * var17;
            var13[1] = var15 * var17;
            var13[5] = var14 * var17;
            var13[4] = var16;
            var13[2] = var14 * var15 * var19;
            var13[8] = var15 * var15 * var19 + var16;
            var13[6] = var14 * var15 * var19;
            var13[0] = var14 * var14 * var19 + var16;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[4] *= arg1;
        var9[8] *= arg0;
        var9[0] *= arg2;
        var9[3] *= arg1;
        var9[1] *= arg2;
        var9[6] *= arg0;
        var9[7] *= arg0;
        var9[5] *= arg1;
        var9[2] *= arg2;
        return var9;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
    public static void method3724(int arg0) {
        field9422 = null;
        if (arg0 != -15099) {
            field9425 = -46;
        }
        field9426 = null;
    }
}
