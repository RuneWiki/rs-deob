import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class238 extends class574 implements class134 {

    @OriginalMember(owner = "client!pu", name = "B", descriptor = "I")
    private int field2960;

    @OriginalMember(owner = "client!pu", name = "D", descriptor = "I")
    private int field2962;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!pu", name = "y", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!pu", name = "z", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!pu", name = "A", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!pu", name = "C", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!pu", name = "E", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(FZ)F", line = 3)
    public final float method758(float arg0, boolean arg1) {
        if (arg1) {
            this.method753(61, 83, 34, 108, (int[]) null, (byte) 97, -83, 67);
        }
        ++field2956;
        return arg0;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)I", line = 18)
    public static final int method1423(byte arg0) {
        int var1 = -128 % ((70 - arg0) / 55);
        ++field2953;
        return 19;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIILiba;)V", line = 30)
    public static final void method1424(int arg0, int arg1, int arg2, int arg3, class498 arg4) {
        class499 var5 = class472.method2722(arg0, arg1, arg2);
        if (var5 != null) {
            arg4.field5179 = (arg1 << class559.field7984) + class291.field3640;
            arg4.field5178 = arg3;
            arg4.field5176 = (arg2 << class559.field7984) + class291.field3640;
            if (var5.field7230 != null) {
                arg4.field5178 -= var5.field7230.field8104;
            }
            var5.field7217 = arg4;
            int var6 = class666.field9303 == class156.field1743 ? 1 : 0;
            if (arg4.method180(-1)) {
                if (arg4.method177(-113)) {
                    class13.field115[var6][class635.field8946[var6]++] = arg4;
                    return;
                }
                class469.field6711[var6][class321.field3949[var6]++] = arg4;
                return;
            }
            class476.field6867[var6][class701.field9822[var6]++] = arg4;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)I", line = 58)
    public final int method754(int arg0) {
        if (arg0 != 7142) {
            this.method756(-0.027324865F, -102);
        }
        ++field2955;
        return this.field2960;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II[BIIIILsq;I)V", line = 69)
    public final void method757(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, class485 arg7, int arg8) {
        if (arg8 == 13031) {
            super.field8143.method1997(arg8 + -12904, this);
            if (arg1 == 0) {
                arg1 = arg6;
            }
            ++field2958;
            OpenGL.glPixelStorei(3317, 1);
            if (arg1 != arg6) {
                OpenGL.glPixelStorei(3314, arg1);
            }
            OpenGL.glTexSubImage2Dub(super.field8151, 0, arg3, arg0, arg6, arg4, class181.method1102(arg7, (byte) 71), 5121, arg2, arg5);
            if (arg1 != arg6) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(FI)F", line = 98)
    public final float method756(float arg0, int arg1) {
        if (arg1 != 5044) {
            return 1.3245182F;
        } else {
            ++field2961;
            return arg0;
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lmr;Lsq;II[FII)V", line = 109)
    public class238(class221 arg0, class485 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class179.field2012, arg2 * arg3, false);
        this.field2960 = arg3;
        this.field2962 = arg2;
        super.field8143.method1997(126, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field8151, 0, this.method3244(-17), arg2, arg3, 0, class181.method1102(super.field8155, (byte) 46), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lmr;Lsq;Lrt;II)V", line = 123)
    public class238(class221 arg0, class485 arg1, class179 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field2960 = arg4;
        this.field2962 = arg3;
        super.field8143.method1997(127, this);
        OpenGL.glTexImage2Dub(super.field8151, 0, this.method3244(29), arg3, arg4, 0, class181.method1102(super.field8155, (byte) 66), class191.method1159(super.field8157, 126), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIII[IBII)V", line = 135)
    public final void method753(int arg0, int arg1, int arg2, int arg3, int[] arg4, byte arg5, int arg6, int arg7) {
        int var9 = 33 % ((-63 - arg5) / 56);
        ++field2959;
        if (~arg0 == -1) {
            arg0 = arg1;
        }
        super.field8143.method1997(127, this);
        if (~arg0 != ~arg1) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Di(super.field8151, 0, arg7, arg3, arg1, arg6, 32993, super.field8143.field2739, arg4, arg2);
        if (arg0 != arg1) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lmr;II[III)V", line = 156)
    public class238(class221 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class412.field5529, class179.field2008, arg1 * arg2, false);
        this.field2960 = arg2;
        this.field2962 = arg1;
        super.field8143.method1997(126, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field8151, 0, 6408, this.field2962, this.field2960, 0, 32993, super.field8143.field2739, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)Z", line = 169)
    public final boolean method755(int arg0) {
        ++field2952;
        if (arg0 > -72) {
            this.method754(80);
        }
        return false;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)I", line = 180)
    public final int method752(int arg0) {
        ++field2954;
        if (arg0 < 103) {
            this.field2962 = -71;
        }
        return this.field2962;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lmr;Lsq;II[BII)V", line = 193)
    public class238(class221 arg0, class485 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class179.field2008, arg2 * arg3, false);
        this.field2960 = arg3;
        this.field2962 = arg2;
        super.field8143.method1997(127, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field8151, 0, this.method3244(6), arg2, arg3, 0, class181.method1102(super.field8155, (byte) 110), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZIZ)V", line = 209)
    public final void method759(boolean arg0, int arg1, boolean arg2) {
        ++field2963;
        if (arg1 != -19314) {
            this.method756(0.41665703F, -53);
        }
    }
}
