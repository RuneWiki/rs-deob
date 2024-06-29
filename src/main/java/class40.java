import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class40 extends class320 {

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "[I")
    public static int[] field727 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "Lrn;")
    public static class174 field728 = new class174(35, -1);

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "Liv;")
    public static class64 field730 = new class64(101, -1);

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "Ljava/lang/String;")
    public static String field731 = "";

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!nr", name = "u", descriptor = "[[[Liq;")
    public static class429[][][] field733;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(FII[FIIIFIII)V", line = 7)
    public static final void method406(float arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, float arg7, int arg8, int arg9, int arg10) {
        int var11 = arg9 - arg6;
        int var12 = arg4 - arg5;
        int var13 = arg10 - arg1;
        field726++;
        float var14 = arg3[2] * (float) var11 + arg3[arg2] * (float) var12 + arg3[1] * (float) var13;
        float var15 = arg3[5] * (float) var11 + arg3[3] * (float) var12 + arg3[4] * (float) var13;
        float var16 = arg3[8] * (float) var11 + arg3[6] * (float) var12 + arg3[7] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var17 = arg7 * var17;
        }
        float var18 = var15 + arg0 + 0.5F;
        if (arg8 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg8 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class134.field2152 = var17;
        class457.field6855 = var18;
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)V", line = 58)
    public static void method407(int arg0) {
        if (arg0 != 0) {
            method407(85);
        }
        field733 = null;
        field727 = null;
        field728 = null;
        field731 = null;
        field730 = null;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)Ljava/lang/String;", line = 72)
    public static final String method408(int arg0, int arg1) {
        field724++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg0 != -30278) {
            method407(38);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class435.field6475.method2180(client.field2870, arg0 + 59769) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class51.field914.method2180(client.field2870, 29491) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(II)V", line = 106)
    public class40(int arg0, int arg1) {
        this.field725 = arg1;
        this.field729 = arg0;
    }
}
