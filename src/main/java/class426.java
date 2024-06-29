import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class426 extends class418 {

    @OriginalMember(owner = "client!eaa", name = "A", descriptor = "I")
    private int field6054;

    @OriginalMember(owner = "client!eaa", name = "v", descriptor = "Lcba;")
    public static class471 field6049 = new class471(109, -1);

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "I")
    public static int field6053 = 0;

    @OriginalMember(owner = "client!eaa", name = "y", descriptor = "Lcba;")
    public static class471 field6052 = new class471(6, -2);

    @OriginalMember(owner = "client!eaa", name = "C", descriptor = "I")
    public static int field6056 = 0;

    @OriginalMember(owner = "client!eaa", name = "w", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!eaa", name = "x", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!eaa", name = "B", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)V")
    public static void method2535(int arg0) {
        field6052 = null;
        field6049 = null;
        if (arg0 != 0) {
            field6056 = 75;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lgi;II[BI)V")
    public class426(class583 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field6054 = arg2;
        super.field5883.method3358(32886, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field5882, 0, super.field5889, this.field6054, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2513(false, true);
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(ZZ)V")
    public final void method2536(boolean arg0, boolean arg1) {
        if (arg0) {
            this.method2536(true, true);
        }
        ++field6050;
        super.field5883.method3358(32886, this);
        OpenGL.glTexParameteri(super.field5882, 10242, !arg1 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V")
    public final void method1220(byte arg0) {
        if (arg0 != 73) {
            method2535(-101);
        }
        ++field6051;
    }
}
