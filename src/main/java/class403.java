import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class403 {

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    private int field5868;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field5863 = -1;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "[B")
    public static byte[] field5865 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)V")
    public final void method2390(int arg0, int arg1) {
        if (arg1 != -32245) {
            this.method2392((byte) -111, '\u0013');
        }
        OpenGL.glNewList(this.field5868 + arg0, 4864);
        field5866++;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
    public final void method2391(int arg0) {
        OpenGL.glEndList();
        if (arg0 > -55) {
            this.field5868 = 78;
        }
        field5867++;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BC)V")
    public final void method2392(byte arg0, char arg1) {
        if (arg0 == 0) {
            field5864++;
            OpenGL.glCallList(this.field5868 + arg1);
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
    public static void method2393(int arg0) {
        field5865 = null;
        if (arg0 >= -115) {
            field5863 = 56;
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lbl;I)V")
    public class403(class442 arg0, int arg1) {
        this.field5868 = OpenGL.glGenLists(arg1);
    }
}
