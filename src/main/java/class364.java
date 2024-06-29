import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class364 extends class268 {

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "[I")
    private int[] field5626 = new int[512];

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public static int field5629 = 0;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "Lhi;")
    public static class318 field5628 = new class318(128);

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "Lss;")
    public static class213 field5631 = new class213("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(FIB[FIIIIFFF)V")
    public final void method1820(float arg0, int arg1, byte arg2, float[] arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9, float arg10) {
        field5630++;
        int var12 = (int) ((float) arg7 * arg0 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg1 * arg8 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg5 * arg9 - 1.0F);
        int var17 = var16 & 0xFF;
        int var18 = -45 % ((35 - arg2) / 42);
        float var19 = (float) arg4 * arg9;
        int var20 = (int) var19;
        int var21 = var20 + 1;
        float var22 = (float) (-var20) + var19;
        float var23 = 1.0F - var22;
        float var24 = class306.method2063(var22, -15);
        int var25 = var20 & var17;
        int var26 = var21 & var17;
        int var27 = this.field5626[var25];
        int var28 = this.field5626[var26];
        for (int var29 = 0; var29 < arg1; var29++) {
            float var30 = (float) var29 * arg8;
            int var31 = (int) var30;
            int var32 = var31 + 1;
            float var33 = (float) (-var31) + var30;
            float var34 = 1.0F - var33;
            int var35 = var32 & var15;
            float var36 = class306.method2063(var33, -15);
            int var37 = var31 & var15;
            int var38 = this.field5626[var27 + var37];
            int var39 = this.field5626[var35 + var27];
            int var40 = this.field5626[var28 + var37];
            int var41 = this.field5626[var28 + var35];
            for (int var42 = 0; var42 < arg7; var42++) {
                float var43 = (float) var42 * arg0;
                int var44 = (int) var43;
                int var45 = var44 + 1;
                float var46 = var43 - (float) var44;
                float var47 = 1.0F - var46;
                int var48 = var45 & var13;
                int var49 = var44 & var13;
                float var50 = class306.method2063(var46, -15);
                arg3[arg6++] = class453.method2853(var24, class453.method2853(var36, class453.method2853(var50, class438.method2777(class272.method1842(this.field5626[var38 + var49], 7), 0, var47, var23, var34), 5, class438.method2777(class272.method1842(this.field5626[var38 + var48], 7), 0, var46, var23, var34)), 5, class453.method2853(var50, class438.method2777(class272.method1842(7, this.field5626[var49 + var39]), 0, var47, var23, var33), 5, class438.method2777(class272.method1842(this.field5626[var39 + var48], 7), 0, var46, var23, var33))), 5, class453.method2853(var36, class453.method2853(var50, class438.method2777(class272.method1842(this.field5626[var40 + var49], 7), 0, var47, var22, var34), 5, class438.method2777(class272.method1842(this.field5626[var48 + var40], 7), 0, var46, var22, var34)), 5, class453.method2853(var50, class438.method2777(class272.method1842(this.field5626[var41 + var49], 7), 0, var47, var22, var33), 5, class438.method2777(class272.method1842(this.field5626[var41 + var48], 7), 0, var46, var22, var33)))) * arg10;
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(I)V")
    public class364(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field5626[var3] = this.field5626[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field5626[var5];
            this.field5626[var5] = this.field5626[var5 + 256] = this.field5626[var4];
            this.field5626[var4] = this.field5626[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
    public static void method2394(byte arg0) {
        field5631 = null;
        field5628 = null;
        if (arg0 != -53) {
            method2395(122, (byte) 2);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IB)V")
    public static final void method2395(int arg0, byte arg1) {
        class328 var2 = class211.field3462;
        synchronized (class211.field3462) {
            class211.field3462.method2202(0, arg0);
        }
        field5632++;
        class328 var3 = class524.field7739;
        synchronized (class524.field7739) {
            class524.field7739.method2202(0, arg0);
        }
        if (arg1 <= 56) {
            field5629 = -30;
        }
    }
}
