import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class516 {

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    private int field6580;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "Z")
    public static boolean field6577;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static final void method2854(int arg0) {
        if (class377.field4619 != null) {
            class646[] var1 = class377.field4619;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class646 var3 = var1[var2];
                var3.method479(21324);
            }
        }
        if (arg0 != 0) {
            method2854(-99);
        }
        field6579++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IC)V")
    public final void method2855(int arg0, char arg1) {
        if (arg0 == 4864) {
            field6576++;
            OpenGL.glCallList(this.field6580 + arg1);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public final void method2856(byte arg0) {
        OpenGL.glEndList();
        field6578++;
        if (arg0 >= -71) {
            this.method2855(54, (char) 65409);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)V")
    public final void method2857(int arg0, byte arg1) {
        field6575++;
        OpenGL.glNewList(this.field6580 + arg0, 4864);
        if (arg1 > -96) {
            this.field6580 = 3;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lck;I)V")
    public class516(class733 arg0, int arg1) {
        this.field6580 = OpenGL.glGenLists(arg1);
    }
}
