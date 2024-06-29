import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class68 {

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    private int field1034;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "[Z")
    public static boolean[] field1029 = new boolean[200];

    @OriginalMember(owner = "client!u", name = "i", descriptor = "[I")
    public static int[] field1036 = new int[14];

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lrq;")
    public static class325 field1033 = class683.method3805((byte) -111);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Lbi;")
    public static class449 field1035;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BC)V")
    public final void method536(byte arg0, char arg1) {
        OpenGL.glCallList(this.field1034 + arg1);
        field1031++;
        if (arg0 <= 111) {
            method538(-60);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V")
    public final void method537(int arg0, byte arg1) {
        field1030++;
        OpenGL.glNewList(this.field1034 + arg0, 4864);
        if (arg1 != 3) {
            field1029 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method538(int arg0) {
        if (arg0 < -4) {
            field1035 = null;
            field1033 = null;
            field1029 = null;
            field1036 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
    public final void method539(boolean arg0) {
        if (!arg0) {
            this.method539(true);
        }
        OpenGL.glEndList();
        field1028++;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lno;I)V")
    public class68(class658 arg0, int arg1) {
        this.field1034 = OpenGL.glGenLists(arg1);
    }
}
