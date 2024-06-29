import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class630 {

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    private int field9218;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field9219 = -1;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field9216;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field9220;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "Lae;")
    public static class40 field9215;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(CZ)V")
    public final void method3670(char arg0, boolean arg1) {
        field9217++;
        OpenGL.glCallList(this.field9218 + arg0);
        if (arg1) {
            this.field9218 = 110;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZZ)Z")
    public static boolean method3671(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method3672(int arg0) {
        if (arg0 >= -5) {
            method3672(-65);
        }
        field9215 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
    public final void method3673(int arg0, int arg1) {
        field9220++;
        OpenGL.glNewList(this.field9218 + arg0, 4864);
        if (arg1 != -1) {
            method3672(32);
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Los;I)V")
    public class630(class468 arg0, int arg1) {
        this.field9218 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    public final void method3674(boolean arg0) {
        field9216++;
        if (!arg0) {
            this.field9218 = 88;
        }
        OpenGL.glEndList();
    }
}
