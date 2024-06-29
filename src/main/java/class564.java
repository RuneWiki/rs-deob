import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class564 {

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    private int field7365;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    private int field7356;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    private int field7364;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    private int field7355;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    private int field7351;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    private int field7353;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    private int field7357;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    private int field7361;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    private int field7352;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    private int field7368;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Lra;")
    public static class361 field7358 = new class361(82, 6);

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field7366 = 0;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "[Z")
    public static boolean[] field7369;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IFIFIFBI)[F", line = 11)
    public static final float[] method3012(int arg0, float arg1, int arg2, float arg3, int arg4, float arg5, byte arg6, int arg7) {
        field7362++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
        float var12 = 1.0F - var10;
        var8[3] = 0.0F;
        var8[8] = var10;
        var8[4] = 1.0F;
        var8[2] = var11;
        var8[0] = var10;
        var8[1] = 0.0F;
        var8[7] = 0.0F;
        var8[6] = -var11;
        var8[5] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg2 / 32767.0F;
        float var16 = 0.0F;
        float var17 = 1.0F - var15;
        float var18 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var19 = (float) Math.sqrt((double) (arg7 * arg7 + (arg4 * arg4)));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg4) / var19;
                var16 = (float) arg7 / var19;
            }
            var13[7] = -var14 * var18;
            var13[2] = var14 * var16 * var17;
            var13[1] = var16 * var18;
            var13[4] = var15;
            var13[6] = var14 * var16 * var17;
            var13[3] = -var16 * var18;
            var13[8] = var16 * var16 * var17 + var15;
            var13[5] = var14 * var18;
            var13[0] = var14 * var14 * var17 + var15;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[5] *= arg3;
        var9[7] *= arg1;
        var9[6] *= arg1;
        var9[3] *= arg3;
        var9[1] *= arg5;
        var9[2] *= arg5;
        int var20 = -53 % ((56 - arg6) / 38);
        var9[0] *= arg5;
        var9[4] *= arg3;
        var9[8] *= arg1;
        return var9;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZC)I", line = 95)
    public static final int method3013(boolean arg0, char arg1) {
        if (arg0) {
            return -29;
        } else {
            field7359++;
            return arg1 >= '\u0000' && class680.field9371.length > arg1 ? class680.field9371[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIIIII)V", line = 109)
    public final void method3014(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field7356 = arg3;
        this.field7364 = arg10 * arg10;
        this.field7355 = arg0;
        field7354++;
        this.field7365 = arg2;
        this.field7361 = this.field7365 + arg7;
        int var12 = -38 / ((arg9 - 12) / 48);
        this.field7357 = this.field7355 + arg1;
        this.field7353 = this.field7356 + arg6;
        this.field7368 = this.field7356 + arg8;
        this.field7351 = this.field7355 + arg4;
        this.field7352 = this.field7365 + arg5;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([Lxa;B)V", line = 130)
    public static final void method3015(class511[] arg0, byte arg1) {
        field7360++;
        int var2 = 35 % ((-arg1 - 26) / 47);
        class356.field4614 = arg0.length;
        class256.field3469 = new class511[class356.field4614 + 10];
        class386.field4958 = new int[class356.field4614 + 10];
        class443.method2512(arg0, 0, class256.field3469, 0, class356.field4614);
        for (int var3 = 0; var3 < class356.field4614; var3++) {
            class386.field4958[var3] = class256.field3469[var3].method595();
        }
        for (int var4 = class356.field4614; var4 < class256.field3469.length; var4++) {
            class386.field4958[var4] = 12;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBII)Z", line = 163)
    public final boolean method3016(int arg0, byte arg1, int arg2, int arg3) {
        field7367++;
        if (this.field7357 > arg3 || arg3 > this.field7351) {
            return false;
        } else if (arg0 < this.field7368 || this.field7353 < arg0) {
            return false;
        } else if (this.field7352 <= arg2 && arg2 <= this.field7361) {
            int var5 = 50 % ((5 - arg1) / 37);
            int var6 = arg3 - this.field7355;
            int var7 = arg2 - this.field7365;
            return this.field7364 > var6 * var6 + var7 * var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 196)
    public static void method3017(int arg0) {
        if (arg0 != 1) {
            method3012(-73, -0.41226786F, -50, 0.035984885F, 117, -0.8122355F, (byte) -65, -86);
        }
        field7358 = null;
        field7369 = null;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 208)
    public class564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field7365 = arg2;
        this.field7356 = arg1;
        this.field7364 = arg3 * arg3;
        this.field7355 = arg0;
        this.field7351 = this.field7355 + arg5;
        this.field7353 = this.field7356 + arg7;
        this.field7357 = this.field7355 + arg4;
        this.field7361 = this.field7365 + arg9;
        this.field7352 = this.field7365 + arg8;
        this.field7368 = this.field7356 + arg6;
    }
}
