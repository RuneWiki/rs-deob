import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class361 extends class454 {

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "I")
    private int field5354 = -1;

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
    private int field5361 = -1;

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
    public int field5353;

    @OriginalMember(owner = "client!fo", name = "B", descriptor = "I")
    public int field5357;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "[I")
    public static int[] field5352 = new int[14];

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!fo", name = "C", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V", line = 5)
    public final void method1031(int arg0) {
        ++field5356;
        OpenGL.glFramebufferTexture2DEXT(this.field5361, this.field5354, super.field6610, 0, 0);
        this.field5361 = -1;
        if (arg0 <= 98) {
            this.field5357 = 113;
        }
        this.field5354 = -1;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lkd;IIIIZ[BIZ)V", line = 19)
    public class361(class188 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5353 = arg3;
        this.field5357 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 - var11 + -1) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field6619.method1289(-19391, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field6610 != 34037) {
            class477.method2874(false, arg4, arg1, arg3, arg2, arg7, arg6);
            this.method2760(true, 0);
        } else {
            OpenGL.glTexImage2Dub(super.field6610, 0, super.field6616, this.field5353, this.field5357, 0, arg7, 5121, arg6, 0);
            this.method2760(false, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2757(true, -84);
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lkd;IIIIZ[FI)V", line = 72)
    public class361(class188 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5357 = arg4;
        this.field5353 = arg3;
        super.field6619.method1289(-19391, this);
        if (arg5 && super.field6610 != 34037) {
            class73.method636(arg3, arg4, arg7, (byte) -29, arg1, arg2, arg6);
            this.method2760(true, 0);
        } else {
            OpenGL.glTexImage2Df(super.field6610, 0, super.field6616, this.field5353, this.field5357, 0, arg7, 5126, arg6, 0);
            this.method2760(false, 0);
        }
        this.method2757(true, -49);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[IIIZIIII)V", line = 96)
    public final void method2264(int arg0, int[] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        if (~arg8 == -1) {
            arg8 = arg3;
        }
        ++field5351;
        if (arg4) {
            int[] var10 = new int[arg2 * arg3];
            for (int var11 = 0; ~var11 > ~arg2; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg2 + -1 - var11) * arg8 + arg0;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg1[var13++];
                }
            }
            arg1 = var10;
        }
        super.field6619.method1289(-19391, this);
        if (arg3 != arg8) {
            OpenGL.glPixelStorei(3314, arg8);
        }
        OpenGL.glTexSubImage2Di(super.field6610, 0, arg6, arg7, arg3, arg2, 32993, super.field6619.field3078, arg1, arg0);
        if (arg5 == 34037) {
            if (~arg3 != ~arg8) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([BIIZIIIIII)V", line = 154)
    public final void method2265(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 == 0) {
            arg5 = arg6;
        }
        ++field5359;
        if (arg3) {
            int var11 = client.method1373(arg7, (byte) -33);
            int var12 = arg6 * var11;
            int var13 = arg5 * var11;
            byte[] var14 = new byte[arg8 * var12];
            for (int var15 = 0; ~var15 > ~arg8; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg8 + -1 + -var15) * var13 + arg1;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg0[var17++];
                }
            }
            arg0 = var14;
        }
        super.field6619.method1289(-19391, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 != arg6) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        OpenGL.glTexSubImage2Dub(super.field6610, 0, arg4, arg2, arg6, arg8, arg7, 5121, arg0, arg1);
        if (arg9 >= -89) {
            this.field5354 = -8;
        }
        if (arg5 != arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lkd;IIIIZ[IZ)V", line = 213)
    public class361(class188 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5357 = arg4;
        this.field5353 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; arg4 > var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + arg4 + -1) * arg3;
                for (int var13 = 0; arg3 > var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field6619.method1289(-19391, this);
        if (arg5 && super.field6610 != 34037) {
            class26.method183(arg6, super.field6619.field3078, -792335088, this.field5353, super.field6610, this.field5357, 32993, super.field6616);
            this.method2760(true, 0);
        } else {
            OpenGL.glTexImage2Di(super.field6610, 0, super.field6616, this.field5353, this.field5357, 0, 32993, super.field6619.field3078, arg6, 0);
            this.method2760(false, 0);
        }
        this.method2757(true, -63);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIII)V", line = 268)
    public final void method2266(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg3, arg2, super.field6610, super.field6609, arg1);
        if (arg0 != 0) {
            this.field5354 = 72;
        }
        ++field5355;
        this.field5361 = arg3;
        this.field5354 = arg2;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(BI)V", line = 282)
    public static final void method2267(byte arg0, int arg1) {
        int var2 = 62 / ((arg0 - 87) / 32);
        ++field5350;
        class211 var3 = class452.method2749(10, 2, arg1);
        var3.method1460(true);
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lkd;IIII)V", line = 323)
    public class361(class188 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field5353 = arg3;
        this.field5357 = arg4;
        super.field6619.method1289(-19391, this);
        OpenGL.glTexImage2Dub(super.field6610, 0, super.field6616, arg3, arg4, 0, class491.method2920((byte) 64, super.field6616), 5121, (byte[]) null, 0);
        this.method2757(true, -62);
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lkd;IIIII)V", line = 354)
    public class361(class188 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field5353 = arg4;
        this.field5357 = arg5;
        int var7 = -arg3 + super.field6619.field2993 - arg5;
        super.field6619.method1289(-19391, this);
        OpenGL.glCopyTexImage2D(super.field6610, 0, super.field6616, arg2, var7, arg4, arg5, 0);
        this.method2757(true, -64);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZIIIIII)V", line = 298)
    public final void method2268(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5360;
        int var8 = -arg2 - arg4 + super.field6619.field2993;
        if (!arg0) {
            this.field5353 = 36;
        }
        super.field6619.method1289(-19391, this);
        OpenGL.glCopyTexSubImage2D(super.field6610, 0, arg5, -arg1 + -arg4 + this.field5357, arg6, var8, arg3, arg4);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V", line = 313)
    public static void method2269(boolean arg0) {
        if (!arg0) {
            field5352 = null;
        }
        field5352 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZZI)V", line = 335)
    public final void method2270(boolean arg0, boolean arg1, int arg2) {
        if (arg2 == 10243) {
            if (super.field6610 == 3553) {
                super.field6619.method1289(-19391, this);
                OpenGL.glTexParameteri(super.field6610, 10242, !arg0 ? 33071 : 10497);
                OpenGL.glTexParameteri(super.field6610, 10243, !arg1 ? 33071 : 10497);
            }
            ++field5358;
        }
    }
}
