import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class503 extends class256 {

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    private int field7113 = 0;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
    private int field7123 = 0;

    @OriginalMember(owner = "client!mp", name = "s", descriptor = "I")
    private int field7127 = 0;

    @OriginalMember(owner = "client!mp", name = "w", descriptor = "I")
    private int field7131 = 0;

    @OriginalMember(owner = "client!mp", name = "z", descriptor = "I")
    private int field7134 = 0;

    @OriginalMember(owner = "client!mp", name = "x", descriptor = "Z")
    private boolean field7132 = false;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "Luca;")
    private class287 field7115;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "Lei;")
    public class506 field7120;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
    public static int field7121 = 0;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field7111 = 0;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!mp", name = "t", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!mp", name = "u", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!mp", name = "v", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!mp", name = "y", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!mp", name = "A", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!mp", name = "B", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!mp", name = "r", descriptor = "Lei;")
    private class506 field7126;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "Lr;")
    public static class98 field7110;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "Lbc;")
    public static class9 field7119;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(II)V")
    private final void method2866(int arg0, int arg1) {
        field7125++;
        this.field7115.method1745(true, 1);
        this.field7115.method1709((byte) -92, this.field7120);
        this.field7115.method1701(this.field7115.method1760((byte) 73, arg1), 1, 7681);
        this.field7115.method1755(34167, arg0 + 33406, 768, 1);
        this.field7115.method1724((byte) 11, arg0, 34168, 0);
        this.field7115.method1745(true, 0);
        this.field7115.method1709((byte) -102, this.field7126);
        this.field7115.method1701(34479, 1, 7681);
        this.field7115.method1755(34166, 34176, 768, 1);
        if (this.field7123 == 0) {
            this.field7115.method1750(0.5F, arg0 - 763, 0.5F, 0.0F, 1.0F);
        } else if (this.field7123 == 1) {
            this.field7115.method1750(1.0F, -2, 0.5F, 0.0F, 0.5F);
        } else if (this.field7123 == 2) {
            this.field7115.method1750(0.5F, arg0 - 651, 1.0F, 0.0F, 0.5F);
        } else if (this.field7123 == 3) {
            this.field7115.method1750(128.5F, -19, 128.5F, 0.0F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public static void method2867(int arg0) {
        field7119 = null;
        if (arg0 == 1) {
            field7110 = null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "ca", descriptor = "()I")
    public final int method43() {
        field7118++;
        return this.field7120.field7160 + this.field7131 + this.field7113;
    }

    @OriginalMember(owner = "client!mp", name = "YA", descriptor = "(IIIIIIII)V")
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7112++;
        this.field7120.method2924((arg7 & 0x1) != 0, -106);
        this.field7115.method1748(2);
        this.field7115.method1721(46, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field7132) {
            float var9 = (float) arg2 / (float) this.method50();
            float var10 = (float) arg3 / (float) this.method43();
            float var11 = (float) this.field7134 * var9 + (float) arg0;
            float var12 = (float) this.field7131 * var10 + (float) arg1;
            float var13 = (float) this.field7120.field7156 * var9 + var11;
            float var14 = (float) this.field7120.field7160 * var10 + var12;
            if (this.field7126 == null) {
                this.field7115.method1709((byte) -87, this.field7120);
                this.field7115.method1751(arg4, 21575);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field7120.field7154);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field7120.field7159, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field7120.field7159, this.field7120.field7154);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method2866(770, arg4);
                this.field7126.method2924(true, -126);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7120.field7154);
                OpenGL.glTexCoord2f(0.0F, this.field7120.field7154);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field7120.field7159, 0.0F);
                OpenGL.glTexCoord2f(this.field7120.field7159, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field7120.field7159, this.field7120.field7154);
                OpenGL.glTexCoord2f(this.field7120.field7159, this.field7120.field7154);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method2868(0);
            }
        } else if (this.field7126 == null) {
            this.field7115.method1709((byte) -87, this.field7120);
            this.field7115.method1751(arg4, 21575);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field7120.field7154);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field7120.field7159, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field7120.field7159, this.field7120.field7154);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2866(770, arg4);
            this.field7126.method2924(true, -40);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7120.field7154);
            OpenGL.glTexCoord2f(0.0F, this.field7120.field7154);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field7120.field7159, 0.0F);
            OpenGL.glTexCoord2f(this.field7120.field7159, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field7120.field7159, this.field7120.field7154);
            OpenGL.glTexCoord2f(this.field7120.field7159, this.field7120.field7154);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2868(0);
        }
    }

    @OriginalMember(owner = "client!mp", name = "E", descriptor = "()I")
    public final int method48() {
        field7129++;
        return this.field7120.field7156;
    }

    @OriginalMember(owner = "client!mp", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final void method57(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field7132) {
            float var11 = (float) this.method50();
            float var12 = (float) this.method43();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field7131 * var15;
            float var18 = (float) this.field7131 * var16;
            float var19 = (float) this.field7134 * var13;
            float var20 = (float) this.field7134 * var14;
            float var21 = (float) this.field7127 * -var13;
            float var22 = (float) this.field7127 * -var14;
            float var23 = (float) this.field7113 * -var15;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            float var24 = (float) this.field7113 * -var16;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg5 = arg5 + var20 + var24;
        }
        field7116++;
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field7120.method2924((arg9 & 0x1) != 0, -79);
        this.field7115.method1748(2);
        this.field7115.method1709((byte) -91, this.field7120);
        this.field7115.method1721(41, arg8);
        this.field7115.method1751(arg6, 21575);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field7120.field7154);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field7120.field7159, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field7120.field7159, this.field7120.field7154);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!mp", name = "DA", descriptor = "(IIIIIII)V")
    public final void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7122++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field7120.method2924(false, -94);
        this.field7115.method1748(2);
        this.field7115.method1709((byte) -72, this.field7120);
        this.field7115.method1721(118, arg6);
        this.field7115.method1751(arg4, 21575);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field7120.field7157 && !this.field7132) {
            float var10 = (float) arg3 * this.field7120.field7154 / (float) this.field7120.field7160;
            float var11 = (float) arg2 * this.field7120.field7159 / (float) this.field7120.field7156;
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
        OpenGL.glTranslatef((float) this.field7134, (float) this.field7131, 0.0F);
        int var12 = this.method50();
        int var13 = this.method43();
        int var14 = arg1 + this.field7120.field7160;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field7120.field7156 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field7120.field7154);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field7120.field7159, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field7120.field7159, this.field7120.field7154);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field7120.field7159 / (float) this.field7120.field7156;
                OpenGL.glTexCoord2f(0.0F, this.field7120.field7154);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field7120.field7154);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field7120.field7160 + var15 - var9) * this.field7120.field7154 / (float) this.field7120.field7160;
            int var17 = this.field7120.field7156 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field7120.field7154);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field7120.field7159, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field7120.field7159, this.field7120.field7154);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field7120.field7159 / (float) this.field7120.field7156;
                OpenGL.glTexCoord2f(0.0F, this.field7120.field7154);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field7120.field7154);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!mp", name = "xa", descriptor = "(III)V")
    public final void method55(int arg0, int arg1, int arg2) {
        field7135++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field7126 = class375.method2312(this.field7120.field7160, arg0, this.field7120.field7156, this.field7115, 0, arg1);
        this.field7123 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V")
    private final void method2868(int arg0) {
        this.field7115.method1745(true, 1);
        field7136++;
        this.field7115.method1709((byte) -103, null);
        this.field7115.method1701(8448, 1, 8448);
        this.field7115.method1755(34168, 34176, 768, 1);
        this.field7115.method1724((byte) 11, 770, 5890, 0);
        this.field7115.method1745(true, arg0);
        this.field7115.method1755(34168, arg0 + 34176, 768, 1);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method60(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class591 arg7, int arg8, int arg9) {
        field7124++;
        class506 var11 = ((class20) arg7).field382;
        if (this.field7132) {
            float var12 = (float) this.method50();
            float var13 = (float) this.method43();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field7131 * var16;
            float var19 = (float) this.field7131 * var17;
            float var20 = (float) this.field7134 * var14;
            float var21 = (float) this.field7134 * var15;
            float var22 = (float) this.field7127 * -var14;
            float var23 = (float) this.field7127 * -var15;
            float var24 = (float) this.field7113 * -var16;
            arg4 = arg4 + var20 + var24;
            arg0 = arg0 + var20 + var18;
            arg3 = arg3 + var23 + var19;
            float var25 = (float) this.field7113 * -var17;
            arg2 = arg2 + var22 + var18;
            arg1 = arg1 + var21 + var19;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field7120.method2924((arg6 & 0x1) != 0, -49);
        float var27 = arg5 + arg3 - arg1;
        this.field7115.method1748(2);
        this.field7115.method1709((byte) -47, this.field7120);
        this.field7115.method1751(1, 21575);
        this.field7115.method1745(true, 1);
        this.field7115.method1709((byte) -121, var11);
        this.field7115.method1701(7681, 1, 8448);
        this.field7115.method1755(34168, 34176, 768, 0);
        this.field7115.method1721(-126, 1);
        float var28 = var11.field7159 / (float) var11.field7156;
        float var29 = var11.field7154 / (float) var11.field7160;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field7120.field7154);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field7154 - ((arg1 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field7154 - (arg5 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field7120.field7159, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + var26) * var28, var11.field7154 - (((float) (-arg9) + var27) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field7120.field7159, this.field7120.field7154);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field7154 - ((float) (-arg9) + arg3) * var29);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field7115.method1755(5890, 34176, 768, 0);
        this.field7115.method1751(0, 21575);
        this.field7115.method1709((byte) -112, null);
        this.field7115.method1745(true, 0);
    }

    @OriginalMember(owner = "client!mp", name = "Q", descriptor = "(IIII)V")
    public final void method58(int arg0, int arg1, int arg2, int arg3) {
        this.field7113 = arg3;
        this.field7134 = arg0;
        field7133++;
        this.field7127 = arg2;
        this.field7131 = arg1;
        this.field7132 = this.field7134 != 0 || this.field7131 != 0 || this.field7127 != 0 || this.field7113 != 0;
    }

    @OriginalMember(owner = "client!mp", name = "u", descriptor = "()I")
    public final int method56() {
        field7117++;
        return this.field7120.field7160;
    }

    @OriginalMember(owner = "client!mp", name = "V", descriptor = "(IIIII)V")
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7120.method2924(false, -101);
        field7128++;
        this.field7115.method1748(2);
        this.field7115.method1721(-127, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field7134 + arg0;
        int var7 = this.field7131 + arg1;
        if (this.field7126 == null) {
            this.field7115.method1709((byte) -70, this.field7120);
            this.field7115.method1751(arg2, 21575);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field7120.field7154);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field7120.field7160 + var7);
            OpenGL.glTexCoord2f(this.field7120.field7159, 0.0F);
            OpenGL.glVertex2i(var6 + this.field7120.field7156, var7 - -this.field7120.field7160);
            OpenGL.glTexCoord2f(this.field7120.field7159, this.field7120.field7154);
            OpenGL.glVertex2i(var6 + this.field7120.field7156, var7);
            OpenGL.glEnd();
            return;
        }
        this.method2866(770, arg2);
        this.field7126.method2924(false, -125);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7120.field7154);
        OpenGL.glTexCoord2f(0.0F, this.field7120.field7154);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field7120.field7160 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field7120.field7159, 0.0F);
        OpenGL.glTexCoord2f(this.field7120.field7159, 0.0F);
        OpenGL.glVertex2i(this.field7120.field7156 + var6, this.field7120.field7160 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field7120.field7159, this.field7120.field7154);
        OpenGL.glTexCoord2f(this.field7120.field7159, this.field7120.field7154);
        OpenGL.glVertex2i(this.field7120.field7156 + var6, var7);
        OpenGL.glEnd();
        this.method2868(0);
    }

    @OriginalMember(owner = "client!mp", name = "da", descriptor = "(IIIIII)V")
    public final void method44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7120.method1425(arg0, arg4, arg5, arg3, arg1, (byte) 127, arg2);
        field7130++;
    }

    @OriginalMember(owner = "client!mp", name = "A", descriptor = "()I")
    public final int method50() {
        field7109++;
        return this.field7120.field7156 + this.field7127 + this.field7134;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IILua;II)V")
    public final void method51(int arg0, int arg1, class591 arg2, int arg3, int arg4) {
        field7114++;
        class20 var6 = (class20) arg2;
        class506 var7 = var6.field382;
        this.field7120.method2924(false, -87);
        this.field7115.method1748(2);
        this.field7115.method1709((byte) -53, this.field7120);
        this.field7115.method1751(1, 21575);
        this.field7115.method1745(true, 1);
        this.field7115.method1709((byte) -72, var7);
        this.field7115.method1701(7681, 1, 8448);
        this.field7115.method1755(34168, 34176, 768, 0);
        this.field7115.method1721(14, 1);
        int var8 = this.field7134 + arg0;
        int var9 = this.field7131 + arg1;
        int var10 = this.field7120.field7156 + var8;
        int var11 = this.field7120.field7160 + var9;
        float var12 = var7.field7159 / (float) var7.field7156;
        float var13 = var7.field7154 / (float) var7.field7160;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field7154 - ((float) (var9 - arg4) * var13);
        float var17 = var7.field7154 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field7120.field7154);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field7120.field7160 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field7120.field7159, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field7120.field7156 + var8, var9 - -this.field7120.field7160);
        OpenGL.glMultiTexCoord2f(33984, this.field7120.field7159, this.field7120.field7154);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field7120.field7156 + var8, var9);
        OpenGL.glEnd();
        this.field7115.method1755(5890, 34176, 768, 0);
        this.field7115.method1751(0, 21575);
        this.field7115.method1709((byte) -91, null);
        this.field7115.method1745(true, 0);
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Luca;IIZ)V")
    public class503(class287 arg0, int arg1, int arg2, boolean arg3) {
        this.field7115 = arg0;
        this.field7120 = class448.method2647(arg0, 3553, arg3 ? 6408 : 6407, arg2, arg1);
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Luca;IIII)V")
    public class503(class287 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7115 = arg0;
        this.field7120 = class375.method2312(arg4, arg1, arg3, arg0, 0, arg2);
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Luca;II[III)V")
    public class503(class287 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field7115 = arg0;
        this.field7120 = class431.method2573(arg4, arg3, arg1, arg2, arg5, false, arg0, (byte) -81);
    }
}
