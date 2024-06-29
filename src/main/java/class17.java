import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class17 {

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "Lqn;")
    public static class47 field259;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(CI)V")
    public final void method149(char arg0, int arg1) {
        field257++;
        if (arg1 != 4864) {
            field256 = 124;
        }
        OpenGL.glCallList(this.field258 + arg0);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V")
    public final void method150(byte arg0) {
        if (arg0 < 93) {
            field259 = null;
        }
        OpenGL.glEndList();
        field254++;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
    public static void method151(int arg0) {
        field259 = null;
        if (arg0 != -12299) {
            field259 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BI)V")
    public final void method152(byte arg0, int arg1) {
        OpenGL.glNewList(this.field258 + arg1, 4864);
        field255++;
        if (arg0 != 63) {
            field259 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lug;I)V")
    public class17(class395 arg0, int arg1) {
        this.field258 = OpenGL.glGenLists(arg1);
    }
}
