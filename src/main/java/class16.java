import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 extends class72 {

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!ca", name = "V", descriptor = "Lpf;")
    private static class110 field400;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public final void method160(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field400.method872(arg0, -120, this.field399);
        }
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "()V")
    public static void method161() {
        field400 = null;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()V")
    public final void method162() {
        field400.method875(this.field399, super.field1610);
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "()V")
    public final void method163() {
        field400.method876(-18384, this.field399);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()V")
    public final void method164() {
        field400.method873(-18059, this.field399);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method165(Component arg0) throws Exception {
        field400.method871(arg0, class48.field1164, (byte) -77, class78.field1824);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Loc;I)V")
    public class16(class100 arg0, int arg1) {
        field400 = arg0.method821(true);
        this.field399 = arg1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()I")
    public final int method166() {
        return field400.method874(17242, this.field399);
    }
}
