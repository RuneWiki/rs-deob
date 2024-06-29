import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class20 extends class115 {

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public int field297;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "[Z")
    public boolean[] field302;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "[I")
    public int[] field294;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "[[I")
    public int[][] field300;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "[I")
    public int[] field299;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "[S")
    public static short[] field298;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)V")
    public static void method212(boolean arg0) {
        field298 = null;
        if (arg0) {
            field305 = 91;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)I")
    public static final int method213(int arg0, int arg1, int arg2) {
        field301++;
        if (arg2 == 4 || arg2 == 5) {
            return class268.field3985[arg1 & 0x3];
        } else {
            int var3 = 115 % ((10 - arg0) / 46);
            return 256;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZFIFFIII)[F")
    public static final float[] method214(boolean arg0, float arg1, int arg2, float arg3, float arg4, int arg5, int arg6, int arg7) {
        field296++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
        var8[5] = 0.0F;
        var8[0] = var10;
        var8[1] = 0.0F;
        var8[8] = var10;
        var8[7] = 0.0F;
        var8[3] = 0.0F;
        var8[4] = 1.0F;
        var8[6] = -var11;
        float var12 = 1.0F - var10;
        var8[2] = var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg6 / 32767.0F;
        if (!arg0) {
            return null;
        }
        float var17 = 1.0F - var16;
        float var18 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var19 = (float) Math.sqrt((double) (arg5 * arg5 + arg7 * arg7));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg7) / var19;
                var15 = (float) arg5 / var19;
            }
            var13[0] = var14 * var14 * var17 + var16;
            var13[5] = var14 * var18;
            var13[4] = var16;
            var13[3] = -var15 * var18;
            var13[2] = var14 * var15 * var17;
            var13[1] = var15 * var18;
            var13[7] = -var14 * var18;
            var13[6] = var14 * var15 * var17;
            var13[8] = var15 * var15 * var17 + var16;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[3] *= arg1;
        var9[4] *= arg1;
        var9[8] *= arg3;
        var9[2] *= arg4;
        var9[5] *= arg1;
        var9[7] *= arg3;
        var9[1] *= arg4;
        var9[6] *= arg3;
        var9[0] *= arg4;
        return var9;
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(I[B)V")
    public class20(int arg0, byte[] arg1) {
        this.field297 = arg0;
        class468 var3 = new class468(arg1);
        this.field295 = var3.method2765(103);
        this.field302 = new boolean[this.field295];
        this.field294 = new int[this.field295];
        this.field300 = new int[this.field295][];
        this.field299 = new int[this.field295];
        for (int var4 = 0; var4 < this.field295; var4++) {
            this.field299[var4] = var3.method2765(90);
        }
        for (int var5 = 0; var5 < this.field295; var5++) {
            this.field302[var5] = var3.method2765(84) == 1;
        }
        for (int var6 = 0; var6 < this.field295; var6++) {
            this.field294[var6] = var3.method2727((byte) 43);
        }
        for (int var7 = 0; var7 < this.field295; var7++) {
            this.field300[var7] = new int[var3.method2765(65)];
        }
        for (int var8 = 0; var8 < this.field295; var8++) {
            for (int var9 = 0; var9 < this.field300[var8].length; var9++) {
                this.field300[var8][var9] = var3.method2765(72);
            }
        }
    }

    static {
        new class347("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field305 = 0;
        field306 = 0;
    }
}
