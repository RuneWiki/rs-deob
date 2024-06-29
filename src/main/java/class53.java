import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class53 extends class50 implements class612 {

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    private int field683;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    private int field680;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "[Lo;")
    public static class183[] field688 = new class183[35];

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "[S")
    public static short[] field685;

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lad;IIZ[III)V", line = 3)
    public class53(class669 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class297.field4191, class689.field9771, arg1 * arg2, arg3);
        this.field683 = arg2;
        this.field680 = arg1;
        super.field663.method2924(13528, this);
        if (arg3 && ~arg6 == -1 && arg5 == 0) {
            this.method393(super.field651, (byte) -100, arg2, arg4, arg1);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field651, 0, 6408, this.field680, this.field683, 0, 32993, super.field663.field9528, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)I", line = 24)
    public final int method412(int arg0) {
        if (arg0 != -17847) {
            return -33;
        } else {
            ++field684;
            return this.field680;
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lad;Ljb;Lqda;II)V", line = 36)
    public class53(class669 arg0, class666 arg1, class689 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field683 = arg4;
        this.field680 = arg3;
        super.field663.method2924(13528, this);
        OpenGL.glTexImage2Dub(super.field651, 0, this.method397((byte) 105), arg3, arg4, 0, class21.method211(super.field654, 49), class548.method3213(super.field646, (byte) -47), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIILjb;II[FI)V", line = 48)
    public final void method413(int arg0, int arg1, int arg2, int arg3, class666 arg4, int arg5, int arg6, float[] arg7, int arg8) {
        if (arg6 <= 1) {
            this.method418(-0.803821F, false);
        }
        super.field663.method2924(13528, this);
        ++field690;
        OpenGL.glPixelStorei(3314, arg2);
        OpenGL.glTexSubImage2Df(super.field651, 0, arg1, arg8, arg3, arg5, class21.method211(arg4, 49), 5121, arg7, arg0);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZZ)V", line = 62)
    public final void method414(int arg0, boolean arg1, boolean arg2) {
        if (arg0 > 96) {
            ++field682;
            super.field663.method2924(13528, this);
            OpenGL.glTexParameteri(super.field651, 10242, arg1 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field651, 10243, arg2 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII[III)V", line = 80)
    public final void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        ++field686;
        super.field663.method2924(13528, this);
        if (arg2 != 23208) {
            this.method418(1.3842624F, false);
        }
        OpenGL.glPixelStorei(3314, arg0);
        OpenGL.glTexSubImage2Di(super.field651, 0, arg4, arg1, arg3, arg6, 32993, super.field663.field9528, arg5, arg7);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lad;Ljb;IIZ[FII)V", line = 95)
    public class53(class669 arg0, class666 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class689.field9775, arg2 * arg3, arg4);
        this.field683 = arg3;
        this.field680 = arg2;
        super.field663.method2924(13528, this);
        if (!arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method399(arg2, super.field651, arg3, -994380735, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field651, 0, this.method397((byte) 113), arg2, arg3, 0, class21.method211(super.field654, 49), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IF)F", line = 114)
    public final float method416(int arg0, float arg1) {
        ++field689;
        return arg0 != -14098 ? 0.37283882F : arg1 / (float) this.field680;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lad;Ljb;IIZ[BII)V", line = 125)
    public class53(class669 arg0, class666 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class689.field9771, arg2 * arg3, arg4);
        this.field683 = arg3;
        this.field680 = arg2;
        super.field663.method2924(13528, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method396(arg3, arg2, arg5, true, super.field651);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field651, 0, this.method397((byte) -112), arg2, arg3, 0, class21.method211(super.field654, 49), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)I", line = 146)
    public final int method417(int arg0) {
        ++field687;
        if (arg0 != 7782) {
            this.method421((byte[]) null, -95, 82, -91, 74, 117, 108, 9, (class666) null);
        }
        return this.field683;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(FZ)F", line = 160)
    public final float method418(float arg0, boolean arg1) {
        ++field679;
        if (arg1) {
            this.method414(24, false, false);
        }
        return arg0 / (float) this.field683;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)Z", line = 171)
    public final boolean method419(int arg0) {
        int var2 = 64 % ((arg0 - 19) / 40);
        ++field691;
        return true;
    }

    @OriginalMember(owner = "client!u", name = "i", descriptor = "(I)V", line = 182)
    public static void method420(int arg0) {
        field685 = null;
        if (arg0 == -1) {
            field688 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BIIIIIIILjb;)V", line = 195)
    public final void method421(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class666 arg8) {
        ++field681;
        super.field663.method2924(13528, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg1);
        OpenGL.glTexSubImage2Dub(super.field651, 0, arg7, arg4, arg5, arg3, class21.method211(arg8, 49), 5121, arg0, arg2);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
        if (arg6 > -55) {
            this.field680 = 93;
        }
    }
}
