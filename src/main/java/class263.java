import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class263 extends class138 {

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    private int field4379 = 0;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "I")
    private int field4391 = 0;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "I")
    private int field4386 = 0;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "Z")
    private boolean field4383 = false;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "I")
    private int field4395 = 0;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    private int field4384 = 0;

    @OriginalMember(owner = "client!no", name = "F", descriptor = "Lih;")
    private class214 field4402;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "Lgq;")
    private class536 field4387;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "Z")
    public static boolean field4385 = true;

    @OriginalMember(owner = "client!no", name = "A", descriptor = "[I")
    public static int[] field4399 = new int[5];

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!no", name = "y", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!no", name = "z", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!no", name = "B", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!no", name = "D", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!no", name = "G", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!no", name = "H", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "Lgq;")
    private class536 field4380;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lih;IILjava/lang/String;)Lbh;", line = 4)
    public static final class304 method1752(class214 arg0, int arg1, int arg2, String arg3) {
        field4373++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class373.field5742, 0);
        if (arg1 != 19652) {
            field4382 = 118;
        }
        if (class373.field5742[0] == -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class304(arg0, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lia;I)V", line = 32)
    public static final void method1753(class23 arg0, int arg1) {
        field4389++;
        int var2 = -24 % ((53 - arg1) / 50);
        for (int var3 = 0; var3 < class11.field124; var3++) {
            int var4 = arg0.method123(false);
            int var5 = arg0.method132(72);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class275.field4527[var4] != null) {
                class275.field4527[var4].field4983 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "RA", descriptor = "()I", line = 62)
    public final int method200() {
        field4392++;
        return this.field4387.field7877 + this.field4379 + this.field4384;
    }

    @OriginalMember(owner = "client!no", name = "la", descriptor = "(IIIIIII)V", line = 70)
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4378++;
        int var8 = arg0 + arg2;
        this.field4387.method1208(false, -107);
        int var9 = arg1 + arg3;
        this.field4402.method1425((byte) 106);
        this.field4402.method1471(true, this.field4387);
        this.field4402.method1486(arg6, (byte) 114);
        this.field4402.method1410(arg4, 7681);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4387.field7869 && !this.field4383) {
            float var10 = (float) arg3 * this.field4387.field7871 / (float) this.field4387.field7880;
            float var11 = (float) arg2 * this.field4387.field7867 / (float) this.field4387.field7877;
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
        OpenGL.glTranslatef((float) this.field4379, (float) this.field4391, 0.0F);
        int var12 = this.method200();
        int var13 = this.method198();
        int var14 = arg1 + this.field4387.field7880;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = arg0 + this.field4387.field7877;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field4387.field7871);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field4387.field7867, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field4387.field7867, this.field4387.field7871);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field4387.field7867 / (float) this.field4387.field7877;
                OpenGL.glTexCoord2f(0.0F, this.field4387.field7871);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field4387.field7871);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (-var9 - (-var15 - this.field4387.field7880)) * this.field4387.field7871 / (float) this.field4387.field7880;
            int var17 = this.field4387.field7877 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field4387.field7871);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field4387.field7867, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field4387.field7867, this.field4387.field7871);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field4387.field7867 / (float) this.field4387.field7877;
                OpenGL.glTexCoord2f(0.0F, this.field4387.field7871);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field4387.field7871);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!no", name = "W", descriptor = "(IIIII)V", line = 208)
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4387.method1208(false, -105);
        field4398++;
        this.field4402.method1425((byte) 96);
        this.field4402.method1486(arg4, (byte) 116);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field4391 + arg1;
        int var7 = this.field4379 + arg0;
        if (this.field4380 == null) {
            this.field4402.method1471(true, this.field4387);
            this.field4402.method1410(arg2, 7681);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4387.field7871);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field4387.field7880 + var6);
            OpenGL.glTexCoord2f(this.field4387.field7867, 0.0F);
            OpenGL.glVertex2i(this.field4387.field7877 + var7, this.field4387.field7880 + var6);
            OpenGL.glTexCoord2f(this.field4387.field7867, this.field4387.field7871);
            OpenGL.glVertex2i(var7 + this.field4387.field7877, var6);
            OpenGL.glEnd();
            return;
        }
        this.method1755(3, arg2);
        this.field4380.method1208(false, -118);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4387.field7871);
        OpenGL.glTexCoord2f(0.0F, this.field4387.field7871);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field4387.field7880 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field4387.field7867, 0.0F);
        OpenGL.glTexCoord2f(this.field4387.field7867, 0.0F);
        OpenGL.glVertex2i(this.field4387.field7877 + var7, this.field4387.field7880 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field4387.field7867, this.field4387.field7871);
        OpenGL.glTexCoord2f(this.field4387.field7867, this.field4387.field7871);
        OpenGL.glVertex2i(this.field4387.field7877 + var7, var6);
        OpenGL.glEnd();
        this.method1757(117);
    }

    @OriginalMember(owner = "client!no", name = "ha", descriptor = "(IIII)V", line = 260)
    public final void method209(int arg0, int arg1, int arg2, int arg3) {
        this.field4391 = arg1;
        this.field4379 = arg0;
        this.field4386 = arg3;
        this.field4384 = arg2;
        field4396++;
        this.field4383 = this.field4379 != 0 || this.field4391 != 0 || this.field4384 != 0 || this.field4386 != 0;
    }

    @OriginalMember(owner = "client!no", name = "XA", descriptor = "(IIIIII)V", line = 272)
    public final void method626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4404++;
        this.field4387.method1264(arg0, arg5, true, arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!no", name = "H", descriptor = "(FFFFFFIII)V", line = 282)
    public final void method201(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field4383) {
            float var10 = (float) this.method200();
            float var11 = (float) this.method198();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field4391 * var14;
            float var17 = (float) this.field4391 * var15;
            float var18 = (float) this.field4379 * var12;
            float var19 = (float) this.field4379 * var13;
            float var20 = (float) this.field4384 * -var12;
            float var21 = (float) this.field4384 * -var13;
            float var22 = (float) this.field4386 * -var14;
            arg1 = arg1 + var19 + var17;
            float var23 = (float) this.field4386 * -var15;
            arg2 = arg2 + var20 + var16;
            arg0 = arg0 + var18 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        field4401++;
        float var24 = arg2 + arg4 - arg0;
        this.field4387.method1208(true, -118);
        float var25 = arg5 + arg3 - arg1;
        this.field4402.method1425((byte) 123);
        this.field4402.method1471(true, this.field4387);
        this.field4402.method1486(arg8, (byte) 120);
        this.field4402.method1410(arg6, 7681);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field4387.field7871);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field4387.field7867, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field4387.field7867, this.field4387.field7871);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V", line = 356)
    public static void method1754(byte arg0) {
        field4399 = null;
        if (arg0 != 12) {
            field4381 = 104;
        }
    }

    @OriginalMember(owner = "client!no", name = "Q", descriptor = "()I", line = 366)
    public final int method198() {
        field4390++;
        return this.field4387.field7880 + this.field4391 + this.field4386;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IILta;II)V", line = 376)
    public final void method206(int arg0, int arg1, class448 arg2, int arg3, int arg4) {
        field4400++;
        class485 var6 = (class485) arg2;
        class536 var7 = var6.field7119;
        this.field4387.method1208(false, -110);
        this.field4402.method1425((byte) 114);
        this.field4402.method1471(true, this.field4387);
        this.field4402.method1410(1, 7681);
        this.field4402.method1440(1, 0);
        this.field4402.method1471(true, var7);
        this.field4402.method1482(7681, 8960, 8448);
        this.field4402.method1474(0, 34168, -5000, 768);
        this.field4402.method1486(1, (byte) 117);
        int var8 = this.field4391 + arg1;
        int var9 = this.field4379 + arg0;
        int var10 = this.field4387.field7877 + var9;
        int var11 = this.field4387.field7880 + var8;
        float var12 = var7.field7867 / (float) var7.field7877;
        float var13 = var7.field7871 / (float) var7.field7880;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field7871 - (float) (var8 - arg4) * var13;
        float var17 = var7.field7871 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4387.field7871);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field4387.field7880 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field4387.field7867, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field4387.field7877 + var9, var8 - -this.field4387.field7880);
        OpenGL.glMultiTexCoord2f(33984, this.field4387.field7867, this.field4387.field7871);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field4387.field7877 + var9, var8);
        OpenGL.glEnd();
        this.field4402.method1474(0, 5890, -5000, 768);
        this.field4402.method1410(0, 7681);
        this.field4402.method1471(true, null);
        this.field4402.method1440(0, 0);
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lih;IIII)V", line = 767)
    public class263(class214 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4402 = arg0;
        this.field4387 = class485.method2840(arg2, arg4, arg3, arg1, arg0, 28839);
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lih;II[III)V", line = 777)
    public class263(class214 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field4402 = arg0;
        this.field4387 = class407.method2520(arg1, arg0, false, arg3, arg2, false);
    }

    @OriginalMember(owner = "client!no", name = "ZA", descriptor = "()I", line = 439)
    public final int method210() {
        field4394++;
        return this.field4387.field7880;
    }

    @OriginalMember(owner = "client!no", name = "YA", descriptor = "()I", line = 456)
    public final int method204() {
        field4397++;
        return this.field4387.field7877;
    }

    @OriginalMember(owner = "client!no", name = "ya", descriptor = "(IIIIIII)V", line = 477)
    public final void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4387.method1208(true, -119);
        field4403++;
        this.field4402.method1425((byte) 107);
        this.field4402.method1486(arg6, (byte) 123);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4383) {
            float var8 = (float) arg2 / (float) this.method200();
            float var9 = (float) arg3 / (float) this.method198();
            float var10 = (float) this.field4379 * var8 + (float) arg0;
            float var11 = (float) this.field4391 * var9 + (float) arg1;
            float var12 = (float) this.field4387.field7877 * var8 + var10;
            float var13 = (float) this.field4387.field7880 * var9 + var11;
            if (this.field4380 == null) {
                this.field4402.method1471(true, this.field4387);
                this.field4402.method1410(arg4, 7681);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field4387.field7871);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field4387.field7867, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field4387.field7867, this.field4387.field7871);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method1755(3, arg4);
                this.field4380.method1208(true, -116);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4387.field7871);
                OpenGL.glTexCoord2f(0.0F, this.field4387.field7871);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field4387.field7867, 0.0F);
                OpenGL.glTexCoord2f(this.field4387.field7867, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field4387.field7867, this.field4387.field7871);
                OpenGL.glTexCoord2f(this.field4387.field7867, this.field4387.field7871);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method1757(-101);
            }
        } else if (this.field4380 == null) {
            this.field4402.method1471(true, this.field4387);
            this.field4402.method1410(arg4, 7681);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4387.field7871);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field4387.field7867, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glTexCoord2f(this.field4387.field7867, this.field4387.field7871);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1755(3, arg4);
            this.field4380.method1208(true, -125);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4387.field7871);
            OpenGL.glTexCoord2f(0.0F, this.field4387.field7871);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4387.field7867, 0.0F);
            OpenGL.glTexCoord2f(this.field4387.field7867, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4387.field7867, this.field4387.field7871);
            OpenGL.glTexCoord2f(this.field4387.field7867, this.field4387.field7871);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1757(123);
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(II)V", line = 582)
    private final void method1755(int arg0, int arg1) {
        this.field4402.method1440(1, arg0 - 3);
        field4393++;
        this.field4402.method1471(true, this.field4387);
        if (arg0 != 3) {
            return;
        }
        this.field4402.method1482(this.field4402.method1470((byte) -36, arg1), 8960, 7681);
        this.field4402.method1474(1, 34167, arg0 - 5003, 768);
        this.field4402.method1484(34168, 0, 770, 34184);
        this.field4402.method1440(0, 0);
        this.field4402.method1471(true, this.field4380);
        this.field4402.method1482(34479, arg0 ^ 0x2303, 7681);
        this.field4402.method1474(1, 34166, arg0 - 5003, 768);
        if (this.field4395 == 0) {
            this.field4402.method1455(0.5F, arg0 ^ 0xFFFFFF81, 0.0F, 0.5F, 1.0F);
        } else if (this.field4395 == 1) {
            this.field4402.method1455(0.5F, -121, 0.0F, 1.0F, 0.5F);
        } else if (this.field4395 == 2) {
            this.field4402.method1455(1.0F, -119, 0.0F, 0.5F, 0.5F);
        } else if (this.field4395 == 3) {
            this.field4402.method1455(128.5F, -118, 0.0F, 128.5F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(FFFFFFLta;II)V", line = 617)
    public final void method211(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class448 arg6, int arg7, int arg8) {
        field4374++;
        class536 var10 = ((class485) arg6).field7119;
        if (this.field4383) {
            float var11 = (float) this.method200();
            float var12 = (float) this.method198();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field4391 * var15;
            float var18 = (float) this.field4391 * var16;
            float var19 = (float) this.field4379 * var13;
            float var20 = (float) this.field4379 * var14;
            float var21 = (float) this.field4384 * -var13;
            float var22 = (float) this.field4384 * -var14;
            float var23 = (float) this.field4386 * -var15;
            arg0 = arg0 + var19 + var17;
            arg2 = arg2 + var21 + var17;
            arg4 = arg4 + var19 + var23;
            arg3 = arg3 + var22 + var18;
            float var24 = (float) this.field4386 * -var16;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field4387.method1208(true, -105);
        float var26 = arg5 + arg3 - arg1;
        this.field4402.method1425((byte) 75);
        this.field4402.method1471(true, this.field4387);
        this.field4402.method1410(1, 7681);
        this.field4402.method1440(1, 0);
        this.field4402.method1471(true, var10);
        this.field4402.method1482(7681, 8960, 8448);
        this.field4402.method1474(0, 34168, -5000, 768);
        this.field4402.method1486(1, (byte) 123);
        float var27 = var10.field7867 / (float) var10.field7877;
        float var28 = var10.field7871 / (float) var10.field7880;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4387.field7871);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg0) * var27, var10.field7871 - (arg1 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field7871 - ((arg5 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field4387.field7867, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + var25) * var27, var10.field7871 - ((float) (-arg8) + var26) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field4387.field7867, this.field4387.field7871);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field7871 - (arg3 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field4402.method1474(0, 5890, -5000, 768);
        this.field4402.method1410(0, 7681);
        this.field4402.method1471(true, null);
        this.field4402.method1440(0, 0);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILec;I)I", line = 705)
    public static final int method1756(int arg0, class68 arg1, int arg2) {
        field4375++;
        if (!client.method475(arg1).method1991((byte) -120, arg2) && arg1.field1008 == null) {
            return -1;
        } else {
            if (arg0 != 33984) {
                field4385 = true;
            }
            return arg1.field998 == null || arg1.field998.length <= arg2 ? -1 : arg1.field998[arg2];
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 720)
    private final void method1757(int arg0) {
        field4377++;
        int var2 = 122 % ((arg0 - 55) / 59);
        this.field4402.method1440(1, 0);
        this.field4402.method1471(true, null);
        this.field4402.method1482(8448, 8960, 8448);
        this.field4402.method1474(1, 34168, -5000, 768);
        this.field4402.method1484(5890, 0, 770, 34184);
        this.field4402.method1440(0, 0);
        this.field4402.method1474(1, 34168, -5000, 768);
    }

    @OriginalMember(owner = "client!no", name = "oa", descriptor = "(III)V", line = 741)
    public final void method628(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field4388++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field4380 = class485.method2840(arg1, this.field4387.field7880, this.field4387.field7877, arg0, this.field4402, 28839);
        this.field4395 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }
}
