import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class726 extends class435 {

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "[I")
    private int[] field10152 = new int[512];

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field10150 = -1;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "Lmo;")
    public static class746 field10153 = new class746();

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field10148;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field10149;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field10151;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field10154;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public static int field10155;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field10156;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "[[Z")
    public static boolean[][] field10147;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIII)I")
    public static final int method4036(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field10148++;
        if (arg3 != 4095) {
            field10151 = 64;
        }
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 4095 - arg0;
        } else if (var4 == 2) {
            return 4095 - arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IFFIIFI[FFII)V")
    public final void method2717(int arg0, float arg1, float arg2, int arg3, int arg4, float arg5, int arg6, float[] arg7, float arg8, int arg9, int arg10) {
        field10155++;
        int var12 = (int) ((float) arg9 * arg5 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg4 * arg8 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg0 * arg1 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg3 * arg1;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        float var23 = class714.method3993(var21, (byte) -82);
        int var24 = var20 & var17;
        int var25 = var19 & var17;
        int var26 = this.field10152[var25];
        int var27 = this.field10152[var24];
        if (arg10 != 17834) {
            method4038(53, true, 61);
        }
        for (int var28 = 0; var28 < arg4; var28++) {
            float var29 = (float) var28 * arg8;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            int var35 = var31 & var15;
            float var36 = class714.method3993(var32, (byte) 48);
            int var37 = this.field10152[var26 + var34];
            int var38 = this.field10152[var26 + var35];
            int var39 = this.field10152[var27 + var34];
            int var40 = this.field10152[var35 + var27];
            for (int var41 = 0; var41 < arg9; var41++) {
                float var42 = (float) var41 * arg5;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                float var47 = class714.method3993(var45, (byte) 100);
                int var48 = var43 & var13;
                int var49 = var44 & var13;
                arg7[arg6++] = class342.method2034(118, class342.method2034(arg10 - 17779, class342.method2034(-103, class590.method3377(var32, arg10 + -17832, class327.method1956(7, this.field10152[var49 - -var40]), var45, var21), var47, class590.method3377(var32, class555.method3251(arg10, 17832), class327.method1956(this.field10152[var48 - -var40], 7), var46, var21)), var36, class342.method2034(-112, class590.method3377(var33, 2, class327.method1956(7, this.field10152[var39 + var49]), var45, var21), var47, class590.method3377(var33, arg10 - 17832, class327.method1956(this.field10152[var39 + var48], 7), var46, var21))), var23, class342.method2034(arg10 - 17958, class342.method2034(-102, class590.method3377(var32, arg10 + -17832, class327.method1956(7, this.field10152[var38 + var49]), var45, var22), var47, class590.method3377(var32, 2, class327.method1956(this.field10152[var48 - -var38], 7), var46, var22)), var36, class342.method2034(-81, class590.method3377(var33, 2, class327.method1956(this.field10152[var37 + var49], 7), var45, var22), var47, class590.method3377(var33, arg10 - 17832, class327.method1956(this.field10152[var48 - -var37], 7), var46, var22)))) * arg2;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIB)I")
    public static final int method4037(int arg0, int arg1, int arg2, byte arg3) {
        field10149++;
        if (arg0 == arg1) {
            return arg0;
        }
        int var4 = 128 - arg2;
        if (arg3 != 81) {
            field10150 = -49;
        }
        int var5 = (arg0 & 0x7F) * var4 + (arg1 & 0x7F) * arg2 >> 7;
        int var6 = (arg0 & 0x380) * var4 + (arg1 & 0x380) * arg2 >> 7;
        int var7 = (arg0 & 0xFC00) * var4 + (arg1 & 0xFC00) * arg2 >> 7;
        return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZI)V")
    public static final void method4038(int arg0, boolean arg1, int arg2) {
        field10156++;
        class755 var3 = class149.method926(Integer.MIN_VALUE, arg1, arg0);
        if (var3 != null) {
            for (int var4 = arg2; var4 < var3.field10531.length; var4++) {
                var3.field10531[var4] = -1;
                var3.field10534[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V")
    public static void method4039(byte arg0) {
        field10147 = null;
        if (arg0 >= -28) {
            method4037(26, 97, -63, (byte) 29);
        }
        field10153 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V")
    public static final void method4040(int arg0, int arg1) {
        field10154++;
        class620 var2 = class529.field7530;
        synchronized (class529.field7530) {
            class529.field7530.method3539((byte) 115, arg1);
            if (arg0 != -23677) {
                field10150 = 37;
            }
        }
        class620 var3 = class132.field1443;
        synchronized (class132.field1443) {
            class132.field1443.method3539((byte) 126, arg1);
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(I)V")
    public class726(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field10152[var3] = this.field10152[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field10152[var5];
            this.field10152[var5] = this.field10152[var5 + 256] = this.field10152[var4];
            this.field10152[var4] = this.field10152[var4 + 256] = var6;
        }
    }
}
