import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class733 extends class515 {

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    private int field10262 = 0;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Z")
    private boolean field10264 = false;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    private int field10274 = 0;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    private int field10275 = 0;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    private int field10273 = 0;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
    private int field10287 = 0;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lkw;")
    private class346 field10263;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "Lof;")
    private class9 field10276;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "Lgr;")
    public static class530 field10280 = new class530(36, 4);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field10261;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field10265;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field10266;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field10267;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field10268;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field10269;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field10270;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field10271;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field10272;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field10277;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field10278;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field10279;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public static int field10281;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public static int field10282;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field10283;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    public static int field10284;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
    public static int field10285;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "Lof;")
    private class9 field10286;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(FFFFFFIIII)V", line = 6)
    public final void method779(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field10261++;
        if (this.field10264) {
            float var11 = (float) this.method784();
            float var12 = (float) this.method780();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field10274 * var15;
            float var18 = (float) this.field10274 * var16;
            float var19 = (float) this.field10273 * var13;
            float var20 = (float) this.field10273 * var14;
            float var21 = (float) this.field10287 * -var13;
            float var22 = (float) this.field10287 * -var14;
            float var23 = (float) this.field10275 * -var15;
            arg4 = arg4 + var19 + var23;
            float var24 = (float) this.field10275 * -var16;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            arg2 = arg2 + var21 + var17;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field10276.method1131((byte) 42, (arg9 & 0x1) != 0);
        float var26 = arg5 + arg3 - arg1;
        this.field10263.method2172(121);
        this.field10263.method2164(6, this.field10276);
        this.field10263.method2138(27032, arg8);
        this.field10263.method2120(arg6, 15);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field10276.field72);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field10276.field71, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field10276.field71, this.field10276.field72);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "()I", line = 78)
    public final int method780() {
        field10279++;
        return this.field10276.field68 + this.field10274 + this.field10275;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lkw;IIZ)V", line = 725)
    public class733(class346 arg0, int arg1, int arg2, boolean arg3) {
        this.field10263 = arg0;
        this.field10276 = class757.method4204(arg3 ? 6408 : 6407, 25, arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lkw;IIII)V", line = 735)
    public class733(class346 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field10263 = arg0;
        this.field10276 = class137.method975(-15633, arg4, arg3, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lkw;II[III)V", line = 745)
    public class733(class346 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field10263 = arg0;
        this.field10276 = class262.method1736(arg1, arg5, 19180, arg2, arg4, arg3, arg0, false);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(IIII)V", line = 96)
    public final void method783(int arg0, int arg1, int arg2, int arg3) {
        this.field10275 = arg3;
        this.field10287 = arg2;
        this.field10273 = arg0;
        field10269++;
        this.field10274 = arg1;
        this.field10264 = this.field10273 != 0 || this.field10274 != 0 || this.field10287 != 0 || this.field10275 != 0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lcda;Lcda;I)V", line = 111)
    public static final void method4079(class113 arg0, class113 arg1, int arg2) {
        if (arg1.field1586 != null) {
            arg1.method814(48);
        }
        field10282++;
        arg1.field1586 = arg0.field1586;
        arg1.field1589 = arg0;
        arg1.field1586.field1589 = arg1;
        arg1.field1589.field1586 = arg1;
        if (arg2 != -1) {
            method4080(-85, -103, -104, 59, -99, -75, -58, 97, 80);
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "()I", line = 130)
    public final int method784() {
        field10278++;
        return this.field10276.field74 + this.field10273 + this.field10287;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIIII)V", line = 138)
    public static final void method4080(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class603.method3514(arg0, arg6, arg4, arg2, arg1, arg5, arg8, false, arg7, arg3);
        field10271++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIII)V", line = 146)
    public final void method807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field10276.method1677(arg5, arg1, arg3, arg0, 34037, arg4, arg2);
        field10265++;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(IIIIIII)V", line = 156)
    public final void method775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field10277++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field10276.method1131((byte) 42, false);
        this.field10263.method2172(104);
        this.field10263.method2164(6, this.field10276);
        this.field10263.method2138(27032, arg6);
        this.field10263.method2120(arg4, 55);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field10276.field69 && !this.field10264) {
            float var10 = (float) arg3 * this.field10276.field72 / (float) this.field10276.field68;
            float var11 = (float) arg2 * this.field10276.field71 / (float) this.field10276.field74;
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
        OpenGL.glTranslatef((float) this.field10273, (float) this.field10274, 0.0F);
        int var12 = this.method784();
        int var13 = this.method780();
        int var14 = this.field10276.field68 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field10276.field74 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field10276.field72);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field10276.field71, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field10276.field71, this.field10276.field72);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field10276.field71 / (float) this.field10276.field74;
                OpenGL.glTexCoord2f(0.0F, this.field10276.field72);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field10276.field72);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field10276.field68 + var15 - var9) * this.field10276.field72 / (float) this.field10276.field68;
            int var17 = this.field10276.field74 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field10276.field72);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field10276.field71, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field10276.field71, this.field10276.field72);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field10276.field71 / (float) this.field10276.field74;
                OpenGL.glTexCoord2f(0.0F, this.field10276.field72);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field10276.field72);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIII)V", line = 300)
    public final void method789(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field10276.method1131((byte) 42, false);
        field10281++;
        this.field10263.method2172(106);
        this.field10263.method2138(27032, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field10273 + arg0;
        int var7 = this.field10274 + arg1;
        if (this.field10286 == null) {
            this.field10263.method2164(6, this.field10276);
            this.field10263.method2120(arg2, 60);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field10276.field72);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field10276.field68 + var7);
            OpenGL.glTexCoord2f(this.field10276.field71, 0.0F);
            OpenGL.glVertex2i(this.field10276.field74 + var6, var7 - -this.field10276.field68);
            OpenGL.glTexCoord2f(this.field10276.field71, this.field10276.field72);
            OpenGL.glVertex2i(this.field10276.field74 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method4082(arg2, false);
        this.field10286.method1131((byte) 42, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field10276.field72);
        OpenGL.glTexCoord2f(0.0F, this.field10276.field72);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field10276.field68 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field10276.field71, 0.0F);
        OpenGL.glTexCoord2f(this.field10276.field71, 0.0F);
        OpenGL.glVertex2i(var6 + this.field10276.field74, var7 - -this.field10276.field68);
        OpenGL.glMultiTexCoord2f(33985, this.field10276.field71, this.field10276.field72);
        OpenGL.glTexCoord2f(this.field10276.field71, this.field10276.field72);
        OpenGL.glVertex2i(this.field10276.field74 + var6, var7);
        OpenGL.glEnd();
        this.method4081(-31352);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 351)
    private final void method4081(int arg0) {
        this.field10263.method2171(126, 1);
        if (arg0 != -31352) {
            this.method807(66, 66, -14, -33, -109, 32);
        }
        field10270++;
        this.field10263.method2164(6, null);
        this.field10263.method2149(-11771, 8448, 8448);
        this.field10263.method2167(34168, 768, 10603, 1);
        this.field10263.method2136(arg0 + 40312, 5890, 0, 770);
        this.field10263.method2171(109, 0);
        this.field10263.method2167(34168, 768, 10603, 1);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()I", line = 368)
    public final int method777() {
        field10266++;
        return this.field10276.field74;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)V", line = 377)
    private final void method4082(int arg0, boolean arg1) {
        field10267++;
        this.field10263.method2171(109, 1);
        this.field10263.method2164(6, this.field10276);
        this.field10263.method2149(-11771, 7681, this.field10263.method2152(arg0, -128));
        this.field10263.method2167(34167, 768, 10603, 1);
        this.field10263.method2136(8960, 34168, 0, 770);
        if (arg1) {
            this.method807(14, -25, 24, -106, 118, 52);
        }
        this.field10263.method2171(120, 0);
        this.field10263.method2164(6, this.field10286);
        this.field10263.method2149(-11771, 7681, 34479);
        this.field10263.method2167(34166, 768, 10603, 1);
        if (this.field10262 == 0) {
            this.field10263.method2140(-1, 0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field10262 == 1) {
            this.field10263.method2140(-1, 1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field10262 == 2) {
            this.field10263.method2140(-1, 0.5F, 1.0F, 0.5F, 0.0F);
            return;
        } else if (this.field10262 == 3) {
            this.field10263.method2140(-1, 128.5F, 128.5F, 128.5F, 0.0F);
            return;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 416)
    public final void method782(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class569 arg7, int arg8, int arg9) {
        field10285++;
        class9 var11 = ((class512) arg7).field7421;
        if (this.field10264) {
            float var12 = (float) this.method784();
            float var13 = (float) this.method780();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field10274 * var16;
            float var19 = (float) this.field10274 * var17;
            float var20 = (float) this.field10273 * var14;
            float var21 = (float) this.field10273 * var15;
            float var22 = (float) this.field10287 * -var14;
            float var23 = (float) this.field10287 * -var15;
            float var24 = (float) this.field10275 * -var16;
            arg3 = arg3 + var23 + var19;
            float var25 = (float) this.field10275 * -var17;
            arg1 = arg1 + var21 + var19;
            arg4 = arg4 + var20 + var24;
            arg2 = arg2 + var22 + var18;
            arg0 = arg0 + var20 + var18;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field10276.method1131((byte) 42, (arg6 & 0x1) != 0);
        float var27 = arg5 + arg3 - arg1;
        this.field10263.method2172(-21);
        this.field10263.method2164(6, this.field10276);
        this.field10263.method2120(1, 78);
        this.field10263.method2171(126, 1);
        this.field10263.method2164(6, var11);
        this.field10263.method2149(-11771, 8448, 7681);
        this.field10263.method2167(34168, 768, 10603, 0);
        this.field10263.method2138(27032, 1);
        float var28 = var11.field71 / (float) var11.field74;
        float var29 = var11.field72 / (float) var11.field68;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field10276.field72);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field72 - ((float) (-arg9) + arg1) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg4) * var28, var11.field72 - ((float) (-arg9) + arg5) * var29);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field10276.field71, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + var26) * var28, var11.field72 - ((var27 - (float) arg9) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field10276.field71, this.field10276.field72);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field72 - (((float) (-arg9) + arg3) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field10263.method2167(5890, 768, 10603, 0);
        this.field10263.method2120(0, 28);
        this.field10263.method2164(6, null);
        this.field10263.method2171(109, 0);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 511)
    public static void method4083(byte arg0) {
        if (arg0 >= -38) {
            method4080(42, 30, -76, -34, -4, -83, -106, 117, -39);
        }
        field10280 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIII)V", line = 526)
    public final void method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field10283++;
        this.field10276.method1131((byte) 42, (arg7 & 0x1) != 0);
        this.field10263.method2172(111);
        this.field10263.method2138(27032, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field10264) {
            float var9 = (float) arg2 / (float) this.method784();
            float var10 = (float) arg3 / (float) this.method780();
            float var11 = (float) this.field10273 * var9 + (float) arg0;
            float var12 = (float) this.field10274 * var10 + (float) arg1;
            float var13 = (float) this.field10276.field74 * var9 + var11;
            float var14 = (float) this.field10276.field68 * var10 + var12;
            if (this.field10286 == null) {
                this.field10263.method2164(6, this.field10276);
                this.field10263.method2120(arg4, 90);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field10276.field72);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field10276.field71, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field10276.field71, this.field10276.field72);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method4082(arg4, false);
                this.field10286.method1131((byte) 42, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field10276.field72);
                OpenGL.glTexCoord2f(0.0F, this.field10276.field72);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field10276.field71, 0.0F);
                OpenGL.glTexCoord2f(this.field10276.field71, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field10276.field71, this.field10276.field72);
                OpenGL.glTexCoord2f(this.field10276.field71, this.field10276.field72);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method4081(-31352);
            }
        } else if (this.field10286 == null) {
            this.field10263.method2164(6, this.field10276);
            this.field10263.method2120(arg4, 10);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field10276.field72);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field10276.field71, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field10276.field71, this.field10276.field72);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method4082(arg4, false);
            this.field10286.method1131((byte) 42, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field10276.field72);
            OpenGL.glTexCoord2f(0.0F, this.field10276.field72);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field10276.field71, 0.0F);
            OpenGL.glTexCoord2f(this.field10276.field71, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field10276.field71, this.field10276.field72);
            OpenGL.glTexCoord2f(this.field10276.field71, this.field10276.field72);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method4081(-31352);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILaa;II)V", line = 631)
    public final void method781(int arg0, int arg1, class569 arg2, int arg3, int arg4) {
        field10284++;
        class512 var6 = (class512) arg2;
        class9 var7 = var6.field7421;
        this.field10276.method1131((byte) 42, false);
        this.field10263.method2172(-89);
        this.field10263.method2164(6, this.field10276);
        this.field10263.method2120(1, 14);
        this.field10263.method2171(111, 1);
        this.field10263.method2164(6, var7);
        this.field10263.method2149(-11771, 8448, 7681);
        this.field10263.method2167(34168, 768, 10603, 0);
        this.field10263.method2138(27032, 1);
        int var8 = this.field10274 + arg1;
        int var9 = this.field10273 + arg0;
        int var10 = this.field10276.field74 + var9;
        int var11 = this.field10276.field68 + var8;
        float var12 = var7.field71 / (float) var7.field74;
        float var13 = var7.field72 / (float) var7.field68;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field72 - (float) (var8 - arg4) * var13;
        float var17 = var7.field72 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field10276.field72);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field10276.field68 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field10276.field71, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field10276.field74 + var9, var8 - -this.field10276.field68);
        OpenGL.glMultiTexCoord2f(33984, this.field10276.field71, this.field10276.field72);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field10276.field74 + var9, var8);
        OpenGL.glEnd();
        this.field10263.method2167(5890, 768, 10603, 0);
        this.field10263.method2120(0, 86);
        this.field10263.method2164(6, null);
        this.field10263.method2171(115, 0);
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "()I", line = 690)
    public final int method787() {
        field10268++;
        return this.field10276.field68;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)V", line = 703)
    public final void method808(int arg0, int arg1, int arg2) {
        field10272++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field10286 = class137.method975(-15633, this.field10276.field68, this.field10276.field74, this.field10263, arg0, arg1);
        this.field10262 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }
}
