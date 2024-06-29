import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class580 extends class45 implements class579 {

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    private int field8358;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    private int field8350;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field8349;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public static int field8351;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public static int field8352;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public static int field8353;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "I")
    public static int field8354;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "I")
    public static int field8355;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public static int field8356;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public static int field8357;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public static int field8359;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V")
    public static final void method3368(int arg0, int arg1) {
        ++field8355;
        class456.field6832 = arg1;
        class30.field344.method1810(false);
        if (arg0 > -38) {
            method3368(-54, 37);
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(II)I")
    public static final int method3369(int arg0, int arg1) {
        ++field8351;
        int var2 = -89 % ((arg0 - 32) / 50);
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)I")
    public final int method475(int arg0) {
        if (arg0 < 36) {
            field8354 = 87;
        }
        ++field8349;
        return this.field8358;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lgf;II[III)V")
    public class580(class234 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class538.field7742, class256.field3653, arg1 * arg2, false);
        this.field8358 = arg2;
        this.field8350 = arg1;
        super.field480.method1971((byte) -105, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field475, 0, 6408, this.field8350, this.field8358, 0, 32993, super.field480.field3367, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII[II)V")
    public final void method471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        ++field8356;
        super.field480.method1971((byte) -75, this);
        if (~arg2 == -1) {
            arg2 = arg3;
        }
        if (arg4 != 5218) {
            field8354 = 20;
        }
        if (~arg2 != ~arg3) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Di(super.field475, 0, arg1, arg5, arg3, arg7, 32993, super.field480.field3367, arg6, arg0);
        if (arg2 != arg3) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZF)F")
    public final float method473(boolean arg0, float arg1) {
        if (arg0) {
            this.method476(true, true, (byte) 46);
        }
        ++field8353;
        return arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIILkp;[BIBII)V")
    public final void method469(int arg0, int arg1, int arg2, class421 arg3, byte[] arg4, int arg5, byte arg6, int arg7, int arg8) {
        ++field8357;
        if (arg6 >= -108) {
            field8354 = 33;
        }
        super.field480.method1971((byte) -119, this);
        if (~arg0 == -1) {
            arg0 = arg2;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (~arg0 != ~arg2) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Dub(super.field475, 0, arg5, arg1, arg2, arg8, class442.method2756(arg3, 102), 5121, arg4, arg7);
        if (~arg0 != ~arg2) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZZB)V")
    public final void method476(boolean arg0, boolean arg1, byte arg2) {
        if (arg2 <= 121) {
            this.field8350 = -3;
        }
        ++field8362;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method3370(byte arg0, int arg1) {
        ++field8360;
        if (arg0 != -22) {
            method3370((byte) -109, -127);
        }
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; ~var3 < -1; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (~var2.length() < -10) {
            return " <col=00ff80>" + var2.substring(0, var2.length() + -8) + class541.field7758.method2902(class35.field396, -20139) + " (" + var2 + ")</col>";
        } else {
            return ~var2.length() < -7 ? " <col=ffffff>" + var2.substring(0, -4 + var2.length()) + class522.field7598.method2902(class35.field396, -20139) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lgf;Lkp;II[BII)V")
    public class580(class234 arg0, class421 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class256.field3653, arg2 * arg3, false);
        this.field8350 = arg2;
        this.field8358 = arg3;
        super.field480.method1971((byte) -128, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field475, 0, this.method243((byte) -109), arg2, arg3, 0, class442.method2756(super.field489, 104), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lgf;Lkp;Lvt;II)V")
    public class580(class234 arg0, class421 arg1, class256 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field8350 = arg3;
        this.field8358 = arg4;
        super.field480.method1971((byte) -76, this);
        OpenGL.glTexImage2Dub(super.field475, 0, this.method243((byte) -71), arg3, arg4, 0, class442.method2756(super.field489, 109), class572.method3326(super.field481, 5122), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IF)F")
    public final float method474(int arg0, float arg1) {
        ++field8359;
        int var3 = 32 / ((-32 - arg0) / 61);
        return arg1;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)I")
    public final int method470(int arg0) {
        if (arg0 != 5742) {
            this.method473(true, 0.41173345F);
        }
        ++field8361;
        return this.field8350;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lgf;Lkp;II[FII)V")
    public class580(class234 arg0, class421 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class256.field3657, arg2 * arg3, false);
        this.field8350 = arg2;
        this.field8358 = arg3;
        super.field480.method1971((byte) -77, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field475, 0, this.method243((byte) -70), arg2, arg3, 0, class442.method2756(super.field489, 114), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)Z")
    public final boolean method472(int arg0) {
        if (arg0 != -23679) {
            this.method474(-70, 0.6632899F);
        }
        ++field8352;
        return false;
    }
}
