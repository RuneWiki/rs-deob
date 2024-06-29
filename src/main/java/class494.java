import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class494 extends class551 {

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "[I")
    private int[] field6799 = new int[512];

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "Ljn;")
    public static class134 field6797 = new class134(35, 1);

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)I")
    public static final int method2910(int arg0, int arg1) {
        if (arg0 != 512) {
            field6800 = 45;
        }
        field6798++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(FI[FIIBFFIIF)V")
    public final void method2911(float arg0, int arg1, float[] arg2, int arg3, int arg4, byte arg5, float arg6, float arg7, int arg8, int arg9, float arg10) {
        field6801++;
        int var12 = (int) ((float) arg8 * arg0 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg3 * arg6 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg4 * arg7 - 1.0F);
        if (arg5 != -9) {
            return;
        }
        int var17 = var16 & 0xFF;
        float var18 = (float) arg9 * arg7;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        float var24 = class459.method2767(var21, arg5 ^ 0xFFFFCF3B);
        int var25 = var20 & var17;
        int var26 = this.field6799[var23];
        int var27 = this.field6799[var25];
        for (int var28 = 0; var28 < arg3; var28++) {
            float var29 = (float) var28 * arg6;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            float var35 = class459.method2767(var32, arg5 + 12501);
            int var36 = var31 & var15;
            int var37 = this.field6799[var26 + var34];
            int var38 = this.field6799[var26 + var36];
            int var39 = this.field6799[var27 + var34];
            int var40 = this.field6799[var27 + var36];
            for (int var41 = 0; var41 < arg8; var41++) {
                float var42 = (float) var41 * arg0;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var44 & var13;
                int var48 = var43 & var13;
                float var49 = class459.method2767(var45, 12492);
                arg2[arg1++] = arg10 * class224.method1515(var24, class224.method1515(var35, class224.method1515(var49, class114.method820(25, var45, var32, class407.method2490(this.field6799[var40 + var47], 7), var21), (byte) 119, class114.method820(25, var46, var32, class407.method2490(7, this.field6799[var40 + var48]), var21)), (byte) 119, class224.method1515(var49, class114.method820(25, var45, var33, class407.method2490(7, this.field6799[var39 + var47]), var21), (byte) 119, class114.method820(25, var46, var33, class407.method2490(7, this.field6799[var39 + var48]), var21))), (byte) 119, class224.method1515(var35, class224.method1515(var49, class114.method820(25, var45, var32, class407.method2490(7, this.field6799[var38 + var47]), var22), (byte) 119, class114.method820(25, var46, var32, class407.method2490(this.field6799[var38 + var48], 7), var22)), (byte) 119, class224.method1515(var49, class114.method820(25, var45, var33, class407.method2490(7, this.field6799[var37 + var47]), var22), (byte) 119, class114.method820(25, var46, var33, class407.method2490(7, this.field6799[var37 + var48]), var22))));
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
    public static void method2912(int arg0) {
        if (arg0 >= 67) {
            field6797 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(I)V")
    public class494(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field6799[var3] = this.field6799[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field6799[var5];
            this.field6799[var5] = this.field6799[var5 + 256] = this.field6799[var4];
            this.field6799[var4] = this.field6799[var4 + 256] = var6;
        }
    }
}
