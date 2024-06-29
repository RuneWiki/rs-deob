import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class725 extends class221 {

    @OriginalMember(owner = "client!pea", name = "u", descriptor = "I")
    private int field10122;

    @OriginalMember(owner = "client!pea", name = "w", descriptor = "Lvea;")
    public static class276 field10124 = new class276(6, 0, 4, 2);

    @OriginalMember(owner = "client!pea", name = "A", descriptor = "I")
    public static int field10128 = 0;

    @OriginalMember(owner = "client!pea", name = "v", descriptor = "I")
    public static int field10123;

    @OriginalMember(owner = "client!pea", name = "x", descriptor = "I")
    public static int field10125;

    @OriginalMember(owner = "client!pea", name = "y", descriptor = "I")
    public static int field10126;

    @OriginalMember(owner = "client!pea", name = "B", descriptor = "I")
    public static int field10129;

    @OriginalMember(owner = "client!pea", name = "z", descriptor = "Lhba;")
    public static class10 field10127;

    @OriginalMember(owner = "client!pea", name = "t", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field10121;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
    public final void method832(byte arg0) {
        if (arg0 > -117) {
            field10121 = null;
        }
        ++field10125;
    }

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "(I)V")
    public static void method4068(int arg0) {
        field10127 = null;
        int var1 = -100 / ((arg0 - 72) / 39);
        field10121 = null;
        field10124 = null;
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(IZ)V")
    public final void method4069(int arg0, boolean arg1) {
        if (arg0 == 3552) {
            ++field10123;
            super.field2851.method3006(1, this);
            OpenGL.glTexParameteri(super.field2849, 10242, !arg1 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZII)Lni;")
    public static final class522 method4070(int arg0, boolean arg1, int arg2, int arg3) {
        ++field10126;
        class465 var4 = null;
        if (class395.field5609 != null) {
            var4 = new class465(arg3, class395.field5609, class698.field9830[arg3], 1000000);
        }
        class76.field932[arg3] = class489.field6696.method3248(72, class731.field10191, var4, arg3);
        if (arg0 >= -41) {
            method4070(-63, false, 100, 8);
        }
        class76.field932[arg3].method3732(107);
        return new class522(class76.field932[arg3], arg1, arg2);
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lac;II[BI)V")
    public class725(class541 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field10122 = arg2;
        super.field2851.method3006(1, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field2849, 0, super.field2860, this.field10122, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1258(-28003, true);
    }
}
