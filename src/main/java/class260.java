import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class260 extends class7 implements class422 {

    @OriginalMember(owner = "client!wt", name = "G", descriptor = "I")
    private int field3719;

    @OriginalMember(owner = "client!wt", name = "y", descriptor = "I")
    private int field3712;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!wt", name = "A", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!wt", name = "B", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!wt", name = "E", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!wt", name = "F", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!wt", name = "H", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(II[BIIILaq;IB)V", line = 3)
    public final void method1647(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, class141 arg6, int arg7, byte arg8) {
        super.field69.method2632(this, 0);
        ++field3716;
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexSubImage2Dub(super.field78, 0, arg3, arg4, arg7, arg0, class546.method3319(53, arg6), 5121, arg2, arg1);
        OpenGL.glPixelStorei(3314, 0);
        int var10 = 15 % ((-53 - arg8) / 32);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lag;Laq;IIZ[BII)V", line = 18)
    public class260(class587 arg0, class141 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class194.field2874, arg2 * arg3, arg4);
        this.field3719 = arg2;
        this.field3712 = arg3;
        super.field69.method2632(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method26(arg2, arg5, super.field78, (byte) -96, arg3);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field78, 0, this.method29((byte) -86), arg2, arg3, 0, class546.method3319(45, super.field63), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZZZ)V", line = 40)
    public final void method1648(boolean arg0, boolean arg1, boolean arg2) {
        ++field3715;
        super.field69.method2632(this, 0);
        if (arg2) {
            OpenGL.glTexParameteri(super.field78, 10242, !arg0 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field78, 10243, !arg1 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIZ)I", line = 57)
    public static final int method1649(int arg0, int arg1, boolean arg2) {
        ++field3711;
        if (!arg2) {
            method1649(-9, 46, true);
        }
        return ~arg0 != -2 && ~arg0 != -4 ? class114.field1601[3 & arg1] : class332.field4594[3 & arg1];
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)I", line = 71)
    public final int method1650(int arg0) {
        ++field3720;
        return arg0 != 10264 ? 108 : this.field3712;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lag;Laq;IIZ[FII)V", line = 83)
    public class260(class587 arg0, class141 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class194.field2878, arg2 * arg3, arg4);
        this.field3719 = arg2;
        this.field3712 = arg3;
        super.field69.method2632(this, 0);
        if (!arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method23(arg3, (byte) -98, arg5, arg2, super.field78);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field78, 0, this.method29((byte) -86), arg2, arg3, 0, class546.method3319(92, super.field63), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(FI)F", line = 106)
    public final float method1651(float arg0, int arg1) {
        int var3 = 42 / ((arg1 - -48) / 56);
        ++field3709;
        return arg0 / (float) this.field3719;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)Z", line = 116)
    public final boolean method1652(byte arg0) {
        ++field3710;
        int var2 = -93 / ((-6 - arg0) / 48);
        return true;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(FB)F", line = 126)
    public final float method1653(float arg0, byte arg1) {
        int var3 = -124 / ((-6 - arg1) / 54);
        ++field3713;
        return arg0 / (float) this.field3712;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lag;IIZ[III)V", line = 137)
    public class260(class587 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class488.field6956, class194.field2874, arg1 * arg2, arg3);
        this.field3719 = arg1;
        this.field3712 = arg2;
        super.field69.method2632(this, 0);
        if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method32(arg1, arg4, super.field78, arg2, 255);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field78, 0, 6408, this.field3719, this.field3712, 0, 32993, super.field69.field8711, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lag;Laq;Lui;II)V", line = 158)
    public class260(class587 arg0, class141 arg1, class194 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field3712 = arg4;
        this.field3719 = arg3;
        super.field69.method2632(this, 0);
        OpenGL.glTexImage2Dub(super.field78, 0, this.method29((byte) -86), arg3, arg4, 0, class546.method3319(76, super.field63), class595.method3522(super.field66, (byte) 80), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(III[IIIIZ)V", line = 169)
    public final void method1654(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super.field69.method2632(this, 0);
        ++field3717;
        if (arg7) {
            OpenGL.glPixelStorei(3314, arg2);
            OpenGL.glTexSubImage2Di(super.field78, 0, arg5, arg1, arg6, arg0, 32993, super.field69.field8711, arg3, arg4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)I", line = 183)
    public final int method1655(byte arg0) {
        if (arg0 >= -99) {
            this.method1654(-26, -123, 89, (int[]) null, 103, -88, 72, false);
        }
        ++field3718;
        return this.field3719;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIILaq;ZI[FII)V", line = 195)
    public final void method1656(int arg0, int arg1, int arg2, class141 arg3, boolean arg4, int arg5, float[] arg6, int arg7, int arg8) {
        ++field3714;
        if (!arg4) {
            super.field69.method2632(this, 0);
            OpenGL.glPixelStorei(3314, arg0);
            OpenGL.glTexSubImage2Df(super.field78, 0, arg5, arg1, arg7, arg8, class546.method3319(108, arg3), 5121, arg6, arg2);
            OpenGL.glPixelStorei(3314, 0);
        }
    }
}
