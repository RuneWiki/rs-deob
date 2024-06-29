import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class493 extends class16 {

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    private int field7194 = 0;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    private int field7202 = 0;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    private int field7192 = 0;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
    private int field7199 = 0;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "Z")
    private boolean field7197 = false;

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "I")
    private int field7210 = 0;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "Lef;")
    private class338 field7190;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "Ltq;")
    private class442 field7207;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "Z")
    public static boolean field7200 = false;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "D")
    public static double field7198 = -1.0D;

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "[I")
    public static int[] field7208 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
    public static int field7201 = 0;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!gn", name = "D", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!gn", name = "E", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!gn", name = "F", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "Ltq;")
    private class442 field7187;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)V", line = 3)
    private final void method2885(int arg0, int arg1) {
        field7204++;
        this.field7190.method1950(-29847, 1);
        this.field7190.method1996(arg1 ^ 0x302, this.field7207);
        this.field7190.method1963(true, this.field7190.method1970(-11037, arg0), 7681);
        this.field7190.method1975(34176, 34167, arg1, 1);
        this.field7190.method1973(34168, 0, 0, 770);
        this.field7190.method1950(arg1 - 30615, 0);
        this.field7190.method1996(arg1 - 766, this.field7187);
        this.field7190.method1963(true, 34479, 7681);
        this.field7190.method1975(34176, 34166, 768, 1);
        if (this.field7202 == 0) {
            this.field7190.method1971(0.0F, 0.5F, 1.0F, 0.5F, 17670);
        } else if (this.field7202 == 1) {
            this.field7190.method1971(0.0F, 0.5F, 0.5F, 1.0F, arg1 + 16902);
        } else if (this.field7202 == 2) {
            this.field7190.method1971(0.0F, 1.0F, 0.5F, 0.5F, 17670);
            return;
        } else if (this.field7202 == 3) {
            this.field7190.method1971(0.0F, 128.5F, 128.5F, 128.5F, 17670);
            return;
        }
    }

    @OriginalMember(owner = "client!gn", name = "JA", descriptor = "(IIIIIII)V", line = 35)
    public final void method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7214++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field7207.method335((byte) 51, false);
        this.field7190.method1934(-3);
        this.field7190.method1996(2, this.field7207);
        this.field7190.method1976(-93, arg6);
        this.field7190.method1974(arg4, 4609);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field7207.field6537 && !this.field7197) {
            float var10 = (float) arg3 * this.field7207.field6543 / (float) this.field7207.field6545;
            float var11 = (float) arg2 * this.field7207.field6542 / (float) this.field7207.field6539;
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
        OpenGL.glTranslatef((float) this.field7192, (float) this.field7210, 0.0F);
        int var12 = this.method84();
        int var13 = this.method93();
        int var14 = this.field7207.field6545 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field7207.field6539 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field7207.field6543);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field7207.field6542, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field7207.field6542, this.field7207.field6543);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field7207.field6542 / (float) this.field7207.field6539;
                OpenGL.glTexCoord2f(0.0F, this.field7207.field6543);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field7207.field6543);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field7207.field6545 + var15 - var9) * this.field7207.field6543 / (float) this.field7207.field6545;
            int var17 = arg0 + this.field7207.field6539;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field7207.field6543);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field7207.field6542, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field7207.field6542, this.field7207.field6543);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field7207.field6542 / (float) this.field7207.field6539;
                OpenGL.glTexCoord2f(0.0F, this.field7207.field6543);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field7207.field6543);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!gn", name = "ma", descriptor = "()I", line = 174)
    public final int method98() {
        field7205++;
        return this.field7207.field6545;
    }

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "(IIIII)V", line = 184)
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7207.method335((byte) 51, false);
        field7191++;
        this.field7190.method1934(-3);
        this.field7190.method1976(-94, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field7192 + arg0;
        int var7 = this.field7210 + arg1;
        if (this.field7187 == null) {
            this.field7190.method1996(2, this.field7207);
            this.field7190.method1974(arg2, 4609);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field7207.field6543);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field7207.field6545 + var7);
            OpenGL.glTexCoord2f(this.field7207.field6542, 0.0F);
            OpenGL.glVertex2i(this.field7207.field6539 + var6, var7 - -this.field7207.field6545);
            OpenGL.glTexCoord2f(this.field7207.field6542, this.field7207.field6543);
            OpenGL.glVertex2i(this.field7207.field6539 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method2885(arg2, 768);
        this.field7187.method335((byte) 51, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7207.field6543);
        OpenGL.glTexCoord2f(0.0F, this.field7207.field6543);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field7207.field6545 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field7207.field6542, 0.0F);
        OpenGL.glTexCoord2f(this.field7207.field6542, 0.0F);
        OpenGL.glVertex2i(var6 + this.field7207.field6539, this.field7207.field6545 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field7207.field6542, this.field7207.field6543);
        OpenGL.glTexCoord2f(this.field7207.field6542, this.field7207.field6543);
        OpenGL.glVertex2i(this.field7207.field6539 + var6, var7);
        OpenGL.glEnd();
        this.method2888(-121);
    }

    @OriginalMember(owner = "client!gn", name = "MA", descriptor = "(IIII)V", line = 236)
    public final void method97(int arg0, int arg1, int arg2, int arg3) {
        field7183++;
        this.field7194 = arg2;
        this.field7199 = arg3;
        this.field7192 = arg0;
        this.field7210 = arg1;
        this.field7197 = this.field7192 != 0 || this.field7210 != 0 || this.field7194 != 0 || this.field7199 != 0;
    }

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "()I", line = 252)
    public final int method84() {
        field7212++;
        return this.field7207.field6539 + this.field7192 + this.field7194;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILma;II)V", line = 262)
    public final void method95(int arg0, int arg1, class10 arg2, int arg3, int arg4) {
        field7215++;
        class320 var6 = (class320) arg2;
        class442 var7 = var6.field4374;
        this.field7207.method335((byte) 51, false);
        this.field7190.method1934(-3);
        this.field7190.method1996(2, this.field7207);
        this.field7190.method1974(1, 4609);
        this.field7190.method1950(-29847, 1);
        this.field7190.method1996(2, var7);
        this.field7190.method1963(true, 7681, 8448);
        this.field7190.method1975(34176, 34168, 768, 0);
        this.field7190.method1976(-106, 1);
        int var8 = this.field7210 + arg1;
        int var9 = this.field7192 + arg0;
        int var10 = this.field7207.field6539 + var9;
        int var11 = this.field7207.field6545 + var8;
        float var12 = var7.field6542 / (float) var7.field6539;
        float var13 = var7.field6543 / (float) var7.field6545;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field6543 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field6543 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field7207.field6543);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field7207.field6545 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field7207.field6542, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field7207.field6539 + var9, this.field7207.field6545 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field7207.field6542, this.field7207.field6543);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var9 + this.field7207.field6539, var8);
        OpenGL.glEnd();
        this.field7190.method1975(34176, 5890, 768, 0);
        this.field7190.method1974(0, 4609);
        this.field7190.method1996(2, null);
        this.field7190.method1950(-29847, 0);
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lef;IIII)V", line = 929)
    public class493(class338 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7190 = arg0;
        this.field7207 = class108.method793(arg2, arg1, arg3, arg0, (byte) 62, arg4);
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lef;II[III)V", line = 939)
    public class493(class338 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field7190 = arg0;
        this.field7207 = class300.method1760(arg1, false, (byte) -91, arg3, arg2, arg0);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILem;IZ)V", line = 332)
    public static final void method2886(int arg0, class150 arg1, int arg2, boolean arg3) {
        field7209++;
        class320.field4380 = arg0;
        class494.field7221 = arg1;
        if (arg3) {
            field7201 = 125;
        }
        class162.field2430 = arg2;
    }

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "(IIIIIII)V", line = 346)
    public final void method94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7184++;
        this.field7207.method335((byte) 51, true);
        this.field7190.method1934(-3);
        this.field7190.method1976(-103, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field7197) {
            float var8 = (float) arg2 / (float) this.method84();
            float var9 = (float) arg3 / (float) this.method93();
            float var10 = (float) this.field7192 * var8 + (float) arg0;
            float var11 = (float) this.field7210 * var9 + (float) arg1;
            float var12 = (float) this.field7207.field6539 * var8 + var10;
            float var13 = (float) this.field7207.field6545 * var9 + var11;
            if (this.field7187 == null) {
                this.field7190.method1996(2, this.field7207);
                this.field7190.method1974(arg4, 4609);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field7207.field6543);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field7207.field6542, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field7207.field6542, this.field7207.field6543);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method2885(arg4, 768);
                this.field7187.method335((byte) 51, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7207.field6543);
                OpenGL.glTexCoord2f(0.0F, this.field7207.field6543);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field7207.field6542, 0.0F);
                OpenGL.glTexCoord2f(this.field7207.field6542, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field7207.field6542, this.field7207.field6543);
                OpenGL.glTexCoord2f(this.field7207.field6542, this.field7207.field6543);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method2888(-118);
            }
        } else if (this.field7187 == null) {
            this.field7190.method1996(2, this.field7207);
            this.field7190.method1974(arg4, 4609);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field7207.field6543);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field7207.field6542, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glTexCoord2f(this.field7207.field6542, this.field7207.field6543);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2885(arg4, 768);
            this.field7187.method335((byte) 51, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7207.field6543);
            OpenGL.glTexCoord2f(0.0F, this.field7207.field6543);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field7207.field6542, 0.0F);
            OpenGL.glTexCoord2f(this.field7207.field6542, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field7207.field6542, this.field7207.field6543);
            OpenGL.glTexCoord2f(this.field7207.field6542, this.field7207.field6543);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2888(-101);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(FFFFFFIII)V", line = 455)
    public final void method101(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field7185++;
        if (this.field7197) {
            float var10 = (float) this.method84();
            float var11 = (float) this.method93();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field7210 * var14;
            float var17 = (float) this.field7210 * var15;
            float var18 = (float) this.field7192 * var12;
            float var19 = (float) this.field7192 * var13;
            float var20 = (float) this.field7194 * -var12;
            float var21 = (float) this.field7194 * -var13;
            float var22 = (float) this.field7199 * -var14;
            arg4 = arg4 + var18 + var22;
            arg0 = arg0 + var18 + var16;
            float var23 = (float) this.field7199 * -var15;
            arg1 = arg1 + var19 + var17;
            arg3 = arg3 + var21 + var17;
            arg2 = arg2 + var20 + var16;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        this.field7207.method335((byte) 51, true);
        this.field7190.method1934(-3);
        this.field7190.method1996(2, this.field7207);
        this.field7190.method1976(-105, arg8);
        this.field7190.method1974(arg6, 4609);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field7207.field6543);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field7207.field6542, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field7207.field6542, this.field7207.field6543);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!gn", name = "la", descriptor = "()I", line = 531)
    public final int method102() {
        field7213++;
        return this.field7207.field6539;
    }

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "(IIIIII)V", line = 540)
    public final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7207.method1582(arg4, arg1, arg0, arg3, -1, arg2, arg5);
        field7206++;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(FFFFFFLma;II)V", line = 556)
    public final void method86(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        field7195++;
        class442 var10 = ((class320) arg6).field4374;
        if (this.field7197) {
            float var11 = (float) this.method84();
            float var12 = (float) this.method93();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field7210 * var15;
            float var18 = (float) this.field7210 * var16;
            float var19 = (float) this.field7192 * var13;
            float var20 = (float) this.field7192 * var14;
            float var21 = (float) this.field7194 * -var13;
            float var22 = (float) this.field7194 * -var14;
            float var23 = (float) this.field7199 * -var15;
            arg4 = arg4 + var19 + var23;
            arg0 = arg0 + var19 + var17;
            arg3 = arg3 + var22 + var18;
            arg2 = arg2 + var21 + var17;
            float var24 = (float) this.field7199 * -var16;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field7207.method335((byte) 51, true);
        this.field7190.method1934(-3);
        this.field7190.method1996(2, this.field7207);
        this.field7190.method1974(1, 4609);
        this.field7190.method1950(-29847, 1);
        this.field7190.method1996(2, var10);
        this.field7190.method1963(true, 7681, 8448);
        this.field7190.method1975(34176, 34168, 768, 0);
        this.field7190.method1976(-123, 1);
        float var27 = var10.field6542 / (float) var10.field6539;
        float var28 = var10.field6543 / (float) var10.field6545;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field7207.field6543);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field6543 - (((float) (-arg8) + arg1) * var28));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field6543 - ((arg5 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field7207.field6542, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field6543 - (var26 - (float) arg8) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field7207.field6542, this.field7207.field6543);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field6543 - ((float) (-arg8) + arg3) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field7190.method1975(34176, 5890, 768, 0);
        this.field7190.method1974(0, 4609);
        this.field7190.method1996(2, null);
        this.field7190.method1950(-29847, 0);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BI)V", line = 642)
    public static final void method2887(byte arg0, int arg1) {
        if (arg0 <= 10) {
            field7198 = -0.26481435988848967D;
        }
        field7193++;
        class97 var2 = class348.method2064(arg1, 16, -86);
        var2.method710(-9237);
    }

    @OriginalMember(owner = "client!gn", name = "BA", descriptor = "(III)V", line = 658)
    public final void method89(int arg0, int arg1, int arg2) {
        field7211++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field7187 = class108.method793(arg1, arg0, this.field7207.field6539, this.field7190, (byte) 83, this.field7207.field6545);
        this.field7202 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 682)
    private final void method2888(int arg0) {
        field7196++;
        this.field7190.method1950(-29847, 1);
        this.field7190.method1996(2, null);
        this.field7190.method1963(true, 8448, 8448);
        this.field7190.method1975(34176, 34168, 768, 1);
        this.field7190.method1973(5890, 0, 0, 770);
        if (arg0 >= -93) {
            this.method84();
        }
        this.field7190.method1950(-29847, 0);
        this.field7190.method1975(34176, 34168, 768, 1);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 702)
    public static final void method2889(byte arg0) {
        field7188++;
        int var1 = 71 % ((53 - arg0) / 46);
        if (class20.field269.method1708(class152.field2332, -116) != 2) {
            return;
        }
        byte var2 = (byte) (class168.field2517 - 4 & 0xFF);
        int var3 = class168.field2517 % class527.field7799;
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var17 = 0; var17 < class422.field6182; var17++) {
                class475.field6931[var4][var3][var17] = var2;
            }
        }
        if (class436.field6379 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class485.field7092[var5] = -1000000;
            class172.field2563[var5] = 1000000;
            class264.field3654[var5] = 0;
            class195.field2782[var5] = 1000000;
            class115.field1727[var5] = 0;
        }
        if (class491.field7168 != 1) {
            int var6 = class242.method1465(90, class436.field6379, class373.field5478, class329.field4493);
            if ((var6 - class62.field766) < 800 && (class267.field3700[class436.field6379][class329.field4493 >> 7][class373.field5478 >> 7] & 0x4) != 0) {
                class201.method1252((byte) -128, 1, false, class373.field5478 >> 7, class329.field4493 >> 7, class89.field1305);
            }
            return;
        }
        if ((class267.field3700[class436.field6379][class316.field4324.field1732 >> 7][class316.field4324.field1735 >> 7] & 0x4) != 0) {
            class201.method1252((byte) -122, 0, false, class316.field4324.field1735 >> 7, class316.field4324.field1732 >> 7, class89.field1305);
        }
        if (class107.field1604 >= 2560) {
            return;
        }
        int var7 = class329.field4493 >> 7;
        int var8 = class373.field5478 >> 7;
        int var9 = class316.field4324.field1732 >> 7;
        int var10 = class316.field4324.field1735 >> 7;
        int var11;
        if (var7 < var9) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        int var12;
        if (var10 > var8) {
            var12 = var10 - var8;
        } else {
            var12 = var8 - var10;
        }
        if (!(var11 != 0 || var12 != 0) || -class527.field7799 >= var11 || class527.field7799 <= var11 || -class422.field6182 >= var12 || var12 >= class422.field6182) {
            class320.method1861(null, (byte) -97, "RC: " + var7 + "," + var8 + " " + var9 + "," + var10 + " " + class510.field7566 + "," + class14.field204);
        } else if (var12 < var11) {
            int var13 = var12 * 65536 / var11;
            int var14 = 32768;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class267.field3700[class436.field6379][var7][var8] & 0x4) != 0) {
                    class201.method1252((byte) -121, 1, false, var8, var7, class89.field1305);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var8 < var10) {
                        var8++;
                    } else if (var8 > var10) {
                        var8--;
                    }
                    if ((class267.field3700[class436.field6379][var7][var8] & 0x4) != 0) {
                        class201.method1252((byte) -117, 1, false, var8, var7, class89.field1305);
                        return;
                    }
                }
            }
        } else {
            int var15 = var11 * 65536 / var12;
            int var16 = 32768;
            while (var8 != var10) {
                if (var8 < var10) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                if ((class267.field3700[class436.field6379][var7][var8] & 0x4) != 0) {
                    class201.method1252((byte) -103, 1, false, var8, var7, class89.field1305);
                    return;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    var16 -= 65536;
                    if (var9 > var7) {
                        var7++;
                    } else if (var7 > var9) {
                        var7--;
                    }
                    if ((class267.field3700[class436.field6379][var7][var8] & 0x4) != 0) {
                        class201.method1252((byte) -96, 1, false, var8, var7, class89.field1305);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V", line = 905)
    public static void method2890(int arg0) {
        if (arg0 != 0) {
            field7200 = true;
        }
        field7208 = null;
    }

    @OriginalMember(owner = "client!gn", name = "T", descriptor = "()I", line = 921)
    public final int method93() {
        field7189++;
        return this.field7207.field6545 + this.field7210 + this.field7199;
    }
}
