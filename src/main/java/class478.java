import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class478 extends class48 implements class191 {

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    private int field6558;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
    private int field6560;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    private int field6557;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "Lkaa;")
    public static class47 field6556 = new class47(46, 3);

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "Lkaa;")
    public static class47 field6559 = new class47(7, 3);

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "Lfi;")
    public static class557 field6562;

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Llaa;Lqda;III[B)V", line = 7)
    public class478(class122 arg0, class105 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class408.field5668, arg2 * arg4 * arg3, false);
        this.field6558 = arg3;
        this.field6560 = arg2;
        this.field6557 = arg4;
        super.field602.method823(this, -8423);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field618, 0, this.method342(true), this.field6560, this.field6558, this.field6557, 0, class711.method3993(super.field626, true), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZII)Z", line = 22)
    public static final boolean method2694(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field6562 = null;
        }
        ++field6561;
        return ~(arg2 & 2048) != -1 && (55 & arg1) != 0;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V", line = 42)
    public static void method2695(int arg0) {
        field6559 = null;
        if (arg0 != 3317) {
            method2694(false, 100, 127);
        }
        field6562 = null;
        field6556 = null;
    }
}
