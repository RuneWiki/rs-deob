import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class619 extends class222 {

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    private int field8741;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "[I")
    public static int[] field8733 = new int[4096];

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "Lnu;")
    public static class324 field8735;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Z")
    public static final boolean method3499(int arg0, int arg1, int arg2) {
        ++field8738;
        if (arg2 != 30191) {
            field8734 = 84;
        }
        return (65536 & arg0) != 0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZZ)V")
    public final void method3500(boolean arg0, boolean arg1) {
        ++field8742;
        super.field3332.method648(97, this);
        OpenGL.glTexParameteri(super.field3347, 10242, !arg0 ? 33071 : 10497);
        if (arg1) {
            this.field8741 = -70;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method3501(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        class276.method1778(arg1, arg8, arg7, arg6, 0, arg0, arg3, arg2, arg4, -256);
        if (arg5 != -110) {
            method3501(19, 7, -95, 98, 107, (byte) -35, -37, 49, 99);
        }
        ++field8737;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V")
    public static void method3502(byte arg0) {
        if (arg0 < 122) {
            field8735 = null;
        }
        field8733 = null;
        field8735 = null;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Ljj;II[BI)V")
    public class619(class66 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field8741 = arg2;
        super.field3332.method648(-121, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field3347, 0, super.field3340, this.field8741, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1490((byte) 72, true);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public final void method1492(int arg0) {
        if (arg0 != -29948) {
            this.method1492(-21);
        }
        ++field8739;
    }
}
