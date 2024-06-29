import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class257 extends class569 implements class65 {

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    private int field3935;

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "I")
    private int field3926;

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!ao", name = "D", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!ao", name = "E", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "Z")
    public static boolean field3928;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(FI)F")
    public final float method661(float arg0, int arg1) {
        int var3 = -22 % ((arg1 - -11) / 60);
        ++field3934;
        return arg0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBIII[III)V")
    public final void method667(int arg0, byte arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        super.field8007.method2337(false, this);
        if (arg4 == 0) {
            arg4 = arg0;
        }
        if (arg1 != -64) {
            field3928 = true;
        }
        ++field3936;
        if (~arg0 != ~arg4) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Di(super.field8011, 0, arg2, arg6, arg0, arg7, 32993, super.field8007.field4441, arg5, arg3);
        if (~arg0 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)Z")
    public final boolean method662(boolean arg0) {
        ++field3932;
        if (arg0) {
            this.method666(true, -0.3445652F);
        }
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)[Lgi;")
    public static final class630[] method1709(int arg0) {
        ++field3930;
        int var1 = -12 % ((29 - arg0) / 35);
        return new class630[] { class104.field1620, class532.field7462, class188.field2712 };
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Llca;IIZIIII[B)V")
    public final void method664(class597 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        super.field8007.method2337(false, this);
        if (~arg1 == -1) {
            arg1 = arg7;
        }
        ++field3933;
        if (!arg3) {
            this.field3926 = -90;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (~arg1 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Dub(super.field8011, 0, arg5, arg4, arg7, arg2, class351.method2159(arg0, (byte) 123), 5121, arg8, arg6);
        if (arg1 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(Z)I")
    public final int method665(boolean arg0) {
        ++field3927;
        return arg0 ? -97 : this.field3926;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lhp;Llca;Lig;II)V")
    public class257(class296 arg0, class597 arg1, class218 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field3935 = arg4;
        this.field3926 = arg3;
        super.field8007.method2337(false, this);
        OpenGL.glTexImage2Dub(super.field8011, 0, this.method3235((byte) 61), arg3, arg4, 0, class351.method2159(super.field8018, (byte) 112), class266.method1742((byte) 123, super.field8028), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)I")
    public final int method668(int arg0) {
        if (arg0 != 31607) {
            this.field3935 = 113;
        }
        ++field3931;
        return this.field3935;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lhp;Llca;II[FII)V")
    public class257(class296 arg0, class597 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class218.field3054, arg2 * arg3, false);
        this.field3926 = arg2;
        this.field3935 = arg3;
        super.field8007.method2337(false, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field8011, 0, this.method3235((byte) 61), arg2, arg3, 0, class351.method2159(super.field8018, (byte) 54), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZF)F")
    public final float method666(boolean arg0, float arg1) {
        if (!arg0) {
            return -0.33752993F;
        } else {
            ++field3937;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lhp;Llca;II[BII)V")
    public class257(class296 arg0, class597 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class218.field3050, arg2 * arg3, false);
        this.field3935 = arg3;
        this.field3926 = arg2;
        super.field8007.method2337(false, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field8011, 0, this.method3235((byte) 61), arg2, arg3, 0, class351.method2159(super.field8018, (byte) 67), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BZZ)V")
    public final void method663(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 == -102) {
            ++field3929;
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lhp;II[III)V")
    public class257(class296 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class75.field1306, class218.field3050, arg1 * arg2, false);
        this.field3935 = arg2;
        this.field3926 = arg1;
        super.field8007.method2337(false, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field8011, 0, 6408, this.field3926, this.field3935, 0, 32993, super.field8007.field4441, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }
}
