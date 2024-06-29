import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class78 extends class425 {

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "[I")
    private int[] field1137 = new int[512];

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1131 = null;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "F")
    public static float field1128 = 0.0F;

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
    public static int field1138 = 0;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "[I")
    public static int[] field1129 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "F")
    public static float field1132;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "Ll;")
    public static class16 field1140;

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "Lmq;")
    public static class351 field1141;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIF[FFIIFF)V")
    public final void method628(int arg0, int arg1, int arg2, int arg3, float arg4, float[] arg5, float arg6, int arg7, int arg8, float arg9, float arg10) {
        field1134++;
        int var12 = (int) ((float) arg7 * arg4 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg3 * arg9 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg8 * arg6 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg1 * arg6;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        if (arg0 > -50) {
            field1138 = 116;
        }
        float var23 = class218.method1356(var21, -128);
        int var24 = var19 & var17;
        int var25 = var20 & var17;
        int var26 = this.field1137[var24];
        int var27 = this.field1137[var25];
        for (int var28 = 0; var28 < arg3; var28++) {
            float var29 = (float) var28 * arg9;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            float var34 = class218.method1356(var32, -128);
            int var35 = var30 & var15;
            int var36 = var31 & var15;
            int var37 = this.field1137[var26 + var35];
            int var38 = this.field1137[var36 + var26];
            int var39 = this.field1137[var27 + var35];
            int var40 = this.field1137[var27 + var36];
            for (int var41 = 0; var41 < arg7; var41++) {
                float var42 = (float) var41 * arg4;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var44 & var13;
                int var48 = var43 & var13;
                float var49 = class218.method1356(var45, 114);
                arg5[arg2++] = arg10 * class142.method961(class142.method961(class142.method961(class40.method339(true, class251.method1501(7, this.field1137[var40 + var47]), var32, var21, var45), 1, class40.method339(true, class251.method1501(this.field1137[var40 + var48], 7), var32, var21, var46), var49), 1, class142.method961(class40.method339(true, class251.method1501(7, this.field1137[var39 + var47]), var33, var21, var45), 1, class40.method339(true, class251.method1501(this.field1137[var48 + var39], 7), var33, var21, var46), var49), var34), 1, class142.method961(class142.method961(class40.method339(true, class251.method1501(this.field1137[var38 + var47], 7), var32, var22, var45), 1, class40.method339(true, class251.method1501(this.field1137[var48 + var38], 7), var32, var22, var46), var49), 1, class142.method961(class40.method339(true, class251.method1501(7, this.field1137[var37 + var47]), var33, var22, var45), 1, class40.method339(true, class251.method1501(7, this.field1137[var37 + var48]), var33, var22, var46), var49), var34), var23);
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(B)V")
    public static void method629(byte arg0) {
        field1129 = null;
        if (arg0 < 12) {
            method632(-7, -55, 50);
        }
        field1131 = null;
        field1141 = null;
        field1140 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BIIIIIIIII)V")
    public static final void method630(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 == arg7 && arg1 == arg4 && arg3 == arg6 && arg2 == arg8) {
            class298.method1747(arg7, arg2, arg9, true, arg3, arg1);
        } else {
            int var10 = arg7;
            int var11 = arg1;
            int var12 = arg7 * 3;
            int var13 = arg1 * 3;
            int var14 = arg5 * 3;
            int var15 = arg4 * 3;
            int var16 = arg6 * 3;
            int var17 = arg8 * 3;
            int var18 = arg3 + var14 - arg7 - var16;
            int var19 = arg2 + var15 - var17 - arg1;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg7;
                int var34 = arg1 + (var28 + var30 + var32 >> 12);
                class298.method1747(var10, var34, arg9, true, var33, var11);
                var11 = var34;
                var10 = var33;
            }
        }
        field1135++;
        if (arg0 > -21) {
            field1138 = 24;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
    public static final void method631(int arg0) {
        class451.field6652 = new class36(8);
        field1136++;
        class2.field6 = 0;
        for (class190 var1 = (class190) class458.field6717.method2461(-101); var1 != null; var1 = (class190) class458.field6717.method2458(127)) {
            var1.method1196();
        }
        if (arg0 != -1) {
            field1128 = 1.5222703F;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)V")
    public static final void method632(int arg0, int arg1, int arg2) {
        class495.field7230 = arg1 - class350.field5133;
        class295.field4056 = arg0 - class350.field5124;
        if (arg2 > -106) {
            method629((byte) 49);
        }
        field1130++;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lya;I)V")
    public static final void method633(class38 arg0, int arg1) {
        if (arg1 == -789762964) {
            field1133++;
            if (class242.field3385 != class316.field4324.field1738 && class89.field1305 != null && class467.method2738(arg0, false, class316.field4324.field1738)) {
                class242.field3385 = class316.field4324.field1738;
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(I)V")
    public class78(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field1137[var3] = this.field1137[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field1137[var5];
            this.field1137[var5] = this.field1137[var5 + 256] = this.field1137[var4];
            this.field1137[var4] = this.field1137[var4 + 256] = var6;
        }
    }
}
