import jaggl.OpenGL;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class324 extends class529 {

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    private int field4265 = 0;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "Z")
    private boolean field4274 = false;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    private int field4268 = 0;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    private int field4277 = 0;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    private int field4278 = 0;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    private int field4286 = 0;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lbo;")
    private class511 field4259;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "Lgk;")
    private class330 field4271;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "Z")
    public static boolean field4279 = false;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "[I")
    public static int[] field4276 = new int[32];

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Lvj;")
    public static class304 field4266 = new class304(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "Lgk;")
    private class330 field4280;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "Ljava/awt/Image;")
    public static Image field4285;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILea;II)V", line = 6)
    public final void method157(int arg0, int arg1, class381 arg2, int arg3, int arg4) {
        field4283++;
        class160 var6 = (class160) arg2;
        class330 var7 = var6.field2361;
        this.field4271.method2866(10241, false);
        this.field4259.method2937(true);
        this.field4259.method2980(this.field4271, 112);
        this.field4259.method2976((byte) 42, 1);
        this.field4259.method3003(1, 118);
        this.field4259.method2980(var7, 121);
        this.field4259.method3002((byte) -104, 7681, 8448);
        this.field4259.method2953(0, (byte) 112, 768, 34168);
        this.field4259.method2978(1, (byte) -60);
        int var8 = this.field4286 + arg1;
        int var9 = this.field4268 + arg0;
        int var10 = var9 + this.field4271.field4345;
        int var11 = var8 + this.field4271.field4346;
        float var12 = var7.field4349 / (float) var7.field4345;
        float var13 = var7.field4352 / (float) var7.field4346;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field4352 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field4352 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4271.field4352);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field4271.field4346);
        OpenGL.glMultiTexCoord2f(33984, this.field4271.field4349, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field4271.field4345 + var9, this.field4271.field4346 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field4271.field4349, this.field4271.field4352);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field4271.field4345 + var9, var8);
        OpenGL.glEnd();
        this.field4259.method2953(0, (byte) 88, 768, 5890);
        this.field4259.method2976((byte) 125, 0);
        this.field4259.method2980(null, 115);
        this.field4259.method3003(0, 126);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 66)
    private final void method1869(boolean arg0) {
        this.field4259.method3003(1, 86);
        field4270++;
        this.field4259.method2980(null, 124);
        this.field4259.method3002((byte) -128, 8448, 8448);
        this.field4259.method2953(1, (byte) 68, 768, 34168);
        this.field4259.method2950((byte) -34, 770, 0, 5890);
        if (!arg0) {
            this.field4259.method3003(0, 105);
            this.field4259.method2953(1, (byte) 114, 768, 34168);
        }
    }

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "(IIIIII)V", line = 83)
    public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4271.method1828(arg0, -125, arg3, arg1, arg2, arg5, arg4);
        field4267++;
    }

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "(IIIIIII)V", line = 93)
    public final void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4261++;
        this.field4271.method2866(10241, true);
        this.field4259.method2937(true);
        this.field4259.method2978(arg6, (byte) -113);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4274) {
            float var8 = (float) arg2 / (float) this.method151();
            float var9 = (float) arg3 / (float) this.method149();
            float var10 = (float) this.field4268 * var8 + (float) arg0;
            float var11 = (float) this.field4286 * var9 + (float) arg1;
            float var12 = (float) this.field4271.field4345 * var8 + var10;
            float var13 = (float) this.field4271.field4346 * var9 + var11;
            if (this.field4280 == null) {
                this.field4259.method2980(this.field4271, 126);
                this.field4259.method2976((byte) 45, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field4271.field4352);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field4271.field4349, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field4271.field4349, this.field4271.field4352);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method1872(0, arg4);
                this.field4280.method2866(10241, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4271.field4352);
                OpenGL.glTexCoord2f(0.0F, this.field4271.field4352);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field4271.field4349, 0.0F);
                OpenGL.glTexCoord2f(this.field4271.field4349, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field4271.field4349, this.field4271.field4352);
                OpenGL.glTexCoord2f(this.field4271.field4349, this.field4271.field4352);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method1869(false);
            }
        } else if (this.field4280 == null) {
            this.field4259.method2980(this.field4271, 115);
            this.field4259.method2976((byte) 41, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4271.field4352);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field4271.field4349, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field4271.field4349, this.field4271.field4352);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1872(0, arg4);
            this.field4280.method2866(10241, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4271.field4352);
            OpenGL.glTexCoord2f(0.0F, this.field4271.field4352);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4271.field4349, 0.0F);
            OpenGL.glTexCoord2f(this.field4271.field4349, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4271.field4349, this.field4271.field4352);
            OpenGL.glTexCoord2f(this.field4271.field4349, this.field4271.field4352);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1869(false);
        }
    }

    @OriginalMember(owner = "client!wi", name = "YA", descriptor = "(IIIII)V", line = 197)
    public final void method158(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4271.method2866(10241, false);
        field4263++;
        this.field4259.method2937(true);
        this.field4259.method2978(arg4, (byte) -123);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field4268 + arg0;
        int var7 = this.field4286 + arg1;
        if (this.field4280 == null) {
            this.field4259.method2980(this.field4271, 109);
            this.field4259.method2976((byte) 70, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4271.field4352);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field4271.field4346 + var7);
            OpenGL.glTexCoord2f(this.field4271.field4349, 0.0F);
            OpenGL.glVertex2i(var6 + this.field4271.field4345, this.field4271.field4346 + var7);
            OpenGL.glTexCoord2f(this.field4271.field4349, this.field4271.field4352);
            OpenGL.glVertex2i(this.field4271.field4345 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method1872(0, arg2);
        this.field4280.method2866(10241, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4271.field4352);
        OpenGL.glTexCoord2f(0.0F, this.field4271.field4352);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field4271.field4346 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field4271.field4349, 0.0F);
        OpenGL.glTexCoord2f(this.field4271.field4349, 0.0F);
        OpenGL.glVertex2i(this.field4271.field4345 + var6, var7 - -this.field4271.field4346);
        OpenGL.glMultiTexCoord2f(33985, this.field4271.field4349, this.field4271.field4352);
        OpenGL.glTexCoord2f(this.field4271.field4349, this.field4271.field4352);
        OpenGL.glVertex2i(this.field4271.field4345 + var6, var7);
        OpenGL.glEnd();
        this.method1869(false);
    }

    @OriginalMember(owner = "client!wi", name = "UA", descriptor = "()I", line = 252)
    public final int method154() {
        field4275++;
        return this.field4271.field4345;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lbo;IIII)V", line = 717)
    public class324(class511 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4259 = arg0;
        this.field4271 = class153.method1056((byte) 91, arg0, arg1, arg2, arg4, arg3);
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lbo;II[III)V", line = 727)
    public class324(class511 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field4259 = arg0;
        this.field4271 = class214.method1346(arg0, arg2, arg1, 3553, arg3, false);
    }

    @OriginalMember(owner = "client!wi", name = "aa", descriptor = "(FFFFFFIII)V", line = 270)
    public final void method160(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field4258++;
        if (this.field4274) {
            float var10 = (float) this.method151();
            float var11 = (float) this.method149();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field4286 * var14;
            float var17 = (float) this.field4286 * var15;
            float var18 = (float) this.field4268 * var12;
            float var19 = (float) this.field4268 * var13;
            float var20 = (float) this.field4278 * -var12;
            float var21 = (float) this.field4278 * -var13;
            float var22 = (float) this.field4265 * -var14;
            float var23 = (float) this.field4265 * -var15;
            arg4 = arg4 + var18 + var22;
            arg2 = arg2 + var20 + var16;
            arg0 = arg0 + var18 + var16;
            arg3 = arg3 + var21 + var17;
            arg1 = arg1 + var19 + var17;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        this.field4271.method2866(10241, true);
        float var25 = arg5 + arg3 - arg1;
        this.field4259.method2937(true);
        this.field4259.method2980(this.field4271, 119);
        this.field4259.method2978(arg8, (byte) -66);
        this.field4259.method2976((byte) 96, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field4271.field4352);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field4271.field4349, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field4271.field4349, this.field4271.field4352);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(FFFFFFLea;II)V", line = 337)
    public final void method162(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8) {
        field4264++;
        class330 var10 = ((class160) arg6).field2361;
        if (this.field4274) {
            float var11 = (float) this.method151();
            float var12 = (float) this.method149();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field4286 * var15;
            float var18 = (float) this.field4286 * var16;
            float var19 = (float) this.field4268 * var13;
            float var20 = (float) this.field4268 * var14;
            float var21 = (float) this.field4278 * -var13;
            float var22 = (float) this.field4278 * -var14;
            float var23 = (float) this.field4265 * -var15;
            float var24 = (float) this.field4265 * -var16;
            arg0 = arg0 + var19 + var17;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg1 = arg1 + var20 + var18;
            arg3 = arg3 + var22 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field4271.method2866(10241, true);
        float var26 = arg5 + arg3 - arg1;
        this.field4259.method2937(true);
        this.field4259.method2980(this.field4271, 110);
        this.field4259.method2976((byte) 52, 1);
        this.field4259.method3003(1, 48);
        this.field4259.method2980(var10, 109);
        this.field4259.method3002((byte) -78, 7681, 8448);
        this.field4259.method2953(0, (byte) 113, 768, 34168);
        this.field4259.method2978(1, (byte) -77);
        float var27 = var10.field4349 / (float) var10.field4345;
        float var28 = var10.field4352 / (float) var10.field4346;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4271.field4352);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field4352 - ((arg1 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field4352 - (arg5 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field4271.field4349, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field4352 - (var26 - (float) arg8) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field4271.field4349, this.field4271.field4352);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field4352 - (arg3 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field4259.method2953(0, (byte) 121, 768, 5890);
        this.field4259.method2976((byte) 86, 0);
        this.field4259.method2980(null, 126);
        this.field4259.method3003(0, 9);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 423)
    public static void method1870(int arg0) {
        field4276 = null;
        field4266 = null;
        if (arg0 == 0) {
            field4285 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "JA", descriptor = "()I", line = 435)
    public final int method149() {
        field4260++;
        return this.field4271.field4346 - (-this.field4286 - this.field4265);
    }

    @OriginalMember(owner = "client!wi", name = "ka", descriptor = "(IIII)V", line = 451)
    public final void method152(int arg0, int arg1, int arg2, int arg3) {
        this.field4278 = arg2;
        this.field4268 = arg0;
        this.field4265 = arg3;
        field4262++;
        this.field4286 = arg1;
        this.field4274 = this.field4268 != 0 || this.field4286 != 0 || this.field4278 != 0 || this.field4265 != 0;
    }

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "(III)V", line = 463)
    public final void method164(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field4272++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field4280 = class153.method1056((byte) 101, this.field4259, arg0, arg1, this.field4271.field4346, this.field4271.field4345);
        this.field4277 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "(IIIIIII)V", line = 487)
    public final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4284++;
        int var8 = arg0 + arg2;
        this.field4271.method2866(10241, false);
        int var9 = arg1 + arg3;
        this.field4259.method2937(true);
        this.field4259.method2980(this.field4271, 110);
        this.field4259.method2978(arg6, (byte) -42);
        this.field4259.method2976((byte) 99, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4271.field4350 && !this.field4274) {
            float var10 = (float) arg3 * this.field4271.field4352 / (float) this.field4271.field4346;
            float var11 = (float) arg2 * this.field4271.field4349 / (float) this.field4271.field4345;
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
        OpenGL.glTranslatef((float) this.field4268, (float) this.field4286, 0.0F);
        int var12 = this.method151();
        int var13 = this.method149();
        int var14 = arg1 + this.field4271.field4346;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field4271.field4345 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field4271.field4352);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field4271.field4349, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field4271.field4349, this.field4271.field4352);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field4271.field4349 / (float) this.field4271.field4345;
                OpenGL.glTexCoord2f(0.0F, this.field4271.field4352);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field4271.field4352);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (this.field4271.field4346 - (var9 - var15)) * this.field4271.field4352 / (float) this.field4271.field4346;
            int var17 = arg0 + this.field4271.field4345;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field4271.field4352);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field4271.field4349, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field4271.field4349, this.field4271.field4352);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field4271.field4349 / (float) this.field4271.field4345;
                OpenGL.glTexCoord2f(0.0F, this.field4271.field4352);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field4271.field4352);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)Z", line = 624)
    public static final boolean method1871(boolean arg0, int arg1) {
        field4282++;
        if (arg0) {
            return false;
        } else {
            return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V", line = 639)
    private final void method1872(int arg0, int arg1) {
        this.field4259.method3003(1, arg0 ^ 0x19);
        field4269++;
        this.field4259.method2980(this.field4271, 113);
        this.field4259.method3002((byte) -112, this.field4259.method2932(arg1, arg0 + 8448), 7681);
        this.field4259.method2953(1, (byte) 87, 768, 34167);
        this.field4259.method2950((byte) -34, 770, 0, 34168);
        this.field4259.method3003(0, arg0 + 110);
        this.field4259.method2980(this.field4280, arg0 + 124);
        this.field4259.method3002((byte) -56, 34479, 7681);
        this.field4259.method2953(1, (byte) 102, 768, 34166);
        if (this.field4277 == arg0) {
            this.field4259.method2966(0.5F, 0.0F, 0.5F, 1.0F, 102);
        } else if (this.field4277 == 1) {
            this.field4259.method2966(0.5F, 0.0F, 1.0F, 0.5F, 125);
        } else if (this.field4277 == 2) {
            this.field4259.method2966(1.0F, 0.0F, 0.5F, 0.5F, 81);
        } else if (this.field4277 == 3) {
            this.field4259.method2966(128.5F, 0.0F, 128.5F, 128.5F, 111);
            return;
        }
    }

    @OriginalMember(owner = "client!wi", name = "qa", descriptor = "()I", line = 673)
    public final int method161() {
        field4273++;
        return this.field4271.field4346;
    }

    @OriginalMember(owner = "client!wi", name = "ja", descriptor = "()I", line = 681)
    public final int method151() {
        field4281++;
        return this.field4271.field4345 + this.field4268 + this.field4278;
    }
}
