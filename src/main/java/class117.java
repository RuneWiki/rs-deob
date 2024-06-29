import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class117 extends class637 {

    @OriginalMember(owner = "client!eea", name = "F", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client!eea", name = "G", descriptor = "Luq;")
    private static class146 field1591;

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "()V")
    public final void method830() {
        field1591.method1018((byte) -79, this.field1590);
    }

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "()I")
    public final int method831() {
        return field1591.method1019(this.field1590, 65535);
    }

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "()V")
    public static void method832() {
        field1591 = null;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "()V")
    public final void method833() {
        field1591.method1016(this.field1590, 0);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method834(Component arg0) throws Exception {
        field1591.method1017(arg0, class506.field6945, 14204, class357.field4736);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "()V")
    public final void method835() {
        field1591.method1020(this.field1590, super.field8821);
    }

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "(I)V")
    public final void method836(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1591.method1015(this.field1590, false, arg0);
        }
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Llaa;I)V")
    public class117(class105 arg0, int arg1) {
        field1591 = (class146) arg0.method769(false);
        this.field1590 = arg1;
    }
}
