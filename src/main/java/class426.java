import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class426 {

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    private int field6405;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "Z")
    public static boolean field6406 = true;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "Lvv;")
    public static class313 field6403 = new class313(56, 14);

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public static int field6409 = -1;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    public static int field6410 = 0;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "Lvv;")
    public static class313 field6407 = new class313(64, 12);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public final void method2601(byte arg0) {
        OpenGL.glEndList();
        field6404++;
        if (arg0 != 122) {
            this.field6405 = -89;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static void method2602(int arg0) {
        field6403 = null;
        field6407 = null;
        if (arg0 != 14) {
            method2602(-42);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(CI)V")
    public final void method2603(char arg0, int arg1) {
        if (arg1 != -17213) {
            field6406 = true;
        }
        OpenGL.glCallList(this.field6405 + arg0);
        field6402++;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
    public final void method2604(int arg0, int arg1) {
        field6401++;
        if (arg0 != 14) {
            field6407 = null;
        }
        OpenGL.glNewList(this.field6405 + arg1, 4864);
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lih;I)V")
    public class426(class214 arg0, int arg1) {
        this.field6405 = OpenGL.glGenLists(arg1);
    }
}
