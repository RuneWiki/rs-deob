import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class173 extends class462 {

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "[I")
    private int[] field2487 = new int[512];

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(FFIIIFFII[FI)V", line = 3)
    public final void method1209(float arg0, float arg1, int arg2, int arg3, int arg4, float arg5, float arg6, int arg7, int arg8, float[] arg9, int arg10) {
        field2486++;
        int var12 = (int) ((float) arg7 * arg5 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg3 * arg0 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg2 * arg1 - 1.0F);
        int var17 = var16 & 0xFF;
        if (arg4 > -28) {
            this.method1209(-0.69422024F, -0.28629804F, -38, -60, 23, -1.1542555F, 0.3671383F, -21, -99, null, -28);
        }
        float var18 = (float) arg10 * arg1;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        int var24 = var20 & var17;
        float var25 = class471.method2831(-69, var21);
        int var26 = this.field2487[var23];
        int var27 = this.field2487[var24];
        for (int var28 = 0; var28 < arg3; var28++) {
            float var29 = (float) var28 * arg0;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            float var35 = class471.method2831(-64, var32);
            int var36 = var31 & var15;
            int var37 = this.field2487[var26 + var34];
            int var38 = this.field2487[var36 + var26];
            int var39 = this.field2487[var34 + var27];
            int var40 = this.field2487[var27 + var36];
            for (int var41 = 0; var41 < arg7; var41++) {
                float var42 = (float) var41 * arg5;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                int var48 = var44 & var13;
                float var49 = class471.method2831(-121, var45);
                arg9[arg8++] = class179.method1288(var25, class179.method1288(var35, class179.method1288(var49, class457.method2748(2, var32, class494.method2942(7, this.field2487[var48 + var40]), var21, var45), class457.method2748(2, var32, class494.method2942(7, this.field2487[var40 + var47]), var21, var46), (byte) 76), class179.method1288(var49, class457.method2748(2, var33, class494.method2942(7, this.field2487[var48 + var39]), var21, var45), class457.method2748(2, var33, class494.method2942(this.field2487[var47 + var39], 7), var21, var46), (byte) 76), (byte) 76), class179.method1288(var35, class179.method1288(var49, class457.method2748(2, var32, class494.method2942(this.field2487[var38 + var48], 7), var22, var45), class457.method2748(2, var32, class494.method2942(7, this.field2487[var38 + var47]), var22, var46), (byte) 76), class179.method1288(var49, class457.method2748(2, var33, class494.method2942(7, this.field2487[var48 + var37]), var22, var45), class457.method2748(2, var33, class494.method2942(7, this.field2487[var47 + var37]), var22, var46), (byte) 76), (byte) 76), (byte) 76) * arg6;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V", line = 97)
    public class173(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field2487[var3] = this.field2487[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field2487[var5];
            this.field2487[var5] = this.field2487[var5 + 256] = this.field2487[var4];
            this.field2487[var4] = this.field2487[var4 + 256] = var6;
        }
    }
}
