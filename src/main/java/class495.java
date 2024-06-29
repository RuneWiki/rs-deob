import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class495 extends class591 {

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
    private int field6818;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "Z")
    public static boolean field6815 = false;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field6814 = -1;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public static int field6819 = 0;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "Lfc;")
    public static class235 field6820 = new class235(11, 2);

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "[Luea;")
    public static class286[] field6821 = new class286[2048];

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BZ)V", line = 3)
    public final void method2767(byte arg0, boolean arg1) {
        if (arg0 != -37) {
            method2769(68);
        }
        ++field6817;
        super.field8237.method1804(false, this);
        OpenGL.glTexParameteri(super.field8241, 10242, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)[Lfw;", line = 16)
    public static final class52[] method2768(byte arg0) {
        if (arg0 > -8) {
            method2768((byte) 123);
        }
        ++field6813;
        return new class52[] { class385.field5384, class345.field4986, class546.field7400 };
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 33)
    public final void method1953(int arg0) {
        ++field6816;
        if (arg0 != -1) {
            this.method1953(-38);
        }
    }

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "(I)V", line = 46)
    public static void method2769(int arg0) {
        field6821 = null;
        if (arg0 > 0) {
            field6820 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Len;II[BI)V", line = 63)
    public class495(class289 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field6818 = arg2;
        super.field8237.method1804(false, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field8241, 0, super.field8226, this.field6818, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3288(0, true);
    }
}
