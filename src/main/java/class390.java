import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class390 {

    @OriginalMember(owner = "client!ifa", name = "m", descriptor = "I")
    public int field5789 = -1;

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "I")
    public static int field5782 = 0;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "I")
    public int field5777;

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
    public int field5778;

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!ifa", name = "h", descriptor = "I")
    public int field5784;

    @OriginalMember(owner = "client!ifa", name = "i", descriptor = "I")
    public int field5785;

    @OriginalMember(owner = "client!ifa", name = "j", descriptor = "I")
    public int field5786;

    @OriginalMember(owner = "client!ifa", name = "k", descriptor = "I")
    public int field5787;

    @OriginalMember(owner = "client!ifa", name = "l", descriptor = "I")
    public int field5788;

    @OriginalMember(owner = "client!ifa", name = "n", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!ifa", name = "o", descriptor = "I")
    public int field5791;

    @OriginalMember(owner = "client!ifa", name = "p", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "Lee;")
    public static class628 field5781;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2401(byte arg0, String arg1) {
        field5779++;
        if (arg0 > -17) {
            field5790 = -8;
        }
        System.out.println("Error: " + class564.method3222("\n", "%0a", arg1, 0));
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)Z")
    public static final boolean method2402(int arg0) {
        field5783++;
        class689 var1 = (class689) class394.field5849.method472((byte) -105);
        if (var1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < var1.field9702; var2++) {
            if (var1.field9701[var2] != null && var1.field9701[var2].field7024 == 0) {
                return false;
            }
            if (var1.field9697[var2] != null && var1.field9697[var2].field7024 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V")
    public static void method2403(byte arg0) {
        field5781 = null;
        if (arg0 != -97) {
            field5781 = null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(FIIFIIFI)[F")
    public static final float[] method2404(float arg0, int arg1, int arg2, float arg3, int arg4, int arg5, float arg6, int arg7) {
        field5780++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg7 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg7 * 0.024543693F));
        var8[2] = var11;
        var8[7] = 0.0F;
        var8[5] = 0.0F;
        var8[3] = 0.0F;
        var8[8] = var10;
        var8[6] = -var11;
        var8[1] = 0.0F;
        float var12 = 1.0F - var10;
        var8[0] = var10;
        var8[4] = 1.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg2 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var18 = 1.0F - var15;
        float var19 = (float) Math.sqrt((double) (arg1 * arg1 + arg5 * arg5));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg1) / var19;
                var16 = (float) arg5 / var19;
            }
            var13[7] = -var14 * var17;
            var13[1] = var16 * var17;
            var13[0] = var14 * var14 * var18 + var15;
            var13[5] = var14 * var17;
            var13[4] = var15;
            var13[2] = var14 * var16 * var18;
            var13[3] = -var16 * var17;
            var13[6] = var14 * var16 * var18;
            var13[8] = var16 * var16 * var18 + var15;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[0] *= arg3;
        var9[3] *= arg6;
        var9[1] *= arg3;
        var9[4] *= arg6;
        var9[5] *= arg6;
        var9[6] *= arg0;
        var9[7] *= arg0;
        var9[8] *= arg0;
        var9[arg4] *= arg3;
        return var9;
    }
}
