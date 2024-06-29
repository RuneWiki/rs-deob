import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class466 extends class367 {

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    private int field6277;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "Lmga;")
    public static class666 field6276 = new class666(8);

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field6279 = 0;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 9)
    public final void method773(int arg0) {
        ++field6274;
        if (arg0 != -1) {
            method2632((byte) -95);
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lno;II[BI)V", line = 19)
    public class466(class658 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field6277 = arg2;
        super.field4971.method3630(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field4968, 0, super.field4966, this.field6277, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2163(-30033, true);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 34)
    public static void method2632(byte arg0) {
        if (arg0 < 38) {
            field6276 = null;
        }
        field6276 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZB)V", line = 46)
    public final void method2633(boolean arg0, byte arg1) {
        if (arg1 != -44) {
            method2632((byte) 81);
        }
        ++field6275;
        super.field4971.method3630(this, arg1 + 42);
        OpenGL.glTexParameteri(super.field4968, 10242, !arg0 ? 33071 : 10497);
    }
}
