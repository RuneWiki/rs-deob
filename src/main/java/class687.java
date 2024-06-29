import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class687 extends class396 {

    @OriginalMember(owner = "client!gw", name = "x", descriptor = "I")
    private int field9632;

    @OriginalMember(owner = "client!gw", name = "B", descriptor = "Lqk;")
    public static class148 field9636 = new class148(0, -1);

    @OriginalMember(owner = "client!gw", name = "v", descriptor = "I")
    public static int field9630;

    @OriginalMember(owner = "client!gw", name = "w", descriptor = "I")
    public static int field9631;

    @OriginalMember(owner = "client!gw", name = "y", descriptor = "I")
    public static int field9633;

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!gw", name = "A", descriptor = "I")
    public static int field9635;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(IZ)V")
    public final void method3915(int arg0, boolean arg1) {
        ++field9635;
        if (arg0 == -5697) {
            super.field5514.method2154(this, -2);
            OpenGL.glTexParameteri(super.field5510, 10242, !arg1 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
    public final void method527(int arg0) {
        if (arg0 >= 123) {
            ++field9630;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)I")
    public static final int method3916(int arg0, int arg1) {
        ++field9631;
        return arg1 >= -49 ? 49 : arg0 >>> 10;
    }

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "(I)V")
    public static void method3917(int arg0) {
        field9636 = null;
        if (arg0 != -24224) {
            method3916(-16, 87);
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lep;II[BI)V")
    public class687(class371 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field9632 = arg2;
        super.field5514.method2154(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field5510, 0, super.field5509, this.field9632, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2419(true, true);
    }
}
