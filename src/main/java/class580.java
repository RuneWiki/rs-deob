import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class580 extends class615 {

    @OriginalMember(owner = "client!gs", name = "u", descriptor = "I")
    private int field8119;

    @OriginalMember(owner = "client!gs", name = "v", descriptor = "Lfca;")
    public static class139 field8120 = new class139();

    @OriginalMember(owner = "client!gs", name = "y", descriptor = "F")
    public static float field8123;

    @OriginalMember(owner = "client!gs", name = "s", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!gs", name = "t", descriptor = "I")
    public static int field8118;

    @OriginalMember(owner = "client!gs", name = "w", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!gs", name = "x", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "(I)V", line = 5)
    public static void method3200(int arg0) {
        if (arg0 != 3317) {
            method3201(61);
        }
        field8120 = null;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lqj;II[BI)V", line = 15)
    public class580(class548 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field8119 = arg2;
        super.field8644.method2960(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field8638, 0, super.field8640, this.field8119, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3396(true, 17137);
    }

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)Z", line = 32)
    public static final boolean method3201(int arg0) {
        if (arg0 != 0) {
            method3201(-21);
        }
        ++field8118;
        return class463.field5904 > 0;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V", line = 45)
    public final void method216(int arg0) {
        if (arg0 != 29468) {
            method3200(-57);
        }
        ++field8121;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)Z", line = 60)
    public static final boolean method3202(int arg0, int arg1) {
        if (arg1 != 0) {
            field8123 = -0.52573466F;
        }
        ++field8122;
        return arg0 == 3 || ~arg0 == -5 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IZ)V", line = 72)
    public final void method3203(int arg0, boolean arg1) {
        super.field8644.method2960(this, -2);
        if (arg0 < -35) {
            ++field8117;
            OpenGL.glTexParameteri(super.field8638, 10242, arg1 ? 10497 : 33071);
        }
    }
}
