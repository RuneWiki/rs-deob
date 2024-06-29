import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class746 extends class712 {

    @OriginalMember(owner = "client!au", name = "l", descriptor = "Z")
    private boolean field10412 = false;

    @OriginalMember(owner = "client!au", name = "q", descriptor = "I")
    private int field10417 = 0;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "I")
    private int field10420 = 0;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "I")
    private int field10411 = 0;

    @OriginalMember(owner = "client!au", name = "v", descriptor = "I")
    private int field10422 = 0;

    @OriginalMember(owner = "client!au", name = "C", descriptor = "I")
    private int field10429 = 0;

    @OriginalMember(owner = "client!au", name = "z", descriptor = "Leq;")
    private class357 field10426;

    @OriginalMember(owner = "client!au", name = "u", descriptor = "Lmba;")
    private class77 field10421;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field10402;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field10403;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public static int field10404;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    public static int field10405;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field10406;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    public static int field10407;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "I")
    public static int field10408;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "I")
    public static int field10409;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "I")
    public static int field10410;

    @OriginalMember(owner = "client!au", name = "m", descriptor = "I")
    public static int field10413;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "I")
    public static int field10414;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "I")
    public static int field10415;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "I")
    public static int field10416;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "I")
    public static int field10418;

    @OriginalMember(owner = "client!au", name = "s", descriptor = "I")
    public static int field10419;

    @OriginalMember(owner = "client!au", name = "w", descriptor = "I")
    public static int field10423;

    @OriginalMember(owner = "client!au", name = "x", descriptor = "I")
    public static int field10424;

    @OriginalMember(owner = "client!au", name = "y", descriptor = "I")
    public static int field10425;

    @OriginalMember(owner = "client!au", name = "A", descriptor = "I")
    public static int field10427;

    @OriginalMember(owner = "client!au", name = "B", descriptor = "I")
    public static int field10428;

    @OriginalMember(owner = "client!au", name = "D", descriptor = "I")
    public static int field10430;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "Lmba;")
    private class77 field10401;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "()I")
    public final int method1892() {
        field10416++;
        return this.field10429 + this.field10417 + this.field10421.field1033;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIII[III)V")
    private final void method4167(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field10407++;
        this.field10421.method1180(arg5, arg6, arg4, arg0, arg3, true, 0, arg2, arg1);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIII)V")
    public final void method1871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field10413++;
        int var8 = arg0 + arg2;
        this.field10421.method2433(false, -102);
        int var9 = arg1 + arg3;
        this.field10426.method2116(0);
        this.field10426.method2120(-1, this.field10421);
        this.field10426.method2195(90, arg6);
        this.field10426.method2153(80, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field10421.field1026 && !this.field10412) {
            float var10 = (float) arg3 * this.field10421.field1031 / (float) this.field10421.field1023;
            float var11 = (float) arg2 * this.field10421.field1028 / (float) this.field10421.field1033;
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
        OpenGL.glTranslatef((float) this.field10429, (float) this.field10411, 0.0F);
        int var12 = this.method1892();
        int var13 = this.method1882();
        int var14 = this.field10421.field1023 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field10421.field1033 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field10421.field1031);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field10421.field1028, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field10421.field1028, this.field10421.field1031);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field10421.field1028 / (float) this.field10421.field1033;
                OpenGL.glTexCoord2f(0.0F, this.field10421.field1031);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field10421.field1031);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (-var9 - (-var15 - this.field10421.field1023)) * this.field10421.field1031 / (float) this.field10421.field1023;
            int var17 = this.field10421.field1033 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field10421.field1031);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field10421.field1028, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field10421.field1028, this.field10421.field1031);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field10421.field1028 / (float) this.field10421.field1033;
                OpenGL.glTexCoord2f(0.0F, this.field10421.field1031);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field10421.field1031);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(II)I")
    public static final int method4168(int arg0, int arg1) {
        int var2 = -88 / ((arg0 + 65) / 46);
        field10414++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "()I")
    public final int method1893() {
        field10425++;
        return this.field10421.field1023;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IILaa;II)V")
    public final void method691(int arg0, int arg1, class81 arg2, int arg3, int arg4) {
        field10418++;
        class553 var6 = (class553) arg2;
        class77 var7 = var6.field7766;
        this.field10421.method2433(false, -102);
        this.field10426.method2116(0);
        this.field10426.method2120(-1, this.field10421);
        this.field10426.method2153(75, 1);
        this.field10426.method2135(1, -5027);
        this.field10426.method2120(-1, var7);
        this.field10426.method2165((byte) 74, 8448, 7681);
        this.field10426.method2132(768, (byte) -6, 34168, 0);
        this.field10426.method2195(65, 1);
        int var8 = this.field10411 + arg1;
        int var9 = this.field10429 + arg0;
        int var10 = var9 + this.field10421.field1033;
        int var11 = this.field10421.field1023 + var8;
        float var12 = var7.field1028 / (float) var7.field1033;
        float var13 = var7.field1031 / (float) var7.field1023;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field1031 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field1031 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field10421.field1031);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field10421.field1023);
        OpenGL.glMultiTexCoord2f(33984, this.field10421.field1028, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field10421.field1033 + var9, this.field10421.field1023 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field10421.field1028, this.field10421.field1031);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field10421.field1033 + var9, var8);
        OpenGL.glEnd();
        this.field10426.method2132(768, (byte) 12, 5890, 0);
        this.field10426.method2153(-91, 0);
        this.field10426.method2120(-1, null);
        this.field10426.method2135(0, -5027);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIIII)V")
    public final void method695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field10421.method2433((arg7 & 0x1) != 0, -87);
        field10427++;
        this.field10426.method2116(0);
        this.field10426.method2195(111, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field10412) {
            float var9 = (float) arg2 / (float) this.method1892();
            float var10 = (float) arg3 / (float) this.method1882();
            float var11 = (float) this.field10429 * var9 + (float) arg0;
            float var12 = (float) this.field10411 * var10 + (float) arg1;
            float var13 = (float) this.field10421.field1033 * var9 + var11;
            float var14 = (float) this.field10421.field1023 * var10 + var12;
            if (this.field10401 == null) {
                this.field10426.method2120(-1, this.field10421);
                this.field10426.method2153(100, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field10421.field1031);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field10421.field1028, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field10421.field1028, this.field10421.field1031);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method4170(arg4, -127);
                this.field10401.method2433(true, -111);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field10421.field1031);
                OpenGL.glTexCoord2f(0.0F, this.field10421.field1031);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field10421.field1028, 0.0F);
                OpenGL.glTexCoord2f(this.field10421.field1028, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field10421.field1028, this.field10421.field1031);
                OpenGL.glTexCoord2f(this.field10421.field1028, this.field10421.field1031);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method4171(true);
            }
        } else if (this.field10401 == null) {
            this.field10426.method2120(-1, this.field10421);
            this.field10426.method2153(120, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field10421.field1031);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field10421.field1028, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field10421.field1028, this.field10421.field1031);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method4170(arg4, -95);
            this.field10401.method2433(true, -88);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field10421.field1031);
            OpenGL.glTexCoord2f(0.0F, this.field10421.field1031);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field10421.field1028, 0.0F);
            OpenGL.glTexCoord2f(this.field10421.field1028, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field10421.field1028, this.field10421.field1031);
            OpenGL.glTexCoord2f(this.field10421.field1028, this.field10421.field1031);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method4171(true);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(III)V")
    public final void method689(int arg0, int arg1, int arg2) {
        field10408++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field10401 = class358.method2200(arg1, this.field10421.field1023, arg0, this.field10426, 3234, this.field10421.field1033);
        this.field10422 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIII)V")
    public final void method688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10419++;
        if (!this.field10426.field4993) {
            this.field10421.method1183(arg3, 10497, arg1, arg0, arg5, arg2, arg4);
            return;
        }
        int[] var7 = this.field10426.method143(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class216.method1308(var7[var8], -16777216);
            }
            this.method4167(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1887(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class81 arg7, int arg8, int arg9) {
        field10402++;
        class77 var11 = ((class553) arg7).field7766;
        if (this.field10412) {
            float var12 = (float) this.method1892();
            float var13 = (float) this.method1882();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field10411 * var16;
            float var19 = (float) this.field10411 * var17;
            float var20 = (float) this.field10429 * var14;
            float var21 = (float) this.field10429 * var15;
            float var22 = (float) this.field10417 * -var14;
            float var23 = (float) this.field10417 * -var15;
            float var24 = (float) this.field10420 * -var16;
            arg4 = arg4 + var20 + var24;
            arg1 = arg1 + var21 + var19;
            arg2 = arg2 + var22 + var18;
            float var25 = (float) this.field10420 * -var17;
            arg3 = arg3 + var23 + var19;
            arg0 = arg0 + var20 + var18;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        float var27 = arg5 + arg3 - arg1;
        this.field10421.method2433((arg6 & 0x1) != 0, -108);
        this.field10426.method2116(0);
        this.field10426.method2120(-1, this.field10421);
        this.field10426.method2153(-113, 1);
        this.field10426.method2135(1, -5027);
        this.field10426.method2120(-1, var11);
        this.field10426.method2165((byte) 74, 8448, 7681);
        this.field10426.method2132(768, (byte) -14, 34168, 0);
        this.field10426.method2195(82, 1);
        float var28 = var11.field1028 / (float) var11.field1033;
        float var29 = var11.field1031 / (float) var11.field1023;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field10421.field1031);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field1031 - ((arg1 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg4) * var28, var11.field1031 - ((float) (-arg9) + arg5) * var29);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field10421.field1028, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + var26) * var28, var11.field1031 - (((float) (-arg9) + var27) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field10421.field1028, this.field10421.field1031);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field1031 - ((float) (-arg9) + arg3) * var29);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field10426.method2132(768, (byte) 106, 5890, 0);
        this.field10426.method2153(114, 0);
        this.field10426.method2120(-1, null);
        this.field10426.method2135(0, -5027);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1883(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field10412) {
            float var11 = (float) this.method1892();
            float var12 = (float) this.method1882();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field10411 * var15;
            float var18 = (float) this.field10411 * var16;
            float var19 = (float) this.field10429 * var13;
            float var20 = (float) this.field10429 * var14;
            float var21 = (float) this.field10417 * -var13;
            float var22 = (float) this.field10417 * -var14;
            float var23 = (float) this.field10420 * -var15;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            float var24 = (float) this.field10420 * -var16;
            arg2 = arg2 + var21 + var17;
            arg5 = arg5 + var20 + var24;
        }
        field10428++;
        float var25 = arg2 + arg4 - arg0;
        this.field10421.method2433((arg9 & 0x1) != 0, -96);
        float var26 = arg5 + arg3 - arg1;
        this.field10426.method2116(0);
        this.field10426.method2120(-1, this.field10421);
        this.field10426.method2195(65, arg8);
        this.field10426.method2153(116, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field10421.field1031);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field10421.field1028, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field10421.field1028, this.field10421.field1031);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V")
    public static final void method4169(boolean arg0) {
        if (class422.field6000 != null) {
            try {
                class422.field6000.close();
            } catch (IOException var1) {
            }
        }
        field10423++;
        if (!arg0) {
            class422.field6000 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIII)V")
    public final void method1874(int arg0, int arg1, int arg2, int arg3) {
        this.field10417 = arg2;
        this.field10420 = arg3;
        this.field10411 = arg1;
        this.field10429 = arg0;
        field10405++;
        this.field10412 = this.field10429 != 0 || this.field10411 != 0 || this.field10417 != 0 || this.field10420 != 0;
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(II)V")
    private final void method4170(int arg0, int arg1) {
        field10409++;
        this.field10426.method2135(1, -5027);
        this.field10426.method2120(-1, this.field10421);
        this.field10426.method2165((byte) 74, 7681, this.field10426.method2130(arg0, -8695));
        if (arg1 > -46) {
            this.field10429 = 16;
        }
        this.field10426.method2132(768, (byte) 103, 34167, 1);
        this.field10426.method2189(34168, true, 0, 770);
        this.field10426.method2135(0, -5027);
        this.field10426.method2120(-1, this.field10401);
        this.field10426.method2165((byte) 74, 7681, 34479);
        this.field10426.method2132(768, (byte) -56, 34166, 1);
        if (this.field10422 == 0) {
            this.field10426.method2163(0.5F, -13857, 1.0F, 0.0F, 0.5F);
        } else if (this.field10422 == 1) {
            this.field10426.method2163(0.5F, -13857, 0.5F, 0.0F, 1.0F);
        } else if (this.field10422 == 2) {
            this.field10426.method2163(1.0F, -13857, 0.5F, 0.0F, 0.5F);
        } else if (this.field10422 == 3) {
            this.field10426.method2163(128.5F, -13857, 128.5F, 0.0F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "()I")
    public final int method1882() {
        field10410++;
        return this.field10421.field1023 + this.field10411 + this.field10420;
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "()I")
    public final int method1895() {
        field10424++;
        return this.field10421.field1033;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(Z)V")
    private final void method4171(boolean arg0) {
        field10404++;
        this.field10426.method2135(1, -5027);
        if (!arg0) {
            this.field10421 = null;
        }
        this.field10426.method2120(-1, null);
        this.field10426.method2165((byte) 74, 8448, 8448);
        this.field10426.method2132(768, (byte) -3, 34168, 1);
        this.field10426.method2189(5890, arg0, 0, 770);
        this.field10426.method2135(0, -5027);
        this.field10426.method2132(768, (byte) 119, 34168, 1);
    }

    @OriginalMember(owner = "client!au", name = "d", descriptor = "(II)I")
    public static final int method4172(int arg0, int arg1) {
        field10406++;
        if (arg0 != 466793768) {
            method4169(false);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "([I)V")
    public final void method1873(int[] arg0) {
        arg0[0] = this.field10429;
        arg0[1] = this.field10411;
        arg0[2] = this.field10417;
        field10415++;
        arg0[3] = this.field10420;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIII)V")
    public final void method690(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10403++;
        this.field10421.method2433(false, -114);
        this.field10426.method2116(0);
        this.field10426.method2195(-101, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field10429 + arg0;
        int var7 = this.field10411 + arg1;
        if (this.field10401 == null) {
            this.field10426.method2120(-1, this.field10421);
            this.field10426.method2153(-24, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field10421.field1031);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, var7 + this.field10421.field1023);
            OpenGL.glTexCoord2f(this.field10421.field1028, 0.0F);
            OpenGL.glVertex2i(this.field10421.field1033 + var6, this.field10421.field1023 + var7);
            OpenGL.glTexCoord2f(this.field10421.field1028, this.field10421.field1031);
            OpenGL.glVertex2i(var6 + this.field10421.field1033, var7);
            OpenGL.glEnd();
            return;
        }
        this.method4170(arg2, -99);
        this.field10401.method2433(false, -114);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field10421.field1031);
        OpenGL.glTexCoord2f(0.0F, this.field10421.field1031);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field10421.field1023 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field10421.field1028, 0.0F);
        OpenGL.glTexCoord2f(this.field10421.field1028, 0.0F);
        OpenGL.glVertex2i(this.field10421.field1033 + var6, this.field10421.field1023 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field10421.field1028, this.field10421.field1031);
        OpenGL.glTexCoord2f(this.field10421.field1028, this.field10421.field1031);
        OpenGL.glVertex2i(this.field10421.field1033 + var6, var7);
        OpenGL.glEnd();
        this.method4171(true);
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Leq;IIZ)V")
    public class746(class357 arg0, int arg1, int arg2, boolean arg3) {
        this.field10426 = arg0;
        this.field10421 = class376.method2279(arg2, arg3 ? 6408 : 6407, arg0, arg1, false);
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Leq;IIII)V")
    public class746(class357 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field10426 = arg0;
        this.field10421 = class358.method2200(arg2, arg4, arg1, arg0, 3234, arg3);
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Leq;II[III)V")
    public class746(class357 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field10426 = arg0;
        this.field10421 = class436.method2577(arg0, arg1, arg4, arg2, false, arg5, (byte) 59, arg3);
    }
}
