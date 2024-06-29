import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class229 {

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    private int field3253;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Liv;")
    public static class64 field3252 = new class64(65, 7);

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lpi;")
    public static class342 field3258 = new class342("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lbu;Lbu;I)V")
    public static final void method1491(class17 arg0, class17 arg1, int arg2) {
        if (arg2 == -30698) {
            field3254++;
            class92.field1577 = arg1;
            class51.field916 = arg0;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1492(int arg0) {
        if (arg0 != 7) {
            method1492(-64);
        }
        field3258 = null;
        field3252 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public final void method1493(byte arg0) {
        OpenGL.glEndList();
        if (arg0 >= -89) {
            method1492(125);
        }
        field3257++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZ)V")
    public final void method1494(char arg0, boolean arg1) {
        OpenGL.glCallList(this.field3253 + arg0);
        if (!arg1) {
            field3256++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lvj;I)V")
    public class229(class303 arg0, int arg1) {
        this.field3253 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)V")
    public final void method1495(int arg0, byte arg1) {
        field3255++;
        if (arg1 != -115) {
            this.field3253 = -14;
        }
        OpenGL.glNewList(this.field3253 + arg0, 4864);
    }
}
