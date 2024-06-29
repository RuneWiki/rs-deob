import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class246 extends class158 {

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    private int field3589 = -1;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    private int field3596 = -1;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public int field3595;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    public int field3594;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "Lhe;")
    public static class573 field3590 = new class573("LOCAL", 4);

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "[I")
    public static int[] field3599 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "Llc;")
    public static class435 field3597 = new class435(43, 28);

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lkw;IIIIZ[BIZ)V", line = 3)
    public class246(class346 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3595 = arg3;
        this.field3594 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 - 1 + -var11) * arg3;
                for (int var14 = 0; var14 < arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field2275.method2164(6, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field2261 != 34037) {
            class549.method3306(arg1, -104, arg4, arg6, arg2, arg7, arg3);
            this.method1129(126, true);
        } else {
            OpenGL.glTexImage2Dub(super.field2261, 0, super.field2272, this.field3595, this.field3594, 0, arg7, 5121, arg6, 0);
            this.method1129(121, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1131((byte) 42, true);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([BIIIIIIIZI)V", line = 55)
    public final void method1672(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        if (~arg9 == -1) {
            arg9 = arg2;
        }
        ++field3592;
        if (arg8) {
            int var11 = class663.method3777(arg3, (byte) -68);
            int var12 = arg2 * var11;
            int var13 = arg9 * var11;
            byte[] var14 = new byte[arg6 * var12];
            for (int var15 = 0; ~var15 > ~arg6; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg6 - 1 + -var15) * var13 + arg1;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg0[var17++];
                }
            }
            arg0 = var14;
        }
        super.field2275.method2164(6, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg2 != arg9) {
            OpenGL.glPixelStorei(3314, arg9);
        }
        OpenGL.glTexSubImage2Dub(super.field2261, 0, arg7, arg4, arg2, arg6, arg3, 5121, arg0, arg1);
        if (arg2 != arg9) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        if (arg5 != 1622) {
            this.method1672((byte[]) null, 66, 123, 2, 38, -63, -60, -71, false, -59);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V", line = 112)
    public static void method1673(boolean arg0) {
        field3590 = null;
        if (arg0) {
            field3597 = null;
        }
        field3599 = null;
        field3597 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII)V", line = 127)
    public final void method1674(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -1) {
            this.field3595 = -36;
        }
        ++field3591;
        OpenGL.glFramebufferTexture2DEXT(arg2, arg3, super.field2261, super.field2269, arg1);
        this.field3589 = arg2;
        this.field3596 = arg3;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZIBIIII[II)V", line = 141)
    public final void method1675(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8) {
        ++field3588;
        if (~arg6 == -1) {
            arg6 = arg3;
        }
        int var10 = -81 % ((arg2 - -43) / 62);
        if (arg0) {
            int[] var11 = new int[arg3 * arg5];
            for (int var12 = 0; ~var12 > ~arg5; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (-var12 + -1 + arg5) * arg6 - -arg4;
                for (int var15 = 0; arg3 > var15; ++var15) {
                    var11[var13++] = arg7[var14++];
                }
            }
            arg7 = var11;
        }
        super.field2275.method2164(6, this);
        if (arg3 != arg6) {
            OpenGL.glPixelStorei(3314, arg6);
        }
        OpenGL.glTexSubImage2Di(super.field2261, 0, arg8, arg1, arg3, arg5, 32993, super.field2275.field5027, arg7, arg4);
        if (~arg3 != ~arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lkw;IIIIZ[FI)V", line = 196)
    public class246(class346 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3594 = arg4;
        this.field3595 = arg3;
        super.field2275.method2164(6, this);
        if (arg5 && super.field2261 != 34037) {
            class303.method1895(arg1, arg6, arg3, arg7, arg4, arg2, (byte) 44);
            this.method1129(123, true);
        } else {
            OpenGL.glTexImage2Df(super.field2261, 0, super.field2272, this.field3595, this.field3594, 0, arg7, 5126, arg6, 0);
            this.method1129(120, false);
        }
        this.method1131((byte) 42, true);
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lkw;IIII)V", line = 219)
    public class246(class346 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3595 = arg3;
        this.field3594 = arg4;
        super.field2275.method2164(6, this);
        OpenGL.glTexImage2Dub(super.field2261, 0, super.field2272, arg3, arg4, 0, class347.method2202(super.field2272, (byte) 23), 5121, (byte[]) null, 0);
        this.method1131((byte) 42, true);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZZB)V", line = 232)
    public final void method1676(boolean arg0, boolean arg1, byte arg2) {
        if (arg2 >= 23) {
            ++field3593;
            if (~super.field2261 == -3554) {
                super.field2275.method2164(6, this);
                OpenGL.glTexParameteri(super.field2261, 10242, !arg0 ? 33071 : 10497);
                OpenGL.glTexParameteri(super.field2261, 10243, !arg1 ? 33071 : 10497);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lkw;IIIII)V", line = 279)
    public class246(class346 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3595 = arg4;
        this.field3594 = arg5;
        int var7 = super.field2275.field4763 - (arg3 + arg5);
        super.field2275.method2164(6, this);
        OpenGL.glCopyTexImage2D(super.field2261, 0, super.field2272, arg2, var7, arg4, arg5, 0);
        this.method1131((byte) 42, true);
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lkw;IIIIZ[IIIZ)V", line = 311)
    public class246(class346 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3594 = arg4;
        this.field3595 = arg3;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; ~var12 > ~arg4; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (arg4 + -1 - var12) * arg3;
                for (int var15 = 0; ~var15 > ~arg3; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field2275.method2164(6, this);
        if (super.field2261 != 34037 && arg5 && arg7 == 0 && arg8 == 0) {
            class548.method3296(super.field2275.field5027, arg6, (byte) -17, super.field2272, 32993, this.field3595, this.field3594, super.field2261);
            this.method1129(124, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field2261, 0, super.field2272, this.field3595, this.field3594, 0, 32993, super.field2275.field5027, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method1129(115, false);
        }
        this.method1131((byte) 42, true);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 253)
    public final void method463(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field3589, this.field3596, super.field2261, 0, 0);
        ++field3587;
        this.field3589 = -1;
        this.field3596 = -1;
        if (arg0 >= -96) {
            this.method1676(false, true, (byte) 96);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIII)V", line = 293)
    public final void method1677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 == 34037) {
            ++field3598;
            int var8 = -arg0 - arg2 + super.field2275.field4763;
            super.field2275.method2164(6, this);
            OpenGL.glCopyTexSubImage2D(super.field2261, 0, arg3, -arg2 + this.field3594 + -arg1, arg5, var8, arg6, arg2);
            OpenGL.glFlush();
        }
    }
}
