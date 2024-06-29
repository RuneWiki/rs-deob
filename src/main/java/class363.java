import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class363 extends class487 {

    @OriginalMember(owner = "client!br", name = "D", descriptor = "I")
    private int field5397;

    @OriginalMember(owner = "client!br", name = "v", descriptor = "I")
    public static int field5389 = 0;

    @OriginalMember(owner = "client!br", name = "z", descriptor = "[I")
    public static int[] field5393 = new int[2048];

    @OriginalMember(owner = "client!br", name = "B", descriptor = "I")
    public static int field5395 = -1;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "I")
    public static int field5387 = 0;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!br", name = "w", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!br", name = "x", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!br", name = "y", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!br", name = "C", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!br", name = "A", descriptor = "Lla;")
    public static class421 field5394;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(B)V")
    public static final void method2309(byte arg0) {
        ++field5388;
        if (arg0 != 110) {
            method2311(-65);
        }
        class462.field6574 = null;
        class531.method3086(-1, class361.field5368, 0, class310.field4626, (byte) 126, 0, 0, 0, class506.field7173);
        if (class462.field6574 != null) {
            class623.method3552(class61.field1382, class617.field8960.field7623, class310.field4626, 0, -64, class506.field7173, -1412584499, class462.field6574, class416.field6021, 0);
            class462.field6574 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ZI)V")
    public final void method2310(boolean arg0, int arg1) {
        ++field5392;
        super.field6977.method5(3845, this);
        OpenGL.glTexParameteri(super.field6979, arg1, arg0 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!br", name = "f", descriptor = "(I)V")
    public static void method2311(int arg0) {
        field5394 = null;
        field5393 = null;
        if (arg0 != 0) {
            method2311(-34);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
    public final void method1612(int arg0) {
        if (arg0 < 114) {
            this.method1612(-59);
        }
        ++field5391;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lus;II[BI)V")
    public class363(class1 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field5397 = arg2;
        super.field6977.method5(3845, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field6979, 0, super.field6971, this.field5397, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2939(true, (byte) -69);
    }
}
