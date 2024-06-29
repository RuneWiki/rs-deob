import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class557 extends class496 {

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
    private int field7691 = 0;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "I")
    private int field7694 = 0;

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "Z")
    private boolean field7689 = false;

    @OriginalMember(owner = "client!nda", name = "w", descriptor = "I")
    private int field7708 = 0;

    @OriginalMember(owner = "client!nda", name = "x", descriptor = "I")
    private int field7709 = 0;

    @OriginalMember(owner = "client!nda", name = "z", descriptor = "I")
    private int field7711 = 0;

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "Lqo;")
    private class22 field7692;

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "Leba;")
    private class588 field7696;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "I")
    public static int field7690;

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!nda", name = "l", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!nda", name = "m", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!nda", name = "n", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!nda", name = "o", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!nda", name = "p", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!nda", name = "q", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!nda", name = "r", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!nda", name = "s", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!nda", name = "t", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!nda", name = "u", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!nda", name = "v", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!nda", name = "y", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "Leba;")
    private class588 field7693;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(CB)C", line = 3)
    public static final char method3200(char arg0, byte arg1) {
        field7706++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else if (arg0 == 'œ') {
            return 'e';
        } else {
            return (char) (arg1 >= -18 ? 'M' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(FFFFFFIIII)V", line = 30)
    public final void method1621(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field7697++;
        if (this.field7689) {
            float var11 = (float) this.method1618();
            float var12 = (float) this.method1614();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field7708 * var15;
            float var18 = (float) this.field7708 * var16;
            float var19 = (float) this.field7709 * var13;
            float var20 = (float) this.field7709 * var14;
            float var21 = (float) this.field7711 * -var13;
            float var22 = (float) this.field7711 * -var14;
            float var23 = (float) this.field7694 * -var15;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            float var24 = (float) this.field7694 * -var16;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field7696.method456(9728, (arg9 & 0x1) != 0);
        this.field7692.method314(59);
        this.field7692.method256((byte) -93, this.field7696);
        this.field7692.method222(arg8, 1);
        this.field7692.method237(0, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field7696.field8015);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field7696.field8014, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field7696.field8014, this.field7696.field8015);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "()I", line = 98)
    public final int method1619() {
        field7701++;
        return this.field7696.field8016;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)V", line = 106)
    public final void method1194(int arg0, int arg1, int arg2) {
        field7700++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field7693 = class453.method2697(this.field7692, arg0, 34037, this.field7696.field8017, arg1, this.field7696.field8016);
        this.field7691 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "([I)V", line = 132)
    public final void method1625(int[] arg0) {
        arg0[1] = this.field7708;
        field7707++;
        arg0[3] = this.field7694;
        arg0[0] = this.field7709;
        arg0[2] = this.field7711;
    }

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "()I", line = 150)
    public final int method1614() {
        field7695++;
        return this.field7696.field8016 + this.field7708 + this.field7694;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIII)V", line = 159)
    public final void method1193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7698++;
        this.field7696.method3069(arg0, arg3, arg5, arg1, arg4, (byte) -120, arg2);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IILaa;II)V", line = 169)
    public final void method1199(int arg0, int arg1, class487 arg2, int arg3, int arg4) {
        field7686++;
        class683 var6 = (class683) arg2;
        class588 var7 = var6.field9252;
        this.field7696.method456(9728, false);
        this.field7692.method314(75);
        this.field7692.method256((byte) -99, this.field7696);
        this.field7692.method237(0, 1);
        this.field7692.method190(-15039, 1);
        this.field7692.method256((byte) -123, var7);
        this.field7692.method175(7681, (byte) -101, 8448);
        this.field7692.method239(34168, 768, (byte) -87, 0);
        this.field7692.method222(1, 1);
        int var8 = this.field7709 + arg0;
        int var9 = this.field7708 + arg1;
        int var10 = this.field7696.field8017 + var8;
        int var11 = var9 + this.field7696.field8016;
        float var12 = var7.field8014 / (float) var7.field8017;
        float var13 = var7.field8015 / (float) var7.field8016;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field8015 - (float) (var9 - arg4) * var13;
        float var17 = var7.field8015 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field7696.field8015);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, var9 + this.field7696.field8016);
        OpenGL.glMultiTexCoord2f(33984, this.field7696.field8014, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var8 + this.field7696.field8017, this.field7696.field8016 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field7696.field8014, this.field7696.field8015);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field7696.field8017 + var8, var9);
        OpenGL.glEnd();
        this.field7692.method239(5890, 768, (byte) -87, 0);
        this.field7692.method237(0, 0);
        this.field7692.method256((byte) -105, null);
        this.field7692.method190(-15039, 0);
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lqo;IIZ)V", line = 724)
    public class557(class22 arg0, int arg1, int arg2, boolean arg3) {
        this.field7692 = arg0;
        this.field7696 = class661.method3717(81, arg0, arg3 ? 6408 : 6407, arg1, arg2);
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lqo;IIII)V", line = 734)
    public class557(class22 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7692 = arg0;
        this.field7696 = class453.method2697(arg0, arg1, 34037, arg3, arg2, arg4);
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lqo;II[III)V", line = 744)
    public class557(class22 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field7692 = arg0;
        this.field7696 = class466.method2740(arg3, arg4, arg5, arg2, arg1, arg0, false, (byte) 12);
    }

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "(IIII)V", line = 231)
    public final void method1615(int arg0, int arg1, int arg2, int arg3) {
        this.field7709 = arg0;
        this.field7711 = arg2;
        this.field7708 = arg1;
        field7688++;
        this.field7694 = arg3;
        this.field7689 = this.field7709 != 0 || this.field7708 != 0 || this.field7711 != 0 || this.field7694 != 0;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)V", line = 244)
    private final void method3201(byte arg0) {
        field7690++;
        if (arg0 != 9) {
            return;
        }
        this.field7692.method190(-15039, 1);
        this.field7692.method256((byte) -78, null);
        this.field7692.method175(8448, (byte) -79, 8448);
        this.field7692.method239(34168, 768, (byte) -87, 1);
        this.field7692.method274(false, 0, 770, 5890);
        this.field7692.method190(-15039, 0);
        this.field7692.method239(34168, 768, (byte) -87, 1);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 262)
    public final void method1623(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class487 arg7, int arg8, int arg9) {
        field7710++;
        class588 var11 = ((class683) arg7).field9252;
        if (this.field7689) {
            float var12 = (float) this.method1618();
            float var13 = (float) this.method1614();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field7708 * var16;
            float var19 = (float) this.field7708 * var17;
            float var20 = (float) this.field7709 * var14;
            float var21 = (float) this.field7709 * var15;
            float var22 = (float) this.field7711 * -var14;
            float var23 = (float) this.field7711 * -var15;
            float var24 = (float) this.field7694 * -var16;
            arg3 = arg3 + var23 + var19;
            arg2 = arg2 + var22 + var18;
            arg4 = arg4 + var20 + var24;
            arg0 = arg0 + var20 + var18;
            arg1 = arg1 + var21 + var19;
            float var25 = (float) this.field7694 * -var17;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field7696.method456(9728, (arg6 & 0x1) != 0);
        float var27 = arg5 + arg3 - arg1;
        this.field7692.method314(106);
        this.field7692.method256((byte) -123, this.field7696);
        this.field7692.method237(0, 1);
        this.field7692.method190(-15039, 1);
        this.field7692.method256((byte) -98, var11);
        this.field7692.method175(7681, (byte) -17, 8448);
        this.field7692.method239(34168, 768, (byte) -87, 0);
        this.field7692.method222(1, 1);
        float var28 = var11.field8014 / (float) var11.field8017;
        float var29 = var11.field8015 / (float) var11.field8016;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field7696.field8015);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field8015 - ((float) (-arg9) + arg1) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg4) * var28, var11.field8015 - ((arg5 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field7696.field8014, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field8015 - ((var27 - (float) arg9) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field7696.field8014, this.field7696.field8015);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field8015 - (arg3 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field7692.method239(5890, 768, (byte) -87, 0);
        this.field7692.method237(0, 0);
        this.field7692.method256((byte) -84, null);
        this.field7692.method190(-15039, 0);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "()I", line = 351)
    public final int method1618() {
        field7702++;
        return this.field7696.field8017 + this.field7709 + this.field7711;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIII)V", line = 367)
    public final void method1200(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7696.method456(9728, false);
        field7687++;
        this.field7692.method314(121);
        this.field7692.method222(arg4, 1);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field7709 + arg0;
        int var7 = this.field7708 + arg1;
        if (this.field7693 == null) {
            this.field7692.method256((byte) -127, this.field7696);
            this.field7692.method237(0, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field7696.field8015);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, var7 + this.field7696.field8016);
            OpenGL.glTexCoord2f(this.field7696.field8014, 0.0F);
            OpenGL.glVertex2i(this.field7696.field8017 + var6, this.field7696.field8016 + var7);
            OpenGL.glTexCoord2f(this.field7696.field8014, this.field7696.field8015);
            OpenGL.glVertex2i(this.field7696.field8017 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method3202(arg2, 3);
        this.field7693.method456(9728, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7696.field8015);
        OpenGL.glTexCoord2f(0.0F, this.field7696.field8015);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field7696.field8016 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field7696.field8014, 0.0F);
        OpenGL.glTexCoord2f(this.field7696.field8014, 0.0F);
        OpenGL.glVertex2i(this.field7696.field8017 + var6, this.field7696.field8016 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field7696.field8014, this.field7696.field8015);
        OpenGL.glTexCoord2f(this.field7696.field8014, this.field7696.field8015);
        OpenGL.glVertex2i(this.field7696.field8017 + var6, var7);
        OpenGL.glEnd();
        this.method3201((byte) 9);
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(II)V", line = 418)
    private final void method3202(int arg0, int arg1) {
        this.field7692.method190(-15039, 1);
        field7703++;
        this.field7692.method256((byte) -82, this.field7696);
        this.field7692.method175(this.field7692.method286((byte) 17, arg0), (byte) -61, 7681);
        this.field7692.method239(34167, 768, (byte) -87, 1);
        if (arg1 != 3) {
            this.method1200(46, -15, -58, 122, 11);
        }
        this.field7692.method274(false, 0, 770, 34168);
        this.field7692.method190(-15039, 0);
        this.field7692.method256((byte) -108, this.field7693);
        this.field7692.method175(34479, (byte) -47, 7681);
        this.field7692.method239(34166, 768, (byte) -87, 1);
        if (this.field7691 == 0) {
            this.field7692.method209(0.0F, 1.0F, 0.5F, (byte) 50, 0.5F);
        } else if (this.field7691 == 1) {
            this.field7692.method209(0.0F, 0.5F, 0.5F, (byte) 64, 1.0F);
        } else if (this.field7691 == 2) {
            this.field7692.method209(0.0F, 0.5F, 1.0F, (byte) 95, 0.5F);
        } else if (this.field7691 == 3) {
            this.field7692.method209(0.0F, 128.5F, 128.5F, (byte) 63, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIIII)V", line = 454)
    public final void method1622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7704++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field7696.method456(9728, false);
        this.field7692.method314(54);
        this.field7692.method256((byte) -88, this.field7696);
        this.field7692.method222(arg6, 1);
        this.field7692.method237(0, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field7696.field8018 && !this.field7689) {
            float var10 = (float) arg3 * this.field7696.field8015 / (float) this.field7696.field8016;
            float var11 = (float) arg2 * this.field7696.field8014 / (float) this.field7696.field8017;
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
        OpenGL.glTranslatef((float) this.field7709, (float) this.field7708, 0.0F);
        int var12 = this.method1618();
        int var13 = this.method1614();
        int var14 = arg1 + this.field7696.field8016;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field7696.field8017 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field7696.field8015);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field7696.field8014, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field7696.field8014, this.field7696.field8015);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field7696.field8014 / (float) this.field7696.field8017;
                OpenGL.glTexCoord2f(0.0F, this.field7696.field8015);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field7696.field8015);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (var15 + this.field7696.field8016 - var9) * this.field7696.field8015 / (float) this.field7696.field8016;
            int var17 = this.field7696.field8017 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field7696.field8015);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field7696.field8014, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field7696.field8014, this.field7696.field8015);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field7696.field8014 / (float) this.field7696.field8017;
                OpenGL.glTexCoord2f(0.0F, this.field7696.field8015);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field7696.field8015);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "()I", line = 589)
    public final int method1626() {
        field7699++;
        return this.field7696.field8017;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIIIII)V", line = 597)
    public final void method1196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7705++;
        this.field7696.method456(9728, (arg7 & 0x1) != 0);
        this.field7692.method314(103);
        this.field7692.method222(arg6, 1);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field7689) {
            float var9 = (float) arg2 / (float) this.method1618();
            float var10 = (float) arg3 / (float) this.method1614();
            float var11 = (float) this.field7709 * var9 + (float) arg0;
            float var12 = (float) this.field7708 * var10 + (float) arg1;
            float var13 = (float) this.field7696.field8017 * var9 + var11;
            float var14 = (float) this.field7696.field8016 * var10 + var12;
            if (this.field7693 == null) {
                this.field7692.method256((byte) -85, this.field7696);
                this.field7692.method237(0, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field7696.field8015);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field7696.field8014, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field7696.field8014, this.field7696.field8015);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method3202(arg4, 3);
                this.field7693.method456(9728, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7696.field8015);
                OpenGL.glTexCoord2f(0.0F, this.field7696.field8015);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field7696.field8014, 0.0F);
                OpenGL.glTexCoord2f(this.field7696.field8014, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field7696.field8014, this.field7696.field8015);
                OpenGL.glTexCoord2f(this.field7696.field8014, this.field7696.field8015);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method3201((byte) 9);
            }
        } else if (this.field7693 == null) {
            this.field7692.method256((byte) -101, this.field7696);
            this.field7692.method237(0, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field7696.field8015);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field7696.field8014, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field7696.field8014, this.field7696.field8015);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method3202(arg4, 3);
            this.field7693.method456(9728, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7696.field8015);
            OpenGL.glTexCoord2f(0.0F, this.field7696.field8015);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field7696.field8014, 0.0F);
            OpenGL.glTexCoord2f(this.field7696.field8014, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field7696.field8014, this.field7696.field8015);
            OpenGL.glTexCoord2f(this.field7696.field8014, this.field7696.field8015);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method3201((byte) 9);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(JJ)J", line = 706)
    public static long method3203(long arg0, long arg1) {
        return arg0 ^ arg1;
    }
}
