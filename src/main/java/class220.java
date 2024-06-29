import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class220 extends class260 {

    @OriginalMember(owner = "client!dga", name = "J", descriptor = "I")
    private int field2576;

    @OriginalMember(owner = "client!dga", name = "K", descriptor = "Lfaa;")
    private static class166 field2577;

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "(I)V", line = 3)
    public final void method1359(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2577.method1156(65536, this.field2576, arg0);
        }
    }

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "()V", line = 9)
    public static void method1360() {
        field2577 = null;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 14)
    public final void method1361(Component arg0) throws Exception {
        field2577.method1153(class270.field3189, arg0, -127, class478.field6632);
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "()I", line = 17)
    public final int method1362() {
        return field2577.method1158(-122, this.field2576);
    }

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "()V", line = 20)
    public final void method1363() {
        field2577.method1154(this.field2576, 0);
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "()V", line = 23)
    public final void method1364() {
        field2577.method1155(-98, this.field2576);
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Llc;I)V", line = 25)
    public class220(class675 arg0, int arg1) {
        field2577 = (class166) arg0.method3800(true);
        this.field2576 = arg1;
    }

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "()V", line = 30)
    public final void method1365() {
        field2577.method1157(this.field2576, super.field3083);
    }
}
