import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class503 extends class294 {

    @OriginalMember(owner = "client!lia", name = "l", descriptor = "[I")
    private int[] field7080 = new int[512];

    @OriginalMember(owner = "client!lia", name = "f", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!lia", name = "h", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!lia", name = "i", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!lia", name = "j", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!lia", name = "k", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!lia", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field7075;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(F[FIIIIIIFFF)V", line = 4)
    public final void method1891(float arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9, float arg10) {
        field7076++;
        int var12 = (int) ((float) arg5 * arg8 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg6 * arg10 - 1.0F);
        int var15 = var14 & 0xFF;
        if (arg4 > -70) {
            this.method1891(0.17424716F, null, 122, -49, 52, -12, 104, 29, -0.26477286F, 1.6875309F, 0.8371372F);
        }
        int var16 = (int) ((float) arg3 * arg0 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg2 * arg0;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        int var24 = var19 & var17;
        float var25 = class445.method2657(10, var21);
        int var26 = this.field7080[var24];
        int var27 = this.field7080[var23];
        for (int var28 = 0; var28 < arg6; var28++) {
            float var29 = (float) var28 * arg10;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            float var34 = class445.method2657(10, var32);
            int var35 = var30 & var15;
            int var36 = var31 & var15;
            int var37 = this.field7080[var26 + var35];
            int var38 = this.field7080[var26 + var36];
            int var39 = this.field7080[var35 + var27];
            int var40 = this.field7080[var36 + var27];
            for (int var41 = 0; var41 < arg5; var41++) {
                float var42 = (float) var41 * arg8;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                float var47 = class445.method2657(10, var45);
                int var48 = var43 & var13;
                int var49 = var44 & var13;
                arg1[arg7++] = arg9 * class39.method223(class39.method223(class39.method223(class108.method808(var33, 1, var46, var22, class519.method3018(7, this.field7080[var48 + var37])), (byte) -52, var47, class108.method808(var33, 1, var45, var22, class519.method3018(this.field7080[var37 + var49], 7))), (byte) -52, var34, class39.method223(class108.method808(var32, 1, var46, var22, class519.method3018(7, this.field7080[var38 + var48])), (byte) -52, var47, class108.method808(var32, 1, var45, var22, class519.method3018(7, this.field7080[var38 + var49])))), (byte) -52, var25, class39.method223(class39.method223(class108.method808(var33, 1, var46, var21, class519.method3018(7, this.field7080[var48 + var39])), (byte) -52, var47, class108.method808(var33, 1, var45, var21, class519.method3018(7, this.field7080[var39 + var49]))), (byte) -52, var34, class39.method223(class108.method808(var32, 1, var46, var21, class519.method3018(7, this.field7080[var48 + var40])), (byte) -52, var47, class108.method808(var32, 1, var45, var21, class519.method3018(7, this.field7080[var49 + var40])))));
            }
        }
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(Z)V", line = 96)
    public static final void method2939(boolean arg0) {
        if (arg0) {
            field7075 = null;
        }
        field7078++;
        if (class786.field10800.field3248 && class571.field7776.field9099 != -1) {
            class624.method3445(class571.field7776.field9101, class571.field7776.field9099, -126);
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(ILmg;Lmg;)V", line = 112)
    public static final void method2940(int arg0, class159 arg1, class159 arg2) {
        field7074++;
        if (arg1.field2144 != null) {
            arg1.method1102((byte) 88);
        }
        arg1.field2144 = arg2.field2144;
        arg1.field2139 = arg2;
        arg1.field2144.field2139 = arg1;
        if (arg0 < 78) {
            method2939(true);
        }
        arg1.field2139.field2144 = arg1;
    }

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "(Z)V", line = 131)
    public static void method2941(boolean arg0) {
        field7075 = null;
        if (!arg0) {
            method2940(50, null, null);
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIIII)V", line = 143)
    public static final void method2942(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7079++;
        int var5 = class269.field3922;
        int var6 = class523.field7269;
        if (arg1 != -8) {
            method2940(-80, null, null);
        }
        if (class24.field246) {
            var5 += class186.method1252(arg1 + 8);
            var6 += class550.method3163(16383);
        }
        if (class780.field10713 == 1) {
            class140 var7 = class559.field7669[class153.field2062 / 100];
            var7.method968(var5 - 8, var6 + -8);
            class199.method1300(var6 - 8, var5 + -8 - -var7.method343(), arg1 ^ 0xFFFFDCFB, var5 - 8, var6 - 8 + var7.method340());
        }
        if (class780.field10713 == 2) {
            class140 var8 = class559.field7669[class153.field2062 / 100 + 4];
            var8.method968(var5 - 8, var6 - 8);
            class199.method1300(var6 - 8, var8.method343() + var5 + -8, 8963, var5 - 8, var8.method340() + var6 - 8);
        }
        class687.method3766(arg1 + 3126);
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(I)V", line = 186)
    public class503(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field7080[var3] = this.field7080[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field7080[var5];
            this.field7080[var5] = this.field7080[var5 + 256] = this.field7080[var4];
            this.field7080[var4] = this.field7080[var4 + 256] = var6;
        }
    }
}
