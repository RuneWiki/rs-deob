import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class304 extends class323 {

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "[I")
    private int[] field3929 = new int[512];

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
    public static int field3928 = -1;

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "[I")
    public static int[] field3931 = new int[13];

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "Lba;")
    public static class607 field3930 = new class607(16);

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V")
    public static void method1841(byte arg0) {
        field3931 = null;
        field3930 = null;
        int var1 = 33 % ((arg0 - 13) / 49);
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(I)V")
    public class304(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field3929[var3] = this.field3929[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field3929[var5];
            this.field3929[var5] = this.field3929[var5 + 256] = this.field3929[var4];
            this.field3929[var4] = this.field3929[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(FIF[FIIFIZFI)V")
    public final void method1842(float arg0, int arg1, float arg2, float[] arg3, int arg4, int arg5, float arg6, int arg7, boolean arg8, float arg9, int arg10) {
        field3932++;
        int var12 = (int) ((float) arg4 * arg9 - 1.0F);
        int var13 = var12 & 0xFF;
        if (arg8) {
            return;
        }
        int var14 = (int) ((float) arg7 * arg0 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg1 * arg2 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg5 * arg2;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        float var23 = class414.method2469(var21, !arg8);
        int var24 = var19 & var17;
        int var25 = var20 & var17;
        int var26 = this.field3929[var24];
        int var27 = this.field3929[var25];
        for (int var28 = 0; var28 < arg7; var28++) {
            float var29 = (float) var28 * arg0;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            float var34 = class414.method2469(var32, true);
            int var35 = var31 & var15;
            int var36 = var30 & var15;
            int var37 = this.field3929[var26 + var36];
            int var38 = this.field3929[var26 + var35];
            int var39 = this.field3929[var27 + var36];
            int var40 = this.field3929[var35 + var27];
            for (int var41 = 0; var41 < arg4; var41++) {
                float var42 = (float) var41 * arg9;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                int var48 = var44 & var13;
                float var49 = class414.method2469(var45, true);
                arg3[arg10++] = arg6 * class241.method1504(0, var23, class241.method1504(0, var34, class241.method1504(0, var49, class339.method2141(958404324, var33, var22, class143.method783(7, this.field3929[var37 + var47]), var46), class339.method2141(958404324, var33, var22, class143.method783(7, this.field3929[var37 + var48]), var45)), class241.method1504(0, var49, class339.method2141(958404324, var32, var22, class143.method783(this.field3929[var38 + var47], 7), var46), class339.method2141(958404324, var32, var22, class143.method783(this.field3929[var38 + var48], 7), var45))), class241.method1504(0, var34, class241.method1504(0, var49, class339.method2141(958404324, var33, var21, class143.method783(this.field3929[var39 + var47], 7), var46), class339.method2141(958404324, var33, var21, class143.method783(7, this.field3929[var39 + var48]), var45)), class241.method1504(0, var49, class339.method2141(958404324, var32, var21, class143.method783(7, this.field3929[var40 + var47]), var46), class339.method2141(958404324, var32, var21, class143.method783(this.field3929[var40 + var48], 7), var45))));
            }
        }
    }
}
