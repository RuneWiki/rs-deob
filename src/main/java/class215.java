import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class215 extends class42 implements class320 {

    @OriginalMember(owner = "client!cha", name = "D", descriptor = "I")
    private int field2826;

    @OriginalMember(owner = "client!cha", name = "y", descriptor = "I")
    private int field2821;

    @OriginalMember(owner = "client!cha", name = "x", descriptor = "Lbg;")
    public static class464 field2820 = new class464();

    @OriginalMember(owner = "client!cha", name = "F", descriptor = "I")
    public static int field2828 = 0;

    @OriginalMember(owner = "client!cha", name = "I", descriptor = "I")
    public static int field2831 = 0;

    @OriginalMember(owner = "client!cha", name = "v", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!cha", name = "w", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!cha", name = "z", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!cha", name = "A", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!cha", name = "B", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!cha", name = "C", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!cha", name = "E", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!cha", name = "G", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!cha", name = "H", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!cha", name = "b", descriptor = "(B)I", line = 3)
    public final int method1316(byte arg0) {
        ++field2827;
        return arg0 >= -2 ? -23 : this.field2821;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(IZZ)V", line = 15)
    public final void method1317(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != 28970) {
            field2828 = -98;
        }
        ++field2819;
    }

    @OriginalMember(owner = "client!cha", name = "<init>", descriptor = "(Lfha;Lbda;II[FII)V", line = 26)
    public class215(class378 arg0, class505 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class309.field4309, arg2 * arg3, false);
        this.field2826 = arg2;
        this.field2821 = arg3;
        super.field506.method1663(this, -2);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field508, 0, this.method284(-83), arg2, arg3, 0, class651.method3587((byte) -108, super.field516), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!cha", name = "<init>", descriptor = "(Lfha;Lbda;II[BII)V", line = 39)
    public class215(class378 arg0, class505 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class309.field4305, arg2 * arg3, false);
        this.field2821 = arg3;
        this.field2826 = arg2;
        super.field506.method1663(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field508, 0, this.method284(-116), arg2, arg3, 0, class651.method3587((byte) -87, super.field516), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!cha", name = "<init>", descriptor = "(Lfha;Lbda;Lwt;II)V", line = 55)
    public class215(class378 arg0, class505 arg1, class309 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field2821 = arg4;
        this.field2826 = arg3;
        super.field506.method1663(this, -2);
        OpenGL.glTexImage2Dub(super.field508, 0, this.method284(-89), arg3, arg4, 0, class651.method3587((byte) -117, super.field516), class366.method2339(101, super.field510), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(ZF)F", line = 66)
    public final float method1318(boolean arg0, float arg1) {
        if (!arg0) {
            this.field2821 = 80;
        }
        ++field2825;
        return arg1;
    }

    @OriginalMember(owner = "client!cha", name = "e", descriptor = "(I)V", line = 77)
    public static void method1319(int arg0) {
        field2820 = null;
        if (arg0 < 48) {
            method1319(4);
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(II[IIZIII)V", line = 87)
    public final void method1320(int arg0, int arg1, int[] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        super.field506.method1663(this, -2);
        if (arg1 == 0) {
            arg1 = arg6;
        }
        ++field2829;
        if (~arg1 != ~arg6) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        if (!arg4) {
            this.method1320(101, 81, (int[]) null, -45, false, 7, 105, 0);
        }
        OpenGL.glTexSubImage2Di(super.field508, 0, arg3, arg7, arg6, arg0, 32993, super.field506.field5412, arg2, arg5);
        if (~arg1 != ~arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(IIIIII[I)V", line = 108)
    public final void method1321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        ++field2824;
        int[] var8 = new int[this.field2826 * this.field2821];
        super.field506.method1663(this, -2);
        OpenGL.glGetTexImagei(super.field508, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; ~arg1 < ~var9; ++var9) {
            class255.method1688(var8, (arg4 - (-arg1 + 1) + -var9) * this.field2826, arg6, arg3 * var9 + arg2, arg3);
        }
        int var10 = 100 / ((arg5 - 16) / 62);
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(BF)F", line = 138)
    public final float method1322(byte arg0, float arg1) {
        int var3 = -82 / ((64 - arg0) / 52);
        ++field2830;
        return arg1;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(B)I", line = 149)
    public final int method1323(byte arg0) {
        if (arg0 >= -57) {
            field2828 = -32;
        }
        ++field2823;
        return this.field2826;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(I)Z", line = 160)
    public final boolean method1324(int arg0) {
        if (arg0 != -4111) {
            return true;
        } else {
            ++field2818;
            return false;
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(ILbda;III[BZII)V", line = 171)
    public final void method1325(int arg0, class505 arg1, int arg2, int arg3, int arg4, byte[] arg5, boolean arg6, int arg7, int arg8) {
        ++field2822;
        if (~arg7 == -1) {
            arg7 = arg4;
        }
        super.field506.method1663(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 != arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Dub(super.field508, 0, arg0, arg3, arg4, arg2, class651.method3587((byte) -126, arg1), 5121, arg5, arg8);
        if (~arg4 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        if (!arg6) {
            this.method1318(true, 1.8515702F);
        }
    }

    @OriginalMember(owner = "client!cha", name = "<init>", descriptor = "(Lfha;II[III)V", line = 200)
    public class215(class378 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class165.field2263, class309.field4305, arg1 * arg2, false);
        this.field2821 = arg2;
        this.field2826 = arg1;
        super.field506.method1663(this, -2);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field508, 0, 6408, this.field2826, this.field2821, 0, 32993, super.field506.field5412, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }
}
