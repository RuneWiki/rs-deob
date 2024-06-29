import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class377 extends class116 {

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "Z")
    private boolean field5528 = false;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
    private int field5540 = 0;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    private int field5526 = 0;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    private int field5536 = 0;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    private int field5535 = 0;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
    private int field5542 = 0;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Los;")
    private class468 field5525;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "Lgg;")
    private class273 field5538;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field5523 = 0;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Lqu;")
    public static class364 field5521 = new class364(59, 7);

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "Lnj;")
    public static class487 field5544;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "Lqp;")
    public static class586 field5547;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "Lvv;")
    public static class640 field5548;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "Lgg;")
    private class273 field5532;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "Lbj;")
    public static class440 field5543;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "[I")
    public static int[] field5549;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method712(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class594 arg6, int arg7, int arg8) {
        field5530++;
        class273 var10 = ((class1) arg6).field2;
        if (this.field5528) {
            float var11 = (float) this.method722();
            float var12 = (float) this.method714();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field5536 * var15;
            float var18 = (float) this.field5536 * var16;
            float var19 = (float) this.field5540 * var13;
            float var20 = (float) this.field5540 * var14;
            float var21 = (float) this.field5535 * -var13;
            float var22 = (float) this.field5535 * -var14;
            float var23 = (float) this.field5542 * -var15;
            arg1 = arg1 + var20 + var18;
            arg3 = arg3 + var22 + var18;
            float var24 = (float) this.field5542 * -var16;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg0 = arg0 + var19 + var17;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field5538.method3174(true, -17759);
        this.field5525.method2814(false);
        this.field5525.method2811(this.field5538, -2);
        this.field5525.method2791(1, (byte) 103);
        this.field5525.method2842(1, (byte) 42);
        this.field5525.method2811(var10, -2);
        this.field5525.method2852(7681, (byte) 21, 8448);
        this.field5525.method2801(false, 34168, 0, 768);
        this.field5525.method2796((byte) -80, 1);
        float var27 = var10.field4042 / (float) var10.field4035;
        float var28 = var10.field4036 / (float) var10.field4043;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5538.field4036);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg0) * var27, var10.field4036 - ((float) (-arg8) + arg1) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field4036 - ((float) (-arg8) + arg5) * var28);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field5538.field4042, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field4036 - ((var26 - (float) arg8) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field5538.field4042, this.field5538.field4036);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field4036 - ((arg3 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field5525.method2801(false, 5890, 0, 768);
        this.field5525.method2791(0, (byte) 115);
        this.field5525.method2811(null, -2);
        this.field5525.method2842(0, (byte) 42);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILua;)V")
    public static final void method2296(int arg0, class548 arg1) {
        if (arg0 != 1810547632) {
            return;
        }
        field5534++;
        if (!class139.field1826) {
            arg1.method2997(1);
            class487.field7385--;
        }
    }

    @OriginalMember(owner = "client!nk", name = "CA", descriptor = "(FFFFFFIII)V")
    public final void method724(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field5539++;
        if (this.field5528) {
            float var10 = (float) this.method722();
            float var11 = (float) this.method714();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field5536 * var14;
            float var17 = (float) this.field5536 * var15;
            float var18 = (float) this.field5540 * var12;
            float var19 = (float) this.field5540 * var13;
            float var20 = (float) this.field5535 * -var12;
            float var21 = (float) this.field5535 * -var13;
            float var22 = (float) this.field5542 * -var14;
            arg1 = arg1 + var19 + var17;
            arg0 = arg0 + var18 + var16;
            arg4 = arg4 + var18 + var22;
            arg3 = arg3 + var21 + var17;
            float var23 = (float) this.field5542 * -var15;
            arg2 = arg2 + var20 + var16;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        this.field5538.method3174(true, -17759);
        float var25 = arg5 + arg3 - arg1;
        this.field5525.method2814(false);
        this.field5525.method2811(this.field5538, -2);
        this.field5525.method2796((byte) -80, arg8);
        this.field5525.method2791(arg6, (byte) 99);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field5538.field4036);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field5538.field4042, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field5538.field4042, this.field5538.field4036);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "()I")
    public final int method718() {
        field5531++;
        return this.field5538.field4035;
    }

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "(IIIIIII)V")
    public final void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5541++;
        int var8 = arg0 + arg2;
        this.field5538.method3174(false, -17759);
        int var9 = arg1 + arg3;
        this.field5525.method2814(false);
        this.field5525.method2811(this.field5538, -2);
        this.field5525.method2796((byte) -80, arg6);
        this.field5525.method2791(arg4, (byte) -70);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5538.field4037 && !this.field5528) {
            float var10 = (float) arg3 * this.field5538.field4036 / (float) this.field5538.field4043;
            float var11 = (float) arg2 * this.field5538.field4042 / (float) this.field5538.field4035;
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
        OpenGL.glTranslatef((float) this.field5540, (float) this.field5536, 0.0F);
        int var12 = this.method722();
        int var13 = this.method714();
        int var14 = this.field5538.field4043 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = arg0 + this.field5538.field4035;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5538.field4036);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field5538.field4042, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field5538.field4042, this.field5538.field4036);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field5538.field4042 / (float) this.field5538.field4035;
                OpenGL.glTexCoord2f(0.0F, this.field5538.field4036);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field5538.field4036);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field5538.field4043 + var15 - var9) * this.field5538.field4036 / (float) this.field5538.field4043;
            int var17 = arg0 + this.field5538.field4035;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5538.field4036);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field5538.field4042, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field5538.field4042, this.field5538.field4036);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field5538.field4042 / (float) this.field5538.field4035;
                OpenGL.glTexCoord2f(0.0F, this.field5538.field4036);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field5538.field4036);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V")
    public static void method2297(boolean arg0) {
        if (!arg0) {
            field5549 = null;
        }
        field5543 = null;
        field5521 = null;
        field5549 = null;
        field5544 = null;
        field5547 = null;
        field5548 = null;
    }

    @OriginalMember(owner = "client!nk", name = "EA", descriptor = "()I")
    public final int method722() {
        field5518++;
        return this.field5538.field4035 + this.field5535 + this.field5540;
    }

    @OriginalMember(owner = "client!nk", name = "BA", descriptor = "(III)V")
    public final void method235(int arg0, int arg1, int arg2) {
        field5545++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field5532 = class166.method1056(arg0, this.field5538.field4043, 43, arg1, this.field5538.field4035, this.field5525);
        this.field5526 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!nk", name = "la", descriptor = "()I")
    public final int method721() {
        field5527++;
        return this.field5538.field4043;
    }

    @OriginalMember(owner = "client!nk", name = "ra", descriptor = "(IIIIIII)V")
    public final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5538.method3174(true, -17759);
        field5519++;
        this.field5525.method2814(false);
        this.field5525.method2796((byte) -80, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5528) {
            float var8 = (float) arg2 / (float) this.method722();
            float var9 = (float) arg3 / (float) this.method714();
            float var10 = (float) this.field5540 * var8 + (float) arg0;
            float var11 = (float) this.field5536 * var9 + (float) arg1;
            float var12 = (float) this.field5538.field4035 * var8 + var10;
            float var13 = (float) this.field5538.field4043 * var9 + var11;
            if (this.field5532 == null) {
                this.field5525.method2811(this.field5538, -2);
                this.field5525.method2791(arg4, (byte) -106);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field5538.field4036);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field5538.field4042, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field5538.field4042, this.field5538.field4036);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method2298(-2076982264, arg4);
                this.field5532.method3174(true, -17759);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5538.field4036);
                OpenGL.glTexCoord2f(0.0F, this.field5538.field4036);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5538.field4042, 0.0F);
                OpenGL.glTexCoord2f(this.field5538.field4042, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5538.field4042, this.field5538.field4036);
                OpenGL.glTexCoord2f(this.field5538.field4042, this.field5538.field4036);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method2299(75);
            }
        } else if (this.field5532 == null) {
            this.field5525.method2811(this.field5538, -2);
            this.field5525.method2791(arg4, (byte) 99);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5538.field4036);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5538.field4042, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5538.field4042, this.field5538.field4036);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2298(-2076982264, arg4);
            this.field5532.method3174(true, -17759);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5538.field4036);
            OpenGL.glTexCoord2f(0.0F, this.field5538.field4036);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5538.field4042, 0.0F);
            OpenGL.glTexCoord2f(this.field5538.field4042, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5538.field4042, this.field5538.field4036);
            OpenGL.glTexCoord2f(this.field5538.field4042, this.field5538.field4036);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2299(86);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V")
    private final void method2298(int arg0, int arg1) {
        this.field5525.method2842(1, (byte) 42);
        field5533++;
        if (arg0 != -2076982264) {
            this.field5542 = -92;
        }
        this.field5525.method2811(this.field5538, arg0 ^ 0x7BCC3BF6);
        this.field5525.method2852(this.field5525.method2782(arg1, -89), (byte) 91, 7681);
        this.field5525.method2801(false, 34167, 1, 768);
        this.field5525.method2772(34168, 770, (byte) -128, 0);
        this.field5525.method2842(0, (byte) 42);
        this.field5525.method2811(this.field5532, arg0 ^ 0x7BCC3BF6);
        this.field5525.method2852(34479, (byte) 116, 7681);
        this.field5525.method2801(false, 34166, 1, 768);
        if (this.field5526 == 0) {
            this.field5525.method2837(1.0F, 0.5F, 0.0F, arg0 + 2076967186, 0.5F);
        } else if (this.field5526 == 1) {
            this.field5525.method2837(0.5F, 1.0F, 0.0F, arg0 + 2076967186, 0.5F);
        } else if (this.field5526 == 2) {
            this.field5525.method2837(0.5F, 0.5F, 0.0F, -15078, 1.0F);
        } else if (this.field5526 == 3) {
            this.field5525.method2837(128.5F, 128.5F, 0.0F, -15078, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILpa;II)V")
    public final void method236(int arg0, int arg1, class594 arg2, int arg3, int arg4) {
        field5546++;
        class1 var6 = (class1) arg2;
        class273 var7 = var6.field2;
        this.field5538.method3174(false, -17759);
        this.field5525.method2814(false);
        this.field5525.method2811(this.field5538, -2);
        this.field5525.method2791(1, (byte) -72);
        this.field5525.method2842(1, (byte) 42);
        this.field5525.method2811(var7, -2);
        this.field5525.method2852(7681, (byte) 118, 8448);
        this.field5525.method2801(false, 34168, 0, 768);
        this.field5525.method2796((byte) -80, 1);
        int var8 = this.field5536 + arg1;
        int var9 = this.field5540 + arg0;
        int var10 = this.field5538.field4035 + var9;
        int var11 = var8 + this.field5538.field4043;
        float var12 = var7.field4042 / (float) var7.field4035;
        float var13 = var7.field4036 / (float) var7.field4043;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field4036 - (float) (var8 - arg4) * var13;
        float var17 = var7.field4036 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5538.field4036);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field5538.field4043 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field5538.field4042, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field5538.field4035 + var9, this.field5538.field4043 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field5538.field4042, this.field5538.field4036);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var9 + this.field5538.field4035, var8);
        OpenGL.glEnd();
        this.field5525.method2801(false, 5890, 0, 768);
        this.field5525.method2791(0, (byte) -105);
        this.field5525.method2811(null, -2);
        this.field5525.method2842(0, (byte) 42);
    }

    @OriginalMember(owner = "client!nk", name = "ma", descriptor = "()I")
    public final int method714() {
        field5522++;
        return this.field5538.field4043 - (-this.field5536 - this.field5542);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    private final void method2299(int arg0) {
        this.field5525.method2842(1, (byte) 42);
        field5537++;
        this.field5525.method2811(null, -2);
        if (arg0 < 54) {
            this.method234(-61, -35, -114, 93, -2, 97, 126);
        }
        this.field5525.method2852(8448, (byte) 47, 8448);
        this.field5525.method2801(false, 34168, 1, 768);
        this.field5525.method2772(5890, 770, (byte) 61, 0);
        this.field5525.method2842(0, (byte) 42);
        this.field5525.method2801(false, 34168, 1, 768);
    }

    @OriginalMember(owner = "client!nk", name = "KA", descriptor = "(IIII)V")
    public final void method720(int arg0, int arg1, int arg2, int arg3) {
        this.field5542 = arg3;
        this.field5540 = arg0;
        this.field5535 = arg2;
        field5524++;
        this.field5536 = arg1;
        this.field5528 = this.field5540 != 0 || this.field5536 != 0 || this.field5535 != 0 || this.field5542 != 0;
    }

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "(IIIIII)V")
    public final void method231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5538.method1360(arg1, 0, arg3, arg2, arg0, arg5, arg4);
        field5517++;
    }

    @OriginalMember(owner = "client!nk", name = "DA", descriptor = "(IIIII)V")
    public final void method237(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5538.method3174(false, -17759);
        field5520++;
        this.field5525.method2814(false);
        this.field5525.method2796((byte) -80, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field5540 + arg0;
        int var7 = this.field5536 + arg1;
        if (this.field5532 == null) {
            this.field5525.method2811(this.field5538, -2);
            this.field5525.method2791(arg2, (byte) -114);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5538.field4036);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field5538.field4043 + var7);
            OpenGL.glTexCoord2f(this.field5538.field4042, 0.0F);
            OpenGL.glVertex2i(this.field5538.field4035 + var6, this.field5538.field4043 + var7);
            OpenGL.glTexCoord2f(this.field5538.field4042, this.field5538.field4036);
            OpenGL.glVertex2i(this.field5538.field4035 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method2298(-2076982264, arg2);
        this.field5532.method3174(false, -17759);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5538.field4036);
        OpenGL.glTexCoord2f(0.0F, this.field5538.field4036);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, var7 + this.field5538.field4043);
        OpenGL.glMultiTexCoord2f(33985, this.field5538.field4042, 0.0F);
        OpenGL.glTexCoord2f(this.field5538.field4042, 0.0F);
        OpenGL.glVertex2i(this.field5538.field4035 + var6, var7 - -this.field5538.field4043);
        OpenGL.glMultiTexCoord2f(33985, this.field5538.field4042, this.field5538.field4036);
        OpenGL.glTexCoord2f(this.field5538.field4042, this.field5538.field4036);
        OpenGL.glVertex2i(this.field5538.field4035 + var6, var7);
        OpenGL.glEnd();
        this.method2299(93);
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Los;IIII)V")
    public class377(class468 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5525 = arg0;
        this.field5538 = class166.method1056(arg1, arg4, -119, arg2, arg3, arg0);
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Los;II[III)V")
    public class377(class468 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field5525 = arg0;
        this.field5538 = class32.method151(arg1, arg2, arg3, arg0, (byte) 55, false);
    }

    static {
        new class487("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field5544 = new class487("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");
        field5547 = new class586(67, 12);
        field5548 = new class640("WIP", 2);
    }
}
