import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class186 extends class461 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    private int field2735 = 0;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    private int field2760 = 0;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    private int field2762 = 0;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Z")
    private boolean field2748 = false;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    private int field2756 = 0;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "I")
    private int field2767 = 0;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Len;")
    private class289 field2737;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lan;")
    private class22 field2736;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "[I")
    public static int[] field2743 = new int[13];

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field2754 = 0;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "[[B")
    public static byte[][] field2763 = new byte[50][];

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lrg;")
    public static class588 field2740 = new class588(1);

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lan;")
    private class22 field2738;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "Lvfa;")
    public static class616 field2755;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Ljava/lang/Object;")
    public static Object field2752;

    @OriginalMember(owner = "client!oc", name = "ba", descriptor = "(IIIIIII)V")
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2759++;
        int var8 = arg0 + arg2;
        this.field2736.method3288(0, false);
        int var9 = arg1 + arg3;
        this.field2737.method1808(-58);
        this.field2737.method1804(false, this.field2736);
        this.field2737.method1768(arg6, -99);
        this.field2737.method1801(arg4, 34166);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2736.field304 && !this.field2748) {
            float var10 = (float) arg3 * this.field2736.field300 / (float) this.field2736.field301;
            float var11 = (float) arg2 * this.field2736.field299 / (float) this.field2736.field302;
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
        OpenGL.glTranslatef((float) this.field2756, (float) this.field2735, 0.0F);
        int var12 = this.method33();
        int var13 = this.method29();
        int var14 = this.field2736.field301 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = arg0 + this.field2736.field302;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field2736.field300);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field2736.field299, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field2736.field299, this.field2736.field300);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field2736.field299 / (float) this.field2736.field302;
                OpenGL.glTexCoord2f(0.0F, this.field2736.field300);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field2736.field300);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field2736.field301 + var15 - var9) * this.field2736.field300 / (float) this.field2736.field301;
            int var17 = this.field2736.field302 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field2736.field300);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field2736.field299, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field2736.field299, this.field2736.field300);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field2736.field299 / (float) this.field2736.field302;
                OpenGL.glTexCoord2f(0.0F, this.field2736.field300);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field2736.field300);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)Z")
    public static final boolean method1243(int arg0, int arg1, int arg2) {
        field2757++;
        if (arg0 != 1) {
            field2755 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!oc", name = "AA", descriptor = "()I")
    public final int method33() {
        field2747++;
        return this.field2736.field302 - (-this.field2762 - this.field2756);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILfa;II)V")
    public final void method23(int arg0, int arg1, class212 arg2, int arg3, int arg4) {
        field2766++;
        class438 var6 = (class438) arg2;
        class22 var7 = var6.field6173;
        this.field2736.method3288(0, false);
        this.field2737.method1808(-67);
        this.field2737.method1804(false, this.field2736);
        this.field2737.method1801(1, 34166);
        this.field2737.method1747(1, (byte) 108);
        this.field2737.method1804(false, var7);
        this.field2737.method1798(false, 8448, 7681);
        this.field2737.method1797(0, (byte) 83, 768, 34168);
        this.field2737.method1768(1, -61);
        int var8 = this.field2756 + arg0;
        int var9 = this.field2735 + arg1;
        int var10 = var8 + this.field2736.field302;
        int var11 = this.field2736.field301 + var9;
        float var12 = var7.field299 / (float) var7.field302;
        float var13 = var7.field300 / (float) var7.field301;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field300 - ((float) (var9 - arg4) * var13);
        float var17 = var7.field300 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field2736.field300);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, var9 + this.field2736.field301);
        OpenGL.glMultiTexCoord2f(33984, this.field2736.field299, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var8 + this.field2736.field302, var9 - -this.field2736.field301);
        OpenGL.glMultiTexCoord2f(33984, this.field2736.field299, this.field2736.field300);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var8 + this.field2736.field302, var9);
        OpenGL.glEnd();
        this.field2737.method1797(0, (byte) 38, 768, 5890);
        this.field2737.method1801(0, 34166);
        this.field2737.method1804(false, null);
        this.field2737.method1747(0, (byte) 108);
    }

    @OriginalMember(owner = "client!oc", name = "sa", descriptor = "(FFFFFFIII)V")
    public final void method24(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field2748) {
            float var10 = (float) this.method33();
            float var11 = (float) this.method29();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field2735 * var14;
            float var17 = (float) this.field2735 * var15;
            float var18 = (float) this.field2756 * var12;
            float var19 = (float) this.field2756 * var13;
            float var20 = (float) this.field2762 * -var12;
            float var21 = (float) this.field2762 * -var13;
            float var22 = (float) this.field2767 * -var14;
            arg4 = arg4 + var18 + var22;
            arg1 = arg1 + var19 + var17;
            arg0 = arg0 + var18 + var16;
            float var23 = (float) this.field2767 * -var15;
            arg3 = arg3 + var21 + var17;
            arg2 = arg2 + var20 + var16;
            arg5 = arg5 + var19 + var23;
        }
        field2765++;
        float var24 = arg2 + arg4 - arg0;
        this.field2736.method3288(0, true);
        float var25 = arg5 + arg3 - arg1;
        this.field2737.method1808(-125);
        this.field2737.method1804(false, this.field2736);
        this.field2737.method1768(arg8, -42);
        this.field2737.method1801(arg6, 34166);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field2736.field300);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field2736.field299, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field2736.field299, this.field2736.field300);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "(IIIII)V")
    public final void method30(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2736.method3288(0, false);
        field2751++;
        this.field2737.method1808(-66);
        this.field2737.method1768(arg4, -37);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field2756 + arg0;
        int var7 = this.field2735 + arg1;
        if (this.field2738 == null) {
            this.field2737.method1804(false, this.field2736);
            this.field2737.method1801(arg2, 34166);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field2736.field300);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field2736.field301 + var7);
            OpenGL.glTexCoord2f(this.field2736.field299, 0.0F);
            OpenGL.glVertex2i(this.field2736.field302 + var6, this.field2736.field301 + var7);
            OpenGL.glTexCoord2f(this.field2736.field299, this.field2736.field300);
            OpenGL.glVertex2i(this.field2736.field302 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method1246(arg2, -2686);
        this.field2738.method3288(0, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2736.field300);
        OpenGL.glTexCoord2f(0.0F, this.field2736.field300);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field2736.field301 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field2736.field299, 0.0F);
        OpenGL.glTexCoord2f(this.field2736.field299, 0.0F);
        OpenGL.glVertex2i(var6 + this.field2736.field302, var7 - -this.field2736.field301);
        OpenGL.glMultiTexCoord2f(33985, this.field2736.field299, this.field2736.field300);
        OpenGL.glTexCoord2f(this.field2736.field299, this.field2736.field300);
        OpenGL.glVertex2i(this.field2736.field302 + var6, var7);
        OpenGL.glEnd();
        this.method1244(false);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()I")
    public final int method29() {
        field2750++;
        return this.field2736.field301 + this.field2735 + this.field2767;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    private final void method1244(boolean arg0) {
        field2758++;
        this.field2737.method1747(1, (byte) 108);
        this.field2737.method1804(arg0, null);
        this.field2737.method1798(false, 8448, 8448);
        this.field2737.method1797(1, (byte) 29, 768, 34168);
        this.field2737.method1811(770, 0, false, 5890);
        this.field2737.method1747(0, (byte) 108);
        this.field2737.method1797(1, (byte) 57, 768, 34168);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method22(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class212 arg6, int arg7, int arg8) {
        field2745++;
        class22 var10 = ((class438) arg6).field6173;
        if (this.field2748) {
            float var11 = (float) this.method33();
            float var12 = (float) this.method29();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field2735 * var15;
            float var18 = (float) this.field2735 * var16;
            float var19 = (float) this.field2756 * var13;
            float var20 = (float) this.field2756 * var14;
            float var21 = (float) this.field2762 * -var13;
            float var22 = (float) this.field2762 * -var14;
            float var23 = (float) this.field2767 * -var15;
            float var24 = (float) this.field2767 * -var16;
            arg1 = arg1 + var20 + var18;
            arg0 = arg0 + var19 + var17;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field2736.method3288(0, true);
        this.field2737.method1808(-69);
        this.field2737.method1804(false, this.field2736);
        this.field2737.method1801(1, 34166);
        this.field2737.method1747(1, (byte) 108);
        this.field2737.method1804(false, var10);
        this.field2737.method1798(false, 8448, 7681);
        this.field2737.method1797(0, (byte) 36, 768, 34168);
        this.field2737.method1768(1, -49);
        float var27 = var10.field299 / (float) var10.field302;
        float var28 = var10.field300 / (float) var10.field301;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field2736.field300);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg0) * var27, var10.field300 - ((float) (-arg8) + arg1) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field300 - (arg5 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field2736.field299, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field300 - (var26 - (float) arg8) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field2736.field299, this.field2736.field300);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field300 - (arg3 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field2737.method1797(0, (byte) 112, 768, 5890);
        this.field2737.method1801(0, 34166);
        this.field2737.method1804(false, null);
        this.field2737.method1747(0, (byte) 108);
    }

    @OriginalMember(owner = "client!oc", name = "EA", descriptor = "(IIII)V")
    public final void method34(int arg0, int arg1, int arg2, int arg3) {
        field2741++;
        this.field2756 = arg0;
        this.field2767 = arg3;
        this.field2735 = arg1;
        this.field2762 = arg2;
        this.field2748 = this.field2756 != 0 || this.field2735 != 0 || this.field2762 != 0 || this.field2767 != 0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method1245(int arg0) {
        if (arg0 != 1) {
            method1243(55, 55, 17);
        }
        field2755 = null;
        field2752 = null;
        field2740 = null;
        field2763 = null;
        field2743 = null;
    }

    @OriginalMember(owner = "client!oc", name = "GA", descriptor = "(IIIIII)V")
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2736.method3602(arg5, arg3, arg4, arg2, -1, arg0, arg1);
        field2739++;
    }

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "(III)V")
    public final void method182(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field2744++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field2738 = class686.method3776(this.field2737, this.field2736.field302, arg0, this.field2736.field301, -125, arg1);
        this.field2760 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()I")
    public final int method26() {
        field2768++;
        return this.field2736.field301;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)V")
    private final void method1246(int arg0, int arg1) {
        field2753++;
        this.field2737.method1747(1, (byte) 108);
        this.field2737.method1804(false, this.field2736);
        this.field2737.method1798(false, 7681, this.field2737.method1762(arg1 + 2738, arg0));
        this.field2737.method1797(1, (byte) 44, 768, 34167);
        this.field2737.method1811(770, 0, false, 34168);
        this.field2737.method1747(0, (byte) 108);
        if (arg1 != -2686) {
            this.field2762 = -64;
        }
        this.field2737.method1804(false, this.field2738);
        this.field2737.method1798(false, 7681, 34479);
        this.field2737.method1797(1, (byte) 28, 768, 34166);
        if (this.field2760 == 0) {
            this.field2737.method1812(1.0F, 0.5F, 0.5F, (byte) -79, 0.0F);
        } else if (this.field2760 == 1) {
            this.field2737.method1812(0.5F, 1.0F, 0.5F, (byte) -48, 0.0F);
        } else if (this.field2760 == 2) {
            this.field2737.method1812(0.5F, 0.5F, 1.0F, (byte) -79, 0.0F);
        } else if (this.field2760 == 3) {
            this.field2737.method1812(128.5F, 128.5F, 128.5F, (byte) -121, 0.0F);
            return;
        }
    }

    @OriginalMember(owner = "client!oc", name = "QA", descriptor = "()I")
    public final int method31() {
        field2764++;
        return this.field2736.field302;
    }

    @OriginalMember(owner = "client!oc", name = "KA", descriptor = "(IIIIIII)V")
    public final void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2746++;
        this.field2736.method3288(0, true);
        this.field2737.method1808(-48);
        this.field2737.method1768(arg6, -114);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2748) {
            float var8 = (float) arg2 / (float) this.method33();
            float var9 = (float) arg3 / (float) this.method29();
            float var10 = (float) this.field2756 * var8 + (float) arg0;
            float var11 = (float) this.field2735 * var9 + (float) arg1;
            float var12 = (float) this.field2736.field302 * var8 + var10;
            float var13 = (float) this.field2736.field301 * var9 + var11;
            if (this.field2738 == null) {
                this.field2737.method1804(false, this.field2736);
                this.field2737.method1801(arg4, 34166);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field2736.field300);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field2736.field299, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field2736.field299, this.field2736.field300);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method1246(arg4, -2686);
                this.field2738.method3288(0, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2736.field300);
                OpenGL.glTexCoord2f(0.0F, this.field2736.field300);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field2736.field299, 0.0F);
                OpenGL.glTexCoord2f(this.field2736.field299, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field2736.field299, this.field2736.field300);
                OpenGL.glTexCoord2f(this.field2736.field299, this.field2736.field300);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method1244(false);
            }
        } else if (this.field2738 == null) {
            this.field2737.method1804(false, this.field2736);
            this.field2737.method1801(arg4, 34166);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field2736.field300);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field2736.field299, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field2736.field299, this.field2736.field300);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1246(arg4, -2686);
            this.field2738.method3288(0, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2736.field300);
            OpenGL.glTexCoord2f(0.0F, this.field2736.field300);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field2736.field299, 0.0F);
            OpenGL.glTexCoord2f(this.field2736.field299, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field2736.field299, this.field2736.field300);
            OpenGL.glTexCoord2f(this.field2736.field299, this.field2736.field300);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1244(false);
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Len;IIII)V")
    public class186(class289 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2737 = arg0;
        this.field2736 = class686.method3776(arg0, arg3, arg1, arg4, -75, arg2);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Len;II[III)V")
    public class186(class289 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field2737 = arg0;
        this.field2736 = class272.method1636(arg2, arg3, arg0, arg1, false, (byte) 109);
    }
}
