import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class111 extends class169 {

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    private int field1662 = -1;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    private int field1666 = -1;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public int field1663;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public int field1664;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "Lpu;")
    public static class179 field1659 = new class179("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field1665 = 0;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ltt;IIII)V")
    public class111(class249 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field1663 = arg4;
        this.field1664 = arg2;
        this.field1661 = arg3;
        super.field2559.method1749(25752, this);
        OpenGL.glTexImage3Dub(super.field2564, 0, super.field2566, this.field1664, this.field1661, this.field1663, 0, class26.method159(super.field2566, -9640), 5121, (byte[]) null, 0);
        this.method1210((byte) -81, true);
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ltt;IIII[BI)V")
    public class111(class249 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field1664 = arg2;
        this.field1663 = arg4;
        this.field1661 = arg3;
        super.field2559.method1749(25752, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2564, 0, super.field2566, this.field1664, this.field1661, this.field1663, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1210((byte) -81, true);
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
    public static void method860(int arg0) {
        if (arg0 > -31) {
            method860(-122);
        }
        field1659 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BIIIIIII)V")
    public final void method861(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = 14 % ((4 - arg0) / 52);
        ++field1660;
        super.field2559.method1749(25752, this);
        OpenGL.glCopyTexSubImage3D(super.field2564, 0, arg1, arg3, arg2, arg5, arg4, arg6, arg7);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public final void method192(int arg0) {
        ++field1658;
        int var2 = 29 % ((-44 - arg0) / 56);
        OpenGL.glFramebufferTexture3DEXT(this.field1662, this.field1666, super.field2564, 0, 0, 0);
        this.field1662 = -1;
        this.field1666 = -1;
    }
}
