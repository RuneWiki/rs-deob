import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class270 extends class529 {

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    private int field3884 = 0;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Z")
    private boolean field3888 = false;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    private int field3900 = 0;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    private int field3903 = 0;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    private int field3894 = 0;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    private int field3904 = 0;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "Lvj;")
    private class303 field3907;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lmk;")
    private class39 field3886;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Liv;")
    public static class64 field3902 = new class64(88, 10);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Lmk;")
    private class39 field3899;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "(IIIIIII)V", line = 3)
    public final void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3906++;
        int var8 = arg0 + arg2;
        this.field3886.method2929((byte) -49, false);
        int var9 = arg1 + arg3;
        this.field3907.method1930((byte) 113);
        this.field3907.method1990(this.field3886, 11864);
        this.field3907.method1934(arg6, true);
        this.field3907.method1989(-24145, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3886.field719 && !this.field3888) {
            float var10 = (float) arg3 * this.field3886.field722 / (float) this.field3886.field720;
            float var11 = (float) arg2 * this.field3886.field718 / (float) this.field3886.field723;
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
        OpenGL.glTranslatef((float) this.field3900, (float) this.field3884, 0.0F);
        int var12 = this.method100();
        int var13 = this.method104();
        int var14 = this.field3886.field720 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = arg0 + this.field3886.field723;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field3886.field722);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field3886.field718, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field3886.field718, this.field3886.field722);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field3886.field718 / (float) this.field3886.field723;
                OpenGL.glTexCoord2f(0.0F, this.field3886.field722);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field3886.field722);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field3886.field720 + var15 - var9) * this.field3886.field722 / (float) this.field3886.field720;
            int var17 = arg0 + this.field3886.field723;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field3886.field722);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field3886.field718, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field3886.field718, this.field3886.field722);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field3886.field718 / (float) this.field3886.field723;
                OpenGL.glTexCoord2f(0.0F, this.field3886.field722);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field3886.field722);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "(III)V", line = 141)
    public final void method94(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field3883++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field3899 = class137.method1016(this.field3886.field720, arg1, this.field3886.field723, arg0, (byte) -62, this.field3907);
        this.field3904 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 165)
    private final void method1742(int arg0) {
        field3892++;
        this.field3907.method1929(1, (byte) 72);
        this.field3907.method1990(null, 11864);
        this.field3907.method1951((byte) 116, 8448, 8448);
        this.field3907.method1921(768, 34168, (byte) -102, 1);
        if (arg0 != 18553) {
            this.method104();
        }
        this.field3907.method1952(770, 5890, 122, 0);
        this.field3907.method1929(0, (byte) 96);
        this.field3907.method1921(768, 34168, (byte) 109, 1);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 186)
    public static void method1743(byte arg0) {
        field3902 = null;
        if (arg0 != -58) {
            method1746(null, false);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V", line = 196)
    public static final void method1744(byte arg0) {
        field3905++;
        if (arg0 > -81) {
            field3902 = null;
        }
        if (class212.field3040) {
            return;
        }
        if (class443.field6623.field601) {
            class455.field6790 = ((int) class455.field6790 + 47 & 0xFFFFFFF0);
        } else {
            class168.field2614 += (12.0F - class168.field2614) / 2.0F;
        }
        class157.field2461 = true;
        class212.field3040 = true;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lvj;IIII)V", line = 788)
    public class270(class303 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3907 = arg0;
        this.field3886 = class137.method1016(arg4, arg2, arg3, arg1, (byte) -62, arg0);
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lvj;II[III)V", line = 798)
    public class270(class303 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3907 = arg0;
        this.field3886 = class245.method1595(arg2, arg0, arg1, false, arg3, 0);
    }

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "(IIIIIII)V", line = 223)
    public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3882++;
        this.field3886.method2929((byte) -87, true);
        this.field3907.method1930((byte) 123);
        this.field3907.method1934(arg6, true);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3888) {
            float var8 = (float) arg2 / (float) this.method100();
            float var9 = (float) arg3 / (float) this.method104();
            float var10 = (float) this.field3900 * var8 + (float) arg0;
            float var11 = (float) this.field3884 * var9 + (float) arg1;
            float var12 = (float) this.field3886.field723 * var8 + var10;
            float var13 = (float) this.field3886.field720 * var9 + var11;
            if (this.field3899 == null) {
                this.field3907.method1990(this.field3886, 11864);
                this.field3907.method1989(-24145, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field3886.field722);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field3886.field718, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field3886.field718, this.field3886.field722);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method1745((byte) -74, arg4);
                this.field3899.method2929((byte) -55, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3886.field722);
                OpenGL.glTexCoord2f(0.0F, this.field3886.field722);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field3886.field718, 0.0F);
                OpenGL.glTexCoord2f(this.field3886.field718, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field3886.field718, this.field3886.field722);
                OpenGL.glTexCoord2f(this.field3886.field718, this.field3886.field722);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method1742(18553);
            }
        } else if (this.field3899 == null) {
            this.field3907.method1990(this.field3886, 11864);
            this.field3907.method1989(-24145, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3886.field722);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3886.field718, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3886.field718, this.field3886.field722);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1745((byte) -74, arg4);
            this.field3899.method2929((byte) -103, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3886.field722);
            OpenGL.glTexCoord2f(0.0F, this.field3886.field722);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3886.field718, 0.0F);
            OpenGL.glTexCoord2f(this.field3886.field718, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3886.field718, this.field3886.field722);
            OpenGL.glTexCoord2f(this.field3886.field718, this.field3886.field722);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1742(18553);
        }
    }

    @OriginalMember(owner = "client!hf", name = "YA", descriptor = "(IIIII)V", line = 327)
    public final void method102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3886.method2929((byte) -104, false);
        field3901++;
        this.field3907.method1930((byte) 124);
        this.field3907.method1934(arg4, true);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field3900 + arg0;
        int var7 = this.field3884 + arg1;
        if (this.field3899 == null) {
            this.field3907.method1990(this.field3886, 11864);
            this.field3907.method1989(-24145, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3886.field722);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, var7 + this.field3886.field720);
            OpenGL.glTexCoord2f(this.field3886.field718, 0.0F);
            OpenGL.glVertex2i(var6 + this.field3886.field723, this.field3886.field720 + var7);
            OpenGL.glTexCoord2f(this.field3886.field718, this.field3886.field722);
            OpenGL.glVertex2i(this.field3886.field723 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method1745((byte) -74, arg2);
        this.field3899.method2929((byte) -112, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3886.field722);
        OpenGL.glTexCoord2f(0.0F, this.field3886.field722);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, var7 + this.field3886.field720);
        OpenGL.glMultiTexCoord2f(33985, this.field3886.field718, 0.0F);
        OpenGL.glTexCoord2f(this.field3886.field718, 0.0F);
        OpenGL.glVertex2i(this.field3886.field723 + var6, this.field3886.field720 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field3886.field718, this.field3886.field722);
        OpenGL.glTexCoord2f(this.field3886.field718, this.field3886.field722);
        OpenGL.glVertex2i(var6 + this.field3886.field723, var7);
        OpenGL.glEnd();
        this.method1742(18553);
    }

    @OriginalMember(owner = "client!hf", name = "qa", descriptor = "()I", line = 378)
    public final int method109() {
        field3889++;
        return this.field3886.field720;
    }

    @OriginalMember(owner = "client!hf", name = "aa", descriptor = "(FFFFFFIII)V", line = 386)
    public final void method106(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field3885++;
        if (this.field3888) {
            float var10 = (float) this.method100();
            float var11 = (float) this.method104();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field3884 * var14;
            float var17 = (float) this.field3884 * var15;
            float var18 = (float) this.field3900 * var12;
            float var19 = (float) this.field3900 * var13;
            float var20 = (float) this.field3894 * -var12;
            float var21 = (float) this.field3894 * -var13;
            float var22 = (float) this.field3903 * -var14;
            float var23 = (float) this.field3903 * -var15;
            arg0 = arg0 + var18 + var16;
            arg4 = arg4 + var18 + var22;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        this.field3886.method2929((byte) -110, true);
        this.field3907.method1930((byte) 110);
        this.field3907.method1990(this.field3886, 11864);
        this.field3907.method1934(arg8, true);
        this.field3907.method1989(-24145, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field3886.field722);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field3886.field718, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field3886.field718, this.field3886.field722);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!hf", name = "UA", descriptor = "()I", line = 454)
    public final int method96() {
        field3893++;
        return this.field3886.field723;
    }

    @OriginalMember(owner = "client!hf", name = "ja", descriptor = "()I", line = 466)
    public final int method100() {
        field3898++;
        return this.field3886.field723 + this.field3900 + this.field3894;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(FFFFFFLea;II)V", line = 474)
    public final void method107(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8) {
        field3890++;
        class39 var10 = ((class363) arg6).field5496;
        if (this.field3888) {
            float var11 = (float) this.method100();
            float var12 = (float) this.method104();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field3884 * var15;
            float var18 = (float) this.field3884 * var16;
            float var19 = (float) this.field3900 * var13;
            float var20 = (float) this.field3900 * var14;
            float var21 = (float) this.field3894 * -var13;
            float var22 = (float) this.field3894 * -var14;
            float var23 = (float) this.field3903 * -var15;
            float var24 = (float) this.field3903 * -var16;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg0 = arg0 + var19 + var17;
            arg3 = arg3 + var22 + var18;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field3886.method2929((byte) -49, true);
        float var26 = arg5 + arg3 - arg1;
        this.field3907.method1930((byte) 121);
        this.field3907.method1990(this.field3886, 11864);
        this.field3907.method1989(-24145, 1);
        this.field3907.method1929(1, (byte) 92);
        this.field3907.method1990(var10, 11864);
        this.field3907.method1951((byte) 118, 7681, 8448);
        this.field3907.method1921(768, 34168, (byte) -109, 0);
        this.field3907.method1934(1, true);
        float var27 = var10.field718 / (float) var10.field723;
        float var28 = var10.field722 / (float) var10.field720;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3886.field722);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field722 - (arg1 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field722 - (((float) (-arg8) + arg5) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field3886.field718, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field722 - (var26 - (float) arg8) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field3886.field718, this.field3886.field722);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field722 - ((float) (-arg8) + arg3) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field3907.method1921(768, 5890, (byte) -108, 0);
        this.field3907.method1989(-24145, 0);
        this.field3907.method1990(null, 11864);
        this.field3907.method1929(0, (byte) 91);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)V", line = 561)
    private final void method1745(byte arg0, int arg1) {
        this.field3907.method1929(1, (byte) 76);
        if (arg0 != -74) {
            this.method109();
        }
        field3897++;
        this.field3907.method1990(this.field3886, 11864);
        this.field3907.method1951((byte) -96, this.field3907.method1909((byte) -33, arg1), 7681);
        this.field3907.method1921(768, 34167, (byte) 99, 1);
        this.field3907.method1952(770, 34168, 122, 0);
        this.field3907.method1929(0, (byte) 93);
        this.field3907.method1990(this.field3899, 11864);
        this.field3907.method1951((byte) -113, 34479, 7681);
        this.field3907.method1921(768, 34166, (byte) 30, 1);
        if (this.field3904 == 0) {
            this.field3907.method1967(6406, 1.0F, 0.0F, 0.5F, 0.5F);
        } else if (this.field3904 == 1) {
            this.field3907.method1967(6406, 0.5F, 0.0F, 0.5F, 1.0F);
        } else if (this.field3904 == 2) {
            this.field3907.method1967(6406, 0.5F, 0.0F, 1.0F, 0.5F);
        } else if (this.field3904 == 3) {
            this.field3907.method1967(6406, 128.5F, 0.0F, 128.5F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "(IIIIII)V", line = 600)
    public final void method97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3886.method1823(arg0, -31950, arg2, arg3, arg5, arg1, arg4);
        field3896++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILea;II)V", line = 620)
    public final void method103(int arg0, int arg1, class381 arg2, int arg3, int arg4) {
        field3891++;
        class363 var6 = (class363) arg2;
        class39 var7 = var6.field5496;
        this.field3886.method2929((byte) -73, false);
        this.field3907.method1930((byte) 107);
        this.field3907.method1990(this.field3886, 11864);
        this.field3907.method1989(-24145, 1);
        this.field3907.method1929(1, (byte) 112);
        this.field3907.method1990(var7, 11864);
        this.field3907.method1951((byte) 125, 7681, 8448);
        this.field3907.method1921(768, 34168, (byte) 40, 0);
        this.field3907.method1934(1, true);
        int var8 = this.field3884 + arg1;
        int var9 = this.field3900 + arg0;
        int var10 = this.field3886.field723 + var9;
        int var11 = this.field3886.field720 + var8;
        float var12 = var7.field718 / (float) var7.field723;
        float var13 = var7.field722 / (float) var7.field720;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field722 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field722 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3886.field722);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field3886.field720);
        OpenGL.glMultiTexCoord2f(33984, this.field3886.field718, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field3886.field723 + var9, var8 - -this.field3886.field720);
        OpenGL.glMultiTexCoord2f(33984, this.field3886.field718, this.field3886.field722);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field3886.field723 + var9, var8);
        OpenGL.glEnd();
        this.field3907.method1921(768, 5890, (byte) 39, 0);
        this.field3907.method1989(-24145, 0);
        this.field3907.method1990(null, 11864);
        this.field3907.method1929(0, (byte) 69);
    }

    @OriginalMember(owner = "client!hf", name = "ka", descriptor = "(IIII)V", line = 684)
    public final void method99(int arg0, int arg1, int arg2, int arg3) {
        this.field3900 = arg0;
        this.field3894 = arg2;
        field3881++;
        this.field3903 = arg3;
        this.field3884 = arg1;
        this.field3888 = this.field3900 != 0 || this.field3884 != 0 || this.field3894 != 0 || this.field3903 != 0;
    }

    @OriginalMember(owner = "client!hf", name = "JA", descriptor = "()I", line = 707)
    public final int method104() {
        field3887++;
        return this.field3886.field720 + this.field3884 + this.field3903;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 724)
    public static final void method1746(String arg0, boolean arg1) {
        field3895++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class33.method351(arg0, 112);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class1.field9; var3++) {
            String var4 = class156.field2456[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class33.method351(var4, -107);
            if (var5 != null && var5.equals(var2)) {
                class1.field9--;
                for (int var6 = var3; var6 < class1.field9; var6++) {
                    class156.field2456[var6] = class156.field2456[var6 + 1];
                    class274.field3963[var6] = class274.field3963[var6 + 1];
                    class441.field6609[var6] = class441.field6609[var6 + 1];
                    class121.field1963[var6] = class121.field1963[var6 + 1];
                    class107.field1780[var6] = class107.field1780[var6 + 1];
                }
                class95.field1603++;
                class85.field1475 = class431.field6404;
                class28.method321(class423.field6310, -5001);
                class410.field6141.method1109(!arg1, class217.method1444(arg0, -125));
                class410.field6141.method1089((byte) -89, arg0);
                break;
            }
        }
        if (!arg1) {
            field3902 = null;
        }
    }
}
