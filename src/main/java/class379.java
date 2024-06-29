import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class379 extends class254 {

    @OriginalMember(owner = "client!qw", name = "D", descriptor = "I")
    private int field5439 = -1;

    @OriginalMember(owner = "client!qw", name = "w", descriptor = "I")
    private int field5432 = -1;

    @OriginalMember(owner = "client!qw", name = "B", descriptor = "I")
    public int field5437;

    @OriginalMember(owner = "client!qw", name = "u", descriptor = "I")
    public int field5430;

    @OriginalMember(owner = "client!qw", name = "C", descriptor = "Lcb;")
    public static class318 field5438 = new class318(84, 6);

    @OriginalMember(owner = "client!qw", name = "F", descriptor = "Ljj;")
    public static class398 field5441 = new class398(80, 7);

    @OriginalMember(owner = "client!qw", name = "I", descriptor = "I")
    public static int field5444 = 0;

    @OriginalMember(owner = "client!qw", name = "K", descriptor = "I")
    public static int field5446 = 0;

    @OriginalMember(owner = "client!qw", name = "v", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!qw", name = "x", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!qw", name = "y", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!qw", name = "A", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!qw", name = "G", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!qw", name = "H", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!qw", name = "J", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!qw", name = "E", descriptor = "Lpn;")
    public static class361 field5440;

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "(B)V", line = 5)
    public static void method2294(byte arg0) {
        field5441 = null;
        if (arg0 <= 82) {
            field5441 = null;
        }
        field5440 = null;
        field5438 = null;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(III[BIIIIZZ)V", line = 17)
    public final void method2295(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        ++field5433;
        if (arg0 == 0) {
            arg0 = arg2;
        }
        if (arg9) {
            int var11 = class661.method3672(arg6, -6411);
            int var12 = arg2 * var11;
            int var13 = arg0 * var11;
            byte[] var14 = new byte[arg1 * var12];
            for (int var15 = 0; arg1 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg1 + -1 - var15) * var13 + arg4;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg3[var17++];
                }
            }
            arg3 = var14;
        }
        super.field3510.method3553((byte) -98, this);
        if (!arg8) {
            this.field5430 = -62;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (arg0 != arg2) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Dub(super.field3500, 0, arg7, arg5, arg2, arg1, arg6, 5121, arg3, arg4);
        if (~arg0 != ~arg2) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lpea;IIIIZ[BIZ)V", line = 79)
    public class379(class641 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5437 = arg3;
        this.field5430 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 - var11) * arg3;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field3510.method3553((byte) 98, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field3500 != 34037) {
            class610.method3362(arg6, arg2, arg4, arg1, true, arg7, arg3);
            this.method1590((byte) 106, true);
        } else {
            OpenGL.glTexImage2Dub(super.field3500, 0, super.field3502, this.field5437, this.field5430, 0, arg7, 5121, arg6, 0);
            this.method1590((byte) 106, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1592(-107, true);
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILpq;)I", line = 138)
    public static final int method2296(int arg0, class159 arg1) {
        ++field5443;
        if (arg0 <= 51) {
            return 37;
        } else {
            int var2 = 0;
            if (arg1.method1086((byte) 127, class198.field2621)) {
                ++var2;
            }
            if (arg1.method1086((byte) 119, class8.field72)) {
                ++var2;
            }
            if (arg1.method1086((byte) 115, class490.field6608)) {
                ++var2;
            }
            if (arg1.method1086((byte) 113, class631.field8576)) {
                ++var2;
            }
            if (arg1.method1086((byte) 114, class118.field1525)) {
                ++var2;
            }
            if (arg1.method1086((byte) 123, class201.field2640)) {
                ++var2;
            }
            if (arg1.method1086((byte) 118, class417.field5812)) {
                ++var2;
            }
            if (arg1.method1086((byte) 125, class227.field2978)) {
                ++var2;
            }
            if (arg1.method1086((byte) 127, class237.field3083)) {
                ++var2;
            }
            if (arg1.method1086((byte) 115, class236.field3075)) {
                ++var2;
            }
            if (arg1.method1086((byte) 121, class323.field4731)) {
                ++var2;
            }
            if (arg1.method1086((byte) 120, class45.field600)) {
                ++var2;
            }
            if (arg1.method1086((byte) 121, class248.field3337)) {
                ++var2;
            }
            if (arg1.method1086((byte) 113, class352.field5144)) {
                ++var2;
            }
            if (arg1.method1086((byte) 126, class431.field5991)) {
                ++var2;
            }
            if (arg1.method1086((byte) 123, class147.field1858)) {
                ++var2;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIZ)V", line = 208)
    public final void method2297(int arg0, int arg1, int arg2, boolean arg3) {
        ++field5431;
        if (!arg3) {
            this.method2299(15, false, false);
        }
        OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.field3500, super.field3513, arg2);
        this.field5439 = arg0;
        this.field5432 = arg1;
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lpea;IIIIZ[IZ)V", line = 222)
    public class379(class641 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5430 = arg4;
        this.field5437 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~arg4 < ~var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 - var10 + -1) * arg3;
                for (int var13 = 0; var13 < arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field3510.method3553((byte) -127, this);
        if (arg5 && super.field3500 != 34037) {
            class596.method3305((byte) 67, this.field5437, super.field3502, super.field3500, super.field3510.field8997, 32993, this.field5430, arg6);
            this.method1590((byte) 106, true);
        } else {
            OpenGL.glTexImage2Di(super.field3500, 0, super.field3502, this.field5437, this.field5430, 0, 32993, super.field3510.field8997, arg6, 0);
            this.method1590((byte) 106, false);
        }
        this.method1592(-46, true);
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lpea;IIIII)V", line = 272)
    public class379(class641 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field5430 = arg5;
        this.field5437 = arg4;
        int var7 = super.field3510.field8920 - arg5 - arg3;
        super.field3510.method3553((byte) 90, this);
        OpenGL.glCopyTexImage2D(super.field3500, 0, super.field3502, arg2, var7, arg4, arg5, 0);
        this.method1592(-98, true);
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(III[IIIZII)V", line = 289)
    public final void method2298(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (arg8 == 0) {
            arg8 = arg7;
        }
        ++field5436;
        if (arg1 == 6008) {
            if (arg6) {
                int[] var10 = new int[arg4 * arg7];
                for (int var11 = 0; arg4 > var11; ++var11) {
                    int var12 = arg7 * var11;
                    int var13 = (-var11 + arg4 + -1) * arg8 - -arg2;
                    for (int var14 = 0; ~var14 > ~arg7; ++var14) {
                        var10[var12++] = arg3[var13++];
                    }
                }
                arg3 = var10;
            }
            super.field3510.method3553((byte) 113, this);
            if (~arg7 != ~arg8) {
                OpenGL.glPixelStorei(3314, arg8);
            }
            OpenGL.glTexSubImage2Di(super.field3500, 0, arg5, arg0, arg7, arg4, 32993, super.field3510.field8997, arg3, arg2);
            if (~arg7 != ~arg8) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lpea;IIIIZ[FI)V", line = 343)
    public class379(class641 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5430 = arg4;
        this.field5437 = arg3;
        super.field3510.method3553((byte) -98, this);
        if (arg5 && ~super.field3500 != -34038) {
            class172.method1146(arg4, arg3, arg2, arg6, arg7, arg1, 0);
            this.method1590((byte) 106, true);
        } else {
            OpenGL.glTexImage2Df(super.field3500, 0, super.field3502, this.field5437, this.field5430, 0, arg7, 5126, arg6, 0);
            this.method1590((byte) 106, false);
        }
        this.method1592(92, true);
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lpea;IIII)V", line = 365)
    public class379(class641 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field5437 = arg3;
        this.field5430 = arg4;
        super.field3510.method3553((byte) -109, this);
        OpenGL.glTexImage2Dub(super.field3500, 0, super.field3502, arg3, arg4, 0, class465.method2634(true, super.field3502), 5121, (byte[]) null, 0);
        this.method1592(-128, true);
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IZZ)V", line = 386)
    public final void method2299(int arg0, boolean arg1, boolean arg2) {
        if (~super.field3500 == -3554) {
            super.field3510.method3553((byte) -110, this);
            OpenGL.glTexParameteri(super.field3500, 10242, !arg2 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field3500, 10243, arg1 ? 10497 : 33071);
        }
        ++field5434;
        if (arg0 >= -66) {
            this.method2298(74, 19, -106, (int[]) null, -127, 95, false, -63, -45);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIZIIII)V", line = 404)
    public final void method2300(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5442;
        if (!arg2) {
            this.method2297(2, 13, 126, false);
        }
        int var8 = super.field3510.field8920 - (arg4 + arg5);
        super.field3510.method3553((byte) 55, this);
        OpenGL.glCopyTexSubImage2D(super.field3500, 0, arg3, -arg5 - arg0 + this.field5430, arg1, var8, arg6, arg5);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V", line = 422)
    public final void method545(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field5432, this.field5439, super.field3500, 0, 0);
        int var2 = 16 / ((arg0 - -59) / 52);
        ++field5435;
        this.field5432 = -1;
        this.field5439 = -1;
    }
}
