import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class371 extends class210 {

    @OriginalMember(owner = "client!wu", name = "B", descriptor = "I")
    private int field5221;

    @OriginalMember(owner = "client!wu", name = "C", descriptor = "Ljb;")
    public static class493 field5222 = null;

    @OriginalMember(owner = "client!wu", name = "A", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!wu", name = "D", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!wu", name = "y", descriptor = "Lwk;")
    public static class141 field5218;

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "Lmb;")
    public static class261 field5219;

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Leea;II[BI)V")
    public class371(class131 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field5221 = arg2;
        super.field2761.method926(this, 39);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field2781, 0, super.field2776, this.field5221, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1297(true, false);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
    public final void method1299(int arg0) {
        ++field5223;
        if (arg0 >= -38) {
            method2347((byte) 71);
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(ZZ)V")
    public final void method2346(boolean arg0, boolean arg1) {
        ++field5220;
        super.field2761.method926(this, 88);
        OpenGL.glTexParameteri(super.field2781, 10242, !arg0 ? 33071 : 10497);
        if (arg1) {
            field5222 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
    public static void method2347(byte arg0) {
        field5222 = null;
        if (arg0 != 70) {
            method2347((byte) -25);
        }
        field5218 = null;
        field5219 = null;
    }
}
