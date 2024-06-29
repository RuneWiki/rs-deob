import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class335 extends class245 implements class51 {

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
    private int field4294;

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "I")
    private int field4292;

    @OriginalMember(owner = "client!cs", name = "M", descriptor = "Lju;")
    public static class102 field4300 = new class102(37, -1);

    @OriginalMember(owner = "client!cs", name = "O", descriptor = "Z")
    public static boolean field4302 = false;

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!cs", name = "H", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!cs", name = "I", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!cs", name = "J", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!cs", name = "K", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!cs", name = "L", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!cs", name = "N", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!cs", name = "Q", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!cs", name = "P", descriptor = "Ljia;")
    public static class336 field4303;

    @OriginalMember(owner = "client!cs", name = "R", descriptor = "Lwu;")
    public static class557 field4305;

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lsb;Lkea;IIZ[BII)V", line = 3)
    public class335(class93 arg0, class77 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class720.field10164, arg2 * arg3, arg4);
        this.field4294 = arg3;
        this.field4292 = arg2;
        super.field3397.method2933((byte) 105, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method1556(super.field3406, arg5, arg2, arg3, 90);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field3406, 0, this.method1554(-126), arg2, arg3, 0, class185.method1243(-110, super.field3410), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(B)V", line = 24)
    public static void method1942(byte arg0) {
        field4300 = null;
        if (arg0 == 15) {
            field4305 = null;
            field4303 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BF)F", line = 36)
    public final float method353(byte arg0, float arg1) {
        ++field4291;
        if (arg0 <= 90) {
            this.method354(11, 0.14643948F);
        }
        return arg1 / (float) this.field4292;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZBZ)V", line = 48)
    public final void method355(boolean arg0, byte arg1, boolean arg2) {
        if (arg1 >= -99) {
            field4303 = null;
        }
        super.field3397.method2933((byte) -84, this);
        ++field4296;
        OpenGL.glTexParameteri(super.field3406, 10242, arg0 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field3406, 10243, !arg2 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lsb;Lkea;Lkf;II)V", line = 62)
    public class335(class93 arg0, class77 arg1, class720 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field4292 = arg3;
        this.field4294 = arg4;
        super.field3397.method2933((byte) -60, this);
        OpenGL.glTexImage2Dub(super.field3406, 0, this.method1554(-117), arg3, arg4, 0, class185.method1243(-109, super.field3410), class615.method3614(super.field3422, 5121), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIBII[II)V", line = 74)
    public final void method349(int arg0, int arg1, byte arg2, int arg3, int arg4, int[] arg5, int arg6) {
        ++field4293;
        int[] var8 = new int[this.field4294 * this.field4292];
        if (arg2 < 90) {
            this.method347(44, 78, 59, 123, 108, -116, (int[]) null, -7);
        }
        super.field3397.method2933((byte) 96, this);
        OpenGL.glGetTexImagei(super.field3406, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; ~var9 > ~arg0; ++var9) {
            class34.method244(var8, (-1 - var9 + arg0 + arg3) * this.field4292, arg5, arg1 * var9 + arg6, arg1);
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I", line = 97)
    public final int method350(int arg0) {
        if (arg0 > -57) {
            this.field4294 = -44;
        }
        ++field4298;
        return this.field4294;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIII[II)V", line = 108)
    public final void method347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        super.field3397.method2933((byte) -69, this);
        ++field4290;
        OpenGL.glPixelStorei(3314, arg1);
        if (arg3 != -2668) {
            field4305 = null;
        }
        OpenGL.glTexSubImage2Di(super.field3406, 0, arg0, arg2, arg5, arg7, 32993, super.field3397.field1362, arg6, arg4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZILkea;I[FIIII)V", line = 124)
    public final void method1943(boolean arg0, int arg1, class77 arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7, int arg8) {
        super.field3397.method2933((byte) -33, this);
        ++field4299;
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexSubImage2Df(super.field3406, 0, arg6, arg7, arg8, arg1, class185.method1243(30, arg2), 5121, arg4, arg3);
        OpenGL.glPixelStorei(3314, 0);
        if (!arg0) {
            field4302 = true;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)I", line = 139)
    public final int method351(boolean arg0) {
        if (arg0) {
            field4300 = null;
        }
        ++field4304;
        return this.field4292;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IF)F", line = 150)
    public final float method354(int arg0, float arg1) {
        if (arg0 != -23477) {
            this.method353((byte) -70, 0.058991622F);
        }
        ++field4295;
        return arg1 / (float) this.field4294;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)Z", line = 165)
    public final boolean method348(byte arg0) {
        ++field4297;
        if (arg0 != 117) {
            this.method348((byte) -54);
        }
        return true;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lsb;Lkea;IIZ[FII)V", line = 178)
    public class335(class93 arg0, class77 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class720.field10168, arg2 * arg3, arg4);
        this.field4294 = arg3;
        this.field4292 = arg2;
        super.field3397.method2933((byte) -81, this);
        if (!arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method1553(arg3, super.field3406, true, arg5, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field3406, 0, this.method1554(-116), arg2, arg3, 0, class185.method1243(127, super.field3410), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "([BILkea;IIIIII)V", line = 198)
    public final void method352(byte[] arg0, int arg1, class77 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4301;
        super.field3397.method2933((byte) 113, this);
        if (arg7 != 16288) {
            method1942((byte) 15);
        }
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexSubImage2Dub(super.field3406, 0, arg1, arg3, arg6, arg8, class185.method1243(90, arg2), 5121, arg0, arg4);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lsb;IIZ[III)V", line = 222)
    public class335(class93 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class4.field10, class720.field10164, arg1 * arg2, arg3);
        this.field4292 = arg1;
        this.field4294 = arg2;
        super.field3397.method2933((byte) -16, this);
        if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method1557(arg1, arg2, arg4, super.field3406, 65280);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field3406, 0, 6408, this.field4292, this.field4294, 0, 32993, super.field3397.field1362, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }
}
