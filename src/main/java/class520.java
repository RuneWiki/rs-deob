import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class520 extends class645 implements class60 {

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
    private int field7503;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    private int field7496;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    public static int field7494 = 0;

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "Llc;")
    public static class435 field7500 = new class435(3, -1);

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "Lufa;")
    public static class740 field7505 = new class740(6, 8);

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field7506;

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lmba;II[III)V")
    public class520(class643 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class482.field6922, class674.field9590, arg1 * arg2, false);
        this.field7503 = arg1;
        this.field7496 = arg2;
        super.field9272.method264(this, -2);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field9284, 0, 6408, this.field7503, this.field7496, 0, 32993, super.field9272.field9253, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lmba;Lkca;II[BII)V")
    public class520(class643 arg0, class755 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class674.field9590, arg2 * arg3, false);
        this.field7503 = arg2;
        this.field7496 = arg3;
        super.field9272.method264(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field9284, 0, this.method3720(9728), arg2, arg3, 0, class397.method2411(6145, super.field9283), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)I")
    public final int method563(byte arg0) {
        if (arg0 > -2) {
            field7506 = null;
        }
        ++field7493;
        return this.field7496;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)Z")
    public static final boolean method3159(int arg0, int arg1, int arg2) {
        if (arg0 != 52) {
            field7500 = null;
        }
        ++field7499;
        return (52 & arg2) != 0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lkca;[BIIIIIII)V")
    public final void method565(class755 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            arg4 = arg5;
        }
        if (arg8 != -19479) {
            this.field7496 = 117;
        }
        ++field7495;
        super.field9272.method264(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 != arg5) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Dub(super.field9284, 0, arg6, arg7, arg5, arg2, class397.method2411(6145, arg0), 5121, arg1, arg3);
        if (arg4 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Z")
    public static final boolean method3160(int arg0, int arg1) {
        ++field7497;
        if (arg1 != 10605) {
            field7494 = 86;
        }
        return ~arg0 <= -1 && ~arg0 >= -4 || arg0 == 9;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)I")
    public final int method568(int arg0) {
        ++field7489;
        if (arg0 != 22505) {
            this.method563((byte) 90);
        }
        return this.field7503;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BF)F")
    public final float method561(byte arg0, float arg1) {
        ++field7491;
        int var3 = 16 / (arg0 / 47);
        return arg1;
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
    public static void method3161(int arg0) {
        field7505 = null;
        field7506 = null;
        if (arg0 >= -113) {
            method3161(37);
        }
        field7500 = null;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lmba;Lkca;Lwq;II)V")
    public class520(class643 arg0, class755 arg1, class674 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field7496 = arg4;
        this.field7503 = arg3;
        super.field9272.method264(this, -2);
        OpenGL.glTexImage2Dub(super.field9284, 0, this.method3720(9728), arg3, arg4, 0, class397.method2411(6145, super.field9283), class523.method3182(super.field9287, -102), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)Z")
    public final boolean method566(byte arg0) {
        if (arg0 <= 0) {
            this.method568(102);
        }
        ++field7498;
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIIBIII)V")
    public final void method562(int[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        super.field9272.method264(this, -2);
        if (~arg2 == -1) {
            arg2 = arg1;
        }
        ++field7490;
        if (~arg1 != ~arg2) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        if (arg4 >= 90) {
            OpenGL.glTexSubImage2Di(super.field9284, 0, arg7, arg3, arg1, arg5, 32993, super.field9272.field9253, arg0, arg6);
            if (~arg1 != ~arg2) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lmba;Lkca;II[FII)V")
    public class520(class643 arg0, class755 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class674.field9594, arg2 * arg3, false);
        this.field7496 = arg3;
        this.field7503 = arg2;
        super.field9272.method264(this, -2);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field9284, 0, this.method3720(9728), arg2, arg3, 0, class397.method2411(6145, super.field9283), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)C")
    public static final char method3162(int arg0, byte arg1) {
        if (arg0 != -19480) {
            field7505 = null;
        }
        ++field7501;
        int var2 = 255 & arg1;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (~var2 <= -129 && ~var2 > -161) {
                char var3 = class93.field1328[var2 - 128];
                if (~var3 == -1) {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(FI)F")
    public final float method567(float arg0, int arg1) {
        ++field7504;
        return arg1 != 17714 ? -0.55688465F : arg0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZIZ)V")
    public final void method560(boolean arg0, int arg1, boolean arg2) {
        if (arg1 != 16609) {
            field7494 = -34;
        }
        ++field7492;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIIIII)V")
    public final void method564(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7502;
        if (arg3 < 13) {
            this.method561((byte) -72, 1.4533739F);
        }
        int[] var8 = new int[this.field7503 * this.field7496];
        super.field9272.method264(this, -2);
        OpenGL.glGetTexImagei(super.field9284, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; ~var9 > ~arg2; ++var9) {
            class85.method684(var8, (arg2 + -1 + arg5 + -var9) * this.field7503, arg0, arg6 - -(arg1 * var9), arg1);
        }
    }
}
