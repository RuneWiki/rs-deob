import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class31 {

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lmc;")
    public static class114 field508 = null;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[J")
    public static long[] field505 = new long[32];

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lqb;")
    public static class189 field506;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(CZ)V")
    public final void method317(char arg0, boolean arg1) {
        field504++;
        if (arg1) {
            OpenGL.glCallList(this.field510 + arg0);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method318(int arg0) {
        field505 = null;
        field506 = null;
        if (arg0 < 121) {
            field505 = null;
        }
        field508 = null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method319(int arg0) {
        if (arg0 != 13288) {
            method319(11);
        }
        field503++;
        return class483.field6820 || class401.field5717 == null ? "" : class401.field5717.field6295;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
    public final void method320(int arg0, int arg1) {
        OpenGL.glNewList(this.field510 + arg1, 4864);
        if (arg0 != -28457) {
            method318(77);
        }
        field509++;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public final void method321(int arg0) {
        if (arg0 == 2) {
            OpenGL.glEndList();
            field511++;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIZ)V")
    public static final void method322(int arg0, int arg1, boolean arg2) {
        field507++;
        if (class147.field2265 == 1) {
            class402.method2403((byte) 60, arg0, arg1, class296.field4056);
        } else if (class147.field2265 == 2) {
            class86.method645(arg1, arg0, 16);
        }
        class147.field2265 = 0;
        if (arg2) {
            field508 = null;
        }
        class296.field4056 = null;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lgi;I)V")
    public class31(class583 arg0, int arg1) {
        this.field510 = OpenGL.glGenLists(arg1);
    }
}
