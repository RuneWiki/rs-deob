import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class284 extends class245 implements class9 {

    @OriginalMember(owner = "client!wha", name = "y", descriptor = "I")
    private int field3754;

    @OriginalMember(owner = "client!wha", name = "w", descriptor = "I")
    private int field3752;

    @OriginalMember(owner = "client!wha", name = "C", descriptor = "I")
    private int field3758;

    @OriginalMember(owner = "client!wha", name = "x", descriptor = "I")
    public static int field3753 = 0;

    @OriginalMember(owner = "client!wha", name = "A", descriptor = "I")
    public static int field3756 = 0;

    @OriginalMember(owner = "client!wha", name = "E", descriptor = "Llga;")
    public static class712 field3759 = new class712(53, 3);

    @OriginalMember(owner = "client!wha", name = "z", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!wha", name = "B", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!wha", name = "F", descriptor = "[Z")
    public static boolean[] field3760;

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "(B)V", line = 5)
    public static void method1700(byte arg0) {
        if (arg0 == 0) {
            field3760 = null;
            field3759 = null;
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIIIIBI)V", line = 24)
    public static final void method1701(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 != 65) {
            method1701(-57, -60, 38, -120, -43, (byte) 53, 87);
        }
        ++field3755;
        if (~class11.field68.field5537.method750((byte) 127) != -1 && arg3 != 0 && ~class635.field8835 > -51 && ~arg2 != 0) {
            class643.field8975[class635.field8835++] = new class573((byte) 1, arg2, arg3, arg4, arg0, arg6, arg1, (class176) null);
        }
    }

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lhl;Lkt;III[B)V", line = 44)
    public class284(class529 arg0, class159 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class594.field8277, arg3 * arg4 * arg2, false);
        this.field3754 = arg3;
        this.field3752 = arg2;
        this.field3758 = arg4;
        super.field3178.method2148(this, -8);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field3184, 0, this.method1471(0), this.field3752, this.field3754, this.field3758, 0, class303.method1814(false, super.field3189), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(II)V", line = 63)
    public static final void method1702(int arg0, int arg1) {
        if (arg0 != 16953) {
            method1701(13, -128, 94, 94, 86, (byte) -31, -92);
        }
        ++field3757;
        class252 var2 = class150.method916(arg1, arg0 ^ -16994, 12);
        var2.method1497(0);
    }
}
