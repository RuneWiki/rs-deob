import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class44 extends class327 implements class225 {

    @OriginalMember(owner = "client!k", name = "H", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "I")
    private int field588;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "[[I")
    public static int[][] field586 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!k", name = "F", descriptor = "I")
    public static int field581 = -1;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lfc;Lnea;II[FII)V", line = 3)
    public class44(class642 arg0, class600 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class629.field8922, arg2 * arg3, false);
        this.field583 = arg3;
        this.field588 = arg2;
        super.field4645.method988(1, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field4667, 0, this.method1987(1683), arg2, arg3, 0, class177.method1293(84, super.field4659), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IF)F", line = 18)
    public final float method328(int arg0, float arg1) {
        ++field580;
        if (arg0 != 431) {
            field581 = -79;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lfc;II[III)V", line = 29)
    public class44(class642 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class133.field2225, class629.field8918, arg1 * arg2, false);
        this.field588 = arg1;
        this.field583 = arg2;
        super.field4645.method988(1, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field4667, 0, 6408, this.field588, this.field583, 0, 32993, super.field4645.field9137, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II[IIIIII)V", line = 42)
    public final void method329(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 == 0) {
            arg0 = arg4;
        }
        super.field4645.method988(1, this);
        ++field582;
        if (arg7 != -27716) {
            this.method338(27);
        }
        if (arg0 != arg4) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Di(super.field4667, 0, arg5, arg1, arg4, arg3, 32993, super.field4645.field9137, arg2, arg6);
        if (~arg0 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(FI)F", line = 66)
    public final float method330(float arg0, int arg1) {
        ++field593;
        int var3 = -27 % ((78 - arg1) / 47);
        return arg0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZLnea;I[BIIII)V", line = 76)
    public final void method331(int arg0, boolean arg1, class600 arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field591;
        if (arg5 == 0) {
            arg5 = arg6;
        }
        super.field4645.method988(1, this);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg5 != ~arg6) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        if (arg1) {
            OpenGL.glTexSubImage2Dub(super.field4667, 0, arg0, arg3, arg6, arg8, class177.method1293(93, arg2), 5121, arg4, arg7);
            if (~arg5 != ~arg6) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZLtd;)Ljava/lang/String;", line = 102)
    public static final String method332(boolean arg0, class551 arg1) {
        ++field590;
        return arg0 ? null : arg1.field7652 + " <col=ffffff>>";
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZZI)V", line = 115)
    public final void method333(boolean arg0, boolean arg1, int arg2) {
        if (arg2 != 7536) {
            this.method331(8, true, (class600) null, 54, (byte[]) null, 60, 102, 69, -58);
        }
        ++field587;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)I", line = 126)
    public final int method334(byte arg0) {
        ++field579;
        int var2 = -100 / ((arg0 - 30) / 37);
        return this.field588;
    }

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)V", line = 136)
    public static void method335(int arg0) {
        field586 = null;
        if (arg0 != 3314) {
            method335(-117);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III[IIII)V", line = 147)
    public final void method336(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6) {
        ++field589;
        int[] var8 = new int[this.field588 * this.field583];
        super.field4645.method988(arg4 ^ -7208, this);
        OpenGL.glGetTexImagei(super.field4667, 0, 32993, 5121, var8, 0);
        int var9 = 0;
        if (arg4 != -7207) {
            this.method329(94, -119, (int[]) null, 30, -114, -39, 118, 103);
        }
        while (~var9 > ~arg0) {
            class171.method1262(var8, (-var9 + arg6 + arg0 - 1) * this.field588, arg3, arg1 * var9 + arg5, arg1);
            ++var9;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lfc;Lnea;Ldr;II)V", line = 172)
    public class44(class642 arg0, class600 arg1, class629 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field588 = arg3;
        this.field583 = arg4;
        super.field4645.method988(1, this);
        OpenGL.glTexImage2Dub(super.field4667, 0, this.method1987(1683), arg3, arg4, 0, class177.method1293(111, super.field4659), class3.method23(false, super.field4665), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lfc;Lnea;II[BII)V", line = 183)
    public class44(class642 arg0, class600 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class629.field8918, arg2 * arg3, false);
        this.field588 = arg2;
        this.field583 = arg3;
        super.field4645.method988(1, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field4667, 0, this.method1987(1683), arg2, arg3, 0, class177.method1293(98, super.field4659), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)Z", line = 203)
    public final boolean method337(byte arg0) {
        ++field592;
        return arg0 != 7;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)I", line = 216)
    public final int method338(int arg0) {
        int var2 = 116 / ((-16 - arg0) / 52);
        ++field584;
        return this.field583;
    }
}
