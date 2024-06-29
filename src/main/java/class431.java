import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class431 extends class71 {

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "[I")
    private int[] field5930 = new int[512];

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "[C")
    public static char[] field5929 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field5932 = 0;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "Lpaa;")
    public static class712 field5928 = null;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field5933 = 0;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BFFFIIFII[FI)V")
    public final void method452(byte arg0, float arg1, float arg2, float arg3, int arg4, int arg5, float arg6, int arg7, int arg8, float[] arg9, int arg10) {
        field5931++;
        int var12 = (int) ((float) arg7 * arg2 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg5 * arg3 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg4 * arg6 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg10 * arg6;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        int var24 = var19 & var17;
        if (arg0 != -74) {
            this.field5930 = null;
        }
        float var25 = class612.method3576(var21, 651653936);
        int var26 = this.field5930[var24];
        int var27 = this.field5930[var23];
        for (int var28 = 0; var28 < arg5; var28++) {
            float var29 = (float) var28 * arg3;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            float var35 = class612.method3576(var32, 651653936);
            int var36 = var30 & var15;
            int var37 = this.field5930[var26 + var36];
            int var38 = this.field5930[var26 + var34];
            int var39 = this.field5930[var36 + var27];
            int var40 = this.field5930[var27 + var34];
            for (int var41 = 0; var41 < arg7; var41++) {
                float var42 = (float) var41 * arg2;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                int var48 = var44 & var13;
                float var49 = class612.method3576(var45, 651653936);
                arg9[arg8++] = class700.method3949(var25, class700.method3949(var35, class700.method3949(var49, class537.method3198(class136.method878(7, this.field5930[var37 + var47]), var33, var22, var46, -119), class537.method3198(class136.method878(7, this.field5930[var37 + var48]), var33, var22, var45, -122), -96), class700.method3949(var49, class537.method3198(class136.method878(this.field5930[var38 + var47], 7), var32, var22, var46, arg0 - 48), class537.method3198(class136.method878(this.field5930[var38 + var48], 7), var32, var22, var45, -117), -57), class450.method2703(arg0, 42)), class700.method3949(var35, class700.method3949(var49, class537.method3198(class136.method878(7, this.field5930[var47 + var39]), var33, var21, var46, class450.method2703(arg0, 52)), class537.method3198(class136.method878(this.field5930[var39 + var48], 7), var33, var21, var45, -127), class450.method2703(arg0, 93)), class700.method3949(var49, class537.method3198(class136.method878(this.field5930[var40 + var47], 7), var32, var21, var46, -123), class537.method3198(class136.method878(7, this.field5930[var40 + var48]), var32, var21, var45, -118), -11), class450.method2703(arg0, 60)), arg0 + 43) * arg1;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
    public static void method2607(boolean arg0) {
        field5928 = null;
        field5929 = null;
        if (arg0) {
            method2607(true);
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(I)V")
    public class431(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field5930[var3] = this.field5930[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field5930[var5];
            this.field5930[var5] = this.field5930[var5 + 256] = this.field5930[var4];
            this.field5930[var4] = this.field5930[var4 + 256] = var6;
        }
    }
}
