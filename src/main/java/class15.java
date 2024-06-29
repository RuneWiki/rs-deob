import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 extends class743 {

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Z")
    private boolean field191 = false;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    private int field202 = 0;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    private int field206 = 0;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    private int field210 = 0;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    private int field213 = 0;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
    private int field205 = 0;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Loea;")
    private class594 field188;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "Lm;")
    private class189 field203;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "F")
    public static float field190 = 0.0F;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "[Lou;")
    public static class602[] field193 = new class602[75];

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Lm;")
    private class189 field189;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V", line = 3)
    public final void method81(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field211++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field189 = class744.method4147(this.field188, arg1, this.field203.field2725, arg0, this.field203.field2720, 0);
        this.field213 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "()I", line = 26)
    public final int method82() {
        field195++;
        return this.field203.field2720 - (-this.field205 - this.field202);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()I", line = 35)
    public final int method83() {
        field204++;
        return this.field203.field2725 + this.field210 + this.field206;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 45)
    private final void method84(int arg0) {
        this.field188.method3413(1, 33984);
        field192++;
        if (arg0 >= -64) {
            this.field205 = 72;
        }
        this.field188.method3425(null, 71);
        this.field188.method3485(8448, (byte) 63, 8448);
        this.field188.method3464(1, 768, false, 34168);
        this.field188.method3453(7482, 5890, 0, 770);
        this.field188.method3413(0, 33984);
        this.field188.method3464(1, 768, false, 34168);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIII)V", line = 71)
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field209++;
        this.field203.method818((arg7 & 0x1) != 0, (byte) 11);
        this.field188.method3455(-76);
        this.field188.method3454(arg6, 109);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field191) {
            float var9 = (float) arg2 / (float) this.method82();
            float var10 = (float) arg3 / (float) this.method83();
            float var11 = (float) this.field205 * var9 + (float) arg0;
            float var12 = (float) this.field206 * var10 + (float) arg1;
            float var13 = (float) this.field203.field2720 * var9 + var11;
            float var14 = (float) this.field203.field2725 * var10 + var12;
            if (this.field189 == null) {
                this.field188.method3425(this.field203, -118);
                this.field188.method3417(arg4, 0);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field203.field2719);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field203.field2722, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field203.field2722, this.field203.field2719);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method89((byte) 126, arg4);
                this.field189.method818(true, (byte) 11);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field203.field2719);
                OpenGL.glTexCoord2f(0.0F, this.field203.field2719);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field203.field2722, 0.0F);
                OpenGL.glTexCoord2f(this.field203.field2722, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field203.field2722, this.field203.field2719);
                OpenGL.glTexCoord2f(this.field203.field2722, this.field203.field2719);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method84(-110);
            }
        } else if (this.field189 == null) {
            this.field188.method3425(this.field203, -104);
            this.field188.method3417(arg4, 0);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field203.field2719);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field203.field2722, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glTexCoord2f(this.field203.field2722, this.field203.field2719);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method89((byte) 99, arg4);
            this.field189.method818(true, (byte) 11);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field203.field2719);
            OpenGL.glTexCoord2f(0.0F, this.field203.field2719);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field203.field2722, 0.0F);
            OpenGL.glTexCoord2f(this.field203.field2722, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field203.field2722, this.field203.field2719);
            OpenGL.glTexCoord2f(this.field203.field2722, this.field203.field2719);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method84(-105);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)V", line = 178)
    public final void method86(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field203.method818(false, (byte) 11);
        field199++;
        this.field188.method3455(-76);
        this.field188.method3454(arg4, 0);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field205 + arg0;
        int var7 = this.field206 + arg1;
        if (this.field189 == null) {
            this.field188.method3425(this.field203, 105);
            this.field188.method3417(arg2, 0);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field203.field2719);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, var7 + this.field203.field2725);
            OpenGL.glTexCoord2f(this.field203.field2722, 0.0F);
            OpenGL.glVertex2i(this.field203.field2720 + var6, this.field203.field2725 + var7);
            OpenGL.glTexCoord2f(this.field203.field2722, this.field203.field2719);
            OpenGL.glVertex2i(this.field203.field2720 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method89((byte) 116, arg2);
        this.field189.method818(false, (byte) 11);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field203.field2719);
        OpenGL.glTexCoord2f(0.0F, this.field203.field2719);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field203.field2725 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field203.field2722, 0.0F);
        OpenGL.glTexCoord2f(this.field203.field2722, 0.0F);
        OpenGL.glVertex2i(var6 + this.field203.field2720, this.field203.field2725 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field203.field2722, this.field203.field2719);
        OpenGL.glTexCoord2f(this.field203.field2722, this.field203.field2719);
        OpenGL.glVertex2i(this.field203.field2720 + var6, var7);
        OpenGL.glEnd();
        this.method84(-69);
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(IIII)V", line = 233)
    public final void method87(int arg0, int arg1, int arg2, int arg3) {
        this.field202 = arg2;
        this.field205 = arg0;
        field196++;
        this.field210 = arg3;
        this.field206 = arg1;
        this.field191 = this.field205 != 0 || this.field206 != 0 || this.field202 != 0 || this.field210 != 0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIII)V", line = 246)
    public final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field203.method1349(arg2, arg5, arg0, arg1, arg4, arg3, 3314);
        field207++;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Loea;IIZ)V", line = 696)
    public class15(class594 arg0, int arg1, int arg2, boolean arg3) {
        this.field188 = arg0;
        this.field203 = class37.method305((byte) 2, arg0, arg3 ? 6408 : 6407, arg2, arg1);
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Loea;IIII)V", line = 706)
    public class15(class594 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field188 = arg0;
        this.field203 = class744.method4147(arg0, arg2, arg4, arg1, arg3, 0);
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Loea;II[III)V", line = 719)
    public class15(class594 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field188 = arg0;
        this.field203 = class13.method72(arg2, arg3, false, false, arg4, arg1, arg5, arg0);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)V", line = 260)
    private final void method89(byte arg0, int arg1) {
        this.field188.method3413(1, 33984);
        field198++;
        this.field188.method3425(this.field203, 122);
        this.field188.method3485(this.field188.method3450(118, arg1), (byte) 38, 7681);
        if (arg0 <= 39) {
            this.method83();
        }
        this.field188.method3464(1, 768, false, 34167);
        this.field188.method3453(7482, 34168, 0, 770);
        this.field188.method3413(0, 33984);
        this.field188.method3425(this.field189, -32);
        this.field188.method3485(34479, (byte) 85, 7681);
        this.field188.method3464(1, 768, false, 34166);
        if (this.field213 == 0) {
            this.field188.method3443(1.0F, 0.5F, 0.0F, 0.5F, false);
        } else if (this.field213 == 1) {
            this.field188.method3443(0.5F, 0.5F, 0.0F, 1.0F, false);
        } else if (this.field213 == 2) {
            this.field188.method3443(0.5F, 1.0F, 0.0F, 0.5F, false);
            return;
        } else if (this.field213 == 3) {
            this.field188.method3443(128.5F, 128.5F, 0.0F, 128.5F, false);
            return;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILaa;II)V", line = 298)
    public final void method90(int arg0, int arg1, class484 arg2, int arg3, int arg4) {
        field208++;
        class277 var6 = (class277) arg2;
        class189 var7 = var6.field3912;
        this.field203.method818(false, (byte) 11);
        this.field188.method3455(91);
        this.field188.method3425(this.field203, -64);
        this.field188.method3417(1, 0);
        this.field188.method3413(1, 33984);
        this.field188.method3425(var7, 120);
        this.field188.method3485(7681, (byte) 126, 8448);
        this.field188.method3464(0, 768, false, 34168);
        this.field188.method3454(1, 110);
        int var8 = this.field206 + arg1;
        int var9 = this.field205 + arg0;
        int var10 = this.field203.field2720 + var9;
        int var11 = this.field203.field2725 + var8;
        float var12 = var7.field2722 / (float) var7.field2720;
        float var13 = var7.field2719 / (float) var7.field2725;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field2719 - (float) (var8 - arg4) * var13;
        float var17 = var7.field2719 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field203.field2719);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field203.field2725);
        OpenGL.glMultiTexCoord2f(33984, this.field203.field2722, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field203.field2720 + var9, var8 - -this.field203.field2725);
        OpenGL.glMultiTexCoord2f(33984, this.field203.field2722, this.field203.field2719);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field203.field2720 + var9, var8);
        OpenGL.glEnd();
        this.field188.method3464(0, 768, false, 5890);
        this.field188.method3417(0, 0);
        this.field188.method3425(null, -40);
        this.field188.method3413(0, 33984);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIII)V", line = 357)
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field194++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field203.method818(false, (byte) 11);
        this.field188.method3455(114);
        this.field188.method3425(this.field203, -43);
        this.field188.method3454(arg6, -84);
        this.field188.method3417(arg4, 0);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field203.field2730 && !this.field191) {
            float var10 = (float) arg3 * this.field203.field2719 / (float) this.field203.field2725;
            float var11 = (float) arg2 * this.field203.field2722 / (float) this.field203.field2720;
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
        OpenGL.glTranslatef((float) this.field205, (float) this.field206, 0.0F);
        int var12 = this.method82();
        int var13 = this.method83();
        int var14 = this.field203.field2725 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field203.field2720 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field203.field2719);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field203.field2722, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field203.field2722, this.field203.field2719);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field203.field2722 / (float) this.field203.field2720;
                OpenGL.glTexCoord2f(0.0F, this.field203.field2719);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field203.field2719);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (var15 + this.field203.field2725 - var9) * this.field203.field2719 / (float) this.field203.field2725;
            int var17 = this.field203.field2720 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field203.field2719);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field203.field2722, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field203.field2722, this.field203.field2719);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field203.field2722 / (float) this.field203.field2720;
                OpenGL.glTexCoord2f(0.0F, this.field203.field2719);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field203.field2719);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 495)
    public final void method92(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class484 arg7, int arg8, int arg9) {
        field214++;
        class189 var11 = ((class277) arg7).field3912;
        if (this.field191) {
            float var12 = (float) this.method82();
            float var13 = (float) this.method83();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field206 * var16;
            float var19 = (float) this.field206 * var17;
            float var20 = (float) this.field205 * var14;
            float var21 = (float) this.field205 * var15;
            float var22 = (float) this.field202 * -var14;
            float var23 = (float) this.field202 * -var15;
            float var24 = (float) this.field210 * -var16;
            float var25 = (float) this.field210 * -var17;
            arg1 = arg1 + var21 + var19;
            arg3 = arg3 + var23 + var19;
            arg2 = arg2 + var22 + var18;
            arg0 = arg0 + var20 + var18;
            arg4 = arg4 + var20 + var24;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        float var27 = arg5 + arg3 - arg1;
        this.field203.method818((arg6 & 0x1) != 0, (byte) 11);
        this.field188.method3455(35);
        this.field188.method3425(this.field203, 111);
        this.field188.method3417(1, 0);
        this.field188.method3413(1, 33984);
        this.field188.method3425(var11, -83);
        this.field188.method3485(7681, (byte) 94, 8448);
        this.field188.method3464(0, 768, false, 34168);
        this.field188.method3454(1, 113);
        float var28 = var11.field2722 / (float) var11.field2720;
        float var29 = var11.field2719 / (float) var11.field2725;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field203.field2719);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field2719 - ((float) (-arg9) + arg1) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field2719 - (arg5 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field203.field2722, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field2719 - (var27 - (float) arg9) * var29);
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field203.field2722, this.field203.field2719);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field2719 - ((arg3 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field188.method3464(0, 768, false, 5890);
        this.field188.method3417(0, 0);
        this.field188.method3425(null, -33);
        this.field188.method3413(0, 33984);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "()I", line = 581)
    public final int method93() {
        field212++;
        return this.field203.field2720;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V", line = 589)
    public static void method94(byte arg0) {
        field193 = null;
        if (arg0 != 6) {
            method94((byte) 120);
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "()I", line = 610)
    public final int method95() {
        field197++;
        return this.field203.field2725;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFFFFFIIII)V", line = 623)
    public final void method96(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field200++;
        if (this.field191) {
            float var11 = (float) this.method82();
            float var12 = (float) this.method83();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field206 * var15;
            float var18 = (float) this.field206 * var16;
            float var19 = (float) this.field205 * var13;
            float var20 = (float) this.field205 * var14;
            float var21 = (float) this.field202 * -var13;
            float var22 = (float) this.field202 * -var14;
            float var23 = (float) this.field210 * -var15;
            arg0 = arg0 + var19 + var17;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            float var24 = (float) this.field210 * -var16;
            arg1 = arg1 + var20 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field203.method818((arg9 & 0x1) != 0, (byte) 11);
        this.field188.method3455(-74);
        this.field188.method3425(this.field203, -51);
        this.field188.method3454(arg8, -45);
        this.field188.method3417(arg6, 0);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field203.field2719);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field203.field2722, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field203.field2722, this.field203.field2719);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }
}
