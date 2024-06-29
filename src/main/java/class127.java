import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class127 extends class50 {

    @OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
    private int field3243;

    @OriginalMember(owner = "client!sc", name = "db", descriptor = "Lve;")
    private static class147 field3244;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "()V")
    public static void method1076() {
        field3244 = null;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public final void method403(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3244.method1173(this.field3243, 18194, arg0);
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lw;I)V")
    public class127(class148 arg0, int arg1) {
        field3244 = arg0.method1179((byte) 19);
        this.field3243 = arg1;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()V")
    public final void method398() {
        field3244.method1174(this.field3243, super.field1319);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method412(Component arg0) throws Exception {
        field3244.method1172(class20.field568, arg0, class48.field1282, 22460);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()I")
    public final int method397() {
        return field3244.method1171(this.field3243, (byte) -120);
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "()V")
    public final void method406() {
        field3244.method1170(true, this.field3243);
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "()V")
    public final void method408() {
        field3244.method1175((byte) 111, this.field3243);
    }
}
