import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class4 extends class510 {

    @OriginalMember(owner = "client!er", name = "h", descriptor = "[I")
    private int[] field31 = new int[512];

    @OriginalMember(owner = "client!er", name = "m", descriptor = "Luv;")
    public static class2 field36 = new class2(82, 6);

    @OriginalMember(owner = "client!er", name = "o", descriptor = "Ldp;")
    public static class347 field38 = new class347("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!er", name = "p", descriptor = "[Lwg;")
    public static class41[] field39 = new class41[14];

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "Lwd;")
    public static class260 field37;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
    public static void method15(int arg0) {
        field37 = null;
        field38 = null;
        if (arg0 > -24) {
            method15(127);
        }
        field36 = null;
        field39 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(FB[FIFFIIFII)V")
    public final void method16(float arg0, byte arg1, float[] arg2, int arg3, float arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10) {
        field34++;
        int var12 = (int) ((float) arg6 * arg4 - 1.0F);
        if (arg1 != -58) {
            field35 = 108;
        }
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg9 * arg5 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg3 * arg8 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg10 * arg8;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        float var24 = class154.method1110(true, var21);
        int var25 = var20 & var17;
        int var26 = this.field31[var23];
        int var27 = this.field31[var25];
        for (int var28 = 0; var28 < arg9; var28++) {
            float var29 = (float) var28 * arg5;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            float var34 = class154.method1110(true, var32);
            int var35 = var31 & var15;
            int var36 = var30 & var15;
            int var37 = this.field31[var26 + var36];
            int var38 = this.field31[var26 + var35];
            int var39 = this.field31[var36 + var27];
            int var40 = this.field31[var27 + var35];
            for (int var41 = 0; var41 < arg6; var41++) {
                float var42 = (float) var41 * arg4;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                float var47 = class154.method1110(true, var45);
                int var48 = var43 & var13;
                int var49 = var44 & var13;
                arg2[arg7++] = arg0 * class508.method2997(var24, class508.method2997(var34, class508.method2997(var47, class2.method8(var32, var21, (byte) -122, var45, class140.method1023(this.field31[var49 + var40], 7)), -37, class2.method8(var32, var21, (byte) -107, var46, class140.method1023(this.field31[var40 + var48], 7))), -95, class508.method2997(var47, class2.method8(var33, var21, (byte) -111, var45, class140.method1023(this.field31[var39 + var49], 7)), -101, class2.method8(var33, var21, (byte) 61, var46, class140.method1023(this.field31[var48 + var39], 7)))), 123, class508.method2997(var34, class508.method2997(var47, class2.method8(var32, var22, (byte) -120, var45, class140.method1023(this.field31[var38 + var49], 7)), 108, class2.method8(var32, var22, (byte) -112, var46, class140.method1023(7, this.field31[var48 + var38]))), 103, class508.method2997(var47, class2.method8(var33, var22, (byte) 49, var45, class140.method1023(7, this.field31[var37 + var49])), 120, class2.method8(var33, var22, (byte) -10, var46, class140.method1023(this.field31[var37 + var48], 7)))));
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(I)V")
    public class4(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field31[var3] = this.field31[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field31[var5];
            this.field31[var5] = this.field31[var5 + 256] = this.field31[var4];
            this.field31[var4] = this.field31[var4 + 256] = var6;
        }
    }
}
