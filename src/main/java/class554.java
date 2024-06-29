import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class554 extends class539 {

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    private int field7668 = -1;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    private int field7673 = -1;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public int field7672;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public int field7676;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public int field7669;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "Ljn;")
    public static class134 field7674 = new class134(74, -2);

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "Liga;")
    public static class91 field7678 = new class91(7, 7);

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field7679 = new String[100];

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "Lok;")
    public static class255 field7677;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "[Lfm;")
    public static class279[] field7680;

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lpq;IIII)V")
    public class554(class194 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field7672 = arg2;
        this.field7676 = arg4;
        this.field7669 = arg3;
        super.field7457.method1219((byte) 92, this);
        OpenGL.glTexImage3Dub(super.field7453, 0, super.field7461, this.field7672, this.field7669, this.field7676, 0, class648.method3717(super.field7461, false), 5121, (byte[]) null, 0);
        this.method3201(true, true);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lpq;IIII[BI)V")
    public class554(class194 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field7669 = arg3;
        this.field7676 = arg4;
        this.field7672 = arg2;
        super.field7457.method1219((byte) 70, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field7453, 0, super.field7461, this.field7672, this.field7669, this.field7676, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3201(true, true);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIZI)V")
    public final void method3261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        ++field7671;
        super.field7457.method1219((byte) 105, this);
        if (arg6) {
            this.method1737(-29);
        }
        OpenGL.glCopyTexSubImage3D(super.field7453, 0, arg1, arg0, arg2, arg4, arg5, arg7, arg3);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method3262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -10796) {
            return true;
        } else {
            ++field7675;
            int var7 = arg5 - -arg6;
            int var8 = arg0 - -arg2;
            int var9 = arg3 - -arg1;
            if (!class351.method2215(arg3, -99, arg5, arg5, var8, var7, var8, var8, var9, var9)) {
                return false;
            } else if (!class351.method2215(arg3, 107, arg5, var7, var8, var7, var8, var8, var9, arg3)) {
                return false;
            } else {
                if (~arg5 <= ~class722.field9958) {
                    if (!class351.method2215(var9, 81, var7, var7, arg0, var7, var8, var8, var9, arg3)) {
                        return false;
                    }
                    if (!class351.method2215(var9, 64, var7, var7, arg0, var7, arg0, var8, arg3, arg3)) {
                        return false;
                    }
                } else {
                    if (!class351.method2215(var9, 112, arg5, arg5, arg0, arg5, var8, var8, var9, arg3)) {
                        return false;
                    }
                    if (!class351.method2215(var9, 83, arg5, arg5, arg0, arg5, arg0, var8, arg3, arg3)) {
                        return false;
                    }
                }
                if (~arg3 <= ~class537.field7427) {
                    if (!class351.method2215(var9, arg4 ^ -10870, arg5, arg5, arg0, var7, var8, var8, var9, var9)) {
                        return false;
                    }
                    if (!class351.method2215(var9, arg4 ^ -10836, arg5, var7, arg0, var7, arg0, var8, var9, var9)) {
                        return false;
                    }
                } else {
                    if (!class351.method2215(arg3, arg4 + 10699, arg5, arg5, arg0, var7, var8, var8, arg3, arg3)) {
                        return false;
                    }
                    if (!class351.method2215(arg3, -116, arg5, var7, arg0, var7, arg0, var8, arg3, arg3)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
    public static void method3263(int arg0) {
        field7678 = null;
        field7677 = null;
        if (arg0 != -10189) {
            method3263(80);
        }
        field7674 = null;
        field7679 = null;
        field7680 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public final void method1737(int arg0) {
        ++field7670;
        OpenGL.glFramebufferTexture3DEXT(this.field7673, this.field7668, super.field7453, arg0, 0, 0);
        this.field7668 = -1;
        this.field7673 = -1;
    }
}
