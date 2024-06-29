import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class233 extends class404 {

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    private int field3009 = 0;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "Z")
    private boolean field3013 = false;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    private int field3017 = 0;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    private int field3007 = 0;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    private int field3026 = 0;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    private int field3005 = 0;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "Lgk;")
    private class463 field3006;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "Lcw;")
    private class386 field3020;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Z")
    public static boolean field3015;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "Lcw;")
    private class386 field3012;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "[S")
    public static short[] field3027;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "(IIIIIII)V")
    public final void method377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3029++;
        int var8 = arg0 + arg2;
        this.field3020.method210(false, (byte) -92);
        int var9 = arg1 + arg3;
        this.field3006.method2780(12057);
        this.field3006.method2771(this.field3020, -16785);
        this.field3006.method2760(arg6, 119);
        this.field3006.method2739(arg4, 0);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3020.field5072 && !this.field3013) {
            float var10 = (float) arg3 * this.field3020.field5073 / (float) this.field3020.field5071;
            float var11 = (float) arg2 * this.field3020.field5069 / (float) this.field3020.field5070;
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
        OpenGL.glTranslatef((float) this.field3017, (float) this.field3007, 0.0F);
        int var12 = this.method370();
        int var13 = this.method369();
        int var14 = arg1 + this.field3020.field5071;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = arg0 + this.field3020.field5070;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field3020.field5073);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field3020.field5069, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field3020.field5069, this.field3020.field5073);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field3020.field5069 / (float) this.field3020.field5070;
                OpenGL.glTexCoord2f(0.0F, this.field3020.field5073);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field3020.field5073);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (var15 - (var9 - this.field3020.field5071)) * this.field3020.field5073 / (float) this.field3020.field5071;
            int var17 = this.field3020.field5070 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field3020.field5073);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field3020.field5069, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field3020.field5069, this.field3020.field5073);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field3020.field5069 / (float) this.field3020.field5070;
                OpenGL.glTexCoord2f(0.0F, this.field3020.field5073);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field3020.field5073);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!bl", name = "YA", descriptor = "(IIIII)V")
    public final void method353(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3020.method210(false, (byte) 40);
        field3023++;
        this.field3006.method2780(12057);
        this.field3006.method2760(arg4, 113);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field3007 + arg1;
        int var7 = this.field3017 + arg0;
        if (this.field3012 == null) {
            this.field3006.method2771(this.field3020, -16785);
            this.field3006.method2739(arg2, 0);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3020.field5073);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field3020.field5071 + var6);
            OpenGL.glTexCoord2f(this.field3020.field5069, 0.0F);
            OpenGL.glVertex2i(var7 + this.field3020.field5070, this.field3020.field5071 + var6);
            OpenGL.glTexCoord2f(this.field3020.field5069, this.field3020.field5073);
            OpenGL.glVertex2i(var7 + this.field3020.field5070, var6);
            OpenGL.glEnd();
            return;
        }
        this.method1478(arg2, 93);
        this.field3012.method210(false, (byte) 18);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3020.field5073);
        OpenGL.glTexCoord2f(0.0F, this.field3020.field5073);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field3020.field5071 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field3020.field5069, 0.0F);
        OpenGL.glTexCoord2f(this.field3020.field5069, 0.0F);
        OpenGL.glVertex2i(var7 + this.field3020.field5070, this.field3020.field5071 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field3020.field5069, this.field3020.field5073);
        OpenGL.glTexCoord2f(this.field3020.field5069, this.field3020.field5073);
        OpenGL.glVertex2i(this.field3020.field5070 + var7, var6);
        OpenGL.glEnd();
        this.method1479(83);
    }

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "(IIIIIII)V")
    public final void method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3020.method210(true, (byte) -106);
        field3024++;
        this.field3006.method2780(12057);
        this.field3006.method2760(arg6, 122);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3013) {
            float var8 = (float) arg2 / (float) this.method370();
            float var9 = (float) arg3 / (float) this.method369();
            float var10 = (float) this.field3017 * var8 + (float) arg0;
            float var11 = (float) this.field3007 * var9 + (float) arg1;
            float var12 = (float) this.field3020.field5070 * var8 + var10;
            float var13 = (float) this.field3020.field5071 * var9 + var11;
            if (this.field3012 == null) {
                this.field3006.method2771(this.field3020, -16785);
                this.field3006.method2739(arg4, 0);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field3020.field5073);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field3020.field5069, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field3020.field5069, this.field3020.field5073);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method1478(arg4, 83);
                this.field3012.method210(true, (byte) -86);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3020.field5073);
                OpenGL.glTexCoord2f(0.0F, this.field3020.field5073);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field3020.field5069, 0.0F);
                OpenGL.glTexCoord2f(this.field3020.field5069, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field3020.field5069, this.field3020.field5073);
                OpenGL.glTexCoord2f(this.field3020.field5069, this.field3020.field5073);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method1479(82);
            }
        } else if (this.field3012 == null) {
            this.field3006.method2771(this.field3020, -16785);
            this.field3006.method2739(arg4, 0);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3020.field5073);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3020.field5069, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3020.field5069, this.field3020.field5073);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1478(arg4, 71);
            this.field3012.method210(true, (byte) -114);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3020.field5073);
            OpenGL.glTexCoord2f(0.0F, this.field3020.field5073);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3020.field5069, 0.0F);
            OpenGL.glTexCoord2f(this.field3020.field5069, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3020.field5069, this.field3020.field5073);
            OpenGL.glTexCoord2f(this.field3020.field5069, this.field3020.field5073);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1479(109);
        }
    }

    @OriginalMember(owner = "client!bl", name = "ka", descriptor = "(IIII)V")
    public final void method379(int arg0, int arg1, int arg2, int arg3) {
        this.field3005 = arg3;
        this.field3007 = arg1;
        this.field3009 = arg2;
        field3019++;
        this.field3017 = arg0;
        this.field3013 = this.field3017 != 0 || this.field3007 != 0 || this.field3009 != 0 || this.field3005 != 0;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method1477(int arg0) {
        field3027 = null;
        if (arg0 != 0) {
            method1477(-19);
        }
    }

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "(IIIIII)V")
    public final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3025++;
        this.field3020.method2033(arg0, arg1, arg3, arg5, arg2, arg4, (byte) 55);
    }

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "(III)V")
    public final void method355(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field3016++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field3012 = class424.method2509(41, this.field3006, arg0, arg1, this.field3020.field5070, this.field3020.field5071);
        this.field3026 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!bl", name = "ja", descriptor = "()I")
    public final int method370() {
        field3021++;
        return this.field3020.field5070 + this.field3017 + this.field3009;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)V")
    private final void method1478(int arg0, int arg1) {
        this.field3006.method2741((byte) -38, 1);
        field3022++;
        this.field3006.method2771(this.field3020, -16785);
        this.field3006.method2794(this.field3006.method2767(arg0, 7681), 7681, true);
        this.field3006.method2781(34167, 1, 2479, 768);
        if (arg1 < 54) {
            return;
        }
        this.field3006.method2775(770, 34168, 0, 100);
        this.field3006.method2741((byte) -38, 0);
        this.field3006.method2771(this.field3012, -16785);
        this.field3006.method2794(34479, 7681, true);
        this.field3006.method2781(34166, 1, 2479, 768);
        if (this.field3026 == 0) {
            this.field3006.method2801(0, 0.0F, 0.5F, 0.5F, 1.0F);
        } else if (this.field3026 == 1) {
            this.field3006.method2801(0, 0.0F, 0.5F, 1.0F, 0.5F);
            return;
        } else if (this.field3026 == 2) {
            this.field3006.method2801(0, 0.0F, 1.0F, 0.5F, 0.5F);
            return;
        } else if (this.field3026 == 3) {
            this.field3006.method2801(0, 0.0F, 128.5F, 128.5F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILea;II)V")
    public final void method351(int arg0, int arg1, class113 arg2, int arg3, int arg4) {
        field3014++;
        class116 var6 = (class116) arg2;
        class386 var7 = var6.field1629;
        this.field3020.method210(false, (byte) -119);
        this.field3006.method2780(12057);
        this.field3006.method2771(this.field3020, -16785);
        this.field3006.method2739(1, 0);
        this.field3006.method2741((byte) -38, 1);
        this.field3006.method2771(var7, -16785);
        this.field3006.method2794(7681, 8448, true);
        this.field3006.method2781(34168, 0, 2479, 768);
        this.field3006.method2760(1, 117);
        int var8 = this.field3017 + arg0;
        int var9 = this.field3007 + arg1;
        int var10 = var8 + this.field3020.field5070;
        int var11 = var9 + this.field3020.field5071;
        float var12 = var7.field5069 / (float) var7.field5070;
        float var13 = var7.field5073 / (float) var7.field5071;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field5073 - (float) (var9 - arg4) * var13;
        float var17 = var7.field5073 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3020.field5073);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field3020.field5071 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field3020.field5069, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field3020.field5070 + var8, var9 - -this.field3020.field5071);
        OpenGL.glMultiTexCoord2f(33984, this.field3020.field5069, this.field3020.field5073);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field3020.field5070 + var8, var9);
        OpenGL.glEnd();
        this.field3006.method2781(5890, 0, 2479, 768);
        this.field3006.method2739(0, 0);
        this.field3006.method2771(null, -16785);
        this.field3006.method2741((byte) -38, 0);
    }

    @OriginalMember(owner = "client!bl", name = "JA", descriptor = "()I")
    public final int method369() {
        field3028++;
        return this.field3020.field5071 + this.field3007 + this.field3005;
    }

    @OriginalMember(owner = "client!bl", name = "UA", descriptor = "()I")
    public final int method375() {
        field3018++;
        return this.field3020.field5070;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(FFFFFFLea;II)V")
    public final void method372(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class113 arg6, int arg7, int arg8) {
        field3004++;
        class386 var10 = ((class116) arg6).field1629;
        if (this.field3013) {
            float var11 = (float) this.method370();
            float var12 = (float) this.method369();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field3007 * var15;
            float var18 = (float) this.field3007 * var16;
            float var19 = (float) this.field3017 * var13;
            float var20 = (float) this.field3017 * var14;
            float var21 = (float) this.field3009 * -var13;
            float var22 = (float) this.field3009 * -var14;
            float var23 = (float) this.field3005 * -var15;
            arg4 = arg4 + var19 + var23;
            arg0 = arg0 + var19 + var17;
            float var24 = (float) this.field3005 * -var16;
            arg1 = arg1 + var20 + var18;
            arg3 = arg3 + var22 + var18;
            arg2 = arg2 + var21 + var17;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field3020.method210(true, (byte) 100);
        float var26 = arg5 + arg3 - arg1;
        this.field3006.method2780(12057);
        this.field3006.method2771(this.field3020, -16785);
        this.field3006.method2739(1, 0);
        this.field3006.method2741((byte) -38, 1);
        this.field3006.method2771(var10, -16785);
        this.field3006.method2794(7681, 8448, true);
        this.field3006.method2781(34168, 0, 2479, 768);
        this.field3006.method2760(1, 120);
        float var27 = var10.field5069 / (float) var10.field5070;
        float var28 = var10.field5073 / (float) var10.field5071;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3020.field5073);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field5073 - ((arg1 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field5073 - (arg5 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field3020.field5069, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field5073 - (var26 - (float) arg8) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field3020.field5069, this.field3020.field5073);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field5073 - (arg3 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field3006.method2781(5890, 0, 2479, 768);
        this.field3006.method2739(0, 0);
        this.field3006.method2771(null, -16785);
        this.field3006.method2741((byte) -38, 0);
    }

    @OriginalMember(owner = "client!bl", name = "qa", descriptor = "()I")
    public final int method378() {
        field3011++;
        return this.field3020.field5071;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
    private final void method1479(int arg0) {
        this.field3006.method2741((byte) -38, 1);
        field3010++;
        this.field3006.method2771(null, -16785);
        this.field3006.method2794(8448, 8448, true);
        this.field3006.method2781(34168, 1, 2479, 768);
        this.field3006.method2775(770, 5890, 0, 127);
        this.field3006.method2741((byte) -38, 0);
        if (arg0 <= 70) {
            this.method369();
        }
        this.field3006.method2781(34168, 1, 2479, 768);
    }

    @OriginalMember(owner = "client!bl", name = "aa", descriptor = "(FFFFFFIII)V")
    public final void method371(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field3008++;
        if (this.field3013) {
            float var10 = (float) this.method370();
            float var11 = (float) this.method369();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field3007 * var14;
            float var17 = (float) this.field3007 * var15;
            float var18 = (float) this.field3017 * var12;
            float var19 = (float) this.field3017 * var13;
            float var20 = (float) this.field3009 * -var12;
            float var21 = (float) this.field3009 * -var13;
            float var22 = (float) this.field3005 * -var14;
            arg3 = arg3 + var21 + var17;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg4 = arg4 + var18 + var22;
            float var23 = (float) this.field3005 * -var15;
            arg2 = arg2 + var20 + var16;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        this.field3020.method210(true, (byte) -108);
        this.field3006.method2780(12057);
        this.field3006.method2771(this.field3020, -16785);
        this.field3006.method2760(arg8, 122);
        this.field3006.method2739(arg6, 0);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field3020.field5073);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field3020.field5069, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field3020.field5069, this.field3020.field5073);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lgk;IIII)V")
    public class233(class463 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3006 = arg0;
        this.field3020 = class424.method2509(-125, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lgk;II[III)V")
    public class233(class463 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3006 = arg0;
        this.field3020 = class276.method1699(arg3, arg1, -13, false, arg2, arg0);
    }

    static {
        new class169("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field3015 = false;
    }
}
