import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class58 extends class114 {

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    private int field1134;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "Lf;")
    private static class48 field1133;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "()V")
    public final void method496() {
        field1133.method417((byte) -96, this.field1134);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public final void method497(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1133.method422(arg0, this.field1134, 31016);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method498(Component arg0) throws Exception {
        field1133.method421(arg0, (byte) 72, class36.field697, class110.field2276);
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "()I")
    public final int method499() {
        return field1133.method418(124, this.field1134);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()V")
    public final void method500() {
        field1133.method420(this.field1134, (byte) 1);
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "()V")
    public final void method501() {
        field1133.method419(this.field1134, super.field2331);
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "()V")
    public static void method502() {
        field1133 = null;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lqf;I)V")
    public class58(class150 arg0, int arg1) {
        field1133 = arg0.method1054((byte) -115);
        this.field1134 = arg1;
    }
}
