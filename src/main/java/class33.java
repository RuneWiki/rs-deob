import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class33 extends class22 {

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "Laba;")
    private static class123 field543;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "()V", line = 3)
    public static void method201() {
        field543 = null;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "()I", line = 6)
    public final int method148() {
        return field543.method722(this.field542, 0);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 9)
    public final void method149(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field543.method723(this.field542, arg0, 10196);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 15)
    public final void method150(Component arg0) throws Exception {
        field543.method721(class82.field1321, class550.field8108, arg0, -8001);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()V", line = 18)
    public final void method145() {
        field543.method724(this.field542, super.field412);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()V", line = 23)
    public final void method146() {
        field543.method720((byte) 127, this.field542);
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "()V", line = 26)
    public final void method147() {
        field543.method719(this.field542, 0);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lew;I)V", line = 28)
    public class33(class226 arg0, int arg1) {
        field543 = (class123) arg0.method1408((byte) 3);
        this.field542 = arg1;
    }
}
