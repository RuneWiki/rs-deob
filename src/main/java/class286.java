import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class286 extends class680 {

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    private int field3793 = 0;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    private int field3804 = 0;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "Z")
    private boolean field3801 = false;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    private int field3809 = 0;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    private int field3808 = 0;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    private int field3816 = 0;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "Lac;")
    private class541 field3812;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "Liaa;")
    private class495 field3814;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "Liaa;")
    private class495 field3807;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "Ljava/lang/Object;")
    public static Object field3819;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(IIIIIII)V")
    public final void method671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3813++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field3814.method1258(-28003, false);
        this.field3812.method2972((byte) -117);
        this.field3812.method3006(1, this.field3814);
        this.field3812.method3013((byte) -90, arg6);
        this.field3812.method3039(260, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3814.field6747 && !this.field3801) {
            float var10 = (float) arg3 * this.field3814.field6744 / (float) this.field3814.field6739;
            float var11 = (float) arg2 * this.field3814.field6740 / (float) this.field3814.field6742;
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
        OpenGL.glTranslatef((float) this.field3808, (float) this.field3809, 0.0F);
        int var12 = this.method666();
        int var13 = this.method663();
        int var14 = this.field3814.field6739 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field3814.field6742 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field3814.field6744);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field3814.field6740, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field3814.field6740, this.field3814.field6744);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field3814.field6740 / (float) this.field3814.field6742;
                OpenGL.glTexCoord2f(0.0F, this.field3814.field6744);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field3814.field6744);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field3814.field6739 + var15 - var9) * this.field3814.field6744 / (float) this.field3814.field6739;
            int var17 = this.field3814.field6742 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field3814.field6744);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field3814.field6740, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field3814.field6740, this.field3814.field6744);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field3814.field6740 / (float) this.field3814.field6742;
                OpenGL.glTexCoord2f(0.0F, this.field3814.field6744);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field3814.field6744);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)V")
    private final void method1718(boolean arg0, int arg1) {
        field3797++;
        if (arg0) {
            this.method1720(-23);
        }
        this.field3812.method2988(1, 847872872);
        this.field3812.method3006(1, this.field3814);
        this.field3812.method3042(7681, 8960, this.field3812.method3035(arg1, 596294056));
        this.field3812.method2983(1, 768, -58, 34167);
        this.field3812.method3029(770, 0, 34200, 34168);
        this.field3812.method2988(0, 847872872);
        this.field3812.method3006(1, this.field3807);
        this.field3812.method3042(7681, 8960, 34479);
        this.field3812.method2983(1, 768, 122, 34166);
        if (this.field3816 == 0) {
            this.field3812.method3001(0.5F, 0.5F, 1.0F, 0.0F, 108);
        } else if (this.field3816 == 1) {
            this.field3812.method3001(1.0F, 0.5F, 0.5F, 0.0F, -59);
        } else if (this.field3816 == 2) {
            this.field3812.method3001(0.5F, 1.0F, 0.5F, 0.0F, -89);
            return;
        } else if (this.field3816 == 3) {
            this.field3812.method3001(128.5F, 128.5F, 128.5F, 0.0F, -40);
            return;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIII)V")
    public final void method677(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3810++;
        this.field3814.method1258(-28003, false);
        this.field3812.method2972((byte) -104);
        this.field3812.method3013((byte) -110, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field3809 + arg1;
        int var7 = this.field3808 + arg0;
        if (this.field3807 == null) {
            this.field3812.method3006(1, this.field3814);
            this.field3812.method3039(260, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3814.field6744);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field3814.field6739 + var6);
            OpenGL.glTexCoord2f(this.field3814.field6740, 0.0F);
            OpenGL.glVertex2i(this.field3814.field6742 + var7, this.field3814.field6739 + var6);
            OpenGL.glTexCoord2f(this.field3814.field6740, this.field3814.field6744);
            OpenGL.glVertex2i(this.field3814.field6742 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method1718(false, arg2);
        this.field3807.method1258(-28003, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3814.field6744);
        OpenGL.glTexCoord2f(0.0F, this.field3814.field6744);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field3814.field6739 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field3814.field6740, 0.0F);
        OpenGL.glTexCoord2f(this.field3814.field6740, 0.0F);
        OpenGL.glVertex2i(this.field3814.field6742 + var7, this.field3814.field6739 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field3814.field6740, this.field3814.field6744);
        OpenGL.glTexCoord2f(this.field3814.field6740, this.field3814.field6744);
        OpenGL.glVertex2i(this.field3814.field6742 + var7, var6);
        OpenGL.glEnd();
        this.method1720(-22);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "()I")
    public final int method676() {
        field3817++;
        return this.field3814.field6739;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static void method1719(int arg0) {
        if (arg0 != 5890) {
            field3819 = null;
        }
        field3819 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIII)V")
    public final void method675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3796++;
        this.field3814.method1258(-28003, (arg7 & 0x1) != 0);
        this.field3812.method2972((byte) -126);
        this.field3812.method3013((byte) -75, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3801) {
            float var9 = (float) arg2 / (float) this.method666();
            float var10 = (float) arg3 / (float) this.method663();
            float var11 = (float) this.field3808 * var9 + (float) arg0;
            float var12 = (float) this.field3809 * var10 + (float) arg1;
            float var13 = (float) this.field3814.field6742 * var9 + var11;
            float var14 = (float) this.field3814.field6739 * var10 + var12;
            if (this.field3807 == null) {
                this.field3812.method3006(1, this.field3814);
                this.field3812.method3039(260, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field3814.field6744);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field3814.field6740, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field3814.field6740, this.field3814.field6744);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method1718(false, arg4);
                this.field3807.method1258(-28003, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3814.field6744);
                OpenGL.glTexCoord2f(0.0F, this.field3814.field6744);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field3814.field6740, 0.0F);
                OpenGL.glTexCoord2f(this.field3814.field6740, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field3814.field6740, this.field3814.field6744);
                OpenGL.glTexCoord2f(this.field3814.field6740, this.field3814.field6744);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method1720(-69);
            }
        } else if (this.field3807 == null) {
            this.field3812.method3006(1, this.field3814);
            this.field3812.method3039(260, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3814.field6744);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3814.field6740, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3814.field6740, this.field3814.field6744);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1718(false, arg4);
            this.field3807.method1258(-28003, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3814.field6744);
            OpenGL.glTexCoord2f(0.0F, this.field3814.field6744);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3814.field6740, 0.0F);
            OpenGL.glTexCoord2f(this.field3814.field6740, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3814.field6740, this.field3814.field6744);
            OpenGL.glTexCoord2f(this.field3814.field6740, this.field3814.field6744);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1720(-119);
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(IIII)V")
    public final void method670(int arg0, int arg1, int arg2, int arg3) {
        this.field3808 = arg0;
        this.field3809 = arg1;
        this.field3804 = arg2;
        field3800++;
        this.field3793 = arg3;
        this.field3801 = this.field3808 != 0 || this.field3809 != 0 || this.field3804 != 0 || this.field3793 != 0;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "()I")
    public final int method666() {
        field3792++;
        return this.field3814.field6742 - (-this.field3808 - this.field3804);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    private final void method1720(int arg0) {
        this.field3812.method2988(1, 847872872);
        field3815++;
        this.field3812.method3006(1, null);
        this.field3812.method3042(8448, 8960, 8448);
        int var2 = 120 % ((arg0 - 28) / 43);
        this.field3812.method2983(1, 768, -54, 34168);
        this.field3812.method3029(770, 0, 34200, 5890);
        this.field3812.method2988(0, 847872872);
        this.field3812.method2983(1, 768, -71, 34168);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
    public final void method669(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field3794++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field3807 = class582.method3253((byte) 30, this.field3814.field6739, this.field3812, this.field3814.field6742, arg0, arg1);
        this.field3816 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
    public static final void method1721(int arg0) {
        if (arg0 <= 36) {
            field3819 = null;
        }
        field3818++;
        if (class421.field5893 == 0 || class421.field5893 == 5) {
            return;
        }
        try {
            short var1;
            if (class361.field4776 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if (var1 < ++class121.field1579) {
                if (class582.field8161 != null) {
                    class582.field8161.method1439(-93);
                    class582.field8161 = null;
                }
                if (class361.field4776 >= 3) {
                    class421.field5893 = 0;
                    class158.method948(-5, (byte) -55);
                    return;
                }
                if (class8.field55 == 2) {
                    class294.field3941.method3179(0);
                } else {
                    class425.field5993.method3179(0);
                }
                class421.field5893 = 1;
                class121.field1579 = 0;
                class361.field4776++;
            }
            if (class421.field5893 == 1) {
                if (class8.field55 == 2) {
                    class719.field10066 = class294.field3941.method3175(51, class287.field3823);
                } else {
                    class719.field10066 = class425.field5993.method3175(-115, class287.field3823);
                }
                class421.field5893 = 2;
            }
            if (class421.field5893 == 2) {
                if (class719.field10066.field1419 == 2) {
                    throw new IOException();
                }
                if (class719.field10066.field1419 != 1) {
                    return;
                }
                class582.field8161 = class303.method1817((Socket) class719.field10066.field1418, (byte) 11, 7500);
                class719.field10066 = null;
                class235.method1414(-5788);
                class103 var2 = class756.method4206(false);
                var2.field1379.method3393(class696.field9719.field2395, 43);
                class27.method104(false, var2);
                class4.method10((byte) 115);
                class421.field5893 = 3;
            }
            if (class421.field5893 == 3) {
                if (!class582.field8161.method1435(-1949, 1)) {
                    return;
                }
                class582.field8161.method1440(class569.field8012.field8529, 0, 2047, 1);
                int var3 = class569.field8012.field8529[0] & 0xFF;
                if (var3 != 0) {
                    class421.field5893 = 0;
                    class158.method948(var3, (byte) -55);
                    class582.field8161.method1439(-63);
                    class582.field8161 = null;
                    class109.method738(27089);
                    return;
                }
                class569.field8012.field8520 = 0;
                class611 var4 = new class611(518);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                var4.method3393(10, 116);
                var4.method3384(1571862888, var5[0]);
                var4.method3384(1571862888, var5[1]);
                var4.method3384(1571862888, var5[2]);
                var4.method3384(1571862888, var5[3]);
                var4.method3420(-68, 0L);
                var4.method3387(class463.field6399, (byte) 113);
                var4.method3420(-96, class394.field5582);
                var4.method3420(-71, class101.field1360);
                var4.method3404(class270.field3566, true, class342.field4597);
                class235.method1414(-5788);
                class103 var6 = class756.method4206(false);
                class481 var7 = var6.field1379;
                if (class8.field55 == 2) {
                    if (class713.field9949 == 13) {
                        var7.method3393(class696.field9725.field2395, 51);
                    } else {
                        var7.method3393(class696.field9723.field2395, -72);
                    }
                    var7.method3423(0, 1571862888);
                    int var10 = var7.field8520;
                    var7.method3384(1571862888, 637);
                    var7.method3416(var4.field8529, var4.field8520, -1, 0);
                    int var11 = var7.field8520;
                    var7.method3387(class551.field7807, (byte) 113);
                    var7.method3393(class381.field5302, 99);
                    var7.method3393(class381.method2243((byte) 127), 107);
                    var7.method3423(class546.field7710, 1571862888);
                    var7.method3423(class512.field6932, 1571862888);
                    var7.method3393(class11.field68.field5520.method1958((byte) 124), -58);
                    class135.method840(var7, (byte) 0);
                    var7.method3387(class734.field10237, (byte) 113);
                    var7.method3384(1571862888, class586.field8204);
                    class611 var12 = class11.field68.method2279(true);
                    var7.method3393(var12.field8520, -109);
                    var7.method3416(var12.field8529, var12.field8520, -1, 0);
                    class257.field3353 = true;
                    class611 var13 = new class611(class353.field4715.method4105((byte) 116));
                    class353.field4715.method4103((byte) 17, var13);
                    var7.method3416(var13.field8529, var13.field8529.length, -1, 0);
                    var7.method3423(class386.field5452, 1571862888);
                    var7.method3420(-104, class377.field5237);
                    var7.method3393(class3.field27 == null ? 0 : 1, -34);
                    if (class3.field27 != null) {
                        var7.method3387(class3.field27, (byte) 113);
                    }
                    var7.method3393(class101.method697("jagtheora", 0) ? 1 : 0, 47);
                    class11.method43(var7, (byte) 100);
                    var7.method3434(true, var5, var11, var7.field8520);
                    var7.method3406((byte) 90, var7.field8520 - var10);
                } else {
                    var7.method3393(class696.field9726.field2395, -63);
                    var7.method3423(0, 1571862888);
                    int var8 = var7.field8520;
                    var7.method3384(1571862888, 637);
                    var7.method3416(var4.field8529, var4.field8520, -1, 0);
                    int var9 = var7.field8520;
                    var7.method3387(class551.field7807, (byte) 113);
                    var7.method3393(class51.field541.field3141, 58);
                    var7.method3393(class723.field10095, -103);
                    class135.method840(var7, (byte) 0);
                    var7.method3387(class734.field10237, (byte) 113);
                    var7.method3384(1571862888, class586.field8204);
                    class11.method43(var7, (byte) 122);
                    var7.method3434(true, var5, var9, var7.field8520);
                    var7.method3406((byte) 90, var7.field8520 - var8);
                }
                class27.method104(false, var6);
                class4.method10((byte) 80);
                class449.field6285 = new class570(var5);
                for (int var14 = 0; var14 < 4; var14++) {
                    var5[var14] += 50;
                }
                class569.field8012.method2704(var5, 255);
                class421.field5893 = 4;
            }
            if (class421.field5893 == 4) {
                if (!class582.field8161.method1435(-1949, 1)) {
                    return;
                }
                class582.field8161.method1440(class569.field8012.field8529, 0, 2047, 1);
                int var15 = class569.field8012.field8529[0] & 0xFF;
                if (var15 == 21) {
                    class421.field5893 = 7;
                } else if (var15 == 29) {
                    class421.field5893 = 13;
                } else if (var15 == 1) {
                    class421.field5893 = 5;
                    class158.method948(var15, (byte) -55);
                    return;
                } else if (var15 == 2) {
                    class421.field5893 = 8;
                } else if (var15 == 15) {
                    class488.field6682 = -2;
                    class421.field5893 = 14;
                } else if (var15 == 23 && class361.field4776 < 3) {
                    class361.field4776++;
                    class421.field5893 = 1;
                    class121.field1579 = 0;
                    class582.field8161.method1439(-114);
                    class582.field8161 = null;
                    return;
                } else {
                    class421.field5893 = 0;
                    class158.method948(var15, (byte) -55);
                    class582.field8161.method1439(-113);
                    class582.field8161 = null;
                    class109.method738(27089);
                    return;
                }
            }
            if (class421.field5893 == 6) {
                class235.method1414(-5788);
                class103 var16 = class756.method4206(false);
                class481 var17 = var16.field1379;
                var17.method2697((byte) -104, class449.field6285);
                var17.method2706(false, class696.field9730.field2395);
                class27.method104(false, var16);
                class4.method10((byte) 115);
                class421.field5893 = 4;
            } else if (class421.field5893 == 7) {
                if (class582.field8161.method1435(-1949, 1)) {
                    class582.field8161.method1440(class569.field8012.field8529, 0, 2047, 1);
                    int var18 = class569.field8012.field8529[0] & 0xFF;
                    class671.field9319 = var18 * 60 + 180;
                    class421.field5893 = 0;
                    class158.method948(21, (byte) -55);
                    class582.field8161.method1439(-13);
                    class582.field8161 = null;
                    class109.method738(27089);
                }
            } else if (class421.field5893 == 13) {
                if (class582.field8161.method1435(-1949, 1)) {
                    class582.field8161.method1440(class569.field8012.field8529, 0, 2047, 1);
                    class421.field5893 = 0;
                    class36.field371 = class569.field8012.field8529[0] & 0xFF;
                    class158.method948(29, (byte) -55);
                    class582.field8161.method1439(-71);
                    class582.field8161 = null;
                    class109.method738(27089);
                }
            } else if (class421.field5893 != 8) {
                if (class421.field5893 == 9) {
                    class481 var19 = class569.field8012;
                    if (class8.field55 == 2) {
                        if (!class582.field8161.method1435(-1949, class761.field10629)) {
                            return;
                        }
                        class582.field8161.method1440(var19.field8529, 0, 2047, class761.field10629);
                        var19.field8520 = 0;
                        class596.field8304 = var19.method3428((byte) 14);
                        class208.field2514 = var19.method3428((byte) 89);
                        class581.field8146 = var19.method3428((byte) 126) == 1;
                        class75.field906 = var19.method3428((byte) 55) == 1;
                        class591.field8250 = var19.method3428((byte) -123) == 1;
                        class446.field6207 = var19.method3428((byte) -104) == 1;
                        class247.field3207 = var19.method3402((byte) 127);
                        class205.field2436 = var19.method3428((byte) -111) == 1;
                        class756.field10559 = var19.method3426((byte) -1);
                        class262.field3431 = var19.method3428((byte) 74) == 1;
                        class707.field9894.method4118((byte) -123, class262.field3431);
                        class761.field10628.method4173(-71, class262.field3431);
                        class51.field540.method4091(9179409, class262.field3431);
                    } else if (class582.field8161.method1435(-1949, class761.field10629)) {
                        class582.field8161.method1440(var19.field8529, 0, 2047, class761.field10629);
                        var19.field8520 = 0;
                        class596.field8304 = var19.method3428((byte) -8);
                        class208.field2514 = var19.method3428((byte) 75);
                        class581.field8146 = var19.method3428((byte) -123) == 1;
                        class75.field906 = var19.method3428((byte) 46) == 1;
                        class591.field8250 = var19.method3428((byte) 64) == 1;
                        class128.field1670 = var19.method3413(false);
                        class205.field2436 = class128.field1670 > 0;
                        class388.field5476 = var19.method3402((byte) 127);
                        class424.field5959 = var19.method3402((byte) 127);
                        class394.field5581 = var19.method3402((byte) 127);
                        class31.field268 = var19.method3418(-2);
                        class631.field8778 = class287.field3823.method4136(class31.field268, 113);
                        class465.field6443 = var19.method3428((byte) -124);
                        class392.field5558 = var19.method3402((byte) 127);
                        class352.field4706 = var19.method3402((byte) 127);
                        class257.field3341 = var19.method3428((byte) 61) == 1;
                        class653.field9086.field1148 = class653.field9086.field1147 = class212.field2541 = var19.method3422(-1);
                        class287.field3826 = var19.method3428((byte) -120);
                        class641.field8924 = var19.method3418(-2);
                        class652.field9079 = new class564();
                        class652.field9079.field7967 = var19.method3402((byte) 127);
                        if (class652.field9079.field7967 == 65535) {
                            class652.field9079.field7967 = -1;
                        }
                        class652.field9079.field7975 = var19.method3422(-1);
                        if (class61.field673 != class200.field2376) {
                            class652.field9079.field7969 = class652.field9079.field7967 + 50000;
                            class652.field9079.field7974 = class652.field9079.field7967 + 40000;
                        }
                        if (class287.field3824 != class200.field2376 && (class294.field3941.method3178(120, class252.field3246) || class294.field3941.method3178(113, class650.field9068))) {
                            class376.method2209((byte) 96);
                        }
                    } else {
                        return;
                    }
                    if ((!class581.field8146 || class591.field8250) && !class205.field2436) {
                        try {
                            class679.method3851("unzap", class144.field1868, -26978);
                        } catch (Throwable var25) {
                        }
                    } else {
                        try {
                            class679.method3851("zap", class144.field1868, -26978);
                        } catch (Throwable var26) {
                            if (class624.field8724) {
                                try {
                                    class144.field1868.getAppletContext().showDocument(new URL(class144.field1868.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var24) {
                                }
                            }
                        }
                    }
                    if (class61.field673 == class200.field2376) {
                        try {
                            class679.method3851("loggedin", class144.field1868, -26978);
                        } catch (Throwable var23) {
                        }
                    }
                    if (class8.field55 != 2) {
                        class421.field5893 = 0;
                        class158.method948(2, (byte) -55);
                        class164.method967(2);
                        class237.method1429(7, false);
                        class327.field4373 = null;
                        return;
                    }
                    class421.field5893 = 11;
                }
                if (class421.field5893 == 11) {
                    if (!class582.field8161.method1435(-1949, 3)) {
                        return;
                    }
                    class582.field8161.method1440(class569.field8012.field8529, 0, 2047, 3);
                    class421.field5893 = 12;
                }
                if (class421.field5893 == 12) {
                    class481 var20 = class569.field8012;
                    var20.field8520 = 0;
                    if (var20.method2705((byte) 54)) {
                        if (!class582.field8161.method1435(-1949, 1)) {
                            return;
                        }
                        class582.field8161.method1440(var20.field8529, 3, 2047, 1);
                    }
                    class327.field4373 = class34.method168(101)[var20.method2700(0)];
                    class488.field6682 = var20.method3402((byte) 127);
                    class421.field5893 = 10;
                }
                if (class421.field5893 == 10) {
                    if (class582.field8161.method1435(-1949, class488.field6682)) {
                        class582.field8161.method1440(class569.field8012.field8529, 0, 2047, class488.field6682);
                        class569.field8012.field8520 = 0;
                        int var21 = class488.field6682;
                        class421.field5893 = 0;
                        class158.method948(2, (byte) -55);
                        class492.method2759(-104);
                        class411.method2367(class569.field8012, 15811816);
                        class505.field6855 = -1;
                        if (class84.field1170 == class327.field4373) {
                            class585.method3264(-1048016408);
                        } else {
                            class106.method720(68);
                        }
                        if (class569.field8012.field8520 != var21) {
                            throw new RuntimeException("lswp pos:" + class569.field8012.field8520 + " psize:" + var21);
                        }
                        class327.field4373 = null;
                    }
                } else if (class421.field5893 == 14) {
                    if (class488.field6682 == -2) {
                        if (!class582.field8161.method1435(-1949, 2)) {
                            return;
                        }
                        class582.field8161.method1440(class569.field8012.field8529, 0, 2047, 2);
                        class569.field8012.field8520 = 0;
                        class488.field6682 = class569.field8012.method3402((byte) 127);
                    }
                    if (class582.field8161.method1435(-1949, class488.field6682)) {
                        class582.field8161.method1440(class569.field8012.field8529, 0, 2047, class488.field6682);
                        class569.field8012.field8520 = 0;
                        class421.field5893 = 0;
                        int var22 = class488.field6682;
                        class158.method948(15, (byte) -55);
                        class690.method3898(-108);
                        class411.method2367(class569.field8012, 15811816);
                        if (class569.field8012.field8520 != var22) {
                            throw new RuntimeException("lswpr pos:" + class569.field8012.field8520 + " psize:" + var22);
                        }
                        class327.field4373 = null;
                    }
                }
            } else if (class582.field8161.method1435(-1949, 1)) {
                class582.field8161.method1440(class569.field8012.field8529, 0, 2047, 1);
                class761.field10629 = class569.field8012.field8529[0] & 0xFF;
                class421.field5893 = 9;
            }
        } catch (IOException var27) {
            if (class582.field8161 != null) {
                class582.field8161.method1439(-86);
                class582.field8161 = null;
            }
            if (class361.field4776 >= 3) {
                class421.field5893 = 0;
                class158.method948(-4, (byte) -55);
                class109.method738(27089);
            } else {
                if (class8.field55 == 2) {
                    class294.field3941.method3179(0);
                } else {
                    class425.field5993.method3179(0);
                }
                class361.field4776++;
                class421.field5893 = 1;
                class121.field1579 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "()I")
    public final int method663() {
        field3811++;
        return this.field3814.field6739 + this.field3793 + this.field3809;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method668(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field3798++;
        if (this.field3801) {
            float var11 = (float) this.method666();
            float var12 = (float) this.method663();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field3809 * var15;
            float var18 = (float) this.field3809 * var16;
            float var19 = (float) this.field3808 * var13;
            float var20 = (float) this.field3808 * var14;
            float var21 = (float) this.field3804 * -var13;
            float var22 = (float) this.field3804 * -var14;
            float var23 = (float) this.field3793 * -var15;
            float var24 = (float) this.field3793 * -var16;
            arg1 = arg1 + var20 + var18;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field3814.method1258(-28003, (arg9 & 0x1) != 0);
        this.field3812.method2972((byte) -114);
        this.field3812.method3006(1, this.field3814);
        this.field3812.method3013((byte) -117, arg8);
        this.field3812.method3039(260, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field3814.field6744);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field3814.field6740, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field3814.field6740, this.field3814.field6744);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method673(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class487 arg7, int arg8, int arg9) {
        field3799++;
        class495 var11 = ((class24) arg7).field180;
        if (this.field3801) {
            float var12 = (float) this.method666();
            float var13 = (float) this.method663();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field3809 * var16;
            float var19 = (float) this.field3809 * var17;
            float var20 = (float) this.field3808 * var14;
            float var21 = (float) this.field3808 * var15;
            float var22 = (float) this.field3804 * -var14;
            float var23 = (float) this.field3804 * -var15;
            float var24 = (float) this.field3793 * -var16;
            float var25 = (float) this.field3793 * -var17;
            arg0 = arg0 + var20 + var18;
            arg3 = arg3 + var23 + var19;
            arg4 = arg4 + var20 + var24;
            arg2 = arg2 + var22 + var18;
            arg1 = arg1 + var21 + var19;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        float var27 = arg5 + arg3 - arg1;
        this.field3814.method1258(-28003, ~(arg6 & 0x1) != -1);
        this.field3812.method2972((byte) -98);
        this.field3812.method3006(1, this.field3814);
        this.field3812.method3039(260, 1);
        this.field3812.method2988(1, 847872872);
        this.field3812.method3006(1, var11);
        this.field3812.method3042(8448, 8960, 7681);
        this.field3812.method2983(0, 768, -65, 34168);
        this.field3812.method3013((byte) -24, 1);
        float var28 = var11.field6740 / (float) var11.field6742;
        float var29 = var11.field6744 / (float) var11.field6739;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3814.field6744);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field6744 - (arg1 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field6744 - (((float) (-arg9) + arg5) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field3814.field6740, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + var26) * var28, var11.field6744 - ((var27 - (float) arg9) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field3814.field6740, this.field3814.field6744);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field6744 - (((float) (-arg9) + arg3) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field3812.method2983(0, 768, 91, 5890);
        this.field3812.method3039(260, 0);
        this.field3812.method3006(1, null);
        this.field3812.method2988(0, 847872872);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([I)V")
    public final void method667(int[] arg0) {
        arg0[0] = this.field3808;
        arg0[3] = this.field3793;
        field3802++;
        arg0[1] = this.field3809;
        arg0[2] = this.field3804;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILaa;II)V")
    public final void method672(int arg0, int arg1, class487 arg2, int arg3, int arg4) {
        field3806++;
        class24 var6 = (class24) arg2;
        class495 var7 = var6.field180;
        this.field3814.method1258(-28003, false);
        this.field3812.method2972((byte) -80);
        this.field3812.method3006(1, this.field3814);
        this.field3812.method3039(260, 1);
        this.field3812.method2988(1, 847872872);
        this.field3812.method3006(1, var7);
        this.field3812.method3042(8448, 8960, 7681);
        this.field3812.method2983(0, 768, 102, 34168);
        this.field3812.method3013((byte) -59, 1);
        int var8 = this.field3808 + arg0;
        int var9 = this.field3809 + arg1;
        int var10 = var8 + this.field3814.field6742;
        int var11 = var9 + this.field3814.field6739;
        float var12 = var7.field6740 / (float) var7.field6742;
        float var13 = var7.field6744 / (float) var7.field6739;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field6744 - ((float) (var9 - arg4) * var13);
        float var17 = var7.field6744 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3814.field6744);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field3814.field6739 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field3814.field6740, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field3814.field6742 + var8, this.field3814.field6739 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field3814.field6740, this.field3814.field6744);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var8 + this.field3814.field6742, var9);
        OpenGL.glEnd();
        this.field3812.method2983(0, 768, 87, 5890);
        this.field3812.method3039(260, 0);
        this.field3812.method3006(1, null);
        this.field3812.method2988(0, 847872872);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIII)V")
    public final void method662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3812.field7578) {
            int[] var7 = this.field3812.method460(arg4, arg5, arg2, arg3);
            if (var7 != null) {
                for (int var8 = 0; var8 < var7.length; var8++) {
                    var7[var8] = class344.method2020(var7[var8], -16777216);
                }
                this.method1722(arg0, arg1, arg2, arg3, var7, 0, arg2);
            }
        } else {
            this.field3814.method3468(arg2, arg0, arg1, arg5, arg4, 120, arg3);
        }
        field3803++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII[III)V")
    private final void method1722(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field3814.method3467(arg3, arg4, arg5, 3656, true, arg1, arg6, arg2, arg0);
        field3795++;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "()I")
    public final int method674() {
        field3805++;
        return this.field3814.field6742;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lac;IIZ)V")
    public class286(class541 arg0, int arg1, int arg2, boolean arg3) {
        this.field3812 = arg0;
        this.field3814 = class130.method823(arg2, arg0, arg1, -97, arg3 ? 6408 : 6407);
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lac;IIII)V")
    public class286(class541 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3812 = arg0;
        this.field3814 = class582.method3253((byte) -125, arg4, arg0, arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lac;II[III)V")
    public class286(class541 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3812 = arg0;
        this.field3814 = class408.method2356(arg0, false, arg3, arg1, (byte) 120, arg5, arg4, arg2);
    }
}
