import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 {

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public int field60 = 128;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
    public int field71 = 128;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "client!ft", name = "o", descriptor = "I")
    public int field73;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
    public static int field69 = 999999;

    @OriginalMember(owner = "client!ft", name = "p", descriptor = "Lao;")
    public static class188 field74 = new class188(41, -2);

    @OriginalMember(owner = "client!ft", name = "q", descriptor = "Ljava/util/Random;")
    public static Random field75 = new Random();

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    public int field65;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
    public int field68;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ft", name = "n", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "Lfc;")
    public static class169 field64;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIFIFFII)[F")
    public static final float[] method37(int arg0, int arg1, float arg2, int arg3, float arg4, float arg5, int arg6, int arg7) {
        field70++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        var8[8] = var10;
        var8[5] = 0.0F;
        var8[3] = 0.0F;
        var8[0] = var10;
        var8[2] = var11;
        var8[1] = 0.0F;
        var8[4] = 1.0F;
        float var12 = 1.0F - var10;
        var8[7] = 0.0F;
        var8[6] = -var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg0 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var18 = 1.0F - var15;
        float var19 = (float) Math.sqrt((double) (arg7 * arg7 + (arg1 * arg1)));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg1) / var19;
                var16 = (float) arg7 / var19;
            }
            var13[2] = var14 * var16 * var18;
            var13[4] = var15;
            var13[3] = -var16 * var17;
            var13[7] = -var14 * var17;
            var13[8] = var16 * var16 * var18 + var15;
            var13[1] = var16 * var17;
            var13[6] = var14 * var16 * var18;
            var13[0] = var14 * var14 * var18 + var15;
            var13[5] = var14 * var17;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[8] *= arg5;
        var9[7] *= arg5;
        var9[4] *= arg4;
        var9[5] *= arg4;
        if (arg6 <= 119) {
            return null;
        }
        var9[0] *= arg2;
        var9[3] *= arg4;
        var9[2] *= arg2;
        var9[6] *= arg5;
        var9[1] *= arg2;
        return var9;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
    public static void method38(int arg0) {
        field74 = null;
        if (arg0 != 3) {
            field75 = null;
        }
        field75 = null;
        field64 = null;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Lft;")
    public final class4 method39(int arg0) {
        if (arg0 == 2) {
            field66++;
            return new class4(this.field62, this.field60, this.field71, this.field63, this.field61, this.field73);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lft;I)V")
    public final void method40(class4 arg0, int arg1) {
        this.field73 = arg0.field73;
        this.field71 = arg0.field71;
        if (arg1 != 7) {
            method38(114);
        }
        this.field62 = arg0.field62;
        field67++;
        this.field61 = arg0.field61;
        this.field60 = arg0.field60;
        this.field63 = arg0.field63;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(I)V")
    public class4(int arg0) {
        this.field62 = arg0;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(IIIIII)V")
    private class4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field73 = arg5;
        this.field61 = arg4;
        this.field60 = arg1;
        this.field71 = arg2;
        this.field63 = arg3;
        this.field62 = arg0;
    }
}
