import jaggl.OpenGL;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class260 extends class257 {

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    private int field3727 = 0;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Z")
    private boolean field3730 = false;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    private int field3722 = 0;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    private int field3735 = 0;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    private int field3737 = 0;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    private int field3738 = 0;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "Lkfa;")
    private class382 field3720;

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "Lbb;")
    public class196 field3747;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "Lvh;")
    public static class125 field3723 = new class125(61, 4);

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "Lmo;")
    public static class482 field3749 = new class482(16);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "Lbb;")
    private class196 field3746;

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "Ljava/lang/Thread;")
    public static Thread field3751;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "()I")
    public final int method17() {
        field3732++;
        return this.field3747.field3058;
    }

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "()I")
    public final int method11() {
        field3741++;
        return this.field3735 + this.field3727 + this.field3747.field3056;
    }

    @OriginalMember(owner = "client!rk", name = "da", descriptor = "(IIIIII)V")
    public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3739++;
        this.field3747.method3381(arg0, arg3, (byte) -117, arg5, arg1, arg4, arg2);
    }

    @OriginalMember(owner = "client!rk", name = "YA", descriptor = "(IIIIIIII)V")
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3747.method2001(540800, (arg7 & 0x1) != 0);
        field3718++;
        this.field3720.method2337(122);
        this.field3720.method2325(arg6, (byte) 45);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3730) {
            float var9 = (float) arg2 / (float) this.method11();
            float var10 = (float) arg3 / (float) this.method9();
            float var11 = (float) this.field3727 * var9 + (float) arg0;
            float var12 = (float) this.field3738 * var10 + (float) arg1;
            float var13 = (float) this.field3747.field3056 * var9 + var11;
            float var14 = (float) this.field3747.field3058 * var10 + var12;
            if (this.field3746 == null) {
                this.field3720.method2295((byte) 126, this.field3747);
                this.field3720.method2270(arg4, (byte) 110);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field3747.field3063);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field3747.field3060, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field3747.field3060, this.field3747.field3063);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method1647(arg4, (byte) -56);
                this.field3746.method2001(540800, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3747.field3063);
                OpenGL.glTexCoord2f(0.0F, this.field3747.field3063);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field3747.field3060, 0.0F);
                OpenGL.glTexCoord2f(this.field3747.field3060, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field3747.field3060, this.field3747.field3063);
                OpenGL.glTexCoord2f(this.field3747.field3060, this.field3747.field3063);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method1645(123);
            }
        } else if (this.field3746 == null) {
            this.field3720.method2295((byte) 48, this.field3747);
            this.field3720.method2270(arg4, (byte) 110);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3747.field3063);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3747.field3060, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3747.field3060, this.field3747.field3063);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1647(arg4, (byte) -118);
            this.field3746.method2001(540800, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3747.field3063);
            OpenGL.glTexCoord2f(0.0F, this.field3747.field3063);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3747.field3060, 0.0F);
            OpenGL.glTexCoord2f(this.field3747.field3060, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3747.field3060, this.field3747.field3063);
            OpenGL.glTexCoord2f(this.field3747.field3060, this.field3747.field3063);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1645(-115);
        }
    }

    @OriginalMember(owner = "client!rk", name = "DA", descriptor = "(IIIIIII)V")
    public final void method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3742++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field3747.method2001(540800, false);
        this.field3720.method2337(124);
        this.field3720.method2295((byte) -109, this.field3747);
        this.field3720.method2325(arg6, (byte) 45);
        this.field3720.method2270(arg4, (byte) 110);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3747.field3064 && !this.field3730) {
            float var10 = (float) arg3 * this.field3747.field3063 / (float) this.field3747.field3058;
            float var11 = (float) arg2 * this.field3747.field3060 / (float) this.field3747.field3056;
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
        OpenGL.glTranslatef((float) this.field3727, (float) this.field3738, 0.0F);
        int var12 = this.method11();
        int var13 = this.method9();
        int var14 = this.field3747.field3058 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = arg0 + this.field3747.field3056;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field3747.field3063);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field3747.field3060, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field3747.field3060, this.field3747.field3063);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field3747.field3060 / (float) this.field3747.field3056;
                OpenGL.glTexCoord2f(0.0F, this.field3747.field3063);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field3747.field3063);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field3747.field3058 + var15 - var9) * this.field3747.field3063 / (float) this.field3747.field3058;
            int var17 = this.field3747.field3056 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field3747.field3063);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field3747.field3060, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field3747.field3060, this.field3747.field3063);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field3747.field3060 / (float) this.field3747.field3056;
                OpenGL.glTexCoord2f(0.0F, this.field3747.field3063);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field3747.field3063);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method1643(int arg0) {
        field3751 = null;
        if (arg0 != -617684776) {
            field3751 = null;
        }
        field3723 = null;
        field3749 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method16(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class591 arg7, int arg8, int arg9) {
        field3724++;
        class196 var11 = ((class91) arg7).field1336;
        if (this.field3730) {
            float var12 = (float) this.method11();
            float var13 = (float) this.method9();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field3738 * var16;
            float var19 = (float) this.field3738 * var17;
            float var20 = (float) this.field3727 * var14;
            float var21 = (float) this.field3727 * var15;
            float var22 = (float) this.field3735 * -var14;
            float var23 = (float) this.field3735 * -var15;
            float var24 = (float) this.field3722 * -var16;
            arg3 = arg3 + var23 + var19;
            float var25 = (float) this.field3722 * -var17;
            arg4 = arg4 + var20 + var24;
            arg0 = arg0 + var20 + var18;
            arg1 = arg1 + var21 + var19;
            arg2 = arg2 + var22 + var18;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field3747.method2001(540800, (arg6 & 0x1) != 0);
        float var27 = arg5 + arg3 - arg1;
        this.field3720.method2337(125);
        this.field3720.method2295((byte) 17, this.field3747);
        this.field3720.method2270(1, (byte) 110);
        this.field3720.method2308(1, -15115);
        this.field3720.method2295((byte) 30, var11);
        this.field3720.method2328(7681, 69, 8448);
        this.field3720.method2262(34168, 0, 34176, 768);
        this.field3720.method2325(1, (byte) 45);
        float var28 = var11.field3060 / (float) var11.field3056;
        float var29 = var11.field3063 / (float) var11.field3058;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3747.field3063);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field3063 - (arg1 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field3063 - ((arg5 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field3747.field3060, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field3063 - ((var27 - (float) arg9) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field3747.field3060, this.field3747.field3063);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field3063 - (arg3 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field3720.method2262(5890, 0, 34176, 768);
        this.field3720.method2270(0, (byte) 110);
        this.field3720.method2295((byte) -111, null);
        this.field3720.method2308(0, -15115);
    }

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "(IIII)V")
    public final void method7(int arg0, int arg1, int arg2, int arg3) {
        field3734++;
        this.field3727 = arg0;
        this.field3738 = arg1;
        this.field3735 = arg2;
        this.field3722 = arg3;
        this.field3730 = this.field3727 != 0 || this.field3738 != 0 || this.field3735 != 0 || this.field3722 != 0;
    }

    @OriginalMember(owner = "client!rk", name = "xa", descriptor = "(III)V")
    public final void method501(int arg0, int arg1, int arg2) {
        field3733++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field3746 = class484.method2823(this.field3747.field3058, this.field3720, true, this.field3747.field3056, arg0, arg1);
        this.field3737 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!rk", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final void method5(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field3748++;
        if (this.field3730) {
            float var11 = (float) this.method11();
            float var12 = (float) this.method9();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field3738 * var15;
            float var18 = (float) this.field3738 * var16;
            float var19 = (float) this.field3727 * var13;
            float var20 = (float) this.field3727 * var14;
            float var21 = (float) this.field3735 * -var13;
            float var22 = (float) this.field3735 * -var14;
            float var23 = (float) this.field3722 * -var15;
            arg2 = arg2 + var21 + var17;
            float var24 = (float) this.field3722 * -var16;
            arg4 = arg4 + var19 + var23;
            arg0 = arg0 + var19 + var17;
            arg3 = arg3 + var22 + var18;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field3747.method2001(540800, (arg9 & 0x1) != 0);
        float var26 = arg5 + arg3 - arg1;
        this.field3720.method2337(122);
        this.field3720.method2295((byte) 120, this.field3747);
        this.field3720.method2325(arg8, (byte) 45);
        this.field3720.method2270(arg6, (byte) 110);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field3747.field3063);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field3747.field3060, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field3747.field3060, this.field3747.field3063);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIBII)V")
    public static final void method1644(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3728++;
        class699 var5 = class336.method1996((byte) 125);
        var5.field9908.method2753((byte) 65, class561.field8191.field4340);
        var5.field9908.method2753((byte) 106, arg4);
        var5.field9908.method2753((byte) 110, arg1);
        var5.field9908.method2739((byte) -86, arg3);
        var5.field9908.method2739((byte) -86, arg0);
        class149.method1134(var5, true);
        class211.field3232 = 0;
        class514.field7630 = 0;
        int var6 = 48 / ((arg2 - 7) / 60);
        class250.field3623 = 1;
        class693.field9848 = -3;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
    private final void method1645(int arg0) {
        this.field3720.method2308(1, -15115);
        field3743++;
        this.field3720.method2295((byte) -125, null);
        this.field3720.method2328(8448, 104, 8448);
        int var2 = -44 % ((-arg0 - 5) / 60);
        this.field3720.method2262(34168, 1, 34176, 768);
        this.field3720.method2258(-55, 5890, 770, 0);
        this.field3720.method2308(0, -15115);
        this.field3720.method2262(34168, 1, 34176, 768);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1646(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field3736++;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg3 - arg2;
        int var12 = arg5 - arg2;
        if (arg7 != 4) {
            field3749 = null;
        }
        int var13 = arg3 * arg3;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg5 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg5 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class657.field9275[arg4];
        class223.method1484(var39, arg6 - var11, -94, arg1, arg6 - arg3);
        class223.method1484(var39, arg6 + var11, -108, arg0, arg6 - var11);
        class223.method1484(var39, arg3 + arg6, -104, arg1, arg6 + var11);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var41 = arg4 - var9;
            int var42 = arg4 + var9;
            int var43 = arg6 + var8;
            int var44 = arg6 - var8;
            if (var40) {
                int var45 = arg6 + var10;
                int var46 = arg6 - var10;
                class223.method1484(class657.field9275[var41], var46, -113, arg1, var44);
                class223.method1484(class657.field9275[var41], var45, -79, arg0, var46);
                class223.method1484(class657.field9275[var41], var43, arg7 ^ 0xFFFFFF8C, arg1, var45);
                class223.method1484(class657.field9275[var42], var46, -88, arg1, var44);
                class223.method1484(class657.field9275[var42], var45, -110, arg0, var46);
                class223.method1484(class657.field9275[var42], var43, arg7 - 126, arg1, var45);
            } else {
                class223.method1484(class657.field9275[var41], var43, -85, arg1, var44);
                class223.method1484(class657.field9275[var42], var43, -116, arg1, var44);
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V")
    private final void method1647(int arg0, byte arg1) {
        this.field3720.method2308(1, -15115);
        field3731++;
        this.field3720.method2295((byte) -97, this.field3747);
        if (arg1 > -49) {
            this.method17();
        }
        this.field3720.method2328(this.field3720.method2288((byte) 103, arg0), -84, 7681);
        this.field3720.method2262(34167, 1, 34176, 768);
        this.field3720.method2258(-95, 34168, 770, 0);
        this.field3720.method2308(0, -15115);
        this.field3720.method2295((byte) -110, this.field3746);
        this.field3720.method2328(34479, -85, 7681);
        this.field3720.method2262(34166, 1, 34176, 768);
        if (this.field3737 == 0) {
            this.field3720.method2329(0, 0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field3737 == 1) {
            this.field3720.method2329(0, 1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field3737 == 2) {
            this.field3720.method2329(0, 0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field3737 == 3) {
            this.field3720.method2329(0, 128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!rk", name = "ca", descriptor = "()I")
    public final int method9() {
        field3717++;
        return this.field3747.field3058 + this.field3738 + this.field3722;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V")
    public static final void method1648(int arg0) {
        class9.method52();
        field3726++;
        if (arg0 <= 71) {
            return;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class45.field609[var1].method3165(true);
        }
        class541.method3183((byte) 52);
        class293.method1795((byte) -94);
        System.gc();
        class637.field9048.method138();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(CI)Z")
    public static final boolean method1649(char arg0, int arg1) {
        field3740++;
        if (arg1 != 0) {
            method1644(-97, 118, (byte) -62, 10, 48);
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILua;II)V")
    public final void method4(int arg0, int arg1, class591 arg2, int arg3, int arg4) {
        field3744++;
        class91 var6 = (class91) arg2;
        class196 var7 = var6.field1336;
        this.field3747.method2001(540800, false);
        this.field3720.method2337(116);
        this.field3720.method2295((byte) 50, this.field3747);
        this.field3720.method2270(1, (byte) 110);
        this.field3720.method2308(1, -15115);
        this.field3720.method2295((byte) 112, var7);
        this.field3720.method2328(7681, 123, 8448);
        this.field3720.method2262(34168, 0, 34176, 768);
        this.field3720.method2325(1, (byte) 45);
        int var8 = this.field3738 + arg1;
        int var9 = this.field3727 + arg0;
        int var10 = this.field3747.field3056 + var9;
        int var11 = this.field3747.field3058 + var8;
        float var12 = var7.field3060 / (float) var7.field3056;
        float var13 = var7.field3063 / (float) var7.field3058;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field3063 - (float) (var8 - arg4) * var13;
        float var17 = var7.field3063 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3747.field3063);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field3747.field3058 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field3747.field3060, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field3747.field3056 + var9, this.field3747.field3058 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field3747.field3060, this.field3747.field3063);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field3747.field3056 + var9, var8);
        OpenGL.glEnd();
        this.field3720.method2262(5890, 0, 34176, 768);
        this.field3720.method2270(0, (byte) 110);
        this.field3720.method2295((byte) 106, null);
        this.field3720.method2308(0, -15115);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)V")
    public static final void method1650(int arg0, int arg1) {
        field3719++;
        if (!class525.field7713.field5983) {
            arg0 = -1;
        }
        if (arg1 != 448389448 || class651.field9196 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class396 var2 = class329.field4559.method2241(false, arg0);
            class628 var3 = var2.method2407(-1);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class653.field9220.method3961(var3.method3546(), new Point(var2.field5736, var2.field5733), var3.method3548(), true, var3.method3540(), class126.field2061);
                class651.field9196 = arg0;
            }
        }
        if (arg0 == -1 && class651.field9196 != -1) {
            class653.field9220.method3961(null, new Point(), -1, true, -1, class126.field2061);
            class651.field9196 = -1;
        }
    }

    @OriginalMember(owner = "client!rk", name = "V", descriptor = "(IIIII)V")
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3747.method2001(540800, false);
        field3729++;
        this.field3720.method2337(126);
        this.field3720.method2325(arg4, (byte) 45);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field3738 + arg1;
        int var7 = this.field3727 + arg0;
        if (this.field3746 == null) {
            this.field3720.method2295((byte) 108, this.field3747);
            this.field3720.method2270(arg2, (byte) 110);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3747.field3063);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, var6 + this.field3747.field3058);
            OpenGL.glTexCoord2f(this.field3747.field3060, 0.0F);
            OpenGL.glVertex2i(this.field3747.field3056 + var7, this.field3747.field3058 + var6);
            OpenGL.glTexCoord2f(this.field3747.field3060, this.field3747.field3063);
            OpenGL.glVertex2i(var7 + this.field3747.field3056, var6);
            OpenGL.glEnd();
            return;
        }
        this.method1647(arg2, (byte) -64);
        this.field3746.method2001(540800, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3747.field3063);
        OpenGL.glTexCoord2f(0.0F, this.field3747.field3063);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field3747.field3058 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field3747.field3060, 0.0F);
        OpenGL.glTexCoord2f(this.field3747.field3060, 0.0F);
        OpenGL.glVertex2i(this.field3747.field3056 + var7, var6 - -this.field3747.field3058);
        OpenGL.glMultiTexCoord2f(33985, this.field3747.field3060, this.field3747.field3063);
        OpenGL.glTexCoord2f(this.field3747.field3060, this.field3747.field3063);
        OpenGL.glVertex2i(this.field3747.field3056 + var7, var6);
        OpenGL.glEnd();
        this.method1645(81);
    }

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "()I")
    public final int method12() {
        field3721++;
        return this.field3747.field3056;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lkfa;IIZ)V")
    public class260(class382 arg0, int arg1, int arg2, boolean arg3) {
        this.field3720 = arg0;
        this.field3747 = class668.method3763(arg1, arg2, arg0, (byte) 23, arg3 ? 6408 : 6407);
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lkfa;IIII)V")
    public class260(class382 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3720 = arg0;
        this.field3747 = class484.method2823(arg4, arg0, true, arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lkfa;II[III)V")
    public class260(class382 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3720 = arg0;
        this.field3747 = class213.method1453(arg3, arg0, -2149, false, arg4, arg1, arg5, arg2);
    }
}
