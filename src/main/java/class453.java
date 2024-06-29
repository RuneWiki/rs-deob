import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class453 extends class463 {

    @OriginalMember(owner = "client!la", name = "i", descriptor = "[I")
    private int[] field6384 = new int[512];

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field6387 = 0;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Lec;")
    public static class236 field6388 = new class236();

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field6392 = 100;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "Lmt;")
    public static class398 field6393;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIFFIFIFII[F)V", line = 3)
    public final void method2694(int arg0, int arg1, float arg2, float arg3, int arg4, float arg5, int arg6, float arg7, int arg8, int arg9, float[] arg10) {
        field6390++;
        int var12 = (int) ((float) arg8 * arg2 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg1 * arg7 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg0 * arg3 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg9 * arg3;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = (float) arg6 - var21;
        float var23 = class755.method4214(6, var21);
        int var24 = var20 & var17;
        int var25 = var19 & var17;
        int var26 = this.field6384[var25];
        int var27 = this.field6384[var24];
        for (int var28 = 0; var28 < arg1; var28++) {
            float var29 = (float) var28 * arg7;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            float var34 = class755.method4214(arg6 ^ 0x7, var32);
            int var35 = var30 & var15;
            int var36 = var31 & var15;
            int var37 = this.field6384[var26 + var35];
            int var38 = this.field6384[var26 + var36];
            int var39 = this.field6384[var27 + var35];
            int var40 = this.field6384[var36 + var27];
            for (int var41 = 0; var41 < arg8; var41++) {
                float var42 = (float) var41 * arg2;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                int var48 = var44 & var13;
                float var49 = class755.method4214(arg6 ^ 0x7, var45);
                arg10[arg4++] = arg5 * class451.method2688(class451.method2688(class451.method2688(class539.method3102(var33, class263.method1762(this.field6384[var37 + var47], 7), var22, -70, var46), true, class539.method3102(var33, class263.method1762(7, this.field6384[var48 + var37]), var22, -73, var45), var49), true, class451.method2688(class539.method3102(var32, class263.method1762(7, this.field6384[var38 + var47]), var22, -75, var46), true, class539.method3102(var32, class263.method1762(this.field6384[var38 + var48], 7), var22, -91, var45), var49), var34), true, class451.method2688(class451.method2688(class539.method3102(var33, class263.method1762(this.field6384[var39 + var47], 7), var21, -72, var46), true, class539.method3102(var33, class263.method1762(this.field6384[var39 + var48], 7), var21, -75, var45), var49), true, class451.method2688(class539.method3102(var32, class263.method1762(this.field6384[var40 + var47], 7), var21, -100, var46), true, class539.method3102(var32, class263.method1762(this.field6384[var40 + var48], 7), var21, -72, var45), var49), var34), var23);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IC)I", line = 90)
    public static final int method2695(int arg0, char arg1) {
        field6385++;
        if (arg0 != 7) {
            method2696(-22);
        }
        return arg1 >= '\u0000' && arg1 < class621.field8457.length ? class621.field8457[arg1] : -1;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I)V", line = 143)
    public class453(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field6384[var3] = this.field6384[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field6384[var5];
            this.field6384[var5] = this.field6384[var5 + 256] = this.field6384[var4];
            this.field6384[var4] = this.field6384[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V", line = 112)
    public static void method2696(int arg0) {
        if (arg0 != 1) {
            method2697(null, 48, -14, -102, 78, 29);
        }
        field6388 = null;
        field6393 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lqo;IIIII)Leba;", line = 125)
    public static final class588 method2697(class22 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6389++;
        if (arg2 != 34037) {
            field6388 = null;
        }
        if (!arg0.field615 && (!class476.method2796(-20, arg3) || !class476.method2796(-119, arg5))) {
            return arg0.field659 ? new class588(arg0, 34037, arg1, arg4, arg3, arg5, true) : new class588(arg0, arg1, arg4, arg3, arg5, class529.method3059(arg3, (byte) 108), class529.method3059(arg5, (byte) 108), true);
        } else {
            return new class588(arg0, 3553, arg1, arg4, arg3, arg5, true);
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V", line = 186)
    public static final void method2698(int arg0) {
        if (arg0 == 1) {
            class380.field5523.method999(0);
            field6391++;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[BZIII)V", line = 202)
    public static final void method2699(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field6386++;
        if (arg1 > 0 && !class476.method2796(69, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class476.method2796(100, arg0)) {
            int var7 = class468.method2755(arg4, -6409);
            int var8 = 0;
            int var9 = arg1 < arg0 ? arg1 : arg0;
            if (arg3) {
                field6387 = -127;
            }
            int var10 = arg1 >> 1;
            int var11 = arg0 >> 1;
            byte[] var12 = arg2;
            byte[] var13 = new byte[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg5, var8, arg6, arg1, arg0, 0, arg4, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg1 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg0 = var11;
                arg1 = var10;
                var11 >>= 0x1;
                var8++;
                var9 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
