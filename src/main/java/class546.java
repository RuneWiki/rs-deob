import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class546 extends class516 {

    @OriginalMember(owner = "client!kga", name = "o", descriptor = "[I")
    private int[] field7713 = new int[512];

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "Lrfa;")
    public static class201 field7707 = class564.method3177((byte) 83);

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!kga", name = "n", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!kga", name = "p", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!kga", name = "q", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "[Lffa;")
    public static class187[] field7709;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIFIFIFF[FII)V", line = 5)
    public final void method2848(int arg0, int arg1, float arg2, int arg3, float arg4, int arg5, float arg6, float arg7, float[] arg8, int arg9, int arg10) {
        field7715++;
        int var12 = (int) ((float) arg9 * arg6 - (float) arg10);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg1 * arg7 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg0 * arg2 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg3 * arg2;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        int var24 = var20 & var17;
        float var25 = class255.method1516(var21, 1024);
        int var26 = this.field7713[var23];
        int var27 = this.field7713[var24];
        for (int var28 = 0; var28 < arg1; var28++) {
            float var29 = (float) var28 * arg7;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            float var34 = class255.method1516(var32, arg10 + 1023);
            int var35 = var31 & var15;
            int var36 = var30 & var15;
            int var37 = this.field7713[var26 + var36];
            int var38 = this.field7713[var26 + var35];
            int var39 = this.field7713[var36 + var27];
            int var40 = this.field7713[var27 + var35];
            for (int var41 = 0; var41 < arg9; var41++) {
                float var42 = (float) var41 * arg6;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                float var47 = class255.method1516(var45, 1024);
                int var48 = var43 & var13;
                int var49 = var44 & var13;
                arg8[arg5++] = class724.method4064(class724.method4064(class724.method4064(class446.method2498(var46, class321.method1919(this.field7713[var37 + var48], 7), -24576, var33, var22), (byte) 112, class446.method2498(var45, class321.method1919(7, this.field7713[var37 + var49]), -24576, var33, var22), var47), (byte) -107, class724.method4064(class446.method2498(var46, class321.method1919(7, this.field7713[var38 + var48]), -24576, var32, var22), (byte) 107, class446.method2498(var45, class321.method1919(7, this.field7713[var49 + var38]), -24576, var32, var22), var47), var34), (byte) -124, class724.method4064(class724.method4064(class446.method2498(var46, class321.method1919(this.field7713[var39 + var48], 7), -24576, var33, var21), (byte) -89, class446.method2498(var45, class321.method1919(7, this.field7713[var39 + var49]), arg10 - 24577, var33, var21), var47), (byte) -103, class724.method4064(class446.method2498(var46, class321.method1919(7, this.field7713[var40 + var48]), -24576, var32, var21), (byte) -108, class446.method2498(var45, class321.method1919(7, this.field7713[var49 + var40]), -24576, var32, var21), var47), var34), var25) * arg4;
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)V", line = 93)
    public static void method3097(byte arg0) {
        if (arg0 != -107) {
            method3097((byte) 65);
        }
        field7707 = null;
        field7709 = null;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V", line = 115)
    public static final void method3098(int arg0) {
        class411.method2365((byte) 0);
        field7712++;
        int var1 = -3 % ((-arg0 - 69) / 32);
        class267.field3537 = null;
        class633.field8793 = null;
        class464.field6427 = null;
        class493.field6722 = null;
        class395.field5617 = null;
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(I)V", line = 134)
    public class546(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field7713[var3] = this.field7713[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field7713[var5];
            this.field7713[var5] = this.field7713[var5 + 256] = this.field7713[var4];
            this.field7713[var4] = this.field7713[var4 + 256] = var6;
        }
    }
}
