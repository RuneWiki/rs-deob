import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class158 extends class599 {

    @OriginalMember(owner = "client!ho", name = "D", descriptor = "I")
    private int field2360 = -1;

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
    private int field2363 = -1;

    @OriginalMember(owner = "client!ho", name = "L", descriptor = "I")
    public int field2367;

    @OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
    public int field2358;

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!ho", name = "I", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ho", name = "K", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZIZ)V")
    public final void method1252(boolean arg0, int arg1, boolean arg2) {
        if (arg1 != 3314) {
            this.method1257((byte) -17, 37, 0, 29, -81, -13, -120, (byte[]) null, 60, true);
        }
        if (~super.field8452 == -3554) {
            super.field8449.method1840(this, 2205);
            OpenGL.glTexParameteri(super.field8452, 10242, !arg2 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field8452, 10243, !arg0 ? 33071 : 10497);
        }
        ++field2362;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lkv;IIIIZ[BIZ)V")
    public class158(class280 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2367 = arg3;
        this.field2358 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 - 1) * arg3;
                for (int var14 = 0; var14 < arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field8449.method1840(this, 2205);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field8452 != 34037) {
            class704.method3985(arg4, arg6, arg3, arg1, arg7, arg2, -19132);
            this.method3467((byte) 87, true);
        } else {
            OpenGL.glTexImage2Dub(super.field8452, 0, super.field8444, this.field2367, this.field2358, 0, arg7, 5121, arg6, 0);
            this.method3467((byte) 87, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method3468(0, true);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIBI)V")
    public final void method1253(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field2365;
        if (arg5 > -39) {
            this.field2367 = -69;
        }
        int var8 = -arg0 + -arg6 + super.field8449.field4070;
        super.field8449.method1840(this, 2205);
        OpenGL.glCopyTexSubImage2D(super.field8452, 0, arg2, -arg1 - (arg6 - this.field2358), arg3, var8, arg4, arg6);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II[IZIIIII)V")
    public final void method1254(int arg0, int arg1, int[] arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (~arg0 == -1) {
            arg0 = arg1;
        }
        ++field2366;
        if (arg3) {
            int[] var10 = new int[arg1 * arg7];
            for (int var11 = 0; ~var11 > ~arg7; ++var11) {
                int var12 = arg1 * var11;
                int var13 = (arg7 - var11 - 1) * arg0 + arg4;
                for (int var14 = 0; ~arg1 < ~var14; ++var14) {
                    var10[var12++] = arg2[var13++];
                }
            }
            arg2 = var10;
        }
        super.field8449.method1840(this, 2205);
        if (arg0 != arg1) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Di(super.field8452, 0, arg6, -arg8 + this.field2358 + -arg7, arg1, arg7, 32993, super.field8449.field4273, arg2, arg4);
        if (arg5 != 1) {
            this.method1256(31, (byte) -102, 109, 119);
        }
        if (~arg0 != ~arg1) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
    public final void method1255(byte arg0) {
        ++field2361;
        OpenGL.glFramebufferTexture2DEXT(this.field2360, this.field2363, super.field8452, 0, 0);
        this.field2360 = -1;
        this.field2363 = -1;
        int var2 = -112 % ((-34 - arg0) / 63);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IBII)V")
    public final void method1256(int arg0, byte arg1, int arg2, int arg3) {
        ++field2359;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg2, super.field8452, super.field8445, arg3);
        this.field2360 = arg0;
        if (arg1 >= -73) {
            this.method1253(3, -94, 17, 67, 94, (byte) -57, -14);
        }
        this.field2363 = arg2;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lkv;IIII)V")
    public class158(class280 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field2367 = arg3;
        this.field2358 = arg4;
        super.field8449.method1840(this, 2205);
        OpenGL.glTexImage2Dub(super.field8452, 0, super.field8444, arg3, arg4, 0, class422.method2523(super.field8444, 125), 5121, (byte[]) null, 0);
        this.method3468(0, true);
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lkv;IIIIZ[FI)V")
    public class158(class280 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2367 = arg3;
        this.field2358 = arg4;
        super.field8449.method1840(this, 2205);
        if (arg5 && ~super.field8452 != -34038) {
            class220.method1516((byte) -45, arg7, arg6, arg1, arg2, arg3, arg4);
            this.method3467((byte) 87, true);
        } else {
            OpenGL.glTexImage2Df(super.field8452, 0, super.field8444, this.field2367, this.field2358, 0, arg7, 5126, arg6, 0);
            this.method3467((byte) 87, false);
        }
        this.method3468(0, true);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BIIIIII[BIZ)V")
    public final void method1257(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, boolean arg9) {
        if (arg6 == 0) {
            arg6 = arg5;
        }
        ++field2357;
        if (arg9) {
            int var11 = class488.method2853(arg2, false);
            int var12 = arg5 * var11;
            int var13 = arg6 * var11;
            byte[] var14 = new byte[arg8 * var12];
            for (int var15 = 0; arg8 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg8 + -1) * var13 + arg1;
                for (int var18 = 0; var18 < var12; ++var18) {
                    var14[var16++] = arg7[var17++];
                }
            }
            arg7 = var14;
        }
        super.field8449.method1840(this, 2205);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 != arg6) {
            OpenGL.glPixelStorei(3314, arg6);
        }
        if (arg0 > 88) {
            OpenGL.glTexSubImage2Dub(super.field8452, 0, arg4, arg3, arg5, arg8, arg2, 5121, arg7, arg1);
            if (arg5 != arg6) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lkv;IIIII)V")
    public class158(class280 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field2358 = arg5;
        this.field2367 = arg4;
        int var7 = -arg3 - arg5 + super.field8449.field4070;
        super.field8449.method1840(this, 2205);
        OpenGL.glCopyTexImage2D(super.field8452, 0, super.field8444, arg2, var7, arg4, arg5, 0);
        this.method3468(0, true);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZILcb;)Lqda;")
    public static final class112 method1258(boolean arg0, int arg1, class544 arg2) {
        ++field2364;
        class112 var3 = (class112) class757.field10447.method2373((long) arg1, 103);
        if (var3 == null) {
            if (!class455.field6535) {
                var3 = class393.method2396((byte) 46, arg2.method3149(arg1, -87));
            } else {
                var3 = class638.field8979.method482(class625.method3587(arg2, arg1), true);
            }
            class757.field10447.method2362(var3, 0, (long) arg1);
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lkv;IIIIZ[IIIZ)V")
    public class158(class280 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2358 = arg4;
        this.field2367 = arg3;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; var12 < arg4; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (-var12 + arg4 + -1) * arg3;
                for (int var15 = 0; var15 < arg3; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field8449.method1840(this, 2205);
        if (~super.field8452 != -34038 && arg5 && ~arg7 == -1 && arg8 == 0) {
            class555.method3230(arg6, super.field8452, this.field2358, 32993, this.field2367, 255, super.field8444, super.field8449.field4273);
            this.method3467((byte) 87, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field8452, 0, super.field8444, this.field2367, this.field2358, 0, 32993, super.field8449.field4273, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method3467((byte) 87, false);
        }
        this.method3468(0, true);
    }
}
