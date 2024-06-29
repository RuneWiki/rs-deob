import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class89 {

    @OriginalMember(owner = "client!eha", name = "d", descriptor = "I")
    private int field1588;

    @OriginalMember(owner = "client!eha", name = "f", descriptor = "Lqe;")
    public static class465 field1590 = new class465(99, 8);

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!eha", name = "e", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V")
    public final void method832(int arg0) {
        if (arg0 != 99) {
            this.method836(-56, -107);
        }
        field1586++;
        OpenGL.glEndList();
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIIII)V")
    public static final void method833(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class114.field1830; var5++) {
            Rectangle var6 = class745.field10438[var5];
            if (arg1 < (var6.x + var6.width) && var6.x < arg1 + arg0 && arg3 < var6.y + var6.height && arg2 + arg3 > var6.y) {
                class329.field4646[var5] = true;
            }
        }
        if (arg4 <= 50) {
            field1590 = null;
        }
        field1585++;
        class6.method33(true, arg2 + arg3, arg3, arg1, arg0 + arg1);
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(BC)V")
    public final void method834(byte arg0, char arg1) {
        if (arg0 == 105) {
            field1589++;
            OpenGL.glCallList(this.field1588 + arg1);
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(B)V")
    public static void method835(byte arg0) {
        field1590 = null;
        if (arg0 > -74) {
            field1590 = null;
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(II)V")
    public final void method836(int arg0, int arg1) {
        field1587++;
        OpenGL.glNewList(this.field1588 + arg1, arg0);
    }

    @OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(Loea;I)V")
    public class89(class594 arg0, int arg1) {
        this.field1588 = OpenGL.glGenLists(arg1);
    }
}
