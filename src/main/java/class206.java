import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class206 extends class397 {

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "[I")
    private int[] field3447 = new int[512];

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lrl;")
    public static class672 field3449 = new class672(63, 2);

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Lvg;")
    public static class49 field3450 = new class49(4);

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "Lhga;")
    public static class158 field3452 = new class158(74, 3);

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 5)
    public static void method1584(int arg0) {
        field3452 = null;
        if (arg0 >= -110) {
            method1584(87);
        }
        field3450 = null;
        field3449 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([FIIFFIIIFIF)V", line = 19)
    public final void method1585(float[] arg0, int arg1, int arg2, float arg3, float arg4, int arg5, int arg6, int arg7, float arg8, int arg9, float arg10) {
        int var12 = 101 % ((14 - arg5) / 49);
        field3448++;
        int var13 = (int) ((float) arg7 * arg10 - 1.0F);
        int var14 = var13 & 0xFF;
        int var15 = (int) ((float) arg2 * arg8 - 1.0F);
        int var16 = var15 & 0xFF;
        int var17 = (int) ((float) arg1 * arg4 - 1.0F);
        int var18 = var17 & 0xFF;
        float var19 = (float) arg6 * arg4;
        int var20 = (int) var19;
        int var21 = var20 + 1;
        float var22 = (float) (-var20) + var19;
        float var23 = 1.0F - var22;
        int var24 = var20 & var18;
        float var25 = class371.method2449((byte) 39, var22);
        int var26 = var21 & var18;
        int var27 = this.field3447[var24];
        int var28 = this.field3447[var26];
        for (int var29 = 0; var29 < arg2; var29++) {
            float var30 = (float) var29 * arg8;
            int var31 = (int) var30;
            int var32 = var31 + 1;
            float var33 = (float) (-var31) + var30;
            float var34 = 1.0F - var33;
            int var35 = var32 & var16;
            float var36 = class371.method2449((byte) 39, var33);
            int var37 = var31 & var16;
            int var38 = this.field3447[var27 + var37];
            int var39 = this.field3447[var35 + var27];
            int var40 = this.field3447[var28 + var37];
            int var41 = this.field3447[var35 + var28];
            for (int var42 = 0; var42 < arg7; var42++) {
                float var43 = (float) var42 * arg10;
                int var44 = (int) var43;
                int var45 = var44 + 1;
                float var46 = var43 - (float) var44;
                float var47 = 1.0F - var46;
                int var48 = var44 & var14;
                float var49 = class371.method2449((byte) 39, var46);
                int var50 = var45 & var14;
                arg0[arg9++] = arg3 * class640.method3713(-53, var25, class640.method3713(-65, var36, class640.method3713(-52, var49, class597.method3479(var33, 65535, class453.method2846(this.field3447[var41 + var50], 7), var22, var46), class597.method3479(var33, 65535, class453.method2846(7, this.field3447[var41 + var48]), var22, var47)), class640.method3713(-65, var49, class597.method3479(var34, 65535, class453.method2846(7, this.field3447[var40 + var50]), var22, var46), class597.method3479(var34, 65535, class453.method2846(this.field3447[var40 + var48], 7), var22, var47))), class640.method3713(-109, var36, class640.method3713(-78, var49, class597.method3479(var33, 65535, class453.method2846(this.field3447[var39 + var50], 7), var23, var46), class597.method3479(var33, 65535, class453.method2846(this.field3447[var48 + var39], 7), var23, var47)), class640.method3713(-30, var49, class597.method3479(var34, 65535, class453.method2846(7, this.field3447[var38 + var50]), var23, var46), class597.method3479(var34, 65535, class453.method2846(7, this.field3447[var48 + var38]), var23, var47))));
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V", line = 115)
    public class206(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field3447[var3] = this.field3447[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field3447[var5];
            this.field3447[var5] = this.field3447[var5 + 256] = this.field3447[var4];
            this.field3447[var4] = this.field3447[var4 + 256] = var6;
        }
    }
}
