import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class164 extends class37 implements class358 {

    @OriginalMember(owner = "client!pha", name = "K", descriptor = "I")
    private int field1837;

    @OriginalMember(owner = "client!pha", name = "L", descriptor = "I")
    private int field1838;

    @OriginalMember(owner = "client!pha", name = "J", descriptor = "I")
    public static int field1836 = 0;

    @OriginalMember(owner = "client!pha", name = "R", descriptor = "[I")
    public static int[] field1844 = new int[2];

    @OriginalMember(owner = "client!pha", name = "B", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!pha", name = "C", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!pha", name = "D", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!pha", name = "E", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!pha", name = "F", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!pha", name = "G", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!pha", name = "H", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!pha", name = "I", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!pha", name = "M", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!pha", name = "O", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!pha", name = "P", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!pha", name = "Q", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!pha", name = "N", descriptor = "[I")
    public static int[] field1840;

    @OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(Lai;IIZ[III)V", line = 3)
    public class164(class597 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class102.field1058, class687.field9697, arg1 * arg2, arg3);
        this.field1837 = arg1;
        this.field1838 = arg2;
        super.field417.method2207((byte) -61, this);
        if (arg3 && ~arg6 == -1 && arg5 == 0) {
            this.method170(arg1, super.field416, arg4, -126, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field416, 0, 6408, this.field1837, this.field1838, 0, 32993, super.field417.field8506, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(I[IIIIII)V", line = 26)
    public final void method607(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1841;
        if (arg6 == 2444) {
            int[] var8 = new int[this.field1838 * this.field1837];
            super.field417.method2207((byte) -61, this);
            OpenGL.glGetTexImagei(super.field416, 0, 32993, 5121, var8, 0);
            for (int var9 = 0; var9 < arg3; ++var9) {
                class143.method891(var8, (arg3 + -1 + -var9 + arg4) * this.field1837, arg1, arg0 - -(arg2 * var9), arg2);
            }
        }
    }

    @OriginalMember(owner = "client!pha", name = "d", descriptor = "(I)V", line = 50)
    public static void method1014(int arg0) {
        if (arg0 >= -40) {
            method1017(true, (class244) null);
        }
        field1844 = null;
        field1840 = null;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIII[IIZI)V", line = 62)
    public final void method605(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, boolean arg6, int arg7) {
        ++field1834;
        super.field417.method2207((byte) -61, this);
        OpenGL.glPixelStorei(3314, arg2);
        if (arg6) {
            method1016(25);
        }
        OpenGL.glTexSubImage2Di(super.field416, 0, arg5, arg3, arg1, arg7, 32993, super.field417.field8506, arg4, arg0);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "(B)Z", line = 78)
    public final boolean method600(byte arg0) {
        if (arg0 > -113) {
            this.method607(-88, (int[]) null, -85, 105, 83, 76, 122);
        }
        ++field1843;
        return true;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(BIIII[FILwd;I)V", line = 89)
    public final void method1015(byte arg0, int arg1, int arg2, int arg3, int arg4, float[] arg5, int arg6, class272 arg7, int arg8) {
        ++field1828;
        super.field417.method2207((byte) -61, this);
        if (arg0 == 79) {
            OpenGL.glPixelStorei(3314, arg8);
            OpenGL.glTexSubImage2Df(super.field416, 0, arg2, arg3, arg6, arg4, class325.method1935(arg0 + 10, arg7), 5121, arg5, arg1);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!pha", name = "e", descriptor = "(I)V", line = 103)
    public static final void method1016(int arg0) {
        class654.field9334.method3924(true, class654.field9334.field9870, 1);
        ++field1842;
        if (arg0 < 16) {
            field1840 = null;
        }
        class654.field9334.method3924(true, class654.field9334.field9858, 1);
        class654.field9334.method3924(true, class654.field9334.field9833, 2);
        class654.field9334.method3924(true, class654.field9334.field9834, 2);
        class654.field9334.method3924(true, class654.field9334.field9855, 1);
        class654.field9334.method3924(true, class654.field9334.field9845, 1);
        class654.field9334.method3924(true, class654.field9334.field9878, 1);
        class654.field9334.method3924(true, class654.field9334.field9847, 1);
        class654.field9334.method3924(true, class654.field9334.field9869, 1);
        class654.field9334.method3924(true, class654.field9334.field9836, 1);
        class654.field9334.method3924(true, class654.field9334.field9856, 2);
        class654.field9334.method3924(true, class654.field9334.field9844, 1);
        class654.field9334.method3924(true, class654.field9334.field9837, 2);
        class654.field9334.method3924(true, class654.field9334.field9848, 1);
        class654.field9334.method3924(true, class654.field9334.field9866, 0);
        class654.field9334.method3924(true, class654.field9334.field9852, 0);
        class654.field9334.method3924(true, class654.field9334.field9851, 2);
        class654.field9334.method3924(true, class654.field9334.field9863, 0);
        class654.field9334.method3924(true, class654.field9334.field9826, 0);
        class444.method2756(10441);
        class654.field9334.method3924(true, class654.field9334.field9849, 0);
        class654.field9334.method3924(true, class654.field9334.field9875, 4);
        class598.method3406((byte) 127);
        class341.method2026(9349);
        class698.field9825 = true;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZZB)V", line = 144)
    public final void method604(boolean arg0, boolean arg1, byte arg2) {
        super.field417.method2207((byte) -61, this);
        ++field1833;
        OpenGL.glTexParameteri(super.field416, 10242, arg1 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field416, 10243, !arg0 ? 33071 : 10497);
        if (arg2 != -43) {
            this.method1015((byte) 28, 20, -122, -91, -51, (float[]) null, 76, (class272) null, 34);
        }
    }

    @OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(Lai;Lwd;Ljm;II)V", line = 157)
    public class164(class597 arg0, class272 arg1, class687 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field1837 = arg3;
        this.field1838 = arg4;
        super.field417.method2207((byte) -61, this);
        OpenGL.glTexImage2Dub(super.field416, 0, this.method173(true), arg3, arg4, 0, class325.method1935(124, super.field403), class352.method2082(super.field414, false), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(Lai;Lwd;IIZ[FII)V", line = 170)
    public class164(class597 arg0, class272 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class687.field9701, arg2 * arg3, arg4);
        this.field1838 = arg3;
        this.field1837 = arg2;
        super.field417.method2207((byte) -61, this);
        if (!arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method178(arg2, -7991, arg3, arg5, super.field416);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field416, 0, this.method173(true), arg2, arg3, 0, class325.method1935(-74, super.field403), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(Lai;Lwd;IIZ[BII)V", line = 190)
    public class164(class597 arg0, class272 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class687.field9697, arg2 * arg3, arg4);
        this.field1837 = arg2;
        this.field1838 = arg3;
        super.field417.method2207((byte) -61, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method171(arg2, arg3, super.field416, arg5, 113);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field416, 0, this.method173(true), arg2, arg3, 0, class325.method1935(65, super.field403), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZLig;)Lua;", line = 213)
    public static final class663 method1017(boolean arg0, class244 arg1) {
        if (!arg0) {
            method1016(74);
        }
        ++field1832;
        int var2 = arg1.method1438(104);
        return new class663(var2);
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIB[BIIILwd;I)V", line = 227)
    public final void method601(int arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5, int arg6, class272 arg7, int arg8) {
        ++field1835;
        super.field417.method2207((byte) -61, this);
        OpenGL.glPixelStorei(3317, 1);
        int var10 = -99 % ((arg2 - -60) / 47);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexSubImage2Dub(super.field416, 0, arg4, arg8, arg1, arg0, class325.method1935(63, arg7), 5121, arg3, arg6);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Z)I", line = 242)
    public final int method603(boolean arg0) {
        if (!arg0) {
            this.method604(false, false, (byte) 63);
        }
        ++field1830;
        return this.field1838;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(FI)F", line = 256)
    public final float method599(float arg0, int arg1) {
        ++field1839;
        int var3 = 1 / ((arg1 - -41) / 47);
        return arg0 / (float) this.field1838;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(I)I", line = 267)
    public final int method608(int arg0) {
        ++field1831;
        if (arg0 != -27620) {
            this.field1838 = -95;
        }
        return this.field1837;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IF)F", line = 282)
    public final float method606(int arg0, float arg1) {
        if (arg0 != 13050) {
            this.method607(-10, (int[]) null, -128, -72, -77, 32, -87);
        }
        ++field1829;
        return arg1 / (float) this.field1837;
    }
}
