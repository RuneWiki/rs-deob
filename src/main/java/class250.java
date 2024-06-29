import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class250 {

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    private int field3721;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "Lqt;")
    public static class459 field3724 = new class459(44, 4);

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "F")
    public static float field3726;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)V")
    public final void method1622(int arg0, byte arg1) {
        if (arg1 == 69) {
            field3723++;
            OpenGL.glNewList(this.field3721 + arg0, 4864);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
    public static void method1623(byte arg0) {
        if (arg0 == 97) {
            field3724 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lbt;I)V")
    public class250(class33 arg0, int arg1) {
        this.field3721 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
    public final void method1624(int arg0) {
        if (arg0 != -22853) {
            field3726 = -0.35277525F;
        }
        field3725++;
        OpenGL.glEndList();
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(CB)V")
    public final void method1625(char arg0, byte arg1) {
        OpenGL.glCallList(this.field3721 + arg0);
        if (arg1 != -36) {
            field3726 = 0.4249188F;
        }
        field3722++;
    }
}
