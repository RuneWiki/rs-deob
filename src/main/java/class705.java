import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class705 extends class298 {

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "Z")
    private boolean field9814 = false;

    @OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
    private int field9818 = 0;

    @OriginalMember(owner = "client!gba", name = "y", descriptor = "I")
    private int field9826 = 0;

    @OriginalMember(owner = "client!gba", name = "v", descriptor = "I")
    private int field9823 = 0;

    @OriginalMember(owner = "client!gba", name = "w", descriptor = "I")
    private int field9824 = 0;

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "I")
    private int field9827 = 0;

    @OriginalMember(owner = "client!gba", name = "t", descriptor = "Ldw;")
    private class664 field9821;

    @OriginalMember(owner = "client!gba", name = "B", descriptor = "Lgv;")
    private class702 field9829;

    @OriginalMember(owner = "client!gba", name = "i", descriptor = "[[I")
    public static int[][] field9810 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!gba", name = "u", descriptor = "[I")
    public static int[] field9822 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "I")
    public static int field9802;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "I")
    public static int field9806;

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "I")
    public static int field9807;

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "I")
    public static int field9808;

    @OriginalMember(owner = "client!gba", name = "h", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!gba", name = "j", descriptor = "I")
    public static int field9811;

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "I")
    public static int field9812;

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "I")
    public static int field9813;

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "I")
    public static int field9815;

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "I")
    public static int field9817;

    @OriginalMember(owner = "client!gba", name = "r", descriptor = "I")
    public static int field9819;

    @OriginalMember(owner = "client!gba", name = "s", descriptor = "I")
    public static int field9820;

    @OriginalMember(owner = "client!gba", name = "x", descriptor = "I")
    public static int field9825;

    @OriginalMember(owner = "client!gba", name = "A", descriptor = "I")
    public static int field9828;

    @OriginalMember(owner = "client!gba", name = "C", descriptor = "I")
    public static int field9830;

    @OriginalMember(owner = "client!gba", name = "D", descriptor = "I")
    public static int field9831;

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "Lgv;")
    private class702 field9804;

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "()I")
    public final int method1963() {
        field9802++;
        return this.field9824 + this.field9823 + this.field9829.field9781;
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "()I")
    public final int method1955() {
        field9815++;
        return this.field9829.field9781;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "()I")
    public final int method1952() {
        field9819++;
        return this.field9829.field9793;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "([I)V")
    public final void method1967(int[] arg0) {
        arg0[0] = this.field9824;
        arg0[2] = this.field9823;
        arg0[1] = this.field9826;
        arg0[3] = this.field9827;
        field9809++;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIIII)V")
    public final void method1015(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field9821.field9055) {
            int[] var7 = this.field9821.method268(arg4, arg5, arg2, arg3);
            if (var7 != null) {
                for (int var8 = 0; var8 < var7.length; var8++) {
                    var7[var8] = class678.method3817(var7[var8], -16777216);
                }
                this.method3969(arg0, arg1, arg2, arg3, var7, 0, arg2);
            }
        } else {
            this.field9829.method2232(arg2, arg4, 0, arg5, arg0, arg3, arg1);
        }
        field9811++;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9806++;
        this.field9829.method3292(3, (arg7 & 0x1) != 0);
        this.field9821.method3712(0);
        this.field9821.method3737(0, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field9814) {
            float var9 = (float) arg2 / (float) this.method1963();
            float var10 = (float) arg3 / (float) this.method1961();
            float var11 = (float) this.field9824 * var9 + (float) arg0;
            float var12 = (float) this.field9826 * var10 + (float) arg1;
            float var13 = (float) this.field9829.field9781 * var9 + var11;
            float var14 = (float) this.field9829.field9793 * var10 + var12;
            if (this.field9804 == null) {
                this.field9821.method3681(this.field9829, 0);
                this.field9821.method3720(-26014, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field9829.field9782);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field9829.field9791, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field9829.field9791, this.field9829.field9782);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method3974(33984, arg4);
                this.field9804.method3292(3, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9829.field9782);
                OpenGL.glTexCoord2f(0.0F, this.field9829.field9782);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field9829.field9791, 0.0F);
                OpenGL.glTexCoord2f(this.field9829.field9791, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field9829.field9791, this.field9829.field9782);
                OpenGL.glTexCoord2f(this.field9829.field9791, this.field9829.field9782);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method3970(55);
            }
        } else if (this.field9804 == null) {
            this.field9821.method3681(this.field9829, 0);
            this.field9821.method3720(-26014, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field9829.field9782);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field9829.field9791, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field9829.field9791, this.field9829.field9782);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method3974(33984, arg4);
            this.field9804.method3292(3, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9829.field9782);
            OpenGL.glTexCoord2f(0.0F, this.field9829.field9782);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field9829.field9791, 0.0F);
            OpenGL.glTexCoord2f(this.field9829.field9791, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field9829.field9791, this.field9829.field9782);
            OpenGL.glTexCoord2f(this.field9829.field9791, this.field9829.field9782);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method3970(56);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1962(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class573 arg7, int arg8, int arg9) {
        field9805++;
        class702 var11 = ((class444) arg7).field6165;
        if (this.field9814) {
            float var12 = (float) this.method1963();
            float var13 = (float) this.method1961();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field9826 * var16;
            float var19 = (float) this.field9826 * var17;
            float var20 = (float) this.field9824 * var14;
            float var21 = (float) this.field9824 * var15;
            float var22 = (float) this.field9823 * -var14;
            float var23 = (float) this.field9823 * -var15;
            float var24 = (float) this.field9827 * -var16;
            arg4 = arg4 + var20 + var24;
            arg0 = arg0 + var20 + var18;
            arg2 = arg2 + var22 + var18;
            float var25 = (float) this.field9827 * -var17;
            arg1 = arg1 + var21 + var19;
            arg3 = arg3 + var23 + var19;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field9829.method3292(3, (arg6 & 0x1) != 0);
        float var27 = arg5 + arg3 - arg1;
        this.field9821.method3712(0);
        this.field9821.method3681(this.field9829, 0);
        this.field9821.method3720(-26014, 1);
        this.field9821.method3738((byte) -63, 1);
        this.field9821.method3681(var11, 0);
        this.field9821.method3729((byte) 95, 7681, 8448);
        this.field9821.method3718(34168, 96, 768, 0);
        this.field9821.method3737(0, 1);
        float var28 = var11.field9791 / (float) var11.field9781;
        float var29 = var11.field9782 / (float) var11.field9793;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9829.field9782);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field9782 - ((float) (-arg9) + arg1) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field9782 - (((float) (-arg9) + arg5) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field9829.field9791, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field9782 - ((float) (-arg9) + var27) * var29);
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field9829.field9791, this.field9829.field9782);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field9782 - ((arg3 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field9821.method3718(5890, 97, 768, 0);
        this.field9821.method3720(-26014, 0);
        this.field9821.method3681(null, 0);
        this.field9821.method3738((byte) -63, 0);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILaa;II)V")
    public final void method1010(int arg0, int arg1, class573 arg2, int arg3, int arg4) {
        field9808++;
        class444 var6 = (class444) arg2;
        class702 var7 = var6.field6165;
        this.field9829.method3292(3, false);
        this.field9821.method3712(0);
        this.field9821.method3681(this.field9829, 0);
        this.field9821.method3720(-26014, 1);
        this.field9821.method3738((byte) -63, 1);
        this.field9821.method3681(var7, 0);
        this.field9821.method3729((byte) 95, 7681, 8448);
        this.field9821.method3718(34168, 98, 768, 0);
        this.field9821.method3737(0, 1);
        int var8 = this.field9826 + arg1;
        int var9 = this.field9824 + arg0;
        int var10 = this.field9829.field9781 + var9;
        int var11 = this.field9829.field9793 + var8;
        float var12 = var7.field9791 / (float) var7.field9781;
        float var13 = var7.field9782 / (float) var7.field9793;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field9782 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field9782 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9829.field9782);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field9829.field9793);
        OpenGL.glMultiTexCoord2f(33984, this.field9829.field9791, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field9829.field9781 + var9, this.field9829.field9793 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field9829.field9791, this.field9829.field9782);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field9829.field9781 + var9, var8);
        OpenGL.glEnd();
        this.field9821.method3718(5890, 98, 768, 0);
        this.field9821.method3720(-26014, 0);
        this.field9821.method3681(null, 0);
        this.field9821.method3738((byte) -63, 0);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIII[III)V")
    private final void method3969(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field9829.method2238(true, -21477, arg5, arg2, arg0, arg3, arg1, arg6, arg4);
        field9807++;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
    private final void method3970(int arg0) {
        field9812++;
        this.field9821.method3738((byte) -63, 1);
        this.field9821.method3681(null, 0);
        this.field9821.method3729((byte) 95, 8448, 8448);
        this.field9821.method3718(34168, 111, 768, 1);
        this.field9821.method3715(5890, 770, 0, (byte) -114);
        this.field9821.method3738((byte) -63, 0);
        this.field9821.method3718(34168, 107, 768, 1);
        if (arg0 < 43) {
            this.method3969(97, 86, 25, -10, null, 90, 16);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIIIII)V")
    public final void method1965(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9828++;
        int var8 = arg0 + arg2;
        this.field9829.method3292(3, false);
        int var9 = arg1 + arg3;
        this.field9821.method3712(0);
        this.field9821.method3681(this.field9829, 0);
        this.field9821.method3737(0, arg6);
        this.field9821.method3720(-26014, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field9829.field9789 && !this.field9814) {
            float var10 = (float) arg3 * this.field9829.field9782 / (float) this.field9829.field9793;
            float var11 = (float) arg2 * this.field9829.field9791 / (float) this.field9829.field9781;
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
        OpenGL.glTranslatef((float) this.field9824, (float) this.field9826, 0.0F);
        int var12 = this.method1963();
        int var13 = this.method1961();
        int var14 = this.field9829.field9793 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field9829.field9781 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field9829.field9782);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field9829.field9791, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field9829.field9791, this.field9829.field9782);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field9829.field9791 / (float) this.field9829.field9781;
                OpenGL.glTexCoord2f(0.0F, this.field9829.field9782);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field9829.field9782);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (var15 - (var9 - this.field9829.field9793)) * this.field9829.field9782 / (float) this.field9829.field9793;
            int var17 = this.field9829.field9781 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field9829.field9782);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field9829.field9791, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field9829.field9791, this.field9829.field9782);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field9829.field9791 / (float) this.field9829.field9781;
                OpenGL.glTexCoord2f(0.0F, this.field9829.field9782);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field9829.field9782);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "()I")
    public final int method1961() {
        field9831++;
        return this.field9829.field9793 + this.field9826 + this.field9827;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIII)V")
    public final void method1953(int arg0, int arg1, int arg2, int arg3) {
        this.field9824 = arg0;
        field9830++;
        this.field9826 = arg1;
        this.field9827 = arg3;
        this.field9823 = arg2;
        this.field9814 = this.field9824 != 0 || this.field9826 != 0 || this.field9823 != 0 || this.field9827 != 0;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIII)V")
    public final void method1013(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9816++;
        this.field9829.method3292(3, false);
        this.field9821.method3712(0);
        this.field9821.method3737(0, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field9824 + arg0;
        int var7 = this.field9826 + arg1;
        if (this.field9804 == null) {
            this.field9821.method3681(this.field9829, 0);
            this.field9821.method3720(-26014, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field9829.field9782);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field9829.field9793 + var7);
            OpenGL.glTexCoord2f(this.field9829.field9791, 0.0F);
            OpenGL.glVertex2i(this.field9829.field9781 + var6, var7 - -this.field9829.field9793);
            OpenGL.glTexCoord2f(this.field9829.field9791, this.field9829.field9782);
            OpenGL.glVertex2i(this.field9829.field9781 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method3974(33984, arg2);
        this.field9804.method3292(3, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9829.field9782);
        OpenGL.glTexCoord2f(0.0F, this.field9829.field9782);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field9829.field9793 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field9829.field9791, 0.0F);
        OpenGL.glTexCoord2f(this.field9829.field9791, 0.0F);
        OpenGL.glVertex2i(this.field9829.field9781 + var6, var7 - -this.field9829.field9793);
        OpenGL.glMultiTexCoord2f(33985, this.field9829.field9791, this.field9829.field9782);
        OpenGL.glTexCoord2f(this.field9829.field9791, this.field9829.field9782);
        OpenGL.glVertex2i(var6 + this.field9829.field9781, var7);
        OpenGL.glEnd();
        this.method3970(67);
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
    public static final void method3971(int arg0) {
        field9803++;
        class216 var1 = null;
        try {
            var1 = class135.method855("2", (byte) 89);
            class63 var2 = new class63(class671.field9313 * 6 + 3);
            var2.method444(1, 128);
            var2.method492(-2, class671.field9313);
            for (int var3 = 0; var3 < class621.field8315.length; var3++) {
                if (class693.field9627[var3]) {
                    var2.method492(-2, var3);
                    var2.method473(42, class621.field8315[var3]);
                }
            }
            var1.method1275(var2.field954, -13054, 0, var2.field956);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method1273(94);
            }
            if (arg0 <= 14) {
                field9810 = null;
            }
        } catch (Exception var4) {
        }
        class288.field4125 = class97.method664((byte) -50);
        class696.field9689 = false;
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(IIIII)V")
    public static final void method3972(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9820++;
        class346 var5 = class299.method1976(0, arg0, arg3);
        var5.method2209(255);
        var5.field4926 = arg1;
        var5.field4916 = arg4;
        var5.field4919 = arg2;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1966(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field9814) {
            float var11 = (float) this.method1963();
            float var12 = (float) this.method1961();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field9826 * var15;
            float var18 = (float) this.field9826 * var16;
            float var19 = (float) this.field9824 * var13;
            float var20 = (float) this.field9824 * var14;
            float var21 = (float) this.field9823 * -var13;
            float var22 = (float) this.field9823 * -var14;
            float var23 = (float) this.field9827 * -var15;
            arg1 = arg1 + var20 + var18;
            arg0 = arg0 + var19 + var17;
            arg2 = arg2 + var21 + var17;
            arg4 = arg4 + var19 + var23;
            arg3 = arg3 + var22 + var18;
            float var24 = (float) this.field9827 * -var16;
            arg5 = arg5 + var20 + var24;
        }
        field9813++;
        float var25 = arg2 + arg4 - arg0;
        this.field9829.method3292(3, (arg9 & 0x1) != 0);
        float var26 = arg5 + arg3 - arg1;
        this.field9821.method3712(0);
        this.field9821.method3681(this.field9829, 0);
        this.field9821.method3737(0, arg8);
        this.field9821.method3720(-26014, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field9829.field9782);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field9829.field9791, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field9829.field9791, this.field9829.field9782);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)V")
    public static void method3973(int arg0) {
        field9810 = null;
        field9822 = null;
        if (arg0 > -43) {
            method3971(88);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(III)V")
    public final void method1014(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field9817++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field9804 = class612.method3468(-13011, this.field9821, arg0, this.field9829.field9781, arg1, this.field9829.field9793);
        this.field9818 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(II)V")
    private final void method3974(int arg0, int arg1) {
        field9825++;
        this.field9821.method3738((byte) -63, 1);
        this.field9821.method3681(this.field9829, 0);
        this.field9821.method3729((byte) 95, this.field9821.method3730((byte) 96, arg1), 7681);
        this.field9821.method3718(34167, 110, 768, 1);
        if (arg0 != 33984) {
            this.field9829 = null;
        }
        this.field9821.method3715(34168, 770, 0, (byte) -55);
        this.field9821.method3738((byte) -63, 0);
        this.field9821.method3681(this.field9804, arg0 - 33984);
        this.field9821.method3729((byte) 95, 34479, 7681);
        this.field9821.method3718(34166, 122, 768, 1);
        if (this.field9818 == 0) {
            this.field9821.method3739(0.5F, 0.0F, 0.5F, 1.0F, (byte) 126);
        } else if (this.field9818 == 1) {
            this.field9821.method3739(0.5F, 0.0F, 1.0F, 0.5F, (byte) 96);
        } else if (this.field9818 == 2) {
            this.field9821.method3739(1.0F, 0.0F, 0.5F, 0.5F, (byte) -70);
            return;
        } else if (this.field9818 == 3) {
            this.field9821.method3739(128.5F, 0.0F, 128.5F, 128.5F, (byte) 57);
            return;
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Ldw;IIZ)V")
    public class705(class664 arg0, int arg1, int arg2, boolean arg3) {
        this.field9821 = arg0;
        this.field9829 = class206.method1238(-5550, arg2, arg3 ? 6408 : 6407, arg0, arg1);
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Ldw;IIII)V")
    public class705(class664 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9821 = arg0;
        this.field9829 = class612.method3468(-13011, arg0, arg1, arg3, arg2, arg4);
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Ldw;II[III)V")
    public class705(class664 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field9821 = arg0;
        this.field9829 = class324.method2078(true, arg5, false, arg3, arg0, arg1, arg2, arg4);
    }
}
