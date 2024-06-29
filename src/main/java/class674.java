import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class674 extends class427 {

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "[I")
    private int[] field9593 = new int[512];

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Z")
    public static boolean field9590 = false;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Ltt;")
    public static class338 field9591 = new class338(9, 7);

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "[I")
    public static int[] field9592 = new int[14];

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field9589;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public static void method3840(int arg0) {
        field9592 = null;
        if (arg0 != 7) {
            field9592 = null;
        }
        field9591 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([FFIIFIIIFIF)V")
    public final void method2417(float[] arg0, float arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, float arg8, int arg9, float arg10) {
        field9589++;
        int var12 = (int) ((float) arg6 * arg8 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg7 * arg1 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg5 * arg4 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg3 * arg4;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        int var24 = var20 & var17;
        float var25 = class586.method3244(9692, var21);
        int var26 = this.field9593[var23];
        int var27 = this.field9593[var24];
        if (arg2 != 7) {
            this.method2417(null, 0.84608847F, -76, -35, -1.0218958F, -2, 127, -35, 0.540254F, 126, 1.7318257F);
        }
        for (int var28 = 0; var28 < arg7; var28++) {
            float var29 = (float) var28 * arg1;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            float var35 = class586.method3244(9692, var32);
            int var36 = var31 & var15;
            int var37 = this.field9593[var26 + var34];
            int var38 = this.field9593[var26 + var36];
            int var39 = this.field9593[var27 + var34];
            int var40 = this.field9593[var36 + var27];
            for (int var41 = 0; var41 < arg6; var41++) {
                float var42 = (float) var41 * arg8;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                float var47 = class586.method3244(9692, var45);
                int var48 = var43 & var13;
                int var49 = var44 & var13;
                arg0[arg9++] = arg10 * class404.method2304(class404.method2304(class404.method2304(class592.method3277((byte) -54, var32, var21, class15.method97(7, this.field9593[var49 + var40]), var45), var47, class592.method3277((byte) -54, var32, var21, class15.method97(7, this.field9593[var40 + var48]), var46), 12), var35, class404.method2304(class592.method3277((byte) -54, var33, var21, class15.method97(7, this.field9593[var39 + var49]), var45), var47, class592.method3277((byte) -54, var33, var21, class15.method97(this.field9593[var39 + var48], 7), var46), 12), 12), var25, class404.method2304(class404.method2304(class592.method3277((byte) -54, var32, var22, class15.method97(this.field9593[var49 + var38], 7), var45), var47, class592.method3277((byte) -54, var32, var22, class15.method97(7, this.field9593[var38 + var48]), var46), 12), var35, class404.method2304(class592.method3277((byte) -54, var33, var22, class15.method97(this.field9593[var37 + var49], 7), var45), var47, class592.method3277((byte) -54, var33, var22, class15.method97(this.field9593[var37 + var48], 7), var46), 12), class50.method268(arg2, 11)), 12);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V")
    public class674(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field9593[var3] = this.field9593[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field9593[var5];
            this.field9593[var5] = this.field9593[var5 + 256] = this.field9593[var4];
            this.field9593[var4] = this.field9593[var4 + 256] = var6;
        }
    }
}
