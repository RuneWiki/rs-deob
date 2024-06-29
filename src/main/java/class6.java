import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class class6 extends class417 {

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Lh;")
    public static class572 field52 = new class572("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Lada;")
    public static class144 field55 = new class144(28, 2);

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "Lsl;")
    public static class391 field56 = new class391("", 11);

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public int field48;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public int field50;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "[I")
    public int[] field54;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "[Ldea;")
    public static class206[] field57;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIBFIFF)[F")
    public static final float[] method14(int arg0, int arg1, int arg2, byte arg3, float arg4, int arg5, float arg6, float arg7) {
        field49++;
        if (arg3 < 2) {
            field57 = null;
        }
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
        var8[0] = var10;
        var8[2] = var11;
        var8[4] = 1.0F;
        var8[1] = 0.0F;
        float var12 = 1.0F - var10;
        var8[3] = 0.0F;
        var8[7] = 0.0F;
        var8[8] = var10;
        var8[5] = 0.0F;
        var8[6] = -var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg0 / 32767.0F;
        float var17 = 1.0F - var16;
        float var18 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var19 = (float) Math.sqrt((double) (arg5 * arg5 + (arg1 * arg1)));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var15 = (float) arg5 / var19;
                var14 = (float) (-arg1) / var19;
            }
            var13[8] = var15 * var15 * var17 + var16;
            var13[4] = var16;
            var13[5] = var14 * var18;
            var13[1] = var15 * var18;
            var13[3] = -var15 * var18;
            var13[7] = -var14 * var18;
            var13[2] = var14 * var15 * var17;
            var13[6] = var14 * var15 * var17;
            var13[0] = var14 * var14 * var17 + var16;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[0] *= arg4;
        var9[2] *= arg4;
        var9[6] *= arg6;
        var9[7] *= arg6;
        var9[4] *= arg7;
        var9[8] *= arg6;
        var9[1] *= arg4;
        var9[3] *= arg7;
        var9[5] *= arg7;
        return var9;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Z")
    public static final boolean method15(byte arg0) {
        if (arg0 >= -91) {
            method14(122, -128, -56, (byte) 54, -0.08654163F, -14, 0.7246061F, -0.19127F);
        }
        field53++;
        return class293.field4042;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
    public abstract void method16(int arg0, int arg1, int arg2, Graphics arg3, int arg4, byte arg5);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public abstract void method17(int arg0, byte arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
    public static void method18(byte arg0) {
        field55 = null;
        if (arg0 != -116) {
            field56 = null;
        }
        field56 = null;
        field57 = null;
        field52 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method19(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method20(String arg0, int arg1, String arg2, String arg3) {
        field51++;
        for (int var4 = arg0.indexOf(arg2); var4 != -1; var4 = arg0.indexOf(arg2, arg3.length() + var4)) {
            arg0 = arg0.substring(0, var4) + arg3 + arg0.substring(arg2.length() + var4);
        }
        if (arg1 < 72) {
            method15((byte) 122);
        }
        return arg0;
    }
}
