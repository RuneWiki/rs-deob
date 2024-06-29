import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class159 extends class315 implements class309 {

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    private int field1983;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    private int field1987;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "[I")
    public static int[] field1988 = new int[14];

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "Lra;")
    public static class361 field1991 = null;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "[[[B")
    public static byte[][][] field1994;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Z")
    public final boolean method1128(int arg0) {
        if (arg0 != -9355) {
            this.field1987 = -44;
        }
        ++field1989;
        return false;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lia;II[III)V")
    public class159(class27 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class135.field1774, class6.field48, arg1 * arg2, false);
        this.field1983 = arg2;
        this.field1987 = arg1;
        super.field4091.method3091(true, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field4082, 0, 6408, this.field1987, this.field1983, 0, 32993, super.field4091.field423, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILpw;I[BIIIII)V")
    public final void method1129(int arg0, class89 arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1985;
        if (~arg7 == -1) {
            arg7 = arg2;
        }
        super.field4091.method3091(true, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 != 1780) {
            this.method1130((byte) -40);
        }
        if (arg2 != arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Dub(super.field4082, 0, arg4, arg8, arg2, arg0, class386.method2201((byte) 126, arg1), 5121, arg3, arg6);
        if (~arg2 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)I")
    public final int method1130(byte arg0) {
        if (arg0 != -91) {
            this.field1983 = -41;
        }
        ++field1986;
        return this.field1983;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lia;Lpw;II[BII)V")
    public class159(class27 arg0, class89 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class6.field48, arg2 * arg3, false);
        this.field1987 = arg2;
        this.field1983 = arg3;
        super.field4091.method3091(true, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field4082, 0, this.method1838((byte) 83), arg2, arg3, 0, class386.method2201((byte) 124, super.field4100), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)I")
    public final int method1131(byte arg0) {
        int var2 = -94 / ((54 - arg0) / 62);
        ++field1984;
        return this.field1987;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([IIBIIIII)V")
    public final void method1132(int[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 == 0) {
            arg7 = arg3;
        }
        super.field4091.method3091(true, this);
        ++field1992;
        if (~arg3 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Di(super.field4082, 0, arg5, arg1, arg3, arg4, 32993, super.field4091.field423, arg0, arg6);
        if (~arg3 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg2 < 45) {
            field1991 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lia;Lpw;Llj;II)V")
    public class159(class27 arg0, class89 arg1, class6 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field1987 = arg3;
        this.field1983 = arg4;
        super.field4091.method3091(true, this);
        OpenGL.glTexImage2Dub(super.field4082, 0, this.method1838((byte) 83), arg3, arg4, 0, class386.method2201((byte) 127, super.field4100), class223.method1411((byte) 120, super.field4083), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lia;Lpw;II[FII)V")
    public class159(class27 arg0, class89 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class6.field52, arg2 * arg3, false);
        this.field1987 = arg2;
        this.field1983 = arg3;
        super.field4091.method3091(true, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field4082, 0, this.method1838((byte) 83), arg2, arg3, 0, class386.method2201((byte) 124, super.field4100), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZZI)V")
    public final void method1133(boolean arg0, boolean arg1, int arg2) {
        if (arg2 != 19263) {
            this.field1987 = 107;
        }
        ++field1990;
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)V")
    public static void method1134(byte arg0) {
        field1994 = null;
        field1991 = null;
        field1988 = null;
        if (arg0 < 24) {
            method1134((byte) -84);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IF)F")
    public final float method1135(int arg0, float arg1) {
        ++field1993;
        if (arg0 != 7886) {
            field1991 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(FB)F")
    public final float method1136(float arg0, byte arg1) {
        ++field1995;
        return arg1 >= -94 ? -0.111915946F : arg0;
    }
}
