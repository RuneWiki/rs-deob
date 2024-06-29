import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class294 extends class627 {

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
    public int field3831;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public int field3829;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "[Z")
    public boolean[] field3835;

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "[I")
    public int[] field3838;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "[I")
    public int[] field3833;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "[[I")
    public int[][] field3832;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
    public static int field3836 = 1337;

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "Lus;")
    public static class328 field3839 = new class328(29, 3);

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "F")
    public static float field3830;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "Lkha;")
    public static class687 field3837;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IFFIIFII)[F")
    public static final float[] method1761(int arg0, float arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7) {
        field3834++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg7 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg7 * 0.024543693F));
        float var12 = 1.0F - var10;
        var8[7] = 0.0F;
        var8[4] = 1.0F;
        var8[2] = var11;
        var8[5] = 0.0F;
        var8[1] = 0.0F;
        var8[8] = var10;
        var8[6] = -var11;
        var8[3] = 0.0F;
        var8[0] = var10;
        if (arg0 != -9670) {
            field3830 = -0.3094434F;
        }
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg3 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg4 * arg4 + arg6 * arg6));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg4) / var19;
                var15 = (float) arg6 / var19;
            }
            var13[1] = var15 * var17;
            var13[5] = var14 * var17;
            var13[7] = -var14 * var17;
            var13[0] = var14 * var14 * var18 + var16;
            var13[3] = -var15 * var17;
            var13[2] = var14 * var15 * var18;
            var13[4] = var16;
            var13[6] = var14 * var15 * var18;
            var13[8] = var15 * var15 * var18 + var16;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[4] *= arg1;
        var9[3] *= arg1;
        var9[0] *= arg2;
        var9[7] *= arg5;
        var9[6] *= arg5;
        var9[8] *= arg5;
        var9[1] *= arg2;
        var9[5] *= arg1;
        var9[2] *= arg2;
        return var9;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
    public static void method1762(byte arg0) {
        field3839 = null;
        if (arg0 <= 6) {
            field3836 = 112;
        }
        field3837 = null;
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(I[B)V")
    public class294(int arg0, byte[] arg1) {
        this.field3831 = arg0;
        class179 var3 = new class179(arg1);
        this.field3829 = var3.method1094(255);
        this.field3835 = new boolean[this.field3829];
        this.field3838 = new int[this.field3829];
        this.field3833 = new int[this.field3829];
        this.field3832 = new int[this.field3829][];
        for (int var4 = 0; var4 < this.field3829; var4++) {
            this.field3833[var4] = var3.method1094(255);
            if (this.field3833[var4] == 6) {
                this.field3833[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field3829; var5++) {
            this.field3835[var5] = var3.method1094(255) == 1;
        }
        for (int var6 = 0; var6 < this.field3829; var6++) {
            this.field3838[var6] = var3.method1107(false);
        }
        for (int var7 = 0; var7 < this.field3829; var7++) {
            this.field3832[var7] = new int[var3.method1094(255)];
        }
        for (int var8 = 0; var8 < this.field3829; var8++) {
            for (int var9 = 0; var9 < this.field3832[var8].length; var9++) {
                this.field3832[var8][var9] = var3.method1094(255);
            }
        }
    }
}
