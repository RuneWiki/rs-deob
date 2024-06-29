import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class23 extends class594 implements class190 {

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    private int field888;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    private int field882;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBI[IIIII)V")
    public final void method464(int arg0, byte arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = 58 / ((61 - arg1) / 43);
        super.field8555.method3266(-2, this);
        ++field885;
        OpenGL.glPixelStorei(3314, arg4);
        OpenGL.glTexSubImage2Di(super.field8554, 0, arg2, arg6, arg5, arg7, 32993, super.field8555.field6838, arg3, arg0);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIZ)V")
    public final void method465(boolean arg0, int arg1, boolean arg2) {
        ++field891;
        if (arg1 != 13321) {
            this.method472(88);
        }
        super.field8555.method3266(-2, this);
        OpenGL.glTexParameteri(super.field8554, 10242, !arg0 ? 33071 : 10497);
        OpenGL.glTexParameteri(super.field8554, 10243, !arg2 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)I")
    public final int method466(int arg0) {
        if (arg0 != -29159) {
            this.method473(-90);
        }
        ++field887;
        return this.field888;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(FI)F")
    public final float method467(float arg0, int arg1) {
        ++field883;
        if (arg1 != -13359) {
            this.method472(125);
        }
        return arg0 / (float) this.field888;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljq;IIZ[III)V")
    public class23(class475 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class121.field2214, class2.field372, arg1 * arg2, arg3);
        this.field888 = arg1;
        this.field882 = arg2;
        super.field8555.method3266(-2, this);
        if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method3386(arg1, super.field8554, 0, arg2, arg4);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field8554, 0, 6408, this.field888, this.field882, 0, 32993, super.field8555.field6838, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIII[FLfda;I)V")
    public final void method468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, class294 arg7, int arg8) {
        super.field8555.method3266(-2, this);
        ++field893;
        if (arg8 != 26339) {
            this.method464(47, (byte) -77, -105, (int[]) null, 40, -18, -62, 103);
        }
        OpenGL.glPixelStorei(3314, arg4);
        OpenGL.glTexSubImage2Df(super.field8554, 0, arg0, arg5, arg3, arg2, class635.method3618(arg7, 1), 5121, arg6, arg1);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)Lfq;")
    public static final class186 method469(int arg0, byte arg1) {
        if (arg1 != -15) {
            method469(-40, (byte) -24);
        }
        ++field890;
        return new class186(arg0, false);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lfda;IIIII[BZI)V")
    public final void method470(class294 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, boolean arg7, int arg8) {
        ++field892;
        super.field8555.method3266(-2, this);
        if (!arg7) {
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glPixelStorei(3314, arg4);
            OpenGL.glTexSubImage2Dub(super.field8554, 0, arg2, arg5, arg8, arg3, class635.method3618(arg0, 1), 5121, arg6, arg1);
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(FI)F")
    public final float method471(float arg0, int arg1) {
        if (arg1 != 5235) {
            return 0.6208492F;
        } else {
            ++field889;
            return arg0 / (float) this.field882;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)I")
    public final int method472(int arg0) {
        if (arg0 != 19099) {
            return 120;
        } else {
            ++field884;
            return this.field882;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljq;Lfda;IIZ[FII)V")
    public class23(class475 arg0, class294 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class2.field376, arg2 * arg3, arg4);
        this.field882 = arg3;
        this.field888 = arg2;
        super.field8555.method3266(-2, this);
        if (!arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method3392(arg5, arg2, super.field8554, arg3, 104);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field8554, 0, this.method3387(-3), arg2, arg3, 0, class635.method3618(super.field8543, 1), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljq;Lfda;IIZ[BII)V")
    public class23(class475 arg0, class294 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class2.field372, arg2 * arg3, arg4);
        this.field888 = arg2;
        this.field882 = arg3;
        super.field8555.method3266(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && arg6 == 0) {
            this.method3389(arg2, arg3, super.field8554, false, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field8554, 0, this.method3387(-3), arg2, arg3, 0, class635.method3618(super.field8543, 1), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljq;Lfda;Lro;II)V")
    public class23(class475 arg0, class294 arg1, class2 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field888 = arg3;
        this.field882 = arg4;
        super.field8555.method3266(-2, this);
        OpenGL.glTexImage2Dub(super.field8554, 0, this.method3387(-3), arg3, arg4, 0, class635.method3618(super.field8543, 1), class89.method867(true, super.field8551), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Z")
    public final boolean method473(int arg0) {
        if (arg0 != 27) {
            this.method473(94);
        }
        ++field886;
        return true;
    }
}
