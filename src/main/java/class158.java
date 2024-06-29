import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class158 extends class300 implements class691 {

    @OriginalMember(owner = "client!un", name = "y", descriptor = "I")
    private int field2263;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    private int field2272;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "Ltt;")
    public static class338 field2266 = new class338(55, -1);

    @OriginalMember(owner = "client!un", name = "z", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!un", name = "A", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!un", name = "G", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!un", name = "I", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!un", name = "O", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!un", name = "Q", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!un", name = "P", descriptor = "Lga;")
    public static class332 field2277;

    @OriginalMember(owner = "client!un", name = "E", descriptor = "[Lf;")
    public static class532[] field2268;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILsk;IBIIII[F)V")
    public final void method974(int arg0, class452 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, float[] arg8) {
        if (arg3 >= -126) {
            field2277 = null;
        }
        super.field3985.method3613((byte) 126, this);
        ++field2274;
        OpenGL.glPixelStorei(3314, arg2);
        OpenGL.glTexSubImage2Df(super.field3982, 0, arg4, arg6, arg5, arg7, class400.method2292(-27762, arg1), 5121, arg8, arg0);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BF)F")
    public final float method841(byte arg0, float arg1) {
        if (arg0 != -40) {
            field2276 = -78;
        }
        ++field2265;
        return arg1 / (float) this.field2263;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZBZ)V")
    public final void method846(boolean arg0, byte arg1, boolean arg2) {
        ++field2264;
        if (arg1 < 55) {
            this.method842((byte) 4);
        }
        super.field3985.method3613((byte) 127, this);
        OpenGL.glTexParameteri(super.field3982, 10242, arg2 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field3982, 10243, !arg0 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(FB)F")
    public final float method843(float arg0, byte arg1) {
        ++field2270;
        if (arg1 != 58) {
            field2266 = null;
        }
        return arg0 / (float) this.field2272;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIII[BLsk;I)V")
    public final void method850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, class452 arg7, int arg8) {
        super.field3985.method3613((byte) 127, this);
        ++field2269;
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg2);
        OpenGL.glTexSubImage2Dub(super.field3982, 0, arg4, arg5, arg3, arg8, class400.method2292(-27762, arg7), 5121, arg6, arg1);
        OpenGL.glPixelStorei(3314, 0);
        if (arg0 != -3661) {
            this.method974(87, (class452) null, 1, (byte) 10, 94, 79, 70, -127, (float[]) null);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lqi;Lsk;IIZ[FII)V")
    public class158(class510 arg0, class452 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class404.field5342, arg2 * arg3, arg4);
        this.field2263 = arg3;
        this.field2272 = arg2;
        super.field3985.method3613((byte) 112, this);
        if (!arg4 && arg7 == 0 && arg6 == 0) {
            this.method1771(40, arg3, arg5, super.field3982, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field3982, 0, this.method1776(true), arg2, arg3, 0, class400.method2292(-27762, super.field3989), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lqi;Lsk;IIZ[BII)V")
    public class158(class510 arg0, class452 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class404.field5338, arg2 * arg3, arg4);
        this.field2272 = arg2;
        this.field2263 = arg3;
        super.field3985.method3613((byte) 96, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method1774(arg5, arg2, super.field3982, -1304653064, arg3);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field3982, 0, this.method1776(true), arg2, arg3, 0, class400.method2292(-27762, super.field3989), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)Z")
    public final boolean method849(int arg0) {
        ++field2275;
        if (arg0 > -23) {
            this.method851(87, -112, 35, (int[]) null, -93, (byte) 56, 27, -28);
        }
        return true;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)I")
    public final int method848(boolean arg0) {
        if (!arg0) {
            return 67;
        } else {
            ++field2271;
            return this.field2272;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)I")
    public final int method842(byte arg0) {
        ++field2278;
        int var2 = -14 % ((-47 - arg0) / 60);
        return this.field2263;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lqi;Lsk;Lvea;II)V")
    public class158(class510 arg0, class452 arg1, class404 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field2263 = arg4;
        this.field2272 = arg3;
        super.field3985.method3613((byte) 123, this);
        OpenGL.glTexImage2Dub(super.field3982, 0, this.method1776(true), arg3, arg4, 0, class400.method2292(-27762, super.field3989), class336.method1972((byte) 123, super.field3972), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(III[IIBII)V")
    public final void method851(int arg0, int arg1, int arg2, int[] arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++field2267;
        super.field3985.method3613((byte) 115, this);
        OpenGL.glPixelStorei(3314, arg0);
        if (arg5 != -122) {
            this.method846(true, (byte) 122, true);
        }
        OpenGL.glTexSubImage2Di(super.field3982, 0, arg4, arg2, arg1, arg6, 32993, super.field3985.field7126, arg3, arg7);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V")
    public static void method975(int arg0) {
        if (arg0 == -22167) {
            field2268 = null;
            field2277 = null;
            field2266 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lqi;IIZ[III)V")
    public class158(class510 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class480.field6686, class404.field5338, arg1 * arg2, arg3);
        this.field2272 = arg1;
        this.field2263 = arg2;
        super.field3985.method3613((byte) 113, this);
        if (arg3 && arg6 == 0 && ~arg5 == -1) {
            this.method1770(arg1, arg4, arg2, (byte) 67, super.field3982);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field3982, 0, 6408, this.field2272, this.field2263, 0, 32993, super.field3985.field7126, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }
}
