import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class685 {

    @OriginalMember(owner = "client!au", name = "a", descriptor = "Lmf;")
    private class382 field9647 = new class382(64);

    @OriginalMember(owner = "client!au", name = "b", descriptor = "Lpu;")
    private class522 field9648;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "Lpu;")
    private class522 field9651;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field9649;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public static int field9650;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field9652;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Lmga;")
    public final class660 method3782(int arg0, int arg1) {
        field9649++;
        class660 var3 = (class660) this.field9647.method2287(1, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field9651.method3007(0, arg0 & 0x7FFF, 5);
        } else {
            var4 = this.field9648.method3007(0, arg0, 5);
        }
        class660 var5 = new class660();
        if (var4 != null) {
            var5.method3655(new class695(var4), 106);
        }
        if (arg0 >= 32768) {
            var5.method3657(11894);
        }
        int var6 = 72 / ((arg1 - 55) / 47);
        this.field9647.method2291(var5, (long) arg0, 1);
        return var5;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IFIFZIFI)[F")
    public static final float[] method3783(int arg0, float arg1, int arg2, float arg3, boolean arg4, int arg5, float arg6, int arg7) {
        field9650++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
        if (!arg4) {
            method3783(10, -1.7873342F, -25, -0.18362536F, true, 63, 0.4963542F, -106);
        }
        float var11 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
        var8[1] = 0.0F;
        var8[7] = 0.0F;
        var8[2] = var11;
        var8[8] = var10;
        var8[4] = 1.0F;
        var8[3] = 0.0F;
        var8[6] = -var11;
        var8[0] = var10;
        float var12 = 1.0F - var10;
        var8[5] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg0 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var18 = 1.0F - var15;
        float var19 = (float) Math.sqrt((double) (arg5 * arg5 + arg7 * arg7));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var16 = (float) arg7 / var19;
                var14 = (float) (-arg5) / var19;
            }
            var13[7] = -var14 * var17;
            var13[6] = var14 * var16 * var18;
            var13[8] = var16 * var16 * var18 + var15;
            var13[3] = -var16 * var17;
            var13[2] = var14 * var16 * var18;
            var13[5] = var14 * var17;
            var13[0] = var14 * var14 * var18 + var15;
            var13[1] = var16 * var17;
            var13[4] = var15;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[8] *= arg1;
        var9[5] *= arg6;
        var9[1] *= arg3;
        var9[0] *= arg3;
        var9[6] *= arg1;
        var9[3] *= arg6;
        var9[2] *= arg3;
        var9[4] *= arg6;
        var9[7] *= arg1;
        return var9;
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(ILpu;Lpu;)V")
    public class685(int arg0, class522 arg1, class522 arg2) {
        this.field9648 = arg1;
        this.field9651 = arg2;
        if (this.field9648 != null) {
            this.field9648.method2988(-107, 0);
        }
        if (this.field9651 != null) {
            this.field9651.method2988(-82, 0);
        }
    }
}
