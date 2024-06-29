import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class514 extends class245 implements class51 {

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    private int field7170;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    private int field7180;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "Lbh;")
    public static class538 field7178 = new class538(8);

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field7179 = 104;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "Loq;")
    public static class742 field7181;

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lsb;Lkea;II[BII)V")
    public class514(class93 arg0, class77 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class720.field10164, arg2 * arg3, false);
        this.field7170 = arg3;
        this.field7180 = arg2;
        super.field3397.method2933((byte) -48, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field3406, 0, this.method1554(-103), arg2, arg3, 0, class185.method1243(-12, super.field3410), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIBII[II)V")
    public final void method349(int arg0, int arg1, byte arg2, int arg3, int arg4, int[] arg5, int arg6) {
        ++field7176;
        int[] var8 = new int[this.field7180 * this.field7170];
        super.field3397.method2933((byte) 90, this);
        OpenGL.glGetTexImagei(super.field3406, 0, 32993, 5121, var8, 0);
        if (arg2 <= 90) {
            field7182 = -34;
        }
        for (int var9 = 0; ~arg0 < ~var9; ++var9) {
            class34.method244(var8, (arg0 + arg3 + -1 + -var9) * this.field7180, arg5, arg1 * var9 + arg6, arg1);
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lsb;Lkea;Lkf;II)V")
    public class514(class93 arg0, class77 arg1, class720 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field7180 = arg3;
        this.field7170 = arg4;
        super.field3397.method2933((byte) -61, this);
        OpenGL.glTexImage2Dub(super.field3406, 0, this.method1554(-111), arg3, arg4, 0, class185.method1243(13, super.field3410), class615.method3614(super.field3422, 5121), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BF)F")
    public final float method353(byte arg0, float arg1) {
        if (arg0 <= 90) {
            this.method355(true, (byte) 45, true);
        }
        ++field7169;
        return arg1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)I")
    public final int method351(boolean arg0) {
        ++field7174;
        return arg0 ? -76 : this.field7180;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Z")
    public final boolean method348(byte arg0) {
        ++field7173;
        return arg0 != 117;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([BILkea;IIIIII)V")
    public final void method352(byte[] arg0, int arg1, class77 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 != 16288) {
            field7182 = 12;
        }
        if (arg5 == 0) {
            arg5 = arg6;
        }
        ++field7168;
        super.field3397.method2933((byte) -47, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 != arg6) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        OpenGL.glTexSubImage2Dub(super.field3406, 0, arg1, arg3, arg6, arg8, class185.method1243(arg7 + -16394, arg2), 5121, arg0, arg4);
        if (~arg5 != ~arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lsb;Lkea;II[FII)V")
    public class514(class93 arg0, class77 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class720.field10168, arg2 * arg3, false);
        this.field7170 = arg3;
        this.field7180 = arg2;
        super.field3397.method2933((byte) -33, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field3406, 0, this.method1554(-115), arg2, arg3, 0, class185.method1243(1, super.field3410), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIII[II)V")
    public final void method347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        ++field7175;
        super.field3397.method2933((byte) 106, this);
        if (arg1 == 0) {
            arg1 = arg5;
        }
        if (~arg1 != ~arg5) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Di(super.field3406, 0, arg0, arg2, arg5, arg7, 32993, super.field3397.field1362, arg6, arg4);
        if (arg1 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg3 != -2668) {
            this.method349(126, 41, (byte) 47, 65, -91, (int[]) null, 111);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IF)F")
    public final float method354(int arg0, float arg1) {
        ++field7177;
        return arg0 != -23477 ? -0.7342964F : arg1;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lsb;II[III)V")
    public class514(class93 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class4.field10, class720.field10164, arg1 * arg2, false);
        this.field7180 = arg1;
        this.field7170 = arg2;
        super.field3397.method2933((byte) -112, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field3406, 0, 6408, this.field7180, this.field7170, 0, 32993, super.field3397.field1362, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)I")
    public final int method350(int arg0) {
        ++field7172;
        if (arg0 > -57) {
            this.method352((byte[]) null, -41, (class77) null, 110, 85, -16, -16, -74, 92);
        }
        return this.field7170;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZBZ)V")
    public final void method355(boolean arg0, byte arg1, boolean arg2) {
        ++field7171;
        if (arg1 > -99) {
            method3067((byte) 41);
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
    public static void method3067(byte arg0) {
        field7178 = null;
        field7181 = null;
        if (arg0 >= -126) {
            field7179 = -74;
        }
    }
}
