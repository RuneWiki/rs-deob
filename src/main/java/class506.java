import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class506 extends class536 {

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    private int field7202 = 0;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    private int field7194 = 0;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    private int field7185 = 0;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "Z")
    private boolean field7208 = false;

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "I")
    private int field7207 = 0;

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
    private int field7212 = 0;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "Lwh;")
    private class148 field7201;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "Liba;")
    private class531 field7209;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "Lef;")
    public static class489 field7196 = new class489();

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "Liba;")
    private class531 field7191;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "[I")
    public static int[] field7199;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1518(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class488 arg7, int arg8, int arg9) {
        field7206++;
        class531 var11 = ((class178) arg7).field2754;
        if (this.field7208) {
            float var12 = (float) this.method1504();
            float var13 = (float) this.method1514();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field7202 * var16;
            float var19 = (float) this.field7202 * var17;
            float var20 = (float) this.field7212 * var14;
            float var21 = (float) this.field7212 * var15;
            float var22 = (float) this.field7207 * -var14;
            float var23 = (float) this.field7207 * -var15;
            float var24 = (float) this.field7185 * -var16;
            float var25 = (float) this.field7185 * -var17;
            arg4 = arg4 + var20 + var24;
            arg3 = arg3 + var23 + var19;
            arg0 = arg0 + var20 + var18;
            arg2 = arg2 + var22 + var18;
            arg1 = arg1 + var21 + var19;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field7209.method1362((arg6 & 0x1) != 0, 1287);
        float var27 = arg5 + arg3 - arg1;
        this.field7201.method1067(-2);
        this.field7201.method1088(this.field7209, -27749);
        this.field7201.method1066(1, 260);
        this.field7201.method1024(1, (byte) -11);
        this.field7201.method1088(var11, -27749);
        this.field7201.method1043((byte) 87, 8448, 7681);
        this.field7201.method1052(34168, 34176, 0, 768);
        this.field7201.method1039(false, 1);
        float var28 = var11.field7564 / (float) var11.field7561;
        float var29 = var11.field7568 / (float) var11.field7569;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field7209.field7568);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field7568 - ((arg1 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field7568 - ((arg5 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field7209.field7564, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + var26) * var28, var11.field7568 - (((float) (-arg9) + var27) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field7209.field7564, this.field7209.field7568);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field7568 - ((arg3 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field7201.method1052(5890, 34176, 0, 768);
        this.field7201.method1066(0, 260);
        this.field7201.method1088(null, -27749);
        this.field7201.method1024(0, (byte) -11);
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(IIIII)V")
    public static final void method3002(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class624.field8740 != null) {
            class624.field8740[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class21.field225 != null) {
            class21.field225[arg0][arg1] = (short) arg3;
        }
        if (class289.field4115 != null) {
            class289.field4115[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(IIIIIII)V")
    public final void method1513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7210++;
        int var8 = arg0 + arg2;
        this.field7209.method1362(false, 1287);
        int var9 = arg1 + arg3;
        this.field7201.method1067(-2);
        this.field7201.method1088(this.field7209, -27749);
        this.field7201.method1039(false, arg6);
        this.field7201.method1066(arg4, 260);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field7209.field7567 && !this.field7208) {
            float var10 = (float) arg3 * this.field7209.field7568 / (float) this.field7209.field7569;
            float var11 = (float) arg2 * this.field7209.field7564 / (float) this.field7209.field7561;
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
        OpenGL.glTranslatef((float) this.field7212, (float) this.field7202, 0.0F);
        int var12 = this.method1504();
        int var13 = this.method1514();
        int var14 = this.field7209.field7569 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field7209.field7561 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field7209.field7568);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field7209.field7564, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field7209.field7564, this.field7209.field7568);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field7209.field7564 / (float) this.field7209.field7561;
                OpenGL.glTexCoord2f(0.0F, this.field7209.field7568);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field7209.field7568);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (var15 + this.field7209.field7569 - var9) * this.field7209.field7568 / (float) this.field7209.field7569;
            int var17 = arg0 + this.field7209.field7561;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field7209.field7568);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field7209.field7564, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field7209.field7564, this.field7209.field7568);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field7209.field7564 / (float) this.field7209.field7561;
                OpenGL.glTexCoord2f(0.0F, this.field7209.field7568);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field7209.field7568);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1508(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field7208) {
            float var11 = (float) this.method1504();
            float var12 = (float) this.method1514();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field7202 * var15;
            float var18 = (float) this.field7202 * var16;
            float var19 = (float) this.field7212 * var13;
            float var20 = (float) this.field7212 * var14;
            float var21 = (float) this.field7207 * -var13;
            float var22 = (float) this.field7207 * -var14;
            float var23 = (float) this.field7185 * -var15;
            arg4 = arg4 + var19 + var23;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            float var24 = (float) this.field7185 * -var16;
            arg5 = arg5 + var20 + var24;
        }
        field7186++;
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field7209.method1362((arg9 & 0x1) != 0, 1287);
        this.field7201.method1067(-2);
        this.field7201.method1088(this.field7209, -27749);
        this.field7201.method1039(false, arg8);
        this.field7201.method1066(arg6, 260);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field7209.field7568);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field7209.field7564, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field7209.field7564, this.field7209.field7568);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "()I")
    public final int method1504() {
        field7184++;
        return this.field7209.field7561 + this.field7212 + this.field7207;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII[III)V")
    private final void method3003(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field7205++;
        this.field7209.method634(arg2, arg6, arg0, arg4, true, arg3, 4, arg5, arg1);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIIIII)V")
    public final void method132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field7209.method1362((arg7 & 0x1) != 0, 1287);
        field7189++;
        this.field7201.method1067(-2);
        this.field7201.method1039(false, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field7208) {
            float var9 = (float) arg2 / (float) this.method1504();
            float var10 = (float) arg3 / (float) this.method1514();
            float var11 = (float) this.field7212 * var9 + (float) arg0;
            float var12 = (float) this.field7202 * var10 + (float) arg1;
            float var13 = (float) this.field7209.field7561 * var9 + var11;
            float var14 = (float) this.field7209.field7569 * var10 + var12;
            if (this.field7191 == null) {
                this.field7201.method1088(this.field7209, -27749);
                this.field7201.method1066(arg4, 260);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field7209.field7568);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field7209.field7564, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field7209.field7564, this.field7209.field7568);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method3004(104, arg4);
                this.field7191.method1362(true, 1287);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7209.field7568);
                OpenGL.glTexCoord2f(0.0F, this.field7209.field7568);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field7209.field7564, 0.0F);
                OpenGL.glTexCoord2f(this.field7209.field7564, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field7209.field7564, this.field7209.field7568);
                OpenGL.glTexCoord2f(this.field7209.field7564, this.field7209.field7568);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method3005(true);
            }
        } else if (this.field7191 == null) {
            this.field7201.method1088(this.field7209, -27749);
            this.field7201.method1066(arg4, 260);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field7209.field7568);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field7209.field7564, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field7209.field7564, this.field7209.field7568);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method3004(96, arg4);
            this.field7191.method1362(true, 1287);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7209.field7568);
            OpenGL.glTexCoord2f(0.0F, this.field7209.field7568);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field7209.field7564, 0.0F);
            OpenGL.glTexCoord2f(this.field7209.field7564, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field7209.field7564, this.field7209.field7568);
            OpenGL.glTexCoord2f(this.field7209.field7564, this.field7209.field7568);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method3005(true);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)V")
    public final void method133(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7209.method1362(false, 1287);
        field7200++;
        this.field7201.method1067(-2);
        this.field7201.method1039(false, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field7212 + arg0;
        int var7 = this.field7202 + arg1;
        if (this.field7191 == null) {
            this.field7201.method1088(this.field7209, -27749);
            this.field7201.method1066(arg2, 260);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field7209.field7568);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field7209.field7569 + var7);
            OpenGL.glTexCoord2f(this.field7209.field7564, 0.0F);
            OpenGL.glVertex2i(var6 + this.field7209.field7561, var7 - -this.field7209.field7569);
            OpenGL.glTexCoord2f(this.field7209.field7564, this.field7209.field7568);
            OpenGL.glVertex2i(this.field7209.field7561 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method3004(121, arg2);
        this.field7191.method1362(false, 1287);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7209.field7568);
        OpenGL.glTexCoord2f(0.0F, this.field7209.field7568);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field7209.field7569 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field7209.field7564, 0.0F);
        OpenGL.glTexCoord2f(this.field7209.field7564, 0.0F);
        OpenGL.glVertex2i(this.field7209.field7561 + var6, var7 - -this.field7209.field7569);
        OpenGL.glMultiTexCoord2f(33985, this.field7209.field7564, this.field7209.field7568);
        OpenGL.glTexCoord2f(this.field7209.field7564, this.field7209.field7568);
        OpenGL.glVertex2i(this.field7209.field7561 + var6, var7);
        OpenGL.glEnd();
        this.method3005(true);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "()I")
    public final int method1517() {
        field7193++;
        return this.field7209.field7561;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "()I")
    public final int method1510() {
        field7198++;
        return this.field7209.field7569;
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "()I")
    public final int method1514() {
        field7203++;
        return this.field7209.field7569 + this.field7202 + this.field7185;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILaa;II)V")
    public final void method131(int arg0, int arg1, class488 arg2, int arg3, int arg4) {
        field7188++;
        class178 var6 = (class178) arg2;
        class531 var7 = var6.field2754;
        this.field7209.method1362(false, 1287);
        this.field7201.method1067(-2);
        this.field7201.method1088(this.field7209, -27749);
        this.field7201.method1066(1, 260);
        this.field7201.method1024(1, (byte) -11);
        this.field7201.method1088(var7, -27749);
        this.field7201.method1043((byte) 94, 8448, 7681);
        this.field7201.method1052(34168, 34176, 0, 768);
        this.field7201.method1039(false, 1);
        int var8 = this.field7212 + arg0;
        int var9 = this.field7202 + arg1;
        int var10 = this.field7209.field7561 + var8;
        int var11 = this.field7209.field7569 + var9;
        float var12 = var7.field7564 / (float) var7.field7561;
        float var13 = var7.field7568 / (float) var7.field7569;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field7568 - ((float) (var9 - arg4) * var13);
        float var17 = var7.field7568 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field7209.field7568);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field7209.field7569 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field7209.field7564, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var8 + this.field7209.field7561, this.field7209.field7569 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field7209.field7564, this.field7209.field7568);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field7209.field7561 + var8, var9);
        OpenGL.glEnd();
        this.field7201.method1052(5890, 34176, 0, 768);
        this.field7201.method1066(0, 260);
        this.field7201.method1088(null, -27749);
        this.field7201.method1024(0, (byte) -11);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII)V")
    public final void method1505(int arg0, int arg1, int arg2, int arg3) {
        this.field7212 = arg0;
        this.field7185 = arg3;
        field7204++;
        this.field7207 = arg2;
        this.field7202 = arg1;
        this.field7208 = this.field7212 != 0 || this.field7202 != 0 || this.field7207 != 0 || this.field7185 != 0;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([I)V")
    public final void method1507(int[] arg0) {
        field7197++;
        arg0[0] = this.field7212;
        arg0[3] = this.field7185;
        arg0[1] = this.field7202;
        arg0[2] = this.field7207;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)V")
    private final void method3004(int arg0, int arg1) {
        this.field7201.method1024(1, (byte) -11);
        field7187++;
        this.field7201.method1088(this.field7209, -27749);
        if (arg0 < 93) {
            this.method135(0, 99, -22, 8, -52, 115);
        }
        this.field7201.method1043((byte) -38, 7681, this.field7201.method1091(arg1, 1));
        this.field7201.method1052(34167, 34176, 1, 768);
        this.field7201.method1086(34168, 0, 770, 37);
        this.field7201.method1024(0, (byte) -11);
        this.field7201.method1088(this.field7191, -27749);
        this.field7201.method1043((byte) -54, 7681, 34479);
        this.field7201.method1052(34166, 34176, 1, 768);
        if (this.field7194 == 0) {
            this.field7201.method1085(-2, 1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field7194 == 1) {
            this.field7201.method1085(-2, 0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field7194 == 2) {
            this.field7201.method1085(-2, 0.5F, 0.5F, 1.0F, 0.0F);
            return;
        } else if (this.field7194 == 3) {
            this.field7201.method1085(-2, 128.5F, 128.5F, 128.5F, 0.0F);
            return;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)V")
    public final void method130(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field7211++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field7191 = class442.method2749(this.field7209.field7569, this.field7209.field7561, arg0, arg1, this.field7201, 3553);
        this.field7194 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIII)V")
    public final void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field7201.field2304) {
            int[] var7 = this.field7201.method428(arg4, arg5, arg2, arg3);
            if (var7 != null) {
                for (int var8 = 0; var8 < var7.length; var8++) {
                    var7[var8] = class625.method3600(var7[var8], -16777216);
                }
                this.method3003(arg0, arg1, arg2, arg3, var7, 0, arg2);
            }
        } else {
            this.field7209.method633(arg3, arg2, arg1, 0, arg0, arg5, arg4);
        }
        field7195++;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V")
    private final void method3005(boolean arg0) {
        field7192++;
        this.field7201.method1024(1, (byte) -11);
        this.field7201.method1088(null, -27749);
        this.field7201.method1043((byte) -82, 8448, 8448);
        this.field7201.method1052(34168, 34176, 1, 768);
        if (arg0) {
            this.field7201.method1086(5890, 0, 770, 92);
            this.field7201.method1024(0, (byte) -11);
            this.field7201.method1052(34168, 34176, 1, 768);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
    public static void method3006(int arg0) {
        field7196 = null;
        if (arg0 == 26603) {
            field7199 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lwh;IIZ)V")
    public class506(class148 arg0, int arg1, int arg2, boolean arg3) {
        this.field7201 = arg0;
        this.field7209 = class208.method1403(arg1, arg2, arg3 ? 6408 : 6407, 3553, arg0);
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lwh;IIII)V")
    public class506(class148 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7201 = arg0;
        this.field7209 = class442.method2749(arg4, arg3, arg1, arg2, arg0, 3553);
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lwh;II[III)V")
    public class506(class148 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field7201 = arg0;
        this.field7209 = class238.method1581((byte) 78, arg4, arg1, false, arg5, arg2, arg3, arg0);
    }
}
