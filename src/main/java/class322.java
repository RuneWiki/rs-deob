import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class322 extends class363 {

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    private int field4876 = 0;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    private int field4883 = 0;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    private int field4888 = 0;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    private int field4884 = 0;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Z")
    private boolean field4875 = false;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    private int field4897 = 0;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "Ltt;")
    private class249 field4887;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "Lf;")
    private class412 field4899;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "Ljp;")
    public static class55 field4885 = new class55(3, -1);

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "[S")
    public static short[] field4895 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "[I")
    public static int[] field4901 = new int[256];

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "Lsk;")
    public static class339 field4882;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "Lnj;")
    public static class408 field4902;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "Lf;")
    private class412 field4891;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method401(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class340 arg6, int arg7, int arg8) {
        field4879++;
        class412 var10 = ((class415) arg6).field6106;
        if (this.field4875) {
            float var11 = (float) this.method394();
            float var12 = (float) this.method396();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field4876 * var15;
            float var18 = (float) this.field4876 * var16;
            float var19 = (float) this.field4888 * var13;
            float var20 = (float) this.field4888 * var14;
            float var21 = (float) this.field4897 * -var13;
            float var22 = (float) this.field4897 * -var14;
            float var23 = (float) this.field4883 * -var15;
            arg3 = arg3 + var22 + var18;
            arg1 = arg1 + var20 + var18;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            float var24 = (float) this.field4883 * -var16;
            arg0 = arg0 + var19 + var17;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field4899.method1210((byte) -81, true);
        float var26 = arg5 + arg3 - arg1;
        this.field4887.method1758((byte) -14);
        this.field4887.method1749(25752, this.field4899);
        this.field4887.method1734(-84, 1);
        this.field4887.method1756(1, -109);
        this.field4887.method1749(25752, var10);
        this.field4887.method1741(7681, (byte) 108, 8448);
        this.field4887.method1780(768, 34168, 34176, 0);
        this.field4887.method1732(1, 9);
        float var27 = var10.field6080 / (float) var10.field6076;
        float var28 = var10.field6075 / (float) var10.field6077;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4899.field6075);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field6075 - (((float) (-arg8) + arg1) * var28));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field6075 - ((arg5 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field4899.field6080, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + var25) * var27, var10.field6075 - ((var26 - (float) arg8) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field4899.field6080, this.field4899.field6075);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field6075 - ((arg3 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field4887.method1780(768, 5890, 34176, 0);
        this.field4887.method1734(-87, 0);
        this.field4887.method1749(25752, null);
        this.field4887.method1756(0, -81);
    }

    @OriginalMember(owner = "client!ul", name = "ya", descriptor = "(IIIIIII)V")
    public final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4886++;
        this.field4899.method1210((byte) -81, true);
        this.field4887.method1758((byte) 12);
        this.field4887.method1732(arg6, 9);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4875) {
            float var8 = (float) arg2 / (float) this.method394();
            float var9 = (float) arg3 / (float) this.method396();
            float var10 = (float) this.field4888 * var8 + (float) arg0;
            float var11 = (float) this.field4876 * var9 + (float) arg1;
            float var12 = (float) this.field4899.field6076 * var8 + var10;
            float var13 = (float) this.field4899.field6077 * var9 + var11;
            if (this.field4891 == null) {
                this.field4887.method1749(25752, this.field4899);
                this.field4887.method1734(-59, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field4899.field6075);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field4899.field6080, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field4899.field6080, this.field4899.field6075);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method2126(arg4, (byte) 71);
                this.field4891.method1210((byte) -81, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4899.field6075);
                OpenGL.glTexCoord2f(0.0F, this.field4899.field6075);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field4899.field6080, 0.0F);
                OpenGL.glTexCoord2f(this.field4899.field6080, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field4899.field6080, this.field4899.field6075);
                OpenGL.glTexCoord2f(this.field4899.field6080, this.field4899.field6075);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method2125(-114);
            }
        } else if (this.field4891 == null) {
            this.field4887.method1749(25752, this.field4899);
            this.field4887.method1734(-72, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4899.field6075);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field4899.field6080, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field4899.field6080, this.field4899.field6075);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2126(arg4, (byte) 71);
            this.field4891.method1210((byte) -81, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4899.field6075);
            OpenGL.glTexCoord2f(0.0F, this.field4899.field6075);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4899.field6080, 0.0F);
            OpenGL.glTexCoord2f(this.field4899.field6080, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4899.field6080, this.field4899.field6075);
            OpenGL.glTexCoord2f(this.field4899.field6080, this.field4899.field6075);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2125(-120);
        }
    }

    @OriginalMember(owner = "client!ul", name = "ZA", descriptor = "()I")
    public final int method399() {
        field4889++;
        return this.field4899.field6077;
    }

    @OriginalMember(owner = "client!ul", name = "YA", descriptor = "()I")
    public final int method398() {
        field4892++;
        return this.field4899.field6076;
    }

    @OriginalMember(owner = "client!ul", name = "RA", descriptor = "()I")
    public final int method394() {
        field4880++;
        return this.field4899.field6076 + this.field4897 + this.field4888;
    }

    @OriginalMember(owner = "client!ul", name = "W", descriptor = "(IIIII)V")
    public final void method392(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4890++;
        this.field4899.method1210((byte) -81, false);
        this.field4887.method1758((byte) -46);
        this.field4887.method1732(arg4, 9);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field4888 + arg0;
        int var7 = this.field4876 + arg1;
        if (this.field4891 == null) {
            this.field4887.method1749(25752, this.field4899);
            this.field4887.method1734(-59, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4899.field6075);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field4899.field6077 + var7);
            OpenGL.glTexCoord2f(this.field4899.field6080, 0.0F);
            OpenGL.glVertex2i(this.field4899.field6076 + var6, this.field4899.field6077 + var7);
            OpenGL.glTexCoord2f(this.field4899.field6080, this.field4899.field6075);
            OpenGL.glVertex2i(var6 + this.field4899.field6076, var7);
            OpenGL.glEnd();
            return;
        }
        this.method2126(arg2, (byte) 71);
        this.field4891.method1210((byte) -81, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4899.field6075);
        OpenGL.glTexCoord2f(0.0F, this.field4899.field6075);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field4899.field6077 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field4899.field6080, 0.0F);
        OpenGL.glTexCoord2f(this.field4899.field6080, 0.0F);
        OpenGL.glVertex2i(this.field4899.field6076 + var6, this.field4899.field6077 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field4899.field6080, this.field4899.field6075);
        OpenGL.glTexCoord2f(this.field4899.field6080, this.field4899.field6075);
        OpenGL.glVertex2i(var6 + this.field4899.field6076, var7);
        OpenGL.glEnd();
        this.method2125(-87);
    }

    @OriginalMember(owner = "client!ul", name = "XA", descriptor = "(IIIIII)V")
    public final void method1213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4881++;
        this.field4899.method440(arg0, 0, arg2, arg5, arg1, arg4, arg3);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public static void method2124(int arg0) {
        field4895 = null;
        field4885 = null;
        if (arg0 != 33985) {
            method2124(-54);
        }
        field4902 = null;
        field4882 = null;
        field4901 = null;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
    private final void method2125(int arg0) {
        if (arg0 >= -77) {
            method2124(-54);
        }
        field4873++;
        this.field4887.method1756(1, 107);
        this.field4887.method1749(25752, null);
        this.field4887.method1741(8448, (byte) 105, 8448);
        this.field4887.method1780(768, 34168, 34176, 1);
        this.field4887.method1778(5890, 770, 1, 0);
        this.field4887.method1756(0, -14);
        this.field4887.method1780(768, 34168, 34176, 1);
    }

    @OriginalMember(owner = "client!ul", name = "oa", descriptor = "(III)V")
    public final void method1214(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field4896++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field4891 = class507.method3020(arg0, this.field4899.field6077, 34037, this.field4899.field6076, arg1, this.field4887);
        this.field4884 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "(FFFFFFIII)V")
    public final void method402(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field4875) {
            float var10 = (float) this.method394();
            float var11 = (float) this.method396();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field4876 * var14;
            float var17 = (float) this.field4876 * var15;
            float var18 = (float) this.field4888 * var12;
            float var19 = (float) this.field4888 * var13;
            float var20 = (float) this.field4897 * -var12;
            float var21 = (float) this.field4897 * -var13;
            float var22 = (float) this.field4883 * -var14;
            arg4 = arg4 + var18 + var22;
            arg1 = arg1 + var19 + var17;
            arg3 = arg3 + var21 + var17;
            arg2 = arg2 + var20 + var16;
            arg0 = arg0 + var18 + var16;
            float var23 = (float) this.field4883 * -var15;
            arg5 = arg5 + var19 + var23;
        }
        field4878++;
        float var24 = arg2 + arg4 - arg0;
        this.field4899.method1210((byte) -81, true);
        float var25 = arg5 + arg3 - arg1;
        this.field4887.method1758((byte) -52);
        this.field4887.method1749(25752, this.field4899);
        this.field4887.method1732(arg8, 9);
        this.field4887.method1734(-75, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field4899.field6075);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field4899.field6080, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field4899.field6080, this.field4899.field6075);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ul", name = "ha", descriptor = "(IIII)V")
    public final void method400(int arg0, int arg1, int arg2, int arg3) {
        this.field4876 = arg1;
        this.field4883 = arg3;
        field4877++;
        this.field4897 = arg2;
        this.field4888 = arg0;
        this.field4875 = this.field4888 != 0 || this.field4876 != 0 || this.field4897 != 0 || this.field4883 != 0;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)V")
    private final void method2126(int arg0, byte arg1) {
        this.field4887.method1756(1, -24);
        field4874++;
        this.field4887.method1749(25752, this.field4899);
        this.field4887.method1741(this.field4887.method1736(arg0, -92), (byte) -108, 7681);
        this.field4887.method1780(768, 34167, 34176, 1);
        this.field4887.method1778(34168, 770, arg1 ^ 0x46, 0);
        this.field4887.method1756(0, 99);
        this.field4887.method1749(25752, this.field4891);
        this.field4887.method1741(34479, (byte) -27, 7681);
        this.field4887.method1780(768, 34166, 34176, 1);
        if (this.field4884 == 0) {
            this.field4887.method1709(0.5F, (byte) -16, 1.0F, 0.0F, 0.5F);
        } else if (this.field4884 == 1) {
            this.field4887.method1709(0.5F, (byte) 113, 0.5F, 0.0F, 1.0F);
        } else if (this.field4884 == 2) {
            this.field4887.method1709(1.0F, (byte) -66, 0.5F, 0.0F, 0.5F);
        } else if (this.field4884 == 3) {
            this.field4887.method1709(128.5F, (byte) -73, 128.5F, 0.0F, 128.5F);
        }
        if (arg1 != 71) {
            this.method401(0.38915235F, 0.22617805F, -0.23446749F, -0.28708598F, -0.84047294F, -0.19237232F, null, -63, -45);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILta;II)V")
    public final void method397(int arg0, int arg1, class340 arg2, int arg3, int arg4) {
        field4900++;
        class415 var6 = (class415) arg2;
        class412 var7 = var6.field6106;
        this.field4899.method1210((byte) -81, false);
        this.field4887.method1758((byte) -23);
        this.field4887.method1749(25752, this.field4899);
        this.field4887.method1734(-24, 1);
        this.field4887.method1756(1, 100);
        this.field4887.method1749(25752, var7);
        this.field4887.method1741(7681, (byte) 111, 8448);
        this.field4887.method1780(768, 34168, 34176, 0);
        this.field4887.method1732(1, 9);
        int var8 = this.field4876 + arg1;
        int var9 = this.field4888 + arg0;
        int var10 = var9 + this.field4899.field6076;
        int var11 = this.field4899.field6077 + var8;
        float var12 = var7.field6080 / (float) var7.field6076;
        float var13 = var7.field6075 / (float) var7.field6077;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field6075 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field6075 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4899.field6075);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field4899.field6077 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field4899.field6080, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var9 + this.field4899.field6076, this.field4899.field6077 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field4899.field6080, this.field4899.field6075);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field4899.field6076 + var9, var8);
        OpenGL.glEnd();
        this.field4887.method1780(768, 5890, 34176, 0);
        this.field4887.method1734(-101, 0);
        this.field4887.method1749(25752, null);
        this.field4887.method1756(0, -78);
    }

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "()I")
    public final int method396() {
        field4893++;
        return this.field4899.field6077 + this.field4876 + this.field4883;
    }

    @OriginalMember(owner = "client!ul", name = "la", descriptor = "(IIIIIII)V")
    public final void method389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4898++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field4899.method1210((byte) -81, false);
        this.field4887.method1758((byte) -57);
        this.field4887.method1749(25752, this.field4899);
        this.field4887.method1732(arg6, 9);
        this.field4887.method1734(-47, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4899.field6086 && !this.field4875) {
            float var10 = (float) arg3 * this.field4899.field6075 / (float) this.field4899.field6077;
            float var11 = (float) arg2 * this.field4899.field6080 / (float) this.field4899.field6076;
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
        OpenGL.glTranslatef((float) this.field4888, (float) this.field4876, 0.0F);
        int var12 = this.method394();
        int var13 = this.method396();
        int var14 = arg1 + this.field4899.field6077;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field4899.field6076 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field4899.field6075);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field4899.field6080, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field4899.field6080, this.field4899.field6075);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field4899.field6080 / (float) this.field4899.field6076;
                OpenGL.glTexCoord2f(0.0F, this.field4899.field6075);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field4899.field6075);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field4899.field6077 + var15 - var9) * this.field4899.field6075 / (float) this.field4899.field6077;
            int var17 = this.field4899.field6076 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field4899.field6075);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field4899.field6080, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field4899.field6080, this.field4899.field6075);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field4899.field6080 / (float) this.field4899.field6076;
                OpenGL.glTexCoord2f(0.0F, this.field4899.field6075);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field4899.field6075);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Ltt;IIII)V")
    public class322(class249 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4887 = arg0;
        this.field4899 = class507.method3020(arg1, arg4, 34037, arg3, arg2, arg0);
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Ltt;II[III)V")
    public class322(class249 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field4887 = arg0;
        this.field4899 = class98.method813(arg1, (byte) -61, arg0, arg2, arg3, false);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4901[var0] = var1;
        }
    }
}
