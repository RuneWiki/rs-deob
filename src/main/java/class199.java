import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class199 extends class154 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Z")
    private boolean field3125 = false;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    private int field3138 = 0;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    private int field3129 = 0;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    private int field3148 = 0;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    private int field3139 = 0;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    private int field3136 = 0;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lbl;")
    private class442 field3127;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Ljs;")
    private class208 field3134;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "[F")
    public static float[] field3149 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Lke;")
    public static class407 field3141 = new class407(16);

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field3153 = 0;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "Ljava/lang/String;")
    public static String field3154 = "";

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Ljs;")
    private class208 field3142;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)V", line = 5)
    public final void method992(int arg0, int arg1, int arg2, int arg3) {
        field3144++;
        this.field3139 = arg1;
        this.field3138 = arg2;
        this.field3148 = arg0;
        this.field3129 = arg3;
        this.field3125 = this.field3148 != 0 || this.field3139 != 0 || this.field3138 != 0 || this.field3129 != 0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()I", line = 19)
    public final int method988() {
        field3152++;
        return this.field3134.field3255 - (-this.field3148 - this.field3138);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V", line = 32)
    public final void method577(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3128++;
        this.field3134.method1208(false, false);
        this.field3127.method2580((byte) 77);
        this.field3127.method2640(27575, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field3139 + arg1;
        int var7 = this.field3148 + arg0;
        if (this.field3142 == null) {
            this.field3127.method2586(this.field3134, false);
            this.field3127.method2610(0, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3134.field3254);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field3134.field3258 + var6);
            OpenGL.glTexCoord2f(this.field3134.field3252, 0.0F);
            OpenGL.glVertex2i(this.field3134.field3255 + var7, this.field3134.field3258 + var6);
            OpenGL.glTexCoord2f(this.field3134.field3252, this.field3134.field3254);
            OpenGL.glVertex2i(this.field3134.field3255 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method1239(-4379, arg2);
        this.field3142.method1208(false, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3134.field3254);
        OpenGL.glTexCoord2f(0.0F, this.field3134.field3254);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, var6 + this.field3134.field3258);
        OpenGL.glMultiTexCoord2f(33985, this.field3134.field3252, 0.0F);
        OpenGL.glTexCoord2f(this.field3134.field3252, 0.0F);
        OpenGL.glVertex2i(var7 + this.field3134.field3255, this.field3134.field3258 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field3134.field3252, this.field3134.field3254);
        OpenGL.glTexCoord2f(this.field3134.field3252, this.field3134.field3254);
        OpenGL.glVertex2i(this.field3134.field3255 + var7, var6);
        OpenGL.glEnd();
        this.method1240(false);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "()I", line = 86)
    public final int method993() {
        field3130++;
        return this.field3134.field3258;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIIIIII)V", line = 95)
    public final void method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3150++;
        int var8 = arg0 + arg2;
        this.field3134.method1208(false, false);
        int var9 = arg1 + arg3;
        this.field3127.method2580((byte) 77);
        this.field3127.method2586(this.field3134, false);
        this.field3127.method2640(27575, arg6);
        this.field3127.method2610(0, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3134.field3256 && !this.field3125) {
            float var10 = (float) arg3 * this.field3134.field3254 / (float) this.field3134.field3258;
            float var11 = (float) arg2 * this.field3134.field3252 / (float) this.field3134.field3255;
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
        OpenGL.glTranslatef((float) this.field3148, (float) this.field3139, 0.0F);
        int var12 = this.method988();
        int var13 = this.method989();
        int var14 = this.field3134.field3258 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = arg0 + this.field3134.field3255;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field3134.field3254);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field3134.field3252, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field3134.field3252, this.field3134.field3254);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field3134.field3252 / (float) this.field3134.field3255;
                OpenGL.glTexCoord2f(0.0F, this.field3134.field3254);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field3134.field3254);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (this.field3134.field3258 - (var9 - var15)) * this.field3134.field3254 / (float) this.field3134.field3258;
            int var17 = this.field3134.field3255 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field3134.field3254);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field3134.field3252, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field3134.field3252, this.field3134.field3254);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field3134.field3252 / (float) this.field3134.field3255;
                OpenGL.glTexCoord2f(0.0F, this.field3134.field3254);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field3134.field3254);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIZ)I", line = 235)
    public static final int method1237(int arg0, int arg1, int arg2, boolean arg3) {
        field3147++;
        if (arg0 > -27) {
            method1237(-49, -78, 56, false);
        }
        class146 var4 = class478.method2889(arg1, (byte) 27, arg3);
        if (var4 == null) {
            return -1;
        } else if (arg2 >= 0 && var4.field2367.length > arg2) {
            return var4.field2367[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V", line = 255)
    public final void method575(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field3131++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field3142 = class498.method2998(this.field3134.field3258, this.field3127, arg1, this.field3134.field3255, arg0, (byte) -104);
        this.field3136 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lbl;IIII)V", line = 741)
    public class199(class442 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3127 = arg0;
        this.field3134 = class498.method2998(arg4, arg0, arg2, arg3, arg1, (byte) -105);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lbl;II[III)V", line = 755)
    public class199(class442 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3127 = arg0;
        this.field3134 = class170.method1069(0, arg3, arg0, arg1, false, arg2);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFFFFFLbe;II)V", line = 283)
    public final void method1000(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class28 arg6, int arg7, int arg8) {
        field3140++;
        class208 var10 = ((class475) arg6).field7249;
        if (this.field3125) {
            float var11 = (float) this.method988();
            float var12 = (float) this.method989();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field3139 * var15;
            float var18 = (float) this.field3139 * var16;
            float var19 = (float) this.field3148 * var13;
            float var20 = (float) this.field3148 * var14;
            float var21 = (float) this.field3138 * -var13;
            float var22 = (float) this.field3138 * -var14;
            float var23 = (float) this.field3129 * -var15;
            float var24 = (float) this.field3129 * -var16;
            arg1 = arg1 + var20 + var18;
            arg4 = arg4 + var19 + var23;
            arg0 = arg0 + var19 + var17;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field3134.method1208(true, false);
        float var26 = arg5 + arg3 - arg1;
        this.field3127.method2580((byte) 77);
        this.field3127.method2586(this.field3134, false);
        this.field3127.method2610(0, 1);
        this.field3127.method2582((byte) 121, 1);
        this.field3127.method2586(var10, false);
        this.field3127.method2624((byte) 107, 8448, 7681);
        this.field3127.method2597(34168, (byte) -76, 768, 0);
        this.field3127.method2640(27575, 1);
        float var27 = var10.field3252 / (float) var10.field3255;
        float var28 = var10.field3254 / (float) var10.field3258;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3134.field3254);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg0) * var27, var10.field3254 - (arg1 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field3254 - (((float) (-arg8) + arg5) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field3134.field3252, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + var25) * var27, var10.field3254 - ((float) (-arg8) + var26) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field3134.field3252, this.field3134.field3254);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field3254 - (((float) (-arg8) + arg3) * var28));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field3127.method2597(5890, (byte) -7, 768, 0);
        this.field3127.method2610(0, 0);
        this.field3127.method2586(null, false);
        this.field3127.method2582((byte) 117, 0);
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "()I", line = 369)
    public final int method1001() {
        field3137++;
        return this.field3134.field3255;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIIIII)V", line = 377)
    public static final void method1238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3132++;
        int var9 = arg3 + 1;
        class78.method566(class69.field1212[arg3], arg5, arg2, -7, arg1);
        int var8 = arg0 - 1;
        class78.method566(class69.field1212[arg0], arg5, arg2, -7, arg1);
        if (arg4 != 288551336) {
            method1238(-45, 110, 2, -77, -6, 50);
        }
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class69.field1212[var6];
            var7[arg1] = var7[arg5] = arg2;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)V", line = 404)
    private final void method1239(int arg0, int arg1) {
        field3126++;
        this.field3127.method2582((byte) -38, 1);
        this.field3127.method2586(this.field3134, false);
        this.field3127.method2624((byte) 107, 7681, this.field3127.method2625(102, arg1));
        this.field3127.method2597(34167, (byte) -104, 768, 1);
        this.field3127.method2575((byte) -74, 34168, 770, 0);
        this.field3127.method2582((byte) 117, 0);
        this.field3127.method2586(this.field3142, false);
        if (arg0 != -4379) {
            return;
        }
        this.field3127.method2624((byte) 107, 7681, 34479);
        this.field3127.method2597(34166, (byte) 94, 768, 1);
        if (this.field3136 == 0) {
            this.field3127.method2636(0.5F, 121, 0.5F, 1.0F, 0.0F);
        } else if (this.field3136 == 1) {
            this.field3127.method2636(1.0F, -64, 0.5F, 0.5F, 0.0F);
        } else if (this.field3136 == 2) {
            this.field3127.method2636(0.5F, arg0 ^ 0x1109, 1.0F, 0.5F, 0.0F);
        } else if (this.field3136 == 3) {
            this.field3127.method2636(128.5F, 124, 128.5F, 128.5F, 0.0F);
            return;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V", line = 446)
    private final void method1240(boolean arg0) {
        this.field3127.method2582((byte) -24, 1);
        field3146++;
        this.field3127.method2586(null, arg0);
        this.field3127.method2624((byte) 107, 8448, 8448);
        this.field3127.method2597(34168, (byte) -92, 768, 1);
        this.field3127.method2575((byte) -63, 5890, 770, 0);
        this.field3127.method2582((byte) 126, 0);
        this.field3127.method2597(34168, (byte) -84, 768, 1);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFFFFFIII)V", line = 460)
    public final void method997(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field3125) {
            float var10 = (float) this.method988();
            float var11 = (float) this.method989();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field3139 * var14;
            float var17 = (float) this.field3139 * var15;
            float var18 = (float) this.field3148 * var12;
            float var19 = (float) this.field3148 * var13;
            float var20 = (float) this.field3138 * -var12;
            float var21 = (float) this.field3138 * -var13;
            float var22 = (float) this.field3129 * -var14;
            arg3 = arg3 + var21 + var17;
            float var23 = (float) this.field3129 * -var15;
            arg2 = arg2 + var20 + var16;
            arg1 = arg1 + var19 + var17;
            arg4 = arg4 + var18 + var22;
            arg0 = arg0 + var18 + var16;
            arg5 = arg5 + var19 + var23;
        }
        field3145++;
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        this.field3134.method1208(true, false);
        this.field3127.method2580((byte) 77);
        this.field3127.method2586(this.field3134, false);
        this.field3127.method2640(27575, arg8);
        this.field3127.method2610(0, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field3134.field3254);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field3134.field3252, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field3134.field3252, this.field3134.field3254);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIII)V", line = 532)
    public final void method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3143++;
        this.field3134.method1208(true, false);
        this.field3127.method2580((byte) 77);
        this.field3127.method2640(27575, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3125) {
            float var8 = (float) arg2 / (float) this.method988();
            float var9 = (float) arg3 / (float) this.method989();
            float var10 = (float) this.field3148 * var8 + (float) arg0;
            float var11 = (float) this.field3139 * var9 + (float) arg1;
            float var12 = (float) this.field3134.field3255 * var8 + var10;
            float var13 = (float) this.field3134.field3258 * var9 + var11;
            if (this.field3142 == null) {
                this.field3127.method2586(this.field3134, false);
                this.field3127.method2610(0, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field3134.field3254);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field3134.field3252, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field3134.field3252, this.field3134.field3254);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method1239(-4379, arg4);
                this.field3142.method1208(true, false);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3134.field3254);
                OpenGL.glTexCoord2f(0.0F, this.field3134.field3254);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field3134.field3252, 0.0F);
                OpenGL.glTexCoord2f(this.field3134.field3252, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field3134.field3252, this.field3134.field3254);
                OpenGL.glTexCoord2f(this.field3134.field3252, this.field3134.field3254);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method1240(false);
            }
        } else if (this.field3142 == null) {
            this.field3127.method2586(this.field3134, false);
            this.field3127.method2610(0, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3134.field3254);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3134.field3252, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3134.field3252, this.field3134.field3254);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1239(-4379, arg4);
            this.field3142.method1208(true, false);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3134.field3254);
            OpenGL.glTexCoord2f(0.0F, this.field3134.field3254);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3134.field3252, 0.0F);
            OpenGL.glTexCoord2f(this.field3134.field3252, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3134.field3252, this.field3134.field3254);
            OpenGL.glTexCoord2f(this.field3134.field3252, this.field3134.field3254);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1240(false);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()I", line = 637)
    public final int method989() {
        field3135++;
        return this.field3134.field3258 + this.field3139 + this.field3129;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 654)
    public static void method1241(int arg0) {
        field3154 = null;
        if (arg0 != 0) {
            field3154 = null;
        }
        field3149 = null;
        field3141 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILbe;II)V", line = 667)
    public final void method574(int arg0, int arg1, class28 arg2, int arg3, int arg4) {
        field3151++;
        class475 var6 = (class475) arg2;
        class208 var7 = var6.field7249;
        this.field3134.method1208(false, false);
        this.field3127.method2580((byte) 77);
        this.field3127.method2586(this.field3134, false);
        this.field3127.method2610(0, 1);
        this.field3127.method2582((byte) -120, 1);
        this.field3127.method2586(var7, false);
        this.field3127.method2624((byte) 107, 8448, 7681);
        this.field3127.method2597(34168, (byte) 101, 768, 0);
        this.field3127.method2640(27575, 1);
        int var8 = this.field3148 + arg0;
        int var9 = this.field3139 + arg1;
        int var10 = this.field3134.field3255 + var8;
        int var11 = this.field3134.field3258 + var9;
        float var12 = var7.field3252 / (float) var7.field3255;
        float var13 = var7.field3254 / (float) var7.field3258;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field3254 - ((float) (var9 - arg4) * var13);
        float var17 = var7.field3254 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3134.field3254);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, var9 + this.field3134.field3258);
        OpenGL.glMultiTexCoord2f(33984, this.field3134.field3252, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field3134.field3255 + var8, this.field3134.field3258 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field3134.field3252, this.field3134.field3254);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field3134.field3255 + var8, var9);
        OpenGL.glEnd();
        this.field3127.method2597(5890, (byte) -35, 768, 0);
        this.field3127.method2610(0, 0);
        this.field3127.method2586(null, false);
        this.field3127.method2582((byte) 120, 0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V", line = 731)
    public final void method576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3134.method1598(arg3, arg0, arg4, -125, arg2, arg1, arg5);
        field3133++;
    }
}
