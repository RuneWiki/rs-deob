import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class554 {

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    private int field7250;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "[[I")
    public static int[][] field7252;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public final void method2969(byte arg0) {
        int var2 = -7 % ((13 - arg0) / 38);
        OpenGL.glEndList();
        field7253++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static void method2970(int arg0) {
        field7252 = null;
        if (arg0 != -1) {
            method2970(-37);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
    public final void method2971(int arg0, int arg1) {
        OpenGL.glNewList(this.field7250 + arg0, arg1);
        field7254++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BII)Z")
    public static final boolean method2972(byte arg0, int arg1, int arg2) {
        field7251++;
        if (arg0 < 71) {
            field7252 = null;
        }
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lji;I)V")
    public class554(class622 arg0, int arg1) {
        this.field7250 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IC)V")
    public final void method2973(int arg0, char arg1) {
        OpenGL.glCallList(this.field7250 + arg1);
        field7249++;
        if (arg0 != 26497) {
            field7252 = null;
        }
    }
}
