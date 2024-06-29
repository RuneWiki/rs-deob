import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class78 {

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    private int field883;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "Ljd;")
    public static class241 field888;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "Lji;")
    public static class635 field886;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZC)V", line = 6)
    public final void method606(boolean arg0, char arg1) {
        OpenGL.glCallList(this.field883 + arg1);
        field887++;
        if (!arg0) {
            this.method607(29, true);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)V", line = 23)
    public final void method607(int arg0, boolean arg1) {
        OpenGL.glNewList(this.field883 + arg0, 4864);
        field884++;
        if (arg1) {
            this.method608(true);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V", line = 35)
    public final void method608(boolean arg0) {
        field885++;
        OpenGL.glEndList();
        if (arg0) {
            this.field883 = 86;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 46)
    public static void method609(byte arg0) {
        field886 = null;
        field888 = null;
        if (arg0 != -79) {
            field886 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lqfa;I)V", line = 57)
    public class78(class106 arg0, int arg1) {
        this.field883 = OpenGL.glGenLists(arg1);
    }
}
