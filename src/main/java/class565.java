import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class565 extends class762 {

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "[I")
    private int[] field7169 = new int[512];

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "Lfca;")
    public static class661 field7168;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IFFIIFBI[FIF)V")
    public final void method3054(int arg0, float arg1, float arg2, int arg3, int arg4, float arg5, byte arg6, int arg7, float[] arg8, int arg9, float arg10) {
        field7167++;
        int var12 = (int) ((float) arg0 * arg5 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg4 * arg2 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg3 * arg1 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg7 * arg1;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        float var24 = class196.method1351(var21, arg6 ^ 0xFFFFFFBE);
        int var25 = var20 & var17;
        int var26 = this.field7169[var23];
        if (arg6 != -33) {
            return;
        }
        int var27 = this.field7169[var25];
        for (int var28 = 0; var28 < arg4; var28++) {
            float var29 = (float) var28 * arg2;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            float var35 = class196.method1351(var32, 101);
            int var36 = var31 & var15;
            int var37 = this.field7169[var34 + var26];
            int var38 = this.field7169[var26 + var36];
            int var39 = this.field7169[var27 + var34];
            int var40 = this.field7169[var27 + var36];
            for (int var41 = 0; var41 < arg0; var41++) {
                float var42 = (float) var41 * arg5;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                int var48 = var44 & var13;
                float var49 = class196.method1351(var45, 100);
                arg8[arg9++] = class467.method2611(class237.method1570(arg6, 32), var24, class467.method2611(-1, var35, class467.method2611(-1, var49, class372.method2131(var32, var21, class249.method1625(7, this.field7169[var40 + var48]), (byte) -122, var45), class372.method2131(var32, var21, class249.method1625(this.field7169[var40 + var47], 7), (byte) -84, var46)), class467.method2611(class237.method1570(arg6, 32), var49, class372.method2131(var33, var21, class249.method1625(this.field7169[var39 + var48], 7), (byte) -128, var45), class372.method2131(var33, var21, class249.method1625(this.field7169[var39 + var47], 7), (byte) -104, var46))), class467.method2611(-1, var35, class467.method2611(-1, var49, class372.method2131(var32, var22, class249.method1625(7, this.field7169[var48 + var38]), (byte) -101, var45), class372.method2131(var32, var22, class249.method1625(7, this.field7169[var38 + var47]), (byte) -79, var46)), class467.method2611(arg6 + 32, var49, class372.method2131(var33, var22, class249.method1625(this.field7169[var37 + var48], 7), (byte) -102, var45), class372.method2131(var33, var22, class249.method1625(7, this.field7169[var37 + var47]), (byte) -118, var46)))) * arg10;
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
    public static void method3055(int arg0) {
        int var1 = -124 / ((-arg0 - 34) / 61);
        field7168 = null;
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(I)V")
    public class565(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field7169[var3] = this.field7169[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field7169[var5];
            this.field7169[var5] = this.field7169[var5 + 256] = this.field7169[var4];
            this.field7169[var4] = this.field7169[var4 + 256] = var6;
        }
    }
}
