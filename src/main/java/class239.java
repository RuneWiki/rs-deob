import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class239 extends class701 {

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Z")
    private boolean field3298 = false;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    private int field3297 = 0;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    private int field3296 = 0;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    private int field3295 = 0;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    private int field3312 = 0;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    private int field3305 = 0;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Lkga;")
    private class506 field3304;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Leb;")
    public class577 field3306;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "Ljk;")
    public static class585 field3314 = new class585(30, 3);

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "Loe;")
    public static class183 field3316 = new class183();

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "F")
    public static float field3317;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Leb;")
    private class577 field3307;

    @OriginalMember(owner = "client!mb", name = "DA", descriptor = "(IIIIIII)V", line = 5)
    public final void method898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3300++;
        int var8 = arg0 + arg2;
        this.field3306.method1211(false, (byte) 33);
        int var9 = arg1 + arg3;
        this.field3304.method2933((byte) 121);
        this.field3304.method2932(true, this.field3306);
        this.field3304.method2996(arg6, true);
        this.field3304.method2985(arg4, -26973);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3306.field8431 && !this.field3298) {
            float var10 = (float) arg3 * this.field3306.field8435 / (float) this.field3306.field8436;
            float var11 = (float) arg2 * this.field3306.field8429 / (float) this.field3306.field8432;
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
        OpenGL.glTranslatef((float) this.field3305, (float) this.field3295, 0.0F);
        int var12 = this.method896();
        int var13 = this.method901();
        int var14 = this.field3306.field8436 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = arg0 + this.field3306.field8432;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field3306.field8435);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field3306.field8429, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field3306.field8429, this.field3306.field8435);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field3306.field8429 / (float) this.field3306.field8432;
                OpenGL.glTexCoord2f(0.0F, this.field3306.field8435);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field3306.field8435);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (var15 + this.field3306.field8436 - var9) * this.field3306.field8435 / (float) this.field3306.field8436;
            int var17 = this.field3306.field8432 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field3306.field8435);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field3306.field8429, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field3306.field8429, this.field3306.field8435);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field3306.field8429 / (float) this.field3306.field8432;
                OpenGL.glTexCoord2f(0.0F, this.field3306.field8435);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field3306.field8435);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 142)
    public static void method1468(int arg0) {
        field3316 = null;
        if (arg0 != -3181) {
            field3316 = null;
        }
        field3314 = null;
    }

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "()I", line = 154)
    public final int method896() {
        field3299++;
        return this.field3306.field8432 + this.field3305 + this.field3312;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILua;II)V", line = 163)
    public final void method6(int arg0, int arg1, class616 arg2, int arg3, int arg4) {
        field3309++;
        class681 var6 = (class681) arg2;
        class577 var7 = var6.field9752;
        this.field3306.method1211(false, (byte) 33);
        this.field3304.method2933((byte) 120);
        this.field3304.method2932(true, this.field3306);
        this.field3304.method2985(1, -26973);
        this.field3304.method2975(1, 94);
        this.field3304.method2932(true, var7);
        this.field3304.method2948(7681, 8448, (byte) -124);
        this.field3304.method2968(768, 0, (byte) -125, 34168);
        this.field3304.method2996(1, true);
        int var8 = this.field3305 + arg0;
        int var9 = this.field3295 + arg1;
        int var10 = var8 + this.field3306.field8432;
        int var11 = this.field3306.field8436 + var9;
        float var12 = var7.field8429 / (float) var7.field8432;
        float var13 = var7.field8435 / (float) var7.field8436;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field8435 - (float) (var9 - arg4) * var13;
        float var17 = var7.field8435 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3306.field8435);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, var9 + this.field3306.field8436);
        OpenGL.glMultiTexCoord2f(33984, this.field3306.field8429, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var8 + this.field3306.field8432, var9 - -this.field3306.field8436);
        OpenGL.glMultiTexCoord2f(33984, this.field3306.field8429, this.field3306.field8435);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var8 + this.field3306.field8432, var9);
        OpenGL.glEnd();
        this.field3304.method2968(768, 0, (byte) -92, 5890);
        this.field3304.method2985(0, -26973);
        this.field3304.method2932(true, null);
        this.field3304.method2975(0, 84);
    }

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "(IIIII)V", line = 224)
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3310++;
        this.field3306.method1211(false, (byte) 33);
        this.field3304.method2933((byte) 122);
        this.field3304.method2996(arg4, true);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field3295 + arg1;
        int var7 = this.field3305 + arg0;
        if (this.field3307 == null) {
            this.field3304.method2932(true, this.field3306);
            this.field3304.method2985(arg2, -26973);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3306.field8435);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field3306.field8436 + var6);
            OpenGL.glTexCoord2f(this.field3306.field8429, 0.0F);
            OpenGL.glVertex2i(var7 + this.field3306.field8432, this.field3306.field8436 + var6);
            OpenGL.glTexCoord2f(this.field3306.field8429, this.field3306.field8435);
            OpenGL.glVertex2i(this.field3306.field8432 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method1470(768, arg2);
        this.field3307.method1211(false, (byte) 33);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3306.field8435);
        OpenGL.glTexCoord2f(0.0F, this.field3306.field8435);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, var6 + this.field3306.field8436);
        OpenGL.glMultiTexCoord2f(33985, this.field3306.field8429, 0.0F);
        OpenGL.glTexCoord2f(this.field3306.field8429, 0.0F);
        OpenGL.glVertex2i(this.field3306.field8432 + var7, var6 - -this.field3306.field8436);
        OpenGL.glMultiTexCoord2f(33985, this.field3306.field8429, this.field3306.field8435);
        OpenGL.glTexCoord2f(this.field3306.field8429, this.field3306.field8435);
        OpenGL.glVertex2i(var7 + this.field3306.field8432, var6);
        OpenGL.glEnd();
        this.method1469(0);
    }

    @OriginalMember(owner = "client!mb", name = "da", descriptor = "(IIIIII)V", line = 275)
    public final void method5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3306.method1773(arg3, 0, arg1, arg2, arg0, arg4, arg5);
        field3293++;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lkga;IIZ)V", line = 685)
    public class239(class506 arg0, int arg1, int arg2, boolean arg3) {
        this.field3304 = arg0;
        this.field3306 = class43.method465(arg2, arg0, arg1, 89, arg3 ? 6408 : 6407);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lkga;IIII)V", line = 696)
    public class239(class506 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3304 = arg0;
        this.field3306 = class530.method3121(-124, arg1, arg4, arg2, arg3, arg0);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lkga;II[III)V", line = 711)
    public class239(class506 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3304 = arg0;
        this.field3306 = class306.method1812((byte) -87, arg2, arg3, arg0, arg1, false);
    }

    @OriginalMember(owner = "client!mb", name = "YA", descriptor = "(IIIIIIII)V", line = 294)
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3315++;
        this.field3306.method1211((arg7 & 0x1) != 0, (byte) 33);
        this.field3304.method2933((byte) 104);
        this.field3304.method2996(arg6, true);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3298) {
            float var9 = (float) arg2 / (float) this.method896();
            float var10 = (float) arg3 / (float) this.method901();
            float var11 = (float) this.field3305 * var9 + (float) arg0;
            float var12 = (float) this.field3295 * var10 + (float) arg1;
            float var13 = (float) this.field3306.field8432 * var9 + var11;
            float var14 = (float) this.field3306.field8436 * var10 + var12;
            if (this.field3307 == null) {
                this.field3304.method2932(true, this.field3306);
                this.field3304.method2985(arg4, -26973);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field3306.field8435);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field3306.field8429, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field3306.field8429, this.field3306.field8435);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method1470(768, arg4);
                this.field3307.method1211(true, (byte) 33);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3306.field8435);
                OpenGL.glTexCoord2f(0.0F, this.field3306.field8435);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field3306.field8429, 0.0F);
                OpenGL.glTexCoord2f(this.field3306.field8429, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field3306.field8429, this.field3306.field8435);
                OpenGL.glTexCoord2f(this.field3306.field8429, this.field3306.field8435);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method1469(0);
            }
        } else if (this.field3307 == null) {
            this.field3304.method2932(true, this.field3306);
            this.field3304.method2985(arg4, -26973);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3306.field8435);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3306.field8429, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3306.field8429, this.field3306.field8435);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1470(768, arg4);
            this.field3307.method1211(true, (byte) 33);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3306.field8435);
            OpenGL.glTexCoord2f(0.0F, this.field3306.field8435);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3306.field8429, 0.0F);
            OpenGL.glTexCoord2f(this.field3306.field8429, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3306.field8429, this.field3306.field8435);
            OpenGL.glTexCoord2f(this.field3306.field8429, this.field3306.field8435);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1469(0);
        }
    }

    @OriginalMember(owner = "client!mb", name = "xa", descriptor = "(III)V", line = 398)
    public final void method4(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field3303++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field3307 = class530.method3121(-109, arg0, this.field3306.field8436, arg1, this.field3306.field8432, this.field3304);
        this.field3297 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!mb", name = "qa", descriptor = "(FFFFFFIIII)V", line = 424)
    public final void method895(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field3298) {
            float var11 = (float) this.method896();
            float var12 = (float) this.method901();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field3295 * var15;
            float var18 = (float) this.field3295 * var16;
            float var19 = (float) this.field3305 * var13;
            float var20 = (float) this.field3305 * var14;
            float var21 = (float) this.field3312 * -var13;
            float var22 = (float) this.field3312 * -var14;
            float var23 = (float) this.field3296 * -var15;
            arg4 = arg4 + var19 + var23;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            float var24 = (float) this.field3296 * -var16;
            arg0 = arg0 + var19 + var17;
            arg3 = arg3 + var22 + var18;
            arg5 = arg5 + var20 + var24;
        }
        field3302++;
        float var25 = arg2 + arg4 - arg0;
        this.field3306.method1211((arg9 & 0x1) != 0, (byte) 33);
        float var26 = arg5 + arg3 - arg1;
        this.field3304.method2933((byte) 127);
        this.field3304.method2932(true, this.field3306);
        this.field3304.method2996(arg8, true);
        this.field3304.method2985(arg6, -26973);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field3306.field8435);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field3306.field8429, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field3306.field8429, this.field3306.field8435);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 491)
    private final void method1469(int arg0) {
        field3292++;
        this.field3304.method2975(1, arg0 ^ 0x76);
        this.field3304.method2932(true, null);
        this.field3304.method2948(8448, 8448, (byte) -110);
        this.field3304.method2968(768, 1, (byte) -105, 34168);
        this.field3304.method2938(-127, 5890, 770, arg0);
        this.field3304.method2975(0, arg0 ^ 0x63);
        this.field3304.method2968(768, 1, (byte) 79, 34168);
    }

    @OriginalMember(owner = "client!mb", name = "ca", descriptor = "()I", line = 517)
    public final int method901() {
        field3311++;
        return this.field3306.field8436 - (-this.field3295 - this.field3296);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(FFFFFFILua;II)V", line = 531)
    public final void method899(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class616 arg7, int arg8, int arg9) {
        field3291++;
        class577 var11 = ((class681) arg7).field9752;
        if (this.field3298) {
            float var12 = (float) this.method896();
            float var13 = (float) this.method901();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field3295 * var16;
            float var19 = (float) this.field3295 * var17;
            float var20 = (float) this.field3305 * var14;
            float var21 = (float) this.field3305 * var15;
            float var22 = (float) this.field3312 * -var14;
            float var23 = (float) this.field3312 * -var15;
            float var24 = (float) this.field3296 * -var16;
            arg3 = arg3 + var23 + var19;
            arg4 = arg4 + var20 + var24;
            arg0 = arg0 + var20 + var18;
            float var25 = (float) this.field3296 * -var17;
            arg1 = arg1 + var21 + var19;
            arg2 = arg2 + var22 + var18;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field3306.method1211((arg6 & 0x1) != 0, (byte) 33);
        float var27 = arg5 + arg3 - arg1;
        this.field3304.method2933((byte) 89);
        this.field3304.method2932(true, this.field3306);
        this.field3304.method2985(1, -26973);
        this.field3304.method2975(1, 97);
        this.field3304.method2932(true, var11);
        this.field3304.method2948(7681, 8448, (byte) 88);
        this.field3304.method2968(768, 0, (byte) -115, 34168);
        this.field3304.method2996(1, true);
        float var28 = var11.field8429 / (float) var11.field8432;
        float var29 = var11.field8435 / (float) var11.field8436;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3306.field8435);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field8435 - (arg1 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field8435 - ((arg5 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field3306.field8429, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field8435 - (((float) (-arg9) + var27) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field3306.field8429, this.field3306.field8435);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field8435 - ((float) (-arg9) + arg3) * var29);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field3304.method2968(768, 0, (byte) 61, 5890);
        this.field3304.method2985(0, -26973);
        this.field3304.method2932(true, null);
        this.field3304.method2975(0, 71);
    }

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "()I", line = 616)
    public final int method900() {
        field3294++;
        return this.field3306.field8436;
    }

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "(IIII)V", line = 624)
    public final void method894(int arg0, int arg1, int arg2, int arg3) {
        this.field3295 = arg1;
        this.field3305 = arg0;
        this.field3312 = arg2;
        field3308++;
        this.field3296 = arg3;
        this.field3298 = this.field3305 != 0 || this.field3295 != 0 || this.field3312 != 0 || this.field3296 != 0;
    }

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "()I", line = 639)
    public final int method902() {
        field3301++;
        return this.field3306.field8432;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V", line = 647)
    private final void method1470(int arg0, int arg1) {
        field3313++;
        this.field3304.method2975(1, arg0 - 691);
        this.field3304.method2932(true, this.field3306);
        this.field3304.method2948(this.field3304.method2965((byte) 31, arg1), 7681, (byte) 12);
        this.field3304.method2968(arg0, 1, (byte) 124, 34167);
        this.field3304.method2938(-127, 34168, 770, 0);
        this.field3304.method2975(0, 111);
        this.field3304.method2932(true, this.field3307);
        this.field3304.method2948(34479, 7681, (byte) 92);
        this.field3304.method2968(768, 1, (byte) -107, 34166);
        if (this.field3297 == 0) {
            this.field3304.method2983(0.5F, -121, 1.0F, 0.0F, 0.5F);
        } else if (this.field3297 == 1) {
            this.field3304.method2983(1.0F, -123, 0.5F, 0.0F, 0.5F);
        } else if (this.field3297 == 2) {
            this.field3304.method2983(0.5F, -121, 0.5F, 0.0F, 1.0F);
        } else if (this.field3297 == 3) {
            this.field3304.method2983(128.5F, -128, 128.5F, 0.0F, 128.5F);
            return;
        }
    }
}
