import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class372 extends class490 {

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "[I")
    private int[] field5669 = new int[512];

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "[I")
    public static int[] field5665 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Z")
    public static boolean field5662 = true;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "D")
    public static double field5668 = -1.0D;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Lps;")
    public static class63 field5663;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "[I")
    public static int[] field5666;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "[Laa;")
    public static class341[] field5670;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBII)V", line = 7)
    public static final void method2350(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 125) {
            return;
        }
        field5661++;
        class177 var4 = class344.method2229(11, arg2, (byte) 93);
        var4.method1191(-123);
        var4.field2372 = arg0;
        var4.field2369 = arg3;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V", line = 29)
    public static void method2351(int arg0) {
        if (arg0 != 7) {
            field5668 = -0.4354391124800729D;
        }
        field5663 = null;
        field5666 = null;
        field5665 = null;
        field5670 = null;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)[Lth;", line = 49)
    public static final class430[] method2352(byte arg0) {
        field5671++;
        int var1 = -98 / ((-arg0 - 59) / 36);
        return new class430[] { class198.field2623, class198.field2624, class198.field2625, class198.field2626, class198.field2627, class198.field2628, class198.field2629, class198.field2630, class198.field2631, class198.field2632, class198.field2633, class198.field2634 };
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I)V", line = 65)
    public class372(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field5669[var3] = this.field5669[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field5669[var5];
            this.field5669[var5] = this.field5669[var5 + 256] = this.field5669[var4];
            this.field5669[var4] = this.field5669[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FIFIF[FIIFII)V", line = 97)
    public final void method2353(float arg0, int arg1, float arg2, int arg3, float arg4, float[] arg5, int arg6, int arg7, float arg8, int arg9, int arg10) {
        field5664++;
        int var12 = (int) ((float) arg3 * arg2 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg6 * arg0 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg1 * arg8 - 1.0F);
        int var17 = var16 & 0xFF;
        if (arg7 != 24345) {
            return;
        }
        float var18 = (float) arg9 * arg8;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        int var24 = var20 & var17;
        float var25 = class533.method3151(true, var21);
        int var26 = this.field5669[var23];
        int var27 = this.field5669[var24];
        for (int var28 = 0; var28 < arg6; var28++) {
            float var29 = (float) var28 * arg0;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            float var35 = class533.method3151(true, var32);
            int var36 = var30 & var15;
            int var37 = this.field5669[var26 + var36];
            int var38 = this.field5669[var34 + var26];
            int var39 = this.field5669[var27 + var36];
            int var40 = this.field5669[var34 + var27];
            for (int var41 = 0; var41 < arg3; var41++) {
                float var42 = (float) var41 * arg2;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                float var47 = class533.method3151(true, var45);
                int var48 = var44 & var13;
                int var49 = var43 & var13;
                arg5[arg10++] = class315.method1982(class315.method1982(class315.method1982(class402.method2481(var21, var32, var45, arg7 - 24361, class519.method3092(7, this.field5669[var40 + var48])), var47, class402.method2481(var21, var32, var46, 116, class519.method3092(7, this.field5669[var40 + var49])), true), var35, class315.method1982(class402.method2481(var21, var33, var45, 120, class519.method3092(this.field5669[var39 + var48], 7)), var47, class402.method2481(var21, var33, var46, -35, class519.method3092(this.field5669[var39 + var49], 7)), true), true), var25, class315.method1982(class315.method1982(class402.method2481(var22, var32, var45, 118, class519.method3092(this.field5669[var48 + var38], 7)), var47, class402.method2481(var22, var32, var46, 106, class519.method3092(this.field5669[var49 + var38], 7)), true), var35, class315.method1982(class402.method2481(var22, var33, var45, 123, class519.method3092(this.field5669[var37 + var48], 7)), var47, class402.method2481(var22, var33, var46, 110, class519.method3092(7, this.field5669[var37 + var49])), true), true), true) * arg4;
            }
        }
    }
}
