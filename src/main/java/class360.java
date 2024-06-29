import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class360 extends class492 {

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    private int field5463;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field5461 = 0;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "Lrn;")
    public static class174 field5460 = new class174(5, 4);

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "Lpi;")
    public static class342 field5464 = new class342("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "[[B")
    public static byte[][] field5465;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V", line = 3)
    public static void method2266(int arg0) {
        field5465 = null;
        field5460 = null;
        field5464 = null;
        int var1 = -72 % ((29 - arg0) / 63);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 16)
    public final void method1055(byte arg0) {
        if (arg0 < -52) {
            ++field5459;
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lvj;II[BI)V", line = 26)
    public class360(class303 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field5463 = arg2;
        super.field7283.method1990(this, 11864);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field7272, 0, super.field7280, this.field5463, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2929((byte) -94, true);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZZ)V", line = 56)
    public final void method2267(boolean arg0, boolean arg1) {
        if (arg0) {
            super.field7283.method1990(this, 11864);
            ++field5462;
            OpenGL.glTexParameteri(super.field7272, 10242, arg1 ? 10497 : 33071);
        }
    }
}
