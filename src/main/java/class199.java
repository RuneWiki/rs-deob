import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class199 extends class434 {

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "[I")
    private int[] field3054 = new int[512];

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "[[B")
    public static byte[][] field3055 = new byte[250][];

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "Lgg;")
    public static class119 field3053;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IFIIIIF[FFIF)V", line = 5)
    public final void method1353(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float[] arg7, float arg8, int arg9, float arg10) {
        field3058++;
        int var12 = (int) ((float) arg9 * arg10 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg3 * arg6 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg4 * arg8 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg2 * arg8;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        if (arg5 != -15709) {
            method1356(null, -85, -15, -13, 121, -7, -90, 126);
        }
        int var24 = var19 & var17;
        float var25 = class31.method174(-127, var21);
        int var26 = this.field3054[var24];
        int var27 = this.field3054[var23];
        for (int var28 = 0; var28 < arg3; var28++) {
            float var29 = (float) var28 * arg6;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            float var35 = class31.method174(-122, var32);
            int var36 = var30 & var15;
            int var37 = this.field3054[var26 + var36];
            int var38 = this.field3054[var26 + var34];
            int var39 = this.field3054[var27 + var36];
            int var40 = this.field3054[var27 + var34];
            for (int var41 = 0; var41 < arg9; var41++) {
                float var42 = (float) var41 * arg10;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                int var47 = var44 & var13;
                float var48 = class31.method174(-128, var45);
                int var49 = var43 & var13;
                arg7[arg0++] = class259.method1665(var25, -9480, class259.method1665(var35, -9480, class259.method1665(var48, class288.method1845(arg5, 6235), class344.method2176(true, class168.method1203(this.field3054[var49 + var37], 7), var22, var46, var33), class344.method2176(true, class168.method1203(7, this.field3054[var37 + var47]), var22, var45, var33)), class259.method1665(var48, -9480, class344.method2176(true, class168.method1203(this.field3054[var38 + var49], 7), var22, var46, var32), class344.method2176(true, class168.method1203(this.field3054[var38 + var47], 7), var22, var45, var32))), class259.method1665(var35, -9480, class259.method1665(var48, -9480, class344.method2176(true, class168.method1203(this.field3054[var49 + var39], 7), var21, var46, var33), class344.method2176(true, class168.method1203(7, this.field3054[var47 + var39]), var21, var45, var33)), class259.method1665(var48, -9480, class344.method2176(true, class168.method1203(this.field3054[var49 + var40], 7), var21, var46, var32), class344.method2176(true, class168.method1203(7, this.field3054[var47 + var40]), var21, var45, var32)))) * arg1;
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V", line = 95)
    public static void method1354(byte arg0) {
        field3055 = null;
        field3053 = null;
        if (arg0 <= 119) {
            field3053 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V", line = 107)
    public static final void method1355(boolean arg0) {
        if (!arg0) {
            class405.field5762 = true;
            field3057++;
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(I)V", line = 234)
    public class199(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field3054[var3] = this.field3054[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field3054[var5];
            this.field3054[var5] = this.field3054[var5 + 256] = this.field3054[var4];
            this.field3054[var4] = this.field3054[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "([IIIIIIII)V", line = 128)
    public static final void method1356(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3056++;
        if (arg5 > 0 && !class494.method2900((byte) -124, arg5)) {
            throw new IllegalArgumentException("");
        } else if (arg6 > 0 && !class494.method2900((byte) 103, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg3 == 32993) {
            int var8 = 0;
            int var9 = arg5 >= arg6 ? arg6 : arg5;
            int var10 = arg5 >> 1;
            if (arg2 > 22) {
                int var11 = arg6 >> 1;
                int[] var12 = arg0;
                int[] var13 = new int[var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Di(arg1, var8, arg7, arg5, arg6, 0, arg3, arg4, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = arg5 + var15;
                    int[] var17 = var13;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var10; var19++) {
                            int var20 = var12[var15++];
                            int var21 = var12[var15++];
                            int var22 = var12[var16++];
                            int var23 = var12[var16++];
                            int var24 = (var20 & 0xFF0892) >> 16;
                            int var25 = var20 >> 8 & 0xFF;
                            int var26 = var20 & 0xFF;
                            int var27 = var20 >> 24 & 0xFF;
                            int var28 = (var21 & 0xFF) + var26;
                            int var29 = (var21 >> 8 & 0xFF) + var25;
                            int var30 = (var21 >> 16 & 0xFF) + var24;
                            int var31 = (var21 >> 24 & 0xFF) + var27;
                            int var32 = (var22 >> 16 & 0xFF) + var30;
                            int var33 = (var22 >> 8 & 0xFF) + var29;
                            int var34 = (var22 & 0xFF) + var28;
                            int var35 = (var22 >> 24 & 0xFF) + var31;
                            int var36 = ((var23 & 0xFF66) >> 8) + var33;
                            int var37 = (var23 >> 24 & 0xFF) + var35;
                            int var38 = (var23 & 0xFF) + var34;
                            int var39 = (var23 >> 16 & 0xFF) + var32;
                            var13[var14++] = class442.method2600(class168.method1203(var38, 1020) >> 2, class442.method2600(class442.method2600(class168.method1203(var39 << 14, 16711680), class168.method1203(-16777216, var37 << 22)), class168.method1203(var36 << 6, 65280)));
                        }
                        var15 += arg5;
                        var16 += arg5;
                    }
                    var13 = var12;
                    arg5 = var10;
                    arg6 = var11;
                    var12 = var17;
                    var8++;
                    var10 >>= 0x1;
                    var11 >>= 0x1;
                    var9 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
