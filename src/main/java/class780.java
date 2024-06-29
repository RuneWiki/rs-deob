import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class780 extends class465 {

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "[I")
    private int[] field10753 = new int[512];

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "Lke;")
    public static class622 field10751 = new class622(87, 7);

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
    public static int field10749;

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
    public static int field10750;

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
    public static int field10752;

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "Z")
    public static boolean field10754;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V", line = 6)
    public static void method4282(int arg0) {
        field10751 = null;
        if (arg0 < 102) {
            field10754 = true;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IBI)Z", line = 19)
    public static final boolean method4283(int arg0, byte arg1, int arg2) {
        field10750++;
        if (arg1 >= -120) {
            field10754 = false;
        }
        return class162.method1273(arg2, -5913, arg0) || class339.method2177(arg0, arg2, false);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IFIIFFIIF[FI)V", line = 37)
    public final void method2753(int arg0, float arg1, int arg2, int arg3, float arg4, float arg5, int arg6, int arg7, float arg8, float[] arg9, int arg10) {
        field10752++;
        int var12 = (int) ((float) arg7 * arg8 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg3 * arg5 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg10 * arg1 - 1.0F);
        int var17 = var16 & arg6;
        float var18 = (float) arg2 * arg1;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        float var23 = class496.method2898(var21, arg6 + 19159);
        int var24 = var19 & var17;
        int var25 = var20 & var17;
        int var26 = this.field10753[var24];
        int var27 = this.field10753[var25];
        for (int var28 = 0; var28 < arg3; var28++) {
            float var29 = (float) var28 * arg5;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            float var34 = class496.method2898(var32, 19414);
            int var35 = var30 & var15;
            int var36 = var31 & var15;
            int var37 = this.field10753[var26 + var35];
            int var38 = this.field10753[var36 + var26];
            int var39 = this.field10753[var35 + var27];
            int var40 = this.field10753[var27 + var36];
            for (int var41 = 0; var41 < arg7; var41++) {
                float var42 = (float) var41 * arg8;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                int var47 = var44 & var13;
                int var48 = var43 & var13;
                float var49 = class496.method2898(var45, 19414);
                arg9[arg0++] = arg4 * class519.method3022(class519.method3022(class519.method3022(class521.method3037(class111.method773(7, this.field10753[var47 + var40]), var32, var45, arg6 - 255, var21), var49, -11703, class521.method3037(class111.method773(7, this.field10753[var40 + var48]), var32, var46, 0, var21)), var34, class470.method2786(arg6, -11594), class519.method3022(class521.method3037(class111.method773(this.field10753[var39 + var47], 7), var33, var45, 0, var21), var49, -11703, class521.method3037(class111.method773(this.field10753[var39 + var48], 7), var33, var46, 0, var21))), var23, -11703, class519.method3022(class519.method3022(class521.method3037(class111.method773(7, this.field10753[var38 + var47]), var32, var45, class470.method2786(arg6, 255), var22), var49, arg6 - 11958, class521.method3037(class111.method773(this.field10753[var38 + var48], 7), var32, var46, 0, var22)), var34, -11703, class519.method3022(class521.method3037(class111.method773(this.field10753[var37 + var47], 7), var33, var45, class470.method2786(arg6, 255), var22), var49, -11703, class521.method3037(class111.method773(7, this.field10753[var48 + var37]), var33, var46, 0, var22))));
            }
        }
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(I)V", line = 126)
    public class780(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field10753[var3] = this.field10753[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field10753[var5];
            this.field10753[var5] = this.field10753[var5 + 256] = this.field10753[var4];
            this.field10753[var4] = this.field10753[var4 + 256] = var6;
        }
    }
}
