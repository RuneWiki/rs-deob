import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class505 {

    @OriginalMember(owner = "client!us", name = "f", descriptor = "[I")
    private int[] field1 = new int[512];

    @OriginalMember(owner = "client!us", name = "i", descriptor = "Ljc;")
    public static class305 field4 = new class305(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!us", name = "g", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "j", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIBFIF[FFIF)V")
    public final void method1(int arg0, int arg1, int arg2, byte arg3, float arg4, int arg5, float arg6, float[] arg7, float arg8, int arg9, float arg10) {
        field3++;
        int var12 = (int) ((float) arg0 * arg10 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg1 * arg8 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg5 * arg4 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg9 * arg4;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        if (arg3 > -60) {
            this.field1 = null;
        }
        float var24 = class270.method1639((byte) -78, var21);
        int var25 = var20 & var17;
        int var26 = this.field1[var23];
        int var27 = this.field1[var25];
        for (int var28 = 0; var28 < arg1; var28++) {
            float var29 = (float) var28 * arg8;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            int var35 = var30 & var15;
            float var36 = class270.method1639((byte) -82, var32);
            int var37 = this.field1[var26 + var35];
            int var38 = this.field1[var26 + var34];
            int var39 = this.field1[var35 + var27];
            int var40 = this.field1[var27 + var34];
            for (int var41 = 0; var41 < arg0; var41++) {
                float var42 = (float) var41 * arg10;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                float var47 = class270.method1639((byte) -126, var45);
                int var48 = var43 & var13;
                int var49 = var44 & var13;
                arg7[arg2++] = class431.method2649(var24, class431.method2649(var36, class431.method2649(var47, class265.method1625(var32, var45, var21, class95.method534(this.field1[var40 + var49], 7), 118), false, class265.method1625(var32, var46, var21, class95.method534(this.field1[var40 + var48], 7), 14)), false, class431.method2649(var47, class265.method1625(var33, var45, var21, class95.method534(7, this.field1[var49 + var39]), 125), false, class265.method1625(var33, var46, var21, class95.method534(7, this.field1[var39 + var48]), 56))), false, class431.method2649(var36, class431.method2649(var47, class265.method1625(var32, var45, var22, class95.method534(this.field1[var38 + var49], 7), -88), false, class265.method1625(var32, var46, var22, class95.method534(this.field1[var38 + var48], 7), 78)), false, class431.method2649(var47, class265.method1625(var33, var45, var22, class95.method534(7, this.field1[var49 + var37]), 17), false, class265.method1625(var33, var46, var22, class95.method534(this.field1[var37 + var48], 7), -89)))) * arg6;
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V")
    public static final void method2(int arg0) {
        if (arg0 < -6) {
            if (class137.field1839 != 3) {
                class255.field3395 = class244.field3223;
            }
            field2++;
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(I)V")
    public class1(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field1[var3] = this.field1[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field1[var5];
            this.field1[var5] = this.field1[var5 + 256] = this.field1[var4];
            this.field1[var4] = this.field1[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)V")
    public static void method3(int arg0) {
        if (arg0 != 255) {
            field5 = 64;
        }
        field4 = null;
    }
}
