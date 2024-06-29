import jaggl.OpenGL;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class125 extends class185 {

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field1524 = 0;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "[I")
    public static int[] field1525 = new int[14];

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "J")
    public static long field1522 = 0L;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "Ljava/awt/Font;")
    public static Font field1528;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 8)
    public final void method298(byte arg0) {
        if (arg0 != -99) {
            method826((byte) 111);
        }
        ++field1527;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Ljaa;II[BI)V", line = 18)
    public class125(class576 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field1523 = arg2;
        super.field2172.method3194((byte) 75, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field2169, 0, super.field2180, this.field1523, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1101(10240, true);
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)V", line = 34)
    public static void method826(byte arg0) {
        field1528 = null;
        if (arg0 > -31) {
            method826((byte) 113);
        }
        field1525 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)V", line = 53)
    public final void method827(boolean arg0, int arg1) {
        if (arg1 > -54) {
            this.method827(false, -116);
        }
        ++field1526;
        super.field2172.method3194((byte) 75, this);
        OpenGL.glTexParameteri(super.field2169, 10242, !arg0 ? 33071 : 10497);
    }
}
