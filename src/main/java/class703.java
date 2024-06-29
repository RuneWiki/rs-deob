import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class703 extends class468 {

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    private int field9836 = 0;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "Z")
    private boolean field9827 = false;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    private int field9830 = 0;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    private int field9840 = 0;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
    private int field9850 = 0;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
    private int field9851 = 0;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "Ljaa;")
    private class576 field9829;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "Lhq;")
    public class148 field9841;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "Lwo;")
    public static class696 field9833 = new class696();

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "[I")
    public static int[] field9846 = new int[50];

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "Lws;")
    public static class333 field9847 = new class333();

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field9826;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public static int field9828;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field9831;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public static int field9832;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public static int field9834;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
    public static int field9835;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public static int field9837;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public static int field9838;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    public static int field9839;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public static int field9842;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
    public static int field9844;

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
    public static int field9845;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    public static int field9848;

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "I")
    public static int field9852;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "Lhq;")
    private class148 field9849;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
    private final void method3882(byte arg0) {
        field9845++;
        this.field9829.method3126(1, -109);
        if (arg0 <= 27) {
            this.field9836 = 52;
        }
        this.field9829.method3194((byte) 75, null);
        this.field9829.method3185(8448, 8448, (byte) 95);
        this.field9829.method3175(34168, 1, 1, 768);
        this.field9829.method3127(0, 770, 5890, 17111);
        this.field9829.method3126(0, -32);
        this.field9829.method3175(34168, 1, 1, 768);
    }

    @OriginalMember(owner = "client!lr", name = "EA", descriptor = "(IIII)V")
    public final void method1559(int arg0, int arg1, int arg2, int arg3) {
        this.field9851 = arg0;
        field9838++;
        this.field9836 = arg2;
        this.field9830 = arg1;
        this.field9840 = arg3;
        this.field9827 = this.field9851 != 0 || this.field9830 != 0 || this.field9836 != 0 || this.field9840 != 0;
    }

    @OriginalMember(owner = "client!lr", name = "AA", descriptor = "()I")
    public final int method1552() {
        field9842++;
        return this.field9841.field1767 + this.field9851 + this.field9836;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "()I")
    public final int method1549() {
        field9828++;
        return this.field9841.field1769 + this.field9830 + this.field9840;
    }

    @OriginalMember(owner = "client!lr", name = "sa", descriptor = "(FFFFFFIII)V")
    public final void method1554(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field9852++;
        if (this.field9827) {
            float var10 = (float) this.method1552();
            float var11 = (float) this.method1549();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field9830 * var14;
            float var17 = (float) this.field9830 * var15;
            float var18 = (float) this.field9851 * var12;
            float var19 = (float) this.field9851 * var13;
            float var20 = (float) this.field9836 * -var12;
            float var21 = (float) this.field9836 * -var13;
            float var22 = (float) this.field9840 * -var14;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg4 = arg4 + var18 + var22;
            float var23 = (float) this.field9840 * -var15;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        this.field9841.method1101(10240, true);
        float var25 = arg5 + arg3 - arg1;
        this.field9829.method3115((byte) 118);
        this.field9829.method3194((byte) 75, this.field9841);
        this.field9829.method3146(7261, arg8);
        this.field9829.method3134(98, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field9841.field1762);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field9841.field1768, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field9841.field1768, this.field9841.field1762);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILfa;II)V")
    public final void method1557(int arg0, int arg1, class219 arg2, int arg3, int arg4) {
        field9839++;
        class257 var6 = (class257) arg2;
        class148 var7 = var6.field3291;
        this.field9841.method1101(10240, false);
        this.field9829.method3115((byte) 69);
        this.field9829.method3194((byte) 75, this.field9841);
        this.field9829.method3134(90, 1);
        this.field9829.method3126(1, -80);
        this.field9829.method3194((byte) 75, var7);
        this.field9829.method3185(7681, 8448, (byte) 55);
        this.field9829.method3175(34168, 1, 0, 768);
        this.field9829.method3146(7261, 1);
        int var8 = this.field9830 + arg1;
        int var9 = this.field9851 + arg0;
        int var10 = var9 + this.field9841.field1767;
        int var11 = this.field9841.field1769 + var8;
        float var12 = var7.field1768 / (float) var7.field1767;
        float var13 = var7.field1762 / (float) var7.field1769;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field1762 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field1762 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9841.field1762);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field9841.field1769);
        OpenGL.glMultiTexCoord2f(33984, this.field9841.field1768, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field9841.field1767 + var9, var8 - -this.field9841.field1769);
        OpenGL.glMultiTexCoord2f(33984, this.field9841.field1768, this.field9841.field1762);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field9841.field1767 + var9, var8);
        OpenGL.glEnd();
        this.field9829.method3175(5890, 1, 0, 768);
        this.field9829.method3134(125, 0);
        this.field9829.method3194((byte) 75, null);
        this.field9829.method3126(0, -107);
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "()I")
    public final int method1544() {
        field9837++;
        return this.field9841.field1769;
    }

    @OriginalMember(owner = "client!lr", name = "ba", descriptor = "(IIIIIII)V")
    public final void method1551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9832++;
        int var8 = arg0 + arg2;
        this.field9841.method1101(10240, false);
        int var9 = arg1 + arg3;
        this.field9829.method3115((byte) 12);
        this.field9829.method3194((byte) 75, this.field9841);
        this.field9829.method3146(7261, arg6);
        this.field9829.method3134(-94, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field9841.field1764 && !this.field9827) {
            float var10 = (float) arg3 * this.field9841.field1762 / (float) this.field9841.field1769;
            float var11 = (float) arg2 * this.field9841.field1768 / (float) this.field9841.field1767;
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
        OpenGL.glTranslatef((float) this.field9851, (float) this.field9830, 0.0F);
        int var12 = this.method1552();
        int var13 = this.method1549();
        int var14 = arg1 + this.field9841.field1769;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field9841.field1767 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field9841.field1762);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field9841.field1768, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field9841.field1768, this.field9841.field1762);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field9841.field1768 / (float) this.field9841.field1767;
                OpenGL.glTexCoord2f(0.0F, this.field9841.field1762);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field9841.field1762);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (var15 + this.field9841.field1769 - var9) * this.field9841.field1762 / (float) this.field9841.field1769;
            int var17 = this.field9841.field1767 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field9841.field1762);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field9841.field1768, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field9841.field1768, this.field9841.field1762);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field9841.field1768 / (float) this.field9841.field1767;
                OpenGL.glTexCoord2f(0.0F, this.field9841.field1762);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field9841.field1762);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "(III)V")
    public final void method1550(int arg0, int arg1, int arg2) {
        field9844++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field9849 = class439.method2413(this.field9829, (byte) 115, arg0, this.field9841.field1767, this.field9841.field1769, arg1);
        this.field9850 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!lr", name = "KA", descriptor = "(IIIIIII)V")
    public final void method1553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9834++;
        this.field9841.method1101(10240, true);
        this.field9829.method3115((byte) 111);
        this.field9829.method3146(7261, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field9827) {
            float var8 = (float) arg2 / (float) this.method1552();
            float var9 = (float) arg3 / (float) this.method1549();
            float var10 = (float) this.field9851 * var8 + (float) arg0;
            float var11 = (float) this.field9830 * var9 + (float) arg1;
            float var12 = (float) this.field9841.field1767 * var8 + var10;
            float var13 = (float) this.field9841.field1769 * var9 + var11;
            if (this.field9849 == null) {
                this.field9829.method3194((byte) 75, this.field9841);
                this.field9829.method3134(-53, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field9841.field1762);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field9841.field1768, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field9841.field1768, this.field9841.field1762);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method3884(arg4, 33985);
                this.field9849.method1101(10240, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9841.field1762);
                OpenGL.glTexCoord2f(0.0F, this.field9841.field1762);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field9841.field1768, 0.0F);
                OpenGL.glTexCoord2f(this.field9841.field1768, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field9841.field1768, this.field9841.field1762);
                OpenGL.glTexCoord2f(this.field9841.field1768, this.field9841.field1762);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method3882((byte) 107);
            }
        } else if (this.field9849 == null) {
            this.field9829.method3194((byte) 75, this.field9841);
            this.field9829.method3134(-36, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field9841.field1762);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field9841.field1768, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glTexCoord2f(this.field9841.field1768, this.field9841.field1762);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method3884(arg4, 33985);
            this.field9849.method1101(10240, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9841.field1762);
            OpenGL.glTexCoord2f(0.0F, this.field9841.field1762);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field9841.field1768, 0.0F);
            OpenGL.glTexCoord2f(this.field9841.field1768, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field9841.field1768, this.field9841.field1762);
            OpenGL.glTexCoord2f(this.field9841.field1768, this.field9841.field1762);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method3882((byte) 94);
        }
    }

    @OriginalMember(owner = "client!lr", name = "QA", descriptor = "()I")
    public final int method1556() {
        field9848++;
        return this.field9841.field1767;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method1547(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class219 arg6, int arg7, int arg8) {
        field9843++;
        class148 var10 = ((class257) arg6).field3291;
        if (this.field9827) {
            float var11 = (float) this.method1552();
            float var12 = (float) this.method1549();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field9830 * var15;
            float var18 = (float) this.field9830 * var16;
            float var19 = (float) this.field9851 * var13;
            float var20 = (float) this.field9851 * var14;
            float var21 = (float) this.field9836 * -var13;
            float var22 = (float) this.field9836 * -var14;
            float var23 = (float) this.field9840 * -var15;
            arg3 = arg3 + var22 + var18;
            arg2 = arg2 + var21 + var17;
            arg0 = arg0 + var19 + var17;
            arg4 = arg4 + var19 + var23;
            arg1 = arg1 + var20 + var18;
            float var24 = (float) this.field9840 * -var16;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field9841.method1101(10240, true);
        this.field9829.method3115((byte) 57);
        this.field9829.method3194((byte) 75, this.field9841);
        this.field9829.method3134(91, 1);
        this.field9829.method3126(1, -30);
        this.field9829.method3194((byte) 75, var10);
        this.field9829.method3185(7681, 8448, (byte) -119);
        this.field9829.method3175(34168, 1, 0, 768);
        this.field9829.method3146(7261, 1);
        float var27 = var10.field1768 / (float) var10.field1767;
        float var28 = var10.field1762 / (float) var10.field1769;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9841.field1762);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg0) * var27, var10.field1762 - ((float) (-arg8) + arg1) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field1762 - (((float) (-arg8) + arg5) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field9841.field1768, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field1762 - (((float) (-arg8) + var26) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field9841.field1768, this.field9841.field1762);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field1762 - (((float) (-arg8) + arg3) * var28));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field9829.method3175(5890, 1, 0, 768);
        this.field9829.method3134(126, 0);
        this.field9829.method3194((byte) 75, null);
        this.field9829.method3126(0, -125);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public static void method3883(int arg0) {
        field9847 = null;
        if (arg0 == 19357) {
            field9833 = null;
            field9846 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "(IIIII)V")
    public final void method1543(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9831++;
        this.field9841.method1101(10240, false);
        this.field9829.method3115((byte) 44);
        this.field9829.method3146(7261, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field9830 + arg1;
        int var7 = this.field9851 + arg0;
        if (this.field9849 == null) {
            this.field9829.method3194((byte) 75, this.field9841);
            this.field9829.method3134(-60, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field9841.field1762);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field9841.field1769 + var6);
            OpenGL.glTexCoord2f(this.field9841.field1768, 0.0F);
            OpenGL.glVertex2i(this.field9841.field1767 + var7, var6 - -this.field9841.field1769);
            OpenGL.glTexCoord2f(this.field9841.field1768, this.field9841.field1762);
            OpenGL.glVertex2i(this.field9841.field1767 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method3884(arg2, 33985);
        this.field9849.method1101(10240, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9841.field1762);
        OpenGL.glTexCoord2f(0.0F, this.field9841.field1762);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field9841.field1769 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field9841.field1768, 0.0F);
        OpenGL.glTexCoord2f(this.field9841.field1768, 0.0F);
        OpenGL.glVertex2i(this.field9841.field1767 + var7, this.field9841.field1769 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field9841.field1768, this.field9841.field1762);
        OpenGL.glTexCoord2f(this.field9841.field1768, this.field9841.field1762);
        OpenGL.glVertex2i(this.field9841.field1767 + var7, var6);
        OpenGL.glEnd();
        this.method3882((byte) 116);
    }

    @OriginalMember(owner = "client!lr", name = "GA", descriptor = "(IIIIII)V")
    public final void method1546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9841.method760(arg3, arg1, arg4, -10237, arg2, arg5, arg0);
        field9835++;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(II)V")
    private final void method3884(int arg0, int arg1) {
        this.field9829.method3126(1, -124);
        field9826++;
        this.field9829.method3194((byte) 75, this.field9841);
        if (arg1 != 33985) {
            this.field9850 = -84;
        }
        this.field9829.method3185(this.field9829.method3155(arg0, false), 7681, (byte) 88);
        this.field9829.method3175(34167, 1, 1, 768);
        this.field9829.method3127(0, 770, 34168, 17111);
        this.field9829.method3126(0, -78);
        this.field9829.method3194((byte) 75, this.field9849);
        this.field9829.method3185(34479, 7681, (byte) -93);
        this.field9829.method3175(34166, 1, 1, 768);
        if (this.field9850 == 0) {
            this.field9829.method3191(0.0F, 1.0F, 32521, 0.5F, 0.5F);
        } else if (this.field9850 == 1) {
            this.field9829.method3191(0.0F, 0.5F, 32521, 1.0F, 0.5F);
        } else if (this.field9850 == 2) {
            this.field9829.method3191(0.0F, 0.5F, 32521, 0.5F, 1.0F);
            return;
        } else if (this.field9850 == 3) {
            this.field9829.method3191(0.0F, 128.5F, arg1 - 1464, 128.5F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Ljaa;IIZ)V")
    public class703(class576 arg0, int arg1, int arg2, boolean arg3) {
        this.field9829 = arg0;
        this.field9841 = class666.method3707(arg3 ? 6408 : 6407, arg0, 10388, arg2, arg1);
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Ljaa;IIII)V")
    public class703(class576 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9829 = arg0;
        this.field9841 = class439.method2413(arg0, (byte) 113, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Ljaa;II[III)V")
    public class703(class576 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field9829 = arg0;
        this.field9841 = class216.method1254((byte) 10, arg3, arg2, false, arg0, arg1);
    }
}
