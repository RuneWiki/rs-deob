import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class671 extends class195 {

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
    private int field9363;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public static int field9360 = 0;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "Ljt;")
    public static class106 field9364 = new class106(260);

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "F")
    public static float field9365;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    public static int field9359;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "Ljda;")
    public static class227 field9358;

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lwh;II[BI)V")
    public class671(class148 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field9363 = arg2;
        super.field2967.method1088(this, -27749);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field2957, 0, super.field2956, this.field9363, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1362(true, 1287);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BZ)V")
    public final void method3840(byte arg0, boolean arg1) {
        ++field9359;
        if (arg0 != 0) {
            method3841(-77);
        }
        super.field2967.method1088(this, -27749);
        OpenGL.glTexParameteri(super.field2957, 10242, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public final void method106(int arg0) {
        if (arg0 >= 14) {
            ++field9362;
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
    public static void method3841(int arg0) {
        field9364 = null;
        field9358 = null;
        if (arg0 != 3317) {
            method3841(33);
        }
    }
}
