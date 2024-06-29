import jaggl.OpenGL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class708 extends class133 {

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    private int field9791 = 0;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    private int field9804 = 0;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    private int field9795 = 0;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "Z")
    private boolean field9801 = false;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
    private int field9811 = 0;

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
    private int field9813 = 0;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "Lrda;")
    private class663 field9796;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "Lqd;")
    private class452 field9798;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field9799 = 1;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "Lhda;")
    public static class752 field9802 = new class752(24, 3);

    @OriginalMember(owner = "client!ip", name = "D", descriptor = "Lhda;")
    public static class752 field9820 = new class752(31, -1);

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field9792;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field9793;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field9794;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field9797;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
    public static int field9800;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    public static int field9806;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
    public static int field9807;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    public static int field9808;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
    public static int field9810;

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "I")
    public static int field9812;

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "I")
    public static int field9814;

    @OriginalMember(owner = "client!ip", name = "y", descriptor = "I")
    public static int field9815;

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!ip", name = "B", descriptor = "I")
    public static int field9818;

    @OriginalMember(owner = "client!ip", name = "C", descriptor = "I")
    public static int field9819;

    @OriginalMember(owner = "client!ip", name = "E", descriptor = "I")
    public static int field9821;

    @OriginalMember(owner = "client!ip", name = "A", descriptor = "Lqd;")
    private class452 field9817;

    @OriginalMember(owner = "client!ip", name = "F", descriptor = "Llh;")
    public static class528 field9822;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public static void method3976(int arg0) {
        field9822 = null;
        if (arg0 == 28478) {
            field9802 = null;
            field9820 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "()I")
    public final int method1043() {
        field9806++;
        return this.field9798.field6180;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(IIIIIII)V")
    public final void method1047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9814++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field9798.method2615(false, false);
        this.field9796.method3614(119);
        this.field9796.method3639(-2, this.field9798);
        this.field9796.method3635(0, arg6);
        this.field9796.method3631((byte) 115, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field9798.field6182 && !this.field9801) {
            float var10 = (float) arg3 * this.field9798.field6181 / (float) this.field9798.field6180;
            float var11 = (float) arg2 * this.field9798.field6183 / (float) this.field9798.field6178;
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
        OpenGL.glTranslatef((float) this.field9804, (float) this.field9791, 0.0F);
        int var12 = this.method1036();
        int var13 = this.method1048();
        int var14 = this.field9798.field6180 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field9798.field6178 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field9798.field6181);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field9798.field6183, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field9798.field6183, this.field9798.field6181);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field9798.field6183 / (float) this.field9798.field6178;
                OpenGL.glTexCoord2f(0.0F, this.field9798.field6181);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field9798.field6181);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (this.field9798.field6180 + var15 - var9) * this.field9798.field6181 / (float) this.field9798.field6180;
            int var17 = this.field9798.field6178 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field9798.field6181);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field9798.field6183, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field9798.field6183, this.field9798.field6181);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field9798.field6183 / (float) this.field9798.field6178;
                OpenGL.glTexCoord2f(0.0F, this.field9798.field6181);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field9798.field6181);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "()I")
    public final int method1042() {
        field9819++;
        return this.field9798.field6178;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9812++;
        this.field9798.method2615(false, (arg7 & 0x1) != 0);
        this.field9796.method3614(109);
        this.field9796.method3635(0, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field9801) {
            float var9 = (float) arg2 / (float) this.method1036();
            float var10 = (float) arg3 / (float) this.method1048();
            float var11 = (float) this.field9804 * var9 + (float) arg0;
            float var12 = (float) this.field9791 * var10 + (float) arg1;
            float var13 = (float) this.field9798.field6178 * var9 + var11;
            float var14 = (float) this.field9798.field6180 * var10 + var12;
            if (this.field9817 == null) {
                this.field9796.method3639(-2, this.field9798);
                this.field9796.method3631((byte) 117, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field9798.field6181);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field9798.field6183, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field9798.field6183, this.field9798.field6181);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method3980(arg4, (byte) 28);
                this.field9817.method2615(false, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9798.field6181);
                OpenGL.glTexCoord2f(0.0F, this.field9798.field6181);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field9798.field6183, 0.0F);
                OpenGL.glTexCoord2f(this.field9798.field6183, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field9798.field6183, this.field9798.field6181);
                OpenGL.glTexCoord2f(this.field9798.field6183, this.field9798.field6181);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method3978((byte) -32);
            }
        } else if (this.field9817 == null) {
            this.field9796.method3639(-2, this.field9798);
            this.field9796.method3631((byte) 123, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field9798.field6181);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field9798.field6183, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field9798.field6183, this.field9798.field6181);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method3980(arg4, (byte) 28);
            this.field9817.method2615(false, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9798.field6181);
            OpenGL.glTexCoord2f(0.0F, this.field9798.field6181);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field9798.field6183, 0.0F);
            OpenGL.glTexCoord2f(this.field9798.field6183, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field9798.field6183, this.field9798.field6181);
            OpenGL.glTexCoord2f(this.field9798.field6183, this.field9798.field6181);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method3978((byte) -32);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIII)V")
    public final void method1051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9808++;
        if (!this.field9796.field9018) {
            this.field9798.method4114(arg5, arg2, arg3, arg1, 34037, arg4, arg0);
            return;
        }
        int[] var7 = this.field9796.method473(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class446.method2556(var7[var8], -16777216);
            }
            this.method3979(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method3977(int arg0, Throwable arg1) throws IOException {
        field9815++;
        String var3;
        if (arg1 instanceof class644) {
            class644 var2 = (class644) arg1;
            arg1 = var2.field8565;
            var3 = var2.field8567 + " | ";
        } else {
            var3 = "";
        }
        if (arg0 != -28017) {
            return null;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIII)V")
    public final void method1032(int arg0, int arg1, int arg2, int arg3) {
        field9793++;
        this.field9811 = arg2;
        this.field9804 = arg0;
        this.field9791 = arg1;
        this.field9795 = arg3;
        this.field9801 = this.field9804 != 0 || this.field9791 != 0 || this.field9811 != 0 || this.field9795 != 0;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1034(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field9821++;
        if (this.field9801) {
            float var11 = (float) this.method1036();
            float var12 = (float) this.method1048();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field9791 * var15;
            float var18 = (float) this.field9791 * var16;
            float var19 = (float) this.field9804 * var13;
            float var20 = (float) this.field9804 * var14;
            float var21 = (float) this.field9811 * -var13;
            float var22 = (float) this.field9811 * -var14;
            float var23 = (float) this.field9795 * -var15;
            arg0 = arg0 + var19 + var17;
            arg4 = arg4 + var19 + var23;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            float var24 = (float) this.field9795 * -var16;
            arg3 = arg3 + var22 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field9798.method2615(false, (arg9 & 0x1) != 0);
        float var26 = arg5 + arg3 - arg1;
        this.field9796.method3614(124);
        this.field9796.method3639(-2, this.field9798);
        this.field9796.method3635(0, arg8);
        this.field9796.method3631((byte) 123, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field9798.field6181);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field9798.field6183, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field9798.field6183, this.field9798.field6181);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    private final void method3978(byte arg0) {
        this.field9796.method3630(true, 1);
        if (arg0 != -32) {
            return;
        }
        field9800++;
        this.field9796.method3639(-2, null);
        this.field9796.method3608(-91, 8448, 8448);
        this.field9796.method3661(768, 34168, 1, (byte) 4);
        this.field9796.method3599(0, 770, (byte) 37, 5890);
        this.field9796.method3630(true, 0);
        this.field9796.method3661(768, 34168, 1, (byte) 4);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)V")
    public final void method1044(int arg0, int arg1, int arg2) {
        field9809++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field9817 = class660.method3582(this.field9796, arg0, this.field9798.field6178, (byte) -54, this.field9798.field6180, arg1);
        this.field9813 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "()I")
    public final int method1036() {
        field9805++;
        return this.field9798.field6178 + this.field9811 + this.field9804;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1041(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class490 arg7, int arg8, int arg9) {
        field9803++;
        class452 var11 = ((class495) arg7).field6674;
        if (this.field9801) {
            float var12 = (float) this.method1036();
            float var13 = (float) this.method1048();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field9791 * var16;
            float var19 = (float) this.field9791 * var17;
            float var20 = (float) this.field9804 * var14;
            float var21 = (float) this.field9804 * var15;
            float var22 = (float) this.field9811 * -var14;
            float var23 = (float) this.field9811 * -var15;
            float var24 = (float) this.field9795 * -var16;
            arg2 = arg2 + var22 + var18;
            arg4 = arg4 + var20 + var24;
            float var25 = (float) this.field9795 * -var17;
            arg0 = arg0 + var20 + var18;
            arg1 = arg1 + var21 + var19;
            arg3 = arg3 + var23 + var19;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field9798.method2615(false, (arg6 & 0x1) != 0);
        float var27 = arg5 + arg3 - arg1;
        this.field9796.method3614(124);
        this.field9796.method3639(-2, this.field9798);
        this.field9796.method3631((byte) 113, 1);
        this.field9796.method3630(true, 1);
        this.field9796.method3639(-2, var11);
        this.field9796.method3608(-40, 8448, 7681);
        this.field9796.method3661(768, 34168, 0, (byte) 4);
        this.field9796.method3635(0, 1);
        float var28 = var11.field6183 / (float) var11.field6178;
        float var29 = var11.field6181 / (float) var11.field6180;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9798.field6181);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field6181 - (arg1 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg4) * var28, var11.field6181 - ((arg5 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field9798.field6183, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + var26) * var28, var11.field6181 - ((float) (-arg9) + var27) * var29);
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field9798.field6183, this.field9798.field6181);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field6181 - (arg3 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field9796.method3661(768, 5890, 0, (byte) 4);
        this.field9796.method3631((byte) 116, 0);
        this.field9796.method3639(-2, null);
        this.field9796.method3630(true, 0);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIII[III)V")
    private final void method3979(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field9818++;
        this.field9798.method4112((byte) -53, arg2, arg5, arg3, arg1, true, arg4, arg6, arg0);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IB)V")
    private final void method3980(int arg0, byte arg1) {
        this.field9796.method3630(true, 1);
        field9792++;
        this.field9796.method3639(-2, this.field9798);
        this.field9796.method3608(arg1 ^ 0x6A, 7681, this.field9796.method3642(false, arg0));
        this.field9796.method3661(768, 34167, 1, (byte) 4);
        this.field9796.method3599(0, 770, (byte) 37, 34168);
        this.field9796.method3630(true, 0);
        this.field9796.method3639(-2, this.field9817);
        this.field9796.method3608(-46, 7681, 34479);
        this.field9796.method3661(768, 34166, 1, (byte) 4);
        if (this.field9813 == 0) {
            this.field9796.method3660(arg1 - 14245, 0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field9813 == 1) {
            this.field9796.method3660(-14217, 0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field9813 == 2) {
            this.field9796.method3660(arg1 - 14245, 1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field9813 == 3) {
            this.field9796.method3660(-14217, 128.5F, 128.5F, 128.5F, 0.0F);
        }
        if (arg1 != 28) {
            this.method1047(-108, 7, -122, -17, -128, -34, 89);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILaa;II)V")
    public final void method1031(int arg0, int arg1, class490 arg2, int arg3, int arg4) {
        field9794++;
        class495 var6 = (class495) arg2;
        class452 var7 = var6.field6674;
        this.field9798.method2615(false, false);
        this.field9796.method3614(120);
        this.field9796.method3639(-2, this.field9798);
        this.field9796.method3631((byte) 127, 1);
        this.field9796.method3630(true, 1);
        this.field9796.method3639(-2, var7);
        this.field9796.method3608(118, 8448, 7681);
        this.field9796.method3661(768, 34168, 0, (byte) 4);
        this.field9796.method3635(0, 1);
        int var8 = this.field9791 + arg1;
        int var9 = this.field9804 + arg0;
        int var10 = this.field9798.field6178 + var9;
        int var11 = this.field9798.field6180 + var8;
        float var12 = var7.field6183 / (float) var7.field6178;
        float var13 = var7.field6181 / (float) var7.field6180;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field6181 - (float) (var8 - arg4) * var13;
        float var17 = var7.field6181 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9798.field6181);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field9798.field6180 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field9798.field6183, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var9 + this.field9798.field6178, this.field9798.field6180 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field9798.field6183, this.field9798.field6181);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field9798.field6178 + var9, var8);
        OpenGL.glEnd();
        this.field9796.method3661(768, 5890, 0, (byte) 4);
        this.field9796.method3631((byte) 115, 0);
        this.field9796.method3639(-2, null);
        this.field9796.method3630(true, 0);
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "()I")
    public final int method1048() {
        field9807++;
        return this.field9798.field6180 + this.field9791 + this.field9795;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "([I)V")
    public final void method1046(int[] arg0) {
        arg0[3] = this.field9795;
        arg0[0] = this.field9804;
        field9810++;
        arg0[1] = this.field9791;
        arg0[2] = this.field9811;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIII)V")
    public final void method1045(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9797++;
        this.field9798.method2615(false, false);
        this.field9796.method3614(112);
        this.field9796.method3635(0, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field9791 + arg1;
        int var7 = this.field9804 + arg0;
        if (this.field9817 == null) {
            this.field9796.method3639(-2, this.field9798);
            this.field9796.method3631((byte) 119, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field9798.field6181);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, var6 + this.field9798.field6180);
            OpenGL.glTexCoord2f(this.field9798.field6183, 0.0F);
            OpenGL.glVertex2i(this.field9798.field6178 + var7, this.field9798.field6180 + var6);
            OpenGL.glTexCoord2f(this.field9798.field6183, this.field9798.field6181);
            OpenGL.glVertex2i(var7 + this.field9798.field6178, var6);
            OpenGL.glEnd();
            return;
        }
        this.method3980(arg2, (byte) 28);
        this.field9817.method2615(false, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9798.field6181);
        OpenGL.glTexCoord2f(0.0F, this.field9798.field6181);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field9798.field6180 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field9798.field6183, 0.0F);
        OpenGL.glTexCoord2f(this.field9798.field6183, 0.0F);
        OpenGL.glVertex2i(var7 + this.field9798.field6178, this.field9798.field6180 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field9798.field6183, this.field9798.field6181);
        OpenGL.glTexCoord2f(this.field9798.field6183, this.field9798.field6181);
        OpenGL.glVertex2i(var7 + this.field9798.field6178, var6);
        OpenGL.glEnd();
        this.method3978((byte) -32);
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lrda;IIZ)V")
    public class708(class663 arg0, int arg1, int arg2, boolean arg3) {
        this.field9796 = arg0;
        this.field9798 = class333.method2004(arg0, 49, arg3 ? 6408 : 6407, arg2, arg1);
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lrda;IIII)V")
    public class708(class663 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9796 = arg0;
        this.field9798 = class660.method3582(arg0, arg1, arg3, (byte) -54, arg4, arg2);
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lrda;II[III)V")
    public class708(class663 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field9796 = arg0;
        this.field9798 = class244.method1518(arg2, arg5, 71, false, arg3, arg4, arg1, arg0);
    }
}
