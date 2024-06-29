import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class708 extends class112 {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    private int field9965 = 0;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Z")
    private boolean field9971 = false;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    private int field9980 = 0;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    private int field9977 = 0;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    private int field9988 = 0;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    private int field9983 = 0;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Lkv;")
    private class280 field9975;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Lbo;")
    private class759 field9974;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "D")
    public static double field9987;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field9964;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field9966;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field9967;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field9968;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field9969;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field9970;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field9972;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field9973;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field9976;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field9978;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field9979;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field9981;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field9985;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field9986;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field9989;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field9990;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public static int field9991;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "Lbo;")
    private class759 field9982;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()I")
    public final int method777() {
        field9989++;
        return this.field9974.field10474;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)V")
    private final void method4015(int arg0, byte arg1) {
        this.field9975.method1825(1, 109);
        field9976++;
        this.field9975.method1840(this.field9974, 2205);
        this.field9975.method1835(false, this.field9975.method1866(arg0, 27248), 7681);
        this.field9975.method1842(768, 103, 1, 34167);
        this.field9975.method1828((byte) -111, 34168, 770, 0);
        this.field9975.method1825(0, 125);
        this.field9975.method1840(this.field9982, 2205);
        if (arg1 >= -33) {
            this.method788(122, -80, 18, -37, -39, 115, 6);
        }
        this.field9975.method1835(false, 34479, 7681);
        this.field9975.method1842(768, -36, 1, 34166);
        if (this.field9965 == 0) {
            this.field9975.method1879(1.0F, 0.5F, false, 0.5F, 0.0F);
        } else if (this.field9965 == 1) {
            this.field9975.method1879(0.5F, 1.0F, false, 0.5F, 0.0F);
        } else if (this.field9965 == 2) {
            this.field9975.method1879(0.5F, 0.5F, false, 1.0F, 0.0F);
            return;
        } else if (this.field9965 == 3) {
            this.field9975.method1879(128.5F, 128.5F, false, 128.5F, 0.0F);
            return;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILaa;II)V")
    public final void method800(int arg0, int arg1, class510 arg2, int arg3, int arg4) {
        field9986++;
        class729 var6 = (class729) arg2;
        class759 var7 = var6.field10198;
        this.field9974.method3468(0, false);
        this.field9975.method1864((byte) -117);
        this.field9975.method1840(this.field9974, 2205);
        this.field9975.method1889(false, 1);
        this.field9975.method1825(1, 123);
        this.field9975.method1840(var7, 2205);
        this.field9975.method1835(false, 7681, 8448);
        this.field9975.method1842(768, 121, 0, 34168);
        this.field9975.method1817(1, 2);
        int var8 = this.field9977 + arg0;
        int var9 = this.field9983 + arg1;
        int var10 = var8 + this.field9974.field10474;
        int var11 = this.field9974.field10470 + var9;
        float var12 = var7.field10473 / (float) var7.field10474;
        float var13 = var7.field10476 / (float) var7.field10470;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field10476 - (float) (var9 - arg4) * var13;
        float var17 = var7.field10476 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9974.field10476);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, var9 + this.field9974.field10470);
        OpenGL.glMultiTexCoord2f(33984, this.field9974.field10473, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field9974.field10474 + var8, var9 - -this.field9974.field10470);
        OpenGL.glMultiTexCoord2f(33984, this.field9974.field10473, this.field9974.field10476);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field9974.field10474 + var8, var9);
        OpenGL.glEnd();
        this.field9975.method1842(768, -59, 0, 5890);
        this.field9975.method1889(false, 0);
        this.field9975.method1840(null, 2205);
        this.field9975.method1825(0, 117);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIII)V")
    public final void method790(int arg0, int arg1, int arg2, int arg3) {
        this.field9983 = arg1;
        this.field9980 = arg3;
        field9964++;
        this.field9988 = arg2;
        this.field9977 = arg0;
        this.field9971 = this.field9977 != 0 || this.field9983 != 0 || this.field9988 != 0 || this.field9980 != 0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
    public final void method795(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9974.method3468(0, false);
        field9979++;
        this.field9975.method1864((byte) -117);
        this.field9975.method1817(arg4, 2);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field9983 + arg1;
        int var7 = this.field9977 + arg0;
        if (this.field9982 == null) {
            this.field9975.method1840(this.field9974, 2205);
            this.field9975.method1889(false, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field9974.field10476);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field9974.field10470 + var6);
            OpenGL.glTexCoord2f(this.field9974.field10473, 0.0F);
            OpenGL.glVertex2i(this.field9974.field10474 + var7, this.field9974.field10470 + var6);
            OpenGL.glTexCoord2f(this.field9974.field10473, this.field9974.field10476);
            OpenGL.glVertex2i(this.field9974.field10474 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method4015(arg2, (byte) -95);
        this.field9982.method3468(0, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9974.field10476);
        OpenGL.glTexCoord2f(0.0F, this.field9974.field10476);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field9974.field10470 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field9974.field10473, 0.0F);
        OpenGL.glTexCoord2f(this.field9974.field10473, 0.0F);
        OpenGL.glVertex2i(var7 + this.field9974.field10474, var6 - -this.field9974.field10470);
        OpenGL.glMultiTexCoord2f(33985, this.field9974.field10473, this.field9974.field10476);
        OpenGL.glTexCoord2f(this.field9974.field10473, this.field9974.field10476);
        OpenGL.glVertex2i(this.field9974.field10474 + var7, var6);
        OpenGL.glEnd();
        this.method4018(0);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII[III)V")
    private final void method4016(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field9973++;
        this.field9974.method1254(arg6, arg2, arg4, true, arg5, 1, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIII)V")
    public final void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field9975.field4288) {
            int[] var7 = this.field9975.method400(arg4, arg5, arg2, arg3);
            if (var7 != null) {
                for (int var8 = 0; var8 < var7.length; var8++) {
                    var7[var8] = class281.method1904(var7[var8], -16777216);
                }
                this.method4016(arg0, arg1, arg2, arg3, var7, 0, arg2);
            }
        } else {
            this.field9974.method1253(arg5, arg1, arg0, arg4, arg2, (byte) -48, arg3);
        }
        field9970++;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIIIII)V")
    public final void method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9984++;
        int var8 = arg0 + arg2;
        this.field9974.method3468(0, false);
        int var9 = arg1 + arg3;
        this.field9975.method1864((byte) -117);
        this.field9975.method1840(this.field9974, 2205);
        this.field9975.method1817(arg6, 2);
        this.field9975.method1889(false, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field9974.field10471 && !this.field9971) {
            float var10 = (float) arg3 * this.field9974.field10476 / (float) this.field9974.field10470;
            float var11 = (float) arg2 * this.field9974.field10473 / (float) this.field9974.field10474;
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
        OpenGL.glTranslatef((float) this.field9977, (float) this.field9983, 0.0F);
        int var12 = this.method781();
        int var13 = this.method792();
        int var14 = this.field9974.field10470 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = arg0 + this.field9974.field10474;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field9974.field10476);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field9974.field10473, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field9974.field10473, this.field9974.field10476);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field9974.field10473 / (float) this.field9974.field10474;
                OpenGL.glTexCoord2f(0.0F, this.field9974.field10476);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field9974.field10476);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (var15 + this.field9974.field10470 - var9) * this.field9974.field10476 / (float) this.field9974.field10470;
            int var17 = this.field9974.field10474 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field9974.field10476);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field9974.field10473, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field9974.field10473, this.field9974.field10476);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field9974.field10473 / (float) this.field9974.field10474;
                OpenGL.glTexCoord2f(0.0F, this.field9974.field10476);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field9974.field10476);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "()I")
    public final int method792() {
        field9966++;
        return this.field9983 + this.field9980 + this.field9974.field10470;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(III)V")
    public static final void method4017(int arg0, int arg1, int arg2) {
        field9978++;
        if (arg1 <= -87) {
            class678 var3 = class630.method3597(29636, 13, (long) arg2);
            var3.method3834((byte) -119);
            var3.field9649 = arg0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method779(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field9967++;
        if (this.field9971) {
            float var11 = (float) this.method781();
            float var12 = (float) this.method792();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field9983 * var15;
            float var18 = (float) this.field9983 * var16;
            float var19 = (float) this.field9977 * var13;
            float var20 = (float) this.field9977 * var14;
            float var21 = (float) this.field9988 * -var13;
            float var22 = (float) this.field9988 * -var14;
            float var23 = (float) this.field9980 * -var15;
            arg3 = arg3 + var22 + var18;
            float var24 = (float) this.field9980 * -var16;
            arg1 = arg1 + var20 + var18;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg0 = arg0 + var19 + var17;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field9974.method3468(0, (arg9 & 0x1) != 0);
        this.field9975.method1864((byte) -117);
        this.field9975.method1840(this.field9974, 2205);
        this.field9975.method1817(arg8, 2);
        this.field9975.method1889(false, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field9974.field10476);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field9974.field10473, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field9974.field10473, this.field9974.field10476);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method793(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class510 arg7, int arg8, int arg9) {
        field9991++;
        class759 var11 = ((class729) arg7).field10198;
        if (this.field9971) {
            float var12 = (float) this.method781();
            float var13 = (float) this.method792();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field9983 * var16;
            float var19 = (float) this.field9983 * var17;
            float var20 = (float) this.field9977 * var14;
            float var21 = (float) this.field9977 * var15;
            float var22 = (float) this.field9988 * -var14;
            float var23 = (float) this.field9988 * -var15;
            float var24 = (float) this.field9980 * -var16;
            arg3 = arg3 + var23 + var19;
            arg0 = arg0 + var20 + var18;
            arg1 = arg1 + var21 + var19;
            float var25 = (float) this.field9980 * -var17;
            arg2 = arg2 + var22 + var18;
            arg4 = arg4 + var20 + var24;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        float var27 = arg5 + arg3 - arg1;
        this.field9974.method3468(0, (arg6 & 0x1) != 0);
        this.field9975.method1864((byte) -117);
        this.field9975.method1840(this.field9974, 2205);
        this.field9975.method1889(false, 1);
        this.field9975.method1825(1, 113);
        this.field9975.method1840(var11, 2205);
        this.field9975.method1835(false, 7681, 8448);
        this.field9975.method1842(768, 99, 0, 34168);
        this.field9975.method1817(1, 2);
        float var28 = var11.field10473 / (float) var11.field10474;
        float var29 = var11.field10476 / (float) var11.field10470;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9974.field10476);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field10476 - ((float) (-arg9) + arg1) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg4) * var28, var11.field10476 - ((arg5 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field9974.field10473, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field10476 - ((float) (-arg9) + var27) * var29);
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field9974.field10473, this.field9974.field10476);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field10476 - ((float) (-arg9) + arg3) * var29);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field9975.method1842(768, -103, 0, 5890);
        this.field9975.method1889(false, 0);
        this.field9975.method1840(null, 2205);
        this.field9975.method1825(0, 126);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
    public final void method794(int arg0, int arg1, int arg2) {
        field9981++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field9982 = class425.method2532(this.field9975, 25787, this.field9974.field10470, arg1, arg0, this.field9974.field10474);
        this.field9965 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()I")
    public final int method781() {
        field9968++;
        return this.field9974.field10474 + this.field9977 + this.field9988;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([I)V")
    public final void method787(int[] arg0) {
        field9985++;
        arg0[0] = this.field9977;
        arg0[1] = this.field9983;
        arg0[2] = this.field9988;
        arg0[3] = this.field9980;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIII)V")
    public final void method778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field9974.method3468(0, (arg7 & 0x1) != 0);
        field9972++;
        this.field9975.method1864((byte) -117);
        this.field9975.method1817(arg6, 2);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field9971) {
            float var9 = (float) arg2 / (float) this.method781();
            float var10 = (float) arg3 / (float) this.method792();
            float var11 = (float) this.field9977 * var9 + (float) arg0;
            float var12 = (float) this.field9983 * var10 + (float) arg1;
            float var13 = (float) this.field9974.field10474 * var9 + var11;
            float var14 = (float) this.field9974.field10470 * var10 + var12;
            if (this.field9982 == null) {
                this.field9975.method1840(this.field9974, 2205);
                this.field9975.method1889(false, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field9974.field10476);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field9974.field10473, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field9974.field10473, this.field9974.field10476);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method4015(arg4, (byte) -63);
                this.field9982.method3468(0, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9974.field10476);
                OpenGL.glTexCoord2f(0.0F, this.field9974.field10476);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field9974.field10473, 0.0F);
                OpenGL.glTexCoord2f(this.field9974.field10473, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field9974.field10473, this.field9974.field10476);
                OpenGL.glTexCoord2f(this.field9974.field10473, this.field9974.field10476);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method4018(0);
            }
        } else if (this.field9982 == null) {
            this.field9975.method1840(this.field9974, 2205);
            this.field9975.method1889(false, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field9974.field10476);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field9974.field10473, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field9974.field10473, this.field9974.field10476);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method4015(arg4, (byte) -107);
            this.field9982.method3468(0, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9974.field10476);
            OpenGL.glTexCoord2f(0.0F, this.field9974.field10476);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field9974.field10473, 0.0F);
            OpenGL.glTexCoord2f(this.field9974.field10473, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field9974.field10473, this.field9974.field10476);
            OpenGL.glTexCoord2f(this.field9974.field10473, this.field9974.field10476);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method4018(0);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    private final void method4018(int arg0) {
        field9990++;
        this.field9975.method1825(1, 107);
        this.field9975.method1840(null, 2205);
        this.field9975.method1835(false, 8448, 8448);
        this.field9975.method1842(768, 113, 1, 34168);
        this.field9975.method1828((byte) -6, 5890, 770, arg0);
        this.field9975.method1825(0, -101);
        this.field9975.method1842(768, 125, 1, 34168);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "()I")
    public final int method789() {
        field9969++;
        return this.field9974.field10470;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lkv;IIZ)V")
    public class708(class280 arg0, int arg1, int arg2, boolean arg3) {
        this.field9975 = arg0;
        this.field9974 = class534.method3093(arg3 ? 6408 : 6407, arg1, -13957, arg2, arg0);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lkv;IIII)V")
    public class708(class280 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9975 = arg0;
        this.field9974 = class425.method2532(arg0, 25787, arg4, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lkv;II[III)V")
    public class708(class280 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field9975 = arg0;
        this.field9974 = class396.method2415(arg5, arg3, arg0, arg1, false, arg2, 4095, arg4);
    }
}
