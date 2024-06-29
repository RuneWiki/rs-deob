import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class542 extends class735 {

    @OriginalMember(owner = "client!gq", name = "y", descriptor = "I")
    public static int field7390 = -1;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    private int field7384;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "Ljava/lang/String;")
    private String field7386;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(FIZIIFFI)[F", line = 3)
    public static final float[] method3058(float arg0, int arg1, boolean arg2, int arg3, int arg4, float arg5, float arg6, int arg7) {
        field7385++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg7 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg7 * 0.024543693F));
        var8[8] = var10;
        var8[2] = var11;
        var8[6] = -var11;
        var8[3] = 0.0F;
        var8[0] = var10;
        var8[4] = 1.0F;
        var8[7] = 0.0F;
        var8[5] = 0.0F;
        float var12 = 1.0F - var10;
        var8[1] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        if (!arg2) {
            field7390 = -13;
        }
        float var15 = (float) arg1 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var18 = 1.0F - var15;
        float var19 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var16 = (float) arg3 / var19;
                var14 = (float) (-arg4) / var19;
            }
            var13[6] = var14 * var16 * var18;
            var13[3] = -var16 * var17;
            var13[2] = var14 * var16 * var18;
            var13[0] = var14 * var14 * var18 + var15;
            var13[5] = var14 * var17;
            var13[1] = var16 * var17;
            var13[8] = var16 * var16 * var18 + var15;
            var13[4] = var15;
            var13[7] = -var14 * var17;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[0] *= arg0;
        var9[7] *= arg6;
        var9[5] *= arg5;
        var9[1] *= arg0;
        var9[3] *= arg5;
        var9[8] *= arg6;
        var9[4] *= arg5;
        var9[2] *= arg0;
        var9[6] *= arg6;
        return var9;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lrh;Z)V", line = 86)
    public final void method624(class280 arg0, boolean arg1) {
        if (arg1) {
            method3058(0.042621396F, -39, false, 27, -100, 1.2264514F, -0.49378103F, -88);
        }
        arg0.method1802(this.field7384, (byte) -90, this.field7386);
        field7388++;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIIB[B)Z", line = 101)
    public static final boolean method3059(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, byte[] arg6) {
        field7387++;
        int var7 = arg1 % arg2;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg2 - var7;
        }
        int var9 = -((arg0 + arg2 - 1) / arg2);
        int var10 = 20 % ((53 - arg5) / 44);
        int var11 = -((arg1 + arg2 - 1) / arg2);
        for (int var12 = var9; var12 < 0; var12++) {
            for (int var13 = var11; var13 < 0; var13++) {
                if (arg6[arg3] == 0) {
                    return true;
                }
                arg3 += arg2;
            }
            int var14 = arg3 - var8;
            if (arg6[var14 - 1] == 0) {
                return true;
            }
            arg3 = arg4 + var14;
        }
        return false;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lcn;)V", line = 166)
    public static final void method3060(class543 arg0) {
        class112.field2107.method490(arg0.field7396, arg0.field7405 + (arg0.method907(-20425) >> 1), arg0.field7398, class390.field5351);
        arg0.field7392 = class390.field5351[0];
        arg0.field7394 = class390.field5351[1];
        arg0.field7393 = class390.field5351[2];
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILfca;)V", line = 172)
    public final void method627(int arg0, class93 arg1) {
        this.field7384 = arg1.method773(3);
        field7389++;
        this.field7386 = arg1.method752(0);
        if (arg0 != 5) {
            field7390 = 104;
        }
    }
}
