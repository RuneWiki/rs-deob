import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class375 extends class529 {

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    private int field5710 = 0;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    private int field5713 = 0;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    private int field5718 = 0;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    private int field5708 = 0;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "Z")
    private boolean field5723 = false;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    private int field5715 = 0;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "Lod;")
    private class349 field5705;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Lwe;")
    private class279 field5716;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field5714 = 0;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "Lvp;")
    public static class123 field5727 = new class123();

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Lwe;")
    private class279 field5720;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "Ljava/lang/String;")
    public static String field5717;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILea;II)V")
    public final void method98(int arg0, int arg1, class381 arg2, int arg3, int arg4) {
        field5721++;
        class439 var6 = (class439) arg2;
        class279 var7 = var6.field6565;
        this.field5716.method2683(false, 0);
        this.field5705.method2181((byte) -104);
        this.field5705.method2200(this.field5716, (byte) 121);
        this.field5705.method2186(1, 27);
        this.field5705.method2176(1, 49);
        this.field5705.method2200(var7, (byte) 117);
        this.field5705.method2131(34162, 8448, 7681);
        this.field5705.method2156(34168, 768, 2969, 0);
        this.field5705.method2162(1, 1);
        int var8 = this.field5718 + arg1;
        int var9 = this.field5708 + arg0;
        int var10 = this.field5716.field4021 + var9;
        int var11 = this.field5716.field4020 + var8;
        float var12 = var7.field4017 / (float) var7.field4021;
        float var13 = var7.field4026 / (float) var7.field4020;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field4026 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field4026 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5716.field4026);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field5716.field4020 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field5716.field4017, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var9 + this.field5716.field4021, var8 - -this.field5716.field4020);
        OpenGL.glMultiTexCoord2f(33984, this.field5716.field4017, this.field5716.field4026);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field5716.field4021 + var9, var8);
        OpenGL.glEnd();
        this.field5705.method2156(5890, 768, 2969, 0);
        this.field5705.method2186(0, -115);
        this.field5705.method2200(null, (byte) 127);
        this.field5705.method2176(0, 83);
    }

    @OriginalMember(owner = "client!vi", name = "qa", descriptor = "()I")
    public final int method103() {
        field5726++;
        return this.field5716.field4020;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)V")
    private final void method2300(int arg0, int arg1) {
        this.field5705.method2176(1, arg0 + 4508);
        field5728++;
        this.field5705.method2200(this.field5716, (byte) 120);
        this.field5705.method2131(34162, 7681, this.field5705.method2193(arg1, 260));
        if (arg0 != -4425) {
            this.field5713 = 103;
        }
        this.field5705.method2156(34167, 768, 2969, 1);
        this.field5705.method2135(0, 34168, arg0 ^ 0x1137, 770);
        this.field5705.method2176(0, 77);
        this.field5705.method2200(this.field5720, (byte) 122);
        this.field5705.method2131(34162, 7681, 34479);
        this.field5705.method2156(34166, 768, 2969, 1);
        if (this.field5715 == 0) {
            this.field5705.method2170(0.5F, 0, 1.0F, 0.5F, 0.0F);
        } else if (this.field5715 == 1) {
            this.field5705.method2170(0.5F, arg0 + 4425, 0.5F, 1.0F, 0.0F);
        } else if (this.field5715 == 2) {
            this.field5705.method2170(1.0F, 0, 0.5F, 0.5F, 0.0F);
        } else if (this.field5715 == 3) {
            this.field5705.method2170(128.5F, 0, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!vi", name = "UA", descriptor = "()I")
    public final int method108() {
        field5701++;
        return this.field5716.field4021;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public static void method2301(byte arg0) {
        if (arg0 == -83) {
            field5717 = null;
            field5727 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
    public static final void method2302(byte arg0) {
        field5711++;
        int var1 = 58 / ((arg0 + 39) / 47);
        for (int var2 = 0; var2 < 5; var2++) {
            class189.field2793[var2] = false;
        }
        class140.field2103 = 1;
        class228.field3379 = 0;
        class227.field3328 = 0;
        class337.field4743 = -1;
        class438.field6539 = -1;
    }

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "(IIIIIII)V")
    public final void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5716.method2683(true, 0);
        field5725++;
        this.field5705.method2181((byte) -106);
        this.field5705.method2162(arg6, 1);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5723) {
            float var8 = (float) arg2 / (float) this.method105();
            float var9 = (float) arg3 / (float) this.method100();
            float var10 = (float) this.field5708 * var8 + (float) arg0;
            float var11 = (float) this.field5718 * var9 + (float) arg1;
            float var12 = (float) this.field5716.field4021 * var8 + var10;
            float var13 = (float) this.field5716.field4020 * var9 + var11;
            if (this.field5720 == null) {
                this.field5705.method2200(this.field5716, (byte) 116);
                this.field5705.method2186(arg4, -101);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field5716.field4026);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field5716.field4017, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field5716.field4017, this.field5716.field4026);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method2300(-4425, arg4);
                this.field5720.method2683(true, 0);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5716.field4026);
                OpenGL.glTexCoord2f(0.0F, this.field5716.field4026);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5716.field4017, 0.0F);
                OpenGL.glTexCoord2f(this.field5716.field4017, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5716.field4017, this.field5716.field4026);
                OpenGL.glTexCoord2f(this.field5716.field4017, this.field5716.field4026);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method2303(25176);
            }
        } else if (this.field5720 == null) {
            this.field5705.method2200(this.field5716, (byte) 115);
            this.field5705.method2186(arg4, -55);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5716.field4026);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5716.field4017, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5716.field4017, this.field5716.field4026);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2300(-4425, arg4);
            this.field5720.method2683(true, 0);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5716.field4026);
            OpenGL.glTexCoord2f(0.0F, this.field5716.field4026);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5716.field4017, 0.0F);
            OpenGL.glTexCoord2f(this.field5716.field4017, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5716.field4017, this.field5716.field4026);
            OpenGL.glTexCoord2f(this.field5716.field4017, this.field5716.field4026);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2303(25176);
        }
    }

    @OriginalMember(owner = "client!vi", name = "aa", descriptor = "(FFFFFFIII)V")
    public final void method111(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field5702++;
        if (this.field5723) {
            float var10 = (float) this.method105();
            float var11 = (float) this.method100();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field5718 * var14;
            float var17 = (float) this.field5718 * var15;
            float var18 = (float) this.field5708 * var12;
            float var19 = (float) this.field5708 * var13;
            float var20 = (float) this.field5713 * -var12;
            float var21 = (float) this.field5713 * -var13;
            float var22 = (float) this.field5710 * -var14;
            arg1 = arg1 + var19 + var17;
            arg0 = arg0 + var18 + var16;
            arg3 = arg3 + var21 + var17;
            float var23 = (float) this.field5710 * -var15;
            arg4 = arg4 + var18 + var22;
            arg2 = arg2 + var20 + var16;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        this.field5716.method2683(true, 0);
        float var25 = arg5 + arg3 - arg1;
        this.field5705.method2181((byte) -90);
        this.field5705.method2200(this.field5716, (byte) 126);
        this.field5705.method2162(arg8, 1);
        this.field5705.method2186(arg6, -52);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field5716.field4026);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field5716.field4017, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field5716.field4017, this.field5716.field4026);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!vi", name = "ka", descriptor = "(IIII)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3) {
        this.field5708 = arg0;
        this.field5713 = arg2;
        this.field5718 = arg1;
        this.field5710 = arg3;
        field5707++;
        this.field5723 = this.field5708 != 0 || this.field5718 != 0 || this.field5713 != 0 || this.field5710 != 0;
    }

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "(III)V")
    public final void method99(int arg0, int arg1, int arg2) {
        field5709++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field5720 = class482.method2861(this.field5716.field4021, this.field5716.field4020, (byte) 90, this.field5705, arg0, arg1);
        this.field5715 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "(IIIIIII)V")
    public final void method109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5703++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field5716.method2683(false, 0);
        this.field5705.method2181((byte) -107);
        this.field5705.method2200(this.field5716, (byte) 118);
        this.field5705.method2162(arg6, 1);
        this.field5705.method2186(arg4, 70);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5716.field4019 && !this.field5723) {
            float var10 = (float) arg3 * this.field5716.field4026 / (float) this.field5716.field4020;
            float var11 = (float) arg2 * this.field5716.field4017 / (float) this.field5716.field4021;
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
        OpenGL.glTranslatef((float) this.field5708, (float) this.field5718, 0.0F);
        int var12 = this.method105();
        int var13 = this.method100();
        int var14 = arg1 + this.field5716.field4020;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field5716.field4021 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field5716.field4026);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field5716.field4017, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field5716.field4017, this.field5716.field4026);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field5716.field4017 / (float) this.field5716.field4021;
                OpenGL.glTexCoord2f(0.0F, this.field5716.field4026);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field5716.field4026);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (var15 - (var9 - this.field5716.field4020)) * this.field5716.field4026 / (float) this.field5716.field4020;
            int var17 = this.field5716.field4021 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field5716.field4026);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field5716.field4017, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field5716.field4017, this.field5716.field4026);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field5716.field4017 / (float) this.field5716.field4021;
                OpenGL.glTexCoord2f(0.0F, this.field5716.field4026);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field5716.field4026);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    private final void method2303(int arg0) {
        this.field5705.method2176(1, 107);
        field5704++;
        this.field5705.method2200(null, (byte) 115);
        if (arg0 != 25176) {
            this.method110(9, 86, -126, -114, 82);
        }
        this.field5705.method2131(34162, 8448, 8448);
        this.field5705.method2156(34168, 768, 2969, 1);
        this.field5705.method2135(0, 5890, -96, 770);
        this.field5705.method2176(0, 92);
        this.field5705.method2156(34168, 768, 2969, 1);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(FFFFFFLea;II)V")
    public final void method95(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8) {
        field5722++;
        class279 var10 = ((class439) arg6).field6565;
        if (this.field5723) {
            float var11 = (float) this.method105();
            float var12 = (float) this.method100();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field5718 * var15;
            float var18 = (float) this.field5718 * var16;
            float var19 = (float) this.field5708 * var13;
            float var20 = (float) this.field5708 * var14;
            float var21 = (float) this.field5713 * -var13;
            float var22 = (float) this.field5713 * -var14;
            float var23 = (float) this.field5710 * -var15;
            arg1 = arg1 + var20 + var18;
            float var24 = (float) this.field5710 * -var16;
            arg2 = arg2 + var21 + var17;
            arg4 = arg4 + var19 + var23;
            arg0 = arg0 + var19 + var17;
            arg3 = arg3 + var22 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field5716.method2683(true, 0);
        this.field5705.method2181((byte) -96);
        this.field5705.method2200(this.field5716, (byte) 118);
        this.field5705.method2186(1, 95);
        this.field5705.method2176(1, 125);
        this.field5705.method2200(var10, (byte) 115);
        this.field5705.method2131(34162, 8448, 7681);
        this.field5705.method2156(34168, 768, 2969, 0);
        this.field5705.method2162(1, 1);
        float var27 = var10.field4017 / (float) var10.field4021;
        float var28 = var10.field4026 / (float) var10.field4020;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5716.field4026);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field4026 - (arg1 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field4026 - ((arg5 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field5716.field4017, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field4026 - (var26 - (float) arg8) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field5716.field4017, this.field5716.field4026);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field4026 - ((float) (-arg8) + arg3) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field5705.method2156(5890, 768, 2969, 0);
        this.field5705.method2186(0, 106);
        this.field5705.method2200(null, (byte) 114);
        this.field5705.method2176(0, 126);
    }

    @OriginalMember(owner = "client!vi", name = "ja", descriptor = "()I")
    public final int method105() {
        field5724++;
        return this.field5716.field4021 + this.field5713 + this.field5708;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;ZII)I")
    public static final int method2304(String arg0, boolean arg1, int arg2, int arg3) {
        field5729++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = 113 % ((-arg3 - 13) / 54);
        boolean var5 = false;
        boolean var6 = false;
        int var7 = 0;
        int var8 = arg0.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg0.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var5 = true;
                    continue;
                }
                if (var10 == '+' && arg1) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg2 <= var12) {
                throw new NumberFormatException();
            }
            if (var5) {
                var12 = -var12;
            }
            int var11 = arg2 * var7 + var12;
            if (var11 / arg2 != var7) {
                throw new NumberFormatException();
            }
            var6 = true;
            var7 = var11;
        }
        if (!var6) {
            throw new NumberFormatException();
        }
        return var7;
    }

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "(IIIIII)V")
    public final void method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5716.method1725(arg0, 9489, arg5, arg4, arg2, arg1, arg3);
        field5712++;
    }

    @OriginalMember(owner = "client!vi", name = "YA", descriptor = "(IIIII)V")
    public final void method110(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5706++;
        this.field5716.method2683(false, 0);
        this.field5705.method2181((byte) -74);
        this.field5705.method2162(arg4, 1);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field5718 + arg1;
        int var7 = this.field5708 + arg0;
        if (this.field5720 == null) {
            this.field5705.method2200(this.field5716, (byte) 121);
            this.field5705.method2186(arg2, 78);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5716.field4026);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, var6 + this.field5716.field4020);
            OpenGL.glTexCoord2f(this.field5716.field4017, 0.0F);
            OpenGL.glVertex2i(this.field5716.field4021 + var7, this.field5716.field4020 + var6);
            OpenGL.glTexCoord2f(this.field5716.field4017, this.field5716.field4026);
            OpenGL.glVertex2i(var7 + this.field5716.field4021, var6);
            OpenGL.glEnd();
            return;
        }
        this.method2300(-4425, arg2);
        this.field5720.method2683(false, 0);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5716.field4026);
        OpenGL.glTexCoord2f(0.0F, this.field5716.field4026);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, var6 + this.field5716.field4020);
        OpenGL.glMultiTexCoord2f(33985, this.field5716.field4017, 0.0F);
        OpenGL.glTexCoord2f(this.field5716.field4017, 0.0F);
        OpenGL.glVertex2i(this.field5716.field4021 + var7, this.field5716.field4020 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field5716.field4017, this.field5716.field4026);
        OpenGL.glTexCoord2f(this.field5716.field4017, this.field5716.field4026);
        OpenGL.glVertex2i(var7 + this.field5716.field4021, var6);
        OpenGL.glEnd();
        this.method2303(25176);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lod;IIII)V")
    public class375(class349 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5705 = arg0;
        this.field5716 = class482.method2861(arg3, arg4, (byte) 90, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lod;II[III)V")
    public class375(class349 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field5705 = arg0;
        this.field5716 = class226.method1535(arg2, false, arg1, arg0, 126, arg3);
    }

    @OriginalMember(owner = "client!vi", name = "JA", descriptor = "()I")
    public final int method100() {
        field5719++;
        return this.field5718 + this.field5710 + this.field5716.field4020;
    }
}
