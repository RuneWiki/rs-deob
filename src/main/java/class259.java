import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class259 extends class315 implements class309 {

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "I")
    private int field3497;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    private int field3492;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "Lme;")
    public static class668 field3494 = new class668(64);

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)I")
    public final int method1131(byte arg0) {
        ++field3491;
        int var2 = 58 % ((54 - arg0) / 62);
        return this.field3492;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([IIBIIIII)V")
    public final void method1132(int[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field4091.method3091(true, this);
        ++field3486;
        OpenGL.glPixelStorei(3314, arg7);
        OpenGL.glTexSubImage2Di(super.field4082, 0, arg5, arg1, arg3, arg4, 32993, super.field4091.field423, arg0, arg6);
        if (arg2 < 45) {
            this.method1131((byte) 81);
        }
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZZI)V")
    public final void method1133(boolean arg0, boolean arg1, int arg2) {
        ++field3493;
        super.field4091.method3091(true, this);
        OpenGL.glTexParameteri(super.field4082, 10242, arg1 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field4082, 10243, !arg0 ? 33071 : 10497);
        if (arg2 != 19263) {
            field3494 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method677(0, arg7, 0, arg6, arg0, arg8, arg2, arg5, arg1, arg3);
        ++field3499;
        if (arg4 > -107) {
            field3498 = 43;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Z")
    public final boolean method1128(int arg0) {
        ++field3489;
        if (arg0 != -9355) {
            this.method1131((byte) 34);
        }
        return true;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIILpw;[FII)V")
    public final void method1619(int arg0, int arg1, int arg2, int arg3, int arg4, class89 arg5, float[] arg6, int arg7, int arg8) {
        ++field3496;
        super.field4091.method3091(true, this);
        OpenGL.glPixelStorei(3314, arg7);
        OpenGL.glTexSubImage2Df(super.field4082, 0, arg4, arg1, arg3, arg2, class386.method2201((byte) 125, arg5), 5121, arg6, arg0);
        if (arg8 > -114) {
            method1618(50, -99, -44, 85, -20, -119, 58, 52, 14);
        }
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lia;Lpw;IIZ[FII)V")
    public class259(class27 arg0, class89 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class6.field52, arg2 * arg3, arg4);
        this.field3497 = arg3;
        this.field3492 = arg2;
        super.field4091.method3091(true, this);
        if (!arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method1844(super.field4082, arg3, arg5, arg2, (byte) -119);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field4082, 0, this.method1838((byte) 83), arg2, arg3, 0, class386.method2201((byte) 123, super.field4100), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IF)F")
    public final float method1135(int arg0, float arg1) {
        if (arg0 != 7886) {
            return 0.31851828F;
        } else {
            ++field3488;
            return arg1 / (float) this.field3492;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILpw;I[BIIIII)V")
    public final void method1129(int arg0, class89 arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3495;
        super.field4091.method3091(true, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 != 1780) {
            this.field3492 = -74;
        }
        OpenGL.glPixelStorei(3314, arg7);
        OpenGL.glTexSubImage2Dub(super.field4082, 0, arg4, arg8, arg2, arg0, class386.method2201((byte) 121, arg1), 5121, arg3, arg6);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lia;IIZ[III)V")
    public class259(class27 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class135.field1774, class6.field48, arg1 * arg2, arg3);
        this.field3497 = arg2;
        this.field3492 = arg1;
        super.field4091.method3091(true, this);
        if (arg3 && arg6 == 0 && ~arg5 == -1) {
            this.method1836(super.field4082, arg1, arg4, true, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field4082, 0, 6408, this.field3492, this.field3497, 0, 32993, super.field4091.field423, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lia;Lpw;IIZ[BII)V")
    public class259(class27 arg0, class89 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class6.field48, arg2 * arg3, arg4);
        this.field3492 = arg2;
        this.field3497 = arg3;
        super.field4091.method3091(true, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method1840(arg2, arg3, -84, super.field4082, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field4082, 0, this.method1838((byte) 83), arg2, arg3, 0, class386.method2201((byte) 122, super.field4100), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "(I)V")
    public static void method1620(int arg0) {
        field3494 = null;
        if (arg0 <= 15) {
            method1620(-9);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)I")
    public final int method1130(byte arg0) {
        if (arg0 != -91) {
            return -126;
        } else {
            ++field3485;
            return this.field3497;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lia;Lpw;Llj;II)V")
    public class259(class27 arg0, class89 arg1, class6 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field3492 = arg3;
        this.field3497 = arg4;
        super.field4091.method3091(true, this);
        OpenGL.glTexImage2Dub(super.field4082, 0, this.method1838((byte) 83), arg3, arg4, 0, class386.method2201((byte) 121, super.field4100), class223.method1411((byte) 87, super.field4083), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(FB)F")
    public final float method1136(float arg0, byte arg1) {
        if (arg1 > -94) {
            this.field3492 = -17;
        }
        ++field3487;
        return arg0 / (float) this.field3497;
    }
}
