import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class183 extends class702 {

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
    private int field3067 = 0;

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "I")
    private int field3069 = 0;

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "Z")
    private boolean field3071 = false;

    @OriginalMember(owner = "client!wfa", name = "j", descriptor = "I")
    private int field3074 = 0;

    @OriginalMember(owner = "client!wfa", name = "w", descriptor = "I")
    private int field3087 = 0;

    @OriginalMember(owner = "client!wfa", name = "u", descriptor = "I")
    private int field3085 = 0;

    @OriginalMember(owner = "client!wfa", name = "m", descriptor = "Ler;")
    private class92 field3077;

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "Lcea;")
    public class197 field3070;

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
    public static int field3068 = 0;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!wfa", name = "k", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!wfa", name = "l", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!wfa", name = "n", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!wfa", name = "o", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!wfa", name = "p", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!wfa", name = "q", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!wfa", name = "r", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!wfa", name = "s", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!wfa", name = "t", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!wfa", name = "v", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!wfa", name = "x", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!wfa", name = "y", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!wfa", name = "z", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!wfa", name = "A", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!wfa", name = "B", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!wfa", name = "E", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!wfa", name = "F", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!wfa", name = "D", descriptor = "Lcea;")
    private class197 field3094;

    @OriginalMember(owner = "client!wfa", name = "C", descriptor = "Lq;")
    public static class393 field3093;

    @OriginalMember(owner = "client!wfa", name = "E", descriptor = "()I")
    public final int method1083() {
        field3066++;
        return this.field3070.field3231;
    }

    @OriginalMember(owner = "client!wfa", name = "Q", descriptor = "(IIII)V")
    public final void method1085(int arg0, int arg1, int arg2, int arg3) {
        this.field3085 = arg1;
        field3096++;
        this.field3069 = arg2;
        this.field3087 = arg0;
        this.field3067 = arg3;
        this.field3071 = this.field3087 != 0 || this.field3085 != 0 || this.field3069 != 0 || this.field3067 != 0;
    }

    @OriginalMember(owner = "client!wfa", name = "xa", descriptor = "(III)V")
    public final void method1077(int arg0, int arg1, int arg2) {
        field3081++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field3094 = class90.method807(arg1, this.field3070.field3231, arg0, this.field3077, -113, this.field3070.field3236);
        this.field3074 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!wfa", name = "DA", descriptor = "(IIIIIII)V")
    public final void method1087(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3090++;
        int var8 = arg0 + arg2;
        this.field3070.method2509(false, -105);
        int var9 = arg1 + arg3;
        this.field3077.method822(true);
        this.field3077.method856(false, this.field3070);
        this.field3077.method889(57, arg6);
        this.field3077.method816(arg4, -122);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3070.field3232 && !this.field3071) {
            float var10 = (float) arg3 * this.field3070.field3240 / (float) this.field3070.field3236;
            float var11 = (float) arg2 * this.field3070.field3238 / (float) this.field3070.field3231;
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
        OpenGL.glTranslatef((float) this.field3087, (float) this.field3085, 0.0F);
        int var12 = this.method1076();
        int var13 = this.method1079();
        int var14 = this.field3070.field3236 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field3070.field3231 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field3070.field3240);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field3070.field3238, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field3070.field3238, this.field3070.field3240);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field3070.field3238 / (float) this.field3070.field3231;
                OpenGL.glTexCoord2f(0.0F, this.field3070.field3240);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field3070.field3240);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field3070.field3236 - (var9 - var15)) * this.field3070.field3240 / (float) this.field3070.field3236;
            int var17 = arg0 + this.field3070.field3231;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field3070.field3240);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field3070.field3238, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field3070.field3238, this.field3070.field3240);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field3070.field3238 / (float) this.field3070.field3231;
                OpenGL.glTexCoord2f(0.0F, this.field3070.field3240);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field3070.field3240);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
    private final void method1485(int arg0) {
        this.field3077.method834(true, 1);
        field3080++;
        this.field3077.method856(false, null);
        this.field3077.method857(8960, 8448, arg0);
        this.field3077.method844(768, 34168, 1, (byte) -102);
        this.field3077.method820(5890, 770, 0, 121);
        this.field3077.method834(true, 0);
        this.field3077.method844(768, 34168, 1, (byte) -102);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IILua;II)V")
    public final void method1080(int arg0, int arg1, class617 arg2, int arg3, int arg4) {
        field3065++;
        class385 var6 = (class385) arg2;
        class197 var7 = var6.field5984;
        this.field3070.method2509(false, -88);
        this.field3077.method822(true);
        this.field3077.method856(false, this.field3070);
        this.field3077.method816(1, -123);
        this.field3077.method834(true, 1);
        this.field3077.method856(false, var7);
        this.field3077.method857(8960, 8448, 7681);
        this.field3077.method844(768, 34168, 0, (byte) -102);
        this.field3077.method889(58, 1);
        int var8 = this.field3085 + arg1;
        int var9 = this.field3087 + arg0;
        int var10 = this.field3070.field3231 + var9;
        int var11 = var8 + this.field3070.field3236;
        float var12 = var7.field3238 / (float) var7.field3231;
        float var13 = var7.field3240 / (float) var7.field3236;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field3240 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field3240 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3070.field3240);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field3070.field3236 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field3070.field3238, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var9 + this.field3070.field3231, this.field3070.field3236 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field3070.field3238, this.field3070.field3240);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field3070.field3231 + var9, var8);
        OpenGL.glEnd();
        this.field3077.method844(768, 5890, 0, (byte) -102);
        this.field3077.method816(0, -118);
        this.field3077.method856(false, null);
        this.field3077.method834(true, 0);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method1088(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class617 arg7, int arg8, int arg9) {
        field3086++;
        class197 var11 = ((class385) arg7).field5984;
        if (this.field3071) {
            float var12 = (float) this.method1076();
            float var13 = (float) this.method1079();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field3085 * var16;
            float var19 = (float) this.field3085 * var17;
            float var20 = (float) this.field3087 * var14;
            float var21 = (float) this.field3087 * var15;
            float var22 = (float) this.field3069 * -var14;
            float var23 = (float) this.field3069 * -var15;
            float var24 = (float) this.field3067 * -var16;
            float var25 = (float) this.field3067 * -var17;
            arg4 = arg4 + var20 + var24;
            arg3 = arg3 + var23 + var19;
            arg2 = arg2 + var22 + var18;
            arg1 = arg1 + var21 + var19;
            arg0 = arg0 + var20 + var18;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        float var27 = arg5 + arg3 - arg1;
        this.field3070.method2509((arg6 & 0x1) != 0, -82);
        this.field3077.method822(true);
        this.field3077.method856(false, this.field3070);
        this.field3077.method816(1, -122);
        this.field3077.method834(true, 1);
        this.field3077.method856(false, var11);
        this.field3077.method857(8960, 8448, 7681);
        this.field3077.method844(768, 34168, 0, (byte) -102);
        this.field3077.method889(101, 1);
        float var28 = var11.field3238 / (float) var11.field3231;
        float var29 = var11.field3240 / (float) var11.field3236;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3070.field3240);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field3240 - (arg1 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg4) * var28, var11.field3240 - (((float) (-arg9) + arg5) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field3070.field3238, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field3240 - (((float) (-arg9) + var27) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field3070.field3238, this.field3070.field3240);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field3240 - (arg3 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field3077.method844(768, 5890, 0, (byte) -102);
        this.field3077.method816(0, -124);
        this.field3077.method856(false, null);
        this.field3077.method834(true, 0);
    }

    @OriginalMember(owner = "client!wfa", name = "V", descriptor = "(IIIII)V")
    public final void method1086(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3088++;
        this.field3070.method2509(false, -48);
        this.field3077.method822(true);
        this.field3077.method889(69, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field3085 + arg1;
        int var7 = this.field3087 + arg0;
        if (this.field3094 == null) {
            this.field3077.method856(false, this.field3070);
            this.field3077.method816(arg2, -118);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3070.field3240);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field3070.field3236 + var6);
            OpenGL.glTexCoord2f(this.field3070.field3238, 0.0F);
            OpenGL.glVertex2i(this.field3070.field3231 + var7, var6 - -this.field3070.field3236);
            OpenGL.glTexCoord2f(this.field3070.field3238, this.field3070.field3240);
            OpenGL.glVertex2i(this.field3070.field3231 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method1490(arg2, 21929);
        this.field3094.method2509(false, -101);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3070.field3240);
        OpenGL.glTexCoord2f(0.0F, this.field3070.field3240);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field3070.field3236 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field3070.field3238, 0.0F);
        OpenGL.glTexCoord2f(this.field3070.field3238, 0.0F);
        OpenGL.glVertex2i(this.field3070.field3231 + var7, var6 - -this.field3070.field3236);
        OpenGL.glMultiTexCoord2f(33985, this.field3070.field3238, this.field3070.field3240);
        OpenGL.glTexCoord2f(this.field3070.field3238, this.field3070.field3240);
        OpenGL.glVertex2i(var7 + this.field3070.field3231, var6);
        OpenGL.glEnd();
        this.method1485(8448);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Ldh;Z)Ljava/lang/String;")
    public static final String method1486(class295 arg0, boolean arg1) {
        if (arg1) {
            method1489(34, -88, 23);
        }
        field3089++;
        return arg0.field4626 == null || arg0.field4626.length() <= 0 ? arg0.field4623 : arg0.field4623 + class122.field2004.method1091(class135.field2206, 1) + arg0.field4626;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IBIIIIIIII)Z")
    public static final boolean method1487(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3091++;
        if (arg5 > 2000 || arg6 > 2000 || arg7 > 2000 || arg8 > 2000 || arg0 > 2000 || arg9 > 2000) {
            return false;
        } else if (arg5 >= -2000 && arg6 >= -2000 && arg7 >= -2000 && arg8 >= -2000 && arg0 >= -2000 && arg9 >= -2000) {
            if (class182.field3061 == 2) {
                int var10 = class245.field3908 * arg5 + arg8;
                if (var10 >= 0 && class239.field3788.length > var10 && (arg4 << 8) - 38400 < class239.field3788[var10]) {
                    return false;
                }
                int var11 = arg0 + (class245.field3908 * arg6);
                if (var11 >= 0 && class239.field3788.length > var11 && class239.field3788[var11] > (arg3 << 8) - 38400) {
                    return false;
                }
                int var12 = class245.field3908 * arg7 + arg9;
                if (var12 >= 0 && var12 < class239.field3788.length && class239.field3788[var12] > (arg2 << 8) - 38400) {
                    return false;
                }
            }
            int var13 = arg0 - arg8;
            int var14 = arg6 - arg5;
            int var15 = arg9 - arg8;
            int var16 = arg7 - arg5;
            int var17 = arg3 - arg4;
            int var18 = arg2 - arg4;
            if (arg6 > arg5 && arg7 > arg7) {
                arg5--;
                if (arg7 < arg6) {
                    arg6++;
                } else {
                    arg7++;
                }
            } else if (arg7 > arg6) {
                arg6--;
                if (arg7 >= arg5) {
                    arg7++;
                } else {
                    arg5++;
                }
            } else {
                arg7--;
                if (arg5 <= arg6) {
                    arg6++;
                } else {
                    arg5++;
                }
            }
            int var19 = 0;
            int var20 = 99 / ((-arg1 - 71) / 45);
            if (arg5 != arg6) {
                var19 = (arg0 - arg8 << 12) / (arg6 - arg5);
            }
            int var21 = 0;
            if (arg6 != arg7) {
                var21 = (arg9 - arg0 << 12) / (arg7 - arg6);
            }
            int var22 = 0;
            if (arg5 != arg7) {
                var22 = (arg8 - arg9 << 12) / (arg5 - arg7);
            }
            int var23 = var13 * var16 - (var14 * var15);
            if (var23 == 0) {
                return false;
            }
            int var24 = (var16 * var17 - (var14 * var18) << 8) / var23;
            int var25 = (var13 * var18 - (var15 * var17) << 8) / var23;
            if (arg5 <= arg6 && arg7 >= arg5) {
                if (arg5 >= class570.field8156) {
                    return true;
                }
                if (class570.field8156 < arg6) {
                    arg6 = class570.field8156;
                }
                int var26 = (arg4 << 8) + var24 - (arg8 * var24);
                if (arg7 > class570.field8156) {
                    arg7 = class570.field8156;
                }
                if (arg7 > arg6) {
                    int var27;
                    int var28 = var27 = arg8 << 12;
                    if (arg5 < 0) {
                        var27 -= arg5 * var19;
                        var26 -= arg5 * var25;
                        var28 -= arg5 * var22;
                        arg5 = 0;
                    }
                    int var29 = arg0 << 12;
                    if (arg6 < 0) {
                        var29 -= arg6 * var21;
                        arg6 = 0;
                    }
                    if (arg5 != arg6 && var22 < var19 || arg5 == arg6 && var21 < var22) {
                        int var30 = arg7 - arg6;
                        int var31 = arg6 - arg5;
                        int var32 = class245.field3908 * arg5;
                        while (true) {
                            var31--;
                            if (var31 < 0) {
                                while (true) {
                                    var30--;
                                    if (var30 < 0) {
                                        return true;
                                    }
                                    if (!class610.method3549(var32, (var29 >> 12) + 1, (var28 >> 12) + -1, 0, 0, var26, class239.field3788, var24)) {
                                        return false;
                                    }
                                    var32 += class245.field3908;
                                    var29 += var21;
                                    var28 += var22;
                                    var26 += var25;
                                }
                            }
                            if (!class610.method3549(var32, (var27 >> 12) + 1, (var28 >> 12) - 1, 0, 0, var26, class239.field3788, var24)) {
                                return false;
                            }
                            var28 += var22;
                            var26 += var25;
                            var32 += class245.field3908;
                            var27 += var19;
                        }
                    } else {
                        int var33 = arg7 - arg6;
                        int var34 = arg6 - arg5;
                        int var35 = class245.field3908 * arg5;
                        while (true) {
                            var34--;
                            if (var34 < 0) {
                                while (true) {
                                    var33--;
                                    if (var33 < 0) {
                                        return true;
                                    }
                                    if (!class610.method3549(var35, (var28 >> 12) + 1, (var29 >> 12) - 1, 0, 0, var26, class239.field3788, var24)) {
                                        return false;
                                    }
                                    var35 += class245.field3908;
                                    var29 += var21;
                                    var28 += var22;
                                    var26 += var25;
                                }
                            }
                            if (!class610.method3549(var35, (var28 >> 12) + 1, (var27 >> 12) + -1, 0, 0, var26, class239.field3788, var24)) {
                                return false;
                            }
                            var27 += var19;
                            var28 += var22;
                            var26 += var25;
                            var35 += class245.field3908;
                        }
                    }
                } else {
                    int var36;
                    int var37 = var36 = arg8 << 12;
                    if (arg5 < 0) {
                        var36 -= arg5 * var19;
                        var26 -= arg5 * var25;
                        var37 -= arg5 * var22;
                        arg5 = 0;
                    }
                    int var38 = arg9 << 12;
                    if (arg7 < 0) {
                        var38 -= arg7 * var21;
                        arg7 = 0;
                    }
                    if (arg5 != arg7 && var19 > var22 || arg5 == arg7 && var19 < var21) {
                        int var39 = arg6 - arg7;
                        int var40 = arg7 - arg5;
                        int var41 = class245.field3908 * arg5;
                        while (true) {
                            var40--;
                            if (var40 < 0) {
                                while (true) {
                                    var39--;
                                    if (var39 < 0) {
                                        return true;
                                    }
                                    if (!class610.method3549(var41, (var36 >> 12) + 1, (var38 >> 12) + -1, 0, 0, var26, class239.field3788, var24)) {
                                        return false;
                                    }
                                    var41 += class245.field3908;
                                    var26 += var25;
                                    var36 += var19;
                                    var38 += var21;
                                }
                            }
                            if (!class610.method3549(var41, (var36 >> 12) + 1, (var37 >> 12) + -1, 0, 0, var26, class239.field3788, var24)) {
                                return false;
                            }
                            var37 += var22;
                            var41 += class245.field3908;
                            var26 += var25;
                            var36 += var19;
                        }
                    } else {
                        int var42 = arg6 - arg7;
                        int var43 = arg7 - arg5;
                        int var44 = class245.field3908 * arg5;
                        while (true) {
                            var43--;
                            if (var43 < 0) {
                                while (true) {
                                    var42--;
                                    if (var42 < 0) {
                                        return true;
                                    }
                                    if (!class610.method3549(var44, (var38 >> 12) + 1, (var36 >> 12) + -1, 0, 0, var26, class239.field3788, var24)) {
                                        return false;
                                    }
                                    var26 += var25;
                                    var38 += var21;
                                    var44 += class245.field3908;
                                    var36 += var19;
                                }
                            }
                            if (!class610.method3549(var44, (var37 >> 12) + 1, (var36 >> 12) + -1, 0, 0, var26, class239.field3788, var24)) {
                                return false;
                            }
                            var26 += var25;
                            var36 += var19;
                            var44 += class245.field3908;
                            var37 += var22;
                        }
                    }
                }
            } else if (arg6 > arg7) {
                if (arg7 >= class570.field8156) {
                    return true;
                }
                if (class570.field8156 < arg5) {
                    arg5 = class570.field8156;
                }
                int var45 = (arg2 << 8) + var24 - arg9 * var24;
                if (arg6 > class570.field8156) {
                    arg6 = class570.field8156;
                }
                if (arg6 <= arg5) {
                    int var46;
                    int var47 = var46 = arg9 << 12;
                    int var48 = arg0 << 12;
                    if (arg7 < 0) {
                        var47 -= arg7 * var21;
                        var46 -= arg7 * var22;
                        var45 -= arg7 * var25;
                        arg7 = 0;
                    }
                    if (arg6 < 0) {
                        var48 -= arg6 * var19;
                        arg6 = 0;
                    }
                    if (var21 >= var22) {
                        int var49 = arg5 - arg6;
                        int var50 = arg6 - arg7;
                        int var51 = class245.field3908 * arg7;
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                while (true) {
                                    var49--;
                                    if (var49 < 0) {
                                        return true;
                                    }
                                    if (!class610.method3549(var51, (var48 >> 12) + 1, (var46 >> 12) + -1, 0, 0, var45, class239.field3788, var24)) {
                                        return false;
                                    }
                                    var48 += var19;
                                    var45 += var25;
                                    var46 += var22;
                                    var51 += class245.field3908;
                                }
                            }
                            if (!class610.method3549(var51, (var47 >> 12) + 1, (var46 >> 12) + -1, 0, 0, var45, class239.field3788, var24)) {
                                return false;
                            }
                            var45 += var25;
                            var47 += var21;
                            var51 += class245.field3908;
                            var46 += var22;
                        }
                    } else {
                        int var52 = arg5 - arg6;
                        int var53 = arg6 - arg7;
                        int var54 = class245.field3908 * arg7;
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                while (true) {
                                    var52--;
                                    if (var52 < 0) {
                                        return true;
                                    }
                                    if (!class610.method3549(var54, (var46 >> 12) + 1, (var48 >> 12) + -1, 0, 0, var45, class239.field3788, var24)) {
                                        return false;
                                    }
                                    var46 += var22;
                                    var54 += class245.field3908;
                                    var45 += var25;
                                    var48 += var19;
                                }
                            }
                            if (!class610.method3549(var54, (var46 >> 12) + 1, (var47 >> 12) + -1, 0, 0, var45, class239.field3788, var24)) {
                                return false;
                            }
                            var47 += var21;
                            var54 += class245.field3908;
                            var46 += var22;
                            var45 += var25;
                        }
                    }
                } else {
                    int var55;
                    int var56 = var55 = arg9 << 12;
                    if (arg7 < 0) {
                        var55 -= arg7 * var22;
                        var45 -= arg7 * var25;
                        var56 -= arg7 * var21;
                        arg7 = 0;
                    }
                    int var57 = arg8 << 12;
                    if (arg5 < 0) {
                        var57 -= arg5 * var19;
                        arg5 = 0;
                    }
                    if (var21 >= var22) {
                        int var58 = arg6 - arg5;
                        int var59 = arg5 - arg7;
                        int var60 = class245.field3908 * arg7;
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                while (true) {
                                    var58--;
                                    if (var58 < 0) {
                                        return true;
                                    }
                                    if (!class610.method3549(var60, (var56 >> 12) + 1, (var57 >> 12) + -1, 0, 0, var45, class239.field3788, var24)) {
                                        return false;
                                    }
                                    var60 += class245.field3908;
                                    var45 += var25;
                                    var56 += var21;
                                    var57 += var19;
                                }
                            }
                            if (!class610.method3549(var60, (var56 >> 12) + 1, (var55 >> 12) - 1, 0, 0, var45, class239.field3788, var24)) {
                                return false;
                            }
                            var45 += var25;
                            var55 += var22;
                            var60 += class245.field3908;
                            var56 += var21;
                        }
                    } else {
                        int var61 = arg6 - arg5;
                        int var62 = arg5 - arg7;
                        int var63 = class245.field3908 * arg7;
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                while (true) {
                                    var61--;
                                    if (var61 < 0) {
                                        return true;
                                    }
                                    if (!class610.method3549(var63, (var57 >> 12) + 1, (var56 >> 12) + -1, 0, 0, var45, class239.field3788, var24)) {
                                        return false;
                                    }
                                    var56 += var21;
                                    var63 += class245.field3908;
                                    var45 += var25;
                                    var57 += var19;
                                }
                            }
                            if (!class610.method3549(var63, (var55 >> 12) + 1, (var56 >> 12) - 1, 0, 0, var45, class239.field3788, var24)) {
                                return false;
                            }
                            var45 += var25;
                            var55 += var22;
                            var63 += class245.field3908;
                            var56 += var21;
                        }
                    }
                }
            } else if (class570.field8156 <= arg6) {
                return true;
            } else {
                if (class570.field8156 < arg7) {
                    arg7 = class570.field8156;
                }
                int var64 = (arg3 << 8) + var24 - (arg0 * var24);
                if (arg5 > class570.field8156) {
                    arg5 = class570.field8156;
                }
                if (arg7 < arg5) {
                    int var65;
                    int var66 = var65 = arg0 << 12;
                    int var67 = arg9 << 12;
                    if (arg6 < 0) {
                        var64 -= arg6 * var25;
                        var66 -= arg6 * var19;
                        var65 -= arg6 * var21;
                        arg6 = 0;
                    }
                    if (arg7 < 0) {
                        var67 -= arg7 * var22;
                        arg7 = 0;
                    }
                    if ((arg6 == arg7 || var21 <= var19) && (arg6 != arg7 || var22 >= var19)) {
                        int var71 = arg5 - arg7;
                        int var72 = arg7 - arg6;
                        int var73 = class245.field3908 * arg6;
                        while (true) {
                            var72--;
                            if (var72 < 0) {
                                while (true) {
                                    var71--;
                                    if (var71 < 0) {
                                        return true;
                                    }
                                    if (!class610.method3549(var73, (var66 >> 12) + 1, (var67 >> 12) - 1, 0, 0, var64, class239.field3788, var24)) {
                                        return false;
                                    }
                                    var66 += var19;
                                    var64 += var25;
                                    var67 += var22;
                                    var73 += class245.field3908;
                                }
                            }
                            if (!class610.method3549(var73, (var66 >> 12) + 1, (var65 >> 12) + -1, 0, 0, var64, class239.field3788, var24)) {
                                return false;
                            }
                            var65 += var21;
                            var73 += class245.field3908;
                            var66 += var19;
                            var64 += var25;
                        }
                    } else {
                        int var68 = arg5 - arg7;
                        int var69 = arg7 - arg6;
                        int var70 = class245.field3908 * arg6;
                        while (true) {
                            var69--;
                            if (var69 < 0) {
                                while (true) {
                                    var68--;
                                    if (var68 < 0) {
                                        return true;
                                    }
                                    if (!class610.method3549(var70, (var67 >> 12) + 1, (var66 >> 12) - 1, 0, 0, var64, class239.field3788, var24)) {
                                        return false;
                                    }
                                    var70 += class245.field3908;
                                    var66 += var19;
                                    var64 += var25;
                                    var67 += var22;
                                }
                            }
                            if (!class610.method3549(var70, (var65 >> 12) + 1, (var66 >> 12) + -1, 0, 0, var64, class239.field3788, var24)) {
                                return false;
                            }
                            var66 += var19;
                            var64 += var25;
                            var70 += class245.field3908;
                            var65 += var21;
                        }
                    }
                } else {
                    int var74;
                    int var75 = var74 = arg0 << 12;
                    int var76 = arg8 << 12;
                    if (arg6 < 0) {
                        var75 -= arg6 * var19;
                        var74 -= arg6 * var21;
                        var64 -= arg6 * var25;
                        arg6 = 0;
                    }
                    if (arg5 < 0) {
                        var76 -= arg5 * var22;
                        arg5 = 0;
                    }
                    if (var19 < var21) {
                        int var77 = arg7 - arg5;
                        int var78 = arg5 - arg6;
                        int var79 = class245.field3908 * arg6;
                        while (true) {
                            var78--;
                            if (var78 < 0) {
                                while (true) {
                                    var77--;
                                    if (var77 < 0) {
                                        return true;
                                    }
                                    if (!class610.method3549(var79, (var74 >> 12) + 1, (var76 >> 12) + -1, 0, 0, var64, class239.field3788, var24)) {
                                        return false;
                                    }
                                    var64 += var25;
                                    var74 += var21;
                                    var76 += var22;
                                    var79 += class245.field3908;
                                }
                            }
                            if (!class610.method3549(var79, (var74 >> 12) + 1, (var75 >> 12) + -1, 0, 0, var64, class239.field3788, var24)) {
                                return false;
                            }
                            var64 += var25;
                            var74 += var21;
                            var75 += var19;
                            var79 += class245.field3908;
                        }
                    } else {
                        int var80 = arg7 - arg5;
                        int var81 = arg5 - arg6;
                        int var82 = class245.field3908 * arg6;
                        while (true) {
                            var81--;
                            if (var81 < 0) {
                                while (true) {
                                    var80--;
                                    if (var80 < 0) {
                                        return true;
                                    }
                                    if (!class610.method3549(var82, (var76 >> 12) + 1, (var74 >> 12) + -1, 0, 0, var64, class239.field3788, var24)) {
                                        return false;
                                    }
                                    var74 += var21;
                                    var82 += class245.field3908;
                                    var76 += var22;
                                    var64 += var25;
                                }
                            }
                            if (!class610.method3549(var82, (var75 >> 12) + 1, (var74 >> 12) + -1, 0, 0, var64, class239.field3788, var24)) {
                                return false;
                            }
                            var82 += class245.field3908;
                            var74 += var21;
                            var75 += var19;
                            var64 += var25;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final void method1084(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field3071) {
            float var11 = (float) this.method1076();
            float var12 = (float) this.method1079();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field3085 * var15;
            float var18 = (float) this.field3085 * var16;
            float var19 = (float) this.field3087 * var13;
            float var20 = (float) this.field3087 * var14;
            float var21 = (float) this.field3069 * -var13;
            float var22 = (float) this.field3069 * -var14;
            float var23 = (float) this.field3067 * -var15;
            float var24 = (float) this.field3067 * -var16;
            arg0 = arg0 + var19 + var17;
            arg3 = arg3 + var22 + var18;
            arg2 = arg2 + var21 + var17;
            arg1 = arg1 + var20 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        field3072++;
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field3070.method2509((arg9 & 0x1) != 0, -103);
        this.field3077.method822(true);
        this.field3077.method856(false, this.field3070);
        this.field3077.method889(57, arg8);
        this.field3077.method816(arg6, -116);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field3070.field3240);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field3070.field3238, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field3070.field3238, this.field3070.field3240);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!wfa", name = "A", descriptor = "()I")
    public final int method1076() {
        field3084++;
        return this.field3070.field3231 + this.field3087 + this.field3069;
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)V")
    public static void method1488(int arg0) {
        field3093 = null;
        if (arg0 != 0) {
            field3075 = -94;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "da", descriptor = "(IIIIII)V")
    public final void method1081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3070.method1159(-105, arg5, arg1, arg2, arg3, arg0, arg4);
        field3076++;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III)V")
    public static final void method1489(int arg0, int arg1, int arg2) {
        field3092++;
        class413 var3 = class674.method3852(arg2, arg0, 124);
        var3.method2633(16777215);
        var3.field6337 = arg1;
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(II)V")
    private final void method1490(int arg0, int arg1) {
        this.field3077.method834(true, 1);
        field3073++;
        this.field3077.method856(false, this.field3070);
        this.field3077.method857(8960, 7681, this.field3077.method825(arg0, -107));
        this.field3077.method844(768, 34167, 1, (byte) -102);
        this.field3077.method820(34168, 770, 0, 121);
        this.field3077.method834(true, 0);
        this.field3077.method856(false, this.field3094);
        this.field3077.method857(8960, 7681, 34479);
        if (arg1 != 21929) {
            return;
        }
        this.field3077.method844(768, 34166, 1, (byte) -102);
        if (this.field3074 == 0) {
            this.field3077.method845(1.0F, 0.0F, 0.5F, 34161, 0.5F);
        } else if (this.field3074 == 1) {
            this.field3077.method845(0.5F, 0.0F, 1.0F, 34161, 0.5F);
        } else if (this.field3074 == 2) {
            this.field3077.method845(0.5F, 0.0F, 0.5F, 34161, 1.0F);
        } else if (this.field3074 == 3) {
            this.field3077.method845(128.5F, 0.0F, 128.5F, arg1 + 12232, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "u", descriptor = "()I")
    public final int method1075() {
        field3078++;
        return this.field3070.field3236;
    }

    @OriginalMember(owner = "client!wfa", name = "ca", descriptor = "()I")
    public final int method1079() {
        field3083++;
        return this.field3070.field3236 + this.field3085 + this.field3067;
    }

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "(I)I")
    public static final int method1491(int arg0) {
        field3095++;
        if (arg0 >= -62) {
            field3093 = null;
        }
        return class204.field3327.method2939(-107);
    }

    @OriginalMember(owner = "client!wfa", name = "YA", descriptor = "(IIIIIIII)V")
    public final void method1074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3082++;
        this.field3070.method2509((arg7 & 0x1) != 0, -107);
        this.field3077.method822(true);
        this.field3077.method889(124, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3071) {
            float var9 = (float) arg2 / (float) this.method1076();
            float var10 = (float) arg3 / (float) this.method1079();
            float var11 = (float) this.field3087 * var9 + (float) arg0;
            float var12 = (float) this.field3085 * var10 + (float) arg1;
            float var13 = (float) this.field3070.field3231 * var9 + var11;
            float var14 = (float) this.field3070.field3236 * var10 + var12;
            if (this.field3094 == null) {
                this.field3077.method856(false, this.field3070);
                this.field3077.method816(arg4, -118);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field3070.field3240);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field3070.field3238, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field3070.field3238, this.field3070.field3240);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method1490(arg4, 21929);
                this.field3094.method2509(true, -128);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3070.field3240);
                OpenGL.glTexCoord2f(0.0F, this.field3070.field3240);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field3070.field3238, 0.0F);
                OpenGL.glTexCoord2f(this.field3070.field3238, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field3070.field3238, this.field3070.field3240);
                OpenGL.glTexCoord2f(this.field3070.field3238, this.field3070.field3240);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method1485(8448);
            }
        } else if (this.field3094 == null) {
            this.field3077.method856(false, this.field3070);
            this.field3077.method816(arg4, -125);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3070.field3240);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3070.field3238, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3070.field3238, this.field3070.field3240);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1490(arg4, 21929);
            this.field3094.method2509(true, -63);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3070.field3240);
            OpenGL.glTexCoord2f(0.0F, this.field3070.field3240);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3070.field3238, 0.0F);
            OpenGL.glTexCoord2f(this.field3070.field3238, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3070.field3238, this.field3070.field3240);
            OpenGL.glTexCoord2f(this.field3070.field3238, this.field3070.field3240);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1485(8448);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Ler;IIZ)V")
    public class183(class92 arg0, int arg1, int arg2, boolean arg3) {
        this.field3077 = arg0;
        this.field3070 = class585.method3428(arg0, arg1, arg3 ? 6408 : 6407, arg2, (byte) 126);
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Ler;IIII)V")
    public class183(class92 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3077 = arg0;
        this.field3070 = class90.method807(arg2, arg3, arg1, arg0, -126, arg4);
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Ler;II[III)V")
    public class183(class92 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3077 = arg0;
        this.field3070 = class565.method3346(false, arg3, arg5, arg1, arg0, -2, arg2, arg4);
    }
}
