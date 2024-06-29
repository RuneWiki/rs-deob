import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class219 extends class241 {

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
    private int field3381 = 0;

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
    private int field3388 = 0;

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "Z")
    private boolean field3386 = false;

    @OriginalMember(owner = "client!rea", name = "v", descriptor = "I")
    private int field3399 = 0;

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
    private int field3387 = 0;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
    private int field3390 = 0;

    @OriginalMember(owner = "client!rea", name = "B", descriptor = "Lqfa;")
    private class106 field3405;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "Lcw;")
    private class192 field3378;

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!rea", name = "f", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!rea", name = "o", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!rea", name = "p", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!rea", name = "q", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!rea", name = "r", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!rea", name = "s", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!rea", name = "u", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!rea", name = "w", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!rea", name = "x", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!rea", name = "y", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!rea", name = "z", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!rea", name = "A", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!rea", name = "D", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!rea", name = "t", descriptor = "Lcw;")
    private class192 field3397;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IILaa;II)V", line = 4)
    public final void method359(int arg0, int arg1, class511 arg2, int arg3, int arg4) {
        field3401++;
        class444 var6 = (class444) arg2;
        class192 var7 = var6.field6042;
        this.field3378.method1312((byte) -79, false);
        this.field3405.method809((byte) -1);
        this.field3405.method808((byte) 34, this.field3378);
        this.field3405.method795(1, 34023);
        this.field3405.method813((byte) 103, 1);
        this.field3405.method808((byte) 34, var7);
        this.field3405.method802(8448, 11762, 7681);
        this.field3405.method789(34168, 768, 0, (byte) 47);
        this.field3405.method800(1, 28276);
        int var8 = this.field3390 + arg0;
        int var9 = this.field3387 + arg1;
        int var10 = var8 + this.field3378.field2967;
        int var11 = this.field3378.field2960 + var9;
        float var12 = var7.field2959 / (float) var7.field2967;
        float var13 = var7.field2965 / (float) var7.field2960;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field2965 - (float) (var9 - arg4) * var13;
        float var17 = var7.field2965 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3378.field2965);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field3378.field2960 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field3378.field2959, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field3378.field2967 + var8, var9 - -this.field3378.field2960);
        OpenGL.glMultiTexCoord2f(33984, this.field3378.field2959, this.field3378.field2965);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field3378.field2967 + var8, var9);
        OpenGL.glEnd();
        this.field3405.method789(5890, 768, 0, (byte) 47);
        this.field3405.method795(0, 34023);
        this.field3405.method808((byte) 34, null);
        this.field3405.method813((byte) 103, 0);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "([I)V", line = 64)
    public final void method1499(int[] arg0) {
        arg0[2] = this.field3381;
        field3384++;
        arg0[1] = this.field3387;
        arg0[0] = this.field3390;
        arg0[3] = this.field3388;
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(II)V", line = 76)
    private final void method1500(int arg0, int arg1) {
        this.field3405.method813((byte) 103, 1);
        field3393++;
        this.field3405.method808((byte) 34, this.field3378);
        this.field3405.method802(7681, 11762, this.field3405.method784(arg1 ^ 0x55, arg0));
        if (arg1 != -3) {
            return;
        }
        this.field3405.method789(34167, 768, 1, (byte) 47);
        this.field3405.method745(34168, 51, 770, 0);
        this.field3405.method813((byte) 103, 0);
        this.field3405.method808((byte) 34, this.field3397);
        this.field3405.method802(7681, arg1 + 11765, 34479);
        this.field3405.method789(34166, 768, 1, (byte) 47);
        if (this.field3399 == 0) {
            this.field3405.method769(0.0F, 1.0F, 0.5F, false, 0.5F);
        } else if (this.field3399 == 1) {
            this.field3405.method769(0.0F, 0.5F, 1.0F, false, 0.5F);
        } else if (this.field3399 == 2) {
            this.field3405.method769(0.0F, 0.5F, 0.5F, false, 1.0F);
        } else if (this.field3399 == 3) {
            this.field3405.method769(0.0F, 128.5F, 128.5F, false, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 110)
    public final void method1501(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class511 arg7, int arg8, int arg9) {
        field3402++;
        class192 var11 = ((class444) arg7).field6042;
        if (this.field3386) {
            float var12 = (float) this.method1507();
            float var13 = (float) this.method1505();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field3387 * var16;
            float var19 = (float) this.field3387 * var17;
            float var20 = (float) this.field3390 * var14;
            float var21 = (float) this.field3390 * var15;
            float var22 = (float) this.field3381 * -var14;
            float var23 = (float) this.field3381 * -var15;
            float var24 = (float) this.field3388 * -var16;
            arg2 = arg2 + var22 + var18;
            arg4 = arg4 + var20 + var24;
            arg3 = arg3 + var23 + var19;
            arg1 = arg1 + var21 + var19;
            float var25 = (float) this.field3388 * -var17;
            arg0 = arg0 + var20 + var18;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field3378.method1312((byte) -79, (arg6 & 0x1) != 0);
        float var27 = arg5 + arg3 - arg1;
        this.field3405.method809((byte) -1);
        this.field3405.method808((byte) 34, this.field3378);
        this.field3405.method795(1, 34023);
        this.field3405.method813((byte) 103, 1);
        this.field3405.method808((byte) 34, var11);
        this.field3405.method802(8448, 11762, 7681);
        this.field3405.method789(34168, 768, 0, (byte) 47);
        this.field3405.method800(1, 28276);
        float var28 = var11.field2959 / (float) var11.field2967;
        float var29 = var11.field2965 / (float) var11.field2960;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3378.field2965);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field2965 - (((float) (-arg9) + arg1) * var29));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg4) * var28, var11.field2965 - (((float) (-arg9) + arg5) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field3378.field2959, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + var26) * var28, var11.field2965 - (((float) (-arg9) + var27) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field3378.field2959, this.field3378.field2965);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field2965 - ((arg3 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field3405.method789(5890, 768, 0, (byte) 47);
        this.field3405.method795(0, 34023);
        this.field3405.method808((byte) 34, null);
        this.field3405.method813((byte) 103, 0);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIIIIII)V", line = 198)
    public final void method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3378.method1312((byte) -79, (arg7 & 0x1) != 0);
        field3392++;
        this.field3405.method809((byte) -1);
        this.field3405.method800(arg6, 28276);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3386) {
            float var9 = (float) arg2 / (float) this.method1507();
            float var10 = (float) arg3 / (float) this.method1505();
            float var11 = (float) this.field3390 * var9 + (float) arg0;
            float var12 = (float) this.field3387 * var10 + (float) arg1;
            float var13 = (float) this.field3378.field2967 * var9 + var11;
            float var14 = (float) this.field3378.field2960 * var10 + var12;
            if (this.field3397 == null) {
                this.field3405.method808((byte) 34, this.field3378);
                this.field3405.method795(arg4, 34023);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field3378.field2965);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field3378.field2959, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field3378.field2959, this.field3378.field2965);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method1500(arg4, -3);
                this.field3397.method1312((byte) -79, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3378.field2965);
                OpenGL.glTexCoord2f(0.0F, this.field3378.field2965);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field3378.field2959, 0.0F);
                OpenGL.glTexCoord2f(this.field3378.field2959, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field3378.field2959, this.field3378.field2965);
                OpenGL.glTexCoord2f(this.field3378.field2959, this.field3378.field2965);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method1504((byte) 55);
            }
        } else if (this.field3397 == null) {
            this.field3405.method808((byte) 34, this.field3378);
            this.field3405.method795(arg4, 34023);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3378.field2965);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3378.field2959, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3378.field2959, this.field3378.field2965);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1500(arg4, -3);
            this.field3397.method1312((byte) -79, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3378.field2965);
            OpenGL.glTexCoord2f(0.0F, this.field3378.field2965);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3378.field2959, 0.0F);
            OpenGL.glTexCoord2f(this.field3378.field2959, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3378.field2959, this.field3378.field2965);
            OpenGL.glTexCoord2f(this.field3378.field2959, this.field3378.field2965);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1504((byte) 55);
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "()I", line = 305)
    public final int method1502() {
        field3389++;
        return this.field3378.field2960;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIIII)V", line = 317)
    public final void method360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3405.field1518) {
            int[] var7 = this.field3405.method467(arg4, arg5, arg2, arg3);
            if (var7 != null) {
                for (int var8 = 0; var8 < var7.length; var8++) {
                    var7[var8] = class746.method4158(var7[var8], -16777216);
                }
                this.method1509(arg0, arg1, arg2, arg3, var7, 0, arg2);
            }
        } else {
            this.field3378.method2316(arg4, arg2, arg1, arg3, (byte) -55, arg0, arg5);
        }
        field3395++;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(FFFFFFIIII)V", line = 347)
    public final void method1503(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field3386) {
            float var11 = (float) this.method1507();
            float var12 = (float) this.method1505();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field3387 * var15;
            float var18 = (float) this.field3387 * var16;
            float var19 = (float) this.field3390 * var13;
            float var20 = (float) this.field3390 * var14;
            float var21 = (float) this.field3381 * -var13;
            float var22 = (float) this.field3381 * -var14;
            float var23 = (float) this.field3388 * -var15;
            arg4 = arg4 + var19 + var23;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            float var24 = (float) this.field3388 * -var16;
            arg2 = arg2 + var21 + var17;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
        }
        field3385++;
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field3378.method1312((byte) -79, (arg9 & 0x1) != 0);
        this.field3405.method809((byte) -1);
        this.field3405.method808((byte) 34, this.field3378);
        this.field3405.method800(arg8, 28276);
        this.field3405.method795(arg6, 34023);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field3378.field2965);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field3378.field2959, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field3378.field2959, this.field3378.field2965);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lqfa;IIZ)V", line = 724)
    public class219(class106 arg0, int arg1, int arg2, boolean arg3) {
        this.field3405 = arg0;
        this.field3378 = class96.method696((byte) 38, arg0, arg3 ? 6408 : 6407, arg2, arg1);
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lqfa;IIII)V", line = 734)
    public class219(class106 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3405 = arg0;
        this.field3378 = class313.method2002(arg3, arg4, arg0, (byte) 67, arg2, arg1);
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lqfa;II[III)V", line = 744)
    public class219(class106 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3405 = arg0;
        this.field3378 = class93.method689(arg5, false, arg2, 22, arg4, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)V", line = 417)
    private final void method1504(byte arg0) {
        this.field3405.method813((byte) 103, 1);
        if (arg0 != 55) {
            field3383 = -16;
        }
        field3396++;
        this.field3405.method808((byte) 34, null);
        this.field3405.method802(8448, 11762, 8448);
        this.field3405.method789(34168, 768, 1, (byte) 47);
        this.field3405.method745(5890, 70, 770, 0);
        this.field3405.method813((byte) 103, 0);
        this.field3405.method789(34168, 768, 1, (byte) 47);
    }

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "()I", line = 435)
    public final int method1505() {
        field3400++;
        return this.field3387 + this.field3388 + this.field3378.field2960;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(III)V", line = 444)
    public final void method365(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field3404++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field3397 = class313.method2002(this.field3378.field2967, this.field3378.field2960, this.field3405, (byte) 67, arg1, arg0);
        this.field3399 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(IIII)V", line = 468)
    public final void method1506(int arg0, int arg1, int arg2, int arg3) {
        field3403++;
        this.field3390 = arg0;
        this.field3387 = arg1;
        this.field3388 = arg3;
        this.field3381 = arg2;
        this.field3386 = this.field3390 != 0 || this.field3387 != 0 || this.field3381 != 0 || this.field3388 != 0;
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "()I", line = 480)
    public final int method1507() {
        field3398++;
        return this.field3378.field2967 + this.field3390 + this.field3381;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIII)V", line = 488)
    public final void method364(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3380++;
        this.field3378.method1312((byte) -79, false);
        this.field3405.method809((byte) -1);
        this.field3405.method800(arg4, 28276);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field3387 + arg1;
        int var7 = this.field3390 + arg0;
        if (this.field3397 == null) {
            this.field3405.method808((byte) 34, this.field3378);
            this.field3405.method795(arg2, 34023);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3378.field2965);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, var6 + this.field3378.field2960);
            OpenGL.glTexCoord2f(this.field3378.field2959, 0.0F);
            OpenGL.glVertex2i(this.field3378.field2967 + var7, this.field3378.field2960 + var6);
            OpenGL.glTexCoord2f(this.field3378.field2959, this.field3378.field2965);
            OpenGL.glVertex2i(this.field3378.field2967 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method1500(arg2, -3);
        this.field3397.method1312((byte) -79, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3378.field2965);
        OpenGL.glTexCoord2f(0.0F, this.field3378.field2965);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field3378.field2960 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field3378.field2959, 0.0F);
        OpenGL.glTexCoord2f(this.field3378.field2959, 0.0F);
        OpenGL.glVertex2i(this.field3378.field2967 + var7, this.field3378.field2960 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field3378.field2959, this.field3378.field2965);
        OpenGL.glTexCoord2f(this.field3378.field2959, this.field3378.field2965);
        OpenGL.glVertex2i(this.field3378.field2967 + var7, var6);
        OpenGL.glEnd();
        this.method1504((byte) 55);
    }

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "()I", line = 545)
    public final int method1508() {
        field3382++;
        return this.field3378.field2967;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIII[III)V", line = 575)
    private final void method1509(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field3378.method2315(arg6, arg4, arg0, -122, arg3, arg5, arg2, arg1, true);
        field3394++;
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(IIIIIII)V", line = 585)
    public final void method1510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3406++;
        int var8 = arg0 + arg2;
        this.field3378.method1312((byte) -79, false);
        int var9 = arg1 + arg3;
        this.field3405.method809((byte) -1);
        this.field3405.method808((byte) 34, this.field3378);
        this.field3405.method800(arg6, 28276);
        this.field3405.method795(arg4, 34023);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3378.field2966 && !this.field3386) {
            float var10 = (float) arg3 * this.field3378.field2965 / (float) this.field3378.field2960;
            float var11 = (float) arg2 * this.field3378.field2959 / (float) this.field3378.field2967;
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, var10);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, var9);
            OpenGL.glTexCoord2f(var11, 0.0F);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glTexCoord2f(var11, var10);
            OpenGL.glVertex2i(var8, arg1);
            OpenGL.glEnd();
            return;
        }
        OpenGL.glPushMatrix();
        OpenGL.glTranslatef((float) this.field3390, (float) this.field3387, 0.0F);
        int var12 = this.method1507();
        int var13 = this.method1505();
        int var14 = this.field3378.field2960 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = arg0 + this.field3378.field2967;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field3378.field2965);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field3378.field2959, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field3378.field2959, this.field3378.field2965);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field3378.field2959 / (float) this.field3378.field2967;
                OpenGL.glTexCoord2f(0.0F, this.field3378.field2965);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field3378.field2965);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (var15 + this.field3378.field2960 - var9) * this.field3378.field2965 / (float) this.field3378.field2960;
            int var17 = this.field3378.field2967 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field3378.field2965);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field3378.field2959, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field3378.field2959, this.field3378.field2965);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field3378.field2959 / (float) this.field3378.field2967;
                OpenGL.glTexCoord2f(0.0F, this.field3378.field2965);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field3378.field2965);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }
}
