import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class380 extends class454 {

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    private int field5732;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Los;")
    public static class309 field5731 = new class309(2);

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "[[[I")
    public static int[][][] field5737 = new int[2][][];

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Ll;")
    public static class16 field5734;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "Llm;")
    public static class348 field5735;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)V")
    public final void method2384(int arg0, boolean arg1) {
        ++field5733;
        if (arg0 != 2) {
            this.method1031(61);
        }
        super.field6619.method1289(-19391, this);
        OpenGL.glTexParameteri(super.field6610, 10242, !arg1 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public final void method1031(int arg0) {
        if (arg0 > 98) {
            ++field5730;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lkd;II[BI)V")
    public class380(class188 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field5732 = arg2;
        super.field6619.method1289(-19391, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field6610, 0, super.field6616, this.field5732, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2757(true, -85);
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
    public static void method2385(int arg0) {
        field5737 = null;
        field5735 = null;
        field5734 = null;
        if (arg0 <= 29) {
            field5737 = null;
        }
        field5731 = null;
    }
}
