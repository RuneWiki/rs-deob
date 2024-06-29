import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class177 extends class531 {

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "[I")
    private int[] field2217 = new int[512];

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "Z")
    public static boolean field2219 = false;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "[I")
    public static int[] field2216 = new int[25];

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V", line = 14)
    public static final void method1166(int arg0) {
        field2220++;
        for (int var1 = arg0; var1 < 5; var1++) {
            class676.field9596[var1] = false;
        }
        class31.field303 = class132.field1679;
        class425.field5908 = class261.field3603;
        class42.field546 = 5;
        class372.field5330 = class628.field8545;
        class15.field128 = 0;
        class565.field7841 = class336.field4947;
        class612.field8353 = class430.field5984;
        class243.field3278 = -1;
        class556.field7593 = 0;
        class31.field302 = class471.field6379;
        class227.field2966 = -1;
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)V", line = 41)
    public static void method1167(int arg0) {
        field2216 = null;
        if (arg0 != 7) {
            method1166(-6);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IFI[FIFIFIIF)V", line = 51)
    public final void method1168(int arg0, float arg1, int arg2, float[] arg3, int arg4, float arg5, int arg6, float arg7, int arg8, int arg9, float arg10) {
        field2218++;
        int var12 = (int) ((float) arg4 * arg7 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg9 * arg1 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg2 * arg10 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg8 * arg10;
        if (arg0 < 85) {
            field2219 = true;
        }
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        float var24 = class156.method1046(var21, 10);
        int var25 = var19 & var17;
        int var26 = this.field2217[var25];
        int var27 = this.field2217[var23];
        for (int var28 = 0; var28 < arg9; var28++) {
            float var29 = (float) var28 * arg1;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            float var34 = class156.method1046(var32, 10);
            int var35 = var30 & var15;
            int var36 = var31 & var15;
            int var37 = this.field2217[var35 + var26];
            int var38 = this.field2217[var26 + var36];
            int var39 = this.field2217[var27 + var35];
            int var40 = this.field2217[var27 + var36];
            for (int var41 = 0; var41 < arg4; var41++) {
                float var42 = (float) var41 * arg7;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                float var47 = class156.method1046(var45, 10);
                int var48 = var43 & var13;
                int var49 = var44 & var13;
                arg3[arg6++] = arg5 * class199.method1266(class199.method1266(class199.method1266(class509.method2881(class230.method1424(7, this.field2217[var40 + var49]), var32, false, var21, var45), var47, 76, class509.method2881(class230.method1424(this.field2217[var40 + var48], 7), var32, false, var21, var46)), var34, -126, class199.method1266(class509.method2881(class230.method1424(7, this.field2217[var39 + var49]), var33, false, var21, var45), var47, -96, class509.method2881(class230.method1424(this.field2217[var39 + var48], 7), var33, false, var21, var46))), var24, 41, class199.method1266(class199.method1266(class509.method2881(class230.method1424(this.field2217[var38 + var49], 7), var32, false, var22, var45), var47, -127, class509.method2881(class230.method1424(this.field2217[var48 + var38], 7), var32, false, var22, var46)), var34, -99, class199.method1266(class509.method2881(class230.method1424(this.field2217[var49 + var37], 7), var33, false, var22, var45), var47, 126, class509.method2881(class230.method1424(this.field2217[var48 + var37], 7), var33, false, var22, var46))));
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(I)V", line = 144)
    public class177(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field2217[var3] = this.field2217[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field2217[var5];
            this.field2217[var5] = this.field2217[var5 + 256] = this.field2217[var4];
            this.field2217[var4] = this.field2217[var4 + 256] = var6;
        }
    }
}
