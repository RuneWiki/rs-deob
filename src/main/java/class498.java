import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class498 extends class89 {

    @OriginalMember(owner = "client!so", name = "h", descriptor = "[I")
    private int[] field6874 = new int[512];

    @OriginalMember(owner = "client!so", name = "i", descriptor = "Ljw;")
    public static class581 field6875 = new class581(78, 1);

    @OriginalMember(owner = "client!so", name = "k", descriptor = "Ljda;")
    public static class239 field6877 = new class239(30);

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "[I")
    public static int[] field6876;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V", line = 6)
    public static void method2877(int arg0) {
        int var1 = 82 / ((-arg0 - 68) / 53);
        field6876 = null;
        field6877 = null;
        field6875 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(FIFIIFIIF[FI)V", line = 18)
    public final void method724(float arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, float[] arg9, int arg10) {
        field6873++;
        int var12 = (int) ((float) arg1 * arg0 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg6 * arg5 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg10 * arg2 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg3 * arg2;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        float var23 = class130.method1045((byte) -6, var21);
        int var24 = var20 & var17;
        int var25 = var19 & var17;
        if (arg7 > -74) {
            this.field6874 = null;
        }
        int var26 = this.field6874[var25];
        int var27 = this.field6874[var24];
        for (int var28 = 0; var28 < arg6; var28++) {
            float var29 = (float) var28 * arg5;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            float var35 = class130.method1045((byte) -6, var32);
            int var36 = var30 & var15;
            int var37 = this.field6874[var26 + var36];
            int var38 = this.field6874[var34 + var26];
            int var39 = this.field6874[var36 + var27];
            int var40 = this.field6874[var27 + var34];
            for (int var41 = 0; var41 < arg1; var41++) {
                float var42 = (float) var41 * arg0;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                float var48 = class130.method1045((byte) -6, var45);
                int var49 = var44 & var13;
                arg9[arg4++] = arg8 * class237.method1539(class237.method1539(class237.method1539(class38.method267(var33, var46, -5853, var22, class440.method2643(this.field6874[var37 + var47], 7)), 0, var48, class38.method267(var33, var45, -5853, var22, class440.method2643(this.field6874[var37 + var49], 7))), 0, var35, class237.method1539(class38.method267(var32, var46, -5853, var22, class440.method2643(this.field6874[var47 + var38], 7)), 0, var48, class38.method267(var32, var45, -5853, var22, class440.method2643(this.field6874[var38 + var49], 7)))), 0, var23, class237.method1539(class237.method1539(class38.method267(var33, var46, -5853, var21, class440.method2643(7, this.field6874[var47 + var39])), 0, var48, class38.method267(var33, var45, -5853, var21, class440.method2643(this.field6874[var39 + var49], 7))), 0, var35, class237.method1539(class38.method267(var32, var46, -5853, var21, class440.method2643(7, this.field6874[var40 + var47])), 0, var48, class38.method267(var32, var45, -5853, var21, class440.method2643(this.field6874[var40 + var49], 7)))));
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(I)V", line = 112)
    public class498(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field6874[var3] = this.field6874[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field6874[var5];
            this.field6874[var5] = this.field6874[var5 + 256] = this.field6874[var4];
            this.field6874[var4] = this.field6874[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lor;IJBIIILaa;I)V", line = 152)
    public static final void method2878(class668 arg0, int arg1, long arg2, byte arg3, int arg4, int arg5, int arg6, class514 arg7, int arg8) {
        if (arg3 != 115) {
            return;
        }
        field6872++;
        int var10 = arg4 * arg4 + (arg8 * arg8);
        if ((long) var10 > arg2) {
            return;
        }
        int var11 = Math.min(arg0.field9282 / 2, arg0.field9297 / 2);
        if ((var11 * var11) >= var10) {
            class546.method3105(arg4, arg8, arg1, arg0, arg7, class418.field5993[arg5], arg6, 2);
            return;
        }
        var11 -= 10;
        int var12;
        if (class502.field6938 == 4) {
            var12 = (int) class135.field1974 & 0x3FFF;
        } else {
            var12 = (int) class135.field1974 + class594.field8116 & 0x3FFF;
        }
        int var13 = class749.field10324[var12];
        int var14 = class749.field10316[var12];
        if (class502.field6938 != 4) {
            var14 = var14 * 256 / (class299.field4334 + 256);
            var13 = var13 * 256 / (class299.field4334 + 256);
        }
        int var15 = arg8 * var13 + (arg4 * var14) >> 14;
        int var16 = arg8 * var14 - (arg4 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class687.field9655[arg5].method1109((float) arg0.field9282 / 2.0F + (float) arg6 + (float) var19, (float) arg0.field9297 / 2.0F + (float) arg1 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }
}
