import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class231 {

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    private int field3687;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "[Lcca;")
    public static class226[] field3683 = new class226[0];

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field3688 = 1339;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3686;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(CI)V", line = 4)
    public final void method1687(char arg0, int arg1) {
        field3684++;
        if (arg1 != 4864) {
            field3688 = 36;
        }
        OpenGL.glCallList(this.field3687 + arg0);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V", line = 16)
    public static void method1688(int arg0) {
        if (arg0 != 0) {
            field3683 = null;
        }
        field3683 = null;
        field3686 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V", line = 30)
    public final void method1689(int arg0, int arg1) {
        OpenGL.glNewList(this.field3687 + arg1, 4864);
        if (arg0 == -31885) {
            field3685++;
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Ler;I)V", line = 48)
    public class231(class92 arg0, int arg1) {
        this.field3687 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V", line = 63)
    public final void method1690(int arg0) {
        field3682++;
        OpenGL.glEndList();
        int var2 = 29 / ((arg0 + 64) / 51);
    }
}
