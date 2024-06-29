import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class141 extends class468 {

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    private int field2265 = 0;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "I")
    private int field2278 = 0;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "Z")
    private boolean field2279 = false;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "I")
    private int field2276 = 0;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "I")
    private int field2283 = 0;

    @OriginalMember(owner = "client!as", name = "C", descriptor = "I")
    private int field2287 = 0;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "Lno;")
    private class658 field2266;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "Lmn;")
    public class340 field2277;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "Ldb;")
    public static class298 field2259 = new class298(13, -1);

    @OriginalMember(owner = "client!as", name = "d", descriptor = "[Z")
    public static boolean[] field2262 = new boolean[5];

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public static int field2267 = 0;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!as", name = "z", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!as", name = "A", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!as", name = "B", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "Lmn;")
    private class340 field2281;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2272;

    @OriginalMember(owner = "client!as", name = "KA", descriptor = "(IIIIIII)V", line = 6)
    public final void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2264++;
        this.field2277.method2163(-30033, true);
        this.field2266.method3614(-10553);
        this.field2266.method3646(-2, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2279) {
            float var8 = (float) arg2 / (float) this.method1025();
            float var9 = (float) arg3 / (float) this.method1030();
            float var10 = (float) this.field2287 * var8 + (float) arg0;
            float var11 = (float) this.field2265 * var9 + (float) arg1;
            float var12 = (float) this.field2277.field4693 * var8 + var10;
            float var13 = (float) this.field2277.field4698 * var9 + var11;
            if (this.field2281 == null) {
                this.field2266.method3630(this.field2277, -2);
                this.field2266.method3603((byte) -34, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field2277.field4701);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field2277.field4695, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field2277.field4695, this.field2277.field4701);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method1032(arg4, true);
                this.field2281.method2163(-30033, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2277.field4701);
                OpenGL.glTexCoord2f(0.0F, this.field2277.field4701);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field2277.field4695, 0.0F);
                OpenGL.glTexCoord2f(this.field2277.field4695, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field2277.field4695, this.field2277.field4701);
                OpenGL.glTexCoord2f(this.field2277.field4695, this.field2277.field4701);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method1033((byte) -121);
            }
        } else if (this.field2281 == null) {
            this.field2266.method3630(this.field2277, -2);
            this.field2266.method3603((byte) -34, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field2277.field4701);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field2277.field4695, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field2277.field4695, this.field2277.field4701);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1032(arg4, true);
            this.field2281.method2163(-30033, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2277.field4701);
            OpenGL.glTexCoord2f(0.0F, this.field2277.field4701);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field2277.field4695, 0.0F);
            OpenGL.glTexCoord2f(this.field2277.field4695, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field2277.field4695, this.field2277.field4701);
            OpenGL.glTexCoord2f(this.field2277.field4695, this.field2277.field4701);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1033((byte) -123);
        }
    }

    @OriginalMember(owner = "client!as", name = "AA", descriptor = "()I", line = 111)
    public final int method1025() {
        field2261++;
        return this.field2277.field4693 + this.field2283 + this.field2287;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 119)
    public final void method1026(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class217 arg6, int arg7, int arg8) {
        field2271++;
        class340 var10 = ((class311) arg6).field4283;
        if (this.field2279) {
            float var11 = (float) this.method1025();
            float var12 = (float) this.method1030();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field2265 * var15;
            float var18 = (float) this.field2265 * var16;
            float var19 = (float) this.field2287 * var13;
            float var20 = (float) this.field2287 * var14;
            float var21 = (float) this.field2283 * -var13;
            float var22 = (float) this.field2283 * -var14;
            float var23 = (float) this.field2278 * -var15;
            arg4 = arg4 + var19 + var23;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            arg2 = arg2 + var21 + var17;
            float var24 = (float) this.field2278 * -var16;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field2277.method2163(-30033, true);
        this.field2266.method3614(-10553);
        this.field2266.method3630(this.field2277, -2);
        this.field2266.method3603((byte) -34, 1);
        this.field2266.method3629((byte) 33, 1);
        this.field2266.method3630(var10, -2);
        this.field2266.method3644(8448, 23560, 7681);
        this.field2266.method3609((byte) 27, 768, 0, 34168);
        this.field2266.method3646(-2, 1);
        float var27 = var10.field4695 / (float) var10.field4693;
        float var28 = var10.field4701 / (float) var10.field4698;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field2277.field4701);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field4701 - ((arg1 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field4701 - (((float) (-arg8) + arg5) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field2277.field4695, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + var25) * var27, var10.field4701 - ((float) (-arg8) + var26) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field2277.field4695, this.field2277.field4701);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field4701 - ((float) (-arg8) + arg3) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field2266.method3609((byte) 27, 768, 0, 5890);
        this.field2266.method3603((byte) -34, 0);
        this.field2266.method3630(null, -2);
        this.field2266.method3629((byte) 28, 0);
    }

    @OriginalMember(owner = "client!as", name = "ba", descriptor = "(IIIIIII)V", line = 204)
    public final void method1027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2285++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field2277.method2163(-30033, false);
        this.field2266.method3614(-10553);
        this.field2266.method3630(this.field2277, -2);
        this.field2266.method3646(-2, arg6);
        this.field2266.method3603((byte) -34, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2277.field4694 && !this.field2279) {
            float var10 = (float) arg3 * this.field2277.field4701 / (float) this.field2277.field4698;
            float var11 = (float) arg2 * this.field2277.field4695 / (float) this.field2277.field4693;
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
        OpenGL.glTranslatef((float) this.field2287, (float) this.field2265, 0.0F);
        int var12 = this.method1025();
        int var13 = this.method1030();
        int var14 = arg1 + this.field2277.field4698;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = arg0 + this.field2277.field4693;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field2277.field4701);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field2277.field4695, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field2277.field4695, this.field2277.field4701);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field2277.field4695 / (float) this.field2277.field4693;
                OpenGL.glTexCoord2f(0.0F, this.field2277.field4701);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field2277.field4701);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (var15 + this.field2277.field4698 - var9) * this.field2277.field4701 / (float) this.field2277.field4698;
            int var17 = this.field2277.field4693 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field2277.field4701);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field2277.field4695, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field2277.field4695, this.field2277.field4701);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field2277.field4695 / (float) this.field2277.field4693;
                OpenGL.glTexCoord2f(0.0F, this.field2277.field4701);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field2277.field4701);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IILfa;II)V", line = 350)
    public final void method276(int arg0, int arg1, class217 arg2, int arg3, int arg4) {
        field2260++;
        class311 var6 = (class311) arg2;
        class340 var7 = var6.field4283;
        this.field2277.method2163(-30033, false);
        this.field2266.method3614(-10553);
        this.field2266.method3630(this.field2277, -2);
        this.field2266.method3603((byte) -34, 1);
        this.field2266.method3629((byte) 90, 1);
        this.field2266.method3630(var7, -2);
        this.field2266.method3644(8448, 23560, 7681);
        this.field2266.method3609((byte) 27, 768, 0, 34168);
        this.field2266.method3646(-2, 1);
        int var8 = this.field2265 + arg1;
        int var9 = this.field2287 + arg0;
        int var10 = this.field2277.field4693 + var9;
        int var11 = this.field2277.field4698 + var8;
        float var12 = var7.field4695 / (float) var7.field4693;
        float var13 = var7.field4701 / (float) var7.field4698;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field4701 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field4701 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field2277.field4701);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field2277.field4698 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field2277.field4695, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field2277.field4693 + var9, this.field2277.field4698 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field2277.field4695, this.field2277.field4701);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field2277.field4693 + var9, var8);
        OpenGL.glEnd();
        this.field2266.method3609((byte) 27, 768, 0, 5890);
        this.field2266.method3603((byte) -34, 0);
        this.field2266.method3630(null, -2);
        this.field2266.method3629((byte) 103, 0);
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "()I", line = 413)
    public final int method1028() {
        field2286++;
        return this.field2277.field4698;
    }

    @OriginalMember(owner = "client!as", name = "t", descriptor = "(III)V", line = 421)
    public final void method272(int arg0, int arg1, int arg2) {
        field2263++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field2281 = class426.method2435(this.field2277.field4698, arg1, this.field2277.field4693, this.field2266, arg0, (byte) 52);
        this.field2276 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!as", name = "EA", descriptor = "(IIII)V", line = 447)
    public final void method1029(int arg0, int arg1, int arg2, int arg3) {
        this.field2283 = arg2;
        this.field2287 = arg0;
        this.field2265 = arg1;
        this.field2278 = arg3;
        field2282++;
        this.field2279 = this.field2287 != 0 || this.field2265 != 0 || this.field2283 != 0 || this.field2278 != 0;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "()I", line = 459)
    public final int method1030() {
        field2274++;
        return this.field2277.field4698 + this.field2265 + this.field2278;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lno;IIZ)V", line = 718)
    public class141(class658 arg0, int arg1, int arg2, boolean arg3) {
        this.field2266 = arg0;
        this.field2277 = class505.method2801(arg0, arg1, 95, arg3 ? 6408 : 6407, arg2);
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lno;IIII)V", line = 728)
    public class141(class658 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2266 = arg0;
        this.field2277 = class426.method2435(arg4, arg2, arg3, arg0, arg1, (byte) 48);
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lno;II[III)V", line = 738)
    public class141(class658 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field2266 = arg0;
        this.field2277 = class371.method2188(arg2, arg1, false, (byte) 122, arg0, arg3);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V", line = 472)
    public static void method1031(int arg0) {
        int var1 = -48 % ((arg0 - 75) / 44);
        field2272 = null;
        field2262 = null;
        field2259 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IZ)V", line = 488)
    private final void method1032(int arg0, boolean arg1) {
        field2270++;
        this.field2266.method3629((byte) -116, 1);
        this.field2266.method3630(this.field2277, -2);
        this.field2266.method3644(7681, 23560, this.field2266.method3657(-86, arg0));
        this.field2266.method3609((byte) 27, 768, 1, 34167);
        this.field2266.method3672(770, 0, 34168, -6491);
        this.field2266.method3629((byte) 72, 0);
        this.field2266.method3630(this.field2281, -2);
        this.field2266.method3644(7681, 23560, 34479);
        if (!arg1) {
            this.field2278 = -74;
        }
        this.field2266.method3609((byte) 27, 768, 1, 34166);
        if (this.field2276 == 0) {
            this.field2266.method3685(0.0F, 0.5F, 1, 1.0F, 0.5F);
        } else if (this.field2276 == 1) {
            this.field2266.method3685(0.0F, 0.5F, 1, 0.5F, 1.0F);
        } else if (this.field2276 == 2) {
            this.field2266.method3685(0.0F, 1.0F, 1, 0.5F, 0.5F);
        } else if (this.field2276 == 3) {
            this.field2266.method3685(0.0F, 128.5F, 1, 128.5F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!as", name = "I", descriptor = "(IIIII)V", line = 526)
    public final void method271(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2280++;
        this.field2277.method2163(-30033, false);
        this.field2266.method3614(-10553);
        this.field2266.method3646(-2, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field2265 + arg1;
        int var7 = this.field2287 + arg0;
        if (this.field2281 == null) {
            this.field2266.method3630(this.field2277, -2);
            this.field2266.method3603((byte) -34, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field2277.field4701);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, var6 + this.field2277.field4698);
            OpenGL.glTexCoord2f(this.field2277.field4695, 0.0F);
            OpenGL.glVertex2i(this.field2277.field4693 + var7, this.field2277.field4698 + var6);
            OpenGL.glTexCoord2f(this.field2277.field4695, this.field2277.field4701);
            OpenGL.glVertex2i(var7 + this.field2277.field4693, var6);
            OpenGL.glEnd();
            return;
        }
        this.method1032(arg2, true);
        this.field2281.method2163(-30033, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2277.field4701);
        OpenGL.glTexCoord2f(0.0F, this.field2277.field4701);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field2277.field4698 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field2277.field4695, 0.0F);
        OpenGL.glTexCoord2f(this.field2277.field4695, 0.0F);
        OpenGL.glVertex2i(this.field2277.field4693 + var7, this.field2277.field4698 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field2277.field4695, this.field2277.field4701);
        OpenGL.glTexCoord2f(this.field2277.field4695, this.field2277.field4701);
        OpenGL.glVertex2i(this.field2277.field4693 + var7, var6);
        OpenGL.glEnd();
        this.method1033((byte) 109);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V", line = 584)
    private final void method1033(byte arg0) {
        field2275++;
        this.field2266.method3629((byte) -113, 1);
        int var2 = -32 % ((arg0 + 71) / 50);
        this.field2266.method3630(null, -2);
        this.field2266.method3644(8448, 23560, 8448);
        this.field2266.method3609((byte) 27, 768, 1, 34168);
        this.field2266.method3672(770, 0, 5890, -6491);
        this.field2266.method3629((byte) 82, 0);
        this.field2266.method3609((byte) 27, 768, 1, 34168);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BIIFFIFLfq;FFI)[B", line = 600)
    public static final byte[] method1034(byte arg0, int arg1, int arg2, float arg3, float arg4, int arg5, float arg6, class189 arg7, float arg8, float arg9, int arg10) {
        if (arg0 == 81) {
            field2268++;
            byte[] var11 = new byte[arg2 * arg10 * arg5];
            class26.method224(0, arg1, -2364, arg6, arg2, arg10, arg8, arg3, var11, arg4, arg5, arg7, arg9);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!as", name = "GA", descriptor = "(IIIIII)V", line = 614)
    public final void method273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2277.method1666(41, arg2, arg3, arg0, arg1, arg4, arg5);
        field2269++;
    }

    @OriginalMember(owner = "client!as", name = "QA", descriptor = "()I", line = 628)
    public final int method1035() {
        field2273++;
        return this.field2277.field4693;
    }

    @OriginalMember(owner = "client!as", name = "sa", descriptor = "(FFFFFFIII)V", line = 645)
    public final void method1036(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field2279) {
            float var10 = (float) this.method1025();
            float var11 = (float) this.method1030();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field2265 * var14;
            float var17 = (float) this.field2265 * var15;
            float var18 = (float) this.field2287 * var12;
            float var19 = (float) this.field2287 * var13;
            float var20 = (float) this.field2283 * -var12;
            float var21 = (float) this.field2283 * -var13;
            float var22 = (float) this.field2278 * -var14;
            float var23 = (float) this.field2278 * -var15;
            arg0 = arg0 + var18 + var16;
            arg4 = arg4 + var18 + var22;
            arg2 = arg2 + var20 + var16;
            arg1 = arg1 + var19 + var17;
            arg3 = arg3 + var21 + var17;
            arg5 = arg5 + var19 + var23;
        }
        field2284++;
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        this.field2277.method2163(-30033, true);
        this.field2266.method3614(-10553);
        this.field2266.method3630(this.field2277, -2);
        this.field2266.method3646(-2, arg8);
        this.field2266.method3603((byte) -34, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field2277.field4701);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field2277.field4695, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field2277.field4695, this.field2277.field4701);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }
}
