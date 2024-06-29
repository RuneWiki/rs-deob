import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class56 extends class140 {

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
    private int field661 = 0;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "Z")
    private boolean field656 = false;

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
    private int field659 = 0;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
    private int field655 = 0;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
    private int field662 = 0;

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
    private int field663 = 0;

    @OriginalMember(owner = "client!aea", name = "t", descriptor = "Llf;")
    private class250 field673;

    @OriginalMember(owner = "client!aea", name = "F", descriptor = "Lfu;")
    private class411 field684;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "Lmw;")
    public static class517 field654 = new class517(66, -1);

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!aea", name = "l", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!aea", name = "n", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!aea", name = "o", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!aea", name = "p", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!aea", name = "r", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!aea", name = "s", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!aea", name = "u", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!aea", name = "v", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!aea", name = "w", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!aea", name = "x", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!aea", name = "y", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!aea", name = "A", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!aea", name = "B", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!aea", name = "C", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!aea", name = "G", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!aea", name = "H", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!aea", name = "E", descriptor = "Lho;")
    public static class160 field683;

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "Lfu;")
    private class411 field664;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "()I", line = 3)
    public final int method340() {
        field671++;
        return this.field684.field5830 + this.field661 + this.field662;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIII)V", line = 19)
    public final void method341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field673.field3560) {
            int[] var7 = this.field673.method439(arg4, arg5, arg2, arg3);
            if (var7 != null) {
                for (int var8 = 0; var8 < var7.length; var8++) {
                    var7[var8] = class670.method3699(var7[var8], -16777216);
                }
                this.method348(arg0, arg1, arg2, arg3, var7, 0, arg2);
            }
        } else {
            this.field684.method2704(arg2, arg5, arg1, arg0, arg3, arg4, (byte) -128);
        }
        field679++;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIIII)V", line = 49)
    public final void method342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field668++;
        this.field684.method1344(-15578, ~(arg7 & 0x1) != -1);
        this.field673.method1598(-8556);
        this.field673.method1564(arg6, (byte) 95);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field656) {
            float var9 = (float) arg2 / (float) this.method343();
            float var10 = (float) arg3 / (float) this.method340();
            float var11 = (float) this.field663 * var9 + (float) arg0;
            float var12 = (float) this.field662 * var10 + (float) arg1;
            float var13 = (float) this.field684.field5837 * var9 + var11;
            float var14 = (float) this.field684.field5830 * var10 + var12;
            if (this.field664 == null) {
                this.field673.method1595((byte) 101, this.field684);
                this.field673.method1601(25456, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field684.field5836);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field684.field5834, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field684.field5834, this.field684.field5836);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method349(arg4, true);
                this.field664.method1344(-15578, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field684.field5836);
                OpenGL.glTexCoord2f(0.0F, this.field684.field5836);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field684.field5834, 0.0F);
                OpenGL.glTexCoord2f(this.field684.field5834, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field684.field5834, this.field684.field5836);
                OpenGL.glTexCoord2f(this.field684.field5834, this.field684.field5836);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method360((byte) -87);
            }
        } else if (this.field664 == null) {
            this.field673.method1595((byte) 76, this.field684);
            this.field673.method1601(25456, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field684.field5836);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field684.field5834, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field684.field5834, this.field684.field5836);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method349(arg4, true);
            this.field664.method1344(-15578, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field684.field5836);
            OpenGL.glTexCoord2f(0.0F, this.field684.field5836);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field684.field5834, 0.0F);
            OpenGL.glTexCoord2f(this.field684.field5834, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field684.field5834, this.field684.field5836);
            OpenGL.glTexCoord2f(this.field684.field5834, this.field684.field5836);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method360((byte) -87);
        }
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "()I", line = 154)
    public final int method343() {
        field669++;
        return this.field684.field5837 + this.field663 + this.field659;
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(IIIIIII)V", line = 162)
    public final void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field658++;
        int var8 = arg0 + arg2;
        this.field684.method1344(-15578, false);
        int var9 = arg1 + arg3;
        this.field673.method1598(-8556);
        this.field673.method1595((byte) 78, this.field684);
        this.field673.method1564(arg6, (byte) 117);
        this.field673.method1601(25456, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field684.field5829 && !this.field656) {
            float var10 = (float) arg3 * this.field684.field5836 / (float) this.field684.field5830;
            float var11 = (float) arg2 * this.field684.field5834 / (float) this.field684.field5837;
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
        OpenGL.glTranslatef((float) this.field663, (float) this.field662, 0.0F);
        int var12 = this.method343();
        int var13 = this.method340();
        int var14 = this.field684.field5830 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = arg0 + this.field684.field5837;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field684.field5836);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field684.field5834, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field684.field5834, this.field684.field5836);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field684.field5834 / (float) this.field684.field5837;
                OpenGL.glTexCoord2f(0.0F, this.field684.field5836);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field684.field5836);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (this.field684.field5830 + var15 - var9) * this.field684.field5836 / (float) this.field684.field5830;
            int var17 = arg0 + this.field684.field5837;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field684.field5836);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field684.field5834, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field684.field5834, this.field684.field5836);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field684.field5834 / (float) this.field684.field5837;
                OpenGL.glTexCoord2f(0.0F, this.field684.field5836);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field684.field5836);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V", line = 299)
    public final void method345(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field678++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field664 = class462.method2729(this.field684.field5837, this.field673, 107, arg0, arg1, this.field684.field5830);
        this.field655 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "([I)V", line = 324)
    public final void method346(int[] arg0) {
        arg0[1] = this.field662;
        field686++;
        arg0[3] = this.field661;
        arg0[0] = this.field663;
        arg0[2] = this.field659;
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(IIII)V", line = 335)
    public final void method347(int arg0, int arg1, int arg2, int arg3) {
        this.field659 = arg2;
        this.field663 = arg0;
        this.field661 = arg3;
        this.field662 = arg1;
        field681++;
        this.field656 = this.field663 != 0 || this.field662 != 0 || this.field659 != 0 || this.field661 != 0;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIII[III)V", line = 349)
    private final void method348(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field667++;
        this.field684.method2709(arg2, arg0, arg1, arg6, true, 122, arg3, arg5, arg4);
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Llf;IIZ)V", line = 882)
    public class56(class250 arg0, int arg1, int arg2, boolean arg3) {
        this.field673 = arg0;
        this.field684 = class323.method2093(arg2, arg3 ? 6408 : 6407, arg1, arg0, (byte) -104);
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Llf;IIII)V", line = 892)
    public class56(class250 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field673 = arg0;
        this.field684 = class462.method2729(arg3, arg0, 61, arg1, arg2, arg4);
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Llf;II[III)V", line = 902)
    public class56(class250 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field673 = arg0;
        this.field684 = class269.method1792(false, arg0, arg5, 3553, arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IZ)V", line = 368)
    private final void method349(int arg0, boolean arg1) {
        this.field673.method1631(1, -113);
        field685++;
        this.field673.method1595((byte) 101, this.field684);
        this.field673.method1630(this.field673.method1626(arg0, -124), 7681, 115);
        this.field673.method1600(17104, 34167, 1, 768);
        this.field673.method1581(770, 13112, 0, 34168);
        this.field673.method1631(0, 112);
        this.field673.method1595((byte) 90, this.field664);
        this.field673.method1630(34479, 7681, 126);
        this.field673.method1600(17104, 34166, 1, 768);
        if (this.field655 == 0) {
            this.field673.method1627(21315, 0.5F, 0.5F, 0.0F, 1.0F);
        } else if (this.field655 == 1) {
            this.field673.method1627(21315, 0.5F, 1.0F, 0.0F, 0.5F);
        } else if (this.field655 == 2) {
            this.field673.method1627(21315, 1.0F, 0.5F, 0.0F, 0.5F);
        } else if (this.field655 == 3) {
            this.field673.method1627(21315, 128.5F, 128.5F, 0.0F, 128.5F);
        }
        if (!arg1) {
            this.method358(-31, -52, -67, 79, -2);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "()I", line = 403)
    public final int method350() {
        field674++;
        return this.field684.field5837;
    }

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "()I", line = 426)
    public final int method351() {
        field660++;
        return this.field684.field5830;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IILaa;II)V", line = 439)
    public final void method352(int arg0, int arg1, class512 arg2, int arg3, int arg4) {
        field677++;
        class756 var6 = (class756) arg2;
        class411 var7 = var6.field10228;
        this.field684.method1344(-15578, false);
        this.field673.method1598(-8556);
        this.field673.method1595((byte) 127, this.field684);
        this.field673.method1601(25456, 1);
        this.field673.method1631(1, -124);
        this.field673.method1595((byte) 97, var7);
        this.field673.method1630(7681, 8448, 109);
        this.field673.method1600(17104, 34168, 0, 768);
        this.field673.method1564(1, (byte) 37);
        int var8 = this.field662 + arg1;
        int var9 = this.field663 + arg0;
        int var10 = this.field684.field5837 + var9;
        int var11 = this.field684.field5830 + var8;
        float var12 = var7.field5834 / (float) var7.field5837;
        float var13 = var7.field5836 / (float) var7.field5830;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field5836 - (float) (var8 - arg4) * var13;
        float var17 = var7.field5836 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field684.field5836);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field684.field5830 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field684.field5834, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field684.field5837 + var9, this.field684.field5830 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field684.field5834, this.field684.field5836);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var9 + this.field684.field5837, var8);
        OpenGL.glEnd();
        this.field673.method1600(17104, 5890, 0, 768);
        this.field673.method1601(25456, 0);
        this.field673.method1595((byte) 80, null);
        this.field673.method1631(0, -80);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(FFFFFFIIII)V", line = 499)
    public final void method353(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field657++;
        if (this.field656) {
            float var11 = (float) this.method343();
            float var12 = (float) this.method340();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field662 * var15;
            float var18 = (float) this.field662 * var16;
            float var19 = (float) this.field663 * var13;
            float var20 = (float) this.field663 * var14;
            float var21 = (float) this.field659 * -var13;
            float var22 = (float) this.field659 * -var14;
            float var23 = (float) this.field661 * -var15;
            arg1 = arg1 + var20 + var18;
            arg3 = arg3 + var22 + var18;
            arg2 = arg2 + var21 + var17;
            arg0 = arg0 + var19 + var17;
            arg4 = arg4 + var19 + var23;
            float var24 = (float) this.field661 * -var16;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field684.method1344(-15578, (arg9 & 0x1) != 0);
        this.field673.method1598(-8556);
        this.field673.method1595((byte) 72, this.field684);
        this.field673.method1564(arg8, (byte) 51);
        this.field673.method1601(25456, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field684.field5836);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field684.field5834, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field684.field5834, this.field684.field5836);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 567)
    public static final byte[] method354(String arg0, int arg1) {
        field666++;
        if (arg1 != -24686) {
            method357(-77);
        }
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (var3 - 2 >= var2 || class611.method3395(arg0.charAt(var3 - 2), 0) == -1) {
            var4 -= 2;
        } else if (var2 <= var3 - 1 || class611.method3395(arg0.charAt(var3 - 1), 0) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class152.method1065(arg0, var5, 0, (byte) 126);
        return var5;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lub;[III)V", line = 599)
    public static final void method355(class22 arg0, int[] arg1, int arg2, int arg3) {
        field665++;
        if (arg0.field6179 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field6179.length; var5++) {
                if (arg0.field6179[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field6138 != -1) {
                class317 var6 = class693.field9223.method2388(arg0.field6138, 0);
                int var7 = var6.field4487;
                if (var7 == 1) {
                    arg0.field6150 = 0;
                    arg0.field6181 = 1;
                    arg0.field6103 = 0;
                    arg0.field6157 = 0;
                    arg0.field6183 = arg2;
                    if (!arg0.field6135) {
                        class627.method3466(arg0, var6, -29701, arg0.field6150);
                    }
                }
                if (var7 == 2) {
                    arg0.field6103 = 0;
                }
            }
        }
        int var8 = -49 % ((arg3 - 40) / 44);
        boolean var9 = true;
        for (int var10 = 0; var10 < arg1.length; var10++) {
            if (arg1[var10] != -1) {
                var9 = false;
            }
            if (arg0.field6179 == null || arg0.field6179[var10] == -1 || class693.field9223.method2388(arg1[var10], 0).field4466 >= class693.field9223.method2388(arg0.field6179[var10], 0).field4466) {
                arg0.field6179 = arg1;
                arg0.field6183 = arg2;
                arg0.field6200 = arg0.field6195;
            }
        }
        if (var9) {
            arg0.field6179 = arg1;
            arg0.field6200 = arg0.field6195;
            arg0.field6183 = arg2;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 690)
    public final void method356(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class512 arg7, int arg8, int arg9) {
        field675++;
        class411 var11 = ((class756) arg7).field10228;
        if (this.field656) {
            float var12 = (float) this.method343();
            float var13 = (float) this.method340();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field662 * var16;
            float var19 = (float) this.field662 * var17;
            float var20 = (float) this.field663 * var14;
            float var21 = (float) this.field663 * var15;
            float var22 = (float) this.field659 * -var14;
            float var23 = (float) this.field659 * -var15;
            float var24 = (float) this.field661 * -var16;
            arg4 = arg4 + var20 + var24;
            arg1 = arg1 + var21 + var19;
            float var25 = (float) this.field661 * -var17;
            arg2 = arg2 + var22 + var18;
            arg0 = arg0 + var20 + var18;
            arg3 = arg3 + var23 + var19;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field684.method1344(-15578, (arg6 & 0x1) != 0);
        float var27 = arg5 + arg3 - arg1;
        this.field673.method1598(-8556);
        this.field673.method1595((byte) 77, this.field684);
        this.field673.method1601(25456, 1);
        this.field673.method1631(1, 6);
        this.field673.method1595((byte) 122, var11);
        this.field673.method1630(7681, 8448, 103);
        this.field673.method1600(17104, 34168, 0, 768);
        this.field673.method1564(1, (byte) 55);
        float var28 = var11.field5834 / (float) var11.field5837;
        float var29 = var11.field5836 / (float) var11.field5830;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field684.field5836);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field5836 - (arg1 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field5836 - ((float) (-arg9) + arg5) * var29);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field684.field5834, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + var26) * var28, var11.field5836 - (var27 - (float) arg9) * var29);
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field684.field5834, this.field684.field5836);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field5836 - ((float) (-arg9) + arg3) * var29);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field673.method1600(17104, 5890, 0, 768);
        this.field673.method1601(25456, 0);
        this.field673.method1595((byte) 84, null);
        this.field673.method1631(0, -77);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V", line = 780)
    public static void method357(int arg0) {
        field683 = null;
        if (arg0 != 0) {
            method359(-78, null);
        }
        field654 = null;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIII)V", line = 793)
    public final void method358(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field680++;
        this.field684.method1344(-15578, false);
        this.field673.method1598(-8556);
        this.field673.method1564(arg4, (byte) 63);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field663 + arg0;
        int var7 = this.field662 + arg1;
        if (this.field664 == null) {
            this.field673.method1595((byte) 106, this.field684);
            this.field673.method1601(25456, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field684.field5836);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field684.field5830 + var7);
            OpenGL.glTexCoord2f(this.field684.field5834, 0.0F);
            OpenGL.glVertex2i(this.field684.field5837 + var6, this.field684.field5830 + var7);
            OpenGL.glTexCoord2f(this.field684.field5834, this.field684.field5836);
            OpenGL.glVertex2i(this.field684.field5837 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method349(arg2, true);
        this.field664.method1344(-15578, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field684.field5836);
        OpenGL.glTexCoord2f(0.0F, this.field684.field5836);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field684.field5830 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field684.field5834, 0.0F);
        OpenGL.glTexCoord2f(this.field684.field5834, 0.0F);
        OpenGL.glVertex2i(this.field684.field5837 + var6, this.field684.field5830 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field684.field5834, this.field684.field5836);
        OpenGL.glTexCoord2f(this.field684.field5834, this.field684.field5836);
        OpenGL.glVertex2i(var6 + this.field684.field5837, var7);
        OpenGL.glEnd();
        this.method360((byte) -87);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILdt;)Lea;", line = 850)
    public static final class572 method359(int arg0, class254 arg1) {
        field676++;
        class379 var2 = class279.method1827(arg1, 82);
        if (arg0 > -92) {
            field654 = null;
        }
        int var3 = arg1.method1689((byte) 111);
        return new class572(var2.field5532, var2.field5527, var2.field5529, var2.field5533, var2.field5531, var3);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V", line = 865)
    private final void method360(byte arg0) {
        this.field673.method1631(1, -73);
        field672++;
        this.field673.method1595((byte) 94, null);
        this.field673.method1630(8448, 8448, arg0 + 187);
        this.field673.method1600(17104, 34168, 1, 768);
        this.field673.method1581(770, 13112, 0, 5890);
        this.field673.method1631(0, arg0);
        this.field673.method1600(17104, 34168, 1, 768);
        if (arg0 != -87) {
            this.field659 = -92;
        }
    }
}
