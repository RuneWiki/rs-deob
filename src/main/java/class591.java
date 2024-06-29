import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class591 extends class163 implements class405 {

    @OriginalMember(owner = "client!ww", name = "z", descriptor = "I")
    private int field8394;

    @OriginalMember(owner = "client!ww", name = "v", descriptor = "I")
    private int field8390;

    @OriginalMember(owner = "client!ww", name = "u", descriptor = "Led;")
    public static class115 field8389 = new class115();

    @OriginalMember(owner = "client!ww", name = "G", descriptor = "[I")
    public static int[] field8401 = new int[1024];

    @OriginalMember(owner = "client!ww", name = "w", descriptor = "I")
    public static int field8391;

    @OriginalMember(owner = "client!ww", name = "x", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!ww", name = "y", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!ww", name = "A", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!ww", name = "B", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!ww", name = "C", descriptor = "I")
    public static int field8397;

    @OriginalMember(owner = "client!ww", name = "D", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!ww", name = "E", descriptor = "I")
    public static int field8399;

    @OriginalMember(owner = "client!ww", name = "F", descriptor = "I")
    public static int field8400;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIZI[IIII)V")
    public final void method1537(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        ++field8395;
        super.field2405.method3577(this, arg2);
        OpenGL.glPixelStorei(3314, arg7);
        OpenGL.glTexSubImage2Di(super.field2418, 0, arg6, arg0, arg3, arg1, 32993, super.field2405.field2064, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IILkl;III[BII)V")
    public final void method1534(int arg0, int arg1, class468 arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field8398;
        super.field2405.method3577(this, true);
        if (arg0 != 21145) {
            this.method1536(20);
        }
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg4);
        OpenGL.glTexSubImage2Dub(super.field2418, 0, arg5, arg3, arg1, arg8, class387.method2348(arg2, (byte) -111), 5121, arg6, arg7);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)I")
    public final int method1533(int arg0) {
        if (arg0 <= 114) {
            field8401 = null;
        }
        ++field8397;
        return this.field8390;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)I")
    public final int method1530(int arg0) {
        if (arg0 >= -18) {
            this.method1534(-27, -121, (class468) null, 34, 67, 83, (byte[]) null, 49, 44);
        }
        ++field8392;
        return this.field8394;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIII[FIILkl;B)V")
    public final void method3382(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, class468 arg7, byte arg8) {
        ++field8396;
        super.field2405.method3577(this, true);
        OpenGL.glPixelStorei(3314, arg3);
        OpenGL.glTexSubImage2Df(super.field2418, 0, arg6, arg5, arg0, arg1, class387.method2348(arg7, (byte) -125), 5121, arg4, arg2);
        OpenGL.glPixelStorei(3314, 0);
        if (arg8 <= 66) {
            this.method1531(false, 0.056709237F);
        }
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Llh;Lkl;IIZ[FII)V")
    public class591(class125 arg0, class468 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class343.field4926, arg2 * arg3, arg4);
        this.field8394 = arg3;
        this.field8390 = arg2;
        super.field2405.method3577(this, true);
        if (!arg4 && arg7 == 0 && arg6 == 0) {
            this.method1144(super.field2418, arg2, arg3, 121, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field2418, 0, this.method1140((byte) 125), arg2, arg3, 0, class387.method2348(super.field2417, (byte) -120), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Llh;IIZ[III)V")
    public class591(class125 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class85.field1472, class343.field4922, arg1 * arg2, arg3);
        this.field8394 = arg2;
        this.field8390 = arg1;
        super.field2405.method3577(this, true);
        if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method1141(arg2, arg1, super.field2418, 23292, arg4);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field2418, 0, 6408, this.field8390, this.field8394, 0, 32993, super.field2405.field2064, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZF)F")
    public final float method1531(boolean arg0, float arg1) {
        if (arg0) {
            return 2.0348735F;
        } else {
            ++field8399;
            return arg1 / (float) this.field8394;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZZI)V")
    public final void method1535(boolean arg0, boolean arg1, int arg2) {
        super.field2405.method3577(this, true);
        ++field8393;
        int var4 = 106 % ((59 - arg2) / 32);
        OpenGL.glTexParameteri(super.field2418, 10242, !arg0 ? 33071 : 10497);
        OpenGL.glTexParameteri(super.field2418, 10243, !arg1 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "(I)Z")
    public final boolean method1536(int arg0) {
        if (arg0 != -5845) {
            this.method1535(false, true, 101);
        }
        ++field8400;
        return true;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Llh;Lkl;Lvt;II)V")
    public class591(class125 arg0, class468 arg1, class343 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field8394 = arg4;
        this.field8390 = arg3;
        super.field2405.method3577(this, true);
        OpenGL.glTexImage2Dub(super.field2418, 0, this.method1140((byte) 124), arg3, arg4, 0, class387.method2348(super.field2417, (byte) -128), class416.method2509(super.field2406, 126), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IF)F")
    public final float method1532(int arg0, float arg1) {
        if (arg0 != -8221) {
            this.field8394 = -22;
        }
        ++field8391;
        return arg1 / (float) this.field8390;
    }

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "(I)V")
    public static void method3383(int arg0) {
        field8401 = null;
        if (arg0 != 5121) {
            field8389 = null;
        }
        field8389 = null;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Llh;Lkl;IIZ[BII)V")
    public class591(class125 arg0, class468 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class343.field4922, arg2 * arg3, arg4);
        this.field8394 = arg3;
        this.field8390 = arg2;
        super.field2405.method3577(this, true);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method1138(1, arg3, arg2, super.field2418, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field2418, 0, this.method1140((byte) 119), arg2, arg3, 0, class387.method2348(super.field2417, (byte) -126), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }
}
